package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.trackers.BatteryNotLowTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u001A\u0010\u0013\u001A\u00020\u000E8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/constraints/controllers/BatteryNotLowController;", "Landroidx/work/impl/constraints/controllers/ConstraintController;", "", "Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;", "tracker", "<init>", "(Landroidx/work/impl/constraints/trackers/BatteryNotLowTracker;)V", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "hasConstraint", "(Landroidx/work/impl/model/WorkSpec;)Z", "value", "isConstrained", "(Z)Z", "", "b", "I", "getReason", "()I", "reason", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BatteryNotLowController extends ConstraintController {
    public final int b;

    public BatteryNotLowController(@NotNull BatteryNotLowTracker batteryNotLowTracker0) {
        Intrinsics.checkNotNullParameter(batteryNotLowTracker0, "tracker");
        super(batteryNotLowTracker0);
        this.b = 5;
    }

    @Override  // androidx.work.impl.constraints.controllers.ConstraintController
    public int getReason() {
        return this.b;
    }

    @Override  // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(@NotNull WorkSpec workSpec0) {
        Intrinsics.checkNotNullParameter(workSpec0, "workSpec");
        return workSpec0.constraints.requiresBatteryNotLow();
    }

    @Override  // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(Object object0) {
        return this.isConstrained(((Boolean)object0).booleanValue());
    }

    public boolean isConstrained(boolean z) {
        return !z;
    }
}

