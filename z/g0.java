package z;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DefaultScrollableState.scrollScope.1;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScopeKt;
import qd.a;

public final class g0 implements ScrollableState {
    public final Function1 a;
    public final DefaultScrollableState.scrollScope.1 b;
    public final MutatorMutex c;
    public final MutableState d;
    public final MutableState e;
    public final MutableState f;

    public g0(Function1 function10) {
        this.a = function10;
        this.b = new DefaultScrollableState.scrollScope.1(this);
        this.c = new MutatorMutex();
        this.d = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.e = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public final float dispatchRawDelta(float f) {
        return ((Number)this.a.invoke(f)).floatValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getLastScrolledBackward() {
        return ((Boolean)this.f.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getLastScrolledForward() {
        return ((Boolean)this.e.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return ((Boolean)this.d.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public final Object scroll(MutatePriority mutatePriority0, Function2 function20, Continuation continuation0) {
        Object object0 = CoroutineScopeKt.coroutineScope(new f0(this, mutatePriority0, function20, null), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

