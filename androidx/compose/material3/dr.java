package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation.DefaultImpls;
import kotlinx.coroutines.CancellableContinuationImpl;
import qd.a;

public final class dr implements TooltipState {
    public final boolean a;
    public final MutatorMutex b;
    public final MutableTransitionState c;
    public CancellableContinuationImpl d;

    public dr(boolean z, boolean z1, MutatorMutex mutatorMutex0) {
        this.a = z1;
        this.b = mutatorMutex0;
        this.c = new MutableTransitionState(Boolean.valueOf(z));
    }

    @Override  // androidx.compose.material3.TooltipState
    public final void dismiss() {
        this.c.setTargetState(Boolean.FALSE);
    }

    @Override  // androidx.compose.material3.TooltipState
    public final MutableTransitionState getTransition() {
        return this.c;
    }

    @Override  // androidx.compose.material3.TooltipState
    public final boolean isPersistent() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.material3.TooltipState
    public final boolean isVisible() {
        return ((Boolean)this.c.getCurrentState()).booleanValue() || ((Boolean)this.c.getTargetState()).booleanValue();
    }

    @Override  // androidx.compose.material3.TooltipState
    public final void onDispose() {
        CancellableContinuationImpl cancellableContinuationImpl0 = this.d;
        if(cancellableContinuationImpl0 != null) {
            DefaultImpls.cancel$default(cancellableContinuationImpl0, null, 1, null);
        }
    }

    @Override  // androidx.compose.material3.TooltipState
    public final Object show(MutatePriority mutatePriority0, Continuation continuation0) {
        br br0 = new br(this, new cr(this, null), mutatePriority0, null);
        Object object0 = this.b.mutate(mutatePriority0, br0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }
}

