package androidx.compose.ui.graphics.drawscope;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u0015\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0000\u001A\u00020\u0003H\u0086\b\u001A!\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0003H\u0086\b\u001A)\u0010\u0006\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A)\u0010\f\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000E"}, d2 = {"inset", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "horizontal", "vertical", "rotateRad", "radians", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotateRad-0AR0LA0", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FJ)V", "scale", "scale-0AR0LA0", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,179:1\n37#1:180\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n49#1:180\n*E\n"})
public final class DrawTransformKt {
    public static final void inset(@NotNull DrawTransform drawTransform0, float f) {
        drawTransform0.inset(f, f, f, f);
    }

    public static final void inset(@NotNull DrawTransform drawTransform0, float f, float f1) {
        drawTransform0.inset(f, f1, f, f1);
    }

    public static void inset$default(DrawTransform drawTransform0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        drawTransform0.inset(f, f1, f, f1);
    }

    public static final void rotateRad-0AR0LA0(@NotNull DrawTransform drawTransform0, float f, long v) {
        drawTransform0.rotate-Uv8p0NA(f * 57.29578f, v);
    }

    public static void rotateRad-0AR0LA0$default(DrawTransform drawTransform0, float f, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = drawTransform0.getCenter-F1C5BW0();
        }
        drawTransform0.rotate-Uv8p0NA(f * 57.29578f, v);
    }

    public static final void scale-0AR0LA0(@NotNull DrawTransform drawTransform0, float f, long v) {
        drawTransform0.scale-0AR0LA0(f, f, v);
    }

    public static void scale-0AR0LA0$default(DrawTransform drawTransform0, float f, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = drawTransform0.getCenter-F1C5BW0();
        }
        drawTransform0.scale-0AR0LA0(f, f, v);
    }
}

