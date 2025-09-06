package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\u0006\u001A\u00020\u0007H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\r\u0010\u000EJ<\u0010\n\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00102\b\b\u0002\u0010\u0006\u001A\u00020\u0007H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0016\u001A\u00020\u00032\u0006\u0010\u0017\u001A\u00020\u0018H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\b\u0010\u001B\u001A\u00020\u0003H&J0\u0010\u001C\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\u001D\u001A\u00020\u00102\u0006\u0010\u001E\u001A\u00020\u00102\u0006\u0010\u001F\u001A\u00020 2\u0006\u0010!\u001A\u00020\"H\u0016JH\u0010\u001C\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u001D\u001A\u00020\u00102\u0006\u0010\u001E\u001A\u00020\u00102\u0006\u0010\u001F\u001A\u00020 2\u0006\u0010!\u001A\u00020\"H&J0\u0010#\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010$\u001A\u00020\u00102\u0006\u0010%\u001A\u00020\u00102\u0006\u0010\u001F\u001A\u00020 2\u0006\u0010!\u001A\u00020\"H\u0016J*\u0010&\u001A\u00020\u00032\u0006\u0010\'\u001A\u00020(2\u0006\u0010)\u001A\u00020\u00102\u0006\u0010!\u001A\u00020\"H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+J*\u0010,\u001A\u00020\u00032\u0006\u0010-\u001A\u00020.2\u0006\u0010/\u001A\u00020(2\u0006\u0010!\u001A\u00020\"H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b0\u00101JJ\u00102\u001A\u00020\u00032\u0006\u0010-\u001A\u00020.2\b\b\u0002\u00103\u001A\u0002042\b\b\u0002\u00105\u001A\u0002062\b\b\u0002\u00107\u001A\u0002042\b\b\u0002\u00108\u001A\u0002062\u0006\u0010!\u001A\u00020\"H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b9\u0010:J*\u0010;\u001A\u00020\u00032\u0006\u0010<\u001A\u00020(2\u0006\u0010=\u001A\u00020(2\u0006\u0010!\u001A\u00020\"H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b>\u0010?J\u0018\u0010@\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010!\u001A\u00020\"H\u0016J0\u0010@\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00102\u0006\u0010!\u001A\u00020\"H&J\u0018\u0010A\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010!\u001A\u00020\"H&J0\u0010B\u001A\u00020\u00032\u0006\u0010C\u001A\u00020D2\f\u0010E\u001A\b\u0012\u0004\u0012\u00020(0F2\u0006\u0010!\u001A\u00020\"H&\u00F8\u0001\u0000\u00A2\u0006\u0004\bG\u0010HJ*\u0010I\u001A\u00020\u00032\u0006\u0010C\u001A\u00020D2\u0006\u0010E\u001A\u00020J2\u0006\u0010!\u001A\u00020\"H&\u00F8\u0001\u0000\u00A2\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010!\u001A\u00020\"H\u0016J0\u0010M\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00102\u0006\u0010!\u001A\u00020\"H&J@\u0010N\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0012\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00102\u0006\u0010O\u001A\u00020\u00102\u0006\u0010P\u001A\u00020\u00102\u0006\u0010!\u001A\u00020\"H&J*\u0010Q\u001A\u00020\u00032\u0006\u0010R\u001A\u00020S2\u0006\u0010T\u001A\u00020U2\u0006\u0010!\u001A\u00020\"H&\u00F8\u0001\u0000\u00A2\u0006\u0004\bV\u0010WJ\b\u0010X\u001A\u00020\u0003H&J\b\u0010Y\u001A\u00020\u0003H&J\u0010\u0010Z\u001A\u00020\u00032\u0006\u0010[\u001A\u00020\u0010H&J\b\u0010\\\u001A\u00020\u0003H&J\u0018\u0010]\u001A\u00020\u00032\u0006\u0010^\u001A\u00020\f2\u0006\u0010!\u001A\u00020\"H&J\u001A\u0010_\u001A\u00020\u00032\u0006\u0010`\u001A\u00020\u00102\b\b\u0002\u0010a\u001A\u00020\u0010H&J\u0018\u0010b\u001A\u00020\u00032\u0006\u0010`\u001A\u00020\u00102\u0006\u0010a\u001A\u00020\u0010H&J\u0018\u0010c\u001A\u00020\u00032\u0006\u0010d\u001A\u00020\u00102\u0006\u0010e\u001A\u00020\u0010H\u0016J\u0018\u0010f\u001A\u00020\u00032\u0006\u0010g\u001A\u00020\u00102\u0006\u0010h\u001A\u00020\u0010H&\u00F8\u0001\u0001\u0082\u0002\r\n\u0005\b\u00A1\u001E0\u0001\n\u0004\b!0\u0001\u00A8\u0006i\u00C0\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Canvas;", "", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "clipRect-mtrdD-E", "(Landroidx/compose/ui/geometry/Rect;I)V", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "concat", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "disableZ", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawArcRad", "startAngleRad", "sweepAngleRad", "drawCircle", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "drawPath", "drawPoints", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "points", "", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRect", "drawRoundRect", "radiusX", "radiusY", "drawVertices", "vertices", "Landroidx/compose/ui/graphics/Vertices;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "enableZ", "restore", "rotate", "degrees", "save", "saveLayer", "bounds", "scale", "sx", "sy", "skew", "skewRad", "sxRad", "syRad", "translate", "dx", "dy", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface Canvas {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void clipPath-mtrdD-E$default(Canvas canvas0, Path path0, int v, int v1, Object object0) {
            Canvas.clipPath-mtrdD-E$default(canvas0, path0, v, v1, object0);
        }

        public static void clipRect-N_I0leg$default(Canvas canvas0, float f, float f1, float f2, float f3, int v, int v1, Object object0) {
            Canvas.clipRect-N_I0leg$default(canvas0, f, f1, f2, f3, v, v1, object0);
        }

        @Deprecated
        public static void clipRect-mtrdD-E(@NotNull Canvas canvas0, @NotNull Rect rect0, int v) {
            canvas0.super.clipRect-mtrdD-E(rect0, v);
        }

        public static void clipRect-mtrdD-E$default(Canvas canvas0, Rect rect0, int v, int v1, Object object0) {
            Canvas.clipRect-mtrdD-E$default(canvas0, rect0, v, v1, object0);
        }

        @Deprecated
        public static void drawArc(@NotNull Canvas canvas0, @NotNull Rect rect0, float f, float f1, boolean z, @NotNull Paint paint0) {
            canvas0.super.drawArc(rect0, f, f1, z, paint0);
        }

        @Deprecated
        public static void drawArcRad(@NotNull Canvas canvas0, @NotNull Rect rect0, float f, float f1, boolean z, @NotNull Paint paint0) {
            canvas0.super.drawArcRad(rect0, f, f1, z, paint0);
        }

        public static void drawImageRect-HPBpro0$default(Canvas canvas0, ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, Paint paint0, int v4, Object object0) {
            Canvas.drawImageRect-HPBpro0$default(canvas0, imageBitmap0, v, v1, v2, v3, paint0, v4, object0);
        }

        @Deprecated
        public static void drawOval(@NotNull Canvas canvas0, @NotNull Rect rect0, @NotNull Paint paint0) {
            canvas0.super.drawOval(rect0, paint0);
        }

        @Deprecated
        public static void drawRect(@NotNull Canvas canvas0, @NotNull Rect rect0, @NotNull Paint paint0) {
            canvas0.super.drawRect(rect0, paint0);
        }

        public static void scale$default(Canvas canvas0, float f, float f1, int v, Object object0) {
            Canvas.scale$default(canvas0, f, f1, v, object0);
        }

        @Deprecated
        public static void skewRad(@NotNull Canvas canvas0, float f, float f1) {
            canvas0.super.skewRad(f, f1);
        }
    }

    void clipPath-mtrdD-E(@NotNull Path arg1, int arg2);

    static void clipPath-mtrdD-E$default(Canvas canvas0, Path path0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if((v1 & 2) != 0) {
            v = 1;
        }
        canvas0.clipPath-mtrdD-E(path0, v);
    }

    void clipRect-N_I0leg(float arg1, float arg2, float arg3, float arg4, int arg5);

    static void clipRect-N_I0leg$default(Canvas canvas0, float f, float f1, float f2, float f3, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if((v1 & 16) != 0) {
            v = 1;
        }
        canvas0.clipRect-N_I0leg(f, f1, f2, f3, v);
    }

    default void clipRect-mtrdD-E(@NotNull Rect rect0, int v) {
        this.clipRect-N_I0leg(rect0.getLeft(), rect0.getTop(), rect0.getRight(), rect0.getBottom(), v);
    }

    static void clipRect-mtrdD-E$default(Canvas canvas0, Rect rect0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if((v1 & 2) != 0) {
            v = 1;
        }
        canvas0.clipRect-mtrdD-E(rect0, v);
    }

    void concat-58bKbWc(@NotNull float[] arg1);

    void disableZ();

    void drawArc(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, boolean arg7, @NotNull Paint arg8);

    default void drawArc(@NotNull Rect rect0, float f, float f1, boolean z, @NotNull Paint paint0) {
        this.drawArc(rect0.getLeft(), rect0.getTop(), rect0.getRight(), rect0.getBottom(), f, f1, z, paint0);
    }

    default void drawArcRad(@NotNull Rect rect0, float f, float f1, boolean z, @NotNull Paint paint0) {
        this.drawArc(rect0, f * 57.29578f, f1 * 57.29578f, z, paint0);
    }

    void drawCircle-9KIMszo(long arg1, float arg2, @NotNull Paint arg3);

    void drawImage-d-4ec7I(@NotNull ImageBitmap arg1, long arg2, @NotNull Paint arg3);

    void drawImageRect-HPBpro0(@NotNull ImageBitmap arg1, long arg2, long arg3, long arg4, long arg5, @NotNull Paint arg6);

    static void drawImageRect-HPBpro0$default(Canvas canvas0, ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, Paint paint0, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        long v5 = (v4 & 4) == 0 ? v1 : IntSizeKt.IntSize(imageBitmap0.getWidth(), imageBitmap0.getHeight());
        canvas0.drawImageRect-HPBpro0(imageBitmap0, ((v4 & 2) == 0 ? v : 0L), v5, ((v4 & 8) == 0 ? v2 : 0L), ((v4 & 16) == 0 ? v3 : v5), paint0);
    }

    void drawLine-Wko1d7g(long arg1, long arg2, @NotNull Paint arg3);

    void drawOval(float arg1, float arg2, float arg3, float arg4, @NotNull Paint arg5);

    default void drawOval(@NotNull Rect rect0, @NotNull Paint paint0) {
        this.drawOval(rect0.getLeft(), rect0.getTop(), rect0.getRight(), rect0.getBottom(), paint0);
    }

    void drawPath(@NotNull Path arg1, @NotNull Paint arg2);

    void drawPoints-O7TthRY(int arg1, @NotNull List arg2, @NotNull Paint arg3);

    void drawRawPoints-O7TthRY(int arg1, @NotNull float[] arg2, @NotNull Paint arg3);

    void drawRect(float arg1, float arg2, float arg3, float arg4, @NotNull Paint arg5);

    default void drawRect(@NotNull Rect rect0, @NotNull Paint paint0) {
        this.drawRect(rect0.getLeft(), rect0.getTop(), rect0.getRight(), rect0.getBottom(), paint0);
    }

    void drawRoundRect(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, @NotNull Paint arg7);

    void drawVertices-TPEHhCM(@NotNull Vertices arg1, int arg2, @NotNull Paint arg3);

    void enableZ();

    void restore();

    void rotate(float arg1);

    void save();

    void saveLayer(@NotNull Rect arg1, @NotNull Paint arg2);

    void scale(float arg1, float arg2);

    static void scale$default(Canvas canvas0, float f, float f1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if((v & 2) != 0) {
            f1 = f;
        }
        canvas0.scale(f, f1);
    }

    void skew(float arg1, float arg2);

    default void skewRad(float f, float f1) {
        this.skew(f * 57.29578f, f1 * 57.29578f);
    }

    void translate(float arg1, float arg2);
}

