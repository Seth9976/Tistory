package androidx.graphics.path;

import android.graphics.Path;
import android.os.Build.VERSION;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\'B#\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\u000E\u0010\u000FJ\u0010\u0010\u0010\u001A\u00020\u000BH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001A\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u00152\b\b\u0002\u0010\u0017\u001A\u00020\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0018\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u001AR\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/graphics/path/PathIterator;", "", "Landroidx/graphics/path/PathSegment;", "Landroid/graphics/Path;", "path", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "<init>", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "", "includeConvertedConics", "", "calculateSize", "(Z)I", "hasNext", "()Z", "Landroidx/graphics/path/PathSegment$Type;", "peek", "()Landroidx/graphics/path/PathSegment$Type;", "", "points", "offset", "next", "([FI)Landroidx/graphics/path/PathSegment$Type;", "()Landroidx/graphics/path/PathSegment;", "a", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "b", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "getConicEvaluation", "()Landroidx/graphics/path/PathIterator$ConicEvaluation;", "c", "F", "getTolerance", "()F", "ConicEvaluation", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PathIterator implements Iterator, KMappedMarker {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/graphics/path/PathIterator$ConicEvaluation;", "", "AsConic", "AsQuadratics", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum ConicEvaluation {
        AsConic,
        AsQuadratics;

    }

    public final Path a;
    public final ConicEvaluation b;
    public final float c;
    public final PathIteratorImpl d;

    public PathIterator(@NotNull Path path0, @NotNull ConicEvaluation pathIterator$ConicEvaluation0, float f) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(pathIterator$ConicEvaluation0, "conicEvaluation");
        super();
        this.a = path0;
        this.b = pathIterator$ConicEvaluation0;
        this.c = f;
        PathIteratorApi34Impl pathIteratorApi34Impl0 = Build.VERSION.SDK_INT >= 34 ? new PathIteratorApi34Impl(path0, pathIterator$ConicEvaluation0, f) : new PathIteratorPreApi34Impl(path0, pathIterator$ConicEvaluation0, f);
        this.d = pathIteratorApi34Impl0;
    }

    public PathIterator(Path path0, ConicEvaluation pathIterator$ConicEvaluation0, float f, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            pathIterator$ConicEvaluation0 = ConicEvaluation.AsQuadratics;
        }
        if((v & 4) != 0) {
            f = 0.25f;
        }
        this(path0, pathIterator$ConicEvaluation0, f);
    }

    public final int calculateSize(boolean z) {
        return this.d.calculateSize(z);
    }

    public static int calculateSize$default(PathIterator pathIterator0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        return pathIterator0.calculateSize(z);
    }

    @NotNull
    public final ConicEvaluation getConicEvaluation() {
        return this.b;
    }

    @NotNull
    public final Path getPath() {
        return this.a;
    }

    public final float getTolerance() {
        return this.c;
    }

    @Override
    public boolean hasNext() {
        return this.d.hasNext();
    }

    @JvmOverloads
    @NotNull
    public final Type next(@NotNull float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "points");
        return PathIterator.next$default(this, arr_f, 0, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final Type next(@NotNull float[] arr_f, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "points");
        return this.d.next(arr_f, v);
    }

    @NotNull
    public PathSegment next() {
        return this.d.next();
    }

    @Override
    public Object next() {
        return this.next();
    }

    public static Type next$default(PathIterator pathIterator0, float[] arr_f, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return pathIterator0.next(arr_f, v);
    }

    @NotNull
    public final Type peek() {
        return this.d.peek();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

