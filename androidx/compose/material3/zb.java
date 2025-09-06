package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

public final class zb implements TooltipState {
    public final boolean a;
    public final boolean b;
    public final MutableTransitionState c;

    public zb() {
        this.a = true;
        this.b = true;
        this.c = new MutableTransitionState(Boolean.FALSE);
    }

    @Override  // androidx.compose.material3.TooltipState
    public final void dismiss() {
    }

    @Override  // androidx.compose.material3.TooltipState
    public final MutableTransitionState getTransition() {
        return this.c;
    }

    @Override  // androidx.compose.material3.TooltipState
    public final boolean isPersistent() {
        return this.b;
    }

    @Override  // androidx.compose.material3.TooltipState
    public final boolean isVisible() {
        return this.a;
    }

    @Override  // androidx.compose.material3.TooltipState
    public final void onDispose() {
    }

    @Override  // androidx.compose.material3.TooltipState
    public final Object show(MutatePriority mutatePriority0, Continuation continuation0) {
        return Unit.INSTANCE;
    }
}

