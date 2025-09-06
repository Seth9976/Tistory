package y0;

import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.jvm.internal.Intrinsics;

public final class u0 extends StateRecord {
    public float c;

    public u0(float f) {
        this.c = f;
    }

    @Override  // androidx.compose.runtime.snapshots.StateRecord
    public final void assign(StateRecord stateRecord0) {
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.c = ((u0)stateRecord0).c;
    }

    @Override  // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create() {
        return new u0(this.c);
    }
}

