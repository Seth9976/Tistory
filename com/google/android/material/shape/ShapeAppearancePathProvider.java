package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

public class ShapeAppearancePathProvider {
    @RestrictTo({Scope.LIBRARY_GROUP})
    public interface PathListener {
        void onCornerPathCreated(ShapePath arg1, Matrix arg2, int arg3);

        void onEdgePathCreated(ShapePath arg1, Matrix arg2, int arg3);
    }

    public final ShapePath[] a;
    public final Matrix[] b;
    public final Matrix[] c;
    public final PointF d;
    public final Path e;
    public final Path f;
    public final ShapePath g;
    public final float[] h;
    public final float[] i;
    public final Path j;
    public final Path k;
    public boolean l;

    public ShapeAppearancePathProvider() {
        this.a = new ShapePath[4];
        this.b = new Matrix[4];
        this.c = new Matrix[4];
        this.d = new PointF();
        this.e = new Path();
        this.f = new Path();
        this.g = new ShapePath();
        this.h = new float[2];
        this.i = new float[2];
        this.j = new Path();
        this.k = new Path();
        this.l = true;
        for(int v = 0; v < 4; ++v) {
            this.a[v] = new ShapePath();
            this.b[v] = new Matrix();
            this.c[v] = new Matrix();
        }
    }

