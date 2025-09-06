package com.google.firebase.crashlytics.internal.persistence;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.text.android.j;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.f;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class CrashlyticsReportPersistence {
    public final AtomicInteger a;
    public final FileStore b;
    public final SettingsProvider c;
    public static final Charset d;
    public static final int e;
    public static final CrashlyticsReportJsonTransform f;
    public static final j g;
    public static final f h;

    static {
        CrashlyticsReportPersistence.d = Charset.forName("UTF-8");
        CrashlyticsReportPersistence.e = 15;
        CrashlyticsReportPersistence.f = new CrashlyticsReportJsonTransform();
        CrashlyticsReportPersistence.g = new j(6);
        CrashlyticsReportPersistence.h = new f(1);
    }

    public CrashlyticsReportPersistence(FileStore fileStore0, SettingsProvider settingsProvider0) {
        this.a = new AtomicInteger(0);
        this.b = fileStore0;
        this.c = settingsProvider0;
    }

    public static void a(List list0) {
        for(Object object0: list0) {
            ((File)object0).delete();
        }
    }

    public final ArrayList b() {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.addAll(this.b.getPriorityReports());
        arrayList0.addAll(this.b.getNativeReports());
        Collections.sort(arrayList0, CrashlyticsReportPersistence.g);
        List list0 = this.b.getReports();
        Collections.sort(list0, CrashlyticsReportPersistence.g);
        arrayList0.addAll(list0);
        return arrayList0;
    }

    public static String c(File file0) {
        byte[] arr_b = new byte[0x2000];
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try(FileInputStream fileInputStream0 = new FileInputStream(file0)) {
            int v;
            while((v = fileInputStream0.read(arr_b)) > 0) {
                byteArrayOutputStream0.write(arr_b, 0, v);
            }
            return new String(byteArrayOutputStream0.toByteArray(), CrashlyticsReportPersistence.d);
        }
    }

    public static void d(File file0, String s) {
        try(OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(new FileOutputStream(file0), CrashlyticsReportPersistence.d)) {
            outputStreamWriter0.write(s);
        }
    }

    public void deleteAllReports() {
        CrashlyticsReportPersistence.a(this.b.getReports());
        CrashlyticsReportPersistence.a(this.b.getPriorityReports());
        CrashlyticsReportPersistence.a(this.b.getNativeReports());
    }

    public void finalizeReports(@Nullable String s, long v) {
        File file0;
        CrashlyticsReportJsonTransform crashlyticsReportJsonTransform0;
        boolean z;
        FileStore fileStore0 = this.b;
        fileStore0.cleanupPreviousFileSystems();
        SortedSet sortedSet0 = this.getOpenSessionIds();
        if(s != null) {
            sortedSet0.remove(s);
        }
        if(sortedSet0.size() > 8) {
            while(sortedSet0.size() > 8) {
                String s1 = (String)sortedSet0.last();
                Logger.getLogger().d("Removing session over cap: " + s1);
                fileStore0.deleteSessionFiles(s1);
                sortedSet0.remove(s1);
            }
        }
        for(Object object0: sortedSet0) {
            String s2 = (String)object0;
            Logger.getLogger().v("Finalizing report for session " + s2);
            List list0 = fileStore0.getSessionFiles(s2, CrashlyticsReportPersistence.h);
            if(list0.isEmpty()) {
                Logger.getLogger().v("Session " + s2 + " has no events.");
            }
            else {
                Collections.sort(list0);
                ArrayList arrayList0 = new ArrayList();
                Iterator iterator1 = list0.iterator();
            alab1:
                while(true) {
                    while(true) {
                        z = false;
                    label_25:
                        boolean z1 = iterator1.hasNext();
                        crashlyticsReportJsonTransform0 = CrashlyticsReportPersistence.f;
                        if(!z1) {
                            break alab1;
                        }
                        Object object1 = iterator1.next();
                        file0 = (File)object1;
                        try {
                            arrayList0.add(crashlyticsReportJsonTransform0.eventFromJson(CrashlyticsReportPersistence.c(file0)));
                            if(z) {
                                z = true;
                                goto label_25;
                            }
                            String s3 = file0.getName();
                            if(!s3.startsWith("event")) {
                                continue;
                            }
                            goto label_38;
                        }
                        catch(IOException iOException0) {
                        }
                        break;
                    }
                    Logger.getLogger().w("Could not add event to report for " + file0, iOException0);
                    goto label_25;
                label_38:
                    if(s3.endsWith("_")) {
                        z = true;
                        goto label_25;
                    }
                }
                if(arrayList0.isEmpty()) {
                    Logger.getLogger().w("Could not parse event files for session " + s2);
                }
                else {
                    String s4 = UserMetadata.readUserId(s2, fileStore0);
                    File file1 = fileStore0.getSessionFile(s2, "report");
                    try {
                        CrashlyticsReport crashlyticsReport0 = crashlyticsReportJsonTransform0.reportFromJson(CrashlyticsReportPersistence.c(file1)).withSessionEndFields(v, z, s4).withEvents(ImmutableList.from(arrayList0));
                        Session crashlyticsReport$Session0 = crashlyticsReport0.getSession();
                        if(crashlyticsReport$Session0 != null) {
                            CrashlyticsReportPersistence.d((z ? fileStore0.getPriorityReport(crashlyticsReport$Session0.getIdentifier()) : fileStore0.getReport(crashlyticsReport$Session0.getIdentifier())), crashlyticsReportJsonTransform0.reportToJson(crashlyticsReport0));
                        }
                        goto label_55;
                    }
                    catch(IOException iOException1) {
                    }
                    Logger.getLogger().w("Could not synthesize final report file for " + file1, iOException1);
                }
            }
        label_55:
            fileStore0.deleteSessionFiles(s2);
        }
        int v1 = this.c.getSettingsSync().sessionData.maxCompleteSessionsCount;
        ArrayList arrayList1 = this.b();
        int v2 = arrayList1.size();
        if(v2 > v1) {
            for(Object object2: arrayList1.subList(v1, v2)) {
                ((File)object2).delete();
            }
        }
    }

    public void finalizeSessionWithNativeEvent(String s, FilesPayload crashlyticsReport$FilesPayload0) {
        File file0 = this.b.getSessionFile(s, "report");
        Logger.getLogger().d("Writing native session report for " + s + " to file: " + file0);
        try {
            String s1 = CrashlyticsReportPersistence.c(file0);
            CrashlyticsReport crashlyticsReport0 = CrashlyticsReportPersistence.f.reportFromJson(s1).withNdkPayload(crashlyticsReport$FilesPayload0);
            CrashlyticsReportPersistence.d(this.b.getNativeReport(s), CrashlyticsReportPersistence.f.reportToJson(crashlyticsReport0));
        }
        catch(IOException iOException0) {
            Logger.getLogger().w("Could not synthesize final native report file for " + file0, iOException0);
        }
    }

    public SortedSet getOpenSessionIds() {
        return new TreeSet(this.b.getAllOpenSessionIds()).descendingSet();
    }

    public long getStartTimestampMillis(String s) {
        return this.b.getSessionFile(s, "start-time").lastModified();
    }

    // 去混淆评级： 低(30)
    public boolean hasFinalizedReports() {
        return !this.b.getReports().isEmpty() || !this.b.getPriorityReports().isEmpty() || !this.b.getNativeReports().isEmpty();
    }

    @NonNull
    public List loadFinalizedReports() {
        ArrayList arrayList0 = this.b();
        List list0 = new ArrayList();
        for(Object object0: arrayList0) {
            File file0 = (File)object0;
            try {
                String s = CrashlyticsReportPersistence.c(file0);
                ((ArrayList)list0).add(CrashlyticsReportWithSessionId.create(CrashlyticsReportPersistence.f.reportFromJson(s), file0.getName(), file0));
            }
            catch(IOException iOException0) {
                Logger.getLogger().w("Could not load report file " + file0 + "; deleting", iOException0);
                file0.delete();
            }
        }
        return list0;
    }

    public void persistEvent(@NonNull Event crashlyticsReport$Session$Event0, @NonNull String s) {
        this.persistEvent(crashlyticsReport$Session$Event0, s, false);
    }

    public void persistEvent(@NonNull Event crashlyticsReport$Session$Event0, @NonNull String s, boolean z) {
        FileStore fileStore0 = this.b;
        int v = this.c.getSettingsSync().sessionData.maxCustomExceptionEvents;
        String s1 = CrashlyticsReportPersistence.f.eventToJson(crashlyticsReport$Session$Event0);
        Object[] arr_object = {this.a.getAndIncrement()};
        try {
            CrashlyticsReportPersistence.d(fileStore0.getSessionFile(s, "event" + String.format(Locale.US, "%010d", arr_object) + (z ? "_" : "")), s1);
        }
        catch(IOException iOException0) {
            Logger.getLogger().w("Could not persist event for session " + s, iOException0);
        }
        List list0 = fileStore0.getSessionFiles(s, new f(2));
        Collections.sort(list0, new j(7));
        int v1 = list0.size();
        for(Object object0: list0) {
            if(v1 <= v) {
                break;
            }
            FileStore.c(((File)object0));
            --v1;
        }
    }

    public void persistReport(@NonNull CrashlyticsReport crashlyticsReport0) {
        FileStore fileStore0 = this.b;
        Session crashlyticsReport$Session0 = crashlyticsReport0.getSession();
        if(crashlyticsReport$Session0 == null) {
            Logger.getLogger().d("Could not get session for report");
            return;
        }
        String s = crashlyticsReport$Session0.getIdentifier();
        try {
            String s1 = CrashlyticsReportPersistence.f.reportToJson(crashlyticsReport0);
            CrashlyticsReportPersistence.d(fileStore0.getSessionFile(s, "report"), s1);
            File file0 = fileStore0.getSessionFile(s, "start-time");
            long v = crashlyticsReport$Session0.getStartedAt();
            try(OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(new FileOutputStream(file0), CrashlyticsReportPersistence.d)) {
                outputStreamWriter0.write("");
                file0.setLastModified(v * 1000L);
            }
        }
        catch(IOException iOException0) {
            Logger.getLogger().d("Could not persist report for session " + s, iOException0);
        }
    }
}

