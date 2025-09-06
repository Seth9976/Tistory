package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import androidx.constraintlayout.core.motion.utils.g;

public class AsyncListUtil {
    public static abstract class DataCallback {
        @WorkerThread
        public abstract void fillData(@NonNull Object[] arg1, int arg2, int arg3);

        @WorkerThread
        public int getMaxCachedTiles() [...] // Inlined contents

        @WorkerThread
        public void recycleData(@NonNull Object[] arr_object, int v) {
        }

        @WorkerThread
        public abstract int refreshData();
    }

    public static abstract class ViewCallback {
        public static final int HINT_SCROLL_ASC = 2;
        public static final int HINT_SCROLL_DESC = 1;
        public static final int HINT_SCROLL_NONE;

        @UiThread
        public void extendRangeInto(@NonNull int[] arr_v, @NonNull int[] arr_v1, int v) {
            int v1 = arr_v[1];
            int v2 = v1 - arr_v[0] + 1;
            arr_v1[0] = arr_v[0] - (v == 1 ? v2 : v2 / 2);
            if(v != 2) {
                v2 /= 2;
            }
            arr_v1[1] = v1 + v2;
        }

        @UiThread
        public abstract void getItemRangeInto(@NonNull int[] arg1);

        @UiThread
        public abstract void onDataRefresh();

        @UiThread
        public abstract void onItemLoaded(int arg1);
    }

    public final Class a;
    public final int b;
    public final DataCallback c;
    public final ViewCallback d;
    public final g e;
    public final v0 f;
    public final x0 g;
    public final int[] h;
    public final int[] i;
    public final int[] j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final SparseIntArray p;

    public AsyncListUtil(@NonNull Class class0, int v, @NonNull DataCallback asyncListUtil$DataCallback0, @NonNull ViewCallback asyncListUtil$ViewCallback0) {
        this.h = new int[2];
        this.i = new int[2];
        this.j = new int[2];
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = new SparseIntArray();
        androidx.recyclerview.widget.g g0 = new androidx.recyclerview.widget.g(this);
        h h0 = new h(this);
        this.a = class0;
        this.b = v;
        this.c = asyncListUtil$DataCallback0;
        this.d = asyncListUtil$ViewCallback0;
        this.e = new g(v);
        this.f = new v0(g0);
        this.g = new x0(h0);
        this.refresh();
    }

    public final void a() {
        int[] arr_v = this.h;
        ViewCallback asyncListUtil$ViewCallback0 = this.d;
        asyncListUtil$ViewCallback0.getItemRangeInto(arr_v);
        int v = arr_v[0];
        int v1 = arr_v[1];
        if(v > v1 || v < 0 || v1 >= this.m) {
            return;
        }
        int[] arr_v1 = this.i;
        if(!this.k) {
            this.l = 0;
        }
        else if(v <= arr_v1[1]) {
            int v2 = arr_v1[0];
            if(v2 > v1) {
                this.l = 0;
            }
            else if(v < v2) {
                this.l = 1;
            }
            else if(v > v2) {
                this.l = 2;
            }
        }
        else {
            this.l = 0;
        }
        arr_v1[0] = v;
        arr_v1[1] = v1;
        asyncListUtil$ViewCallback0.extendRangeInto(arr_v, this.j, this.l);
        this.j[0] = Math.min(arr_v[0], Math.max(this.j[0], 0));
        int v3 = Math.max(arr_v[1], Math.min(this.j[1], this.m - 1));
        this.j[1] = v3;
        this.g.updateRange(arr_v[0], arr_v[1], this.j[0], v3, this.l);
    }

    @Nullable
    public Object getItem(int v) {
        Object object0;
        if(v < 0 || v >= this.m) {
            throw new IndexOutOfBoundsException(v + " is not within 0 and " + this.m);
        }
        g g0 = this.e;
        TileList.Tile tileList$Tile0 = (TileList.Tile)g0.c;
        if(tileList$Tile0 != null && (tileList$Tile0.mStartPosition <= v && v < tileList$Tile0.mStartPosition + tileList$Tile0.mItemCount)) {
            object0 = ((TileList.Tile)g0.c).mItems[v - ((TileList.Tile)g0.c).mStartPosition];
        }
        else {
            int v1 = v - v % g0.a;
            SparseArray sparseArray0 = (SparseArray)g0.b;
            int v2 = sparseArray0.indexOfKey(v1);
            if(v2 < 0) {
                object0 = null;
            }
            else {
                g0.c = (TileList.Tile)sparseArray0.valueAt(v2);
                object0 = ((TileList.Tile)g0.c).mItems[v - ((TileList.Tile)g0.c).mStartPosition];
            }
        }
        if(object0 == null && this.o == this.n) {
            this.p.put(v, 0);
        }
        return object0;
    }

    public int getItemCount() {
        return this.m;
    }

    public void onRangeChanged() {
        if(this.o != this.n) {
            return;
        }
        this.a();
        this.k = true;
    }

    public void refresh() {
        this.p.clear();
        int v = this.o + 1;
        this.o = v;
        this.g.refresh(v);
    }
}

