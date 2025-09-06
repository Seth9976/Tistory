package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

public class ShapePath {
    public static class PathArcOperation extends PathOperation {
        public static final RectF a;
        @Deprecated
        public float bottom;
        @Deprecated
        public float left;
        @Deprecated
        public float right;
        @Deprecated
        public float startAngle;
        @Deprecated
        public float sweepAngle;
        @Deprecated
        public float top;

        static {
            PathArcOperation.a = new RectF();
        }

        public PathArcOperation(float f, float f1, float f2, float f3) {
            this.left = f;
            this.top = f1;
            this.right = f2;
            this.bottom = f3;
        }

        @Override  // com.google.android.material.shape.ShapePath$PathOperation
        public void applyToPath(@NonNull Matrix matrix0, @NonNull Path path0) {
            matrix0.invert(this.matrix);
            path0.transform(this.matrix);
            PathArcOperation.a.set(this.left, this.top, this.right, this.bottom);
            path0.arcTo(PathArcOperation.a, this.startAngle, this.sweepAngle, false);
            path0.transform(matrix0);
        }
    }

    public static class PathCubicOperation extends PathOperation {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public PathCubicOperation(float f, float f1, float f2, float f3, float f4, float f5) {
            this.a = f;
            this.b = f1;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = f5;
        }

        @Override  // com.google.android.material.shape.ShapePath$PathOperation
        public void applyToPath(@NonNull Matrix matrix0, @NonNull Path path0) {
            matrix0.invert(this.matrix);
            path0.transform(this.matrix);
            path0.cubicTo(this.a, this.b, this.c, this.d, this.e, this.f);
            path0.transform(matrix0);
        }
    }

    public static class PathLineOperation extends PathOperation {
        public float a;
        public float b;

        @Override  // com.google.android.material.shape.ShapePath$PathOperation
        public void applyToPath(@NonNull Matrix matrix0, @NonNull Path path0) {
            matrix0.invert(this.matrix);
            path0.transform(this.matrix);
            path0.lineTo(this.a, this.b);
            path0.transform(matrix0);
        }
    }

    public static abstract class PathOperation {
        protected final Matrix matrix;

        public PathOperation() {
            this.matrix = new Matrix();
        }

        public abstract void applyToPath(Matrix arg1, Path arg2);
    }

    public static class PathQuadOperation extends PathOperation {
        @Deprecated
        public float controlX;
        @Deprecated
        public float controlY;
        @Deprecated
        public float endX;
        @Deprecated
        public float endY;

        @Override  // com.google.android.material.shape.ShapePath$PathOperation
        public void applyToPath(@NonNull Matrix matrix0, @NonNull Path path0) {
            matrix0.invert(this.matrix);
            path0.transform(this.matrix);
            path0.quadTo(this.controlX, this.controlY, this.endX, this.endY);
            path0.transform(matrix0);
        }
    }

    protected static final float ANGLE_LEFT = 180.0f;
    public final ArrayList a;
    public final ArrayList b;
    public boolean c;
    @Deprecated
    public float currentShadowAngle;
    @Deprecated
    public float endShadowAngle;
    @Deprecated
    public float endX;
    @Deprecated
    public float endY;
    @Deprecated
    public float startX;
    @Deprecated
    public float startY;

