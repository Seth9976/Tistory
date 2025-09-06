package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\n2\u0006\u0010\u0007\u001A\u00020\u0006H\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\u000BH\u0082 ¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u000E\u001A\u00020\u000BH\u0083 ¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0018\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\nH\u0083 ¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001A\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\u000BH\u0083 ¢\u0006\u0004\b\u001A\u0010\u001BJ\u0018\u0010\u001C\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\u000BH\u0083 ¢\u0006\u0004\b\u001C\u0010\u001BJ\u0018\u0010\u001D\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\u000BH\u0083 ¢\u0006\u0004\b\u001D\u0010\u001BJ\u0017\u0010\u001F\u001A\u00020\n2\u0006\u0010\u001E\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u001F\u0010 J\u000F\u0010!\u001A\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J\u000F\u0010$\u001A\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u001F\u0010&\u001A\u00020#2\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\nH\u0016¢\u0006\u0004\b&\u0010\'J\u000F\u0010(\u001A\u00020\u000FH\u0004¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/graphics/path/PathIteratorPreApi34Impl;", "Landroidx/graphics/path/PathIteratorImpl;", "Landroid/graphics/Path;", "path", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "<init>", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "", "", "createInternalPathIterator", "(Landroid/graphics/Path;IF)J", "internalPathIterator", "", "destroyInternalPathIterator", "(J)V", "", "internalPathIteratorHasNext", "(J)Z", "", "points", "offset", "internalPathIteratorNext", "(J[FI)I", "internalPathIteratorPeek", "(J)I", "internalPathIteratorRawSize", "internalPathIteratorSize", "includeConvertedConics", "calculateSize", "(Z)I", "hasNext", "()Z", "Landroidx/graphics/path/PathSegment$Type;", "peek", "()Landroidx/graphics/path/PathSegment$Type;", "next", "([FI)Landroidx/graphics/path/PathSegment$Type;", "finalize", "()V", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PathIteratorPreApi34Impl extends PathIteratorImpl {
    public final long e;

    public PathIteratorPreApi34Impl(@NotNull Path path0, @NotNull ConicEvaluation pathIterator$ConicEvaluation0, float f) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(pathIterator$ConicEvaluation0, "conicEvaluation");
        super(path0, pathIterator$ConicEvaluation0, f);
        this.e = this.createInternalPathIterator(path0, pathIterator$ConicEvaluation0.ordinal(), f);
    }

    public PathIteratorPreApi34Impl(Path path0, ConicEvaluation pathIterator$ConicEvaluation0, float f, int v, DefaultConstructorMarker defaultConstructorMarker0) {
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
        return !z || this.getConicEvaluation() == ConicEvaluation.AsConic ? this.internalPathIteratorRawSize(this.e) : this.internalPathIteratorSize(this.e);
    }

    private final native long createInternalPathIterator(Path arg1, int arg2, float arg3) {
    }

    private final native void destroyInternalPathIterator(long arg1) {
    }

    @Override
    public final void finalize() {
        this.destroyInternalPathIterator(this.e);
    }

    @Override  // androidx.graphics.path.PathIteratorImpl
    public boolean hasNext() {
        return this.internalPathIteratorHasNext(this.e);
    }

    @FastNative
    private final native boolean internalPathIteratorHasNext(long arg1) {
    }

    @FastNative
    private final native int internalPathIteratorNext(long arg1, float[] arg2, int arg3) {
    }

    @FastNative
    private final native int internalPathIteratorPeek(long arg1) {
    }

    @FastNative
    private final native int internalPathIteratorRawSize(long arg1) {
    }

    @FastNative
    private final native int internalPathIteratorSize(long arg1) {
    }

    @Override  // androidx.graphics.path.PathIteratorImpl
    @NotNull
    public Type next(@NotNull float[] arr_f, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "points");
        Type[] arr_pathSegment$Type = PathIteratorImplKt.a;
        return arr_pathSegment$Type[this.internalPathIteratorNext(this.e, arr_f, v)];
    }

    @Override  // androidx.graphics.path.PathIteratorImpl
    @NotNull
    public Type peek() {
        return PathIteratorImplKt.a[this.internalPathIteratorPeek(this.e)];
    }
}

