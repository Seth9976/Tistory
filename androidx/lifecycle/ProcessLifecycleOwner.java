package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import androidx.activity.h;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0002\u001A\u0019J\u000F\u0010\u0005\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0007\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u000F\u0010\t\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0004J\u000F\u0010\u000B\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u0004J\u000F\u0010\r\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\u0004J\u000F\u0010\u000F\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u000E\u0010\u0004J\u0017\u0010\u0014\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001A\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u001B"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/LifecycleOwner;", "", "activityStarted$lifecycle_process_release", "()V", "activityStarted", "activityResumed$lifecycle_process_release", "activityResumed", "activityPaused$lifecycle_process_release", "activityPaused", "activityStopped$lifecycle_process_release", "activityStopped", "dispatchPauseIfNeeded$lifecycle_process_release", "dispatchPauseIfNeeded", "dispatchStopIfNeeded$lifecycle_process_release", "dispatchStopIfNeeded", "Landroid/content/Context;", "context", "attach$lifecycle_process_release", "(Landroid/content/Context;)V", "attach", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Companion", "Api29Impl", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ProcessLifecycleOwner implements LifecycleOwner {
    @RequiresApi(29)
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Api29Impl;", "", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "", "registerActivityLifecycleCallbacks", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Api29Impl {
        @NotNull
        public static final Api29Impl INSTANCE;

        static {
            Api29Impl.INSTANCE = new Api29Impl();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @DoNotInline
        @JvmStatic
        public static final void registerActivityLifecycleCallbacks(@NotNull Activity activity0, @NotNull Application.ActivityLifecycleCallbacks application$ActivityLifecycleCallbacks0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            Intrinsics.checkNotNullParameter(application$ActivityLifecycleCallbacks0, "callback");
            activity0.registerActivityLifecycleCallbacks(application$ActivityLifecycleCallbacks0);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000F\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\n\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\tR\u001A\u0010\f\u001A\u00020\u000B8\u0000X\u0081T¢\u0006\f\n\u0004\b\f\u0010\r\u0012\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0011\u001A\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner$Companion;", "", "Landroidx/lifecycle/LifecycleOwner;", "get", "()Landroidx/lifecycle/LifecycleOwner;", "Landroid/content/Context;", "context", "", "init$lifecycle_process_release", "(Landroid/content/Context;)V", "init", "", "TIMEOUT_MS", "J", "getTIMEOUT_MS$lifecycle_process_release$annotations", "()V", "Landroidx/lifecycle/ProcessLifecycleOwner;", "newInstance", "Landroidx/lifecycle/ProcessLifecycleOwner;", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final LifecycleOwner get() {
            return ProcessLifecycleOwner.i;
        }

        @VisibleForTesting
        public static void getTIMEOUT_MS$lifecycle_process_release$annotations() {
        }

        @JvmStatic
        public final void init$lifecycle_process_release(@NotNull Context context0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            ProcessLifecycleOwner.i.attach$lifecycle_process_release(context0);
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final long TIMEOUT_MS = 700L;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public Handler e;
    public final LifecycleRegistry f;
    public final h g;
    public final ProcessLifecycleOwner.initializationListener.1 h;
    public static final ProcessLifecycleOwner i;

    static {
        ProcessLifecycleOwner.Companion = new Companion(null);
        ProcessLifecycleOwner.i = new ProcessLifecycleOwner();
    }

    public ProcessLifecycleOwner() {
        this.c = true;
        this.d = true;
        this.f = new LifecycleRegistry(this);
        this.g = new h(this, 8);
        this.h = new ProcessLifecycleOwner.initializationListener.1(this);
    }

    public final void activityPaused$lifecycle_process_release() {
        int v = this.b - 1;
        this.b = v;
        if(v == 0) {
            Handler handler0 = this.e;
            Intrinsics.checkNotNull(handler0);
            handler0.postDelayed(this.g, 700L);
        }
    }

    public final void activityResumed$lifecycle_process_release() {
        int v = this.b + 1;
        this.b = v;
        if(v == 1) {
            if(this.c) {
                this.f.handleLifecycleEvent(Event.ON_RESUME);
                this.c = false;
                return;
            }
            Handler handler0 = this.e;
            Intrinsics.checkNotNull(handler0);
            handler0.removeCallbacks(this.g);
        }
    }

    public final void activityStarted$lifecycle_process_release() {
        int v = this.a + 1;
        this.a = v;
        if(v == 1 && this.d) {
            this.f.handleLifecycleEvent(Event.ON_START);
            this.d = false;
        }
    }

    public final void activityStopped$lifecycle_process_release() {
        --this.a;
        this.dispatchStopIfNeeded$lifecycle_process_release();
    }

    public final void attach$lifecycle_process_release(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this.e = new Handler();
        this.f.handleLifecycleEvent(Event.ON_CREATE);
        Context context1 = context0.getApplicationContext();
        Intrinsics.checkNotNull(context1, "null cannot be cast to non-null type android.app.Application");
        ((Application)context1).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() {
            @Override  // androidx.lifecycle.EmptyActivityLifecycleCallbacks
            public void onActivityCreated(@NotNull Activity activity0, @Nullable Bundle bundle0) {
                Intrinsics.checkNotNullParameter(activity0, "activity");
                if(Build.VERSION.SDK_INT < 29) {
                    ReportFragment.Companion.get(activity0).setProcessListener(ProcessLifecycleOwner.this.h);
                }
            }

            @Override  // androidx.lifecycle.EmptyActivityLifecycleCallbacks
            public void onActivityPaused(@NotNull Activity activity0) {
                Intrinsics.checkNotNullParameter(activity0, "activity");
                ProcessLifecycleOwner.this.activityPaused$lifecycle_process_release();
            }

            @Override  // android.app.Application$ActivityLifecycleCallbacks
            @RequiresApi(29)
            public void onActivityPreCreated(@NotNull Activity activity0, @Nullable Bundle bundle0) {
                Intrinsics.checkNotNullParameter(activity0, "activity");
                Api29Impl.registerActivityLifecycleCallbacks(activity0, new EmptyActivityLifecycleCallbacks() {
                    @Override  // android.app.Application$ActivityLifecycleCallbacks
                    public void onActivityPostResumed(@NotNull Activity activity0) {
                        Intrinsics.checkNotNullParameter(activity0, "activity");
                        ProcessLifecycleOwner.this.activityResumed$lifecycle_process_release();
                    }

                    @Override  // android.app.Application$ActivityLifecycleCallbacks
                    public void onActivityPostStarted(@NotNull Activity activity0) {
                        Intrinsics.checkNotNullParameter(activity0, "activity");
                        ProcessLifecycleOwner.this.activityStarted$lifecycle_process_release();
                    }
                });
            }

            @Override  // androidx.lifecycle.EmptyActivityLifecycleCallbacks
            public void onActivityStopped(@NotNull Activity activity0) {
                Intrinsics.checkNotNullParameter(activity0, "activity");
                ProcessLifecycleOwner.this.activityStopped$lifecycle_process_release();
            }
        });
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
        if(this.b == 0) {
            this.c = true;
            this.f.handleLifecycleEvent(Event.ON_PAUSE);
        }
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
        if(this.a == 0 && this.c) {
            this.f.handleLifecycleEvent(Event.ON_STOP);
            this.d = true;
        }
    }

    @JvmStatic
    @NotNull
    public static final LifecycleOwner get() {
        return ProcessLifecycleOwner.Companion.get();
    }

    @Override  // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.f;
    }

    @JvmStatic
    public static final void init$lifecycle_process_release(@NotNull Context context0) {
        ProcessLifecycleOwner.Companion.init$lifecycle_process_release(context0);
    }
}

