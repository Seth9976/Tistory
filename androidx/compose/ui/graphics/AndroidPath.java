package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Path.Op;
import android.graphics.RectF;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000B\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\n\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\n\u0010\u000BJ\u001F\u0010\u000E\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000BJ\u001F\u0010\u000F\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u000F\u0010\u000BJ\u001F\u0010\u0010\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0010\u0010\u000BJ/\u0010\u0015\u001A\u00020\t2\u0006\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0014\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001A\u00020\t2\u0006\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0014\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0016J/\u0010\u001C\u001A\u00020\t2\u0006\u0010\u0018\u001A\u00020\u00062\u0006\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u001A\u001A\u00020\u00062\u0006\u0010\u001B\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u0016J/\u0010\u001D\u001A\u00020\t2\u0006\u0010\u0018\u001A\u00020\u00062\u0006\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u001A\u001A\u00020\u00062\u0006\u0010\u001B\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u0016J?\u0010 \u001A\u00020\t2\u0006\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0014\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u00062\u0006\u0010\u001F\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b \u0010!J?\u0010$\u001A\u00020\t2\u0006\u0010\u0018\u001A\u00020\u00062\u0006\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u001A\u001A\u00020\u00062\u0006\u0010\u001B\u001A\u00020\u00062\u0006\u0010\"\u001A\u00020\u00062\u0006\u0010#\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b$\u0010!J/\u0010+\u001A\u00020\t2\u0006\u0010&\u001A\u00020%2\u0006\u0010\'\u001A\u00020\u00062\u0006\u0010(\u001A\u00020\u00062\u0006\u0010*\u001A\u00020)H\u0016\u00A2\u0006\u0004\b+\u0010,J\u0017\u0010-\u001A\u00020\t2\u0006\u0010&\u001A\u00020%H\u0016\u00A2\u0006\u0004\b-\u0010.J\u001F\u0010-\u001A\u00020\t2\u0006\u0010&\u001A\u00020%2\u0006\u00100\u001A\u00020/H\u0016\u00A2\u0006\u0004\b-\u00101J\u0017\u00103\u001A\u00020\t2\u0006\u00102\u001A\u00020%H\u0016\u00A2\u0006\u0004\b3\u0010.J\u001F\u00103\u001A\u00020\t2\u0006\u00102\u001A\u00020%2\u0006\u00100\u001A\u00020/H\u0016\u00A2\u0006\u0004\b3\u00101J\u0017\u00106\u001A\u00020\t2\u0006\u00105\u001A\u000204H\u0016\u00A2\u0006\u0004\b6\u00107J\u001F\u00106\u001A\u00020\t2\u0006\u00105\u001A\u0002042\u0006\u00100\u001A\u00020/H\u0016\u00A2\u0006\u0004\b6\u00108J\'\u0010;\u001A\u00020\t2\u0006\u00102\u001A\u00020%2\u0006\u00109\u001A\u00020\u00062\u0006\u0010:\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b;\u0010<J\'\u0010=\u001A\u00020\t2\u0006\u00102\u001A\u00020%2\u0006\u0010\'\u001A\u00020\u00062\u0006\u0010(\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b=\u0010<J\"\u0010C\u001A\u00020\t2\u0006\u0010>\u001A\u00020\u00012\u0006\u0010@\u001A\u00020?H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bA\u0010BJ\u000F\u0010D\u001A\u00020\tH\u0016\u00A2\u0006\u0004\bD\u0010EJ\u000F\u0010F\u001A\u00020\tH\u0016\u00A2\u0006\u0004\bF\u0010EJ\u000F\u0010G\u001A\u00020\tH\u0016\u00A2\u0006\u0004\bG\u0010EJ\u001A\u0010J\u001A\u00020\t2\u0006\u0010@\u001A\u00020?H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bH\u0010IJ\u001A\u0010O\u001A\u00020\t2\u0006\u0010L\u001A\u00020KH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bM\u0010NJ\u000F\u0010P\u001A\u00020%H\u0016\u00A2\u0006\u0004\bP\u0010QJ*\u0010X\u001A\u00020)2\u0006\u0010R\u001A\u00020\u00012\u0006\u0010S\u001A\u00020\u00012\u0006\u0010U\u001A\u00020TH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bV\u0010WR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bY\u0010Z\u001A\u0004\b[\u0010\\R*\u0010c\u001A\u00020]2\u0006\u0010^\u001A\u00020]8V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\u001A\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001A\u0010d\u001A\u00020)8VX\u0096\u0004\u00A2\u0006\f\u0012\u0004\bf\u0010E\u001A\u0004\bd\u0010eR\u0014\u0010g\u001A\u00020)8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bg\u0010e\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006h"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPath;", "Landroidx/compose/ui/graphics/Path;", "Landroid/graphics/Path;", "internalPath", "<init>", "(Landroid/graphics/Path;)V", "", "x", "y", "", "moveTo", "(FF)V", "dx", "dy", "relativeMoveTo", "lineTo", "relativeLineTo", "x1", "y1", "x2", "y2", "quadraticBezierTo", "(FFFF)V", "quadraticTo", "dx1", "dy1", "dx2", "dy2", "relativeQuadraticBezierTo", "relativeQuadraticTo", "x3", "y3", "cubicTo", "(FFFFFF)V", "dx3", "dy3", "relativeCubicTo", "Landroidx/compose/ui/geometry/Rect;", "rect", "startAngleDegrees", "sweepAngleDegrees", "", "forceMoveTo", "arcTo", "(Landroidx/compose/ui/geometry/Rect;FFZ)V", "addRect", "(Landroidx/compose/ui/geometry/Rect;)V", "Landroidx/compose/ui/graphics/Path$Direction;", "direction", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/graphics/Path$Direction;)V", "oval", "addOval", "Landroidx/compose/ui/geometry/RoundRect;", "roundRect", "addRoundRect", "(Landroidx/compose/ui/geometry/RoundRect;)V", "(Landroidx/compose/ui/geometry/RoundRect;Landroidx/compose/ui/graphics/Path$Direction;)V", "startAngleRadians", "sweepAngleRadians", "addArcRad", "(Landroidx/compose/ui/geometry/Rect;FF)V", "addArc", "path", "Landroidx/compose/ui/geometry/Offset;", "offset", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addPath", "close", "()V", "reset", "rewind", "translate-k-4lQ0M", "(J)V", "translate", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "getBounds", "()Landroidx/compose/ui/geometry/Rect;", "path1", "path2", "Landroidx/compose/ui/graphics/PathOperation;", "operation", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "op", "a", "Landroid/graphics/Path;", "getInternalPath", "()Landroid/graphics/Path;", "Landroidx/compose/ui/graphics/PathFillType;", "value", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "fillType", "isConvex", "()Z", "isConvex$annotations", "isEmpty", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidPath.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,286:1\n38#2,5:287\n38#2,5:292\n*S KotlinDebug\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n*L\n205#1:287,5\n258#1:292,5\n*E\n"})
public final class AndroidPath implements Path {
    public final android.graphics.Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public AndroidPath() {
        this(null, 1, null);
    }

