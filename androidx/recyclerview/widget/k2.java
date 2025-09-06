package androidx.recyclerview.widget;

import a5.b;
import android.util.SparseArray;
import android.util.SparseIntArray;

public final class k2 implements ViewTypeLookup {
    public final SparseIntArray a;
    public final SparseIntArray b;
    public final a1 c;
    public final IsolatedViewTypeStorage d;

    public k2(IsolatedViewTypeStorage viewTypeStorage$IsolatedViewTypeStorage0, a1 a10) {
        this.d = viewTypeStorage$IsolatedViewTypeStorage0;
        this.a = new SparseIntArray(1);
        this.b = new SparseIntArray(1);
        this.c = a10;
    }

    @Override  // androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup
    public final void dispose() {
        SparseArray sparseArray0 = this.d.a;
        for(int v = sparseArray0.size() - 1; v >= 0; --v) {
            if(((a1)sparseArray0.valueAt(v)) == this.c) {
                sparseArray0.removeAt(v);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup
    public final int globalToLocal(int v) {
        SparseIntArray sparseIntArray0 = this.b;
        int v1 = sparseIntArray0.indexOfKey(v);
        if(v1 >= 0) {
            return sparseIntArray0.valueAt(v1);
        }
        StringBuilder stringBuilder0 = b.s(v, "requested global type ", " does not belong to the adapter:");
        stringBuilder0.append(this.c.c);
        throw new IllegalStateException(stringBuilder0.toString());
    }

    @Override  // androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup
    public final int localToGlobal(int v) {
        SparseIntArray sparseIntArray0 = this.a;
        int v1 = sparseIntArray0.indexOfKey(v);
        if(v1 > -1) {
            return sparseIntArray0.valueAt(v1);
        }
        int v2 = this.d.b;
        this.d.b = v2 + 1;
        this.d.a.put(v2, this.c);
        sparseIntArray0.put(v, v2);
        this.b.put(v2, v);
        return v2;
    }
}

