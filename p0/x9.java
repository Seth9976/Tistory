package p0;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.gestures.DragScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class x9 extends Lambda implements Function1 {
    public final DragScope w;
    public final FloatRef x;

    public x9(DragScope dragScope0, FloatRef ref$FloatRef0) {
        this.w = dragScope0;
        this.x = ref$FloatRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = ((Number)((Animatable)object0).getValue()).floatValue();
        this.w.dragBy(f - this.x.element);
        this.x.element = ((Number)((Animatable)object0).getValue()).floatValue();
        return Unit.INSTANCE;
    }
}

