package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup.LayoutParams;

public final class f implements Size {
    public final ExtendedFloatingActionButton a;

    public f(ExtendedFloatingActionButton extendedFloatingActionButton0) {
        this.a = extendedFloatingActionButton0;
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getPaddingEnd() {
        return this.a.B;
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getPaddingStart() {
        return this.a.A;
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getWidth() {
        return this.a.getMeasuredWidth() - this.a.getCollapsedPadding() * 2 + this.a.A + this.a.B;
    }
}

