package u;

import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation.DefaultImpls;
import kotlinx.coroutines.CancellableContinuationImpl;
import qd.a;

public final class b0 implements BasicTooltipState {
    public final boolean a;
    public final MutatorMutex b;
    public final MutableState c;
    public CancellableContinuationImpl d;

    public b0(boolean z, boolean z1, MutatorMutex mutatorMutex0) {
        this.a = z1;
        this.b = mutatorMutex0;
        this.c = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    @Override  // androidx.compose.foundation.BasicTooltipState
    public final void dismiss() {
        this.c.setValue(Boolean.FALSE);
    }

    @Override  // androidx.compose.foundation.BasicTooltipState
    public final boolean isPersistent() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.BasicTooltipState
    public final boolean isVisible() {
        return ((Boolean)this.c.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.BasicTooltipState
    public final void onDispose() {
        CancellableContinuationImpl cancellableContinuationImpl0 = this.d;
        if(cancellableContinuationImpl0 != null) {
            DefaultImpls.cancel$default(cancellableContinuationImpl0, null, 1, null);
        }
    }

    @Override  // androidx.compose.foundation.BasicTooltipState
    public final Object show(MutatePriority mutatePriority0, Continuation continuation0) {
        z z0 = new z(this, new a0(this, null), null);
        Object object0 = this.b.mutate(mutatePriority0, z0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

