package z;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class v1 extends Lambda implements Function2 {
    public final FloatRef w;
    public final ScrollScope x;

    public v1(FloatRef ref$FloatRef0, ScrollScope scrollScope0) {
        this.w = ref$FloatRef0;
        this.x = scrollScope0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).floatValue();
        float f = this.w.element;
        this.w.element = this.x.scrollBy(((Number)object0).floatValue() - f) + f;
        return Unit.INSTANCE;
    }
}

