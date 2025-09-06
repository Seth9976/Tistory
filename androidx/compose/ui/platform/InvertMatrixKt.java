package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import org.jetbrains.annotations.NotNull;
import r0.a;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0006"}, d2 = {"invertTo", "", "Landroidx/compose/ui/graphics/Matrix;", "other", "invertTo-JiSxe2E", "([F[F)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nInvertMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,78:1\n39#2:79\n39#2:80\n39#2:81\n39#2:82\n39#2:83\n39#2:84\n39#2:85\n39#2:86\n39#2:87\n39#2:88\n39#2:89\n39#2:90\n39#2:91\n39#2:92\n39#2:93\n39#2:94\n42#2,2:95\n42#2,2:97\n42#2,2:99\n42#2,2:101\n42#2,2:103\n42#2,2:105\n42#2,2:107\n42#2,2:109\n42#2,2:111\n42#2,2:113\n42#2,2:115\n42#2,2:117\n42#2,2:119\n42#2,2:121\n42#2,2:123\n42#2,2:125\n*S KotlinDebug\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n*L\n26#1:79\n27#1:80\n28#1:81\n29#1:82\n30#1:83\n31#1:84\n32#1:85\n33#1:86\n34#1:87\n35#1:88\n36#1:89\n37#1:90\n38#1:91\n39#1:92\n40#1:93\n41#1:94\n60#1:95,2\n61#1:97,2\n62#1:99,2\n63#1:101,2\n64#1:103,2\n65#1:105,2\n66#1:107,2\n67#1:109,2\n68#1:111,2\n69#1:113,2\n70#1:115,2\n71#1:117,2\n72#1:119,2\n73#1:121,2\n74#1:123,2\n75#1:125,2\n*E\n"})
public final class InvertMatrixKt {
    public static final boolean invertTo-JiSxe2E(@NotNull float[] arr_f, @NotNull float[] arr_f1) {
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
            return false;
        }
        arr_f1[0] = a.a(f7, f25, f5 * f27 - f6 * f26, 1.0f / f28);
        arr_f1[1] = q.z(f3, f25, f2 * f26 + -f1 * f27, 1.0f / f28);
        arr_f1[2] = a.a(f15, f19, f13 * f21 - f14 * f20, 1.0f / f28);
        arr_f1[3] = q.z(f11, f19, f10 * f20 + -f9 * f21, 1.0f / f28);
        arr_f1[4] = q.z(f7, f23, f6 * f24 + -f4 * f27, 1.0f / f28);
        arr_f1[5] = a.a(f3, f23, f * f27 - f2 * f24, 1.0f / f28);
        arr_f1[6] = q.z(f15, f17, f14 * f18 + -f12 * f21, 1.0f / f28);
        arr_f1[7] = a.a(f11, f17, f8 * f21 - f10 * f18, 1.0f / f28);
        arr_f1[8] = a.a(f7, f22, f4 * f26 - f5 * f24, 1.0f / f28);
        arr_f1[9] = q.z(f3, f22, f1 * f24 + -f * f26, 1.0f / f28);
        arr_f1[10] = a.a(f15, f16, f12 * f20 - f13 * f18, 1.0f / f28);
        arr_f1[11] = q.z(f11, f16, f18 * f9 + -f8 * f20, 1.0f / f28);
        arr_f1[12] = q.z(f6, f22, f5 * f23 + -f4 * f25, 1.0f / f28);
        arr_f1[13] = a.a(f2, f22, f * f25 - f1 * f23, 1.0f / f28);
        arr_f1[14] = q.z(f14, f16, f13 * f17 + -f12 * f19, 1.0f / f28);
        arr_f1[15] = a.a(f10, f16, f8 * f19 - f9 * f17, 1.0f / f28);
        return true;
    }
}

