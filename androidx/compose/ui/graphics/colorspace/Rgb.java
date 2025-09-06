package androidx.compose.ui.graphics.colorspace;

import androidx.annotation.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.n0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q1.a;
import q1.b;
import q1.c;
import q1.d;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b-\u0018\u0000 w2\u00020\u0001:\u0001wB]\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\f\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0013\u0010\u0014BE\b\u0016\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001A\u00020\u0004\u0012\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0018B]\b\u0016\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\f\u00A2\u0006\u0004\b\u0013\u0010\u0019B%\b\u0016\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001A\u00020\u0004\u0012\u0006\u0010\u001A\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0013\u0010\u001BB-\b\u0016\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\u001A\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0013\u0010\u001CB1\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\u001A\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0013\u0010\u001DB%\b\u0016\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0015\u001A\u00020\u0004\u0012\u0006\u0010\u001E\u001A\u00020\u0017\u00A2\u0006\u0004\b\u0013\u0010\u001FB-\b\u0016\u0012\b\b\u0001\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\u001E\u001A\u00020\u0017\u00A2\u0006\u0004\b\u0013\u0010 BA\b\u0010\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\u001E\u001A\u00020\u0017\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\f\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0013\u0010!B!\b\u0010\u0012\u0006\u0010\"\u001A\u00020\u0000\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0013\u0010#J\u000F\u0010$\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b$\u0010%J\u000F\u0010&\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b&\u0010%J\u000F\u0010\'\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\'\u0010%J\u0019\u0010$\u001A\u00020\u00042\b\b\u0001\u0010\u0005\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b$\u0010(J\u0019\u0010&\u001A\u00020\u00042\b\b\u0001\u0010\b\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b&\u0010(J\u0019\u0010\'\u001A\u00020\u00042\b\b\u0001\u0010)\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\'\u0010(J\u0017\u0010+\u001A\u00020\f2\u0006\u0010*\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b+\u0010,J\u0017\u0010-\u001A\u00020\f2\u0006\u0010*\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b-\u0010,J\'\u00101\u001A\u00020\u00042\u0006\u0010.\u001A\u00020\f2\u0006\u0010/\u001A\u00020\f2\u0006\u00100\u001A\u00020\fH\u0007\u00A2\u0006\u0004\b1\u00102J\u0019\u00101\u001A\u00020\u00042\b\b\u0001\u00103\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b1\u0010(J\'\u00104\u001A\u00020\u00042\u0006\u0010.\u001A\u00020\f2\u0006\u0010/\u001A\u00020\f2\u0006\u00100\u001A\u00020\fH\u0007\u00A2\u0006\u0004\b4\u00102J\u0019\u00104\u001A\u00020\u00042\b\b\u0001\u00103\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b4\u0010(J\u0017\u00105\u001A\u00020\u00042\u0006\u00103\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b5\u0010(J\'\u0010<\u001A\u0002092\u0006\u00106\u001A\u00020\f2\u0006\u00107\u001A\u00020\f2\u0006\u00108\u001A\u00020\fH\u0010\u00A2\u0006\u0004\b:\u0010;J\'\u0010?\u001A\u00020\f2\u0006\u00106\u001A\u00020\f2\u0006\u00107\u001A\u00020\f2\u0006\u00108\u001A\u00020\fH\u0010\u00A2\u0006\u0004\b=\u0010>J=\u0010G\u001A\u00020D2\u0006\u0010@\u001A\u00020\f2\u0006\u0010A\u001A\u00020\f2\u0006\u0010B\u001A\u00020\f2\u0006\u0010C\u001A\u00020\f2\u0006\u0010\"\u001A\u00020\u0001H\u0010\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001A\u00020\u00042\u0006\u00103\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\bH\u0010(J\u001A\u0010L\u001A\u00020K2\b\u0010J\u001A\u0004\u0018\u00010IH\u0096\u0002\u00A2\u0006\u0004\bL\u0010MJ\u000F\u0010N\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\bN\u0010OR\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010SR\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u000F8\u0006\u00A2\u0006\f\n\u0004\b/\u0010T\u001A\u0004\bU\u0010VR\u001A\u0010\u0005\u001A\u00020\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bW\u0010X\u001A\u0004\bY\u0010%R\u001A\u0010\b\u001A\u00020\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bZ\u0010X\u001A\u0004\b[\u0010%R\u001A\u0010)\u001A\u00020\u00048\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b\\\u0010X\u001A\u0004\b]\u0010%R\u001A\u0010b\u001A\u00020\t8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b`\u0010aR#\u0010\n\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00168\u0006\u00A2\u0006\f\n\u0004\bc\u0010d\u001A\u0004\be\u0010fR\u001A\u0010i\u001A\u00020\t8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bg\u0010_\u001A\u0004\bh\u0010aR\u001A\u0010l\u001A\u00020\t8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bj\u0010_\u001A\u0004\bk\u0010aR#\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u00168\u0006\u00A2\u0006\f\n\u0004\bm\u0010d\u001A\u0004\bn\u0010fR\u001A\u0010q\u001A\u00020\t8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bo\u0010_\u001A\u0004\bp\u0010aR\u001A\u0010t\u001A\u00020K8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\br\u0010s\u001A\u0004\bt\u0010uR\u001A\u0010v\u001A\u00020K8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b.\u0010s\u001A\u0004\bv\u0010u\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006x"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "primaries", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "transform", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "oetf", "eotf", "", "min", "max", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "transferParameters", "", "id", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "toXYZ", "Lkotlin/Function1;", "", "(Ljava/lang/String;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FF)V", "function", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "getPrimaries", "()[F", "getTransform", "getInverseTransform", "([F)[F", "inverseTransform", "component", "getMinValue", "(I)F", "getMaxValue", "r", "g", "b", "toLinear", "(FFF)[F", "v", "fromLinear", "toXyz", "v0", "v1", "v2", "", "toXy$ui_graphics_release", "(FFF)J", "toXy", "toZ$ui_graphics_release", "(FFF)F", "toZ", "x", "y", "z", "a", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "d", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "h", "[F", "getPrimaries$ui_graphics_release", "i", "getTransform$ui_graphics_release", "j", "getInverseTransform$ui_graphics_release", "k", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "getOetfOrig$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "oetfOrig", "l", "Lkotlin/jvm/functions/Function1;", "getOetf", "()Lkotlin/jvm/functions/Function1;", "m", "getOetfFunc$ui_graphics_release", "oetfFunc", "n", "getEotfOrig$ui_graphics_release", "eotfOrig", "o", "getEotf", "p", "getEotfFunc$ui_graphics_release", "eotfFunc", "q", "Z", "isWideGamut", "()Z", "isSrgb", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaceKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1382:1\n716#2:1383\n735#2:1384\n754#2:1388\n716#2:1389\n735#2:1390\n754#2:1391\n63#3,3:1385\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n897#1:1383\n898#1:1384\n908#1:1388\n920#1:1389\n921#1:1390\n922#1:1391\n900#1:1385,3\n*E\n"})
public final class Rgb extends ColorSpace {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001A\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "", "toXYZ", "computePrimaries$ui_graphics_release", "([F)[F", "computePrimaries", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static float a(float[] arr_f) {
            float f = arr_f[0];
            float f1 = arr_f[1];
            float f2 = arr_f[2];
            float f3 = arr_f[3];
            float f4 = arr_f[4];
            float f5 = q.z(f, arr_f[5], f2 * arr_f[5] + (f1 * f4 + f * f3) - f3 * f4 - f1 * f2, 0.5f);
            return f5 < 0.0f ? -f5 : f5;
        }

