package androidx.fragment.app;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;

public final class k0 implements View.OnAttachStateChangeListener {
    public final k1 a;
    public final l0 b;

    public k0(l0 l00, k1 k10) {
        this.b = l00;
        this.a = k10;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        this.a.k();
        SpecialEffectsController.getOrCreateController(((ViewGroup)this.a.c.mView.getParent()), this.b.a).forceCompleteAllOperations();
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }
}

