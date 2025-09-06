package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A,\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001A\u0018\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\u0003H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\r"}, d2 = {"BlurEffect", "Landroidx/compose/ui/graphics/BlurEffect;", "radiusX", "", "radiusY", "edgeTreatment", "Landroidx/compose/ui/graphics/TileMode;", "BlurEffect-3YTHUZs", "(FFI)Landroidx/compose/ui/graphics/BlurEffect;", "OffsetEffect", "Landroidx/compose/ui/graphics/OffsetEffect;", "offsetX", "offsetY", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class RenderEffectKt {
    @Stable
    @NotNull
    public static final BlurEffect BlurEffect-3YTHUZs(float f, float f1, int v) {
        return new BlurEffect(null, f, f1, v, null);
    }

    public static BlurEffect BlurEffect-3YTHUZs$default(float f, float f1, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = 0;
        }
        return RenderEffectKt.BlurEffect-3YTHUZs(f, f1, v);
    }

    @Stable
    @NotNull
    public static final OffsetEffect OffsetEffect(float f, float f1) {
        return new OffsetEffect(null, OffsetKt.Offset(f, f1), null);
    }
}

