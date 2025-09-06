package z;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.TransformScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class c4 extends Lambda implements Function1 {
    public final FloatRef w;
    public final TransformScope x;

    public c4(FloatRef ref$FloatRef0, TransformScope transformScope0) {
        this.w = ref$FloatRef0;
        this.x = transformScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = this.w.element == 0.0f ? 1.0f : ((Number)((AnimationScope)object0).getValue()).floatValue() / this.w.element;
        TransformScope.transformBy-d-4ec7I$default(this.x, f, 0L, 0.0f, 6, null);
        this.w.element = ((Number)((AnimationScope)object0).getValue()).floatValue();
        return Unit.INSTANCE;
    }
}

