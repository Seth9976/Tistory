package androidx.activity;

import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

public final class a0 implements Cancellable, LifecycleEventObserver {
    public final Lifecycle a;
    public final OnBackPressedCallback b;
    public Cancellable c;
    public final OnBackPressedDispatcher d;

    public a0(OnBackPressedDispatcher onBackPressedDispatcher0, Lifecycle lifecycle0, OnBackPressedCallback onBackPressedCallback0) {
        Intrinsics.checkNotNullParameter(lifecycle0, "lifecycle");
        Intrinsics.checkNotNullParameter(onBackPressedCallback0, "onBackPressedCallback");
        this.d = onBackPressedDispatcher0;
        this.a = lifecycle0;
        this.b = onBackPressedCallback0;
        lifecycle0.addObserver(this);
    }

    @Override  // androidx.activity.Cancellable
    public final void cancel() {
        this.a.removeObserver(this);
        this.b.removeCancellable(this);
        Cancellable cancellable0 = this.c;
        if(cancellable0 != null) {
            cancellable0.cancel();
        }
        this.c = null;
    }

    @Override  // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) {
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "source");
        Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
        if(lifecycle$Event0 == Event.ON_START) {
            this.c = this.d.addCancellableCallback$activity_release(this.b);
            return;
        }
        if(lifecycle$Event0 == Event.ON_STOP) {
            Cancellable cancellable0 = this.c;
            if(cancellable0 != null) {
                cancellable0.cancel();
            }
        }
        else if(lifecycle$Event0 == Event.ON_DESTROY) {
            this.cancel();
        }
    }
}

