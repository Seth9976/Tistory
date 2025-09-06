package androidx.compose.material3;

import android.graphics.Matrix;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import com.kakao.kandinsky.preview.PreviewAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class ei extends Lambda implements Function1 {
    public final int w;
    public final State x;
    public final State y;

    public ei(State state0, State state1, int v) {
        this.w = v;
        this.x = state0;
        this.y = state1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        switch(this.w) {
            case 0: {
                float f1 = ((DrawScope)object0).toPx-0680j_4(2.0f);
                State state2 = this.x;
                DrawScope.drawCircle-VaOC9Bg$default(((DrawScope)object0), ((Color)state2.getValue()).unbox-impl(), ((DrawScope)object0).toPx-0680j_4(0.0f) - f1 / 2.0f, 0L, 0.0f, new Stroke(f1, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                State state3 = this.y;
                if(Dp.compareTo-0680j_4(((Dp)state3.getValue()).unbox-impl(), 0.0f) > 0) {
                    DrawScope.drawCircle-VaOC9Bg$default(((DrawScope)object0), ((Color)state2.getValue()).unbox-impl(), ((DrawScope)object0).toPx-0680j_4(((Dp)state3.getValue()).unbox-impl()) - f1 / 2.0f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                }
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((Matrix)object0), "$this$buildMatrix");
                ((Matrix)object0).postConcat(PreviewAnimator.access$absoluteMatrixAndModifier$lambda$7(this.x));
                ((Matrix)object0).postConcat(PreviewAnimator.access$absoluteMatrixAndModifier$lambda$5(this.y));
                return Unit.INSTANCE;
            }
            default: {
                float f = ((DrawScope)object0).toPx-0680j_4(2.0f);
                State state0 = this.x;
                DrawScope.drawCircle-VaOC9Bg$default(((DrawScope)object0), ((Color)state0.getValue()).unbox-impl(), ((DrawScope)object0).toPx-0680j_4(10.0f) - f / 2.0f, 0L, 0.0f, new Stroke(f, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                State state1 = this.y;
                if(Dp.compareTo-0680j_4(((Dp)state1.getValue()).unbox-impl(), 0.0f) > 0) {
                    DrawScope.drawCircle-VaOC9Bg$default(((DrawScope)object0), ((Color)state0.getValue()).unbox-impl(), ((DrawScope)object0).toPx-0680j_4(((Dp)state1.getValue()).unbox-impl()) - f / 2.0f, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
                }
                return Unit.INSTANCE;
            }
        }
    }
}

