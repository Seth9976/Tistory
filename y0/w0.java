package y0;

import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.jvm.internal.Intrinsics;

public final class w0 extends StateRecord {
    public long c;

    public w0(long v) {
        this.c = v;
    }

    @Override  // androidx.compose.runtime.snapshots.StateRecord
    public final void assign(StateRecord stateRecord0) {
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.c = ((w0)stateRecord0).c;
    }

    @Override  // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create() {
        return new w0(this.c);
    }
}

