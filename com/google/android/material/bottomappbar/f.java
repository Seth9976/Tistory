package com.google.android.material.bottomappbar;

import androidx.appcompat.widget.ActionMenuView;

public final class f implements Runnable {
    public final ActionMenuView a;
    public final int b;
    public final boolean c;
    public final BottomAppBar d;

    public f(BottomAppBar bottomAppBar0, ActionMenuView actionMenuView0, int v, boolean z) {
        this.d = bottomAppBar0;
        this.a = actionMenuView0;
        this.b = v;
        this.c = z;
    }

    @Override
    public final void run() {
        float f = (float)this.d.getActionMenuViewTranslationX(this.a, this.b, this.c);
        this.a.setTranslationX(f);
    }
}

