package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class CrashlyticsReportDataCapture {
    public final Context a;
    public final IdManager b;
    public final AppData c;
    public final StackTraceTrimmingStrategy d;
    public static final HashMap e;
    public static final String f;

    static {
        HashMap hashMap0 = new HashMap();
        CrashlyticsReportDataCapture.e = hashMap0;
        hashMap0.put("armeabi", 5);
        hashMap0.put("armeabi-v7a", 6);
        hashMap0.put("arm64-v8a", 9);
        hashMap0.put("x86", 0);
        hashMap0.put("x86_64", 1);
        CrashlyticsReportDataCapture.f = "Crashlytics Android SDK/18.3.2";
    }

    public CrashlyticsReportDataCapture(Context context0, IdManager idManager0, AppData appData0, StackTraceTrimmingStrategy stackTraceTrimmingStrategy0) {
        this.a = context0;
        this.b = idManager0;
        this.c = appData0;
        this.d = stackTraceTrimmingStrategy0;
    }

    public final ImmutableList a() {
        return ImmutableList.from(new BinaryImage[]{BinaryImage.builder().setBaseAddress(0L).setSize(0L).setName(this.c.packageName).setUuid(this.c.buildId).build()});
    }

    public final Device b(int v) {
        Float float0;
        Double double0;
        int v1;
        Context context0;
        try {
            context0 = this.a;
            v1 = 1;
            double0 = null;
            boolean z = false;
            Intent intent0 = context0.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if(intent0 == null) {
                goto label_20;
            }
            else {
                switch(intent0.getIntExtra("status", -1)) {
                    case 2: 
                    case 5: {
                        z = true;
                    }
                }
                int v2 = intent0.getIntExtra("level", -1);
                int v3 = intent0.getIntExtra("scale", -1);
                float0 = v2 == -1 || v3 == -1 ? null : ((float)(((float)v2) / ((float)v3)));
            }
        }
        catch(IllegalStateException illegalStateException0) {
            Logger.getLogger().e("An error occurred getting battery state.", illegalStateException0);
            float0 = null;
        }
        goto label_21;
    label_20:
        float0 = null;
    label_21:
        if(float0 != null) {
            double0 = float0.doubleValue();
        }
        if(z && float0 != null) {
            v1 = ((double)(((float)float0))) < 0.99 ? 2 : 3;
        }
        boolean z1 = CommonUtils.getProximitySensorEnabled(context0);
        long v4 = CommonUtils.getTotalRamInBytes();
        long v5 = CommonUtils.calculateFreeRamInBytes(context0);
        long v6 = CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath());
        return Device.builder().setBatteryLevel(double0).setBatteryVelocity(v1).setProximityOn(z1).setOrientation(v).setRamUsed(v4 - v5).setDiskUsed(v6).build();
    }

    public static Exception c(TrimmedThrowableData trimmedThrowableData0, int v, int v1, int v2) {
        String s = trimmedThrowableData0.className;
        String s1 = trimmedThrowableData0.localizedMessage;
        StackTraceElement[] arr_stackTraceElement = trimmedThrowableData0.stacktrace;
        int v3 = 0;
        if(arr_stackTraceElement == null) {
            arr_stackTraceElement = new StackTraceElement[0];
        }
        TrimmedThrowableData trimmedThrowableData1 = trimmedThrowableData0.cause;
        if(v2 >= v1) {
            TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData1;
            while(trimmedThrowableData2 != null) {
                trimmedThrowableData2 = trimmedThrowableData2.cause;
                ++v3;
            }
        }
        Builder crashlyticsReport$Session$Event$Application$Execution$Exception$Builder0 = Exception.builder().setType(s).setReason(s1).setFrames(ImmutableList.from(CrashlyticsReportDataCapture.d(arr_stackTraceElement, v))).setOverflowCount(v3);
        if(trimmedThrowableData1 != null && v3 == 0) {
            crashlyticsReport$Session$Event$Application$Execution$Exception$Builder0.setCausedBy(CrashlyticsReportDataCapture.c(trimmedThrowableData1, v, v1, v2 + 1));
        }
        return crashlyticsReport$Session$Event$Application$Execution$Exception$Builder0.build();
    }

    public Event captureAnrEventData(ApplicationExitInfo crashlyticsReport$ApplicationExitInfo0) {
        int v = this.a.getResources().getConfiguration().orientation;
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder crashlyticsReport$Session$Event$Builder0 = Event.builder().setType("anr").setTimestamp(crashlyticsReport$ApplicationExitInfo0.getTimestamp());
        return crashlyticsReport$ApplicationExitInfo0.getImportance() == 100 ? crashlyticsReport$Session$Event$Builder0.setApp(Application.builder().setBackground(Boolean.FALSE).setUiOrientation(v).setExecution(Execution.builder().setAppExitInfo(crashlyticsReport$ApplicationExitInfo0).setSignal(Signal.builder().setName("0").setCode("0").setAddress(0L).build()).setBinaries(this.a()).build()).build()).setDevice(this.b(v)).build() : crashlyticsReport$Session$Event$Builder0.setApp(Application.builder().setBackground(Boolean.TRUE).setUiOrientation(v).setExecution(Execution.builder().setAppExitInfo(crashlyticsReport$ApplicationExitInfo0).setSignal(Signal.builder().setName("0").setCode("0").setAddress(0L).build()).setBinaries(this.a()).build()).build()).setDevice(this.b(v)).build();
    }

    public Event captureEventData(Throwable throwable0, Thread thread0, String s, long v, int v1, int v2, boolean z) {
        int v3 = this.a.getResources().getConfiguration().orientation;
        StackTraceTrimmingStrategy stackTraceTrimmingStrategy0 = this.d;
        TrimmedThrowableData trimmedThrowableData0 = new TrimmedThrowableData(throwable0, stackTraceTrimmingStrategy0);
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder crashlyticsReport$Session$Event$Builder0 = Event.builder().setType(s).setTimestamp(v);
        ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = CommonUtils.getAppProcessInfo(this.c.packageName, this.a);
        Boolean boolean0 = activityManager$RunningAppProcessInfo0 == null ? null : Boolean.valueOf(activityManager$RunningAppProcessInfo0.importance != 100);
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder crashlyticsReport$Session$Event$Application$Builder0 = Application.builder().setBackground(boolean0).setUiOrientation(v3);
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder crashlyticsReport$Session$Event$Application$Execution$Builder0 = Execution.builder();
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.builder().setName(thread0.getName()).setImportance(v1).setFrames(ImmutableList.from(CrashlyticsReportDataCapture.d(trimmedThrowableData0.stacktrace, v1))).build());
        if(z) {
            for(Object object0: Thread.getAllStackTraces().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                Thread thread1 = (Thread)map$Entry0.getKey();
                if(!thread1.equals(thread0)) {
                    StackTraceElement[] arr_stackTraceElement = stackTraceTrimmingStrategy0.getTrimmedStackTrace(((StackTraceElement[])map$Entry0.getValue()));
                    arrayList0.add(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.builder().setName(thread1.getName()).setImportance(0).setFrames(ImmutableList.from(CrashlyticsReportDataCapture.d(arr_stackTraceElement, 0))).build());
                }
            }
        }
        return crashlyticsReport$Session$Event$Builder0.setApp(crashlyticsReport$Session$Event$Application$Builder0.setExecution(crashlyticsReport$Session$Event$Application$Execution$Builder0.setThreads(ImmutableList.from(arrayList0)).setException(CrashlyticsReportDataCapture.c(trimmedThrowableData0, v1, v2, 0)).setSignal(Signal.builder().setName("0").setCode("0").setAddress(0L).build()).setBinaries(this.a()).build()).build()).setDevice(this.b(v3)).build();
    }

    public CrashlyticsReport captureReportData(String s, long v) {
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder crashlyticsReport$Builder0 = CrashlyticsReport.builder().setSdkVersion("18.3.2").setGmpAppId(this.c.googleAppId).setInstallationUuid(this.b.getCrashlyticsInstallId()).setBuildVersion(this.c.versionCode).setDisplayVersion(this.c.versionName).setPlatform(4);
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder crashlyticsReport$Session$Builder0 = Session.builder().setStartedAt(v).setIdentifier(s).setGenerator("Crashlytics Android SDK/18.3.2").setApp(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.builder().setIdentifier(this.b.getAppIdentifier()).setVersion(this.c.versionCode).setDisplayVersion(this.c.versionName).setInstallationUuid(this.b.getCrashlyticsInstallId()).setDevelopmentPlatform(this.c.developmentPlatformProvider.getDevelopmentPlatform()).setDevelopmentPlatformVersion(this.c.developmentPlatformProvider.getDevelopmentPlatformVersion()).build()).setOs(OperatingSystem.builder().setPlatform(3).setVersion(Build.VERSION.RELEASE).setBuildVersion(Build.VERSION.CODENAME).setJailbroken(CommonUtils.isRooted()).build());
        StatFs statFs0 = new StatFs(Environment.getDataDirectory().getPath());
        int v1 = 7;
        if(!TextUtils.isEmpty("arm64-v8a")) {
            Integer integer0 = (Integer)CrashlyticsReportDataCapture.e.get("arm64-v8a");
            if(integer0 != null) {
                v1 = (int)integer0;
            }
        }
        long v2 = CommonUtils.getTotalRamInBytes();
        long v3 = ((long)statFs0.getBlockCount()) * ((long)statFs0.getBlockSize());
        boolean z = CommonUtils.isEmulator();
        int v4 = CommonUtils.getDeviceState();
        String s1 = Build.MANUFACTURER;
        String s2 = Build.PRODUCT;
        return crashlyticsReport$Builder0.setSession(crashlyticsReport$Session$Builder0.setDevice(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.builder().setArch(v1).setModel(Build.MODEL).setCores(Runtime.getRuntime().availableProcessors()).setRam(v2).setDiskSpace(v3).setSimulator(z).setState(v4).setManufacturer(s1).setModelClass(s2).build()).setGeneratorType(3).build()).build();
    }

    public static ImmutableList d(StackTraceElement[] arr_stackTraceElement, int v) {
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < arr_stackTraceElement.length; ++v1) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v1];
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder0 = Frame.builder().setImportance(v);
            long v2 = 0L;
            long v3 = stackTraceElement0.isNativeMethod() ? Math.max(stackTraceElement0.getLineNumber(), 0L) : 0L;
            String s = stackTraceElement0.getClassName() + "." + stackTraceElement0.getMethodName();
            String s1 = stackTraceElement0.getFileName();
            if(!stackTraceElement0.isNativeMethod() && stackTraceElement0.getLineNumber() > 0) {
                v2 = (long)stackTraceElement0.getLineNumber();
            }
            arrayList0.add(crashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder0.setPc(v3).setSymbol(s).setFile(s1).setOffset(v2).build());
        }
        return ImmutableList.from(arrayList0);
    }
}

