package androidx.compose.ui.graphics;

import kotlin.NoWhenBranchMatchedException;

public final class a implements PathIterator {
    public final Path a;
    public final ConicEvaluation b;
    public final float c;
    public final float[] d;
    public final androidx.graphics.path.PathIterator e;

    public a(Path path0, ConicEvaluation pathIterator$ConicEvaluation0, float f) {
        androidx.graphics.path.PathIterator.ConicEvaluation pathIterator$ConicEvaluation1;
        this.a = path0;
        this.b = pathIterator$ConicEvaluation0;
        this.c = f;
        this.d = new float[8];
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path1 = ((AndroidPath)path0).getInternalPath();
        switch(AndroidPathIterator.WhenMappings.$EnumSwitchMapping$0[pathIterator$ConicEvaluation0.ordinal()]) {
            case 1: {
                pathIterator$ConicEvaluation1 = androidx.graphics.path.PathIterator.ConicEvaluation.AsConic;
                break;
            }
            case 2: {
                pathIterator$ConicEvaluation1 = androidx.graphics.path.PathIterator.ConicEvaluation.AsQuadratics;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        this.e = new androidx.graphics.path.PathIterator(path1, pathIterator$ConicEvaluation1, f);
    }

    @Override  // androidx.compose.ui.graphics.PathIterator
    public final int calculateSize(boolean z) {
        return this.e.calculateSize(z);
    }

    @Override  // androidx.compose.ui.graphics.PathIterator
    public final ConicEvaluation getConicEvaluation() {
        return this.b;
    }

    @Override  // androidx.compose.ui.graphics.PathIterator
    public final Path getPath() {
        return this.a;
    }

    @Override  // androidx.compose.ui.graphics.PathIterator
    public final float getTolerance() {
        return this.c;
    }

    @Override  // androidx.compose.ui.graphics.PathIterator
    public final boolean hasNext() {
        return this.e.hasNext();
    }

    @Override  // androidx.compose.ui.graphics.PathIterator
    public final Type next(float[] arr_f, int v) {
        return AndroidPathIterator_androidKt.access$toPathSegmentType(this.e.next(arr_f, v));
    }

    @Override  // androidx.compose.ui.graphics.PathIterator
    public final PathSegment next() {
        float[] arr_f2;
        float[] arr_f = this.d;
        Type pathSegment$Type0 = AndroidPathIterator_androidKt.access$toPathSegmentType(this.e.next(arr_f, 0));
        if(pathSegment$Type0 == Type.Done) {
            return PathSegmentKt.getDoneSegment();
        }
        if(pathSegment$Type0 == Type.Close) {
            return PathSegmentKt.getCloseSegment();
        }
        switch(AndroidPathIterator.WhenMappings.$EnumSwitchMapping$1[pathSegment$Type0.ordinal()]) {
            case 1: {
                arr_f2 = new float[]{arr_f[0], arr_f[1]};
                return pathSegment$Type0 == Type.Conic ? new PathSegment(pathSegment$Type0, arr_f2, arr_f[6]) : new PathSegment(pathSegment$Type0, arr_f2, 0.0f);
            }
            case 2: {
                arr_f2 = new float[]{arr_f[0], arr_f[1], arr_f[2], arr_f[3]};
                return pathSegment$Type0 == Type.Conic ? new PathSegment(pathSegment$Type0, arr_f2, arr_f[6]) : new PathSegment(pathSegment$Type0, arr_f2, 0.0f);
            }
            case 3: {
                arr_f2 = new float[]{arr_f[0], arr_f[1], arr_f[2], arr_f[3], arr_f[4], arr_f[5]};
                return pathSegment$Type0 == Type.Conic ? new PathSegment(pathSegment$Type0, arr_f2, arr_f[6]) : new PathSegment(pathSegment$Type0, arr_f2, 0.0f);
            }
            case 4: {
                arr_f2 = new float[]{arr_f[0], arr_f[1], arr_f[2], arr_f[3], arr_f[4], arr_f[5]};
                return pathSegment$Type0 == Type.Conic ? new PathSegment(pathSegment$Type0, arr_f2, arr_f[6]) : new PathSegment(pathSegment$Type0, arr_f2, 0.0f);
            }
            case 5: {
                arr_f2 = new float[]{arr_f[0], arr_f[1], arr_f[2], arr_f[3], arr_f[4], arr_f[5], arr_f[6], arr_f[7]};
                return pathSegment$Type0 == Type.Conic ? new PathSegment(pathSegment$Type0, arr_f2, arr_f[6]) : new PathSegment(pathSegment$Type0, arr_f2, 0.0f);
            }
            default: {
                float[] arr_f1 = new float[0];
                return pathSegment$Type0 == Type.Conic ? new PathSegment(pathSegment$Type0, arr_f1, arr_f[6]) : new PathSegment(pathSegment$Type0, arr_f1, 0.0f);
            }
        }
    }

    @Override
    public final Object next() {
        return this.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

