package androidx.graphics.path;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000E\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\tH\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u000E\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\b\b\u0002\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u001A\u001A\u00020\u00062\u0006\u0010\u0015\u001A\u00020\u00068\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\"\u0010\u001F\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001B\u0010\u0017\u001A\u0004\b\u001C\u0010\u0019\"\u0004\b\u001D\u0010\u001E¨\u0006 "}, d2 = {"Landroidx/graphics/path/ConicConverter;", "", "<init>", "()V", "", "conicPoints", "", "offset", "quadraticPoints", "", "weight", "tolerance", "internalConicToQuadratics", "([FI[FFF)I", "points", "", "nextQuadratic", "([FI)Z", "", "convert", "([FFFI)V", "<set-?>", "a", "I", "getQuadraticCount", "()I", "quadraticCount", "b", "getCurrentQuadratic", "setCurrentQuadratic", "(I)V", "currentQuadratic", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ConicConverter {
    public int a;
    public int b;
    public float[] c;

    public ConicConverter() {
        this.c = new float[130];
    }

    public final void convert(@NotNull float[] arr_f, float f, float f1, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "points");
        int v1 = this.internalConicToQuadratics(arr_f, v, this.c, f, f1);
        this.a = v1;
        int v2 = v1 * 4 + 2;
        if(v2 > this.c.length) {
            float[] arr_f1 = new float[v2];
            this.c = arr_f1;
            this.a = this.internalConicToQuadratics(arr_f, v, arr_f1, f, f1);
        }
        this.b = 0;
    }

    public static void convert$default(ConicConverter conicConverter0, float[] arr_f, float f, float f1, int v, int v1, Object object0) {
        if((v1 & 8) != 0) {
            v = 0;
        }
        conicConverter0.convert(arr_f, f, f1, v);
    }

    public final int getCurrentQuadratic() {
        return this.b;
    }

    public final int getQuadraticCount() {
        return this.a;
    }

    private final native int internalConicToQuadratics(float[] arg1, int arg2, float[] arg3, float arg4, float arg5) {
    }

    public final boolean nextQuadratic(@NotNull float[] arr_f, int v) {
        Intrinsics.checkNotNullParameter(arr_f, "points");
        int v1 = this.b;
        if(v1 < this.a) {
            float[] arr_f1 = this.c;
            arr_f[v] = arr_f1[v1 * 4];
            arr_f[v + 1] = arr_f1[v1 * 4 + 1];
            arr_f[v + 2] = arr_f1[v1 * 4 + 2];
            arr_f[v + 3] = arr_f1[v1 * 4 + 3];
            arr_f[v + 4] = arr_f1[v1 * 4 + 4];
            arr_f[v + 5] = arr_f1[v1 * 4 + 5];
            this.b = v1 + 1;
            return true;
        }
        return false;
    }

    public static boolean nextQuadratic$default(ConicConverter conicConverter0, float[] arr_f, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        return conicConverter0.nextQuadratic(arr_f, v);
    }

    public final void setCurrentQuadratic(int v) {
        this.b = v;
    }
}

