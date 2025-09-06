package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;

public final class y1 implements StableIdLookup {
    public final LongSparseArray a;
    public final IsolatedStableIdStorage b;

    public y1(IsolatedStableIdStorage stableIdStorage$IsolatedStableIdStorage0) {
        this.b = stableIdStorage$IsolatedStableIdStorage0;
        this.a = new LongSparseArray();
    }

    @Override  // androidx.recyclerview.widget.StableIdStorage$StableIdLookup
    public final long localToGlobal(long v) {
        LongSparseArray longSparseArray0 = this.a;
        Long long0 = (Long)longSparseArray0.get(v);
        if(long0 == null) {
            long v1 = this.b.a;
            this.b.a = v1 + 1L;
            long0 = v1;
            longSparseArray0.put(v, long0);
        }
        return (long)long0;
    }
}

