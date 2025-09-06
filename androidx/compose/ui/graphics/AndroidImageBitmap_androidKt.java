package androidx.compose.ui.graphics;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A:\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u001A\n\u0010\r\u001A\u00020\u000E*\u00020\u0001\u001A\n\u0010\u000F\u001A\u00020\u0001*\u00020\u000E\u001A\u0016\u0010\u0010\u001A\u00020\u0011*\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001A\u0011\u0010\u0014\u001A\u00020\u0006*\u00020\u0011H\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0016"}, d2 = {"ActualImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "asAndroidBitmap", "Landroid/graphics/Bitmap;", "asImageBitmap", "toBitmapConfig", "Landroid/graphics/Bitmap$Config;", "toBitmapConfig-1JJdX4A", "(I)Landroid/graphics/Bitmap$Config;", "toImageConfig", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidImageBitmap_androidKt {
    @NotNull
    public static final ImageBitmap ActualImageBitmap-x__-hDU(int v, int v1, int v2, boolean z, @NotNull ColorSpace colorSpace0) {
        AndroidImageBitmap_androidKt.toBitmapConfig-1JJdX4A(v2);
        return new AndroidImageBitmap(Api26Bitmap.createBitmap-x__-hDU$ui_graphics_release(v, v1, v2, z, colorSpace0));
    }

    @NotNull
    public static final Bitmap asAndroidBitmap(@NotNull ImageBitmap imageBitmap0) {
        if(!(imageBitmap0 instanceof AndroidImageBitmap)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        return ((AndroidImageBitmap)imageBitmap0).getBitmap$ui_graphics_release();
    }

    @NotNull
    public static final ImageBitmap asImageBitmap(@NotNull Bitmap bitmap0) {
        return new AndroidImageBitmap(bitmap0);
    }

    @NotNull
    public static final Bitmap.Config toBitmapConfig-1JJdX4A(int v) {
        if(ImageBitmapConfig.equals-impl0(v, 0)) {
            return Bitmap.Config.ARGB_8888;
        }
        if(ImageBitmapConfig.equals-impl0(v, 1)) {
            return Bitmap.Config.ALPHA_8;
        }
        if(ImageBitmapConfig.equals-impl0(v, 2)) {
            return Bitmap.Config.RGB_565;
        }
        if(ImageBitmapConfig.equals-impl0(v, 3)) {
            return Bitmap.Config.RGBA_F16;
        }
        return ImageBitmapConfig.equals-impl0(v, 4) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int toImageConfig(@NotNull Bitmap.Config bitmap$Config0) {
        if(bitmap$Config0 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if(bitmap$Config0 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if(bitmap$Config0 == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if(bitmap$Config0 == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return bitmap$Config0 == Bitmap.Config.HARDWARE ? 4 : 0;
    }
}

