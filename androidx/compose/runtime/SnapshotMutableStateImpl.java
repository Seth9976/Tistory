package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y0.x0;
import y0.y0;

@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001)B\u001D\u0012\u0006\u0010\u0004\u001A\u00028\u0000\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0004\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ)\u0010\u0010\u001A\u0004\u0018\u00010\t2\u0006\u0010\r\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001C\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR*\u0010\u0004\u001A\u00028\u00002\u0006\u0010\u0004\u001A\u00028\u00008V@VX\u0096\u000E¢\u0006\u0012\u0012\u0004\b!\u0010\"\u001A\u0004\b\u001E\u0010\u0016\"\u0004\b\u001F\u0010 R\u0017\u0010%\u001A\u00028\u00008G¢\u0006\f\u0012\u0004\b$\u0010\"\u001A\u0004\b#\u0010\u0016R\u0014\u0010(\u001A\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b&\u0010\'¨\u0006*"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableStateImpl;", "T", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "value", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "Landroidx/compose/runtime/snapshots/StateRecord;", "", "prependStateRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "previous", "current", "applied", "mergeRecords", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/lang/Object;", "Lkotlin/Function1;", "component2", "()Lkotlin/jvm/functions/Function1;", "b", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "getValue", "setValue", "(Ljava/lang/Object;)V", "getValue$annotations", "()V", "getDebuggerDisplayValue", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "y0/x0", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,313:1\n2420#2:314\n2341#2,2:315\n1843#2:317\n2343#2,5:319\n2420#2:324\n2420#2:325\n89#3:318\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotMutableStateImpl\n*L\n136#1:314\n138#1:315,2\n138#1:317\n138#1:319,5\n185#1:324\n221#1:325\n138#1:318\n*E\n"})
public class SnapshotMutableStateImpl extends StateObjectImpl implements SnapshotMutableState {
    public static final int $stable;
    public final SnapshotMutationPolicy b;
    public x0 c;

    public SnapshotMutableStateImpl(Object object0, @NotNull SnapshotMutationPolicy snapshotMutationPolicy0) {
        this.b = snapshotMutationPolicy0;
        x0 x00 = new x0(object0);
        if(Snapshot.Companion.isInSnapshot()) {
            x0 x01 = new x0(object0);
            x01.setSnapshotId$runtime_release(1);
            x00.setNext$runtime_release(x01);
        }
        this.c = x00;
    }

    @Override  // androidx.compose.runtime.MutableState
    public Object component1() {
        return this.getValue();
    }

    @Override  // androidx.compose.runtime.MutableState
    @NotNull
    public Function1 component2() {
        return new y0(this, 0);
    }

    @JvmName(name = "getDebuggerDisplayValue")
    public final Object getDebuggerDisplayValue() {
        return ((x0)SnapshotKt.current(this.c)).c;
    }

    public static void getDebuggerDisplayValue$annotations() {
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.c;
    }

    @Override  // androidx.compose.runtime.snapshots.SnapshotMutableState
    @NotNull
    public SnapshotMutationPolicy getPolicy() {
        return this.b;
    }

    @Override  // androidx.compose.runtime.MutableState
    public Object getValue() {
        return ((x0)SnapshotKt.readable(this.c, this)).c;
    }

    public static void getValue$annotations() {
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    @Nullable
    public StateRecord mergeRecords(@NotNull StateRecord stateRecord0, @NotNull StateRecord stateRecord1, @NotNull StateRecord stateRecord2) {
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        Intrinsics.checkNotNull(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        if(!this.getPolicy().equivalent(((x0)stateRecord1).c, ((x0)stateRecord2).c)) {
            Object object0 = this.getPolicy().merge(((x0)stateRecord0).c, ((x0)stateRecord1).c, ((x0)stateRecord2).c);
            if(object0 != null) {
                stateRecord1 = ((x0)stateRecord2).create();
                Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$4>");
                ((x0)stateRecord1).c = object0;
                return stateRecord1;
            }
            return null;
        }
        return stateRecord1;
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord stateRecord0) {
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.c = (x0)stateRecord0;
    }

    @Override  // androidx.compose.runtime.MutableState
    public void setValue(Object object0) {
        Snapshot snapshot0;
        x0 x00 = (x0)SnapshotKt.current(this.c);
        if(!this.getPolicy().equivalent(x00.c, object0)) {
            x0 x01 = this.c;
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                ((x0)SnapshotKt.overwritableRecord(x01, this, snapshot0, x00)).c = object0;
            }
            SnapshotKt.notifyWrite(snapshot0, this);
        }
    }

    @Override
    @NotNull
    public String toString() {
        return "MutableState(value=" + ((x0)SnapshotKt.current(this.c)).c + ")@" + this.hashCode();
    }
}

