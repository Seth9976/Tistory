package androidx.compose.ui.graphics;

import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p1.a;
import p1.e;
import p1.h;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001E\u0010\u0000\u001A\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001A\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u0019\u0010\u0007\u001A\u00020\u00042\n\u0010\b\u001A\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0002\u0010\t\u001A&\u0010\n\u001A\u00060\u0001j\u0002`\u00022\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u001A&\u0010\u0010\u001A\u00060\u0001j\u0002`\u00022\u0006\u0010\u0011\u001A\u00020\f2\u0006\u0010\u0012\u001A\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001A\b\u0010\u0016\u001A\u00020\u0017H\u0000\u001A\b\u0010\u0018\u001A\u00020\u0017H\u0000\u001A\n\u0010\u0019\u001A\u00020\u0001*\u00020\u001A\u001A\n\u0010\u001B\u001A\u00020\u001A*\u00020\u0001*\f\b\u0000\u0010\u001C\"\u00020\u00012\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"actualColorMatrixColorFilter", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "colorMatrix", "Landroidx/compose/ui/graphics/ColorMatrix;", "actualColorMatrixColorFilter-jHG-Opc", "([F)Landroid/graphics/ColorFilter;", "actualColorMatrixFromFilter", "filter", "(Landroid/graphics/ColorFilter;)[F", "actualLightingColorFilter", "multiply", "Landroidx/compose/ui/graphics/Color;", "add", "actualLightingColorFilter--OWjLjI", "(JJ)Landroid/graphics/ColorFilter;", "actualTintColorFilter", "color", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "actualTintColorFilter-xETnrds", "(JI)Landroid/graphics/ColorFilter;", "supportsColorMatrixQuery", "", "supportsLightingColorFilterQuery", "asAndroidColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "asComposeColorFilter", "NativeColorFilter", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidColorFilter_androidKt {
    @NotNull
    public static final ColorFilter actualColorMatrixColorFilter-jHG-Opc(@NotNull float[] arr_f) {
        return new ColorMatrixColorFilter(arr_f);
    }

    @NotNull
    public static final float[] actualColorMatrixFromFilter(@NotNull ColorFilter colorFilter0) {
        if(!(colorFilter0 instanceof ColorMatrixColorFilter)) {
            throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
        }
        return h.a.a(((ColorMatrixColorFilter)colorFilter0));
    }

    @NotNull
    public static final ColorFilter actualLightingColorFilter--OWjLjI(long v, long v1) {
        return new LightingColorFilter(ColorKt.toArgb-8_81llA(v), ColorKt.toArgb-8_81llA(v1));
    }

    @NotNull
    public static final ColorFilter actualTintColorFilter-xETnrds(long v, int v1) {
        return Build.VERSION.SDK_INT >= 29 ? e.a.a(v, v1) : new PorterDuffColorFilter(ColorKt.toArgb-8_81llA(v), AndroidBlendMode_androidKt.toPorterDuffMode-s9anfk8(v1));
    }

    @NotNull
    public static final ColorFilter asAndroidColorFilter(@NotNull androidx.compose.ui.graphics.ColorFilter colorFilter0) {
        return colorFilter0.getNativeColorFilter$ui_graphics_release();
    }

    @NotNull
    public static final androidx.compose.ui.graphics.ColorFilter asComposeColorFilter(@NotNull ColorFilter colorFilter0) {
        if(29 <= Build.VERSION.SDK_INT && a.d(colorFilter0)) {
            return e.a.b(((BlendModeColorFilter)colorFilter0));
        }
        if(colorFilter0 instanceof LightingColorFilter) {
            return new androidx.compose.ui.graphics.LightingColorFilter(ColorKt.Color(((LightingColorFilter)colorFilter0).getColorMultiply()), ColorKt.Color(((LightingColorFilter)colorFilter0).getColorAdd()), colorFilter0, null);
        }
        return colorFilter0 instanceof ColorMatrixColorFilter ? new androidx.compose.ui.graphics.ColorMatrixColorFilter(null, colorFilter0, null) : new androidx.compose.ui.graphics.ColorFilter(colorFilter0);
    }

    public static final boolean supportsColorMatrixQuery() [...] // Inlined contents

    public static final boolean supportsLightingColorFilterQuery() [...] // Inlined contents
}

