package androidx.compose.runtime.snapshots;

import androidx.compose.material3.h8;
import androidx.compose.material3.ti;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001A\u00020\bH\u0016J\b\u0010\t\u001A\u00020\nH\u0016J\u0015\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH\u0010¢\u0006\u0002\b\u000FJ\u0015\u0010\u0010\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH\u0010¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001A\u00020\nH\u0010¢\u0006\u0002\b\u0013J4\u0010\u0014\u001A\u00020\u00012\u0014\u0010\u0015\u001A\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u00162\u0014\u0010\u0018\u001A\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016H\u0016J\u001E\u0010\u0019\u001A\u00020\u000E2\u0014\u0010\u0015\u001A\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016H\u0016¨\u0006\u001A"}, d2 = {"Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "id", "", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "(ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "apply", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "dispose", "", "nestedActivated", "", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "nestedActivated$runtime_release", "nestedDeactivated", "nestedDeactivated$runtime_release", "notifyObjectsInitialized", "notifyObjectsInitialized$runtime_release", "takeNestedMutableSnapshot", "readObserver", "Lkotlin/Function1;", "", "writeObserver", "takeNestedSnapshot", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,2431:1\n1843#2:2432\n1843#2:2434\n89#3:2433\n89#3:2435\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/GlobalSnapshot\n*L\n1444#1:2432\n1490#1:2434\n1444#1:2433\n1490#1:2435\n*E\n"})
public final class GlobalSnapshot extends MutableSnapshot {
    public static final int $stable;

    public GlobalSnapshot(int v, @NotNull SnapshotIdSet snapshotIdSet0) {
        Function1 function10;
        synchronized(SnapshotKt.getLock()) {
            List list0 = SnapshotKt.access$getGlobalWriteObservers$p();
            function10 = (Function1)CollectionsKt___CollectionsKt.singleOrNull(list0);
            if(function10 == null) {
                function10 = new h8(list0, 2);
            }
        }
        super(v, snapshotIdSet0, null, function10);
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public SnapshotApplyResult apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    public void dispose() {
        synchronized(SnapshotKt.getLock()) {
            this.releasePinnedSnapshotLocked$runtime_release();
        }
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
        SnapshotKt.access$advanceGlobalSnapshot();
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public MutableSnapshot takeNestedMutableSnapshot(@Nullable Function1 function10, @Nullable Function1 function11) {
        return (MutableSnapshot)SnapshotKt.access$takeNewSnapshot(new i1.a(function10, function11, 0));
    }

    @Override  // androidx.compose.runtime.snapshots.MutableSnapshot
    @NotNull
    public Snapshot takeNestedSnapshot(@Nullable Function1 function10) {
        return SnapshotKt.access$takeNewSnapshot(new ti(function10, 8));
    }
}

