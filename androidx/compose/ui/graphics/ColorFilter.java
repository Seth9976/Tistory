package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Immutable
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000 \u000B2\u00020\u0001:\u0001\u000BB\u0015\b\u0000\u0012\n\u0010\u0004\u001A\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001E\u0010\u0004\u001A\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter;", "", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(Landroid/graphics/ColorFilter;)V", "a", "Landroid/graphics/ColorFilter;", "getNativeColorFilter$ui_graphics_release", "()Landroid/graphics/ColorFilter;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class ColorFilter {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001J$\u0010\t\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000B\u001A\u00020\u00062\u0006\u0010\u000B\u001A\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter$Companion;", "", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "tint-xETnrds", "(JI)Landroidx/compose/ui/graphics/ColorFilter;", "tint", "Landroidx/compose/ui/graphics/ColorMatrix;", "colorMatrix", "colorMatrix-jHG-Opc", "([F)Landroidx/compose/ui/graphics/ColorFilter;", "multiply", "add", "lighting--OWjLjI", "(JJ)Landroidx/compose/ui/graphics/ColorFilter;", "lighting", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @Stable
        @NotNull
        public final ColorFilter colorMatrix-jHG-Opc(@NotNull float[] arr_f) {
            return new ColorMatrixColorFilter(arr_f, null);
        }

        @Stable
        @NotNull
        public final ColorFilter lighting--OWjLjI(long v, long v1) {
            return new LightingColorFilter(v, v1, null);
        }

        @Stable
        @NotNull
        public final ColorFilter tint-xETnrds(long v, int v1) {
            return new BlendModeColorFilter(v, v1, null);
        }

        public static ColorFilter tint-xETnrds$default(Companion colorFilter$Companion0, long v, int v1, int v2, Object object0) {
            if((v2 & 2) != 0) {
                v1 = 5;
            }
            return colorFilter$Companion0.tint-xETnrds(v, v1);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final android.graphics.ColorFilter a;

    static {
        ColorFilter.Companion = new Companion(null);
    }

    public ColorFilter(@NotNull android.graphics.ColorFilter colorFilter0) {
        this.a = colorFilter0;
    }

    @NotNull
    public final android.graphics.ColorFilter getNativeColorFilter$ui_graphics_release() {
        return this.a;
    }
}

