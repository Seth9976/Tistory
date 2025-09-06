package na;

import android.graphics.Matrix;
import com.kakao.kandinsky.designsystem.util.MatrixTransformKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function1 {
    public final float w;
    public final float x;
    public final float y;

    public q(float f, float f1, float f2) {
        this.w = f;
        this.x = f1;
        this.y = f2;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f3;
        Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
        float f = this.x;
        float f1 = this.y;
        ((Matrix)object0).postScale(this.w, this.w, f, f1);
        float f2 = MatrixTransformKt.getTransform(((Matrix)object0)).getScaleX();
        if(f2 < 0.2f) {
            f3 = 0.2f / f2;
        }
        else if(f2 <= 5.0f) {
            f3 = 1.0f;
        }
        else {
            f3 = 0.2f / f2;
        }
        ((Matrix)object0).postScale(f3, f3, f, f1);
        return Unit.INSTANCE;
    }
}

