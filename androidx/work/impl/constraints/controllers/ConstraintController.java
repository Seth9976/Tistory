package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000BJ\u0017\u0010\r\u001A\u00020\t2\u0006\u0010\f\u001A\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000EJ\u0013\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\r\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\r\u0010\u000BR\u001A\u0010\u0018\u001A\u00020\u00138&X¦\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/work/impl/constraints/controllers/ConstraintController;", "T", "", "Landroidx/work/impl/constraints/trackers/ConstraintTracker;", "tracker", "<init>", "(Landroidx/work/impl/constraints/trackers/ConstraintTracker;)V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "hasConstraint", "(Landroidx/work/impl/model/WorkSpec;)Z", "value", "isConstrained", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/work/impl/constraints/ConstraintsState;", "track", "()Lkotlinx/coroutines/flow/Flow;", "", "getReason", "()I", "getReason$annotations", "()V", "reason", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class ConstraintController {
    public final ConstraintTracker a;

    public ConstraintController(@NotNull ConstraintTracker constraintTracker0) {
        Intrinsics.checkNotNullParameter(constraintTracker0, "tracker");
        super();
        this.a = constraintTracker0;
    }

    public abstract int getReason();

    public static void getReason$annotations() {
    }

    public abstract boolean hasConstraint(@NotNull WorkSpec arg1);

    public final boolean isConstrained(@NotNull WorkSpec workSpec0) {
        Intrinsics.checkNotNullParameter(workSpec0, "workSpec");
        return this.hasConstraint(workSpec0) && this.isConstrained(this.a.readSystemState());
    }

    public abstract boolean isConstrained(Object arg1);

    @NotNull
    public final Flow track() {
        return FlowKt.callbackFlow(new a(this, null));
    }
}

