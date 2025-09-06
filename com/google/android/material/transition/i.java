package com.google.android.material.transition;

import android.view.View;
import androidx.transition.Transition;
import com.google.android.material.internal.ViewUtils;

public final class i extends n {
    public final View a;
    public final k b;
    public final View c;
    public final View d;
    public final MaterialContainerTransform e;

    public i(MaterialContainerTransform materialContainerTransform0, View view0, k k0, View view1, View view2) {
        this.e = materialContainerTransform0;
        this.a = view0;
        this.b = k0;
        this.c = view1;
        this.d = view2;
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionEnd(Transition transition0) {
        this.e.removeListener(this);
        if(this.e.J) {
            return;
        }
        this.c.setAlpha(1.0f);
        this.d.setAlpha(1.0f);
        ViewUtils.getOverlay(this.a).remove(this.b);
    }

    @Override  // androidx.transition.Transition$TransitionListener
    public final void onTransitionStart(Transition transition0) {
        ViewUtils.getOverlay(this.a).add(this.b);
        this.c.setAlpha(0.0f);
        this.d.setAlpha(0.0f);
    }
}

