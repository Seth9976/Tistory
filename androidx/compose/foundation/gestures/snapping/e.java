package androidx.compose.foundation.gestures.snapping;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class e extends Lambda implements Function1 {
    public final FloatRef w;
    public final Function1 x;

    public e(FloatRef ref$FloatRef0, Function1 function10) {
        this.w = ref$FloatRef0;
        this.x = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = this.w.element - ((Number)object0).floatValue();
        this.w.element = f;
        this.x.invoke(f);
        return Unit.INSTANCE;
    }
}