        public static final WhitePoint access$computeWhitePoint(Companion rgb$Companion0, float[] arr_f) {
            rgb$Companion0.getClass();
            float[] arr_f1 = ColorSpaceKt.mul3x3Float3(arr_f, new float[]{1.0f, 1.0f, 1.0f});
            float f = arr_f1[0];
            float f1 = arr_f1[1];
            float f2 = f + f1 + arr_f1[2];
            return new WhitePoint(f / f2, f1 / f2);
        }

        public static final float[] access$computeXYZMatrix(Companion rgb$Companion0, float[] arr_f, WhitePoint whitePoint0) {
            rgb$Companion0.getClass();
            float f = arr_f[0];
            float f1 = arr_f[1];
            float f2 = arr_f[2];
            float f3 = arr_f[3];
            float f4 = arr_f[4];
            float f5 = arr_f[5];
            float f6 = whitePoint0.getX();
            float f7 = whitePoint0.getY();
            float f8 = (1.0f - f) / f1;
            float f9 = f / f1;
            float f10 = f2 / f3 - f9;
            float f11 = f6 / f7 - f9;
            float f12 = (1.0f - f2) / f3 - f8;
            float f13 = f4 / f5 - f9;
            float f14 = (((1.0f - f6) / f7 - f8) * f10 - f11 * f12) / (((1.0f - f4) / f5 - f8) * f10 - f12 * f13);
            float f15 = (f11 - f14 * f13) / f10;
            float f16 = 1.0f - f15 - f14;
            return new float[]{f16 / f1 * f, f16, (1.0f - f - f1) * (f16 / f1), f15 / f3 * f2, f15, (1.0f - f2 - f3) * (f15 / f3), f14 / f5 * f4, f14, (1.0f - f4 - f5) * (f14 / f5)};
        }

