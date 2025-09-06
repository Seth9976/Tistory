package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.LongRef;

public final class q0 extends Lambda implements Function2 {
    public final LongRef w;

    public q0(LongRef ref$LongRef0) {
        this.w = ref$LongRef0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((PointerInputChange)object0).consume();
        this.w.element = ((Offset)object1).unbox-impl();
        return Unit.INSTANCE;
    }
}

