package f0;

import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class f0 extends Lambda implements Function2 {
    public final FloatRef w;
    public final ScrollScope x;

    public f0(FloatRef ref$FloatRef0, ScrollScope scrollScope0) {
        this.w = ref$FloatRef0;
        this.x = scrollScope0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).floatValue();
        float f = this.x.scrollBy(((Number)object0).floatValue() - this.w.element);
        this.w.element += f;
        return Unit.INSTANCE;
    }
}

