package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0014\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0014\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\u000B\u001A\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000E\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u000B\u001A\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001A\u001A\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", "id", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "parent", "<init>", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "dispose", "()V", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "apply", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "o", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "getParent", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2431:1\n1843#2:2432\n89#3:2433\n1#4:2434\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n*L\n1534#1:2432\n1534#1:2433\n*E\n"})
public final class NestedMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;
    public final MutableSnapshot o;
    public boolean p;

    public NestedMutableSnapshot(int v, @NotNull SnapshotIdSet snapshotIdSet0, @Nullable Function1 function10, @Nullable Function1 function11, @NotNull MutableSnapshot mutableSnapshot0) {
        super(v, snapshotIdSet0, function10, function11);
        this.o = mutableSnapshot0;
        mutableSnapshot0.nestedActivated$runtime_release(this);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public SnapshotApplyResult apply() {
        SnapshotApplyResult snapshotApplyResult0;
        Map map0;
        if(!this.o.getApplied$runtime_release() && !this.o.getDisposed$runtime_release()) {
            MutableScatterSet mutableScatterSet0 = this.getModified$runtime_release();
            int v = this.getId();
            if(mutableScatterSet0 == null) {
                map0 = null;
            }
            else {
                SnapshotIdSet snapshotIdSet0 = this.o.getInvalid$runtime_release();
                map0 = SnapshotKt.access$optimisticMerges(this.o, this, snapshotIdSet0);
            }
            Object object0 = SnapshotKt.getLock();
            __monitor_enter(object0);
            try {
                SnapshotKt.access$validateOpen(this);
                if(mutableScatterSet0 == null || mutableScatterSet0.getSize() == 0) {
                    this.closeAndReleasePinning$runtime_release();
                    goto label_22;
                }
                snapshotApplyResult0 = this.innerApplyLocked$runtime_release(this.o.getId(), map0, this.o.getInvalid$runtime_release());
                if(Intrinsics.areEqual(snapshotApplyResult0, Success.INSTANCE)) {
                    MutableScatterSet mutableScatterSet1 = this.o.getModified$runtime_release();
                    if(mutableScatterSet1 == null) {
                        this.o.setModified(mutableScatterSet0);
                        this.setModified(null);
                    }
                    else {
                        mutableScatterSet1.addAll(mutableScatterSet0);
                    }
                label_22:
                    if(this.o.getId() < v) {
                        this.o.advance$runtime_release();
                    }
                    SnapshotIdSet snapshotIdSet1 = this.o.getInvalid$runtime_release().clear(v).andNot(this.getPreviousIds$runtime_release());
                    this.o.setInvalid$runtime_release(snapshotIdSet1);
                    this.o.recordPrevious$runtime_release(v);
                    int v1 = this.takeoverPinnedSnapshot$runtime_release();
                    this.o.recordPreviousPinnedSnapshot$runtime_release(v1);
                    this.o.recordPreviousList$runtime_release(this.getPreviousIds$runtime_release());
                    this.o.recordPreviousPinnedSnapshots$runtime_release(this.getPreviousPinnedSnapshots$runtime_release());
                    goto label_35;
                }
                goto label_41;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(object0);
            throw throwable0;
        label_35:
            __monitor_exit(object0);
            this.setApplied$runtime_release(true);
            if(!this.p) {
                this.p = true;
                this.o.nestedDeactivated$runtime_release(this);
            }
            return Success.INSTANCE;
        label_41:
            __monitor_exit(object0);
            return snapshotApplyResult0;
        }
        return new Failure(this);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void dispose() {
        if(!this.getDisposed$runtime_release()) {
            super.dispose();
            if(!this.p) {
                this.p = true;
                this.o.nestedDeactivated$runtime_release(this);
            }
        }
    }

    @NotNull
    public final MutableSnapshot getParent() {
        return this.o;
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public Snapshot getRoot() {
        return this.o.getRoot();
    }
}

