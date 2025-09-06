package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.android.material.shadow.ShadowRenderer;

public abstract class i {
    public final Matrix a;
    public static final Matrix b;

    static {
        i.b = new Matrix();
    }

    public i() {
        this.a = new Matrix();
    }

    public abstract void a(Matrix arg1, ShadowRenderer arg2, int arg3, Canvas arg4);
}

