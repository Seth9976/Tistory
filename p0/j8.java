package p0;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;

public final class j8 extends Lambda implements Function1 {
    public final State w;
    public final BooleanRef x;
    public final boolean y;

    public j8(State state0, BooleanRef ref$BooleanRef0, boolean z) {
        this.w = state0;
        this.x = ref$BooleanRef0;
        this.y = z;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        float f = Offset.getX-impl(PointerEventKt.positionChange(((PointerInputChange)object0)));
        Function2 function20 = (Function2)this.w.getValue();
        Boolean boolean0 = Boolean.valueOf(this.x.element);
        if(this.y) {
            f = -f;
        }
        function20.invoke(boolean0, f);
        return Unit.INSTANCE;
    }
}

