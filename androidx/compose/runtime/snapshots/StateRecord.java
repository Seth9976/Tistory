package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00020\u0000H&¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001A\u00020\n8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R$\u0010\u0016\u001A\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u0007¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/snapshots/StateRecord;", "", "<init>", "()V", "value", "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "", "a", "I", "getSnapshotId$runtime_release", "()I", "setSnapshotId$runtime_release", "(I)V", "snapshotId", "b", "Landroidx/compose/runtime/snapshots/StateRecord;", "getNext$runtime_release", "setNext$runtime_release", "next", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public abstract class StateRecord {
    public static final int $stable = 8;
    public int a;
    public StateRecord b;

    public StateRecord() {
        this.a = SnapshotKt.currentSnapshot().getId();
    }

    public abstract void assign(@NotNull StateRecord arg1);

    @NotNull
    public abstract StateRecord create();

    @Nullable
    public final StateRecord getNext$runtime_release() {
        return this.b;
    }

    public final int getSnapshotId$runtime_release() {
        return this.a;
    }

    public final void setNext$runtime_release(@Nullable StateRecord stateRecord0) {
        this.b = stateRecord0;
    }

    public final void setSnapshotId$runtime_release(int v) {
        this.a = v;
    }
}

