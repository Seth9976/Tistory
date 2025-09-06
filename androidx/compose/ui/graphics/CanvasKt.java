package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u000E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003\u001A\"\u0010\u0004\u001A\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007\u001A&\u0010\n\u001A\u00020\u0005*\u00020\u00012\u0006\u0010\u000B\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u0007\u001A,\u0010\f\u001A\u00020\u0005*\u00020\u00012\u0006\u0010\r\u001A\u00020\u00072\b\b\u0002\u0010\u000E\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007\u001A\u001B\u0010\u000F\u001A\u00020\u0005*\u00020\u00012\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0086\b\u001A+\u0010\u0012\u001A\u00020\u0005*\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00162\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0086\b¨\u0006\u0017"}, d2 = {"Canvas", "Landroidx/compose/ui/graphics/Canvas;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "rotate", "", "degrees", "", "pivotX", "pivotY", "rotateRad", "radians", "scale", "sx", "sy", "withSave", "block", "Lkotlin/Function0;", "withSaveLayer", "bounds", "Landroidx/compose/ui/geometry/Rect;", "paint", "Landroidx/compose/ui/graphics/Paint;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class CanvasKt {
    @NotNull
    public static final Canvas Canvas(@NotNull ImageBitmap imageBitmap0) {
        return AndroidCanvas_androidKt.ActualCanvas(imageBitmap0);
    }

    public static final void rotate(@NotNull Canvas canvas0, float f, float f1, float f2) {
        if(f == 0.0f) {
            return;
        }
        canvas0.translate(f1, f2);
        canvas0.rotate(f);
        canvas0.translate(-f1, -f2);
    }

    public static final void rotateRad(@NotNull Canvas canvas0, float f, float f1, float f2) {
        CanvasKt.rotate(canvas0, f * 57.29578f, f1, f2);
    }

    public static void rotateRad$default(Canvas canvas0, float f, float f1, float f2, int v, Object object0) {
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        CanvasKt.rotateRad(canvas0, f, f1, f2);
    }

    public static final void scale(@NotNull Canvas canvas0, float f, float f1, float f2, float f3) {
        if(f == 1.0f && f1 == 1.0f) {
            return;
        }
        canvas0.translate(f2, f3);
        canvas0.scale(f, f1);
        canvas0.translate(-f2, -f3);
    }

    public static void scale$default(Canvas canvas0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 2) != 0) {
            f1 = f;
        }
        CanvasKt.scale(canvas0, f, f1, f2, f3);
    }

    public static final void withSave(@NotNull Canvas canvas0, @NotNull Function0 function00) {
        try {
            canvas0.save();
            function00.invoke();
        }
        finally {
            canvas0.restore();
        }
    }

    public static final void withSaveLayer(@NotNull Canvas canvas0, @NotNull Rect rect0, @NotNull Paint paint0, @NotNull Function0 function00) {
        try {
            canvas0.saveLayer(rect0, paint0);
            function00.invoke();
        }
        finally {
            canvas0.restore();
        }
    }
}

