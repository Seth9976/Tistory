package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.ConstraintsState.ConstraintsMet;
import androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet;
import kotlin.Metadata;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0002\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/work/impl/constraints/controllers/ConstraintController$track$1$listener$1", "Landroidx/work/impl/constraints/ConstraintListener;", "newValue", "", "onConstraintChanged", "(Ljava/lang/Object;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ConstraintController.track.1.listener.1 implements ConstraintListener {
    public final ConstraintController a;
    public final ProducerScope b;

    public ConstraintController.track.1.listener.1(ConstraintController constraintController0, ProducerScope producerScope0) {
        this.a = constraintController0;
        this.b = producerScope0;
    }

    @Override  // androidx.work.impl.constraints.ConstraintListener
    public void onConstraintChanged(Object object0) {
        ConstraintController constraintController0 = this.a;
        ConstraintsNotMet constraintsState$ConstraintsNotMet0 = constraintController0.isConstrained(object0) ? new ConstraintsNotMet(constraintController0.getReason()) : ConstraintsMet.INSTANCE;
        this.b.getChannel().trySend-JP2dKIU(constraintsState$ConstraintsNotMet0);
    }
}

