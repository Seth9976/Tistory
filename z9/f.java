package z9;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final long w;
    public final long x;

    public f(long v, long v1) {
        this.w = v;
        this.x = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((DrawScope)object0), "$this$drawBehind");
        DrawScope.drawCircle-VaOC9Bg$default(((DrawScope)object0), this.w, 0.0f, 0L, 0.0f, null, null, 0, 0x7E, null);
        float f = Size.getMinDimension-impl(((DrawScope)object0).getSize-NH-jbRc());
        float f1 = ((DrawScope)object0).toPx-0680j_4(1.0f);
        DrawScope.drawCircle-VaOC9Bg$default(((DrawScope)object0), this.x, f / 2.0f - f1, 0L, 0.0f, null, null, 0, 0x7C, null);
        return Unit.INSTANCE;
    }
}

