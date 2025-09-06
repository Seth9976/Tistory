package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A6\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"BitmapPainter", "Landroidx/compose/ui/graphics/painter/BitmapPainter;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "BitmapPainter-QZhYCtY", "(Landroidx/compose/ui/graphics/ImageBitmap;JJI)Landroidx/compose/ui/graphics/painter/BitmapPainter;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class BitmapPainterKt {
    @NotNull
    public static final BitmapPainter BitmapPainter-QZhYCtY(@NotNull ImageBitmap imageBitmap0, long v, long v1, int v2) {
        BitmapPainter bitmapPainter0 = new BitmapPainter(imageBitmap0, v, v1, null);
        bitmapPainter0.setFilterQuality-vDHp3xo$ui_graphics_release(v2);
        return bitmapPainter0;
    }

    public static BitmapPainter BitmapPainter-QZhYCtY$default(ImageBitmap imageBitmap0, long v, long v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0L;
        }
        if((v3 & 4) != 0) {
            v1 = IntSizeKt.IntSize(imageBitmap0.getWidth(), imageBitmap0.getHeight());
        }
        if((v3 & 8) != 0) {
            v2 = 1;
        }
        return BitmapPainterKt.BitmapPainter-QZhYCtY(imageBitmap0, v, v1, v2);
    }
}

