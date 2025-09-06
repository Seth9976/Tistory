package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup.LayoutParams;

public final class h implements Size {
    public final g a;
    public final f b;
    public final ExtendedFloatingActionButton c;

    public h(ExtendedFloatingActionButton extendedFloatingActionButton0, g g0, f f0) {
        this.c = extendedFloatingActionButton0;
        this.a = g0;
        this.b = f0;
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getHeight() {
        int v = this.c.H;
        if(v == -1) {
            return this.a.getHeight();
        }
        return v == -2 || v == 0 ? this.b.a.getMeasuredHeight() : v;
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final ViewGroup.LayoutParams getLayoutParams() {
        ExtendedFloatingActionButton extendedFloatingActionButton0 = this.c;
        int v = extendedFloatingActionButton0.G;
        int v1 = -2;
        if(v == 0) {
            v = -2;
        }
        int v2 = extendedFloatingActionButton0.H;
        if(v2 != 0) {
            v1 = v2;
        }
        return new ViewGroup.LayoutParams(v, v1);
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getPaddingEnd() {
        return this.c.B;
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getPaddingStart() {
        return this.c.A;
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getWidth() {
        int v = this.c.G;
        if(v == -1) {
            return this.a.getWidth();
        }
        return v == -2 || v == 0 ? this.b.getWidth() : v;
    }
}

