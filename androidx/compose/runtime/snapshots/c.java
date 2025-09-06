package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.room.a;
import i1.e;
import i1.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class c extends e {
    @Override
    public final boolean add(Object object0) {
        throw a.q();
    }

    @Override
    public final boolean addAll(Collection collection0) {
        throw a.q();
    }

    @Override
    public final boolean contains(Object object0) {
        return this.a.containsValue(object0);
    }

    @Override
    public final boolean containsAll(Collection collection0) {
        if(!(collection0 instanceof Collection) || !collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.a.containsValue(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public final Iterator iterator() {
        Iterator iterator0 = ((ImmutableSet)this.a.getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        return new g(this.a, iterator0, 2);
    }

    @Override
    public final boolean remove(Object object0) {
        return this.a.removeValue$runtime_release(object0);
    }

    @Override
    public final boolean removeAll(Collection collection0) {
        Snapshot snapshot0;
        PersistentMap persistentMap0;
        boolean z1;
        Set set0 = CollectionsKt___CollectionsKt.toSet(collection0);
        SnapshotStateMap snapshotStateMap0 = this.a;
        boolean z = false;
        while(true) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord0 = snapshotStateMap0.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)stateRecord0));
                persistentMap0 = snapshotStateMap$StateMapStateRecord0.getMap$runtime_release();
                int v1 = snapshotStateMap$StateMapStateRecord0.getModification$runtime_release();
            }
            Intrinsics.checkNotNull(persistentMap0);
            Builder persistentMap$Builder0 = persistentMap0.builder();
            Iterator iterator0 = snapshotStateMap0.entrySet().iterator();
            while(true) {
                z1 = true;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object1 = iterator0.next();
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(set0.contains(map$Entry0.getValue())) {
                    persistentMap$Builder0.remove(map$Entry0.getKey());
                    z = true;
                }
            }
            PersistentMap persistentMap1 = persistentMap$Builder0.build();
            if(Intrinsics.areEqual(persistentMap1, persistentMap0)) {
                break;
            }
            StateRecord stateRecord1 = snapshotStateMap0.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)stateRecord1), snapshotStateMap0, snapshot0);
                synchronized(SnapshotStateMapKt.a) {
                    if(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() == v1) {
                        snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap1);
                        snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
                    }
                    else {
                        z1 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, snapshotStateMap0);
            if(z1) {
                return z;
            }
        }
        return z;
    }

    @Override
    public final boolean retainAll(Collection collection0) {
        Snapshot snapshot0;
        PersistentMap persistentMap0;
        boolean z1;
        Set set0 = CollectionsKt___CollectionsKt.toSet(collection0);
        SnapshotStateMap snapshotStateMap0 = this.a;
        boolean z = false;
        while(true) {
            synchronized(SnapshotStateMapKt.a) {
                StateRecord stateRecord0 = snapshotStateMap0.getFirstStateRecord();
                Intrinsics.checkNotNull(stateRecord0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord snapshotStateMap$StateMapStateRecord0 = (StateMapStateRecord)SnapshotKt.current(((StateMapStateRecord)stateRecord0));
                persistentMap0 = snapshotStateMap$StateMapStateRecord0.getMap$runtime_release();
                int v1 = snapshotStateMap$StateMapStateRecord0.getModification$runtime_release();
            }
            Intrinsics.checkNotNull(persistentMap0);
            Builder persistentMap$Builder0 = persistentMap0.builder();
            Iterator iterator0 = snapshotStateMap0.entrySet().iterator();
            while(true) {
                z1 = true;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object1 = iterator0.next();
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(!set0.contains(map$Entry0.getValue())) {
                    persistentMap$Builder0.remove(map$Entry0.getKey());
                    z = true;
                }
            }
            PersistentMap persistentMap1 = persistentMap$Builder0.build();
            if(Intrinsics.areEqual(persistentMap1, persistentMap0)) {
                break;
            }
            StateRecord stateRecord1 = snapshotStateMap0.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecord1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized(SnapshotKt.getLock()) {
                snapshot0 = Snapshot.Companion.getCurrent();
                StateMapStateRecord snapshotStateMap$StateMapStateRecord1 = (StateMapStateRecord)SnapshotKt.writableRecord(((StateMapStateRecord)stateRecord1), snapshotStateMap0, snapshot0);
                synchronized(SnapshotStateMapKt.a) {
                    if(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() == v1) {
                        snapshotStateMap$StateMapStateRecord1.setMap$runtime_release(persistentMap1);
                        snapshotStateMap$StateMapStateRecord1.setModification$runtime_release(snapshotStateMap$StateMapStateRecord1.getModification$runtime_release() + 1);
                    }
                    else {
                        z1 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(snapshot0, snapshotStateMap0);
            if(z1) {
                return z;
            }
        }
        return z;
    }
}

