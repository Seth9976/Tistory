package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.Size;
import androidx.compose.ui.text.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u00C6\u0002\u0018\u00002\u00020\u0001J!\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0080\b\u00A2\u0006\u0004\b\u000B\u0010\fR\u001A\u0010\u0012\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0015\u001A\u00020\u00028\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u0013\u0010\u000F\u001A\u0004\b\u0014\u0010\u0011R\u001A\u0010\u001A\u001A\u00020\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0017\u0010#\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\b!\u0010\u001D\u001A\u0004\b\"\u0010\u001FR\u0017\u0010&\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\b$\u0010\u001D\u001A\u0004\b%\u0010\u001FR\u0017\u0010)\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\b\'\u0010\u001D\u001A\u0004\b(\u0010\u001FR\u0017\u0010,\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\b*\u0010\u001D\u001A\u0004\b+\u0010\u001FR\u0017\u0010/\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\b-\u0010\u001D\u001A\u0004\b.\u0010\u001FR\u0017\u00102\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\b0\u0010\u001D\u001A\u0004\b1\u0010\u001FR\u0017\u00105\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\b3\u0010\u001D\u001A\u0004\b4\u0010\u001FR\u0017\u00108\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\b6\u0010\u001D\u001A\u0004\b7\u0010\u001FR\u0017\u0010;\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\b9\u0010\u001D\u001A\u0004\b:\u0010\u001FR\u0017\u0010>\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\b<\u0010\u001D\u001A\u0004\b=\u0010\u001FR\u0017\u0010A\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\b?\u0010\u001D\u001A\u0004\b@\u0010\u001FR\u0017\u0010D\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\bB\u0010\u001D\u001A\u0004\bC\u0010\u001FR\u0017\u0010G\u001A\u00020\u001B8\u0006\u00A2\u0006\f\n\u0004\bE\u0010\u001D\u001A\u0004\bF\u0010\u001FR\u0017\u0010L\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010KR\u0017\u0010O\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bM\u0010I\u001A\u0004\bN\u0010KR\u001A\u0010R\u001A\u00020\u001B8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bP\u0010\u001D\u001A\u0004\bQ\u0010\u001FR\u0017\u0010U\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bS\u0010I\u001A\u0004\bT\u0010KR \u0010[\u001A\b\u0012\u0004\u0012\u00020\u00060V8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bW\u0010X\u001A\u0004\bY\u0010Z\u00A8\u0006\\"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpaces;", "", "", "toXYZD50", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "function", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "match", "([FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "id", "getColorSpace$ui_graphics_release", "(I)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace", "a", "[F", "getSrgbPrimaries$ui_graphics_release", "()[F", "SrgbPrimaries", "b", "getNtsc1953Primaries$ui_graphics_release", "Ntsc1953Primaries", "c", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getSrgbTransferParameters$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "SrgbTransferParameters", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "d", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "getSrgb", "()Landroidx/compose/ui/graphics/colorspace/Rgb;", "Srgb", "e", "getLinearSrgb", "LinearSrgb", "f", "getExtendedSrgb", "ExtendedSrgb", "g", "getLinearExtendedSrgb", "LinearExtendedSrgb", "h", "getBt709", "Bt709", "i", "getBt2020", "Bt2020", "j", "getDciP3", "DciP3", "k", "getDisplayP3", "DisplayP3", "l", "getNtsc1953", "Ntsc1953", "m", "getSmpteC", "SmpteC", "n", "getAdobeRgb", "AdobeRgb", "o", "getProPhotoRgb", "ProPhotoRgb", "p", "getAces", "Aces", "q", "getAcescg", "Acescg", "r", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getCieXyz", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "CieXyz", "s", "getCieLab", "CieLab", "t", "getUnspecified$ui_graphics_release", "Unspecified", "u", "getOklab", "Oklab", "", "v", "[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpacesArray$ui_graphics_release", "()[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ColorSpacesArray", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ColorSpaces {
    @NotNull
    public static final ColorSpaces INSTANCE;
    public static final float[] a;
    public static final float[] b;
    public static final TransferParameters c;
    public static final Rgb d;
    public static final Rgb e;
    public static final Rgb f;
    public static final Rgb g;
    public static final Rgb h;
    public static final Rgb i;
    public static final Rgb j;
    public static final Rgb k;
    public static final Rgb l;
    public static final Rgb m;
    public static final Rgb n;
    public static final Rgb o;
    public static final Rgb p;
    public static final Rgb q;
    public static final Xyz r;
    public static final Lab s;
    public static final Rgb t;
    public static final Oklab u;
    public static final ColorSpace[] v;

    static {
        ColorSpaces.INSTANCE = new ColorSpaces();  // 初始化器: Ljava/lang/Object;-><init>()V
        float[] arr_f = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        ColorSpaces.a = arr_f;
        float[] arr_f1 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        ColorSpaces.b = arr_f1;
        TransferParameters transferParameters0 = new TransferParameters(2.4, 0.947867, 0.052133, 0.077399, 0.04045, 0.0, 0.0, 0x60, null);
        ColorSpaces.c = transferParameters0;
        TransferParameters transferParameters1 = new TransferParameters(2.2, 0.947867, 0.052133, 0.077399, 0.04045, 0.0, 0.0, 0x60, null);
        Rgb rgb0 = new Rgb("sRGB IEC61966-2.1", arr_f, Illuminant.INSTANCE.getD65(), transferParameters0, 0);
        ColorSpaces.d = rgb0;
        Rgb rgb1 = new Rgb("sRGB IEC61966-2.1 (Linear)", arr_f, Illuminant.INSTANCE.getD65(), 1.0, 0.0f, 1.0f, 1);
        ColorSpaces.e = rgb1;
        Rgb rgb2 = new Rgb("scRGB-nl IEC 61966-2-2:2003", arr_f, Illuminant.INSTANCE.getD65(), null, new n0(26), new n0(27), -0.799f, 2.399f, transferParameters0, 2);
        ColorSpaces.f = rgb2;
        Rgb rgb3 = new Rgb("scRGB IEC 61966-2-2:2003", arr_f, Illuminant.INSTANCE.getD65(), 1.0, -0.5f, 7.499f, 3);
        ColorSpaces.g = rgb3;
        WhitePoint whitePoint0 = Illuminant.INSTANCE.getD65();
        TransferParameters transferParameters2 = new TransferParameters(2.222222, 0.909918, 0.090082, 0.222222, 0.081, 0.0, 0.0, 0x60, null);
        Rgb rgb4 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, whitePoint0, transferParameters2, 4);
        ColorSpaces.h = rgb4;
        WhitePoint whitePoint1 = Illuminant.INSTANCE.getD65();
        TransferParameters transferParameters3 = new TransferParameters(2.222222, 0.90967, 0.09033, 0.222222, 0.08145, 0.0, 0.0, 0x60, null);
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, whitePoint1, transferParameters3, 5);
        ColorSpaces.i = rgb5;
        WhitePoint whitePoint2 = new WhitePoint(0.314f, 0.351f);
        Rgb rgb6 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, whitePoint2, 2.6, 0.0f, 1.0f, 6);
        ColorSpaces.j = rgb6;
        WhitePoint whitePoint3 = Illuminant.INSTANCE.getD65();
        Rgb rgb7 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, whitePoint3, transferParameters0, 7);
        ColorSpaces.k = rgb7;
        Rgb rgb8 = new Rgb("NTSC (1953)", arr_f1, Illuminant.INSTANCE.getC(), new TransferParameters(2.222222, 0.909918, 0.090082, 0.222222, 0.081, 0.0, 0.0, 0x60, null), 8);
        ColorSpaces.l = rgb8;
        WhitePoint whitePoint4 = Illuminant.INSTANCE.getD65();
        TransferParameters transferParameters4 = new TransferParameters(2.222222, 0.909918, 0.090082, 0.222222, 0.081, 0.0, 0.0, 0x60, null);
        Rgb rgb9 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, whitePoint4, transferParameters4, 9);
        ColorSpaces.m = rgb9;
        WhitePoint whitePoint5 = Illuminant.INSTANCE.getD65();
        Rgb rgb10 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, whitePoint5, 2.2, 0.0f, 1.0f, 10);
        ColorSpaces.n = rgb10;
        TransferParameters transferParameters5 = new TransferParameters(1.8, 1.0, 0.0, 0.0625, 0.031248, 0.0, 0.0, 0x60, null);
        Rgb rgb11 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 0.0001f}, Illuminant.INSTANCE.getD50(), transferParameters5, 11);
        ColorSpaces.o = rgb11;
        WhitePoint whitePoint6 = Illuminant.INSTANCE.getD60();
        Rgb rgb12 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 0.0001f, -0.077f}, whitePoint6, 1.0, -65504.0f, 65504.0f, 12);
        ColorSpaces.p = rgb12;
        WhitePoint whitePoint7 = Illuminant.INSTANCE.getD60();
        Rgb rgb13 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, whitePoint7, 1.0, -65504.0f, 65504.0f, 13);
        ColorSpaces.q = rgb13;
        Xyz xyz0 = new Xyz("Generic XYZ", 14);
        ColorSpaces.r = xyz0;
        Lab lab0 = new Lab("Generic L*a*b*", 15);
        ColorSpaces.s = lab0;
        Rgb rgb14 = new Rgb("None", arr_f, Illuminant.INSTANCE.getD65(), transferParameters1, 16);
        ColorSpaces.t = rgb14;
        Oklab oklab0 = new Oklab("Oklab", 17);
        ColorSpaces.u = oklab0;
        ColorSpaces.v = new ColorSpace[]{rgb0, rgb1, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, xyz0, lab0, rgb14, oklab0};
    }

    @NotNull
    public final Rgb getAces() {
        return ColorSpaces.p;
    }

    @NotNull
    public final Rgb getAcescg() {
        return ColorSpaces.q;
    }

    @NotNull
    public final Rgb getAdobeRgb() {
        return ColorSpaces.n;
    }

    @NotNull
    public final Rgb getBt2020() {
        return ColorSpaces.i;
    }

    @NotNull
    public final Rgb getBt709() {
        return ColorSpaces.h;
    }

    @NotNull
    public final ColorSpace getCieLab() {
        return ColorSpaces.s;
    }

    @NotNull
    public final ColorSpace getCieXyz() {
        return ColorSpaces.r;
    }

    @NotNull
    public final ColorSpace getColorSpace$ui_graphics_release(int v) {
        return this.getColorSpacesArray$ui_graphics_release()[v];
    }

    @NotNull
    public final ColorSpace[] getColorSpacesArray$ui_graphics_release() {
        return ColorSpaces.v;
    }

    @NotNull
    public final Rgb getDciP3() {
        return ColorSpaces.j;
    }

    @NotNull
    public final Rgb getDisplayP3() {
        return ColorSpaces.k;
    }

    @NotNull
    public final Rgb getExtendedSrgb() {
        return ColorSpaces.f;
    }

    @NotNull
    public final Rgb getLinearExtendedSrgb() {
        return ColorSpaces.g;
    }

    @NotNull
    public final Rgb getLinearSrgb() {
        return ColorSpaces.e;
    }

    @NotNull
    public final Rgb getNtsc1953() {
        return ColorSpaces.l;
    }

    @NotNull
    public final float[] getNtsc1953Primaries$ui_graphics_release() {
        return ColorSpaces.b;
    }

    @NotNull
    public final ColorSpace getOklab() {
        return ColorSpaces.u;
    }

    @NotNull
    public final Rgb getProPhotoRgb() {
        return ColorSpaces.o;
    }

    @NotNull
    public final Rgb getSmpteC() {
        return ColorSpaces.m;
    }

    @NotNull
    public final Rgb getSrgb() {
        return ColorSpaces.d;
    }

    @NotNull
    public final float[] getSrgbPrimaries$ui_graphics_release() {
        return ColorSpaces.a;
    }

    @NotNull
    public final TransferParameters getSrgbTransferParameters$ui_graphics_release() {
        return ColorSpaces.c;
    }

    @NotNull
    public final Rgb getUnspecified$ui_graphics_release() {
        return ColorSpaces.t;
    }

    @Nullable
    public final ColorSpace match(@Size(9L) @NotNull float[] arr_f, @NotNull TransferParameters transferParameters0) {
        ColorSpace[] arr_colorSpace = ColorSpaces.v;
        for(int v = 0; v < arr_colorSpace.length; ++v) {
            ColorSpace colorSpace0 = arr_colorSpace[v];
            if(ColorModel.equals-impl0(colorSpace0.getModel-xdoWZVw(), 0x300000000L)) {
                ColorSpace colorSpace1 = ColorSpaceKt.adapt$default(colorSpace0, Illuminant.INSTANCE.getD50(), null, 2, null);
                Intrinsics.checkNotNull(colorSpace1, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                if(ColorSpaceKt.compare(arr_f, ((Rgb)colorSpace1).getTransform$ui_graphics_release()) && ColorSpaceKt.compare(transferParameters0, ((Rgb)colorSpace1).getTransferParameters())) {
                    return colorSpace0;
                }
            }
        }
        return null;
    }
}

