package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.snapshots.Snapshot.Companion;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.g4;
import y0.z0;

public final class b extends StateObjectImpl implements DerivedState {
    public final Function0 b;
    public final SnapshotMutationPolicy c;
    public DerivedSnapshotState.ResultRecord d;

    public b(SnapshotMutationPolicy snapshotMutationPolicy0, Function0 function00) {
        this.b = function00;
        this.c = snapshotMutationPolicy0;
        this.d = new DerivedSnapshotState.ResultRecord();
    }

    public final DerivedSnapshotState.ResultRecord a(DerivedSnapshotState.ResultRecord derivedSnapshotState$ResultRecord0, Snapshot snapshot0, boolean z, Function0 function00) {
        Companion snapshot$Companion0;
        Object object1;
        int v10;
        DerivedSnapshotState.ResultRecord derivedSnapshotState$ResultRecord1 = derivedSnapshotState$ResultRecord0;
        if(derivedSnapshotState$ResultRecord1.isValid(this, snapshot0)) {
            if(z) {
                MutableVector mutableVector0 = SnapshotStateKt.derivedStateObservers();
                int v = mutableVector0.getSize();
                if(v > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    int v1 = 0;
                    while(true) {
                        ((DerivedStateObserver)arr_object[v1]).start(this);
                        ++v1;
                        if(v1 >= v) {
                            break;
                        }
                    }
                }
                try {
                    ObjectIntMap objectIntMap0 = derivedSnapshotState$ResultRecord0.getDependencies();
                    SnapshotThreadLocal snapshotThreadLocal0 = z0.a;
                    IntRef intRef0 = (IntRef)snapshotThreadLocal0.get();
                    if(intRef0 == null) {
                        intRef0 = new IntRef(0);
                        snapshotThreadLocal0.set(intRef0);
                    }
                    int v2 = intRef0.getElement();
                    Object[] arr_object1 = objectIntMap0.keys;
                    int[] arr_v = objectIntMap0.values;
                    long[] arr_v1 = objectIntMap0.metadata;
                    int v3 = arr_v1.length - 2;
                    if(v3 >= 0) {
                        int v4 = 0;
                        while(true) {
                            long v5 = arr_v1[v4];
                            if((~v5 << 7 & v5 & 0x8080808080808080L) == 0x8080808080808080L) {
                                goto label_45;
                            }
                            int v6 = 8 - (~(v4 - v3) >>> 0x1F);
                            for(int v7 = 0; v7 < v6; ++v7) {
                                if((v5 & 0xFFL) < 0x80L) {
                                    int v8 = (v4 << 3) + v7;
                                    Object object0 = arr_object1[v8];
                                    int v9 = arr_v[v8];
                                    StateObject stateObject0 = (StateObject)object0;
                                    intRef0.setElement(v2 + v9);
                                    Function1 function10 = snapshot0.getReadObserver();
                                    if(function10 != null) {
                                        function10.invoke(stateObject0);
                                    }
                                }
                                v5 >>= 8;
                            }
                            if(v6 == 8) {
                            label_45:
                                if(v4 != v3) {
                                    ++v4;
                                    continue;
                                }
                                break;
                            }
                            else {
                                intRef0.setElement(v2);
                                v10 = mutableVector0.getSize();
                            }
                            goto label_63;
                        }
                    }
                    intRef0.setElement(v2);
                    v10 = mutableVector0.getSize();
                }
                catch(Throwable throwable0) {
                    int v11 = mutableVector0.getSize();
                    if(v11 > 0) {
                        Object[] arr_object2 = mutableVector0.getContent();
                        int v12 = 0;
                        while(true) {
                            ((DerivedStateObserver)arr_object2[v12]).done(this);
                            ++v12;
                            if(v12 >= v11) {
                                break;
                            }
                        }
                    }
                    throw throwable0;
                }
            label_63:
                if(v10 > 0) {
                    Object[] arr_object3 = mutableVector0.getContent();
                    int v13 = 0;
                    do {
                        ((DerivedStateObserver)arr_object3[v13]).done(this);
                        ++v13;
                    }
                    while(v13 < v10);
                    return derivedSnapshotState$ResultRecord1;
                }
            }
            return derivedSnapshotState$ResultRecord1;
        }
        int v14 = 0;
        MutableObjectIntMap mutableObjectIntMap0 = new MutableObjectIntMap(0, 1, null);
        SnapshotThreadLocal snapshotThreadLocal1 = z0.a;
        IntRef intRef1 = (IntRef)snapshotThreadLocal1.get();
        if(intRef1 == null) {
            intRef1 = new IntRef(0);
            snapshotThreadLocal1.set(intRef1);
        }
        int v15 = intRef1.getElement();
        MutableVector mutableVector1 = SnapshotStateKt.derivedStateObservers();
        int v16 = mutableVector1.getSize();
        if(v16 > 0) {
            Object[] arr_object4 = mutableVector1.getContent();
            for(int v17 = 0; true; ++v17) {
                ((DerivedStateObserver)arr_object4[v17]).start(this);
                if(v17 + 1 >= v16) {
                    break;
                }
            }
        }
        try {
            intRef1.setElement(v15 + 1);
            g4 g40 = new g4(this, intRef1, mutableObjectIntMap0, v15);
            object1 = Snapshot.Companion.observe(g40, null, function00);
            intRef1.setElement(v15);
            int v18 = mutableVector1.getSize();
        }
        catch(Throwable throwable1) {
            int v19 = mutableVector1.getSize();
            if(v19 > 0) {
                Object[] arr_object5 = mutableVector1.getContent();
                while(true) {
                    ((DerivedStateObserver)arr_object5[v14]).done(this);
                    ++v14;
                    if(v14 >= v19) {
                        break;
                    }
                }
            }
            throw throwable1;
        }
        if(v18 > 0) {
            Object[] arr_object6 = mutableVector1.getContent();
            while(true) {
                ((DerivedStateObserver)arr_object6[v14]).done(this);
                ++v14;
                if(v14 >= v18) {
                    break;
                }
            }
        }
        synchronized(SnapshotKt.getLock()) {
            snapshot$Companion0 = Snapshot.Companion;
            Snapshot snapshot1 = snapshot$Companion0.getCurrent();
            if(derivedSnapshotState$ResultRecord0.getResult() == DerivedSnapshotState.ResultRecord.Companion.getUnset() || (this.c == null || !this.c.equivalent(object1, derivedSnapshotState$ResultRecord0.getResult()))) {
                derivedSnapshotState$ResultRecord1 = (DerivedSnapshotState.ResultRecord)SnapshotKt.newWritableRecord(this.d, this, snapshot1);
                derivedSnapshotState$ResultRecord1.setDependencies(mutableObjectIntMap0);
                derivedSnapshotState$ResultRecord1.setResultHash(derivedSnapshotState$ResultRecord1.readableHash(this, snapshot1));
                derivedSnapshotState$ResultRecord1.setResult(object1);
            }
            else {
                derivedSnapshotState$ResultRecord1.setDependencies(mutableObjectIntMap0);
                derivedSnapshotState$ResultRecord1.setResultHash(derivedSnapshotState$ResultRecord1.readableHash(this, snapshot1));
            }
        }
        IntRef intRef2 = (IntRef)z0.a.get();
        if(intRef2 != null && intRef2.getElement() == 0) {
            snapshot$Companion0.notifyObjectsInitialized();
            synchronized(SnapshotKt.getLock()) {
                Snapshot snapshot2 = snapshot$Companion0.getCurrent();
                derivedSnapshotState$ResultRecord1.setValidSnapshotId(snapshot2.getId());
                derivedSnapshotState$ResultRecord1.setValidSnapshotWriteCount(snapshot2.getWriteCount$runtime_release());
                return derivedSnapshotState$ResultRecord1;
            }
        }
        return derivedSnapshotState$ResultRecord1;
    }

