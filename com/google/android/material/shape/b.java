package com.google.android.material.shape;

import android.graphics.Matrix;
import java.util.ArrayList;

public final class b implements PathListener {
    public final MaterialShapeDrawable a;

    public b(MaterialShapeDrawable materialShapeDrawable0) {
        this.a = materialShapeDrawable0;
    }

    @Override  // com.google.android.material.shape.ShapeAppearancePathProvider$PathListener
    public final void onCornerPathCreated(ShapePath shapePath0, Matrix matrix0, int v) {
        this.a.d.set(v, shapePath0.c);
        shapePath0.a(shapePath0.endShadowAngle);
        Matrix matrix1 = new Matrix(matrix0);
        this.a.b[v] = new e(new ArrayList(shapePath0.b), matrix1);
    }

    @Override  // com.google.android.material.shape.ShapeAppearancePathProvider$PathListener
    public final void onEdgePathCreated(ShapePath shapePath0, Matrix matrix0, int v) {
        this.a.d.set(v + 4, shapePath0.c);
        shapePath0.a(shapePath0.endShadowAngle);
        Matrix matrix1 = new Matrix(matrix0);
        this.a.c[v] = new e(new ArrayList(shapePath0.b), matrix1);
    }
}

