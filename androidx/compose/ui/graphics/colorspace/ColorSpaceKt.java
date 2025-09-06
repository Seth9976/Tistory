package androidx.compose.ui.graphics.colorspace;

import androidx.collection.MutableIntObjectMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000E\u001A(\u0010\u0007\u001A\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0005\u0010\u0006\u001A%\u0010\f\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\nH\u0007\u00A2\u0006\u0004\b\f\u0010\r\u001A?\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u0015\u0010\u0016\u001A?\u0010\u0017\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0016\u001AO\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0018\u001A\u00020\u000E2\u0006\u0010\u0019\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u0015\u0010\u001A\u001AO\u0010\u0017\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0018\u001A\u00020\u000E2\u0006\u0010\u0019\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u0017\u0010\u001A\u001A?\u0010\u001B\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u001B\u0010\u0016\u001A?\u0010\u001C\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u0014\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u001C\u0010\u0016\u001A!\u0010\u001F\u001A\u00020\u001E2\u0006\u0010\u0010\u001A\u00020\u001D2\b\u0010\u0011\u001A\u0004\u0018\u00010\u001DH\u0000\u00A2\u0006\u0004\b\u001F\u0010 \u001A\u001F\u0010\u001F\u001A\u00020\u001E2\u0006\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0011\u001A\u00020\bH\u0000\u00A2\u0006\u0004\b\u001F\u0010!\u001A\u001F\u0010\u001F\u001A\u00020\u001E2\u0006\u0010\u0010\u001A\u00020\"2\u0006\u0010\u0011\u001A\u00020\"H\u0000\u00A2\u0006\u0004\b\u001F\u0010#\u001A\u0017\u0010%\u001A\u00020\"2\u0006\u0010$\u001A\u00020\"H\u0000\u00A2\u0006\u0004\b%\u0010&\u001A\u001F\u0010)\u001A\u00020\"2\u0006\u0010\'\u001A\u00020\"2\u0006\u0010(\u001A\u00020\"H\u0000\u00A2\u0006\u0004\b)\u0010*\u001A\u001F\u0010+\u001A\u00020\"2\u0006\u0010\'\u001A\u00020\"2\u0006\u0010(\u001A\u00020\"H\u0000\u00A2\u0006\u0004\b+\u0010*\u001A0\u00100\u001A\u00020,2\u0006\u0010\'\u001A\u00020\"2\u0006\u0010-\u001A\u00020,2\u0006\u0010.\u001A\u00020,2\u0006\u0010/\u001A\u00020,H\u0080\b\u00A2\u0006\u0004\b0\u00101\u001A0\u00102\u001A\u00020,2\u0006\u0010\'\u001A\u00020\"2\u0006\u0010-\u001A\u00020,2\u0006\u0010.\u001A\u00020,2\u0006\u0010/\u001A\u00020,H\u0080\b\u00A2\u0006\u0004\b2\u00101\u001A0\u00103\u001A\u00020,2\u0006\u0010\'\u001A\u00020\"2\u0006\u0010-\u001A\u00020,2\u0006\u0010.\u001A\u00020,2\u0006\u0010/\u001A\u00020,H\u0080\b\u00A2\u0006\u0004\b3\u00101\u001A\u001F\u00104\u001A\u00020\"2\u0006\u0010\'\u001A\u00020\"2\u0006\u0010(\u001A\u00020\"H\u0000\u00A2\u0006\u0004\b4\u0010*\u001A\'\u00108\u001A\u00020\"2\u0006\u00105\u001A\u00020\"2\u0006\u00106\u001A\u00020\"2\u0006\u00107\u001A\u00020\"H\u0000\u00A2\u0006\u0004\b8\u00109\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006:"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "intent", "Landroidx/compose/ui/graphics/colorspace/Connector;", "connect-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "connect", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "adaptation", "adapt", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/Adaptation;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "x", "a", "b", "c", "d", "g", "rcpResponse", "(DDDDDD)D", "response", "e", "f", "(DDDDDDDD)D", "absRcpResponse", "absResponse", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "", "compare", "(Landroidx/compose/ui/graphics/colorspace/TransferParameters;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)Z", "(Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/WhitePoint;)Z", "", "([F[F)Z", "m", "inverse3x3", "([F)[F", "lhs", "rhs", "mul3x3", "([F[F)[F", "mul3x3Float3", "", "r0", "r1", "r2", "mul3x3Float3_0", "([FFFF)F", "mul3x3Float3_1", "mul3x3Float3_2", "mul3x3Diag", "matrix", "srcWhitePoint", "dstWhitePoint", "chromaticAdaptation", "([F[F[F)[F", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 2 Connector.kt\nandroidx/compose/ui/graphics/colorspace/ConnectorKt\n+ 3 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,802:1\n347#2:803\n728#3:804\n1#4:805\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n*L\n460#1:803\n460#1:804\n460#1:805\n*E\n"})
public final class ColorSpaceKt {
    public static final Connector a(ColorSpace colorSpace0, ColorSpace colorSpace1, int v) {
        if(colorSpace0 == colorSpace1) {
            return Connector.Companion.identity$ui_graphics_release(colorSpace0);
        }
        if(ColorModel.equals-impl0(colorSpace0.getModel-xdoWZVw(), 0x300000000L) && ColorModel.equals-impl0(colorSpace1.getModel-xdoWZVw(), 0x300000000L)) {
            Intrinsics.checkNotNull(colorSpace0, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Intrinsics.checkNotNull(colorSpace1, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            return new RgbConnector(((Rgb)colorSpace0), ((Rgb)colorSpace1), v, null);
        }
        return new Connector(colorSpace0, colorSpace1, v, null);
    }

    public static final double absRcpResponse(double f, double f1, double f2, double f3, double f4, double f5) {
        return f < 0.0 ? Math.copySign(ColorSpaceKt.rcpResponse(-f, f1, f2, f3, f4, f5), f) : Math.copySign(ColorSpaceKt.rcpResponse(f, f1, f2, f3, f4, f5), f);
    }

    public static final double absResponse(double f, double f1, double f2, double f3, double f4, double f5) {
        return f < 0.0 ? Math.copySign(ColorSpaceKt.response(-f, f1, f2, f3, f4, f5), f) : Math.copySign(ColorSpaceKt.response(f, f1, f2, f3, f4, f5), f);
    }

    @JvmOverloads
    @NotNull
    public static final ColorSpace adapt(@NotNull ColorSpace colorSpace0, @NotNull WhitePoint whitePoint0) {
        return ColorSpaceKt.adapt$default(colorSpace0, whitePoint0, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public static final ColorSpace adapt(@NotNull ColorSpace colorSpace0, @NotNull WhitePoint whitePoint0, @NotNull Adaptation adaptation0) {
        if(ColorModel.equals-impl0(colorSpace0.getModel-xdoWZVw(), 0x300000000L)) {
            Intrinsics.checkNotNull(colorSpace0, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            if(ColorSpaceKt.compare(((Rgb)colorSpace0).getWhitePoint(), whitePoint0)) {
                return colorSpace0;
            }
            float[] arr_f = whitePoint0.toXyz$ui_graphics_release();
            return new Rgb(((Rgb)colorSpace0), ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(adaptation0.getTransform$ui_graphics_release(), ((Rgb)colorSpace0).getWhitePoint().toXyz$ui_graphics_release(), arr_f), ((Rgb)colorSpace0).getTransform$ui_graphics_release()), whitePoint0);
        }
        return colorSpace0;
    }

    public static ColorSpace adapt$default(ColorSpace colorSpace0, WhitePoint whitePoint0, Adaptation adaptation0, int v, Object object0) {
        if((v & 2) != 0) {
            adaptation0 = Adaptation.Companion.getBradford();
        }
        return ColorSpaceKt.adapt(colorSpace0, whitePoint0, adaptation0);
    }

    @NotNull
    public static final float[] chromaticAdaptation(@NotNull float[] arr_f, @NotNull float[] arr_f1, @NotNull float[] arr_f2) {
        float[] arr_f3 = ColorSpaceKt.mul3x3Float3(arr_f, arr_f1);
        float[] arr_f4 = ColorSpaceKt.mul3x3Float3(arr_f, arr_f2);
        float[] arr_f5 = {arr_f4[0] / arr_f3[0], arr_f4[1] / arr_f3[1], arr_f4[2] / arr_f3[2]};
        return ColorSpaceKt.mul3x3(ColorSpaceKt.inverse3x3(arr_f), ColorSpaceKt.mul3x3Diag(arr_f5, arr_f));
    }

    public static final boolean compare(@NotNull TransferParameters transferParameters0, @Nullable TransferParameters transferParameters1) {
        return transferParameters1 != null && Math.abs(transferParameters0.getA() - transferParameters1.getA()) < 0.001 && Math.abs(transferParameters0.getB() - transferParameters1.getB()) < 0.001 && Math.abs(transferParameters0.getC() - transferParameters1.getC()) < 0.001 && Math.abs(transferParameters0.getD() - transferParameters1.getD()) < 0.002 && Math.abs(transferParameters0.getE() - transferParameters1.getE()) < 0.001 && Math.abs(transferParameters0.getF() - transferParameters1.getF()) < 0.001 && Math.abs(transferParameters0.getGamma() - transferParameters1.getGamma()) < 0.001;
    }

    public static final boolean compare(@NotNull WhitePoint whitePoint0, @NotNull WhitePoint whitePoint1) {
        return whitePoint0 == whitePoint1 ? true : Math.abs(whitePoint0.getX() - whitePoint1.getX()) < 0.001f && Math.abs(whitePoint0.getY() - whitePoint1.getY()) < 0.001f;
    }

    public static final boolean compare(@NotNull float[] arr_f, @NotNull float[] arr_f1) {
        if(arr_f == arr_f1) {
            return true;
        }
        for(int v = 0; v < arr_f.length; ++v) {
            if(Float.compare(arr_f[v], arr_f1[v]) != 0 && Math.abs(arr_f[v] - arr_f1[v]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final Connector connect-YBCOT_4(@NotNull ColorSpace colorSpace0, @NotNull ColorSpace colorSpace1, int v) {
        int v1 = colorSpace0.getId$ui_graphics_release();
        int v2 = colorSpace1.getId$ui_graphics_release();
        if((v1 | v2) < 0) {
            return ColorSpaceKt.a(colorSpace0, colorSpace1, v);
        }
        MutableIntObjectMap mutableIntObjectMap0 = ConnectorKt.getConnectors();
        int v3 = v1 | v2 << 6 | v << 12;
        Connector connector0 = mutableIntObjectMap0.get(v3);
        if(connector0 == null) {
            connector0 = ColorSpaceKt.a(colorSpace0, colorSpace1, v);
            mutableIntObjectMap0.set(v3, connector0);
        }
        return connector0;
    }

    public static Connector connect-YBCOT_4$default(ColorSpace colorSpace0, ColorSpace colorSpace1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            colorSpace1 = ColorSpaces.INSTANCE.getSrgb();
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        return ColorSpaceKt.connect-YBCOT_4(colorSpace0, colorSpace1, v);
    }

    @NotNull
    public static final float[] inverse3x3(@NotNull float[] arr_f) {
        float f = arr_f[0];
        float f1 = arr_f[3];
        float f2 = arr_f[6];
        float f3 = arr_f[1];
        float f4 = arr_f[4];
        float f5 = arr_f[7];
        float f6 = arr_f[2];
        float f7 = arr_f[5];
        float f8 = arr_f[8];
        float f9 = f4 * f8 - f5 * f7;
        float f10 = f5 * f6 - f3 * f8;
        float f11 = f3 * f7 - f4 * f6;
        float f12 = f2 * f11 + (f1 * f10 + f * f9);
        float[] arr_f1 = new float[arr_f.length];
        arr_f1[0] = f9 / f12;
        arr_f1[1] = f10 / f12;
        arr_f1[2] = f11 / f12;
        arr_f1[3] = (f2 * f7 - f1 * f8) / f12;
        arr_f1[4] = (f8 * f - f2 * f6) / f12;
        arr_f1[5] = (f6 * f1 - f * f7) / f12;
        arr_f1[6] = (f1 * f5 - f2 * f4) / f12;
        arr_f1[7] = (f2 * f3 - f * f5) / f12;
        arr_f1[8] = (f * f4 - f1 * f3) / f12;
        return arr_f1;
    }

    @NotNull
    public static final float[] mul3x3(@NotNull float[] arr_f, @NotNull float[] arr_f1) {
        float f = arr_f[0];
        float f1 = arr_f1[0];
        float f2 = arr_f[3];
        float f3 = arr_f1[1];
        float f4 = arr_f[6];
        float f5 = arr_f1[2];
        float f6 = arr_f[1];
        float f7 = arr_f[4];
        float f8 = arr_f[7];
        float f9 = arr_f[2];
        float f10 = arr_f[5];
        float f11 = arr_f[8];
        float f12 = arr_f1[3];
        float f13 = arr_f1[4];
        float f14 = f4 * arr_f1[5] + (f2 * f13 + f * f12);
        float f15 = f8 * arr_f1[5] + (f7 * f13 + f6 * f12);
        float f16 = arr_f1[5] * f11 + (f13 * f10 + f12 * f9);
        float f17 = arr_f1[6];
        float f18 = arr_f1[7];
        return new float[]{f4 * f5 + (f2 * f3 + f * f1), f8 * f5 + (f7 * f3 + f6 * f1), f5 * f11 + (f3 * f10 + f1 * f9), f14, f15, f16, f4 * arr_f1[8] + (f2 * f18 + f * f17), f8 * arr_f1[8] + (f7 * f18 + f6 * f17), f11 * arr_f1[8] + (f10 * f18 + f9 * f17)};
    }

    @NotNull
    public static final float[] mul3x3Diag(@NotNull float[] arr_f, @NotNull float[] arr_f1) {
        float f = arr_f[0];
        float f1 = arr_f1[0] * f;
        float f2 = arr_f[1];
        float f3 = arr_f1[1] * f2;
        float f4 = arr_f[2];
        return new float[]{f1, f3, arr_f1[2] * f4, arr_f1[3] * f, arr_f1[4] * f2, arr_f1[5] * f4, f * arr_f1[6], f2 * arr_f1[7], f4 * arr_f1[8]};
    }

    @NotNull
    public static final float[] mul3x3Float3(@NotNull float[] arr_f, @NotNull float[] arr_f1) {
        float f = arr_f1[0];
        float f1 = arr_f1[1];
        float f2 = arr_f1[2];
        arr_f1[0] = arr_f[6] * f2 + (arr_f[3] * f1 + arr_f[0] * f);
        arr_f1[1] = arr_f[7] * f2 + (arr_f[4] * f1 + arr_f[1] * f);
        arr_f1[2] = arr_f[8] * f2 + (arr_f[5] * f1 + arr_f[2] * f);
        return arr_f1;
    }

    public static final float mul3x3Float3_0(@NotNull float[] arr_f, float f, float f1, float f2) {
        return arr_f[6] * f2 + (arr_f[3] * f1 + arr_f[0] * f);
    }

    public static final float mul3x3Float3_1(@NotNull float[] arr_f, float f, float f1, float f2) {
        return arr_f[7] * f2 + (arr_f[4] * f1 + arr_f[1] * f);
    }

    public static final float mul3x3Float3_2(@NotNull float[] arr_f, float f, float f1, float f2) {
        return arr_f[8] * f2 + (arr_f[5] * f1 + arr_f[2] * f);
    }

    public static final double rcpResponse(double f, double f1, double f2, double f3, double f4, double f5) {
        return f >= f4 * f3 ? (Math.pow(f, 1.0 / f5) - f2) / f1 : f / f3;
    }

    public static final double rcpResponse(double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7) {
        return f >= f4 * f3 ? (Math.pow(f - f5, 1.0 / f7) - f2) / f1 : (f - f6) / f3;
    }

    public static final double response(double f, double f1, double f2, double f3, double f4, double f5) {
        return f >= f4 ? Math.pow(f1 * f + f2, f5) : f * f3;
    }

    public static final double response(double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7) {
        return f >= f4 ? Math.pow(f1 * f + f2, f7) + f5 : f3 * f + f6;
    }
}

