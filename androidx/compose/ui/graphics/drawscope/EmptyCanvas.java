package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Vertices;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00A2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\t\u0010\nJ:\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\bH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0014\u001A\u00020\u0015H\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001A\u00020\u0004H\u0016JH\u0010\u0019\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\r2\u0006\u0010\u001A\u001A\u00020\r2\u0006\u0010\u001B\u001A\u00020\r2\u0006\u0010\u001C\u001A\u00020\u001D2\u0006\u0010\u001E\u001A\u00020\u001FH\u0016J*\u0010 \u001A\u00020\u00042\u0006\u0010!\u001A\u00020\"2\u0006\u0010#\u001A\u00020\r2\u0006\u0010\u001E\u001A\u00020\u001FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b$\u0010%J*\u0010&\u001A\u00020\u00042\u0006\u0010\'\u001A\u00020(2\u0006\u0010)\u001A\u00020\"2\u0006\u0010\u001E\u001A\u00020\u001FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b*\u0010+JB\u0010,\u001A\u00020\u00042\u0006\u0010\'\u001A\u00020(2\u0006\u0010-\u001A\u00020.2\u0006\u0010/\u001A\u0002002\u0006\u00101\u001A\u00020.2\u0006\u00102\u001A\u0002002\u0006\u0010\u001E\u001A\u00020\u001FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b3\u00104J*\u00105\u001A\u00020\u00042\u0006\u00106\u001A\u00020\"2\u0006\u00107\u001A\u00020\"2\u0006\u0010\u001E\u001A\u00020\u001FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\b8\u00109J0\u0010:\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\r2\u0006\u0010\u001E\u001A\u00020\u001FH\u0016J\u0018\u0010;\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u001E\u001A\u00020\u001FH\u0016J0\u0010<\u001A\u00020\u00042\u0006\u0010=\u001A\u00020>2\f\u0010?\u001A\b\u0012\u0004\u0012\u00020\"0@2\u0006\u0010\u001E\u001A\u00020\u001FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bA\u0010BJ*\u0010C\u001A\u00020\u00042\u0006\u0010=\u001A\u00020>2\u0006\u0010?\u001A\u00020D2\u0006\u0010\u001E\u001A\u00020\u001FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bE\u0010FJ0\u0010G\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\r2\u0006\u0010\u001E\u001A\u00020\u001FH\u0016J@\u0010H\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\r2\u0006\u0010I\u001A\u00020\r2\u0006\u0010J\u001A\u00020\r2\u0006\u0010\u001E\u001A\u00020\u001FH\u0016J*\u0010K\u001A\u00020\u00042\u0006\u0010L\u001A\u00020M2\u0006\u0010N\u001A\u00020O2\u0006\u0010\u001E\u001A\u00020\u001FH\u0016\u00F8\u0001\u0000\u00A2\u0006\u0004\bP\u0010QJ\b\u0010R\u001A\u00020\u0004H\u0016J\b\u0010S\u001A\u00020\u0004H\u0016J\u0010\u0010T\u001A\u00020\u00042\u0006\u0010U\u001A\u00020\rH\u0016J\b\u0010V\u001A\u00020\u0004H\u0016J\u0018\u0010W\u001A\u00020\u00042\u0006\u0010X\u001A\u00020Y2\u0006\u0010\u001E\u001A\u00020\u001FH\u0016J\u0018\u0010Z\u001A\u00020\u00042\u0006\u0010[\u001A\u00020\r2\u0006\u0010\\\u001A\u00020\rH\u0016J\u0018\u0010]\u001A\u00020\u00042\u0006\u0010[\u001A\u00020\r2\u0006\u0010\\\u001A\u00020\rH\u0016J\u0018\u0010^\u001A\u00020\u00042\u0006\u0010_\u001A\u00020\r2\u0006\u0010`\u001A\u00020\rH\u0016\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006a"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/EmptyCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "()V", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "concat", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "disableZ", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawCircle", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "drawPath", "drawPoints", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "points", "", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRect", "drawRoundRect", "radiusX", "radiusY", "drawVertices", "vertices", "Landroidx/compose/ui/graphics/Vertices;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "enableZ", "restore", "rotate", "degrees", "save", "saveLayer", "bounds", "Landroidx/compose/ui/geometry/Rect;", "scale", "sx", "sy", "skew", "translate", "dx", "dy", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class EmptyCanvas implements Canvas {
    @Override  // androidx.compose.ui.graphics.Canvas
    public void clipPath-mtrdD-E(@NotNull Path path0, int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void clipRect-N_I0leg(float f, float f1, float f2, float f3, int v) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void concat-58bKbWc(@NotNull float[] arr_f) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void disableZ() {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawArc(float f, float f1, float f2, float f3, float f4, float f5, boolean z, @NotNull Paint paint0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawCircle-9KIMszo(long v, float f, @NotNull Paint paint0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawImage-d-4ec7I(@NotNull ImageBitmap imageBitmap0, long v, @NotNull Paint paint0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawImageRect-HPBpro0(@NotNull ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, @NotNull Paint paint0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawLine-Wko1d7g(long v, long v1, @NotNull Paint paint0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawOval(float f, float f1, float f2, float f3, @NotNull Paint paint0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawPath(@NotNull Path path0, @NotNull Paint paint0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawPoints-O7TthRY(int v, @NotNull List list0, @NotNull Paint paint0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawRawPoints-O7TthRY(int v, @NotNull float[] arr_f, @NotNull Paint paint0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawRect(float f, float f1, float f2, float f3, @NotNull Paint paint0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawRoundRect(float f, float f1, float f2, float f3, float f4, float f5, @NotNull Paint paint0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void drawVertices-TPEHhCM(@NotNull Vertices vertices0, int v, @NotNull Paint paint0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void enableZ() {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void restore() {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void rotate(float f) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void save() {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void saveLayer(@NotNull Rect rect0, @NotNull Paint paint0) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void scale(float f, float f1) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void skew(float f, float f1) {
        throw new UnsupportedOperationException();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void translate(float f, float f1) {
        throw new UnsupportedOperationException();
    }
}

