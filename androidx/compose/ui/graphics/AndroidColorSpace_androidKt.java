package androidx.compose.ui.graphics;

import android.graphics.ColorSpace;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p1.k;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0007\u001A\f\u0010\u0003\u001A\u00020\u0002*\u00020\u0001H\u0007¨\u0006\u0004"}, d2 = {"toAndroidColorSpace", "Landroid/graphics/ColorSpace;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "toComposeColorSpace", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidColorSpace_androidKt {
    @RequiresApi(26)
    @NotNull
    public static final ColorSpace toAndroidColorSpace(@NotNull androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace0) {
        return k.a(colorSpace0);
    }

    @RequiresApi(26)
    @NotNull
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace toComposeColorSpace(@NotNull ColorSpace colorSpace0) {
        return k.b(colorSpace0);
    }
}

