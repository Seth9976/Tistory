package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup.LayoutParams;

public final class e implements Size {
    public final ExtendedFloatingActionButton a;

    public e(ExtendedFloatingActionButton extendedFloatingActionButton0) {
        this.a = extendedFloatingActionButton0;
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getHeight() {
        return this.a.getCollapsedSize();
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(this.a.getCollapsedSize(), this.a.getCollapsedSize());
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getPaddingEnd() {
        return this.a.getCollapsedPadding();
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getPaddingStart() {
        return this.a.getCollapsedPadding();
    }

    @Override  // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size
    public final int getWidth() {
        return this.a.getCollapsedSize();
    }
}

