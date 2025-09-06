package androidx.recyclerview.widget;

import android.util.SparseBooleanArray;

public final class h implements BackgroundCallback {
    public TileList.Tile a;
    public final SparseBooleanArray b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final AsyncListUtil g;

    public h(AsyncListUtil asyncListUtil0) {
        this.g = asyncListUtil0;
        this.b = new SparseBooleanArray();
    }

    public final void a(int v, int v1, int v2, boolean z) {
        for(int v3 = v; v3 <= v1; v3 += this.g.b) {
            this.g.g.loadTile((z ? v1 + v - v3 : v3), v2);
        }
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
    public final void loadTile(int v, int v1) {
        SparseBooleanArray sparseBooleanArray0 = this.b;
        if(sparseBooleanArray0.get(v)) {
            return;
        }
        TileList.Tile tileList$Tile0 = this.a;
        AsyncListUtil asyncListUtil0 = this.g;
        if(tileList$Tile0 == null) {
            tileList$Tile0 = new TileList.Tile(asyncListUtil0.b, asyncListUtil0.a);
        }
        else {
            this.a = tileList$Tile0.a;
        }
        tileList$Tile0.mStartPosition = v;
        int v2 = Math.min(asyncListUtil0.b, this.d - v);
        tileList$Tile0.mItemCount = v2;
        asyncListUtil0.c.fillData(tileList$Tile0.mItems, tileList$Tile0.mStartPosition, v2);
        while(sparseBooleanArray0.size() >= 10) {
            int v3 = sparseBooleanArray0.keyAt(0);
            int v4 = sparseBooleanArray0.keyAt(sparseBooleanArray0.size() - 1);
            int v5 = this.e - v3;
            int v6 = v4 - this.f;
            if(v5 > 0 && (v5 >= v6 || v1 == 2)) {
                sparseBooleanArray0.delete(v3);
                asyncListUtil0.f.removeTile(this.c, v3);
            }
            else {
                if(v6 <= 0 || v5 >= v6 && v1 != 1) {
                    break;
                }
                sparseBooleanArray0.delete(v4);
                asyncListUtil0.f.removeTile(this.c, v4);
            }
        }
        sparseBooleanArray0.put(tileList$Tile0.mStartPosition, true);
        asyncListUtil0.f.addTile(this.c, tileList$Tile0);
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
    public final void recycleTile(TileList.Tile tileList$Tile0) {
        this.g.c.recycleData(tileList$Tile0.mItems, tileList$Tile0.mItemCount);
        tileList$Tile0.a = this.a;
        this.a = tileList$Tile0;
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
    public final void refresh(int v) {
        this.c = v;
        this.b.clear();
        int v1 = this.g.c.refreshData();
        this.d = v1;
        this.g.f.updateItemCount(this.c, v1);
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil$BackgroundCallback
    public final void updateRange(int v, int v1, int v2, int v3, int v4) {
        if(v > v1) {
            return;
        }
        AsyncListUtil asyncListUtil0 = this.g;
        int v5 = v - v % asyncListUtil0.b;
        int v6 = v1 - v1 % asyncListUtil0.b;
        int v7 = v2 - v2 % asyncListUtil0.b;
        this.e = v7;
        int v8 = v3 - v3 % asyncListUtil0.b;
        this.f = v8;
        if(v4 == 1) {
            this.a(v7, v6, 1, true);
            this.a(v6 + asyncListUtil0.b, this.f, 1, false);
            return;
        }
        this.a(v5, v8, v4, false);
        this.a(this.e, v5 - asyncListUtil0.b, v4, true);
    }
}

