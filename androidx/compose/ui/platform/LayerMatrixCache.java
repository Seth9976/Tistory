package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u00126\u0010\n\u001A2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000B\u0010\fJ\r\u0010\r\u001A\u00020\t¢\u0006\u0004\b\r\u0010\u000EJ\u001B\u0010\u0012\u001A\u00020\u000F2\u0006\u0010\u0006\u001A\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001D\u0010\u0014\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\u0006\u001A\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0011\u0082\u0002\u000B\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/LayerMatrixCache;", "T", "", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "target", "Landroid/graphics/Matrix;", "matrix", "", "getMatrix", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "invalidate", "()V", "Landroidx/compose/ui/graphics/Matrix;", "calculateMatrix-GrdbGEg", "(Ljava/lang/Object;)[F", "calculateMatrix", "calculateInverseMatrix-bWbORWo", "calculateInverseMatrix", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LayerMatrixCache {
    public static final int $stable = 8;
    public final Function2 a;
    public Matrix b;
    public Matrix c;
    public float[] d;
    public float[] e;
    public boolean f;
    public boolean g;
    public boolean h;

    public LayerMatrixCache(@NotNull Function2 function20) {
        this.a = function20;
        this.f = true;
        this.g = true;
        this.h = true;
    }

    @Nullable
    public final float[] calculateInverseMatrix-bWbORWo(Object object0) {
        float[] arr_f = this.e;
        if(arr_f == null) {
            arr_f = androidx.compose.ui.graphics.Matrix.constructor-impl$default(null, 1, null);
            this.e = arr_f;
        }
        if(this.g) {
            this.h = InvertMatrixKt.invertTo-JiSxe2E(this.calculateMatrix-GrdbGEg(object0), arr_f);
            this.g = false;
        }
        return this.h ? arr_f : null;
    }

    @NotNull
    public final float[] calculateMatrix-GrdbGEg(Object object0) {
        float[] arr_f = this.d;
        if(arr_f == null) {
            arr_f = androidx.compose.ui.graphics.Matrix.constructor-impl$default(null, 1, null);
            this.d = arr_f;
        }
        if(!this.f) {
            return arr_f;
        }
        Matrix matrix0 = this.b;
        if(matrix0 == null) {
            matrix0 = new Matrix();
            this.b = matrix0;
        }
        this.a.invoke(object0, matrix0);
        Matrix matrix1 = this.c;
        if(matrix1 == null || !Intrinsics.areEqual(matrix0, matrix1)) {
            AndroidMatrixConversions_androidKt.setFrom-tU-YjHk(arr_f, matrix0);
            this.b = matrix1;
            this.c = matrix0;
        }
        this.f = false;
        return arr_f;
    }

    public final void invalidate() {
        this.f = true;
        this.g = true;
    }
}

