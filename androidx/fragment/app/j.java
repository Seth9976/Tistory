package androidx.fragment.app;

import android.view.View;
import androidx.core.os.CancellationSignal;
import kotlin.jvm.internal.Intrinsics;

public abstract class j {
    public final Operation a;
    public final CancellationSignal b;

    public j(Operation specialEffectsController$Operation0, CancellationSignal cancellationSignal0) {
        Intrinsics.checkNotNullParameter(specialEffectsController$Operation0, "operation");
        Intrinsics.checkNotNullParameter(cancellationSignal0, "signal");
        super();
        this.a = specialEffectsController$Operation0;
        this.b = cancellationSignal0;
    }

    public final void a() {
        this.a.completeSpecialEffect(this.b);
    }

    public final boolean b() {
        View view0 = this.a.getFragment().mView;
        Intrinsics.checkNotNullExpressionValue(view0, "operation.fragment.mView");
        State specialEffectsController$Operation$State0 = State.Companion.asOperationState(view0);
        State specialEffectsController$Operation$State1 = this.a.getFinalState();
        return specialEffectsController$Operation$State0 == specialEffectsController$Operation$State1 || specialEffectsController$Operation$State0 != State.VISIBLE && specialEffectsController$Operation$State1 != State.VISIBLE;
    }
}

