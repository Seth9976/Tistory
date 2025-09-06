package r;

import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.collection.IndexBasedArrayIterator;

public final class a extends IndexBasedArrayIterator {
    public final int d;
    public final Object e;

    public a(ArrayMap arrayMap0, int v) {
        this.d = v;
        if(v != 1) {
            this.e = arrayMap0;
            super(arrayMap0.size());
            return;
        }
        this.e = arrayMap0;
        super(arrayMap0.size());
    }

    public a(ArraySet arraySet0) {
        this.d = 2;
        this.e = arraySet0;
        super(arraySet0.get_size$collection());
    }

    @Override  // androidx.collection.IndexBasedArrayIterator
    public final Object elementAt(int v) {
        switch(this.d) {
            case 0: {
                return ((ArrayMap)this.e).keyAt(v);
            }
            case 1: {
                return ((ArrayMap)this.e).valueAt(v);
            }
            default: {
                return ((ArraySet)this.e).valueAt(v);
            }
        }
    }

    @Override  // androidx.collection.IndexBasedArrayIterator
    public final void removeAt(int v) {
        switch(this.d) {
            case 0: {
                ((ArrayMap)this.e).removeAt(v);
                return;
            }
            case 1: {
                ((ArrayMap)this.e).removeAt(v);
                return;
            }
            default: {
                ((ArraySet)this.e).removeAt(v);
            }
        }
    }
}