    public final boolean a(Path path0, int v) {
        this.k.reset();
        this.a[v].applyToPath(this.b[v], this.k);
        RectF rectF0 = new RectF();
        path0.computeBounds(rectF0, true);
        this.k.computeBounds(rectF0, true);
        path0.op(this.k, Path.Op.INTERSECT);
        path0.computeBounds(rectF0, true);
        return !rectF0.isEmpty() || rectF0.width() > 1.0f && rectF0.height() > 1.0f;
    }

    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel0, float f, RectF rectF0, @NonNull Path path0) {
        this.calculatePath(shapeAppearanceModel0, f, rectF0, null, path0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel0, float f, RectF rectF0, PathListener shapeAppearancePathProvider$PathListener0, @NonNull Path path0) {
        Path path5;
        EdgeTreatment edgeTreatment0;
        CornerTreatment cornerTreatment0;
        CornerSize cornerSize0;
        float[] arr_f;
        ShapePath[] arr_shapePath;
        Matrix[] arr_matrix1;
        Matrix[] arr_matrix;
        path0.rewind();
        Path path1 = this.e;
        path1.rewind();
        Path path2 = this.f;
        path2.rewind();
        path2.addRect(rectF0, Path.Direction.CW);
        for(int v = 0; true; ++v) {
            arr_matrix = this.c;
            arr_matrix1 = this.b;
            arr_shapePath = this.a;
            arr_f = this.h;
            if(v >= 4) {
                break;
            }
            switch(v) {
                case 1: {
                    cornerSize0 = shapeAppearanceModel0.getBottomRightCornerSize();
                    break;
                }
                case 2: {
                    cornerSize0 = shapeAppearanceModel0.getBottomLeftCornerSize();
                    break;
                }
                case 3: {
                    cornerSize0 = shapeAppearanceModel0.getTopLeftCornerSize();
                    break;
                }
                default: {
                    cornerSize0 = shapeAppearanceModel0.getTopRightCornerSize();
                }
            }
            switch(v) {
                case 1: {
                    cornerTreatment0 = shapeAppearanceModel0.getBottomRightCorner();
                    break;
                }
                case 2: {
                    cornerTreatment0 = shapeAppearanceModel0.getBottomLeftCorner();
                    break;
                }
                case 3: {
                    cornerTreatment0 = shapeAppearanceModel0.getTopLeftCorner();
                    break;
                }
                default: {
                    cornerTreatment0 = shapeAppearanceModel0.getTopRightCorner();
                }
            }
            cornerTreatment0.getCornerPath(arr_shapePath[v], 90.0f, f, rectF0, cornerSize0);
            float f1 = (float)((v + 1) % 4 * 90);
            arr_matrix1[v].reset();
            PointF pointF0 = this.d;
            switch(v) {
                case 1: {
                    pointF0.set(rectF0.right, rectF0.bottom);
                    break;
                }
                case 2: {
                    pointF0.set(rectF0.left, rectF0.bottom);
                    break;
                }
                case 3: {
                    pointF0.set(rectF0.left, rectF0.top);
                    break;
                }
                default: {
                    pointF0.set(rectF0.right, rectF0.top);
                }
            }
            arr_matrix1[v].setTranslate(pointF0.x, pointF0.y);
            arr_matrix1[v].preRotate(f1);
            ShapePath shapePath0 = arr_shapePath[v];
            arr_f[0] = shapePath0.endX;
            arr_f[1] = shapePath0.endY;
            arr_matrix1[v].mapPoints(arr_f);
            arr_matrix[v].reset();
            arr_matrix[v].setTranslate(arr_f[0], arr_f[1]);
            arr_matrix[v].preRotate(f1);
        }
        Path path3 = path1;
        for(int v1 = 0; v1 < 4; ++v1) {
            ShapePath shapePath1 = arr_shapePath[v1];
            arr_f[0] = shapePath1.startX;
            arr_f[1] = shapePath1.startY;
            arr_matrix1[v1].mapPoints(arr_f);
            if(v1 == 0) {
                path0.moveTo(arr_f[0], arr_f[1]);
            }
            else {
                path0.lineTo(arr_f[0], arr_f[1]);
            }
            arr_shapePath[v1].applyToPath(arr_matrix1[v1], path0);
            if(shapeAppearancePathProvider$PathListener0 != null) {
                shapeAppearancePathProvider$PathListener0.onCornerPathCreated(arr_shapePath[v1], arr_matrix1[v1], v1);
            }
            int v2 = (v1 + 1) % 4;
            ShapePath shapePath2 = arr_shapePath[v1];
            arr_f[0] = shapePath2.endX;
            arr_f[1] = shapePath2.endY;
            arr_matrix1[v1].mapPoints(arr_f);
            ShapePath shapePath3 = arr_shapePath[v2];
            this.i[0] = shapePath3.startX;
            this.i[1] = shapePath3.startY;
            arr_matrix1[v2].mapPoints(this.i);
            float f2 = Math.max(((float)Math.hypot(arr_f[0] - this.i[0], arr_f[1] - this.i[1])) - 0.001f, 0.0f);
            ShapePath shapePath4 = arr_shapePath[v1];
            arr_f[0] = shapePath4.endX;
            arr_f[1] = shapePath4.endY;
            arr_matrix1[v1].mapPoints(arr_f);
            float f3 = v1 == 1 || v1 == 3 ? Math.abs(rectF0.centerX() - arr_f[0]) : Math.abs(rectF0.centerY() - arr_f[1]);
            ShapePath shapePath5 = this.g;
            shapePath5.reset(0.0f, 0.0f);
            switch(v1) {
                case 1: {
                    edgeTreatment0 = shapeAppearanceModel0.getBottomEdge();
                    break;
                }
                case 2: {
                    edgeTreatment0 = shapeAppearanceModel0.getLeftEdge();
                    break;
                }
                case 3: {
                    edgeTreatment0 = shapeAppearanceModel0.getTopEdge();
                    break;
                }
                default: {
                    edgeTreatment0 = shapeAppearanceModel0.getRightEdge();
                }
            }
            edgeTreatment0.getEdgePath(f2, f3, f, shapePath5);
            Path path4 = this.j;
            path4.reset();
            shapePath5.applyToPath(arr_matrix[v1], path4);
            if(this.l && (edgeTreatment0.a() || this.a(path4, v1) || this.a(path4, v2))) {
                path4.op(path4, path2, Path.Op.DIFFERENCE);
                arr_f[0] = shapePath5.startX;
                arr_f[1] = shapePath5.startY;
                arr_matrix[v1].mapPoints(arr_f);
                path5 = path3;
                path5.moveTo(arr_f[0], arr_f[1]);
                shapePath5.applyToPath(arr_matrix[v1], path5);
            }
            else {
                path5 = path3;
                shapePath5.applyToPath(arr_matrix[v1], path0);
            }
            if(shapeAppearancePathProvider$PathListener0 != null) {
                shapeAppearancePathProvider$PathListener0.onEdgePathCreated(shapePath5, arr_matrix[v1], v1);
            }
            path3 = path5;
        }
        path0.close();
        path3.close();
        if(!path3.isEmpty()) {
            path0.op(path3, Path.Op.UNION);
        }
    }

    @NonNull
    @RestrictTo({Scope.LIBRARY_GROUP})
    @UiThread
    public static ShapeAppearancePathProvider getInstance() {
        return d.a;
    }
}