        public static final boolean access$isSrgb(Companion rgb$Companion0, float[] arr_f, WhitePoint whitePoint0, DoubleFunction doubleFunction0, DoubleFunction doubleFunction1, float f, float f1, int v) {
            rgb$Companion0.getClass();
            if(v != 0) {
                ColorSpaces colorSpaces0 = ColorSpaces.INSTANCE;
                if(ColorSpaceKt.compare(arr_f, colorSpaces0.getSrgbPrimaries$ui_graphics_release()) && (ColorSpaceKt.compare(whitePoint0, Illuminant.INSTANCE.getD65()) && f == 0.0f && f1 == 1.0f)) {
                    Rgb rgb0 = colorSpaces0.getSrgb();
                    for(double f2 = 0.0; f2 <= 1.0; f2 += 0.003922) {
                        if(Math.abs(doubleFunction0.invoke(f2) - rgb0.getOetfOrig$ui_graphics_release().invoke(f2)) > 0.001 || Math.abs(doubleFunction1.invoke(f2) - rgb0.getEotfOrig$ui_graphics_release().invoke(f2)) > 0.001) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }

        public static final boolean access$isWideGamut(Companion rgb$Companion0, float[] arr_f, float f, float f1) {
            rgb$Companion0.getClass();
            ColorSpaces colorSpaces0 = ColorSpaces.INSTANCE;
            if(Companion.a(arr_f) / Companion.a(colorSpaces0.getNtsc1953Primaries$ui_graphics_release()) > 0.9f) {
                float[] arr_f1 = colorSpaces0.getSrgbPrimaries$ui_graphics_release();
                float f2 = arr_f[0];
                float f3 = arr_f1[0];
                float f4 = arr_f[1];
                float f5 = arr_f1[1];
                float f6 = arr_f[2] - arr_f1[2];
                float f7 = arr_f[3] - arr_f1[3];
                float f8 = arr_f[4];
                float f9 = arr_f1[4];
                new float[]{f2 - f3, f4 - f5, f6, f7, f8 - f9, arr_f[5] - arr_f1[5]};
                float f10 = arr_f[5] - arr_f1[5];
                return Companion.b(f2 - f3, f4 - f5, f3 - f9, f5 - arr_f1[5]) >= 0.0f && Companion.b(arr_f1[0] - arr_f1[2], arr_f1[1] - arr_f1[3], f2 - f3, f4 - f5) >= 0.0f && Companion.b(f6, f7, arr_f1[2] - arr_f1[0], arr_f1[3] - arr_f1[1]) >= 0.0f && Companion.b(arr_f1[2] - arr_f1[4], arr_f1[3] - arr_f1[5], f6, f7) >= 0.0f && Companion.b(f8 - f9, f10, arr_f1[4] - arr_f1[2], arr_f1[5] - arr_f1[3]) >= 0.0f && Companion.b(arr_f1[4] - arr_f1[0], arr_f1[5] - arr_f1[1], f8 - f9, f10) >= 0.0f ? true : f < 0.0f && f1 > 1.0f;
            }
            return f < 0.0f && f1 > 1.0f;
        }

        public static final float[] access$xyPrimaries(Companion rgb$Companion0, float[] arr_f) {
            rgb$Companion0.getClass();
            float[] arr_f1 = new float[6];
            if(arr_f.length == 9) {
                float f = arr_f[0];
                float f1 = arr_f[1];
                float f2 = f + f1 + arr_f[2];
                arr_f1[0] = f / f2;
                arr_f1[1] = f1 / f2;
                float f3 = arr_f[3];
                float f4 = arr_f[4];
                float f5 = f3 + f4 + arr_f[5];
                arr_f1[2] = f3 / f5;
                arr_f1[3] = f4 / f5;
                float f6 = arr_f[6];
                float f7 = arr_f[7];
                float f8 = f6 + f7 + arr_f[8];
                arr_f1[4] = f6 / f8;
                arr_f1[5] = f7 / f8;
                return arr_f1;
            }
            ArraysKt___ArraysJvmKt.copyInto$default(arr_f, arr_f1, 0, 0, 6, 6, null);
            return arr_f1;
        }

        public static float b(float f, float f1, float f2, float f3) {
            return f * f3 - f1 * f2;
        }

        @NotNull
        public final float[] computePrimaries$ui_graphics_release(@NotNull float[] arr_f) {
            float[] arr_f1 = ColorSpaceKt.mul3x3Float3(arr_f, new float[]{1.0f, 0.0f, 0.0f});
            float[] arr_f2 = ColorSpaceKt.mul3x3Float3(arr_f, new float[]{0.0f, 1.0f, 0.0f});
            float[] arr_f3 = ColorSpaceKt.mul3x3Float3(arr_f, new float[]{0.0f, 0.0f, 1.0f});
            float f = arr_f1[0];
            float f1 = arr_f1[1];
            float f2 = f + f1 + arr_f1[2];
            float f3 = arr_f2[0];
            float f4 = arr_f2[1];
            float f5 = f3 + f4 + arr_f2[2];
            float f6 = arr_f3[0];
            float f7 = arr_f3[1];
            float f8 = f6 + f7 + arr_f3[2];
            return new float[]{f / f2, f1 / f2, f3 / f5, f4 / f5, f6 / f8, f7 / f8};
        }
    }

    @NotNull
    public static final Companion Companion;
    public final WhitePoint d;
    public final float e;
    public final float f;
    public final TransferParameters g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final DoubleFunction k;
    public final d l;
    public final a m;
    public final DoubleFunction n;
    public final d o;
    public final a p;
    public final boolean q;
    public final boolean r;
    public static final n0 s;

    static {
        Rgb.Companion = new Companion(null);
        Rgb.s = new n0(28);
    }

    public Rgb(@NotNull Rgb rgb0, @NotNull float[] arr_f, @NotNull WhitePoint whitePoint0) {
        this(rgb0.getName(), rgb0.h, whitePoint0, arr_f, rgb0.k, rgb0.n, rgb0.e, rgb0.f, rgb0.g, -1);
    }

    public Rgb(@Size(min = 1L) @NotNull String s, @Size(9L) @NotNull float[] arr_f, double f) {
        this(s, Rgb.Companion.computePrimaries$ui_graphics_release(arr_f), Companion.access$computeWhitePoint(Rgb.Companion, arr_f), f, 0.0f, 1.0f, -1);
    }

    public Rgb(@Size(min = 1L) @NotNull String s, @Size(9L) @NotNull float[] arr_f, @NotNull TransferParameters transferParameters0) {
        this(s, Rgb.Companion.computePrimaries$ui_graphics_release(arr_f), Companion.access$computeWhitePoint(Rgb.Companion, arr_f), transferParameters0, -1);
    }

    public Rgb(@Size(min = 1L) @NotNull String s, @Size(max = 9L, min = 6L) @NotNull float[] arr_f, @NotNull WhitePoint whitePoint0, double f) {
        this(s, arr_f, whitePoint0, f, 0.0f, 1.0f, -1);
    }

    public Rgb(@NotNull String s, @NotNull float[] arr_f, @NotNull WhitePoint whitePoint0, double f, float f1, float f2, int v) {
        int v1 = Double.compare(f, 1.0);
        n0 n00 = Rgb.s;
        n0 n01 = v1 == 0 ? n00 : new c(f, 0);
        if(v1 != 0) {
            n00 = new c(f, 1);
        }
        this(s, arr_f, whitePoint0, null, n01, n00, f1, f2, new TransferParameters(f, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0x60, null), v);
    }

    public Rgb(@Size(min = 1L) @NotNull String s, @Size(max = 9L, min = 6L) @NotNull float[] arr_f, @NotNull WhitePoint whitePoint0, @NotNull TransferParameters transferParameters0) {
        this(s, arr_f, whitePoint0, transferParameters0, -1);
    }

    public Rgb(@NotNull String s, @NotNull float[] arr_f, @NotNull WhitePoint whitePoint0, @NotNull TransferParameters transferParameters0, int v) {
        this(s, arr_f, whitePoint0, null, (transferParameters0.getE() != 0.0 || transferParameters0.getF() != 0.0 ? new b(transferParameters0, 0) : new b(transferParameters0, 3)), (transferParameters0.getE() != 0.0 || transferParameters0.getF() != 0.0 ? new b(transferParameters0, 2) : new b(transferParameters0, 1)), 0.0f, 1.0f, transferParameters0, v);
    }

    public Rgb(@Size(min = 1L) @NotNull String s, @Size(max = 9L, min = 6L) @NotNull float[] arr_f, @NotNull WhitePoint whitePoint0, @NotNull Function1 function10, @NotNull Function1 function11, float f, float f1) {
        this(s, arr_f, whitePoint0, null, new i1.b(function10, 3), new i1.b(function11, 4), f, f1, null, -1);
    }

    public Rgb(@NotNull String s, @NotNull float[] arr_f, @NotNull WhitePoint whitePoint0, @Nullable float[] arr_f1, @NotNull DoubleFunction doubleFunction0, @NotNull DoubleFunction doubleFunction1, float f, float f1, @Nullable TransferParameters transferParameters0, int v) {
        super(s, 0x300000000L, v, null);
        this.d = whitePoint0;
        this.e = f;
        this.f = f1;
        this.g = transferParameters0;
        this.k = doubleFunction0;
        this.l = new d(this, 1);
        this.m = new a(this, 0);
        this.n = doubleFunction1;
        this.o = new d(this, 0);
        this.p = new a(this, 1);
        if(arr_f.length != 6 && arr_f.length != 9) {
            throw new IllegalArgumentException("The color space\'s primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if(f >= f1) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f1 + "; min must be strictly < max");
        }
        Companion rgb$Companion0 = Rgb.Companion;
        float[] arr_f2 = Companion.access$xyPrimaries(rgb$Companion0, arr_f);
        this.h = arr_f2;
        if(arr_f1 == null) {
            this.i = Companion.access$computeXYZMatrix(rgb$Companion0, arr_f2, whitePoint0);
        }
        else if(arr_f1.length == 9) {
            this.i = arr_f1;
        }
        else {
            throw new IllegalArgumentException("Transform must have 9 entries! Has " + arr_f1.length);
        }
        this.j = ColorSpaceKt.inverse3x3(this.i);
        this.q = Companion.access$isWideGamut(rgb$Companion0, arr_f2, f, f1);
        this.r = Companion.access$isSrgb(rgb$Companion0, arr_f2, whitePoint0, doubleFunction0, doubleFunction1, f, f1, v);
    }

    public Rgb(@Size(min = 1L) @NotNull String s, @Size(9L) @NotNull float[] arr_f, @NotNull Function1 function10, @NotNull Function1 function11) {
        this(s, Rgb.Companion.computePrimaries$ui_graphics_release(arr_f), Companion.access$computeWhitePoint(Rgb.Companion, arr_f), null, new i1.b(function10, 1), new i1.b(function11, 2), 0.0f, 1.0f, null, -1);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(Rgb.class != class0 || !super.equals(object0)) {
                return false;
            }
            if(Float.compare(((Rgb)object0).e, this.e) != 0) {
                return false;
            }
            if(Float.compare(((Rgb)object0).f, this.f) != 0) {
                return false;
            }
            if(!Intrinsics.areEqual(this.d, ((Rgb)object0).d)) {
                return false;
            }
            if(!Arrays.equals(this.h, ((Rgb)object0).h)) {
                return false;
            }
            TransferParameters transferParameters0 = ((Rgb)object0).g;
            TransferParameters transferParameters1 = this.g;
            if(transferParameters1 != null) {
                return Intrinsics.areEqual(transferParameters1, transferParameters0);
            }
            if(transferParameters0 == null) {
                return true;
            }
            return Intrinsics.areEqual(this.k, ((Rgb)object0).k) ? Intrinsics.areEqual(this.n, ((Rgb)object0).n) : false;
        }
        return false;
    }

    @Size(3L)
    @NotNull
    public final float[] fromLinear(float f, float f1, float f2) {
        return this.fromLinear(new float[]{f, f1, f2});
    }

    @Size(min = 3L)
    @NotNull
    public final float[] fromLinear(@Size(min = 3L) @NotNull float[] arr_f) {
        arr_f[0] = (float)this.m.invoke(((double)arr_f[0]));
        arr_f[1] = (float)this.m.invoke(((double)arr_f[1]));
        arr_f[2] = (float)this.m.invoke(((double)arr_f[2]));
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] arr_f) {
        ColorSpaceKt.mul3x3Float3(this.j, arr_f);
        arr_f[0] = (float)this.m.invoke(((double)arr_f[0]));
        arr_f[1] = (float)this.m.invoke(((double)arr_f[1]));
        arr_f[2] = (float)this.m.invoke(((double)arr_f[2]));
        return arr_f;
    }

    @NotNull
    public final Function1 getEotf() {
        return this.o;
    }

    @NotNull
    public final DoubleFunction getEotfFunc$ui_graphics_release() {
        return this.p;
    }

    @NotNull
    public final DoubleFunction getEotfOrig$ui_graphics_release() {
        return this.n;
    }

    @Size(9L)
    @NotNull
    public final float[] getInverseTransform() {
        float[] arr_f = Arrays.copyOf(this.j, this.j.length);
        Intrinsics.checkNotNullExpressionValue(arr_f, "copyOf(this, size)");
        return arr_f;
    }

    @Size(min = 9L)
    @NotNull
    public final float[] getInverseTransform(@Size(min = 9L) @NotNull float[] arr_f) {
        return ArraysKt___ArraysJvmKt.copyInto$default(this.j, arr_f, 0, 0, 0, 14, null);
    }

    @NotNull
    public final float[] getInverseTransform$ui_graphics_release() {
        return this.j;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int v) {
        return this.f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int v) {
        return this.e;
    }

    @NotNull
    public final Function1 getOetf() {
        return this.l;
    }

    @NotNull
    public final DoubleFunction getOetfFunc$ui_graphics_release() {
        return this.m;
    }

    @NotNull
    public final DoubleFunction getOetfOrig$ui_graphics_release() {
        return this.k;
    }

    @Size(6L)
    @NotNull
    public final float[] getPrimaries() {
        float[] arr_f = Arrays.copyOf(this.h, this.h.length);
        Intrinsics.checkNotNullExpressionValue(arr_f, "copyOf(this, size)");
        return arr_f;
    }

    @Size(min = 6L)
    @NotNull
    public final float[] getPrimaries(@Size(min = 6L) @NotNull float[] arr_f) {
        return ArraysKt___ArraysJvmKt.copyInto$default(this.h, arr_f, 0, 0, 0, 14, null);
    }

    @NotNull
    public final float[] getPrimaries$ui_graphics_release() {
        return this.h;
    }

    @Nullable
    public final TransferParameters getTransferParameters() {
        return this.g;
    }

    @Size(9L)
    @NotNull
    public final float[] getTransform() {
        float[] arr_f = Arrays.copyOf(this.i, this.i.length);
        Intrinsics.checkNotNullExpressionValue(arr_f, "copyOf(this, size)");
        return arr_f;
    }

    @Size(min = 9L)
    @NotNull
    public final float[] getTransform(@Size(min = 9L) @NotNull float[] arr_f) {
        return ArraysKt___ArraysJvmKt.copyInto$default(this.i, arr_f, 0, 0, 0, 14, null);
    }

    @NotNull
    public final float[] getTransform$ui_graphics_release() {
        return this.i;
    }

    @NotNull
    public final WhitePoint getWhitePoint() {
        return this.d;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int v = super.hashCode();
        int v1 = this.d.hashCode();
        int v2 = Arrays.hashCode(this.h);
        int v3 = 0;
        int v4 = Float.compare(this.e, 0.0f) == 0 ? 0 : Float.floatToIntBits(this.e);
        int v5 = this.f == 0.0f ? 0 : Float.floatToIntBits(this.f);
        TransferParameters transferParameters0 = this.g;
        if(transferParameters0 != null) {
            v3 = transferParameters0.hashCode();
        }
        int v6 = (((v2 + (v1 + v * 0x1F) * 0x1F) * 0x1F + v4) * 0x1F + v5) * 0x1F + v3;
        return transferParameters0 == null ? this.n.hashCode() + (this.k.hashCode() + v6 * 0x1F) * 0x1F : v6;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.r;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return this.q;
    }

    @Size(3L)
    @NotNull
    public final float[] toLinear(float f, float f1, float f2) {
        return this.toLinear(new float[]{f, f1, f2});
    }

    @Size(min = 3L)
    @NotNull
    public final float[] toLinear(@Size(min = 3L) @NotNull float[] arr_f) {
        arr_f[0] = (float)this.p.invoke(((double)arr_f[0]));
        arr_f[1] = (float)this.p.invoke(((double)arr_f[1]));
        arr_f[2] = (float)this.p.invoke(((double)arr_f[2]));
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f, float f1, float f2) {
        float f3 = (float)this.p.invoke(((double)f));
        float f4 = (float)this.p.invoke(((double)f1));
        float f5 = (float)this.p.invoke(((double)f2));
        return ((long)Float.floatToRawIntBits(this.i[7] * f5 + (this.i[4] * f4 + this.i[1] * f3))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(this.i[6] * f5 + (this.i[3] * f4 + this.i[0] * f3))) << 0x20;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] arr_f) {
        arr_f[0] = (float)this.p.invoke(((double)arr_f[0]));
        arr_f[1] = (float)this.p.invoke(((double)arr_f[1]));
        arr_f[2] = (float)this.p.invoke(((double)arr_f[2]));
        return ColorSpaceKt.mul3x3Float3(this.i, arr_f);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f, float f1, float f2) {
        float f3 = (float)this.p.invoke(((double)f));
        float f4 = (float)this.p.invoke(((double)f1));
        float f5 = (float)this.p.invoke(((double)f2));
        return this.i[8] * f5 + (this.i[5] * f4 + this.i[2] * f3);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long xyzaToColor-JlNiLsg$ui_graphics_release(float f, float f1, float f2, float f3, @NotNull ColorSpace colorSpace0) {
        float f4 = this.j[6] * f2 + (this.j[3] * f1 + this.j[0] * f);
        float f5 = this.j[7] * f2 + (this.j[4] * f1 + this.j[1] * f);
        float f6 = this.j[8] * f2 + (this.j[5] * f1 + this.j[2] * f);
        return ColorKt.Color(((float)this.m.invoke(((double)f4))), ((float)this.m.invoke(((double)f5))), ((float)this.m.invoke(((double)f6))), f3, colorSpace0);
    }
}

