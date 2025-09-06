package com.google.android.material.shape;

import android.view.ViewTreeObserver.OnScrollChangedListener;

public final class a implements ViewTreeObserver.OnScrollChangedListener {
    public final InterpolateOnScrollPositionChangeHelper a;

    public a(InterpolateOnScrollPositionChangeHelper interpolateOnScrollPositionChangeHelper0) {
        this.a = interpolateOnScrollPositionChangeHelper0;
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        this.a.updateInterpolationForScreenPosition();
    }
}

