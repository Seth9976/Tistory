package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s.h1;
import y0.w0;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001$B\u000F\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001C\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000B0\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J)\u0010\u0014\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001B\u001A\u00020\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR$\u0010\u001F\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00048V@VX\u0096\u000E¢\u0006\f\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u0007R\u001A\u0010#\u001A\b\u0012\u0004\u0012\u00020\u00040 8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableLongStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableLongState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "value", "<init>", "(J)V", "component1", "()Ljava/lang/Long;", "Lkotlin/Function1;", "", "component2", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/StateRecord;", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "previous", "current", "applied", "mergeRecords", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "toString", "()Ljava/lang/String;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getLongValue", "()J", "setLongValue", "longValue", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "y0/w0", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapshotLongState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotMutableLongStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,189:1\n2420#2:190\n2341#2,2:191\n1843#2:193\n2343#2,5:195\n2420#2:200\n89#3:194\n*S KotlinDebug\n*F\n+ 1 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotMutableLongStateImpl\n*L\n142#1:190\n144#1:191,2\n144#1:193\n144#1:195,5\n175#1:200\n144#1:194\n*E\n"})
public class SnapshotMutableLongStateImpl extends StateObjectImpl implements MutableLongState, SnapshotMutableState {
    public static final int $stable;
    public w0 b;

    public SnapshotMutableLongStateImpl(long v) {
        w0 w00 = new w0(v);
        if(Snapshot.Companion.isInSnapshot()) {
            w0 w01 = new w0(v);
            w01.setSnapshotId$runtime_release(1);
            w00.setNext$runtime_release(w01);
        }
        this.b = w00;
    }

    @NotNull
    public Long component1() {
        return this.getLongValue();
    }

    @Override  // androidx.compose.runtime.MutableState
    public Object component1() {
        return this.component1();
    }

    @Override  // androidx.compose.runtime.MutableState
    @NotNull
    public Function1 component2() {
        return new h1(this, 29);
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.b;
    }

    @Override  // androidx.compose.runtime.MutableLongState
    public long getLongValue() {
        return ((w0)SnapshotKt.readable(this.b, this)).c;
    }

    @Override  // androidx.compose.runtime.snapshots.SnapshotMutableState
    @NotNull
    public SnapshotMutationPolicy getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @Nullable
    public StateRecord mergeRecords(@NotNull StateRecord stateRecord0, @NotNull StateRecord stateRecord1, @NotNull StateRecord stateRecord2) {
        Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        Intrinsics.checkNotNull(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        return ((w0)stateRecord1).c == ((w0)stateRecord2).c ? stateRecord1 : null;
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord stateRecord0) {
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.b = (w0)stateRecord0;
    }

    @Override  // androidx.compose.runtime.MutableLongState
    public void setLongValue(long v) {
        Snapshot snapshot0;
        w0 w00 = (w0)SnapshotKt.current(this.b);
        if(w00.c != v) {
            w0 w01 = this.b;
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                ((w0)SnapshotKt.overwritableRecord(w01, this, snapshot0, w00)).c = v;
            }
            SnapshotKt.notifyWrite(snapshot0, this);
        }
    }

    @Override
    @NotNull
    public String toString() {
        return "MutableLongState(value=" + ((w0)SnapshotKt.current(this.b)).c + ")@" + this.hashCode();
    }
}

