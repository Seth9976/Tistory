package ha;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.Offset;
import com.kakao.kandinsky.designsystem.util.MatrixTransformKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final int w;
    public final float x;
    public final float y;
    public final long z;

    public d(float f, float f1, long v) {
        this.w = 1;
        this.x = f;
        this.y = f1;
        this.z = v;
        super(1);
    }

    public d(float f, long v, float f1) {
        this.w = 0;
        this.x = f;
        this.z = v;
        this.y = f1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
            ((Matrix)object0).postScale(this.x, this.y, Offset.getX-impl(this.z), Offset.getY-impl(this.z));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
        long v = this.z;
        ((Matrix)object0).postScale(this.x, this.x, Offset.getX-impl(v), Offset.getY-impl(v));
        float f = Math.abs(MatrixTransformKt.getTransform(((Matrix)object0)).getScaleX());
        float f1 = this.y;
        if(f1 > f) {
            ((Matrix)object0).postScale(f1 / f, f1 / f, Offset.getX-impl(v), Offset.getY-impl(v));
        }
        return Unit.INSTANCE;
    }
}

