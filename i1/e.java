package i1;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Set;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMutableSet;

public abstract class e implements Set, KMutableSet {
    public final SnapshotStateMap a;

    public e(SnapshotStateMap snapshotStateMap0) {
        this.a = snapshotStateMap0;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public final Object[] toArray(Object[] arr_object) {
        return CollectionToArray.toArray(this, arr_object);
    }
}

