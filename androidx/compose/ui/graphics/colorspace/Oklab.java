package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH\u0016J\u0010\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0005H\u0016J\u0010\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0005H\u0016J%\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u000EH\u0010¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH\u0016J%\u0010\u0018\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u000EH\u0010¢\u0006\u0002\b\u0019J=\u0010\u001A\u001A\u00020\u001B2\u0006\u0010\u001C\u001A\u00020\u000E2\u0006\u0010\u001D\u001A\u00020\u000E2\u0006\u0010\u001E\u001A\u00020\u000E2\u0006\u0010\u001F\u001A\u00020\u000E2\u0006\u0010 \u001A\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\t\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXy", "", "v0", "v1", "v2", "toXy$ui_graphics_release", "toXyz", "toZ", "toZ$ui_graphics_release", "xyzaToColor", "Landroidx/compose/ui/graphics/Color;", "x", "y", "z", "a", "colorSpace", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 3 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,171:1\n71#2,16:172\n71#2,16:188\n71#2,16:204\n71#2,16:220\n71#2,16:236\n71#2,16:252\n71#2,16:276\n71#2,16:292\n71#2,16:308\n716#3:268\n735#3:269\n754#3:270\n716#3:271\n735#3:272\n716#3:324\n735#3:325\n754#3:326\n754#3:327\n716#3:328\n735#3:329\n754#3:330\n716#3:331\n735#3:332\n754#3:333\n63#4,3:273\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n48#1:172,16\n49#1:188,16\n50#1:204,16\n62#1:220,16\n63#1:236,16\n64#1:252,16\n81#1:276,16\n82#1:292,16\n83#1:308,16\n66#1:268\n67#1:269\n68#1:270\n74#1:271\n75#1:272\n85#1:324\n86#1:325\n87#1:326\n93#1:327\n105#1:328\n106#1:329\n107#1:330\n113#1:331\n114#1:332\n115#1:333\n77#1:273,3\n*E\n"})
public final class Oklab extends ColorSpace {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab$Companion;", "", "", "InverseM1", "[F", "InverseM2", "M1", "M2", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final float[] d;
    public static final float[] e;
    public static final float[] f;
    public static final float[] g;

    static {
        Oklab.Companion = new Companion(null);
        float[] arr_f = Illuminant.INSTANCE.getD50().toXyz$ui_graphics_release();
        float[] arr_f1 = Illuminant.INSTANCE.getD65().toXyz$ui_graphics_release();
        float[] arr_f2 = ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics_release(), arr_f, arr_f1);
        float[] arr_f3 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032985f, 0.0482f, 0.361867f, 0.929312f, 0.264366f, -0.12886f, 0.036146f, 0.633852f}, arr_f2);
        Oklab.d = arr_f3;
        float[] arr_f4 = {0.210454f, 1.977998f, 0.025904f, 0.793618f, -2.428592f, 0.782772f, -0.004072f, 0.450594f, -0.808676f};
        Oklab.e = arr_f4;
        Oklab.f = ColorSpaceKt.inverse3x3(arr_f3);
        Oklab.g = ColorSpaceKt.inverse3x3(arr_f4);
    }

    public Oklab(@NotNull String s, int v) {
        super(s, 0x300000002L, v, null);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] arr_f) {
        ColorSpaceKt.mul3x3Float3(Oklab.d, arr_f);
        arr_f[0] = MathHelpersKt.fastCbrt(arr_f[0]);
        arr_f[1] = MathHelpersKt.fastCbrt(arr_f[1]);
        arr_f[2] = MathHelpersKt.fastCbrt(arr_f[2]);
        ColorSpaceKt.mul3x3Float3(Oklab.e, arr_f);
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int v) {
        return v == 0 ? 1.0f : 0.5f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int v) {
        return v == 0 ? 0.0f : -0.5f;
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
        if(f > 1.0f) {
            f = 1.0f;
        }
        if(f1 < -0.5f) {
            f1 = -0.5f;
        }
        float f3 = 0.5f;
        if(f1 > 0.5f) {
            f1 = 0.5f;
        }
        if(f2 < -0.5f) {
            f2 = -0.5f;
        }
        if(f2 <= 0.5f) {
            f3 = f2;
        }
        float f4 = Oklab.g[6] * f3 + (Oklab.g[3] * f1 + Oklab.g[0] * f);
        float f5 = Oklab.g[7] * f3 + (Oklab.g[4] * f1 + Oklab.g[1] * f);
        float f6 = Oklab.g[8] * f3 + (Oklab.g[5] * f1 + Oklab.g[2] * f);
        float f7 = f4 * f4 * f4;
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        return ((long)Float.floatToRawIntBits(Oklab.f[7] * f9 + (Oklab.f[4] * f8 + Oklab.f[1] * f7))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(Oklab.f[6] * f9 + (Oklab.f[3] * f8 + Oklab.f[0] * f7))) << 0x20;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] arr_f) {
        float f = arr_f[0];
        if(f < 0.0f) {
            f = 0.0f;
        }
        if(f > 1.0f) {
            f = 1.0f;
        }
        arr_f[0] = f;
        float f1 = arr_f[1];
        float f2 = -0.5f;
        if(f1 < -0.5f) {
            f1 = -0.5f;
        }
        float f3 = 0.5f;
        if(f1 > 0.5f) {
            f1 = 0.5f;
        }
        arr_f[1] = f1;
        float f4 = arr_f[2];
        if(f4 >= -0.5f) {
            f2 = f4;
        }
        if(f2 <= 0.5f) {
            f3 = f2;
        }
        arr_f[2] = f3;
        ColorSpaceKt.mul3x3Float3(Oklab.g, arr_f);
        float f5 = arr_f[0];
        arr_f[0] = f5 * f5 * f5;
        float f6 = arr_f[1];
        arr_f[1] = f6 * f6 * f6;
        float f7 = arr_f[2];
        arr_f[2] = f7 * f7 * f7;
        ColorSpaceKt.mul3x3Float3(Oklab.f, arr_f);
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f, float f1, float f2) {
        if(f < 0.0f) {
            f = 0.0f;
        }
        if(f > 1.0f) {
            f = 1.0f;
        }
        if(f1 < -0.5f) {
            f1 = -0.5f;
        }
        float f3 = 0.5f;
        if(f1 > 0.5f) {
            f1 = 0.5f;
        }
        if(f2 < -0.5f) {
            f2 = -0.5f;
        }
        if(f2 <= 0.5f) {
            f3 = f2;
        }
        float f4 = Oklab.g[6] * f3 + (Oklab.g[3] * f1 + Oklab.g[0] * f);
        float f5 = Oklab.g[7] * f3 + (Oklab.g[4] * f1 + Oklab.g[1] * f);
        float f6 = Oklab.g[8] * f3 + (Oklab.g[5] * f1 + Oklab.g[2] * f);
        return Oklab.f[8] * (f6 * f6 * f6) + (Oklab.f[5] * (f5 * f5 * f5) + Oklab.f[2] * (f4 * f4 * f4));
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long xyzaToColor-JlNiLsg$ui_graphics_release(float f, float f1, float f2, float f3, @NotNull ColorSpace colorSpace0) {
        float f4 = Oklab.d[6] * f2 + (Oklab.d[3] * f1 + Oklab.d[0] * f);
        float f5 = Oklab.d[7] * f2 + (Oklab.d[4] * f1 + Oklab.d[1] * f);
        float f6 = Oklab.d[8] * f2 + (Oklab.d[5] * f1 + Oklab.d[2] * f);
        float f7 = MathHelpersKt.fastCbrt(f4);
        float f8 = MathHelpersKt.fastCbrt(f5);
        float f9 = MathHelpersKt.fastCbrt(f6);
        return ColorKt.Color(Oklab.e[6] * f9 + (Oklab.e[3] * f8 + Oklab.e[0] * f7), Oklab.e[7] * f9 + (Oklab.e[4] * f8 + Oklab.e[1] * f7), Oklab.e[8] * f9 + (Oklab.e[5] * f8 + Oklab.e[2] * f7), f3, colorSpace0);
    }
}

