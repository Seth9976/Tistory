package androidx.graphics.path;

import android.graphics.Path;
import android.graphics.PathIterator;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(34)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001F\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/graphics/path/PathIteratorApi34Impl;", "Landroidx/graphics/path/PathIteratorImpl;", "Landroid/graphics/Path;", "path", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "<init>", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "", "includeConvertedConics", "", "calculateSize", "(Z)I", "", "points", "offset", "Landroidx/graphics/path/PathSegment$Type;", "next", "([FI)Landroidx/graphics/path/PathSegment$Type;", "hasNext", "()Z", "peek", "()Landroidx/graphics/path/PathSegment$Type;", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PathIteratorApi34Impl extends PathIteratorImpl {
    public final PathIterator e;
    public final ConicConverter f;

    public PathIteratorApi34Impl(@NotNull Path path0, @NotNull ConicEvaluation pathIterator$ConicEvaluation0, float f) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(pathIterator$ConicEvaluation0, "conicEvaluation");
        super(path0, pathIterator$ConicEvaluation0, f);
        PathIterator pathIterator0 = path0.getPathIterator();
        Intrinsics.checkNotNullExpressionValue(pathIterator0, "path.pathIterator");
        this.e = pathIterator0;
        this.f = new ConicConverter();
    }

    public PathIteratorApi34Impl(Path path0, ConicEvaluation pathIterator$ConicEvaluation0, float f, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            pathIterator$ConicEvaluation0 = ConicEvaluation.AsQuadratics;
        }
        if((v & 4) != 0) {
            f = 0.25f;
        }
        this(path0, pathIterator$ConicEvaluation0, f);
    }

    @Override  // androidx.graphics.path.PathIteratorImpl
    public int calculateSize(boolean z) {
        boolean z1 = z && this.getConicEvaluation() == ConicEvaluation.AsQuadratics;
        PathIterator pathIterator0 = this.getPath().getPathIterator();
        Intrinsics.checkNotNullExpressionValue(pathIterator0, "path.pathIterator");
        float[] arr_f = new float[8];
        int v = 0;
        while(pathIterator0.hasNext()) {
            if(pathIterator0.next(arr_f, 0) == 3 && z1) {
                ConicConverter.convert$default(this.f, arr_f, arr_f[6], this.getTolerance(), 0, 8, null);
                v += this.f.getQuadraticCount();
            }
            else {
                ++v;
            }
        }
        return v;
    }

    @Override  // androidx.graphics.path.PathIteratorImpl
    public boolean hasNext() {
        return this.e.hasNext();
    }

    @Override  // androidx.graphics.path.PathIteratorImpl
    @NotNull
    public Type next(@NotNull float[] arr_f, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "points");
        ConicConverter conicConverter0 = this.f;
        if(conicConverter0.getCurrentQuadratic() < conicConverter0.getQuadraticCount()) {
            conicConverter0.nextQuadratic(arr_f, v);
            return Type.Quadratic;
        }
        Type pathSegment$Type0 = PathIteratorImplKt.access$platformToAndroidXSegmentType(this.e.next(arr_f, v));
        if(pathSegment$Type0 == Type.Conic && this.getConicEvaluation() == ConicEvaluation.AsQuadratics) {
            conicConverter0.convert(arr_f, arr_f[v + 6], this.getTolerance(), v);
            if(conicConverter0.getQuadraticCount() > 0) {
                conicConverter0.nextQuadratic(arr_f, v);
            }
            return Type.Quadratic;
        }
        return pathSegment$Type0;
    }

    @Override  // androidx.graphics.path.PathIteratorImpl
    @NotNull
    public Type peek() {
        return PathIteratorImplKt.access$platformToAndroidXSegmentType(this.e.peek());
    }
}