    @Override  // androidx.compose.runtime.DerivedState
    public final Record getCurrentRecord() {
        Snapshot snapshot0 = Snapshot.Companion.getCurrent();
        return this.a(((DerivedSnapshotState.ResultRecord)SnapshotKt.current(this.d, snapshot0)), snapshot0, false, this.b);
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public final StateRecord getFirstStateRecord() {
        return this.d;
    }

    @Override  // androidx.compose.runtime.DerivedState
    public final SnapshotMutationPolicy getPolicy() {
        return this.c;
    }

    @Override  // androidx.compose.runtime.State
    public final Object getValue() {
        Companion snapshot$Companion0 = Snapshot.Companion;
        Function1 function10 = snapshot$Companion0.getCurrent().getReadObserver();
        if(function10 != null) {
            function10.invoke(this);
        }
        Snapshot snapshot0 = snapshot$Companion0.getCurrent();
        return this.a(((DerivedSnapshotState.ResultRecord)SnapshotKt.current(this.d, snapshot0)), snapshot0, true, this.b).getResult();
    }

    @Override  // androidx.compose.runtime.snapshots.StateObject
    public final void prependStateRecord(StateRecord stateRecord0) {
        Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.d = (DerivedSnapshotState.ResultRecord)stateRecord0;
    }

    @Override
    public final String toString() {
        DerivedSnapshotState.ResultRecord derivedSnapshotState$ResultRecord0 = (DerivedSnapshotState.ResultRecord)SnapshotKt.current(this.d);
        DerivedSnapshotState.ResultRecord derivedSnapshotState$ResultRecord1 = (DerivedSnapshotState.ResultRecord)SnapshotKt.current(this.d);
        return "DerivedState(value=" + (derivedSnapshotState$ResultRecord1.isValid(this, Snapshot.Companion.getCurrent()) ? String.valueOf(derivedSnapshotState$ResultRecord1.getResult()) : "<Not calculated>") + ")@" + this.hashCode();
    }
}

