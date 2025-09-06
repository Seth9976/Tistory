package com.google.android.material.bottomappbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class c extends OnVisibilityChangedListener {
    public final d a;

    public c(d d0) {
        this.a = d0;
        super();
    }

    @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$OnVisibilityChangedListener
    public final void onShown(FloatingActionButton floatingActionButton0) {
        this.a.b.getClass();
    }
}

