package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\u001A>\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u001AP\u0010\r\u001A\u00020\u000E*\u00020\u00012\b\b\u0002\u0010\u000F\u001A\u00020\u00032\b\b\u0002\u0010\u0010\u001A\u00020\u00032\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0011\u001A\u00020\u00122\b\b\u0002\u0010\u0013\u001A\u00020\u00032\b\b\u0002\u0010\u0014\u001A\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"ImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "toPixelMap", "Landroidx/compose/ui/graphics/PixelMap;", "startX", "startY", "buffer", "", "bufferOffset", "stride", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ImageBitmapKt {
    @NotNull
    public static final ImageBitmap ImageBitmap-x__-hDU(int v, int v1, int v2, boolean z, @NotNull ColorSpace colorSpace0) {
        return AndroidImageBitmap_androidKt.ActualImageBitmap-x__-hDU(v, v1, v2, z, colorSpace0);
    }

    public static ImageBitmap ImageBitmap-x__-hDU$default(int v, int v1, int v2, boolean z, ColorSpace colorSpace0, int v3, Object object0) {
        if((v3 & 4) != 0) {
            v2 = 0;
        }
        if((v3 & 8) != 0) {
            z = true;
        }
        if((v3 & 16) != 0) {
            colorSpace0 = ColorSpaces.INSTANCE.getSrgb();
        }
        return ImageBitmapKt.ImageBitmap-x__-hDU(v, v1, v2, z, colorSpace0);
    }

    @NotNull
    public static final PixelMap toPixelMap(@NotNull ImageBitmap imageBitmap0, int v, int v1, int v2, int v3, @NotNull int[] arr_v, int v4, int v5) {
        imageBitmap0.readPixels(arr_v, v, v1, v2, v3, v4, v5);
        return new PixelMap(arr_v, v2, v3, v4, v5);
    }

    public static PixelMap toPixelMap$default(ImageBitmap imageBitmap0, int v, int v1, int v2, int v3, int[] arr_v, int v4, int v5, int v6, Object object0) {
        if((v6 & 1) != 0) {
            v = 0;
        }
        if((v6 & 2) != 0) {
            v1 = 0;
        }
        if((v6 & 4) != 0) {
            v2 = imageBitmap0.getWidth();
        }
        if((v6 & 8) != 0) {
            v3 = imageBitmap0.getHeight();
        }
        if((v6 & 16) != 0) {
            arr_v = new int[v2 * v3];
        }
        if((v6 & 0x20) != 0) {
            v4 = 0;
        }
        if((v6 & 0x40) != 0) {
            v5 = v2;
        }
        return ImageBitmapKt.toPixelMap(imageBitmap0, v, v1, v2, v3, arr_v, v4, v5);
    }
}

