package z;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DefaultDraggable2DState.drag2DScope.1;
import androidx.compose.foundation.gestures.Draggable2DState;
import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class z implements Draggable2DState {
    public final Function1 a;
    public final DefaultDraggable2DState.drag2DScope.1 b;
    public final MutatorMutex c;

    public z(Function1 function10) {
        this.a = function10;
        this.b = new DefaultDraggable2DState.drag2DScope.1(this);
        this.c = new MutatorMutex();
    }

    @Override  // androidx.compose.foundation.gestures.Draggable2DState
    public final void dispatchRawDelta-k-4lQ0M(long v) {
        Offset offset0 = Offset.box-impl(v);
        this.a.invoke(offset0);
    }

    @Override  // androidx.compose.foundation.gestures.Draggable2DState
    public final Object drag(MutatePriority mutatePriority0, Function2 function20, Continuation continuation0) {
        Object object0 = CoroutineScopeKt.coroutineScope(new y(this, mutatePriority0, function20, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

