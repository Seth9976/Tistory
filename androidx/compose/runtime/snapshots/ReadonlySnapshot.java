package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0014\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ%\u0010\u000F\u001A\u00020\u00012\u0014\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0013\u001A\u00020\bH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0018\u001A\u00020\b2\u0006\u0010\u0015\u001A\u00020\u0001H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001A\u001A\u00020\b2\u0006\u0010\u0015\u001A\u00020\u0001H\u0010¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001F\u001A\u00020\b2\u0006\u0010\u001C\u001A\u00020\u001BH\u0010¢\u0006\u0004\b\u001D\u0010\u001ER(\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#R\u0014\u0010%\u001A\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b$\u0010\u000ER\u0014\u0010(\u001A\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b&\u0010\'R\"\u0010*\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068PX\u0090\u0004¢\u0006\u0006\u001A\u0004\b)\u0010#R4\u00101\u001A\n\u0012\u0004\u0012\u00020\u001B\u0018\u00010+2\u000E\u0010,\u001A\n\u0012\u0004\u0012\u00020\u001B\u0018\u00010+8P@VX\u0090\u000E¢\u0006\f\u001A\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, d2 = {"Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;)V", "", "hasPendingChanges", "()Z", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "dispose", "snapshot", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "e", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "getReadOnly", "readOnly", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "getWriteObserver$runtime_release", "writeObserver", "Landroidx/collection/MutableScatterSet;", "value", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "setModified", "(Landroidx/collection/MutableScatterSet;)V", "modified", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;
    public final Function1 e;
    public int f;

    public ReadonlySnapshot(int v, @NotNull SnapshotIdSet snapshotIdSet0, @Nullable Function1 function10) {
        super(v, snapshotIdSet0, null);
        this.e = function10;
        this.f = 1;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if(!this.getDisposed$runtime_release()) {
            this.nestedDeactivated$runtime_release(this);
            super.dispose();
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public MutableScatterSet getModified$runtime_release() {
        return null;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getReadObserver() {
        return this.getReadObserver$runtime_release();
    }

    @Nullable
    public Function1 getReadObserver$runtime_release() {
        return this.e;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot getRoot() {
        return this;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1 getWriteObserver$runtime_release() {
        return null;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void nestedActivated$runtime_release(@NotNull Snapshot snapshot0) {
        ++this.f;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void nestedDeactivated$runtime_release(@NotNull Snapshot snapshot0) {
        int v = this.f - 1;
        this.f = v;
        if(v == 0) {
            this.closeAndReleasePinning$runtime_release();
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void recordModified$runtime_release(@NotNull StateObject stateObject0) {
        SnapshotKt.access$reportReadonlySnapshotWrite();
        throw new KotlinNothingValueException();
    }

    public void setModified(@Nullable MutableScatterSet mutableScatterSet0) {
        throw a.q();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable Function1 function10) {
        SnapshotKt.access$validateOpen(this);
        return new NestedReadonlySnapshot(this.getId(), this.getInvalid$runtime_release(), SnapshotKt.d(function10, this.getReadObserver$runtime_release()), this);
    }
}

