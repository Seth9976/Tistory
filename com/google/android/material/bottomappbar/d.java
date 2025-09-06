package com.google.android.material.bottomappbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class d extends OnVisibilityChangedListener {
    public final int a;
    public final BottomAppBar b;

    public d(BottomAppBar bottomAppBar0, int v) {
        this.b = bottomAppBar0;
        this.a = v;
        super();
    }

    @Override  // com.google.android.material.floatingactionbutton.FloatingActionButton$OnVisibilityChangedListener
    public final void onHidden(FloatingActionButton floatingActionButton0) {
        floatingActionButton0.setTranslationX(this.b.y(this.a));
        floatingActionButton0.show(new c(this));
    }
}

