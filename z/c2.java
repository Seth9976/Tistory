package z;

import androidx.compose.foundation.gestures.NestedScrollScope;
import androidx.compose.foundation.gestures.ScrollingLogic;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class c2 extends Lambda implements Function2 {
    public final FloatRef w;
    public final ScrollingLogic x;
    public final NestedScrollScope y;

    public c2(FloatRef ref$FloatRef0, ScrollingLogic scrollingLogic0, NestedScrollScope nestedScrollScope0) {
        this.w = ref$FloatRef0;
        this.x = scrollingLogic0;
        this.y = nestedScrollScope0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).floatValue();
        float f = this.x.reverseIfNeeded(((Number)object0).floatValue() - this.w.element);
        long v = this.x.toOffset-tuRUvjQ(f);
        long v1 = this.y.scrollBy-OzD1aCk(v, 1);
        float f1 = this.x.toFloat-k-4lQ0M(v1);
        float f2 = this.x.reverseIfNeeded(f1);
        this.w.element += f2;
        return Unit.INSTANCE;
    }
}

