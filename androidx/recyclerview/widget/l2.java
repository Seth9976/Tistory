package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

public final class l2 implements ViewTypeLookup {
    public final a1 a;
    public final SharedIdRangeViewTypeStorage b;

    public l2(SharedIdRangeViewTypeStorage viewTypeStorage$SharedIdRangeViewTypeStorage0, a1 a10) {
        this.b = viewTypeStorage$SharedIdRangeViewTypeStorage0;
        this.a = a10;
    }

    @Override  // androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup
    public final void dispose() {
        SparseArray sparseArray0 = this.b.a;
        for(int v = sparseArray0.size() - 1; v >= 0; --v) {
            List list0 = (List)sparseArray0.valueAt(v);
            if(list0.remove(this.a) && list0.isEmpty()) {
                sparseArray0.removeAt(v);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup
    public final int globalToLocal(int v) {
        return v;
    }

    @Override  // androidx.recyclerview.widget.ViewTypeStorage$ViewTypeLookup
    public final int localToGlobal(int v) {
        SharedIdRangeViewTypeStorage viewTypeStorage$SharedIdRangeViewTypeStorage0 = this.b;
        List list0 = (List)viewTypeStorage$SharedIdRangeViewTypeStorage0.a.get(v);
        if(list0 == null) {
            list0 = new ArrayList();
            viewTypeStorage$SharedIdRangeViewTypeStorage0.a.put(v, list0);
        }
        a1 a10 = this.a;
        if(!list0.contains(a10)) {
            list0.add(a10);
        }
        return v;
    }
}