    public ShapePath() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.reset(0.0f, 0.0f);
    }

    public ShapePath(float f, float f1) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.reset(f, f1);
    }

    public final void a(float f) {
        float f1 = this.currentShadowAngle;
        if(f1 == f) {
            return;
        }
        float f2 = (f - f1 + 360.0f) % 360.0f;
        if(f2 > 180.0f) {
            return;
        }
        PathArcOperation shapePath$PathArcOperation0 = new PathArcOperation(this.endX, this.endY, this.endX, this.endY);
        shapePath$PathArcOperation0.startAngle = this.currentShadowAngle;
        shapePath$PathArcOperation0.sweepAngle = f2;
        f f3 = new f(shapePath$PathArcOperation0);
        this.b.add(f3);
        this.currentShadowAngle = f;
    }

    public void addArc(float f, float f1, float f2, float f3, float f4, float f5) {
        PathArcOperation shapePath$PathArcOperation0 = new PathArcOperation(f, f1, f2, f3);
        shapePath$PathArcOperation0.startAngle = f4;
        shapePath$PathArcOperation0.sweepAngle = f5;
        this.a.add(shapePath$PathArcOperation0);
        f f6 = new f(shapePath$PathArcOperation0);
        float f7 = f4 + f5;
        if(f5 < 0.0f) {
            f4 = (f4 + 180.0f) % 360.0f;
        }
        this.a(f4);
        this.b.add(f6);
        this.currentShadowAngle = f5 < 0.0f ? (f7 + 180.0f) % 360.0f : f7;
        this.endX = (f2 - f) / 2.0f * ((float)Math.cos(Math.toRadians(f7))) + (f + f2) * 0.5f;
        this.endY = (f3 - f1) / 2.0f * ((float)Math.sin(Math.toRadians(f7))) + (f1 + f3) * 0.5f;
    }

    public void applyToPath(Matrix matrix0, Path path0) {
        ArrayList arrayList0 = this.a;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((PathOperation)arrayList0.get(v1)).applyToPath(matrix0, path0);
        }
    }

    @RequiresApi(21)
    public void cubicToPoint(float f, float f1, float f2, float f3, float f4, float f5) {
        PathCubicOperation shapePath$PathCubicOperation0 = new PathCubicOperation(f, f1, f2, f3, f4, f5);
        this.a.add(shapePath$PathCubicOperation0);
        this.c = true;
        this.endX = f4;
        this.endY = f5;
    }

    public void lineTo(float f, float f1) {
        PathLineOperation shapePath$PathLineOperation0 = new PathLineOperation();
        shapePath$PathLineOperation0.a = f;
        shapePath$PathLineOperation0.b = f1;
        this.a.add(shapePath$PathLineOperation0);
        h h0 = new h(shapePath$PathLineOperation0, this.endX, this.endY);
        float f2 = h0.b();
        float f3 = h0.b();
        this.a(f2 + 270.0f);
        this.b.add(h0);
        this.currentShadowAngle = f3 + 270.0f;
        this.endX = f;
        this.endY = f1;
    }

    public void lineTo(float f, float f1, float f2, float f3) {
        if(Math.abs(f - this.endX) < 0.001f && Math.abs(f1 - this.endY) < 0.001f || Math.abs(f - f2) < 0.001f && Math.abs(f1 - f3) < 0.001f) {
            this.lineTo(f2, f3);
            return;
        }
        PathLineOperation shapePath$PathLineOperation0 = new PathLineOperation();
        shapePath$PathLineOperation0.a = f;
        shapePath$PathLineOperation0.b = f1;
        this.a.add(shapePath$PathLineOperation0);
        PathLineOperation shapePath$PathLineOperation1 = new PathLineOperation();
        shapePath$PathLineOperation1.a = f2;
        shapePath$PathLineOperation1.b = f3;
        this.a.add(shapePath$PathLineOperation1);
        g g0 = new g(shapePath$PathLineOperation0, shapePath$PathLineOperation1, this.endX, this.endY);
        float f4 = (g0.b() - g0.c() + 360.0f) % 360.0f;
        if(f4 > 180.0f) {
            f4 -= 360.0f;
        }
        if(f4 > 0.0f) {
            this.lineTo(f, f1);
            this.lineTo(f2, f3);
            return;
        }
        float f5 = g0.c();
        float f6 = g0.b();
        this.a(f5 + 270.0f);
        this.b.add(g0);
        this.currentShadowAngle = f6 + 270.0f;
        this.endX = f2;
        this.endY = f3;
    }

    @RequiresApi(21)
    public void quadToPoint(float f, float f1, float f2, float f3) {
        PathQuadOperation shapePath$PathQuadOperation0 = new PathQuadOperation();
        shapePath$PathQuadOperation0.controlX = f;
        shapePath$PathQuadOperation0.controlY = f1;
        shapePath$PathQuadOperation0.endX = f2;
        shapePath$PathQuadOperation0.endY = f3;
        this.a.add(shapePath$PathQuadOperation0);
        this.c = true;
        this.endX = f2;
        this.endY = f3;
    }

    public void reset(float f, float f1) {
        this.reset(f, f1, 270.0f, 0.0f);
    }

    public void reset(float f, float f1, float f2, float f3) {
        this.startX = f;
        this.startY = f1;
        this.endX = f;
        this.endY = f1;
        this.currentShadowAngle = f2;
        this.endShadowAngle = (f2 + f3) % 360.0f;
        this.a.clear();
        this.b.clear();
        this.c = false;
    }
}

