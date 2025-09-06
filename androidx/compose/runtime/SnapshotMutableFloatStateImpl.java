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
import y0.u0;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001$B\u000F\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001A\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001C\u0010\f\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000B0\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J)\u0010\u0014\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0011\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001B\u001A\u00020\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR$\u0010\u001F\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00048V@VX\u0096\u000E¢\u0006\f\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u0007R\u001A\u0010#\u001A\b\u0012\u0004\u0012\u00020\u00040 8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableFloatStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableFloatState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "value", "<init>", "(F)V", "component1", "()Ljava/lang/Float;", "Lkotlin/Function1;", "", "component2", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/StateRecord;", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "previous", "current", "applied", "mergeRecords", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "toString", "()Ljava/lang/String;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getFloatValue", "()F", "setFloatValue", "floatValue", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "y0/u0", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapshotFloatState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFloatState.kt\nandroidx/compose/runtime/SnapshotMutableFloatStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 FloatingPointEquality.android.kt\nandroidx/compose/runtime/internal/FloatingPointEquality_androidKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,189:1\n2420#2:190\n2341#2,2:196\n1843#2:198\n2343#2,5:200\n2420#2:210\n41#3,5:191\n41#3,5:205\n89#4:199\n*S KotlinDebug\n*F\n+ 1 SnapshotFloatState.kt\nandroidx/compose/runtime/SnapshotMutableFloatStateImpl\n*L\n142#1:190\n144#1:196,2\n144#1:198\n144#1:200,5\n175#1:210\n143#1:191,5\n168#1:205,5\n144#1:199\n*E\n"})
public class SnapshotMutableFloatStateImpl extends StateObjectImpl implements MutableFloatState, SnapshotMutableState {
    public static final int $stable;
    public u0 b;

    public SnapshotMutableFloatStateImpl(float f) {
        u0 u00 = new u0(f);
        if(Snapshot.Companion.isInSnapshot()) {
            u0 u01 = new u0(f);
            u01.setSnapshotId$runtime_release(1);
            u00.setNext$runtime_release(u01);
        }
        this.b = u00;
    }

    @NotNull
    public Float component1() {
        return this.getFloatValue();
    }

    @Override  // androidx.compose.runtime.MutableState
    public Object component1() {
        return this.component1();
    }

    @Override  // androidx.compose.runtime.MutableState
    @NotNull
    public Function1 component2() {
        return new h1(this, 27);
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.b;
    }

    @Override  // androidx.compose.runtime.MutableFloatState
    public float getFloatValue() {
        return ((u0)SnapshotKt.readable(this.b, this)).c;
    }

    @Override  // androidx.compose.runtime.snapshots.SnapshotMutableState
    @NotNull
    public SnapshotMutationPolicy getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @Nullable
    public StateRecord mergeRecords(@NotNull StateRecord stateRecord0, @NotNull StateRecord stateRecord1, @NotNull StateRecord stateRecord2) {
        Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        Intrinsics.checkNotNull(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        return ((u0)stateRecord1).c == ((u0)stateRecord2).c ? stateRecord1 : null;
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord stateRecord0) {
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.b = (u0)stateRecord0;
    }

    @Override  // androidx.compose.runtime.MutableFloatState
    public void setFloatValue(float f) {
        Snapshot snapshot0;
        u0 u00 = (u0)SnapshotKt.current(this.b);
        if(u00.c != f) {
            u0 u01 = this.b;
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                ((u0)SnapshotKt.overwritableRecord(u01, this, snapshot0, u00)).c = f;
            }
            SnapshotKt.notifyWrite(snapshot0, this);
        }
    }

    @Override
    @NotNull
    public String toString() {
        return "MutableFloatState(value=" + ((u0)SnapshotKt.current(this.b)).c + ")@" + this.hashCode();
    }
}

