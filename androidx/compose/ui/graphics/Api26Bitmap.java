package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@RequiresApi(26)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001J:\u0010\u000E\u001A\u00020\u000B2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0011\u001A\u00020\t*\u00020\u000BH\u0001¢\u0006\u0004\b\u000F\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap;", "", "", "width", "height", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "bitmapConfig", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroid/graphics/Bitmap;", "createBitmap-x__-hDU$ui_graphics_release", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "createBitmap", "composeColorSpace$ui_graphics_release", "(Landroid/graphics/Bitmap;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "composeColorSpace", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Api26Bitmap {
    @NotNull
    public static final Api26Bitmap INSTANCE;

    static {
        Api26Bitmap.INSTANCE = new Api26Bitmap();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @JvmStatic
    @NotNull
    public static final ColorSpace composeColorSpace$ui_graphics_release(@NotNull Bitmap bitmap0) {
        android.graphics.ColorSpace colorSpace0 = bitmap0.getColorSpace();
        if(colorSpace0 != null) {
            ColorSpace colorSpace1 = AndroidColorSpace_androidKt.toComposeColorSpace(colorSpace0);
            if(colorSpace1 != null) {
                return colorSpace1;
            }
        }
        return ColorSpaces.INSTANCE.getSrgb();
    }

    @DoNotInline
    @JvmStatic
    @NotNull
    public static final Bitmap createBitmap-x__-hDU$ui_graphics_release(int v, int v1, int v2, boolean z, @NotNull ColorSpace colorSpace0) {
        return Bitmap.createBitmap(null, v, v1, AndroidImageBitmap_androidKt.toBitmapConfig-1JJdX4A(v2), z, AndroidColorSpace_androidKt.toAndroidColorSpace(colorSpace0));
    }
}

