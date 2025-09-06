package z;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DefaultTransformableState.transformScope.1;
import androidx.compose.foundation.gestures.TransformableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class j0 implements TransformableState {
    public final Function3 a;
    public final DefaultTransformableState.transformScope.1 b;
    public final MutatorMutex c;
    public final MutableState d;

    public j0(Function3 function30) {
        this.a = function30;
        this.b = new DefaultTransformableState.transformScope.1(this);
        this.c = new MutatorMutex();
        this.d = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    @Override  // androidx.compose.foundation.gestures.TransformableState
    public final boolean isTransformInProgress() {
        return ((Boolean)this.d.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.TransformableState
    public final Object transform(MutatePriority mutatePriority0, Function2 function20, Continuation continuation0) {
        Object object0 = CoroutineScopeKt.coroutineScope(new i0(this, mutatePriority0, function20, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

