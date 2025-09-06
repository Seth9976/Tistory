package z;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DefaultDraggableState.dragScope.1;
import androidx.compose.foundation.gestures.DraggableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class b0 implements DraggableState {
    public final Function1 a;
    public final DefaultDraggableState.dragScope.1 b;
    public final MutatorMutex c;

    public b0(Function1 function10) {
        this.a = function10;
        this.b = new DefaultDraggableState.dragScope.1(this);
        this.c = new MutatorMutex();
    }

    @Override  // androidx.compose.foundation.gestures.DraggableState
    public final void dispatchRawDelta(float f) {
        this.a.invoke(f);
    }

    @Override  // androidx.compose.foundation.gestures.DraggableState
    public final Object drag(MutatePriority mutatePriority0, Function2 function20, Continuation continuation0) {
        Object object0 = CoroutineScopeKt.coroutineScope(new a0(this, mutatePriority0, function20, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

