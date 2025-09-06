package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 ^2\u00020\u0001:\u0002^_J \u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0011H&J \u0010\u0013\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00020\u0011H&J\u0010\u0010\u0016\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH\'J\u001A\u0010\u0016\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0017\u001A\u00020\u0018H&J$\u0010\u0019\u001A\u00020\r2\u0006\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u001B\u001A\u00020\u001CH&\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\r2\u0006\u0010 \u001A\u00020\u000FH\'J\u001A\u0010\u001F\u001A\u00020\r2\u0006\u0010 \u001A\u00020\u000F2\b\b\u0002\u0010\u0017\u001A\u00020\u0018H&J\u0010\u0010!\u001A\u00020\r2\u0006\u0010\"\u001A\u00020#H\'J\u001A\u0010!\u001A\u00020\r2\u0006\u0010\"\u001A\u00020#2\b\b\u0002\u0010\u0017\u001A\u00020\u0018H&J\u0011\u0010$\u001A\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u0000H\u0096\u0004J(\u0010%\u001A\u00020\r2\u0006\u0010 \u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010&\u001A\u00020\tH&J(\u0010\'\u001A\u00020\r2\u0006\u0010 \u001A\u00020\u000F2\u0006\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00020\u00112\u0006\u0010&\u001A\u00020\tH\u0016J\b\u0010(\u001A\u00020\rH&J8\u0010)\u001A\u00020\r2\u0006\u0010*\u001A\u00020\u00112\u0006\u0010+\u001A\u00020\u00112\u0006\u0010,\u001A\u00020\u00112\u0006\u0010-\u001A\u00020\u00112\u0006\u0010.\u001A\u00020\u00112\u0006\u0010/\u001A\u00020\u0011H&J\b\u00100\u001A\u00020\u000FH&J\t\u00101\u001A\u000202H\u0096\u0002J\u001A\u00101\u001A\u0002022\u0006\u00103\u001A\u0002042\b\b\u0002\u00105\u001A\u00020\u0011H\u0016J\u0018\u00106\u001A\u00020\r2\u0006\u00107\u001A\u00020\u00112\u0006\u00108\u001A\u00020\u0011H&J\u0011\u00109\u001A\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u0000H\u0096\u0002J\u0018\u0010:\u001A\u00020\r2\u0006\u00107\u001A\u00020\u00112\u0006\u00108\u001A\u00020\u0011H&J*\u0010;\u001A\u00020\t2\u0006\u0010<\u001A\u00020\u00002\u0006\u0010=\u001A\u00020\u00002\u0006\u0010>\u001A\u00020?H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001A\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u0000H\u0096\u0004J\u0011\u0010C\u001A\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u0000H\u0096\u0002J(\u0010D\u001A\u00020\r2\u0006\u0010*\u001A\u00020\u00112\u0006\u0010+\u001A\u00020\u00112\u0006\u0010,\u001A\u00020\u00112\u0006\u0010-\u001A\u00020\u0011H\'J(\u0010E\u001A\u00020\r2\u0006\u0010*\u001A\u00020\u00112\u0006\u0010+\u001A\u00020\u00112\u0006\u0010,\u001A\u00020\u00112\u0006\u0010-\u001A\u00020\u0011H\u0016J8\u0010F\u001A\u00020\r2\u0006\u0010G\u001A\u00020\u00112\u0006\u0010H\u001A\u00020\u00112\u0006\u0010I\u001A\u00020\u00112\u0006\u0010J\u001A\u00020\u00112\u0006\u0010K\u001A\u00020\u00112\u0006\u0010L\u001A\u00020\u0011H&J\u0018\u0010M\u001A\u00020\r2\u0006\u0010N\u001A\u00020\u00112\u0006\u0010O\u001A\u00020\u0011H&J\u0018\u0010P\u001A\u00020\r2\u0006\u0010N\u001A\u00020\u00112\u0006\u0010O\u001A\u00020\u0011H&J(\u0010Q\u001A\u00020\r2\u0006\u0010G\u001A\u00020\u00112\u0006\u0010H\u001A\u00020\u00112\u0006\u0010I\u001A\u00020\u00112\u0006\u0010J\u001A\u00020\u0011H\'J(\u0010R\u001A\u00020\r2\u0006\u0010G\u001A\u00020\u00112\u0006\u0010H\u001A\u00020\u00112\u0006\u0010I\u001A\u00020\u00112\u0006\u0010J\u001A\u00020\u0011H\u0016J\b\u0010S\u001A\u00020\rH&J\b\u0010T\u001A\u00020\rH\u0016J\u001A\u0010U\u001A\u00020\r2\u0006\u0010V\u001A\u00020WH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bX\u0010YJ\u001A\u0010Z\u001A\u00020\r2\u0006\u0010\u001B\u001A\u00020\u001CH&\u00F8\u0001\u0000\u00A2\u0006\u0004\b[\u0010\\J\u0011\u0010]\u001A\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u0000H\u0096\u0004R\u001E\u0010\u0002\u001A\u00020\u0003X\u00A6\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\nR\u0012\u0010\u000B\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000B\u0010\n\u00F8\u0001\u0002\u0082\u0002\u0011\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001\u00A8\u0006`\u00C0\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "fillType", "Landroidx/compose/ui/graphics/PathFillType;", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "isConvex", "", "()Z", "isEmpty", "addArc", "", "oval", "Landroidx/compose/ui/geometry/Rect;", "startAngleDegrees", "", "sweepAngleDegrees", "addArcRad", "startAngleRadians", "sweepAngleRadians", "addOval", "direction", "Landroidx/compose/ui/graphics/Path$Direction;", "addPath", "path", "offset", "Landroidx/compose/ui/geometry/Offset;", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addRect", "rect", "addRoundRect", "roundRect", "Landroidx/compose/ui/geometry/RoundRect;", "and", "arcTo", "forceMoveTo", "arcToRad", "close", "cubicTo", "x1", "y1", "x2", "y2", "x3", "y3", "getBounds", "iterator", "Landroidx/compose/ui/graphics/PathIterator;", "conicEvaluation", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "tolerance", "lineTo", "x", "y", "minus", "moveTo", "op", "path1", "path2", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "or", "plus", "quadraticBezierTo", "quadraticTo", "relativeCubicTo", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "relativeLineTo", "dx", "dy", "relativeMoveTo", "relativeQuadraticBezierTo", "relativeQuadraticTo", "reset", "rewind", "transform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "translate", "translate-k-4lQ0M", "(J)V", "xor", "Companion", "Direction", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Path {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J(\u0010\t\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "Landroidx/compose/ui/graphics/PathOperation;", "operation", "Landroidx/compose/ui/graphics/Path;", "path1", "path2", "combine-xh6zSI8", "(ILandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "combine", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public static final Companion a;

        static {
            Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        @NotNull
        public final Path combine-xh6zSI8(int v, @NotNull Path path0, @NotNull Path path1) {
            Path path2 = AndroidPath_androidKt.Path();
            if(!path2.op-N5in7k0(path0, path1, v)) {
                throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
            }
            return path2;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void addOval$default(Path path0, Rect rect0, Direction path$Direction0, int v, Object object0) {
            Path.addOval$default(path0, rect0, path$Direction0, v, object0);
        }

        public static void addPath-Uv8p0NA$default(Path path0, Path path1, long v, int v1, Object object0) {
            Path.addPath-Uv8p0NA$default(path0, path1, v, v1, object0);
        }

        public static void addRect$default(Path path0, Rect rect0, Direction path$Direction0, int v, Object object0) {
            Path.addRect$default(path0, rect0, path$Direction0, v, object0);
        }

        public static void addRoundRect$default(Path path0, RoundRect roundRect0, Direction path$Direction0, int v, Object object0) {
            Path.addRoundRect$default(path0, roundRect0, path$Direction0, v, object0);
        }

        @Deprecated
        @NotNull
        public static Path and(@NotNull Path path0, @NotNull Path path1) {
            return path0.super.and(path1);
        }

        @Deprecated
        public static void arcToRad(@NotNull Path path0, @NotNull Rect rect0, float f, float f1, boolean z) {
            path0.super.arcToRad(rect0, f, f1, z);
        }

        @Deprecated
        @NotNull
        public static PathIterator iterator(@NotNull Path path0) {
            return path0.super.iterator();
        }

        @Deprecated
        @NotNull
        public static PathIterator iterator(@NotNull Path path0, @NotNull ConicEvaluation pathIterator$ConicEvaluation0, float f) {
            return path0.super.iterator(pathIterator$ConicEvaluation0, f);
        }

        public static PathIterator iterator$default(Path path0, ConicEvaluation pathIterator$ConicEvaluation0, float f, int v, Object object0) {
            return Path.iterator$default(path0, pathIterator$ConicEvaluation0, f, v, object0);
        }

        @Deprecated
        @NotNull
        public static Path minus(@NotNull Path path0, @NotNull Path path1) {
            return path0.super.minus(path1);
        }

        @Deprecated
        @NotNull
        public static Path or(@NotNull Path path0, @NotNull Path path1) {
            return path0.super.or(path1);
        }

        @Deprecated
        @NotNull
        public static Path plus(@NotNull Path path0, @NotNull Path path1) {
            return path0.super.plus(path1);
        }

        @Deprecated
        public static void quadraticTo(@NotNull Path path0, float f, float f1, float f2, float f3) {
            path0.super.quadraticTo(f, f1, f2, f3);
        }

        @Deprecated
        public static void relativeQuadraticTo(@NotNull Path path0, float f, float f1, float f2, float f3) {
            path0.super.relativeQuadraticTo(f, f1, f2, f3);
        }

        @Deprecated
        public static void rewind(@NotNull Path path0) {
            path0.super.rewind();
        }

        @Deprecated
        public static void transform-58bKbWc(@NotNull Path path0, @NotNull float[] arr_f) {
            path0.super.transform-58bKbWc(arr_f);
        }

        @Deprecated
        @NotNull
        public static Path xor(@NotNull Path path0, @NotNull Path path1) {
            return path0.super.xor(path1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/Path$Direction;", "", "CounterClockwise", "Clockwise", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum Direction {
        CounterClockwise,
        Clockwise;

    }

    @NotNull
    public static final Companion Companion;

    static {
        Path.Companion = Companion.a;
    }

    void addArc(@NotNull Rect arg1, float arg2, float arg3);

    void addArcRad(@NotNull Rect arg1, float arg2, float arg3);

    @kotlin.Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addOval() with a winding direction", replaceWith = @ReplaceWith(expression = "addOval(oval)", imports = {}))
    void addOval(Rect arg1);

    void addOval(@NotNull Rect arg1, @NotNull Direction arg2);

    static void addOval$default(Path path0, Rect rect0, Direction path$Direction0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
        }
        if((v & 2) != 0) {
            path$Direction0 = Direction.CounterClockwise;
        }
        path0.addOval(rect0, path$Direction0);
    }

    void addPath-Uv8p0NA(@NotNull Path arg1, long arg2);

    static void addPath-Uv8p0NA$default(Path path0, Path path1, long v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if((v1 & 2) != 0) {
            v = 0L;
        }
        path0.addPath-Uv8p0NA(path1, v);
    }

    @kotlin.Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addRect() with a winding direction", replaceWith = @ReplaceWith(expression = "addRect(rect)", imports = {}))
    void addRect(Rect arg1);

    void addRect(@NotNull Rect arg1, @NotNull Direction arg2);

    static void addRect$default(Path path0, Rect rect0, Direction path$Direction0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if((v & 2) != 0) {
            path$Direction0 = Direction.CounterClockwise;
        }
        path0.addRect(rect0, path$Direction0);
    }

    @kotlin.Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of addRoundRect() with a winding direction", replaceWith = @ReplaceWith(expression = "addRoundRect(roundRect)", imports = {}))
    void addRoundRect(RoundRect arg1);

    void addRoundRect(@NotNull RoundRect arg1, @NotNull Direction arg2);

    static void addRoundRect$default(Path path0, RoundRect roundRect0, Direction path$Direction0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if((v & 2) != 0) {
            path$Direction0 = Direction.CounterClockwise;
        }
        path0.addRoundRect(roundRect0, path$Direction0);
    }

    @NotNull
    default Path and(@NotNull Path path0) {
        Path path1 = AndroidPath_androidKt.Path();
        path1.op-N5in7k0(this, path0, 1);
        return path1;
    }

    void arcTo(@NotNull Rect arg1, float arg2, float arg3, boolean arg4);

    default void arcToRad(@NotNull Rect rect0, float f, float f1, boolean z) {
        this.arcTo(rect0, f * 57.29578f, f1 * 57.29578f, z);
    }

    void close();

    void cubicTo(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6);

    @NotNull
    Rect getBounds();

    int getFillType-Rg-k1Os();

    boolean isConvex();

    boolean isEmpty();

    @NotNull
    default PathIterator iterator() {
        return AndroidPathIterator_androidKt.PathIterator$default(this, null, 0.0f, 6, null);
    }

    @NotNull
    default PathIterator iterator(@NotNull ConicEvaluation pathIterator$ConicEvaluation0, float f) {
        return AndroidPathIterator_androidKt.PathIterator(this, pathIterator$ConicEvaluation0, f);
    }

    static PathIterator iterator$default(Path path0, ConicEvaluation pathIterator$ConicEvaluation0, float f, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: iterator");
        }
        if((v & 2) != 0) {
            f = 0.25f;
        }
        return path0.iterator(pathIterator$ConicEvaluation0, f);
    }

    void lineTo(float arg1, float arg2);

    @NotNull
    default Path minus(@NotNull Path path0) {
        Path path1 = AndroidPath_androidKt.Path();
        path1.op-N5in7k0(this, path0, 0);
        return path1;
    }

    void moveTo(float arg1, float arg2);

    boolean op-N5in7k0(@NotNull Path arg1, @NotNull Path arg2, int arg3);

    @NotNull
    default Path or(@NotNull Path path0) {
        return this.plus(path0);
    }

    @NotNull
    default Path plus(@NotNull Path path0) {
        Path path1 = AndroidPath_androidKt.Path();
        path1.op-N5in7k0(this, path0, 2);
        return path1;
    }

    @kotlin.Deprecated(level = DeprecationLevel.WARNING, message = "Use quadraticTo() for consistency with cubicTo()", replaceWith = @ReplaceWith(expression = "quadraticTo(x1, y1, x2, y2)", imports = {}))
    void quadraticBezierTo(float arg1, float arg2, float arg3, float arg4);

    default void quadraticTo(float f, float f1, float f2, float f3) {
        this.quadraticBezierTo(f, f1, f2, f3);
    }

    void relativeCubicTo(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6);

    void relativeLineTo(float arg1, float arg2);

    void relativeMoveTo(float arg1, float arg2);

    @kotlin.Deprecated(level = DeprecationLevel.WARNING, message = "Use relativeQuadraticTo() for consistency with relativeCubicTo()", replaceWith = @ReplaceWith(expression = "relativeQuadraticTo(dx1, dy1, dx2, dy2)", imports = {}))
    void relativeQuadraticBezierTo(float arg1, float arg2, float arg3, float arg4);

    default void relativeQuadraticTo(float f, float f1, float f2, float f3) {
        this.relativeQuadraticBezierTo(f, f1, f2, f3);
    }

    void reset();

    default void rewind() {
        this.reset();
    }

    void setFillType-oQ8Xj4U(int arg1);

    default void transform-58bKbWc(@NotNull float[] arr_f) {
    }

    void translate-k-4lQ0M(long arg1);

    @NotNull
    default Path xor(@NotNull Path path0) {
        Path path1 = AndroidPath_androidKt.Path();
        path1.op-N5in7k0(this, path0, 3);
        return path1;
    }
}

