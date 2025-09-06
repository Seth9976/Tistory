package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\u001A0\u0010\u0000\u001A\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001A\u00020\u00042\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001AN\u0010\n\u001A\u00060\u0001j\u0002`\u00022\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\u0010\b\u0002\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000F2\b\b\u0002\u0010\u0013\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001AN\u0010\u0016\u001A\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\u00122\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\u0010\b\u0002\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000F2\b\b\u0002\u0010\u0013\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001A\u001A<\u0010\u001B\u001A\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001A\u00020\f2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\u0010\b\u0002\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000Fø\u0001\u0000¢\u0006\u0004\b\u001C\u0010\u001D\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001E"}, d2 = {"ImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "LinearGradientShader", "from", "Landroidx/compose/ui/geometry/Offset;", "to", "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "LinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "RadialGradientShader", "center", "radius", "RadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "SweepGradientShader", "SweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ShaderKt {
    @NotNull
    public static final Shader ImageShader-F49vj9s(@NotNull ImageBitmap imageBitmap0, int v, int v1) {
        return AndroidShader_androidKt.ActualImageShader-F49vj9s(imageBitmap0, v, v1);
    }

    public static Shader ImageShader-F49vj9s$default(ImageBitmap imageBitmap0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        return ShaderKt.ImageShader-F49vj9s(imageBitmap0, v, v1);
    }

    @NotNull
    public static final Shader LinearGradientShader-VjE6UOU(long v, long v1, @NotNull List list0, @Nullable List list1, int v2) {
        return AndroidShader_androidKt.ActualLinearGradientShader-VjE6UOU(v, v1, list0, list1, v2);
    }

    public static Shader LinearGradientShader-VjE6UOU$default(long v, long v1, List list0, List list1, int v2, int v3, Object object0) {
        if((v3 & 8) != 0) {
            list1 = null;
        }
        if((v3 & 16) != 0) {
            v2 = 0;
        }
        return ShaderKt.LinearGradientShader-VjE6UOU(v, v1, list0, list1, v2);
    }

    @NotNull
    public static final Shader RadialGradientShader-8uybcMk(long v, float f, @NotNull List list0, @Nullable List list1, int v1) {
        return AndroidShader_androidKt.ActualRadialGradientShader-8uybcMk(v, f, list0, list1, v1);
    }

    public static Shader RadialGradientShader-8uybcMk$default(long v, float f, List list0, List list1, int v1, int v2, Object object0) {
        if((v2 & 8) != 0) {
            list1 = null;
        }
        if((v2 & 16) != 0) {
            v1 = 0;
        }
        return ShaderKt.RadialGradientShader-8uybcMk(v, f, list0, list1, v1);
    }

    @NotNull
    public static final Shader SweepGradientShader-9KIMszo(long v, @NotNull List list0, @Nullable List list1) {
        return AndroidShader_androidKt.ActualSweepGradientShader-9KIMszo(v, list0, list1);
    }

    public static Shader SweepGradientShader-9KIMszo$default(long v, List list0, List list1, int v1, Object object0) {
        if((v1 & 4) != 0) {
            list1 = null;
        }
        return ShaderKt.SweepGradientShader-9KIMszo(v, list0, list1);
    }
}

