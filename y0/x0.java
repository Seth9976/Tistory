package y0;

import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.jvm.internal.Intrinsics;

public final class x0 extends StateRecord {
    public Object c;

    public x0(Object object0) {
        this.c = object0;
    }

    @Override  // androidx.compose.runtime.snapshots.StateRecord
    public final void assign(StateRecord stateRecord0) {
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.c = ((x0)stateRecord0).c;
    }

    @Override  // androidx.compose.runtime.snapshots.StateRecord
    public final StateRecord create() {
        return new x0(this.c);
    }
}

