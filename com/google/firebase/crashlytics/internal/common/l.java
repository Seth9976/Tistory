package com.google.firebase.crashlytics.internal.common;

import a7.b;
import a7.c;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import androidx.core.view.c2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.StaticSessionData.DeviceData;
import com.google.firebase.crashlytics.internal.model.StaticSessionData.OsData;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class l {
    public final Context a;
    public final DataCollectionArbiter b;
    public final b c;
    public final UserMetadata d;
    public final CrashlyticsBackgroundWorker e;
    public final IdManager f;
    public final FileStore g;
    public final AppData h;
    public final LogFileManager i;
    public final CrashlyticsNativeComponent j;
    public final AnalyticsEventLogger k;
    public final SessionReportingCoordinator l;
    public o m;
    public SettingsProvider n;
    public final TaskCompletionSource o;
    public final TaskCompletionSource p;
    public final TaskCompletionSource q;
    public final AtomicBoolean r;
    public static final f s;

    static {
        l.s = new f(0);
    }

    public l(Context context0, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker0, IdManager idManager0, DataCollectionArbiter dataCollectionArbiter0, FileStore fileStore0, b b0, AppData appData0, UserMetadata userMetadata0, LogFileManager logFileManager0, SessionReportingCoordinator sessionReportingCoordinator0, CrashlyticsNativeComponent crashlyticsNativeComponent0, AnalyticsEventLogger analyticsEventLogger0) {
        this.n = null;
        this.o = new TaskCompletionSource();
        this.p = new TaskCompletionSource();
        this.q = new TaskCompletionSource();
        this.r = new AtomicBoolean(false);
        this.a = context0;
        this.e = crashlyticsBackgroundWorker0;
        this.f = idManager0;
        this.b = dataCollectionArbiter0;
        this.g = fileStore0;
        this.c = b0;
        this.h = appData0;
        this.d = userMetadata0;
        this.i = logFileManager0;
        this.j = crashlyticsNativeComponent0;
        this.k = analyticsEventLogger0;
        this.l = sessionReportingCoordinator0;
    }

    public static void a(l l0, String s) {
        l0.getClass();
        long v = System.currentTimeMillis();
        Logger.getLogger().d("Opening a new session with ID " + s);
        String s1 = l0.f.getCrashlyticsInstallId();
        int v1 = DeliveryMechanism.determineFrom(l0.h.installerPackageName).getId();
        com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData staticSessionData$AppData0 = com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData.create(l0.f.getAppIdentifier(), l0.h.versionCode, l0.h.versionName, s1, v1, l0.h.developmentPlatformProvider);
        OsData staticSessionData$OsData0 = OsData.create(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.isRooted());
        StatFs statFs0 = new StatFs(Environment.getDataDirectory().getPath());
        long v2 = ((long)statFs0.getBlockCount()) * ((long)statFs0.getBlockSize());
        StaticSessionData staticSessionData0 = StaticSessionData.create(staticSessionData$AppData0, staticSessionData$OsData0, DeviceData.create(CommonUtils.getCpuArchitectureInt(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.getTotalRamInBytes(), v2, CommonUtils.isEmulator(), CommonUtils.getDeviceState(), Build.MANUFACTURER, Build.PRODUCT));
        l0.j.prepareNativeSession(s, "Crashlytics Android SDK/18.3.2", v / 1000L, staticSessionData0);
        l0.i.setCurrentSession(s);
        l0.l.onBeginSession(s, v / 1000L);
    }

    public static Task b(l l0) {
        Task task0;
        l0.getClass();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: l0.g.getCommonFiles(l.s)) {
            File file0 = (File)object0;
            try {
                long v = Long.parseLong(file0.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                }
                catch(ClassNotFoundException unused_ex) {
                    Logger.getLogger().d("Logging app exception event to Firebase Analytics");
                    task0 = Tasks.call(new ScheduledThreadPoolExecutor(1), new k(l0, v));
                    goto label_14;
                }
                Logger.getLogger().w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                task0 = Tasks.forResult(null);
            label_14:
                arrayList0.add(task0);
            }
            catch(NumberFormatException unused_ex) {
                Logger.getLogger().w("Could not parse app exception timestamp from file " + file0.getName());
            }
            file0.delete();
        }
        return Tasks.whenAll(arrayList0);
    }

    public final void c(boolean z, SettingsProvider settingsProvider0) {
        InputStream inputStream0;
        SessionReportingCoordinator sessionReportingCoordinator0 = this.l;
        ArrayList arrayList0 = new ArrayList(sessionReportingCoordinator0.listSortedOpenSessionIds());
        if(arrayList0.size() <= z) {
            Logger.getLogger().v("No open sessions to be closed.");
            return;
        }
        String s = (String)arrayList0.get(((int)z));
        Settings settings0 = settingsProvider0.getSettingsSync();
        FileStore fileStore0 = this.g;
        if(settings0.featureFlagData.collectAnrs) {
            int v = Build.VERSION.SDK_INT;
            if(v >= 30) {
                List list0 = c2.m(((ActivityManager)this.a.getSystemService("activity")));
                if(list0.size() == 0) {
                    Logger.getLogger().v("No ApplicationExitInfo available. Session: " + s);
                }
                else {
                    sessionReportingCoordinator0.persistRelevantAppExitInfoEvent(s, list0, new LogFileManager(fileStore0, s), UserMetadata.loadFromExistingSession(s, fileStore0, this.e));
                }
            }
            else {
                Logger.getLogger().v("ANR feature enabled, but device is API " + v);
            }
        }
        else {
            Logger.getLogger().v("ANR feature disabled.");
        }
        CrashlyticsNativeComponent crashlyticsNativeComponent0 = this.j;
        if(crashlyticsNativeComponent0.hasCrashDataForSession(s)) {
            Logger.getLogger().v("Finalizing native report for session " + s);
            NativeSessionFileProvider nativeSessionFileProvider0 = crashlyticsNativeComponent0.getSessionFileProvider(s);
            File file0 = nativeSessionFileProvider0.getMinidumpFile();
            if(file0 == null || !file0.exists()) {
                Logger.getLogger().w("No minidump data found for session " + s);
            }
            else {
                long v1 = file0.lastModified();
                LogFileManager logFileManager0 = new LogFileManager(fileStore0, s);
                File file1 = fileStore0.getNativeSessionDir(s);
                if(file1.isDirectory()) {
                    this.d(v1);
                    byte[] arr_b = logFileManager0.getBytesForLog();
                    File file2 = fileStore0.getSessionFile(s, "user-data");
                    File file3 = fileStore0.getSessionFile(s, "keys");
                    ArrayList arrayList1 = new ArrayList();
                    arrayList1.add(new com.google.firebase.crashlytics.internal.common.b(arr_b));
                    arrayList1.add(new s("crash_meta_file", "metadata", nativeSessionFileProvider0.getMetadataFile()));
                    arrayList1.add(new s("session_meta_file", "session", nativeSessionFileProvider0.getSessionFile()));
                    arrayList1.add(new s("app_meta_file", "app", nativeSessionFileProvider0.getAppFile()));
                    arrayList1.add(new s("device_meta_file", "device", nativeSessionFileProvider0.getDeviceFile()));
                    arrayList1.add(new s("os_meta_file", "os", nativeSessionFileProvider0.getOsFile()));
                    arrayList1.add(new s("minidump_file", "minidump", nativeSessionFileProvider0.getMinidumpFile()));
                    arrayList1.add(new s("user_meta_file", "user", file2));
                    arrayList1.add(new s("keys_file", "keys", file3));
                    for(Object object0: arrayList1) {
                        NativeSessionFile nativeSessionFile0 = (NativeSessionFile)object0;
                        try {
                            inputStream0 = null;
                            inputStream0 = nativeSessionFile0.getStream();
                            if(inputStream0 != null) {
                                g.b.q(new File(file1, nativeSessionFile0.getReportsEndpointFilename()), inputStream0);
                            }
                        }
                        catch(IOException unused_ex) {
                        }
                        finally {
                            CommonUtils.closeQuietly(inputStream0);
                        }
                    }
                    Logger.getLogger().d("CrashlyticsController#finalizePreviousNativeSession");
                    sessionReportingCoordinator0.finalizeSessionWithNativeEvent(s, arrayList1);
                    logFileManager0.clearLog();
                }
                else {
                    Logger.getLogger().w("Couldn\'t create directory to store native session files, aborting.");
                }
            }
        }
        sessionReportingCoordinator0.finalizeSessions(System.currentTimeMillis() / 1000L, (z ? ((String)arrayList0.get(0)) : null));
    }

    public final void d(long v) {
        try {
            if(!this.g.getCommonFile(".ae" + v).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        }
        catch(IOException iOException0) {
            Logger.getLogger().w("Could not create app exception marker file.", iOException0);
        }
    }

    public final boolean e(SettingsProvider settingsProvider0) {
        this.e.checkRunningOnThread();
        if(this.m != null && this.m.e.get()) {
            Logger.getLogger().w("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        Logger.getLogger().v("Finalizing previously open sessions.");
        try {
            this.c(true, settingsProvider0);
        }
        catch(Exception exception0) {
            Logger.getLogger().e("Unable to finalize previously open sessions.", exception0);
            return false;
        }
        Logger.getLogger().v("Closed all previously open sessions.");
        return true;
    }

    public final String f() {
        SortedSet sortedSet0 = this.l.listSortedOpenSessionIds();
        return sortedSet0.isEmpty() ? null : ((String)sortedSet0.first());
    }

    public final void g(SettingsProvider settingsProvider0, Thread thread0, Throwable throwable0, boolean z) {
        synchronized(this) {
            Logger.getLogger().d("Handling uncaught exception \"" + throwable0 + "\" from thread " + thread0.getName());
            h h0 = new h(this, System.currentTimeMillis(), throwable0, thread0, settingsProvider0, z);
            Task task0 = this.e.submitTask(h0);
            try {
                Utils.awaitEvenIfOnMainThread(task0);
            }
            catch(TimeoutException unused_ex) {
                Logger.getLogger().e("Cannot send reports. Timed out while fetching settings.");
            }
            catch(Exception exception0) {
                Logger.getLogger().e("Error handling uncaught exception", exception0);
            }
        }
    }

    public final void h(String s, String s1) {
        try {
            this.d.setInternalKey(s, s1);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            if(this.a != null && CommonUtils.isAppDebuggable(this.a)) {
                throw illegalArgumentException0;
            }
            Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public final Task i(Task task0) {
        boolean z = this.l.hasReportsToSend();
        TaskCompletionSource taskCompletionSource0 = this.o;
        if(!z) {
            Logger.getLogger().v("No crash reports are available to be sent.");
            taskCompletionSource0.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        Logger.getLogger().v("Crash reports are available to be sent.");
        DataCollectionArbiter dataCollectionArbiter0 = this.b;
        if(dataCollectionArbiter0.isAutomaticDataCollectionEnabled()) {
            Logger.getLogger().d("Automatic data collection is enabled. Allowing upload.");
            taskCompletionSource0.trySetResult(Boolean.FALSE);
            return Tasks.forResult(Boolean.TRUE).onSuccessTask(new b(this, task0, false, 12));
        }
        Logger.getLogger().d("Automatic data collection is disabled.");
        Logger.getLogger().v("Notifying that unsent reports are available.");
        taskCompletionSource0.trySetResult(Boolean.TRUE);
        Task task1 = dataCollectionArbiter0.waitForAutomaticDataCollectionEnabled().onSuccessTask(new c(12));
        Logger.getLogger().d("Waiting for send/deleteUnsentReports to be called.");
        return Utils.race(task1, this.p.getTask()).onSuccessTask(new b(this, task0, false, 12));
    }
}

