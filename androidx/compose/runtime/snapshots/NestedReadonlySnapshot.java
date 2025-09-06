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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0014\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\n\u001A\u00020\u0001¢\u0006\u0004\b\u000B\u0010\fJ%\u0010\r\u001A\u00020\u00002\u0014\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0011\u001A\u00020\bH\u0010¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0015\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u001B\u001A\u00020\u00182\u0006\u0010\u0017\u001A\u00020\u0016H\u0010¢\u0006\u0004\b\u0019\u0010\u001AJ\u0017\u0010\u001F\u001A\u00020\u00182\u0006\u0010\u001C\u001A\u00020\u0001H\u0010¢\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010!\u001A\u00020\u00182\u0006\u0010\u001C\u001A\u00020\u0001H\u0010¢\u0006\u0004\b \u0010\u001ER(\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u0017\u0010\n\u001A\u00020\u00018\u0006¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u0014\u0010+\u001A\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b*\u0010\u0014R\u0014\u0010-\u001A\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b,\u0010)R\u001C\u00101\u001A\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010.8PX\u0090\u0004¢\u0006\u0006\u001A\u0004\b/\u00100R\"\u00103\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068PX\u0090\u0004¢\u0006\u0006\u001A\u0004\b2\u0010%¨\u00064"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "parent", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/Snapshot;)V", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "notifyObjectsInitialized$runtime_release", "()V", "notifyObjectsInitialized", "", "hasPendingChanges", "()Z", "dispose", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)Ljava/lang/Void;", "recordModified", "snapshot", "nestedDeactivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedDeactivated", "nestedActivated$runtime_release", "nestedActivated", "e", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "f", "Landroidx/compose/runtime/snapshots/Snapshot;", "getParent", "()Landroidx/compose/runtime/snapshots/Snapshot;", "getReadOnly", "readOnly", "getRoot", "root", "Landroidx/collection/MutableScatterSet;", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "modified", "getWriteObserver$runtime_release", "writeObserver", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class NestedReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;
    public final Function1 e;
    public final Snapshot f;

    public NestedReadonlySnapshot(int v, @NotNull SnapshotIdSet snapshotIdSet0, @Nullable Function1 function10, @NotNull Snapshot snapshot0) {
        super(v, snapshotIdSet0, null);
        this.e = function10;
        this.f = snapshot0;
        snapshot0.nestedActivated$runtime_release(this);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if(!this.getDisposed$runtime_release()) {
            Snapshot snapshot0 = this.f;
            if(this.getId() != snapshot0.getId()) {
                this.closeAndReleasePinning$runtime_release();
            }
            snapshot0.nestedDeactivated$runtime_release(this);
            super.dispose();
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public MutableScatterSet getModified$runtime_release() {
        return null;
    }

    @NotNull
    public final Snapshot getParent() {
        return this.f;
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
        return this.f.getRoot();
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

    @NotNull
    public Void nestedActivated$runtime_release(@NotNull Snapshot snapshot0) {
        throw a.q();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void nestedActivated$runtime_release(Snapshot snapshot0) {
        this.nestedActivated$runtime_release(snapshot0);
    }

    @NotNull
    public Void nestedDeactivated$runtime_release(@NotNull Snapshot snapshot0) {
        throw a.q();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void nestedDeactivated$runtime_release(Snapshot snapshot0) {
        this.nestedDeactivated$runtime_release(snapshot0);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }

    @NotNull
    public Void recordModified$runtime_release(@NotNull StateObject stateObject0) {
        SnapshotKt.access$reportReadonlySnapshotWrite();
        throw new KotlinNothingValueException();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void recordModified$runtime_release(StateObject stateObject0) {
        this.recordModified$runtime_release(stateObject0);
    }

    @NotNull
    public NestedReadonlySnapshot takeNestedSnapshot(@Nullable Function1 function10) {
        return new NestedReadonlySnapshot(this.getId(), this.getInvalid$runtime_release(), SnapshotKt.d(function10, this.getReadObserver$runtime_release()), this.f);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1 function10) {
        return this.takeNestedSnapshot(function10);
    }
}

