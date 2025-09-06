package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;

public final class g implements MainThreadCallback {
    public final AsyncListUtil a;

    public g(AsyncListUtil asyncListUtil0) {
        this.a = asyncListUtil0;
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
    public final void addTile(int v, TileList.Tile tileList$Tile0) {
        TileList.Tile tileList$Tile1;
        AsyncListUtil asyncListUtil0 = this.a;
        int v1 = 0;
        if(v != asyncListUtil0.o) {
            asyncListUtil0.g.recycleTile(tileList$Tile0);
            return;
        }
        androidx.constraintlayout.core.motion.utils.g g0 = asyncListUtil0.e;
        SparseArray sparseArray0 = (SparseArray)g0.b;
        int v2 = sparseArray0.indexOfKey(tileList$Tile0.mStartPosition);
        if(v2 < 0) {
            sparseArray0.put(tileList$Tile0.mStartPosition, tileList$Tile0);
            tileList$Tile1 = null;
        }
        else {
            TileList.Tile tileList$Tile2 = (TileList.Tile)sparseArray0.valueAt(v2);
            sparseArray0.setValueAt(v2, tileList$Tile0);
            if(((TileList.Tile)g0.c) == tileList$Tile2) {
                g0.c = tileList$Tile0;
            }
            tileList$Tile1 = tileList$Tile2;
        }
        if(tileList$Tile1 != null) {
            Log.e("AsyncListUtil", "duplicate tile @" + tileList$Tile1.mStartPosition);
            asyncListUtil0.g.recycleTile(tileList$Tile1);
        }
        int v3 = tileList$Tile0.mStartPosition + tileList$Tile0.mItemCount;
        while(true) {
            SparseIntArray sparseIntArray0 = asyncListUtil0.p;
            if(v1 >= sparseIntArray0.size()) {
                break;
            }
            int v4 = sparseIntArray0.keyAt(v1);
            if(tileList$Tile0.mStartPosition <= v4 && v4 < v3) {
                sparseIntArray0.removeAt(v1);
                asyncListUtil0.d.onItemLoaded(v4);
            }
            else {
                ++v1;
            }
        }
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
    public final void removeTile(int v, int v1) {
        AsyncListUtil asyncListUtil0 = this.a;
        if(v == asyncListUtil0.o) {
            androidx.constraintlayout.core.motion.utils.g g0 = asyncListUtil0.e;
            SparseArray sparseArray0 = (SparseArray)g0.b;
            TileList.Tile tileList$Tile0 = (TileList.Tile)sparseArray0.get(v1);
            if(((TileList.Tile)g0.c) == tileList$Tile0) {
                g0.c = null;
            }
            sparseArray0.delete(v1);
            if(tileList$Tile0 == null) {
                Log.e("AsyncListUtil", "tile not found @" + v1);
                return;
            }
            asyncListUtil0.g.recycleTile(tileList$Tile0);
        }
    }

    @Override  // androidx.recyclerview.widget.ThreadUtil$MainThreadCallback
    public final void updateItemCount(int v, int v1) {
        TileList.Tile tileList$Tile0;
        androidx.constraintlayout.core.motion.utils.g g0;
        AsyncListUtil asyncListUtil0 = this.a;
        if(v == asyncListUtil0.o) {
            asyncListUtil0.m = v1;
            asyncListUtil0.d.onDataRefresh();
            asyncListUtil0.n = asyncListUtil0.o;
            int v2 = 0;
            while(true) {
                g0 = asyncListUtil0.e;
                if(v2 >= ((SparseArray)g0.b).size()) {
                    break;
                }
                if(v2 >= 0) {
                    SparseArray sparseArray0 = (SparseArray)g0.b;
                    if(v2 < sparseArray0.size()) {
                        tileList$Tile0 = (TileList.Tile)sparseArray0.valueAt(v2);
                        goto label_15;
                    }
                }
                else {
                    g0.getClass();
                }
                tileList$Tile0 = null;
            label_15:
                asyncListUtil0.g.recycleTile(tileList$Tile0);
                ++v2;
            }
            ((SparseArray)g0.b).clear();
            asyncListUtil0.k = false;
            asyncListUtil0.a();
        }
    }
}

