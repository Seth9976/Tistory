package i1;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator.next.1;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.markers.KMutableIterator;

public final class g implements Iterator, KMutableIterator {
    public final SnapshotStateMap a;
    public final Iterator b;
    public int c;
    public Map.Entry d;
    public Map.Entry e;
    public final int f;

    public g(SnapshotStateMap snapshotStateMap0, Iterator iterator0, int v) {
        this.f = v;
        super();
        this.a = snapshotStateMap0;
        this.b = iterator0;
        this.c = snapshotStateMap0.getModification$runtime_release();
        this.a();
    }

    public final void a() {
        Map.Entry map$Entry0;
        this.d = this.e;
        Iterator iterator0 = this.b;
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            map$Entry0 = (Map.Entry)object0;
        }
        else {
            map$Entry0 = null;
        }
        this.e = map$Entry0;
    }

    @Override
    public final boolean hasNext() {
        return this.e != null;
    }

    @Override
    public final Object next() {
        switch(this.f) {
            case 0: {
                this.a();
                if(this.d == null) {
                    throw new IllegalStateException();
                }
                return new StateMapMutableEntriesIterator.next.1(this);
            }
            case 1: {
                Map.Entry map$Entry1 = this.e;
                if(map$Entry1 == null) {
                    throw new IllegalStateException();
                }
                this.a();
                return map$Entry1.getKey();
            }
            default: {
                Map.Entry map$Entry0 = this.e;
                if(map$Entry0 == null) {
                    throw new IllegalStateException();
                }
                this.a();
                return map$Entry0.getValue();
            }
        }
    }

    @Override
    public final void remove() {
        SnapshotStateMap snapshotStateMap0 = this.a;
        if(snapshotStateMap0.getModification$runtime_release() != this.c) {
            throw new ConcurrentModificationException();
        }
        Map.Entry map$Entry0 = this.d;
        if(map$Entry0 == null) {
            throw new IllegalStateException();
        }
        snapshotStateMap0.remove(map$Entry0.getKey());
        this.d = null;
        this.c = snapshotStateMap0.getModification$runtime_release();
    }
}

