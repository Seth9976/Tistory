package y0;

import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.jvm.internal.Intrinsics;

public final class v0 extends StateRecord {
    public int c;

    public v0(int v) {
        this.c = v;
    }

    @Override  // androidx.compose.runtime.snapshots.StateRecord
    public final void assign(StateRecord stateRecord0) {
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.c = ((v0)stateRecord0).c;
    }

    @Override  // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create() {
        return new v0(this.c);
    }
}

