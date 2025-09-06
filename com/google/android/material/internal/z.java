package com.google.android.material.internal;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import androidx.core.view.ViewCompat;

public final class z implements View.OnAttachStateChangeListener {
    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        view0.removeOnAttachStateChangeListener(this);
        ViewCompat.requestApplyInsets(view0);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }
}

