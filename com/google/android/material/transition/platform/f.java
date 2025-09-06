package com.google.android.material.transition.platform;

import android.transition.Transition;
import android.view.View;
import com.google.android.material.internal.ViewUtils;

public final class f extends k {
    public final View a;
    public final h b;
    public final View c;
    public final View d;
    public final MaterialContainerTransform e;

    public f(MaterialContainerTransform materialContainerTransform0, View view0, h h0, View view1, View view2) {
        this.e = materialContainerTransform0;
        this.a = view0;
        this.b = h0;
        this.c = view1;
        this.d = view2;
    }

    @Override  // com.google.android.material.transition.platform.k
    public final void onTransitionEnd(Transition transition0) {
        this.e.removeListener(this);
        if(this.e.b) {
            return;
        }
        this.c.setAlpha(1.0f);
        this.d.setAlpha(1.0f);
        ViewUtils.getOverlay(this.a).remove(this.b);
    }

    @Override  // com.google.android.material.transition.platform.k
    public final void onTransitionStart(Transition transition0) {
        ViewUtils.getOverlay(this.a).add(this.b);
        this.c.setAlpha(0.0f);
        this.d.setAlpha(0.0f);
    }
}

