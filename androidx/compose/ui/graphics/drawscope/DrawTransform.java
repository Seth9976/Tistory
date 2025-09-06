package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@DrawScopeMarker
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J$\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\r\u001A\u00020\u000EH&ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010JD\u0010\u0011\u001A\u00020\n2\b\b\u0002\u0010\u0012\u001A\u00020\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00132\b\b\u0002\u0010\u0015\u001A\u00020\u00132\b\b\u0002\u0010\u0016\u001A\u00020\u00132\b\b\u0002\u0010\r\u001A\u00020\u000EH&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0015\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u0013H&J$\u0010\u001A\u001A\u00020\n2\u0006\u0010\u001B\u001A\u00020\u00132\b\b\u0002\u0010\u001C\u001A\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u001D\u0010\u001EJ,\u0010\u001F\u001A\u00020\n2\u0006\u0010 \u001A\u00020\u00132\u0006\u0010!\u001A\u00020\u00132\b\b\u0002\u0010\u001C\u001A\u00020\u0003H&ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001A\u0010$\u001A\u00020\n2\u0006\u0010%\u001A\u00020&H&ø\u0001\u0000¢\u0006\u0004\b\'\u0010(J\u001C\u0010)\u001A\u00020\n2\b\b\u0002\u0010\u0012\u001A\u00020\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u0013H&R\u001A\u0010\u0002\u001A\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001A\u00020\u0007X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\b\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001E0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006*À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "inset", "rotate", "degrees", "pivot", "rotate-Uv8p0NA", "(FJ)V", "scale", "scaleX", "scaleY", "scale-0AR0LA0", "(FFJ)V", "transform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "translate", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface DrawTransform {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void clipPath-mtrdD-E$default(DrawTransform drawTransform0, Path path0, int v, int v1, Object object0) {
            DrawTransform.clipPath-mtrdD-E$default(drawTransform0, path0, v, v1, object0);
        }

        public static void clipRect-N_I0leg$default(DrawTransform drawTransform0, float f, float f1, float f2, float f3, int v, int v1, Object object0) {
            DrawTransform.clipRect-N_I0leg$default(drawTransform0, f, f1, f2, f3, v, v1, object0);
        }

        @Deprecated
        public static long getCenter-F1C5BW0(@NotNull DrawTransform drawTransform0) {
            return drawTransform0.super.getCenter-F1C5BW0();
        }

        public static void rotate-Uv8p0NA$default(DrawTransform drawTransform0, float f, long v, int v1, Object object0) {
            DrawTransform.rotate-Uv8p0NA$default(drawTransform0, f, v, v1, object0);
        }

        public static void scale-0AR0LA0$default(DrawTransform drawTransform0, float f, float f1, long v, int v1, Object object0) {
            DrawTransform.scale-0AR0LA0$default(drawTransform0, f, f1, v, v1, object0);
        }

        public static void translate$default(DrawTransform drawTransform0, float f, float f1, int v, Object object0) {
            DrawTransform.translate$default(drawTransform0, f, f1, v, object0);
        }
    }

    void clipPath-mtrdD-E(@NotNull Path arg1, int arg2);

    static void clipPath-mtrdD-E$default(DrawTransform drawTransform0, Path path0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if((v1 & 2) != 0) {
            v = 1;
        }
        drawTransform0.clipPath-mtrdD-E(path0, v);
    }

    void clipRect-N_I0leg(float arg1, float arg2, float arg3, float arg4, int arg5);

    static void clipRect-N_I0leg$default(DrawTransform drawTransform0, float f, float f1, float f2, float f3, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if((v1 & 1) != 0) {
            f = 0.0f;
        }
        if((v1 & 2) != 0) {
            f1 = 0.0f;
        }
        if((v1 & 4) != 0) {
            f2 = Size.getWidth-impl(drawTransform0.getSize-NH-jbRc());
        }
        if((v1 & 8) != 0) {
            f3 = Size.getHeight-impl(drawTransform0.getSize-NH-jbRc());
        }
        if((v1 & 16) != 0) {
            v = 1;
        }
        drawTransform0.clipRect-N_I0leg(f, f1, f2, f3, v);
    }

    default long getCenter-F1C5BW0() {
        return OffsetKt.Offset(Size.getWidth-impl(this.getSize-NH-jbRc()) / 2.0f, Size.getHeight-impl(this.getSize-NH-jbRc()) / 2.0f);
    }

    long getSize-NH-jbRc();

    void inset(float arg1, float arg2, float arg3, float arg4);

    void rotate-Uv8p0NA(float arg1, long arg2);

    static void rotate-Uv8p0NA$default(DrawTransform drawTransform0, float f, long v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if((v1 & 2) != 0) {
            v = drawTransform0.getCenter-F1C5BW0();
        }
        drawTransform0.rotate-Uv8p0NA(f, v);
    }

    void scale-0AR0LA0(float arg1, float arg2, long arg3);

    static void scale-0AR0LA0$default(DrawTransform drawTransform0, float f, float f1, long v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if((v1 & 4) != 0) {
            v = drawTransform0.getCenter-F1C5BW0();
        }
        drawTransform0.scale-0AR0LA0(f, f1, v);
    }

    void transform-58bKbWc(@NotNull float[] arg1);

    void translate(float arg1, float arg2);

    static void translate$default(DrawTransform drawTransform0, float f, float f1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        drawTransform0.translate(f, f1);
    }
}

