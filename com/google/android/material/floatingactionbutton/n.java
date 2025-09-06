package com.google.android.material.floatingactionbutton;

import com.google.android.material.animation.TransformationCallback;

public final class n implements FloatingActionButtonImpl.InternalTransformationCallback {
    public final TransformationCallback a;
    public final FloatingActionButton b;

    public n(FloatingActionButton floatingActionButton0, TransformationCallback transformationCallback0) {
        this.b = floatingActionButton0;
        this.a = transformationCallback0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof n && ((n)object0).a.equals(this.a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalTransformationCallback
    public final void onScaleChanged() {
        this.a.onScaleChanged(this.b);
    }

    @Override  // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalTransformationCallback
    public final void onTranslationChanged() {
        this.a.onTranslationChanged(this.b);
    }
}