    public AndroidPath(@NotNull android.graphics.Path path0) {
        this.a = path0;
    }

    public AndroidPath(android.graphics.Path path0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            path0 = new android.graphics.Path();
        }
        this(path0);
    }

    public static void a(Rect rect0) {
        if(Float.isNaN(rect0.getLeft()) || Float.isNaN(rect0.getTop()) || Float.isNaN(rect0.getRight()) || Float.isNaN(rect0.getBottom())) {
            AndroidPath_androidKt.throwIllegalStateException("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addArc(@NotNull Rect rect0, float f, float f1) {
        AndroidPath.a(rect0);
        if(this.b == null) {
            this.b = new RectF();
        }
        RectF rectF0 = this.b;
        Intrinsics.checkNotNull(rectF0);
        rectF0.set(rect0.getLeft(), rect0.getTop(), rect0.getRight(), rect0.getBottom());
        RectF rectF1 = this.b;
        Intrinsics.checkNotNull(rectF1);
        this.a.addArc(rectF1, f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addArcRad(@NotNull Rect rect0, float f, float f1) {
        this.addArc(rect0, f * 57.29578f, f1 * 57.29578f);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addOval(Rect rect0) {
        this.addOval(rect0, Direction.CounterClockwise);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addOval(@NotNull Rect rect0, @NotNull Direction path$Direction0) {
        if(this.b == null) {
            this.b = new RectF();
        }
        RectF rectF0 = this.b;
        Intrinsics.checkNotNull(rectF0);
        rectF0.set(rect0.getLeft(), rect0.getTop(), rect0.getRight(), rect0.getBottom());
        RectF rectF1 = this.b;
        Intrinsics.checkNotNull(rectF1);
        Path.Direction path$Direction1 = AndroidPath_androidKt.access$toPlatformPathDirection(path$Direction0);
        this.a.addOval(rectF1, path$Direction1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addPath-Uv8p0NA(@NotNull Path path0, long v) {
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path1 = ((AndroidPath)path0).getInternalPath();
        this.a.addPath(path1, Offset.getX-impl(v), Offset.getY-impl(v));
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addRect(Rect rect0) {
        this.addRect(rect0, Direction.CounterClockwise);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addRect(@NotNull Rect rect0, @NotNull Direction path$Direction0) {
        AndroidPath.a(rect0);
        if(this.b == null) {
            this.b = new RectF();
        }
        RectF rectF0 = this.b;
        Intrinsics.checkNotNull(rectF0);
        rectF0.set(rect0.getLeft(), rect0.getTop(), rect0.getRight(), rect0.getBottom());
        RectF rectF1 = this.b;
        Intrinsics.checkNotNull(rectF1);
        Path.Direction path$Direction1 = AndroidPath_androidKt.access$toPlatformPathDirection(path$Direction0);
        this.a.addRect(rectF1, path$Direction1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addRoundRect(RoundRect roundRect0) {
        this.addRoundRect(roundRect0, Direction.CounterClockwise);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addRoundRect(@NotNull RoundRect roundRect0, @NotNull Direction path$Direction0) {
        if(this.b == null) {
            this.b = new RectF();
        }
        RectF rectF0 = this.b;
        Intrinsics.checkNotNull(rectF0);
        rectF0.set(roundRect0.getLeft(), roundRect0.getTop(), roundRect0.getRight(), roundRect0.getBottom());
        if(this.c == null) {
            this.c = new float[8];
        }
        float[] arr_f = this.c;
        Intrinsics.checkNotNull(arr_f);
        arr_f[0] = CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs());
        arr_f[1] = CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs());
        arr_f[2] = CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs());
        arr_f[3] = CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs());
        arr_f[4] = CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs());
        arr_f[5] = CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs());
        arr_f[6] = CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs());
        arr_f[7] = CornerRadius.getY-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs());
        RectF rectF1 = this.b;
        Intrinsics.checkNotNull(rectF1);
        float[] arr_f1 = this.c;
        Intrinsics.checkNotNull(arr_f1);
        Path.Direction path$Direction1 = AndroidPath_androidKt.access$toPlatformPathDirection(path$Direction0);
        this.a.addRoundRect(rectF1, arr_f1, path$Direction1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void arcTo(@NotNull Rect rect0, float f, float f1, boolean z) {
        float f2 = rect0.getLeft();
        float f3 = rect0.getTop();
        float f4 = rect0.getRight();
        float f5 = rect0.getBottom();
        if(this.b == null) {
            this.b = new RectF();
        }
        RectF rectF0 = this.b;
        Intrinsics.checkNotNull(rectF0);
        rectF0.set(f2, f3, f4, f5);
        RectF rectF1 = this.b;
        Intrinsics.checkNotNull(rectF1);
        this.a.arcTo(rectF1, f, f1, z);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void close() {
        this.a.close();
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void cubicTo(float f, float f1, float f2, float f3, float f4, float f5) {
        this.a.cubicTo(f, f1, f2, f3, f4, f5);
    }

    @Override  // androidx.compose.ui.graphics.Path
    @NotNull
    public Rect getBounds() {
        if(this.b == null) {
            this.b = new RectF();
        }
        RectF rectF0 = this.b;
        Intrinsics.checkNotNull(rectF0);
        this.a.computeBounds(rectF0, true);
        return new Rect(rectF0.left, rectF0.top, rectF0.right, rectF0.bottom);
    }

    // 去混淆评级： 中等(50)
    @Override  // androidx.compose.ui.graphics.Path
    public int getFillType-Rg-k1Os() {
        return this.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @NotNull
    public final android.graphics.Path getInternalPath() {
        return this.a;
    }

    @Override  // androidx.compose.ui.graphics.Path
    public boolean isConvex() {
        return this.a.isConvex();
    }

    public static void isConvex$annotations() {
    }

    @Override  // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void lineTo(float f, float f1) {
        this.a.lineTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void moveTo(float f, float f1) {
        this.a.moveTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public boolean op-N5in7k0(@NotNull Path path0, @NotNull Path path1, int v) {
        Path.Op path$Op0;
        if(PathOperation.equals-impl0(v, 0)) {
            path$Op0 = Path.Op.DIFFERENCE;
        }
        else if(PathOperation.equals-impl0(v, 1)) {
            path$Op0 = Path.Op.INTERSECT;
        }
        else if(PathOperation.equals-impl0(v, 4)) {
            path$Op0 = Path.Op.REVERSE_DIFFERENCE;
        }
        else {
            path$Op0 = PathOperation.equals-impl0(v, 2) ? Path.Op.UNION : Path.Op.XOR;
        }
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path2 = ((AndroidPath)path0).getInternalPath();
        if(!(path1 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path3 = ((AndroidPath)path1).getInternalPath();
        return this.a.op(path2, path3, path$Op0);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void quadraticBezierTo(float f, float f1, float f2, float f3) {
        this.a.quadTo(f, f1, f2, f3);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void quadraticTo(float f, float f1, float f2, float f3) {
        this.a.quadTo(f, f1, f2, f3);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void relativeCubicTo(float f, float f1, float f2, float f3, float f4, float f5) {
        this.a.rCubicTo(f, f1, f2, f3, f4, f5);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void relativeLineTo(float f, float f1) {
        this.a.rLineTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void relativeMoveTo(float f, float f1) {
        this.a.rMoveTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void relativeQuadraticBezierTo(float f, float f1, float f2, float f3) {
        this.a.rQuadTo(f, f1, f2, f3);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void relativeQuadraticTo(float f, float f1, float f2, float f3) {
        this.a.rQuadTo(f, f1, f2, f3);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void reset() {
        this.a.reset();
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void rewind() {
        this.a.rewind();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.graphics.Path
    public void setFillType-oQ8Xj4U(int v) {
        this.a.setFillType((PathFillType.equals-impl0(v, 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING));
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void transform-58bKbWc(@NotNull float[] arr_f) {
        if(this.d == null) {
            this.d = new Matrix();
        }
        Matrix matrix0 = this.d;
        Intrinsics.checkNotNull(matrix0);
        AndroidMatrixConversions_androidKt.setFrom-EL8BTi8(matrix0, arr_f);
        Matrix matrix1 = this.d;
        Intrinsics.checkNotNull(matrix1);
        this.a.transform(matrix1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void translate-k-4lQ0M(long v) {
        Matrix matrix0 = this.d;
        if(matrix0 == null) {
            this.d = new Matrix();
        }
        else {
            Intrinsics.checkNotNull(matrix0);
            matrix0.reset();
        }
        Matrix matrix1 = this.d;
        Intrinsics.checkNotNull(matrix1);
        matrix1.setTranslate(Offset.getX-impl(v), Offset.getY-impl(v));
        Matrix matrix2 = this.d;
        Intrinsics.checkNotNull(matrix2);
        this.a.transform(matrix2);
    }
}

