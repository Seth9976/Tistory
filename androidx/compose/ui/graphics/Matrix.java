package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.k;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u001F\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087@\u0018\u0000 I2\u00020\u0001:\u0001IB\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J \u0010\f\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0086\n\u00A2\u0006\u0004\b\n\u0010\u000BJ(\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\tH\u0086\n\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0018\u0010\u0016\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0012\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0015\u0010\u0016\u001A\u00020\u000E2\u0006\u0010\u0018\u001A\u00020\u001B\u00A2\u0006\u0004\b\u0019\u0010\u001CJ\u001B\u0010 \u001A\u00020\u000E2\u0006\u0010\u001D\u001A\u00020\u0000H\u0086\u0002\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010$\u001A\u00020!H\u0016\u00A2\u0006\u0004\b\"\u0010#J\r\u0010\'\u001A\u00020\u000E\u00A2\u0006\u0004\b%\u0010&J\r\u0010)\u001A\u00020\u000E\u00A2\u0006\u0004\b(\u0010&J\u0018\u0010,\u001A\u00020\u000E2\u0006\u0010*\u001A\u00020\u0000\u00F8\u0001\u0000\u00A2\u0006\u0004\b+\u0010\u001FJ\u0015\u00100\u001A\u00020\u000E2\u0006\u0010-\u001A\u00020\t\u00A2\u0006\u0004\b.\u0010/J\u0015\u00102\u001A\u00020\u000E2\u0006\u0010-\u001A\u00020\t\u00A2\u0006\u0004\b1\u0010/J\u0015\u00104\u001A\u00020\u000E2\u0006\u0010-\u001A\u00020\t\u00A2\u0006\u0004\b3\u0010/J+\u0010:\u001A\u00020\u000E2\b\b\u0002\u00105\u001A\u00020\t2\b\b\u0002\u00106\u001A\u00020\t2\b\b\u0002\u00107\u001A\u00020\t\u00A2\u0006\u0004\b8\u00109J+\u0010<\u001A\u00020\u000E2\b\b\u0002\u00105\u001A\u00020\t2\b\b\u0002\u00106\u001A\u00020\t2\b\b\u0002\u00107\u001A\u00020\t\u00A2\u0006\u0004\b;\u00109J\u0010\u0010?\u001A\u00020\u0006H\u00D6\u0001\u00A2\u0006\u0004\b=\u0010>J\u001A\u0010D\u001A\u00020A2\b\u0010@\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bE\u0010F\u001A\u0004\bG\u0010H\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006J"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "", "values", "constructor-impl", "([F)[F", "", "row", "column", "", "get-impl", "([FII)F", "get", "v", "", "set-impl", "([FIIF)V", "set", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "map", "Landroidx/compose/ui/geometry/Rect;", "rect", "map-impl", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/MutableRect;", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "m", "timesAssign-58bKbWc", "([F[F)V", "timesAssign", "", "toString-impl", "([F)Ljava/lang/String;", "toString", "invert-impl", "([F)V", "invert", "reset-impl", "reset", "matrix", "setFrom-58bKbWc", "setFrom", "degrees", "rotateX-impl", "([FF)V", "rotateX", "rotateY-impl", "rotateY", "rotateZ-impl", "rotateZ", "x", "y", "z", "scale-impl", "([FFFF)V", "scale", "translate-impl", "translate", "hashCode-impl", "([F)I", "hashCode", "other", "", "equals-impl", "([FLjava/lang/Object;)Z", "equals", "a", "[F", "getValues", "()[F", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,441:1\n39#1:442\n39#1:443\n39#1:444\n42#1,2:445\n42#1,2:447\n42#1,2:449\n42#1,2:451\n42#1,2:453\n42#1,2:455\n42#1,2:457\n42#1,2:459\n42#1,2:461\n42#1,2:463\n42#1,2:465\n42#1,2:467\n42#1,2:469\n42#1,2:471\n42#1,2:473\n42#1,2:475\n39#1:477\n39#1:478\n39#1:479\n39#1:480\n39#1:481\n39#1:482\n39#1:483\n39#1:484\n39#1:485\n39#1:486\n39#1:487\n39#1:488\n39#1:489\n39#1:490\n39#1:491\n39#1:492\n39#1:493\n39#1:494\n39#1:495\n39#1:496\n42#1,2:497\n42#1,2:499\n42#1,2:501\n42#1,2:503\n42#1,2:505\n42#1,2:507\n42#1,2:509\n42#1,2:511\n42#1,2:513\n42#1,2:515\n42#1,2:517\n42#1,2:519\n42#1,2:521\n42#1,2:523\n42#1,2:525\n42#1,2:527\n42#1,2:529\n39#1:531\n39#1:532\n39#1:533\n39#1:534\n39#1:535\n39#1:536\n39#1:537\n39#1:538\n42#1,2:539\n42#1,2:541\n42#1,2:543\n42#1,2:545\n42#1,2:547\n42#1,2:549\n42#1,2:551\n42#1,2:553\n39#1:555\n39#1:556\n39#1:557\n39#1:558\n39#1:559\n39#1:560\n39#1:561\n39#1:562\n42#1,2:563\n42#1,2:565\n42#1,2:567\n42#1,2:569\n42#1,2:571\n42#1,2:573\n42#1,2:575\n42#1,2:577\n39#1:579\n39#1:580\n39#1:581\n39#1:582\n39#1:583\n39#1:584\n39#1:585\n39#1:586\n42#1,2:587\n42#1,2:589\n42#1,2:591\n42#1,2:593\n42#1,2:595\n42#1,2:597\n42#1,2:599\n42#1,2:601\n39#1,5:603\n39#1,5:608\n39#1,5:613\n39#1,5:618\n39#1,5:623\n39#1,5:628\n39#1,5:633\n39#1,5:638\n39#1,5:643\n39#1,5:648\n39#1,5:653\n39#1,5:658\n39#1:663\n39#1:664\n39#1:665\n39#1:666\n39#1:667\n39#1:668\n39#1:669\n39#1:670\n39#1:671\n39#1:672\n39#1:673\n39#1:674\n39#1:675\n39#1:676\n39#1:677\n39#1:678\n42#1,2:679\n42#1,2:681\n42#1,2:683\n42#1,2:685\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n51#1:442\n56#1:443\n57#1:444\n112#1:445,2\n113#1:447,2\n114#1:449,2\n115#1:451,2\n116#1:453,2\n117#1:455,2\n118#1:457,2\n119#1:459,2\n120#1:461,2\n121#1:463,2\n122#1:465,2\n123#1:467,2\n124#1:469,2\n125#1:471,2\n126#1:473,2\n127#1:475,2\n132#1:477\n133#1:478\n134#1:479\n135#1:480\n143#1:481\n144#1:482\n145#1:483\n146#1:484\n147#1:485\n148#1:486\n149#1:487\n150#1:488\n151#1:489\n152#1:490\n153#1:491\n154#1:492\n155#1:493\n156#1:494\n157#1:495\n158#1:496\n177#1:497,2\n178#1:499,2\n179#1:501,2\n180#1:503,2\n181#1:505,2\n182#1:507,2\n183#1:509,2\n184#1:511,2\n185#1:513,2\n186#1:515,2\n187#1:517,2\n188#1:519,2\n189#1:521,2\n190#1:523,2\n191#1:525,2\n192#1:527,2\n201#1:529,2\n220#1:531\n221#1:532\n225#1:533\n226#1:534\n230#1:535\n231#1:536\n235#1:537\n236#1:538\n240#1:539,2\n241#1:541,2\n242#1:543,2\n243#1:545,2\n244#1:547,2\n245#1:549,2\n246#1:551,2\n247#1:553,2\n257#1:555\n258#1:556\n262#1:557\n263#1:558\n267#1:559\n268#1:560\n272#1:561\n273#1:562\n277#1:563,2\n278#1:565,2\n279#1:567,2\n280#1:569,2\n281#1:571,2\n282#1:573,2\n283#1:575,2\n284#1:577,2\n294#1:579\n295#1:580\n299#1:581\n300#1:582\n304#1:583\n305#1:584\n309#1:585\n310#1:586\n314#1:587,2\n315#1:589,2\n316#1:591,2\n317#1:593,2\n318#1:595,2\n319#1:597,2\n320#1:599,2\n321#1:601,2\n326#1:603,5\n327#1:608,5\n328#1:613,5\n329#1:618,5\n330#1:623,5\n331#1:628,5\n332#1:633,5\n333#1:638,5\n334#1:643,5\n335#1:648,5\n336#1:653,5\n337#1:658,5\n342#1:663\n343#1:664\n344#1:665\n345#1:666\n346#1:667\n347#1:668\n348#1:669\n349#1:670\n350#1:671\n351#1:672\n352#1:673\n353#1:674\n354#1:675\n355#1:676\n356#1:677\n357#1:678\n358#1:679,2\n359#1:681,2\n360#1:683,2\n361#1:685,2\n*E\n"})
public final class Matrix {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\u0004R\u0014\u0010\f\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000E\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000E\u0010\u0004¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/graphics/Matrix$Companion;", "", "", "Perspective0", "I", "Perspective1", "Perspective2", "ScaleX", "ScaleY", "ScaleZ", "SkewX", "SkewY", "TranslateX", "TranslateY", "TranslateZ", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    public final float[] a;

    static {
        Matrix.Companion = new Companion(null);
    }

    public Matrix(float[] arr_f) {
        this.a = arr_f;
    }

    public static final Matrix box-impl(float[] arr_f) {
        return new Matrix(arr_f);
    }

    @NotNull
    public static float[] constructor-impl(@NotNull float[] arr_f) [...] // Inlined contents

    public static float[] constructor-impl$default(float[] arr_f, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        return (v & 1) == 0 ? arr_f : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    @Override
    public boolean equals(Object object0) {
        return Matrix.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(float[] arr_f, Object object0) {
        return object0 instanceof Matrix ? Intrinsics.areEqual(arr_f, ((Matrix)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(float[] arr_f, float[] arr_f1) {
        return Intrinsics.areEqual(arr_f, arr_f1);
    }

    public static final float get-impl(float[] arr_f, int v, int v1) {
        return arr_f[v * 4 + v1];
    }

    @NotNull
    public final float[] getValues() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return Matrix.hashCode-impl(this.a);
    }

    public static int hashCode-impl(float[] arr_f) {
        return Arrays.hashCode(arr_f);
    }

    public static final void invert-impl(float[] arr_f) {
        float f = arr_f[0];
        float f1 = arr_f[1];
        float f2 = arr_f[2];
        float f3 = arr_f[3];
        float f4 = arr_f[4];
        float f5 = arr_f[5];
        float f6 = arr_f[6];
        float f7 = arr_f[7];
        float f8 = arr_f[8];
        float f9 = arr_f[9];
        float f10 = arr_f[10];
        float f11 = arr_f[11];
        float f12 = arr_f[12];
        float f13 = arr_f[13];
        float f14 = arr_f[14];
        float f15 = arr_f[15];
        float f16 = f * f5 - f1 * f4;
        float f17 = f * f6 - f2 * f4;
        float f18 = f * f7 - f3 * f4;
        float f19 = f1 * f6 - f2 * f5;
        float f20 = f1 * f7 - f3 * f5;
        float f21 = f2 * f7 - f3 * f6;
        float f22 = f8 * f13 - f9 * f12;
        float f23 = f8 * f14 - f10 * f12;
        float f24 = f8 * f15 - f11 * f12;
        float f25 = f9 * f14 - f10 * f13;
        float f26 = f9 * f15 - f11 * f13;
        float f27 = f10 * f15 - f11 * f14;
        float f28 = f21 * f22 + (f19 * f24 + (f18 * f25 + (f16 * f27 - f17 * f26)) - f20 * f23);
        if(f28 == 0.0f) {
            return;
        }
        arr_f[0] = a.a(f7, f25, f5 * f27 - f6 * f26, 1.0f / f28);
        arr_f[1] = q.z(f3, f25, f2 * f26 + -f1 * f27, 1.0f / f28);
        arr_f[2] = a.a(f15, f19, f13 * f21 - f14 * f20, 1.0f / f28);
        arr_f[3] = q.z(f11, f19, f10 * f20 + -f9 * f21, 1.0f / f28);
        arr_f[4] = q.z(f7, f23, f6 * f24 + -f4 * f27, 1.0f / f28);
        arr_f[5] = a.a(f3, f23, f * f27 - f2 * f24, 1.0f / f28);
        arr_f[6] = q.z(f15, f17, f14 * f18 + -f12 * f21, 1.0f / f28);
        arr_f[7] = a.a(f11, f17, f8 * f21 - f10 * f18, 1.0f / f28);
        arr_f[8] = a.a(f7, f22, f4 * f26 - f5 * f24, 1.0f / f28);
        arr_f[9] = q.z(f3, f22, f1 * f24 + -f * f26, 1.0f / f28);
        arr_f[10] = a.a(f15, f16, f12 * f20 - f13 * f18, 1.0f / f28);
        arr_f[11] = q.z(f11, f16, f18 * f9 + -f8 * f20, 1.0f / f28);
        arr_f[12] = q.z(f6, f22, f5 * f23 + -f4 * f25, 1.0f / f28);
        arr_f[13] = a.a(f2, f22, f * f25 - f1 * f23, 1.0f / f28);
        arr_f[14] = q.z(f14, f16, f13 * f17 + -f12 * f19, 1.0f / f28);
        arr_f[15] = a.a(f10, f16, f8 * f19 - f9 * f17, 1.0f / f28);
    }

    public static final long map-MK-Hz9U(float[] arr_f, long v) {
        float f = Offset.getX-impl(v);
        float f1 = Offset.getY-impl(v);
        float f2 = 1.0f / (arr_f[7] * f1 + arr_f[3] * f + arr_f[15]);
        if(Float.isInfinite(f2) || Float.isNaN(f2)) {
            f2 = 0.0f;
        }
        return OffsetKt.Offset((arr_f[4] * f1 + arr_f[0] * f + arr_f[12]) * f2, (arr_f[5] * f1 + arr_f[1] * f + arr_f[13]) * f2);
    }

    @NotNull
    public static final Rect map-impl(float[] arr_f, @NotNull Rect rect0) {
        long v = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(rect0.getLeft(), rect0.getTop()));
        long v1 = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(rect0.getLeft(), rect0.getBottom()));
        long v2 = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(rect0.getRight(), rect0.getTop()));
        long v3 = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(rect0.getRight(), rect0.getBottom()));
        return new Rect(Math.min(Math.min(Offset.getX-impl(v), Offset.getX-impl(v1)), Math.min(Offset.getX-impl(v2), Offset.getX-impl(v3))), Math.min(Math.min(Offset.getY-impl(v), Offset.getY-impl(v1)), Math.min(Offset.getY-impl(v2), Offset.getY-impl(v3))), Math.max(Math.max(Offset.getX-impl(v), Offset.getX-impl(v1)), Math.max(Offset.getX-impl(v2), Offset.getX-impl(v3))), Math.max(Math.max(Offset.getY-impl(v), Offset.getY-impl(v1)), Math.max(Offset.getY-impl(v2), Offset.getY-impl(v3))));
    }

    public static final void map-impl(float[] arr_f, @NotNull MutableRect mutableRect0) {
        long v = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(mutableRect0.getLeft(), mutableRect0.getTop()));
        long v1 = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(mutableRect0.getLeft(), mutableRect0.getBottom()));
        long v2 = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(mutableRect0.getRight(), mutableRect0.getTop()));
        long v3 = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(mutableRect0.getRight(), mutableRect0.getBottom()));
        mutableRect0.setLeft(Math.min(Math.min(Offset.getX-impl(v), Offset.getX-impl(v1)), Math.min(Offset.getX-impl(v2), Offset.getX-impl(v3))));
        mutableRect0.setTop(Math.min(Math.min(Offset.getY-impl(v), Offset.getY-impl(v1)), Math.min(Offset.getY-impl(v2), Offset.getY-impl(v3))));
        mutableRect0.setRight(Math.max(Math.max(Offset.getX-impl(v), Offset.getX-impl(v1)), Math.max(Offset.getX-impl(v2), Offset.getX-impl(v3))));
        mutableRect0.setBottom(Math.max(Math.max(Offset.getY-impl(v), Offset.getY-impl(v1)), Math.max(Offset.getY-impl(v2), Offset.getY-impl(v3))));
    }

    public static final void reset-impl(float[] arr_f) {
        for(int v = 0; v < 4; ++v) {
            for(int v1 = 0; v1 < 4; ++v1) {
                arr_f[v1 * 4 + v] = v == v1 ? 1.0f : 0.0f;
            }
        }
    }

    public static final void rotateX-impl(float[] arr_f, float f) {
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        float f4 = arr_f[1];
        float f5 = f4 * f2 - arr_f[2] * f3;
        float f6 = arr_f[2] * f2 + f4 * f3;
        float f7 = arr_f[5];
        float f8 = f7 * f2 - arr_f[6] * f3;
        float f9 = arr_f[6] * f2 + f7 * f3;
        float f10 = arr_f[9];
        float f11 = f10 * f2 - arr_f[10] * f3;
        float f12 = arr_f[10] * f2 + f10 * f3;
        float f13 = arr_f[13];
        float f14 = f13 * f2 - arr_f[14] * f3;
        float f15 = arr_f[14] * f2 + f13 * f3;
        arr_f[1] = f5;
        arr_f[2] = f6;
        arr_f[5] = f8;
        arr_f[6] = f9;
        arr_f[9] = f11;
        arr_f[10] = f12;
        arr_f[13] = f14;
        arr_f[14] = f15;
    }

    public static final void rotateY-impl(float[] arr_f, float f) {
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        float f4 = arr_f[0];
        float f5 = arr_f[2] * f3 + f4 * f2;
        float f6 = arr_f[2] * f2 + -f4 * f3;
        float f7 = arr_f[4];
        float f8 = arr_f[6] * f3 + f7 * f2;
        float f9 = arr_f[6] * f2 + -f7 * f3;
        float f10 = arr_f[8];
        float f11 = arr_f[10] * f3 + f10 * f2;
        float f12 = arr_f[10] * f2 + -f10 * f3;
        float f13 = arr_f[12];
        float f14 = arr_f[14] * f3 + f13 * f2;
        float f15 = arr_f[14] * f2 + -f13 * f3;
        arr_f[0] = f5;
        arr_f[2] = f6;
        arr_f[4] = f8;
        arr_f[6] = f9;
        arr_f[8] = f11;
        arr_f[10] = f12;
        arr_f[12] = f14;
        arr_f[14] = f15;
    }

    public static final void rotateZ-impl(float[] arr_f, float f) {
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        float f4 = arr_f[0];
        float f5 = f3 * arr_f[4] + f2 * f4;
        float f6 = arr_f[4] * f2 + f4 * -f3;
        float f7 = arr_f[1];
        float f8 = f3 * arr_f[5] + f2 * f7;
        float f9 = arr_f[5] * f2 + f7 * -f3;
        float f10 = arr_f[2];
        float f11 = f3 * arr_f[6] + f2 * f10;
        float f12 = arr_f[6] * f2 + f10 * -f3;
        float f13 = arr_f[3];
        float f14 = f3 * arr_f[7] + f2 * f13;
        float f15 = f2 * arr_f[7] + -f3 * f13;
        arr_f[0] = f5;
        arr_f[1] = f8;
        arr_f[2] = f11;
        arr_f[3] = f14;
        arr_f[4] = f6;
        arr_f[5] = f9;
        arr_f[6] = f12;
        arr_f[7] = f15;
    }

    public static final void scale-impl(float[] arr_f, float f, float f1, float f2) {
        arr_f[0] *= f;
        arr_f[1] *= f;
        arr_f[2] *= f;
        arr_f[3] *= f;
        arr_f[4] *= f1;
        arr_f[5] *= f1;
        arr_f[6] *= f1;
        arr_f[7] *= f1;
        arr_f[8] *= f2;
        arr_f[9] *= f2;
        arr_f[10] *= f2;
        arr_f[11] *= f2;
    }

    public static void scale-impl$default(float[] arr_f, float f, float f1, float f2, int v, Object object0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 1.0f;
        }
        if((v & 4) != 0) {
            f2 = 1.0f;
        }
        Matrix.scale-impl(arr_f, f, f1, f2);
    }

    public static final void set-impl(float[] arr_f, int v, int v1, float f) {
        arr_f[v * 4 + v1] = f;
    }

    public static final void setFrom-58bKbWc(float[] arr_f, @NotNull float[] arr_f1) {
        for(int v = 0; v < 16; ++v) {
            arr_f[v] = arr_f1[v];
        }
    }

    public static final void timesAssign-58bKbWc(float[] arr_f, @NotNull float[] arr_f1) {
        float f = MatrixKt.access$dot-p89u6pk(arr_f, 0, arr_f1, 0);
        float f1 = MatrixKt.access$dot-p89u6pk(arr_f, 0, arr_f1, 1);
        float f2 = MatrixKt.access$dot-p89u6pk(arr_f, 0, arr_f1, 2);
        float f3 = MatrixKt.access$dot-p89u6pk(arr_f, 0, arr_f1, 3);
        float f4 = MatrixKt.access$dot-p89u6pk(arr_f, 1, arr_f1, 0);
        float f5 = MatrixKt.access$dot-p89u6pk(arr_f, 1, arr_f1, 1);
        float f6 = MatrixKt.access$dot-p89u6pk(arr_f, 1, arr_f1, 2);
        float f7 = MatrixKt.access$dot-p89u6pk(arr_f, 1, arr_f1, 3);
        float f8 = MatrixKt.access$dot-p89u6pk(arr_f, 2, arr_f1, 0);
        float f9 = MatrixKt.access$dot-p89u6pk(arr_f, 2, arr_f1, 1);
        float f10 = MatrixKt.access$dot-p89u6pk(arr_f, 2, arr_f1, 2);
        float f11 = MatrixKt.access$dot-p89u6pk(arr_f, 2, arr_f1, 3);
        float f12 = MatrixKt.access$dot-p89u6pk(arr_f, 3, arr_f1, 0);
        float f13 = MatrixKt.access$dot-p89u6pk(arr_f, 3, arr_f1, 1);
        float f14 = MatrixKt.access$dot-p89u6pk(arr_f, 3, arr_f1, 2);
        float f15 = MatrixKt.access$dot-p89u6pk(arr_f, 3, arr_f1, 3);
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
    }

    @Override
    @NotNull
    public String toString() {
        return Matrix.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(float[] arr_f) {
        return k.trimIndent(("\n            |" + arr_f[0] + ' ' + arr_f[1] + ' ' + arr_f[2] + ' ' + arr_f[3] + "|\n            |" + arr_f[4] + ' ' + arr_f[5] + ' ' + arr_f[6] + ' ' + arr_f[7] + "|\n            |" + arr_f[8] + ' ' + arr_f[9] + ' ' + arr_f[10] + ' ' + arr_f[11] + "|\n            |" + arr_f[12] + ' ' + arr_f[13] + ' ' + arr_f[14] + ' ' + arr_f[15] + "|\n        "));
    }

    public static final void translate-impl(float[] arr_f, float f, float f1, float f2) {
        float f3 = arr_f[8] * f2 + (arr_f[4] * f1 + arr_f[0] * f) + arr_f[12];
        float f4 = arr_f[9] * f2 + (arr_f[5] * f1 + arr_f[1] * f) + arr_f[13];
        float f5 = arr_f[10] * f2 + (arr_f[6] * f1 + arr_f[2] * f) + arr_f[14];
        float f6 = arr_f[11] * f2 + (arr_f[7] * f1 + arr_f[3] * f) + arr_f[15];
        arr_f[12] = f3;
        arr_f[13] = f4;
        arr_f[14] = f5;
        arr_f[15] = f6;
    }

    public static void translate-impl$default(float[] arr_f, float f, float f1, float f2, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        Matrix.translate-impl(arr_f, f, f1, f2);
    }

    public final float[] unbox-impl() {
        return this.a;
    }
}

