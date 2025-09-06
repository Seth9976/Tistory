package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.provider.q;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import r8.a;
import r8.c;

public class DataTransportCrashlyticsReportSender {
    public final c a;
    public static final CrashlyticsReportJsonTransform b;
    public static final String c;
    public static final String d;
    public static final a e;

    static {
        DataTransportCrashlyticsReportSender.b = new CrashlyticsReportJsonTransform();
        DataTransportCrashlyticsReportSender.c = "https://crashlyticsreports-pa.googleapis.com/v1/firelog/legacy/batchlog";
        DataTransportCrashlyticsReportSender.d = "AIzaSyBrpSYT4FFL09reHJi6H9FYdeiSnUTOv2M";
        DataTransportCrashlyticsReportSender.e = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public DataTransportCrashlyticsReportSender(c c0, a a0) {
        this.a = c0;
    }

    public static String a(String s, String s1) [...] // 潜在的解密器

    public static DataTransportCrashlyticsReportSender create(Context context0, SettingsProvider settingsProvider0, OnDemandCounter onDemandCounter0) {
        TransportRuntime.initialize(context0);
        TransportFactory transportFactory0 = TransportRuntime.getInstance().newFactory(new CCTDestination(DataTransportCrashlyticsReportSender.c, DataTransportCrashlyticsReportSender.d));
        Encoding encoding0 = Encoding.of("json");
        return new DataTransportCrashlyticsReportSender(new c(transportFactory0.getTransport("FIREBASE_CRASHLYTICS_REPORT", CrashlyticsReport.class, encoding0, DataTransportCrashlyticsReportSender.e), settingsProvider0.getSettingsSync(), onDemandCounter0), DataTransportCrashlyticsReportSender.e);
    }

    @NonNull
    public Task enqueueReport(@NonNull CrashlyticsReportWithSessionId crashlyticsReportWithSessionId0, boolean z) {
        TaskCompletionSource taskCompletionSource0;
        c c0 = this.a;
        synchronized(c0.e) {
            taskCompletionSource0 = new TaskCompletionSource();
            if(z) {
                c0.h.incrementRecordedOnDemandExceptions();
                if(c0.e.size() < c0.d) {
                    Logger.getLogger().d("Enqueueing report: " + crashlyticsReportWithSessionId0.getSessionId());
                    Logger.getLogger().d("Queue size: " + c0.e.size());
                    q q0 = new q(c0, crashlyticsReportWithSessionId0, 6, taskCompletionSource0);
                    c0.f.execute(q0);
                    Logger.getLogger().d("Closing task for report: " + crashlyticsReportWithSessionId0.getSessionId());
                    taskCompletionSource0.trySetResult(crashlyticsReportWithSessionId0);
                    return taskCompletionSource0.getTask();
                }
                c0.a();
                Logger.getLogger().d("Dropping report due to queue being full: " + crashlyticsReportWithSessionId0.getSessionId());
                c0.h.incrementDroppedOnDemandExceptions();
                taskCompletionSource0.trySetResult(crashlyticsReportWithSessionId0);
                return taskCompletionSource0.getTask();
            }
            c0.b(crashlyticsReportWithSessionId0, taskCompletionSource0);
        }
        return taskCompletionSource0.getTask();
    }
}

