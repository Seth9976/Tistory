package com.kakao.android.base.observer;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.kakao.android.base.BaseKt;
import com.kakao.android.base.utils.Logger;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "don\'t use")
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\bJ\u000F\u0010\n\u001A\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\bJ\u000F\u0010\u000B\u001A\u00020\u0006H\u0003¢\u0006\u0004\b\u000B\u0010\bJ\u000F\u0010\f\u001A\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\bJ\u000F\u0010\r\u001A\u00020\u0006H\u0003¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0015\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010 \u001A\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001F¨\u0006!"}, d2 = {"Lcom/kakao/android/base/observer/AutoLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "", "onCreate", "()V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "Landroid/app/Activity;", "activity", "init", "(Landroid/app/Activity;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)V", "Lio/reactivex/disposables/Disposable;", "disposable", "addDisposable", "(Lio/reactivex/disposables/Disposable;)V", "", "c", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;", "setClassName", "(Ljava/lang/String;)V", "className", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class AutoLifecycleObserver implements LifecycleObserver {
    public final Lifecycle a;
    public final CompositeDisposable b;
    public String c;

    public AutoLifecycleObserver(@NotNull Lifecycle lifecycle0) {
        Intrinsics.checkNotNullParameter(lifecycle0, "lifecycle");
        super();
        this.a = lifecycle0;
        this.b = new CompositeDisposable();
    }

    public final void a(String s) {
        Logger.INSTANCE.log(this.c + " - " + s);
    }

    public final void addDisposable(@NotNull Disposable disposable0) {
        Intrinsics.checkNotNullParameter(disposable0, "disposable");
        if(!this.a.getCurrentState().isAtLeast(State.INITIALIZED)) {
            throw new IllegalStateException("Check failed.");
        }
        DisposableKt.plusAssign(this.b, disposable0);
    }

    @Nullable
    public final String getClassName() {
        return this.c;
    }

    public final void init(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        this.a.addObserver(this);
        this.c = activity0.getClass().getSimpleName();
    }

    public final void init(@NotNull Fragment fragment0) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        this.a.addObserver(this);
        this.c = fragment0.getClass().getSimpleName();
    }

    @OnLifecycleEvent(Event.ON_CREATE)
    private final void onCreate() {
        this.a("onCreate()");
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    private final void onDestroy() {
        this.a("onDestroy()");
        this.b.clear();
        this.a.removeObserver(this);
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    private final void onPause() {
        this.a("onPause()");
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    private final void onResume() {
        this.a("onResume()");
        BaseKt.setCurrentClassName(this.c);
    }

    @OnLifecycleEvent(Event.ON_START)
    private final void onStart() {
        this.a("onStart()");
    }

    @OnLifecycleEvent(Event.ON_STOP)
    private final void onStop() {
        this.a("onStop()");
    }

    public final void setClassName(@Nullable String s) {
        this.c = s;
    }
}

