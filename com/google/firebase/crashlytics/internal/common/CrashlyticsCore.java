package com.google.firebase.crashlytics.internal.common;

import a7.b;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.o;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.RemoveRepeatsStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CrashlyticsCore {
    public final Context a;
    public final DataCollectionArbiter b;
    @VisibleForTesting
    public final BreadcrumbSource breadcrumbSource;
    public final OnDemandCounter c;
    public final long d;
    public b e;
    public b f;
    public boolean g;
    public l h;
    public final IdManager i;
    public final FileStore j;
    public final AnalyticsEventLogger k;
    public final ExecutorService l;
    public final CrashlyticsBackgroundWorker m;
    public final CrashlyticsNativeComponent n;

    public CrashlyticsCore(FirebaseApp firebaseApp0, IdManager idManager0, CrashlyticsNativeComponent crashlyticsNativeComponent0, DataCollectionArbiter dataCollectionArbiter0, BreadcrumbSource breadcrumbSource0, AnalyticsEventLogger analyticsEventLogger0, FileStore fileStore0, ExecutorService executorService0) {
        this.b = dataCollectionArbiter0;
        this.a = firebaseApp0.getApplicationContext();
        this.i = idManager0;
        this.n = crashlyticsNativeComponent0;
        this.breadcrumbSource = breadcrumbSource0;
        this.k = analyticsEventLogger0;
        this.l = executorService0;
        this.j = fileStore0;
        this.m = new CrashlyticsBackgroundWorker(executorService0);
        this.d = System.currentTimeMillis();
        this.c = new OnDemandCounter();
    }

    public static Task a(CrashlyticsCore crashlyticsCore0, SettingsProvider settingsProvider0) {
        Task task0;
        CrashlyticsBackgroundWorker crashlyticsBackgroundWorker0 = crashlyticsCore0.m;
        crashlyticsCore0.m.checkRunningOnThread();
        crashlyticsCore0.e.b();
        Logger.getLogger().v("Initialization marker file was created.");
        try {
            m m0 = new m(crashlyticsCore0);
            crashlyticsCore0.breadcrumbSource.registerBreadcrumbHandler(m0);
            if(settingsProvider0.getSettingsSync().featureFlagData.collectReports) {
                if(!crashlyticsCore0.h.e(settingsProvider0)) {
                    Logger.getLogger().w("Previous sessions could not be finalized.");
                }
                task0 = crashlyticsCore0.h.i(settingsProvider0.getSettingsAsync());
            }
            else {
                Logger.getLogger().d("Collection of crash reports disabled in Crashlytics settings.");
                task0 = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
        }
        catch(Exception exception0) {
            Logger.getLogger().e("Crashlytics encountered a problem during asynchronous initialization.", exception0);
            task0 = Tasks.forException(exception0);
        }
        finally {
            crashlyticsBackgroundWorker0.submit(new n(crashlyticsCore0, 0));
        }
        return task0;
    }

    public final void b(SettingsProvider settingsProvider0) {
        o o0 = new o(this, settingsProvider0, false, 18);
        Future future0 = this.l.submit(o0);
        Logger.getLogger().d("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            future0.get(4L, TimeUnit.SECONDS);
        }
        catch(InterruptedException interruptedException0) {
            Logger.getLogger().e("Crashlytics was interrupted during initialization.", interruptedException0);
        }
        catch(ExecutionException executionException0) {
            Logger.getLogger().e("Crashlytics encountered a problem during initialization.", executionException0);
        }
        catch(TimeoutException timeoutException0) {
            Logger.getLogger().e("Crashlytics timed out during initialization.", timeoutException0);
        }
    }

    @NonNull
    public Task checkForUnsentReports() {
        l l0 = this.h;
        if(!l0.r.compareAndSet(false, true)) {
            Logger.getLogger().w("checkForUnsentReports should only be called once per execution.");
            return Tasks.forResult(Boolean.FALSE);
        }
        return l0.o.getTask();
    }

    public Task deleteUnsentReports() {
        l l0 = this.h;
        l0.p.trySetResult(Boolean.FALSE);
        return l0.q.getTask();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.g;
    }

    public Task doBackgroundInitializationAsync(SettingsProvider settingsProvider0) {
        androidx.work.impl.model.b b0 = new androidx.work.impl.model.b(3, this, settingsProvider0);
        return Utils.callTask(this.l, b0);
    }

    public static String getVersion() [...] // Inlined contents

    public void log(String s) {
        l l0 = this.h;
        l0.getClass();
        i i0 = new i(l0, System.currentTimeMillis() - this.d, s);
        l0.e.submit(i0);
    }

    public void logException(@NonNull Throwable throwable0) {
        l l0 = this.h;
        l0.getClass();
        j j0 = new j(l0, System.currentTimeMillis(), throwable0, Thread.currentThread());
        l0.e.getClass();
        n n0 = new n(j0, 2);
        l0.e.submit(n0);
    }

    public void logFatalException(Throwable throwable0) {
        Logger.getLogger().d("Recorded on-demand fatal events: " + this.c.getRecordedOnDemandExceptions());
        Logger.getLogger().d("Dropped on-demand fatal events: " + this.c.getDroppedOnDemandExceptions());
        this.h.h("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(this.c.getRecordedOnDemandExceptions()));
        this.h.h("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(this.c.getDroppedOnDemandExceptions()));
        l l0 = this.h;
        Thread thread0 = Thread.currentThread();
        SettingsProvider settingsProvider0 = l0.n;
        if(settingsProvider0 == null) {
            Logger.getLogger().w("settingsProvider not set");
            return;
        }
        l0.g(settingsProvider0, thread0, throwable0, true);
    }

    public boolean onPreExecute(AppData appData0, SettingsProvider settingsProvider0) {
        Boolean boolean0;
        CrashlyticsBackgroundWorker crashlyticsBackgroundWorker0 = this.m;
        FileStore fileStore0 = this.j;
        Context context0 = this.a;
        boolean z = CommonUtils.getBooleanResourceValue(context0, "com.crashlytics.RequireBuildId", true);
        String s = appData0.buildId;
        boolean z2 = false;
        if(!z) {
            z2 = true;
            Logger.getLogger().v("Configured not to require a build ID.");
        }
        else if(!TextUtils.isEmpty(s)) {
            z2 = true;
        }
        if(z2) {
            new c(this.i);
            String s1 = c.b;
            try {
                this.f = new b(13, "crash_marker", fileStore0);
                this.e = new b(13, "initialization_marker", fileStore0);
                UserMetadata userMetadata0 = new UserMetadata(s1, fileStore0, crashlyticsBackgroundWorker0);
                LogFileManager logFileManager0 = new LogFileManager(fileStore0);
                MiddleOutFallbackStrategy middleOutFallbackStrategy0 = new MiddleOutFallbackStrategy(0x400, new StackTraceTrimmingStrategy[]{new RemoveRepeatsStrategy(10)});
                SessionReportingCoordinator sessionReportingCoordinator0 = SessionReportingCoordinator.create(this.a, this.i, this.j, appData0, logFileManager0, userMetadata0, middleOutFallbackStrategy0, settingsProvider0, this.c);
                this.h = new l(this.a, this.m, this.i, this.b, this.j, this.f, appData0, userMetadata0, logFileManager0, sessionReportingCoordinator0, this.n, this.k);
                boolean z1 = ((FileStore)this.e.c).getCommonFile(((String)this.e.b)).exists();
                Task task0 = crashlyticsBackgroundWorker0.submit(new n(this, 1));
                try {
                    boolean0 = (Boolean)Utils.awaitEvenIfOnMainThread(task0);
                }
                catch(Exception unused_ex) {
                    this.g = false;
                    goto label_25;
                }
                this.g = Boolean.TRUE.equals(boolean0);
            label_25:
                l l0 = this.h;
                Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = Thread.getDefaultUncaughtExceptionHandler();
                l0.n = settingsProvider0;
                androidx.work.impl.model.b b0 = new androidx.work.impl.model.b(2, l0, s1);
                l0.e.submit(b0);
                com.google.firebase.crashlytics.internal.common.o o0 = new com.google.firebase.crashlytics.internal.common.o(new g(l0, 0), settingsProvider0, thread$UncaughtExceptionHandler0, l0.j);
                l0.m = o0;
                Thread.setDefaultUncaughtExceptionHandler(o0);
                if(z1 && CommonUtils.canTryConnection(context0)) {
                    Logger.getLogger().d("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    this.b(settingsProvider0);
                    return false;
                }
            }
            catch(Exception exception0) {
                Logger.getLogger().e("Crashlytics was not started due to an exception during initialization", exception0);
                this.h = null;
                return false;
            }
            Logger.getLogger().d("Successfully configured exception handler.");
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app\'s build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app\'s build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
    }

    public Task sendUnsentReports() {
        l l0 = this.h;
        l0.p.trySetResult(Boolean.TRUE);
        return l0.q.getTask();
    }

    public void setCrashlyticsCollectionEnabled(@Nullable Boolean boolean0) {
        this.b.setCrashlyticsDataCollectionEnabled(boolean0);
    }

    public void setCustomKey(String s, String s1) {
        l l0 = this.h;
        l0.getClass();
        try {
            l0.d.setCustomKey(s, s1);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            if(l0.a != null && CommonUtils.isAppDebuggable(l0.a)) {
                throw illegalArgumentException0;
            }
            Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void setCustomKeys(Map map0) {
        this.h.d.setCustomKeys(map0);
    }

    public void setInternalKey(String s, String s1) {
        this.h.h(s, s1);
    }

    public void setUserId(String s) {
        this.h.d.setUserId(s);
    }
}

