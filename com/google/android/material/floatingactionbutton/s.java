package com.google.android.material.floatingactionbutton;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

public final class s implements TypeEvaluator {
    public FloatEvaluator a;

    @Override  // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object object0, Object object1) {
        float f1 = (float)this.a.evaluate(f, ((Float)object0), ((Float)object1));
        if(f1 < 0.1f) {
            f1 = 0.0f;
        }
        return f1;
    }
}

