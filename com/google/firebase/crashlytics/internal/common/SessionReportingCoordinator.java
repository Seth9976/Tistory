package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.android.j;
import androidx.core.app.h;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

public class SessionReportingCoordinator implements CrashlyticsLifecycleEvents {
    public final CrashlyticsReportDataCapture a;
    public final CrashlyticsReportPersistence b;
    public final DataTransportCrashlyticsReportSender c;
    public final LogFileManager d;
    public final UserMetadata e;

    public SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture0, CrashlyticsReportPersistence crashlyticsReportPersistence0, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender0, LogFileManager logFileManager0, UserMetadata userMetadata0) {
        this.a = crashlyticsReportDataCapture0;
        this.b = crashlyticsReportPersistence0;
        this.c = dataTransportCrashlyticsReportSender0;
        this.d = logFileManager0;
        this.e = userMetadata0;
    }

    public static Event a(Event crashlyticsReport$Session$Event0, LogFileManager logFileManager0, UserMetadata userMetadata0) {
        Builder crashlyticsReport$Session$Event$Builder0 = crashlyticsReport$Session$Event0.toBuilder();
        String s = logFileManager0.getLogString();
        if(s == null) {
            Logger.getLogger().v("No log data to include with this event.");
        }
        else {
            crashlyticsReport$Session$Event$Builder0.setLog(Log.builder().setContent(s).build());
        }
        ArrayList arrayList0 = SessionReportingCoordinator.b(userMetadata0.getCustomKeys());
        ArrayList arrayList1 = SessionReportingCoordinator.b(userMetadata0.getInternalKeys());
        if(!arrayList0.isEmpty() || !arrayList1.isEmpty()) {
            crashlyticsReport$Session$Event$Builder0.setApp(crashlyticsReport$Session$Event0.getApp().toBuilder().setCustomAttributes(ImmutableList.from(arrayList0)).setInternalKeys(ImmutableList.from(arrayList1)).build());
        }
        return crashlyticsReport$Session$Event$Builder0.build();
    }

    public static ArrayList b(Map map0) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.ensureCapacity(map0.size());
        for(Object object0: map0.entrySet()) {
            arrayList0.add(CustomAttribute.builder().setKey(((String)((Map.Entry)object0).getKey())).setValue(((String)((Map.Entry)object0).getValue())).build());
        }
        Collections.sort(arrayList0, new j(4));
        return arrayList0;
    }

    @RequiresApi(api = 19)
    @VisibleForTesting
    public static String convertInputStreamToString(InputStream inputStream0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byte[] arr_b = new byte[0x2000];
        int v;
        while((v = inputStream0.read(arr_b)) != -1) {
            byteArrayOutputStream0.write(arr_b, 0, v);
        }
        return byteArrayOutputStream0.toString("UTF-8");
    }

    public static SessionReportingCoordinator create(Context context0, IdManager idManager0, FileStore fileStore0, AppData appData0, LogFileManager logFileManager0, UserMetadata userMetadata0, StackTraceTrimmingStrategy stackTraceTrimmingStrategy0, SettingsProvider settingsProvider0, OnDemandCounter onDemandCounter0) {
        return new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context0, idManager0, appData0, stackTraceTrimmingStrategy0), new CrashlyticsReportPersistence(fileStore0, settingsProvider0), DataTransportCrashlyticsReportSender.create(context0, settingsProvider0, onDemandCounter0), logFileManager0, userMetadata0);
    }

    public void finalizeSessionWithNativeEvent(@NonNull String s, @NonNull List list0) {
        Logger.getLogger().d("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            File crashlyticsReport$FilesPayload$File0 = ((NativeSessionFile)object0).asFilePayload();
            if(crashlyticsReport$FilesPayload$File0 != null) {
                arrayList0.add(crashlyticsReport$FilesPayload$File0);
            }
        }
        FilesPayload crashlyticsReport$FilesPayload0 = FilesPayload.builder().setFiles(ImmutableList.from(arrayList0)).build();
        this.b.finalizeSessionWithNativeEvent(s, crashlyticsReport$FilesPayload0);
    }

    public void finalizeSessions(long v, @Nullable String s) {
        this.b.finalizeReports(s, v);
    }

    public boolean hasReportsToSend() {
        return this.b.hasFinalizedReports();
    }

    public SortedSet listSortedOpenSessionIds() {
        return this.b.getOpenSessionIds();
    }

    @Override  // com.google.firebase.crashlytics.internal.common.CrashlyticsLifecycleEvents
    public void onBeginSession(@NonNull String s, long v) {
        CrashlyticsReport crashlyticsReport0 = this.a.captureReportData(s, v);
        this.b.persistReport(crashlyticsReport0);
    }

    @Override  // com.google.firebase.crashlytics.internal.common.CrashlyticsLifecycleEvents
    public void onCustomKey(String s, String s1) {
        this.e.setCustomKey(s, s1);
    }

    @Override  // com.google.firebase.crashlytics.internal.common.CrashlyticsLifecycleEvents
    public void onLog(long v, String s) {
        this.d.writeToLog(v, s);
    }

    @Override  // com.google.firebase.crashlytics.internal.common.CrashlyticsLifecycleEvents
    public void onUserId(String s) {
        this.e.setUserId(s);
    }

    public void persistFatalEvent(@NonNull Throwable throwable0, @NonNull Thread thread0, @NonNull String s, long v) {
        Logger.getLogger().v("Persisting fatal event for session " + s);
        Event crashlyticsReport$Session$Event0 = SessionReportingCoordinator.a(this.a.captureEventData(throwable0, thread0, "crash", v, 4, 8, true), this.d, this.e);
        this.b.persistEvent(crashlyticsReport$Session$Event0, s, true);
    }

    public void persistNonFatalEvent(@NonNull Throwable throwable0, @NonNull Thread thread0, @NonNull String s, long v) {
        Logger.getLogger().v("Persisting non-fatal event for session " + s);
        Event crashlyticsReport$Session$Event0 = SessionReportingCoordinator.a(this.a.captureEventData(throwable0, thread0, "error", v, 4, 8, false), this.d, this.e);
        this.b.persistEvent(crashlyticsReport$Session$Event0, s, false);
    }

    @RequiresApi(api = 30)
    public void persistRelevantAppExitInfoEvent(String s, List list0, LogFileManager logFileManager0, UserMetadata userMetadata0) {
        ApplicationExitInfo applicationExitInfo0;
        String s1;
        CrashlyticsReportPersistence crashlyticsReportPersistence0 = this.b;
        long v = crashlyticsReportPersistence0.getStartTimestampMillis(s);
        Iterator iterator0 = list0.iterator();
        do {
            s1 = null;
            if(!iterator0.hasNext()) {
                goto label_10;
            }
            Object object0 = iterator0.next();
            applicationExitInfo0 = (ApplicationExitInfo)object0;
            if(applicationExitInfo0.getTimestamp() < v) {
                goto label_10;
            }
        }
        while(applicationExitInfo0.getReason() != 6);
        goto label_11;
    label_10:
        applicationExitInfo0 = null;
    label_11:
        if(applicationExitInfo0 == null) {
            Logger.getLogger().v("No relevant ApplicationExitInfo occurred during session: " + s);
            return;
        }
        try {
            InputStream inputStream0 = applicationExitInfo0.getTraceInputStream();
            if(inputStream0 != null) {
                s1 = SessionReportingCoordinator.convertInputStreamToString(inputStream0);
            }
        }
        catch(IOException iOException0) {
            Logger.getLogger().w("Could not get input trace in application exit info: " + applicationExitInfo0.toString() + " Error: " + iOException0);
        }
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo crashlyticsReport$ApplicationExitInfo0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo0.getImportance()).setProcessName(applicationExitInfo0.getProcessName()).setReasonCode(applicationExitInfo0.getReason()).setTimestamp(applicationExitInfo0.getTimestamp()).setPid(applicationExitInfo0.getPid()).setPss(applicationExitInfo0.getPss()).setRss(applicationExitInfo0.getRss()).setTraceFile(s1).build();
        Event crashlyticsReport$Session$Event0 = this.a.captureAnrEventData(crashlyticsReport$ApplicationExitInfo0);
        Logger.getLogger().d("Persisting anr for session " + s);
        crashlyticsReportPersistence0.persistEvent(SessionReportingCoordinator.a(crashlyticsReport$Session$Event0, logFileManager0, userMetadata0), s, true);
    }

    public void removeAllReports() {
        this.b.deleteAllReports();
    }

    public Task sendReports(@NonNull Executor executor0) {
        return this.sendReports(executor0, null);
    }

    public Task sendReports(@NonNull Executor executor0, @Nullable String s) {
        List list0 = this.b.loadFinalizedReports();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId0 = (CrashlyticsReportWithSessionId)object0;
            if(s == null || s.equals(crashlyticsReportWithSessionId0.getSessionId())) {
                arrayList0.add(this.c.enqueueReport(crashlyticsReportWithSessionId0, s != null).continueWith(executor0, new h(this, 6)));
            }
        }
        return Tasks.whenAll(arrayList0);
    }
}

