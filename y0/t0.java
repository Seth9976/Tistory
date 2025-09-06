package y0;

import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.jvm.internal.Intrinsics;

public final class t0 extends StateRecord {
    public double c;

    public t0(double f) {
        this.c = f;
    }

    @Override  // androidx.compose.runtime.snapshots.StateRecord
    public final void assign(StateRecord stateRecord0) {
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.c = ((t0)stateRecord0).c;
    }

    @Override  // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create() {
        return new t0(this.c);
    }
}

