package androidx.compose.runtime;

import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000F\b\u0007\u0018\u0000 8*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u00018B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000BJ!\u0010\u0011\u001A\u00020\u00102\n\u0010\r\u001A\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001A\u00020\u00132\n\u0010\r\u001A\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001C\u001A\u00020\u00138\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR\"\u0010 \u001A\u00020\u00138\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001D\u0010\u0017\u001A\u0004\b\u001E\u0010\u0019\"\u0004\b\u001F\u0010\u001BR(\u0010)\u001A\b\u0012\u0004\u0012\u00020\"0!8\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R$\u00101\u001A\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001A\u00020\u00138\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b2\u0010\u0017\u001A\u0004\b3\u0010\u0019\"\u0004\b4\u0010\u001BR\u0014\u00107\u001A\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b6\u0010.¨\u00069"}, d2 = {"androidx/compose/runtime/DerivedSnapshotState$ResultRecord", "T", "Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState$Record;", "<init>", "()V", "value", "", "assign", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "create", "()Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/DerivedState;", "derivedState", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "", "isValid", "(Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)Z", "", "readableHash", "(Landroidx/compose/runtime/DerivedState;Landroidx/compose/runtime/snapshots/Snapshot;)I", "c", "I", "getValidSnapshotId", "()I", "setValidSnapshotId", "(I)V", "validSnapshotId", "d", "getValidSnapshotWriteCount", "setValidSnapshotWriteCount", "validSnapshotWriteCount", "Landroidx/collection/ObjectIntMap;", "Landroidx/compose/runtime/snapshots/StateObject;", "e", "Landroidx/collection/ObjectIntMap;", "getDependencies", "()Landroidx/collection/ObjectIntMap;", "setDependencies", "(Landroidx/collection/ObjectIntMap;)V", "dependencies", "", "f", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "result", "g", "getResultHash", "setResultHash", "resultHash", "getCurrentValue", "currentValue", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 7 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,400:1\n1843#2:401\n1843#2:403\n1843#2:405\n89#3:402\n89#3:404\n89#3:406\n372#4,2:407\n374#4,2:420\n377#4,2:448\n460#5,11:409\n401#6,4:422\n373#6,6:426\n383#6,3:433\n386#6,2:437\n406#6,2:439\n389#6,6:441\n408#6:447\n1810#7:432\n1672#7:436\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/DerivedSnapshotState$ResultRecord\n*L\n110#1:401\n117#1:403\n128#1:405\n110#1:402\n117#1:404\n128#1:406\n130#1:407,2\n130#1:420,2\n130#1:448,2\n130#1:409,11\n131#1:422,4\n131#1:426,6\n131#1:433,3\n131#1:437,2\n131#1:439,2\n131#1:441,6\n131#1:447\n131#1:432\n131#1:436\n*E\n"})
public final class DerivedSnapshotState.ResultRecord extends StateRecord implements Record {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0002\u001A\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/DerivedSnapshotState$ResultRecord$Companion;", "", "Unset", "Ljava/lang/Object;", "getUnset", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Object getUnset() {
            return DerivedSnapshotState.ResultRecord.h;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public int c;
    public int d;
    public ObjectIntMap e;
    public Object f;
    public int g;
    public static final Object h;

    static {
        DerivedSnapshotState.ResultRecord.Companion = new Companion(null);
        DerivedSnapshotState.ResultRecord.$stable = 8;
        DerivedSnapshotState.ResultRecord.h = new Object();
    }

    public DerivedSnapshotState.ResultRecord() {
        this.e = ObjectIntMapKt.emptyObjectIntMap();
        this.f = DerivedSnapshotState.ResultRecord.h;
    }

    @Override  // androidx.compose.runtime.snapshots.StateRecord
    public void assign(@NotNull StateRecord stateRecord0) {
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        this.setDependencies(((DerivedSnapshotState.ResultRecord)stateRecord0).getDependencies());
        this.f = ((DerivedSnapshotState.ResultRecord)stateRecord0).f;
        this.g = ((DerivedSnapshotState.ResultRecord)stateRecord0).g;
    }

    @Override  // androidx.compose.runtime.snapshots.StateRecord
    @NotNull
    public StateRecord create() {
        return new DerivedSnapshotState.ResultRecord();
    }

    @Override  // androidx.compose.runtime.DerivedState$Record
    public Object getCurrentValue() {
        return this.f;
    }

    @Override  // androidx.compose.runtime.DerivedState$Record
    @NotNull
    public ObjectIntMap getDependencies() {
        return this.e;
    }

    @Nullable
    public final Object getResult() {
        return this.f;
    }

    public final int getResultHash() {
        return this.g;
    }

    public final int getValidSnapshotId() {
        return this.c;
    }

    public final int getValidSnapshotWriteCount() {
        return this.d;
    }

    public final boolean isValid(@NotNull DerivedState derivedState0, @NotNull Snapshot snapshot0) {
        boolean z = true;
        synchronized(SnapshotKt.getLock()) {
            boolean z1 = this.c != snapshot0.getId() || this.d != snapshot0.getWriteCount$runtime_release();
        }
        if(this.f == DerivedSnapshotState.ResultRecord.h || z1 && this.g != this.readableHash(derivedState0, snapshot0)) {
            z = false;
        }
        if(z && z1) {
            synchronized(SnapshotKt.getLock()) {
                this.c = snapshot0.getId();
                this.d = snapshot0.getWriteCount$runtime_release();
                return z;
            }
        }
        return z;
    }

    public final int readableHash(@NotNull DerivedState derivedState0, @NotNull Snapshot snapshot0) {
        long[] arr_v3;
        int v10;
        StateRecord stateRecord0;
        long[] arr_v2;
        Object object0 = SnapshotKt.getLock();
        __monitor_enter(object0);
        ObjectIntMap objectIntMap0 = this.getDependencies();
        __monitor_exit(object0);
        if(objectIntMap0.isNotEmpty()) {
            MutableVector mutableVector0 = SnapshotStateKt.derivedStateObservers();
            int v = mutableVector0.getSize();
            if(v > 0) {
                Object[] arr_object = mutableVector0.getContent();
                int v1 = 0;
                while(true) {
                    ((DerivedStateObserver)arr_object[v1]).start(derivedState0);
                    ++v1;
                    if(v1 >= v) {
                        break;
                    }
                }
            }
            try {
                Object[] arr_object1 = objectIntMap0.keys;
                int[] arr_v = objectIntMap0.values;
                long[] arr_v1 = objectIntMap0.metadata;
                int v2 = arr_v1.length - 2;
                if(v2 >= 0) {
                    int v3 = 7;
                    int v4 = 0;
                    while(true) {
                        long v5 = arr_v1[v4];
                        if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                            arr_v3 = arr_v1;
                            goto label_51;
                        }
                        int v6 = 8 - (~(v4 - v2) >>> 0x1F);
                        int v7 = 0;
                        while(v7 < v6) {
                            if((v5 & 0xFFL) < 0x80L) {
                                int v8 = (v4 << 3) + v7;
                                Object object1 = arr_object1[v8];
                                int v9 = arr_v[v8];
                                StateObject stateObject0 = (StateObject)object1;
                                if(v9 == 1) {
                                    if(stateObject0 instanceof b) {
                                        arr_v2 = arr_v1;
                                        stateRecord0 = ((b)stateObject0).a(((DerivedSnapshotState.ResultRecord)SnapshotKt.current(((b)stateObject0).d, snapshot0)), snapshot0, false, ((b)stateObject0).b);
                                    }
                                    else {
                                        arr_v2 = arr_v1;
                                        stateRecord0 = SnapshotKt.current(stateObject0.getFirstStateRecord(), snapshot0);
                                    }
                                    v3 = (v3 * 0x1F + ActualJvm_jvmKt.identityHashCode(stateRecord0)) * 0x1F + stateRecord0.getSnapshotId$runtime_release();
                                }
                                else {
                                    arr_v2 = arr_v1;
                                }
                            }
                            else {
                                arr_v2 = arr_v1;
                            }
                            v5 >>= 8;
                            ++v7;
                            arr_v1 = arr_v2;
                        }
                        arr_v3 = arr_v1;
                        if(v6 == 8) {
                        label_51:
                            if(v4 != v2) {
                                ++v4;
                                arr_v1 = arr_v3;
                                continue;
                            }
                            break;
                        }
                        else {
                            v10 = v3;
                        }
                        goto label_68;
                    }
                    v10 = v3;
                }
                else {
                    v10 = 7;
                }
            }
            catch(Throwable throwable0) {
                int v11 = mutableVector0.getSize();
                if(v11 > 0) {
                    Object[] arr_object2 = mutableVector0.getContent();
                    int v12 = 0;
                    while(true) {
                        ((DerivedStateObserver)arr_object2[v12]).done(derivedState0);
                        ++v12;
                        if(v12 >= v11) {
                            break;
                        }
                    }
                }
                throw throwable0;
            }
        label_68:
            int v13 = mutableVector0.getSize();
            if(v13 > 0) {
                Object[] arr_object3 = mutableVector0.getContent();
                int v14 = 0;
                do {
                    ((DerivedStateObserver)arr_object3[v14]).done(derivedState0);
                    ++v14;
                }
                while(v14 < v13);
                return v10;
            }
            return v10;
        }
        return 7;
    }

    public void setDependencies(@NotNull ObjectIntMap objectIntMap0) {
        this.e = objectIntMap0;
    }

    public final void setResult(@Nullable Object object0) {
        this.f = object0;
    }

    public final void setResultHash(int v) {
        this.g = v;
    }

    public final void setValidSnapshotId(int v) {
        this.c = v;
    }

    public final void setValidSnapshotWriteCount(int v) {
        this.d = v;
    }
}

