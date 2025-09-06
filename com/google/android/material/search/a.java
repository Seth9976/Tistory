package com.google.android.material.search;

import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityManagerCompat;

public final class a implements View.OnAttachStateChangeListener {
    public final SearchBar a;

    public a(SearchBar searchBar0) {
        this.a = searchBar0;
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        AccessibilityManagerCompat.addTouchExplorationStateChangeListener(this.a.q0, this.a.r0);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(this.a.q0, this.a.r0);
    }
}

