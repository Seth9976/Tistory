package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J \u0010\f\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0086\n\u00A2\u0006\u0004\b\n\u0010\u000BJ(\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\tH\u0086\n\u00A2\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0014\u001A\u00020\u000E\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0015\u001A\u00020\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u001B\u0010\u001A\u001A\u00020\u000E2\u0006\u0010\u0018\u001A\u00020\u0000H\u0086\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001E\u001A\u00020\u000E2\u0006\u0010\u001B\u001A\u00020\t\u00A2\u0006\u0004\b\u001C\u0010\u001DJ-\u0010%\u001A\u00020\u000E2\u0006\u0010\u001F\u001A\u00020\t2\u0006\u0010 \u001A\u00020\t2\u0006\u0010!\u001A\u00020\t2\u0006\u0010\"\u001A\u00020\t\u00A2\u0006\u0004\b#\u0010$J\u0015\u0010(\u001A\u00020\u000E2\u0006\u0010&\u001A\u00020\t\u00A2\u0006\u0004\b\'\u0010\u001DJ\u0015\u0010*\u001A\u00020\u000E2\u0006\u0010&\u001A\u00020\t\u00A2\u0006\u0004\b)\u0010\u001DJ\u0015\u0010,\u001A\u00020\u000E2\u0006\u0010&\u001A\u00020\t\u00A2\u0006\u0004\b+\u0010\u001DJ\r\u0010.\u001A\u00020\u000E\u00A2\u0006\u0004\b-\u0010\u0013J\r\u00100\u001A\u00020\u000E\u00A2\u0006\u0004\b/\u0010\u0013J\u0010\u00104\u001A\u000201H\u00D6\u0001\u00A2\u0006\u0004\b2\u00103J\u0010\u00107\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b5\u00106J\u001A\u0010<\u001A\u0002092\b\u00108\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006A"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", "", "values", "constructor-impl", "([F)[F", "", "row", "column", "", "get-impl", "([FII)F", "get", "v", "", "set-impl", "([FIIF)V", "set", "reset-impl", "([F)V", "reset", "src", "set-jHG-Opc", "([F[F)V", "colorMatrix", "timesAssign-jHG-Opc", "timesAssign", "sat", "setToSaturation-impl", "([FF)V", "setToSaturation", "redScale", "greenScale", "blueScale", "alphaScale", "setToScale-impl", "([FFFFF)V", "setToScale", "degrees", "setToRotateRed-impl", "setToRotateRed", "setToRotateGreen-impl", "setToRotateGreen", "setToRotateBlue-impl", "setToRotateBlue", "convertRgbToYuv-impl", "convertRgbToYuv", "convertYuvToRgb-impl", "convertYuvToRgb", "", "toString-impl", "([F)Ljava/lang/String;", "toString", "hashCode-impl", "([F)I", "hashCode", "other", "", "equals-impl", "([FLjava/lang/Object;)Z", "equals", "a", "[F", "getValues", "()[F", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nColorMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n1#1,330:1\n98#1,2:331\n98#1,2:333\n98#1,2:335\n98#1,2:337\n84#1:339\n84#1:340\n84#1:341\n84#1:342\n84#1:343\n84#1:344\n84#1:345\n84#1:346\n84#1:347\n84#1:348\n84#1:349\n84#1:350\n84#1:351\n84#1:352\n84#1:353\n84#1:354\n84#1:355\n84#1:356\n84#1:357\n84#1:358\n98#1,2:359\n98#1,2:361\n98#1,2:363\n98#1,2:365\n98#1,2:367\n98#1,2:369\n98#1,2:371\n98#1,2:373\n98#1,2:375\n98#1,2:377\n98#1,2:379\n98#1,2:381\n98#1,2:383\n98#1,2:385\n98#1,2:387\n98#1,2:389\n98#1,2:391\n98#1,2:393\n98#1,2:395\n98#1,2:397\n84#1:399\n84#1:400\n84#1:401\n84#1:402\n98#1,2:403\n98#1,2:405\n98#1,2:407\n98#1,2:409\n98#1,2:411\n98#1,2:413\n98#1,2:415\n98#1,2:417\n98#1,2:419\n98#1,2:421\n98#1,2:423\n98#1,2:425\n98#1,2:427\n134#1,5:429\n98#1,2:434\n98#1,2:436\n98#1,2:438\n98#1,2:440\n139#1:442\n134#1,5:443\n98#1,2:448\n98#1,2:450\n98#1,2:452\n98#1,2:454\n139#1:456\n134#1,5:457\n98#1,2:462\n98#1,2:464\n98#1,2:466\n98#1,2:468\n139#1:470\n98#1,2:471\n98#1,2:473\n98#1,2:475\n98#1,2:477\n98#1,2:479\n98#1,2:481\n98#1,2:483\n98#1,2:485\n98#1,2:487\n98#1,2:489\n98#1,2:491\n98#1,2:493\n98#1,2:495\n98#1,2:497\n98#1,2:499\n98#1,2:501\n*S KotlinDebug\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n112#1:331,2\n113#1:333,2\n114#1:335,2\n115#1:337,2\n149#1:339\n150#1:340\n151#1:341\n152#1:342\n153#1:343\n159#1:344\n160#1:345\n161#1:346\n162#1:347\n163#1:348\n169#1:349\n170#1:350\n171#1:351\n172#1:352\n173#1:353\n179#1:354\n180#1:355\n181#1:356\n182#1:357\n183#1:358\n185#1:359,2\n186#1:361,2\n187#1:363,2\n188#1:365,2\n189#1:367,2\n190#1:369,2\n191#1:371,2\n192#1:373,2\n193#1:375,2\n194#1:377,2\n195#1:379,2\n196#1:381,2\n197#1:383,2\n198#1:385,2\n199#1:387,2\n200#1:389,2\n201#1:391,2\n202#1:393,2\n203#1:395,2\n204#1:397,2\n212#1:399\n213#1:400\n214#1:401\n215#1:402\n229#1:403,2\n230#1:405,2\n231#1:407,2\n232#1:409,2\n233#1:411,2\n234#1:413,2\n235#1:415,2\n236#1:417,2\n237#1:419,2\n256#1:421,2\n257#1:423,2\n258#1:425,2\n259#1:427,2\n266#1:429,5\n267#1:434,2\n268#1:436,2\n269#1:438,2\n270#1:440,2\n266#1:442\n278#1:443,5\n279#1:448,2\n280#1:450,2\n281#1:452,2\n282#1:454,2\n278#1:456\n290#1:457,5\n291#1:462,2\n292#1:464,2\n293#1:466,2\n294#1:468,2\n290#1:470\n304#1:471,2\n305#1:473,2\n306#1:475,2\n307#1:477,2\n308#1:479,2\n309#1:481,2\n310#1:483,2\n311#1:485,2\n312#1:487,2\n321#1:489,2\n322#1:491,2\n323#1:493,2\n324#1:495,2\n325#1:497,2\n326#1:499,2\n327#1:501,2\n*E\n"})
public final class ColorMatrix {
    public final float[] a;

    public ColorMatrix(float[] arr_f) {
        this.a = arr_f;
    }

    public static final float a(float[] arr_f, int v, float[] arr_f1, int v1) {
        return arr_f[v * 5 + 3] * arr_f1[v1 + 15] + (arr_f[v * 5 + 2] * arr_f1[v1 + 10] + (arr_f[v * 5 + 1] * arr_f1[v1 + 5] + arr_f[v * 5] * arr_f1[v1]));
    }

    public static final ColorMatrix box-impl(float[] arr_f) {
        return new ColorMatrix(arr_f);
    }

    @NotNull
    public static float[] constructor-impl(@NotNull float[] arr_f) [...] // Inlined contents

    public static float[] constructor-impl$default(float[] arr_f, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        return (v & 1) == 0 ? arr_f : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }

    public static final void convertRgbToYuv-impl(float[] arr_f) {
        ColorMatrix.reset-impl(arr_f);
        arr_f[0] = 0.299f;
        arr_f[1] = 0.587f;
        arr_f[2] = 0.114f;
        arr_f[5] = -0.16874f;
        arr_f[6] = -0.33126f;
        arr_f[7] = 0.5f;
        arr_f[10] = 0.5f;
        arr_f[11] = -0.41869f;
        arr_f[12] = -0.08131f;
    }

    public static final void convertYuvToRgb-impl(float[] arr_f) {
        ColorMatrix.reset-impl(arr_f);
        arr_f[2] = 1.402f;
        arr_f[5] = 1.0f;
        arr_f[6] = -0.34414f;
        arr_f[7] = -0.71414f;
        arr_f[10] = 1.0f;
        arr_f[11] = 1.772f;
        arr_f[12] = 0.0f;
    }

    @Override
    public boolean equals(Object object0) {
        return ColorMatrix.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(float[] arr_f, Object object0) {
        return object0 instanceof ColorMatrix ? Intrinsics.areEqual(arr_f, ((ColorMatrix)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(float[] arr_f, float[] arr_f1) {
        return Intrinsics.areEqual(arr_f, arr_f1);
    }

    public static final float get-impl(float[] arr_f, int v, int v1) {
        return arr_f[v * 5 + v1];
    }

    @NotNull
    public final float[] getValues() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return ColorMatrix.hashCode-impl(this.a);
    }

    public static int hashCode-impl(float[] arr_f) {
        return Arrays.hashCode(arr_f);
    }

    public static final void reset-impl(float[] arr_f) {
        ArraysKt___ArraysJvmKt.fill$default(arr_f, 0.0f, 0, 0, 6, null);
        arr_f[0] = 1.0f;
        arr_f[12] = 1.0f;
        arr_f[6] = 1.0f;
        arr_f[18] = 1.0f;
    }

    public static final void set-impl(float[] arr_f, int v, int v1, float f) {
        arr_f[v * 5 + v1] = f;
    }

    public static final void set-jHG-Opc(float[] arr_f, @NotNull float[] arr_f1) {
        ArraysKt___ArraysJvmKt.copyInto$default(arr_f1, arr_f, 0, 0, 0, 14, null);
    }

    public static final void setToRotateBlue-impl(float[] arr_f, float f) {
        ColorMatrix.reset-impl(arr_f);
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        arr_f[6] = f2;
        arr_f[0] = f2;
        arr_f[1] = f3;
        arr_f[5] = -f3;
    }

    public static final void setToRotateGreen-impl(float[] arr_f, float f) {
        ColorMatrix.reset-impl(arr_f);
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        arr_f[12] = f2;
        arr_f[0] = f2;
        arr_f[2] = -f3;
        arr_f[10] = f3;
    }

    public static final void setToRotateRed-impl(float[] arr_f, float f) {
        ColorMatrix.reset-impl(arr_f);
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        arr_f[12] = f2;
        arr_f[6] = f2;
        arr_f[7] = f3;
        arr_f[11] = -f3;
    }

    public static final void setToSaturation-impl(float[] arr_f, float f) {
        ColorMatrix.reset-impl(arr_f);
        float f1 = 0.213f * (1.0f - f);
        float f2 = 0.715f * (1.0f - f);
        float f3 = (1.0f - f) * 0.072f;
        arr_f[0] = f1 + f;
        arr_f[1] = f2;
        arr_f[2] = f3;
        arr_f[5] = f1;
        arr_f[6] = f2 + f;
        arr_f[7] = f3;
        arr_f[10] = f1;
        arr_f[11] = f2;
        arr_f[12] = f3 + f;
    }

    public static final void setToScale-impl(float[] arr_f, float f, float f1, float f2, float f3) {
        ColorMatrix.reset-impl(arr_f);
        arr_f[0] = f;
        arr_f[6] = f1;
        arr_f[12] = f2;
        arr_f[18] = f3;
    }

    public static final void timesAssign-jHG-Opc(float[] arr_f, @NotNull float[] arr_f1) {
        float f = ColorMatrix.a(arr_f, 0, arr_f1, 0);
        float f1 = ColorMatrix.a(arr_f, 0, arr_f1, 1);
        float f2 = ColorMatrix.a(arr_f, 0, arr_f1, 2);
        float f3 = ColorMatrix.a(arr_f, 0, arr_f1, 3);
        float f4 = arr_f[3] * arr_f1[19] + (arr_f[2] * arr_f1[14] + (arr_f[1] * arr_f1[9] + arr_f[0] * arr_f1[4])) + arr_f[4];
        float f5 = ColorMatrix.a(arr_f, 1, arr_f1, 0);
        float f6 = ColorMatrix.a(arr_f, 1, arr_f1, 1);
        float f7 = ColorMatrix.a(arr_f, 1, arr_f1, 2);
        float f8 = ColorMatrix.a(arr_f, 1, arr_f1, 3);
        float f9 = arr_f[8] * arr_f1[19] + (arr_f[7] * arr_f1[14] + (arr_f[6] * arr_f1[9] + arr_f[5] * arr_f1[4])) + arr_f[9];
        float f10 = ColorMatrix.a(arr_f, 2, arr_f1, 0);
        float f11 = ColorMatrix.a(arr_f, 2, arr_f1, 1);
        float f12 = ColorMatrix.a(arr_f, 2, arr_f1, 2);
        float f13 = ColorMatrix.a(arr_f, 2, arr_f1, 3);
        float f14 = arr_f[13] * arr_f1[19] + (arr_f[12] * arr_f1[14] + (arr_f[11] * arr_f1[9] + arr_f[10] * arr_f1[4])) + arr_f[14];
        float f15 = ColorMatrix.a(arr_f, 3, arr_f1, 0);
        float f16 = ColorMatrix.a(arr_f, 3, arr_f1, 1);
        float f17 = ColorMatrix.a(arr_f, 3, arr_f1, 2);
        float f18 = ColorMatrix.a(arr_f, 3, arr_f1, 3);
        float f19 = arr_f[18] * arr_f1[19] + (arr_f[17] * arr_f1[14] + (arr_f[16] * arr_f1[9] + arr_f[15] * arr_f1[4])) + arr_f[19];
        arr_f[0] = f;
        arr_f[1] = f1;
        arr_f[2] = f2;
        arr_f[3] = f3;
        arr_f[4] = f4;
        arr_f[5] = f5;
        arr_f[6] = f6;
        arr_f[7] = f7;
        arr_f[8] = f8;
        arr_f[9] = f9;
        arr_f[10] = f10;
        arr_f[11] = f11;
        arr_f[12] = f12;
        arr_f[13] = f13;
        arr_f[14] = f14;
        arr_f[15] = f15;
        arr_f[16] = f16;
        arr_f[17] = f17;
        arr_f[18] = f18;
        arr_f[19] = f19;
    }

    @Override
    public String toString() {
        return ColorMatrix.toString-impl(this.a);
    }

    public static String toString-impl(float[] arr_f) {
        return "ColorMatrix(values=" + Arrays.toString(arr_f) + ')';
    }

    public final float[] unbox-impl() {
        return this.a;
    }
}

