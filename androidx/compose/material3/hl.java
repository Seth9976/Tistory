package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class hl extends Lambda implements Function2 {
    public final FloatRef w;

    public hl(FloatRef ref$FloatRef0) {
        this.w = ref$FloatRef0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((PointerInputChange)object0).consume();
        this.w.element = ((Number)object1).floatValue();
        return Unit.INSTANCE;
    }
}

