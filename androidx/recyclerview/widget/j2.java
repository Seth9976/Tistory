package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;

public final class j2 {
    public final SimpleArrayMap a;
    public final LongSparseArray b;

    public j2() {
        this.a = new SimpleArrayMap();
        this.b = new LongSparseArray();
    }

    public final void a(ViewHolder recyclerView$ViewHolder0, ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0) {
        SimpleArrayMap simpleArrayMap0 = this.a;
        i2 i20 = (i2)simpleArrayMap0.get(recyclerView$ViewHolder0);
        if(i20 == null) {
            i20 = i2.a();
            simpleArrayMap0.put(recyclerView$ViewHolder0, i20);
        }
        i20.c = recyclerView$ItemAnimator$ItemHolderInfo0;
        i20.a |= 8;
    }

    public final ItemHolderInfo b(ViewHolder recyclerView$ViewHolder0, int v) {
        ItemHolderInfo recyclerView$ItemAnimator$ItemHolderInfo0;
        SimpleArrayMap simpleArrayMap0 = this.a;
        int v1 = simpleArrayMap0.indexOfKey(recyclerView$ViewHolder0);
        if(v1 < 0) {
            return null;
        }
        i2 i20 = (i2)simpleArrayMap0.valueAt(v1);
        if(i20 != null) {
            int v2 = i20.a;
            if((v2 & v) != 0) {
                int v3 = v2 & ~v;
                i20.a = v3;
                if(v == 4) {
                    recyclerView$ItemAnimator$ItemHolderInfo0 = i20.b;
                }
                else if(v == 8) {
                    recyclerView$ItemAnimator$ItemHolderInfo0 = i20.c;
                }
                else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if((v3 & 12) == 0) {
                    simpleArrayMap0.removeAt(v1);
                    i20.a = 0;
                    i20.b = null;
                    i20.c = null;
                    i2.d.release(i20);
                }
                return recyclerView$ItemAnimator$ItemHolderInfo0;
            }
        }
        return null;
    }

    public final void c(ViewHolder recyclerView$ViewHolder0) {
        i2 i20 = (i2)this.a.get(recyclerView$ViewHolder0);
        if(i20 == null) {
            return;
        }
        i20.a &= -2;
    }

    public final void d(ViewHolder recyclerView$ViewHolder0) {
        LongSparseArray longSparseArray0 = this.b;
        for(int v = longSparseArray0.size() - 1; v >= 0; --v) {
            if(recyclerView$ViewHolder0 == longSparseArray0.valueAt(v)) {
                longSparseArray0.removeAt(v);
                break;
            }
        }
        i2 i20 = (i2)this.a.remove(recyclerView$ViewHolder0);
        if(i20 != null) {
            i20.a = 0;
            i20.b = null;
            i20.c = null;
            i2.d.release(i20);
        }
    }
}

