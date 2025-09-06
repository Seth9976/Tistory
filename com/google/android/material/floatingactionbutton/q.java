package com.google.android.material.floatingactionbutton;

import android.graphics.Matrix;
import com.google.android.material.animation.MatrixEvaluator;

public final class q extends MatrixEvaluator {
    public final x d;

    public q(x x0) {
        this.d = x0;
        super();
    }

    @Override  // com.google.android.material.animation.MatrixEvaluator
    public final Matrix evaluate(float f, Matrix matrix0, Matrix matrix1) {
        this.d.p = f;
        return super.evaluate(f, matrix0, matrix1);
    }

    @Override  // com.google.android.material.animation.MatrixEvaluator
    public final Object evaluate(float f, Object object0, Object object1) {
        return this.evaluate(f, ((Matrix)object0), ((Matrix)object1));
    }
}

