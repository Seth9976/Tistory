package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH\u0016J\u0010\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0005H\u0016J\u0010\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0005H\u0016J%\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u000EH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH\u0016J%\u0010\u0018\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u000EH\u0010¢\u0006\u0002\b\u0019J=\u0010\u001A\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u000E2\u0006\u0010\u001D\u001A\u00020\u000E2\u0006\u0010\u001E\u001A\u00020\u000E2\u0006\u0010\u001F\u001A\u00020\u000E2\u0006\u0010 \u001A\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\t\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,142:1\n71#2,16:143\n71#2,16:159\n71#2,16:175\n71#2,16:191\n71#2,16:207\n71#2,16:226\n71#2,16:242\n71#2,16:258\n71#2,16:274\n71#2,16:290\n71#2,16:306\n71#2,16:322\n71#2,16:338\n63#3,3:223\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n48#1:143,16\n49#1:159,16\n50#1:175,16\n67#1:191,16\n68#1:207,16\n79#1:226,16\n80#1:242,16\n107#1:258,16\n108#1:274,16\n109#1:290,16\n128#1:306,16\n129#1:322,16\n130#1:338,16\n75#1:223,3\n*E\n"})
public final class Lab extends ColorSpace {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab$Companion;", "", "", "A", "F", "B", "C", "D", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;

    static {
        Lab.Companion = new Companion(null);
    }

    public Lab(@NotNull String s, int v) {
        super(s, 0x300000002L, v, null);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] arr_f) {
        float f = arr_f[0] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        float f1 = arr_f[1] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        float f2 = arr_f[2] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        float f3 = f1 > 0.008856f ? ((float)Math.cbrt(f1)) : f1 * 7.787037f + 0.137931f;
        float f4 = 116.0f * f3 - 16.0f;
        float f5 = ((Float.compare(f, 0.008856f) <= 0 ? f * 7.787037f + 0.137931f : ((float)Math.cbrt(f))) - f3) * 500.0f;
        float f6 = (f3 - (f2 > 0.008856f ? ((float)Math.cbrt(f2)) : f2 * 7.787037f + 0.137931f)) * 200.0f;
        if(f4 < 0.0f) {
            f4 = 0.0f;
        }
        if(f4 > 100.0f) {
            f4 = 100.0f;
        }
        arr_f[0] = f4;
        if(f5 < -128.0f) {
            f5 = -128.0f;
        }
        float f7 = 128.0f;
        if(f5 > 128.0f) {
            f5 = 128.0f;
        }
        arr_f[1] = f5;
        if(f6 < -128.0f) {
            f6 = -128.0f;
        }
        if(f6 <= 128.0f) {
            f7 = f6;
        }
        arr_f[2] = f7;
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int v) {
        return v == 0 ? 100.0f : 128.0f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int v) {
        return v == 0 ? 0.0f : -128.0f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f, float f1, float f2) {
        if(f < 0.0f) {
            f = 0.0f;
        }
        if(f > 100.0f) {
            f = 100.0f;
        }
        if(f1 < -128.0f) {
            f1 = -128.0f;
        }
        if(f1 > 128.0f) {
            f1 = 128.0f;
        }
        float f3 = (f + 16.0f) / 116.0f;
        float f4 = f1 * 0.002f + f3;
        float f5 = Float.compare(f4, 0.206897f) <= 0 ? (f4 - 0.137931f) * 0.128419f : f4 * f4 * f4;
        return f3 > 0.206897f ? ((long)Float.floatToRawIntBits(f3 * f3 * f3 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1])) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f5 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0])) << 0x20 : ((long)Float.floatToRawIntBits((f3 - 0.137931f) * 0.128419f * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1])) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f5 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0])) << 0x20;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] arr_f) {
        float f = arr_f[0];
        if(f < 0.0f) {
            f = 0.0f;
        }
        if(f > 100.0f) {
            f = 100.0f;
        }
        arr_f[0] = f;
        float f1 = arr_f[1];
        float f2 = -128.0f;
        if(f1 < -128.0f) {
            f1 = -128.0f;
        }
        float f3 = 128.0f;
        if(f1 > 128.0f) {
            f1 = 128.0f;
        }
        arr_f[1] = f1;
        float f4 = arr_f[2];
        if(f4 >= -128.0f) {
            f2 = f4;
        }
        if(f2 <= 128.0f) {
            f3 = f2;
        }
        arr_f[2] = f3;
        float f5 = (f + 16.0f) / 116.0f;
        float f6 = f1 * 0.002f + f5;
        float f7 = f5 - f3 * 0.005f;
        arr_f[0] = (Float.compare(f6, 0.206897f) <= 0 ? (f6 - 0.137931f) * 0.128419f : f6 * f6 * f6) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        arr_f[1] = (f5 > 0.206897f ? f5 * f5 * f5 : (f5 - 0.137931f) * 0.128419f) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        arr_f[2] = (f7 > 0.206897f ? f7 * f7 * f7 : (f7 - 0.137931f) * 0.128419f) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f, float f1, float f2) {
        if(f < 0.0f) {
            f = 0.0f;
        }
        if(f > 100.0f) {
            f = 100.0f;
        }
        if(f2 < -128.0f) {
            f2 = -128.0f;
        }
        if(f2 > 128.0f) {
            f2 = 128.0f;
        }
        float f3 = (f + 16.0f) / 116.0f - f2 * 0.005f;
        return f3 > 0.206897f ? f3 * f3 * f3 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2] : 0.128419f * (f3 - 0.137931f) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long xyzaToColor-JlNiLsg$ui_graphics_release(float f, float f1, float f2, float f3, @NotNull ColorSpace colorSpace0) {
        float f4 = f / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        float f5 = f1 / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        float f6 = f2 / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        float f7 = f5 > 0.008856f ? ((float)Math.cbrt(f5)) : f5 * 7.787037f + 0.137931f;
        float f8 = 116.0f * f7 - 16.0f;
        float f9 = ((Float.compare(f4, 0.008856f) <= 0 ? f4 * 7.787037f + 0.137931f : ((float)Math.cbrt(f4))) - f7) * 500.0f;
        float f10 = (f7 - (f6 > 0.008856f ? ((float)Math.cbrt(f6)) : f6 * 7.787037f + 0.137931f)) * 200.0f;
        if(f8 < 0.0f) {
            f8 = 0.0f;
        }
        if(f8 > 100.0f) {
            f8 = 100.0f;
        }
        if(f9 < -128.0f) {
            f9 = -128.0f;
        }
        float f11 = 128.0f;
        if(f9 > 128.0f) {
            f9 = 128.0f;
        }
        if(f10 < -128.0f) {
            f10 = -128.0f;
        }
        if(f10 <= 128.0f) {
            f11 = f10;
        }
        return ColorKt.Color(f8, f9, f11, f3, colorSpace0);
    }
}

