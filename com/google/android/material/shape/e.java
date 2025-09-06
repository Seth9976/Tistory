package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;

public final class e extends i {
    public final ArrayList c;
    public final Matrix d;

    public e(ArrayList arrayList0, Matrix matrix0) {
        this.c = arrayList0;
        this.d = matrix0;
        super();
    }

    @Override  // com.google.android.material.shape.i
    public final void a(Matrix matrix0, ShadowRenderer shadowRenderer0, int v, Canvas canvas0) {
        for(Object object0: this.c) {
            ((i)object0).a(this.d, shadowRenderer0, v, canvas0);
        }
    }
}

