package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\u001A\u0014\u0010\u0004\u001A\u00020\u0001*\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "isIdentity-58bKbWc", "([F)Z", "isIdentity", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,441:1\n39#2:442\n39#2:443\n39#2:444\n39#2:445\n39#2:446\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n423#1:442\n424#1:443\n425#1:444\n426#1:445\n434#1:446\n*E\n"})
public final class MatrixKt {
    public static final float access$dot-p89u6pk(float[] arr_f, int v, float[] arr_f1, int v1) {
        return arr_f[v * 4 + 3] * arr_f1[v1 + 12] + (arr_f[v * 4 + 2] * arr_f1[v1 + 8] + (arr_f[v * 4 + 1] * arr_f1[v1 + 4] + arr_f[v * 4] * arr_f1[v1]));
    }

    public static final boolean isIdentity-58bKbWc(@NotNull float[] arr_f) {
        int v = 0;
        while(v < 4) {
            int v1 = 0;
            while(v1 < 4) {
                if(arr_f[v * 4 + v1] == (v == v1 ? 1.0f : 0.0f)) {
                    ++v1;
                    continue;
                }
                return false;
            }
            ++v;
        }
        return true;
    }
}

