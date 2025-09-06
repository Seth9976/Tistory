package p0;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.material.SliderDraggableState.dragScope.1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class j7 implements DraggableState {
    public final v7 a;
    public final MutableState b;
    public final SliderDraggableState.dragScope.1 c;
    public final MutatorMutex d;

    public j7(v7 v70) {
        this.a = v70;
        this.b = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.c = new SliderDraggableState.dragScope.1(this);
        this.d = new MutatorMutex();
    }

    @Override  // androidx.compose.foundation.gestures.DraggableState
    public final void dispatchRawDelta(float f) {
        this.a.invoke(f);
    }

    @Override  // androidx.compose.foundation.gestures.DraggableState
    public final Object drag(MutatePriority mutatePriority0, Function2 function20, Continuation continuation0) {
        Object object0 = CoroutineScopeKt.coroutineScope(new i7(this, mutatePriority0, function20, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

