package androidx.graphics.path;

import android.graphics.Path;
import android.graphics.PointF;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000E\b \u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\nH&¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\nH&¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0016\u001A\u00020\fH&¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0017\u001A\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"R\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&¨\u0006\'"}, d2 = {"Landroidx/graphics/path/PathIteratorImpl;", "", "Landroid/graphics/Path;", "path", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "<init>", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "", "includeConvertedConics", "", "calculateSize", "(Z)I", "hasNext", "()Z", "Landroidx/graphics/path/PathSegment$Type;", "peek", "()Landroidx/graphics/path/PathSegment$Type;", "", "points", "offset", "next", "([FI)Landroidx/graphics/path/PathSegment$Type;", "Landroidx/graphics/path/PathSegment;", "()Landroidx/graphics/path/PathSegment;", "a", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "b", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "getConicEvaluation", "()Landroidx/graphics/path/PathIterator$ConicEvaluation;", "c", "F", "getTolerance", "()F", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPathIteratorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathIteratorImpl.kt\nandroidx/graphics/path/PathIteratorImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,304:1\n26#2:305\n*S KotlinDebug\n*F\n+ 1 PathIteratorImpl.kt\nandroidx/graphics/path/PathIteratorImpl\n*L\n104#1:305\n*E\n"})
public abstract class PathIteratorImpl {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Type.values().length];
            try {
                arr_v[Type.Move.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Line.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Quadratic.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Conic.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Cubic.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final Path a;
    public final ConicEvaluation b;
    public final float c;
    public final float[] d;

    static {
        System.loadLibrary("androidx.graphics.path");
    }

    public PathIteratorImpl(@NotNull Path path0, @NotNull ConicEvaluation pathIterator$ConicEvaluation0, float f) {
        Intrinsics.checkNotNullParameter(path0, "path");
        Intrinsics.checkNotNullParameter(pathIterator$ConicEvaluation0, "conicEvaluation");
        super();
        this.a = path0;
        this.b = pathIterator$ConicEvaluation0;
        this.c = f;
        this.d = new float[8];
    }

    public PathIteratorImpl(Path path0, ConicEvaluation pathIterator$ConicEvaluation0, float f, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            pathIterator$ConicEvaluation0 = ConicEvaluation.AsQuadratics;
        }
        if((v & 4) != 0) {
            f = 0.25f;
        }
        this(path0, pathIterator$ConicEvaluation0, f);
    }

    public abstract int calculateSize(boolean arg1);

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

    public abstract boolean hasNext();

    @NotNull
    public abstract Type next(@NotNull float[] arg1, int arg2);

    @NotNull
    public final PathSegment next() {
        float[] arr_f = this.d;
        Type pathSegment$Type0 = this.next(arr_f, 0);
        if(pathSegment$Type0 == Type.Done) {
            return PathSegmentUtilities.getDoneSegment();
        }
        if(pathSegment$Type0 == Type.Close) {
            return PathSegmentUtilities.getCloseSegment();
        }
        float f = pathSegment$Type0 == Type.Conic ? arr_f[6] : 0.0f;
        switch(WhenMappings.$EnumSwitchMapping$0[pathSegment$Type0.ordinal()]) {
            case 1: {
                return new PathSegment(pathSegment$Type0, new PointF[]{new PointF(arr_f[0], arr_f[1])}, f);
            }
            case 2: {
                return new PathSegment(pathSegment$Type0, new PointF[]{new PointF(arr_f[0], arr_f[1]), new PointF(arr_f[2], arr_f[3])}, f);
            }
            case 3: 
            case 4: {
                return new PathSegment(pathSegment$Type0, new PointF[]{new PointF(arr_f[0], arr_f[1]), new PointF(arr_f[2], arr_f[3]), new PointF(arr_f[4], arr_f[5])}, f);
            }
            case 5: {
                return new PathSegment(pathSegment$Type0, new PointF[]{new PointF(arr_f[0], arr_f[1]), new PointF(arr_f[2], arr_f[3]), new PointF(arr_f[4], arr_f[5]), new PointF(arr_f[6], arr_f[7])}, f);
            }
            default: {
                return new PathSegment(pathSegment$Type0, new PointF[0], f);
            }
        }
    }

    public static Type next$default(PathIteratorImpl pathIteratorImpl0, float[] arr_f, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        return pathIteratorImpl0.next(arr_f, v);
    }

    @NotNull
    public abstract Type peek();
}

