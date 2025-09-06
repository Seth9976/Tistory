package androidx.activity;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class b0 implements Cancellable {
    public final OnBackPressedCallback a;
    public final OnBackPressedDispatcher b;

    public b0(OnBackPressedDispatcher onBackPressedDispatcher0, OnBackPressedCallback onBackPressedCallback0) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback0, "onBackPressedCallback");
        this.b = onBackPressedDispatcher0;
        this.a = onBackPressedCallback0;
    }

    @Override  // androidx.activity.Cancellable
    public final void cancel() {
        OnBackPressedDispatcher onBackPressedDispatcher0 = this.b;
        OnBackPressedCallback onBackPressedCallback0 = this.a;
        onBackPressedDispatcher0.c.remove(onBackPressedCallback0);
        if(Intrinsics.areEqual(onBackPressedDispatcher0.d, onBackPressedCallback0)) {
            onBackPressedCallback0.handleOnBackCancelled();
            onBackPressedDispatcher0.d = null;
        }
        onBackPressedCallback0.removeCancellable(this);
        Function0 function00 = onBackPressedCallback0.getEnabledChangedCallback$activity_release();
        if(function00 != null) {
            function00.invoke();
        }
        onBackPressedCallback0.setEnabledChangedCallback$activity_release(null);
    }
}

