package z;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.TransformScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class a4 extends Lambda implements Function1 {
    public final FloatRef w;
    public final TransformScope x;

    public a4(FloatRef ref$FloatRef0, TransformScope transformScope0) {
        this.w = ref$FloatRef0;
        this.x = transformScope0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = ((Number)((AnimationScope)object0).getValue()).floatValue();
        TransformScope.transformBy-d-4ec7I$default(this.x, 0.0f, 0L, f - this.w.element, 3, null);
        this.w.element = ((Number)((AnimationScope)object0).getValue()).floatValue();
        return Unit.INSTANCE;
    }
}

