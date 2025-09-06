package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007\u00A2\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\f\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0014\u001A\u00020\u00052\u0006\u0010\u0011\u001A\u00020\u0010H\u0010\u00A2\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001A\u00020\u00012\u0014\u0010\u0015\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0005H\u0010\u00A2\u0006\u0004\b\u0018\u0010\rJ\u0017\u0010\u001E\u001A\u00020\u001B2\u0006\u0010\u001A\u001A\u00020\u0001H\u0010\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010 \u001A\u00020\u001B2\u0006\u0010\u001A\u001A\u00020\u0001H\u0010\u00A2\u0006\u0004\b\u001F\u0010\u001DRF\u0010\u0015\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010!\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u0090\u000E\u00A2\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001A\u0010-\u001A\u00020(8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\u001A\u00102\u001A\u00020\u00018\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R(\u00103\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010X\u0090\u0004\u00A2\u0006\f\n\u0004\b3\u0010#\u001A\u0004\b4\u0010%R$\u0010;\u001A\u0002052\u0006\u00106\u001A\u0002058V@PX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010A\u001A\u00020<2\u0006\u00106\u001A\u00020<8P@PX\u0090\u000E\u00A2\u0006\f\u001A\u0004\b=\u0010>\"\u0004\b?\u0010@R4\u0010G\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010B2\u000E\u00106\u001A\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010B8P@VX\u0090\u000E\u00A2\u0006\f\u001A\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010I\u001A\u00020\u00078VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bH\u0010\u000F\u00A8\u0006J"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "previousSnapshot", "Lkotlin/Function1;", "", "", "specifiedReadObserver", "", "mergeParentObservers", "ownsPreviousSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;ZZ)V", "dispose", "()V", "hasPendingChanges", "()Z", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "readObserver", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "notifyObjectsInitialized$runtime_release", "notifyObjectsInitialized", "snapshot", "", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "<set-?>", "h", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "setReadObserver", "(Lkotlin/jvm/functions/Function1;)V", "", "i", "J", "getThreadId$runtime_release", "()J", "threadId", "j", "Landroidx/compose/runtime/snapshots/Snapshot;", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "writeObserver", "getWriteObserver$runtime_release", "", "value", "getId", "()I", "setId$runtime_release", "(I)V", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "Landroidx/collection/MutableScatterSet;", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "setModified", "(Landroidx/collection/MutableScatterSet;)V", "modified", "getReadOnly", "readOnly", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TransparentObserverSnapshot extends Snapshot {
    public static final int $stable = 8;
    public final Snapshot e;
    public final boolean f;
    public final boolean g;
    public Function1 h;
    public final long i;
    public final TransparentObserverSnapshot j;

    public TransparentObserverSnapshot(@Nullable Snapshot snapshot0, @Nullable Function1 function10, boolean z, boolean z1) {
        super(0, SnapshotIdSet.Companion.getEMPTY(), null);
        Function1 function11;
        this.e = snapshot0;
        this.f = z;
        this.g = z1;
        if(snapshot0 == null) {
            function11 = ((GlobalSnapshot)SnapshotKt.j.get()).getReadObserver$runtime_release();
        }
        else {
            function11 = snapshot0.getReadObserver();
            if(function11 == null) {
                function11 = ((GlobalSnapshot)SnapshotKt.j.get()).getReadObserver$runtime_release();
            }
        }
        this.h = SnapshotKt.access$mergedReadObserver(function10, function11, z);
        this.i = 0x9F86L;
        this.j = this;
    }

    public final Snapshot a() {
        return this.e == null ? ((Snapshot)SnapshotKt.j.get()) : this.e;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        this.setDisposed$runtime_release(true);
        if(this.g) {
            Snapshot snapshot0 = this.e;
            if(snapshot0 != null) {
                snapshot0.dispose();
            }
        }
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public int getId() {
        return this.a().getId();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public SnapshotIdSet getInvalid$runtime_release() {
        return this.a().getInvalid$runtime_release();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public MutableScatterSet getModified$runtime_release() {
        return this.a().getModified$runtime_release();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public Function1 getReadObserver() {
        return this.getReadObserver$runtime_release();
    }

    @Nullable
    public Function1 getReadObserver$runtime_release() {
        return this.h;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return this.a().getReadOnly();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot getRoot() {
        return this.j;
    }

    public final long getThreadId$runtime_release() {
        return this.i;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @Nullable
    public Function1 getWriteObserver$runtime_release() {
        return null;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return this.a().hasPendingChanges();
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
        this.a().notifyObjectsInitialized$runtime_release();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void recordModified$runtime_release(@NotNull StateObject stateObject0) {
        this.a().recordModified$runtime_release(stateObject0);
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void setId$runtime_release(int v) {
        throw a.q();
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime_release(@NotNull SnapshotIdSet snapshotIdSet0) {
        throw a.q();
    }

    public void setModified(@Nullable MutableScatterSet mutableScatterSet0) {
        throw a.q();
    }

    public void setReadObserver(@Nullable Function1 function10) {
        this.h = function10;
    }

    @Override  // androidx.compose.runtime.snapshots.Snapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable Function1 function10) {
        Function1 function11 = SnapshotKt.d(function10, this.getReadObserver$runtime_release());
        return this.f ? this.a().takeNestedSnapshot(function11) : SnapshotKt.c(this.a().takeNestedSnapshot(null), function11, true);
    }
}

