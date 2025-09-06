package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u000F\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\b\u00A2\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0005H\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0018\u001A\u00020\u00052\u0006\u0010\u0015\u001A\u00020\u0014H\u0010\u00A2\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001B\u001A\u00020\u001A2\u0014\u0010\u0019\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CJ;\u0010\u001E\u001A\u00020\u00012\u0014\u0010\u0019\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010\u001D\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010!\u001A\u00020\u0005H\u0010\u00A2\u0006\u0004\b \u0010\u000EJ\u0017\u0010&\u001A\u00020#2\u0006\u0010\"\u001A\u00020\u001AH\u0010\u00A2\u0006\u0004\b$\u0010%J\u0017\u0010(\u001A\u00020#2\u0006\u0010\"\u001A\u00020\u001AH\u0010\u00A2\u0006\u0004\b\'\u0010%RF\u0010\u0019\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010)\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u0090\u000E\u00A2\u0006\u0012\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-\"\u0004\b.\u0010/RF\u0010\u001D\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010)\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u0090\u000E\u00A2\u0006\u0012\n\u0004\b0\u0010+\u001A\u0004\b1\u0010-\"\u0004\b2\u0010/R\u001A\u00108\u001A\u0002038\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u00107R$\u0010?\u001A\u0002092\u0006\u0010:\u001A\u0002098V@PX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010E\u001A\u00020@2\u0006\u0010:\u001A\u00020@8P@PX\u0090\u000E\u00A2\u0006\f\u001A\u0004\bA\u0010B\"\u0004\bC\u0010DR4\u0010K\u001A\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010F2\u000E\u0010:\u001A\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010F8P@VX\u0090\u000E\u00A2\u0006\f\u001A\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010N\u001A\u0002092\u0006\u0010:\u001A\u0002098P@PX\u0090\u000E\u00A2\u0006\f\u001A\u0004\bL\u0010<\"\u0004\bM\u0010>R\u0014\u0010P\u001A\u00020\b8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bO\u0010\u0010\u00A8\u0006Q"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "parentSnapshot", "Lkotlin/Function1;", "", "", "specifiedReadObserver", "specifiedWriteObserver", "", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "dispose", "()V", "hasPendingChanges", "()Z", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "recordModified$runtime_release", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "recordModified", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "takeNestedSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "writeObserver", "takeNestedMutableSnapshot", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;", "notifyObjectsInitialized$runtime_release", "notifyObjectsInitialized", "snapshot", "", "nestedActivated$runtime_release", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "nestedActivated", "nestedDeactivated$runtime_release", "nestedDeactivated", "<set-?>", "r", "Lkotlin/jvm/functions/Function1;", "getReadObserver$runtime_release", "()Lkotlin/jvm/functions/Function1;", "setReadObserver", "(Lkotlin/jvm/functions/Function1;)V", "s", "getWriteObserver$runtime_release", "setWriteObserver", "", "t", "J", "getThreadId$runtime_release", "()J", "threadId", "", "value", "getId", "()I", "setId$runtime_release", "(I)V", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getInvalid$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "Landroidx/collection/MutableScatterSet;", "getModified$runtime_release", "()Landroidx/collection/MutableScatterSet;", "setModified", "(Landroidx/collection/MutableScatterSet;)V", "modified", "getWriteCount$runtime_release", "setWriteCount$runtime_release", "writeCount", "getReadOnly", "readOnly", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;
    public final MutableSnapshot o;
    public final boolean p;
    public final boolean q;
    public Function1 r;
    public Function1 s;
    public final long t;

    public TransparentObserverMutableSnapshot(@Nullable MutableSnapshot mutableSnapshot0, @Nullable Function1 function10, @Nullable Function1 function11, boolean z, boolean z1) {
        Function1 function14;
        Function1 function12;
        SnapshotIdSet snapshotIdSet0 = SnapshotIdSet.Companion.getEMPTY();
        if(mutableSnapshot0 == null) {
            function12 = ((GlobalSnapshot)SnapshotKt.j.get()).getReadObserver$runtime_release();
        }
        else {
            function12 = mutableSnapshot0.getReadObserver$runtime_release();
            if(function12 == null) {
                function12 = ((GlobalSnapshot)SnapshotKt.j.get()).getReadObserver$runtime_release();
            }
        }
        Function1 function13 = SnapshotKt.access$mergedReadObserver(function10, function12, z);
        if(mutableSnapshot0 == null) {
            function14 = ((GlobalSnapshot)SnapshotKt.j.get()).getWriteObserver$runtime_release();
        }
        else {
            function14 = mutableSnapshot0.getWriteObserver$runtime_release();
            if(function14 == null) {
                function14 = ((GlobalSnapshot)SnapshotKt.j.get()).getWriteObserver$runtime_release();
            }
        }
        super(0, snapshotIdSet0, function13, SnapshotKt.access$mergedWriteObserver(function11, function14));
        this.o = mutableSnapshot0;
        this.p = z;
        this.q = z1;
        this.r = super.getReadObserver$runtime_release();
        this.s = super.getWriteObserver$runtime_release();
        this.t = 0xA0F4L;
    }

    public final MutableSnapshot a() {
        return this.o == null ? ((MutableSnapshot)SnapshotKt.j.get()) : this.o;
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public SnapshotApplyResult apply() {
        return this.a().apply();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void dispose() {
        this.setDisposed$runtime_release(true);
        if(this.q) {
            MutableSnapshot mutableSnapshot0 = this.o;
            if(mutableSnapshot0 != null) {
                mutableSnapshot0.dispose();
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

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @Nullable
    public MutableScatterSet getModified$runtime_release() {
        return this.a().getModified$runtime_release();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public Function1 getReadObserver() {
        return this.getReadObserver$runtime_release();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @Nullable
    public Function1 getReadObserver$runtime_release() {
        return this.r;
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public boolean getReadOnly() {
        return this.a().getReadOnly();
    }

    public final long getThreadId$runtime_release() {
        return this.t;
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public int getWriteCount$runtime_release() {
        return this.a().getWriteCount$runtime_release();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @Nullable
    public Function1 getWriteObserver$runtime_release() {
        return this.s;
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public boolean hasPendingChanges() {
        return this.a().hasPendingChanges();
    }

    @NotNull
    public Void nestedActivated$runtime_release(@NotNull Snapshot snapshot0) {
        throw a.q();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void nestedActivated$runtime_release(Snapshot snapshot0) {
        this.nestedActivated$runtime_release(snapshot0);
    }

    @NotNull
    public Void nestedDeactivated$runtime_release(@NotNull Snapshot snapshot0) {
        throw a.q();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void nestedDeactivated$runtime_release(Snapshot snapshot0) {
        this.nestedDeactivated$runtime_release(snapshot0);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void notifyObjectsInitialized$runtime_release() {
        this.a().notifyObjectsInitialized$runtime_release();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
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

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void setModified(@Nullable MutableScatterSet mutableScatterSet0) {
        throw a.q();
    }

    public void setReadObserver(@Nullable Function1 function10) {
        this.r = function10;
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void setWriteCount$runtime_release(int v) {
        this.a().setWriteCount$runtime_release(v);
    }

    public void setWriteObserver(@Nullable Function1 function10) {
        this.s = function10;
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public MutableSnapshot takeNestedMutableSnapshot(@Nullable Function1 function10, @Nullable Function1 function11) {
        Function1 function12 = SnapshotKt.d(function10, this.getReadObserver$runtime_release());
        Function1 function13 = SnapshotKt.access$mergedWriteObserver(function11, this.getWriteObserver$runtime_release());
        return !this.p ? new TransparentObserverMutableSnapshot(this.a().takeNestedMutableSnapshot(null, function13), function12, function13, false, true) : this.a().takeNestedMutableSnapshot(function12, function13);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable Function1 function10) {
        Function1 function11 = SnapshotKt.d(function10, this.getReadObserver$runtime_release());
        return this.p ? this.a().takeNestedSnapshot(function11) : SnapshotKt.c(this.a().takeNestedSnapshot(null), function11, true);
    }
}

