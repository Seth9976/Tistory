package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import androidx.annotation.NonNull;

public class MatrixEvaluator implements TypeEvaluator {
    public final float[] a;
    public final float[] b;
    public final Matrix c;

    public MatrixEvaluator() {
        this.a = new float[9];
        this.b = new float[9];
        this.c = new Matrix();
    }

    @NonNull
    public Matrix evaluate(float f, @NonNull Matrix matrix0, @NonNull Matrix matrix1) {
        float[] arr_f = this.a;
        matrix0.getValues(arr_f);
        float[] arr_f1 = this.b;
        matrix1.getValues(arr_f1);
        for(int v = 0; v < 9; ++v) {
            float f1 = arr_f1[v];
            float f2 = arr_f[v];
            arr_f1[v] = (f1 - f2) * f + f2;
        }
        this.c.setValues(arr_f1);
        return this.c;
    }

    @Override  // android.animation.TypeEvaluator
    @NonNull
    public Object evaluate(float f, @NonNull Object object0, @NonNull Object object1) {
        return this.evaluate(f, ((Matrix)object0), ((Matrix)object1));
    }
}

