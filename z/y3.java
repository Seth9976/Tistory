package z;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.TransformScope;
import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.LongRef;

public final class y3 extends Lambda implements Function1 {
    public final LongRef w;
    public final TransformScope x;

    public y3(LongRef ref$LongRef0, TransformScope transformScope0) {
        this.w = ref$LongRef0;
        this.x = transformScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = Offset.minus-MK-Hz9U(((Offset)((AnimationScope)object0).getValue()).unbox-impl(), this.w.element);
        TransformScope.transformBy-d-4ec7I$default(this.x, 0.0f, v, 0.0f, 5, null);
        this.w.element = ((Offset)((AnimationScope)object0).getValue()).unbox-impl();
        return Unit.INSTANCE;
    }
}

