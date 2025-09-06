package com.google.android.material.floatingactionbutton;

public final class m implements FloatingActionButtonImpl.InternalVisibilityChangedListener {
    public final OnVisibilityChangedListener a;
    public final FloatingActionButton b;

    public m(FloatingActionButton floatingActionButton0, OnVisibilityChangedListener floatingActionButton$OnVisibilityChangedListener0) {
        this.b = floatingActionButton0;
        this.a = floatingActionButton$OnVisibilityChangedListener0;
    }

    @Override  // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalVisibilityChangedListener
    public final void onHidden() {
        this.a.onHidden(this.b);
    }

    @Override  // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalVisibilityChangedListener
    public final void onShown() {
        this.a.onShown(this.b);
    }
}

