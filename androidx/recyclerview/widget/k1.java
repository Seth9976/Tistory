package androidx.recyclerview.widget;

import android.util.Log;

public final class k1 implements AdapterHelper.Callback {
    public final RecyclerView a;

    public k1(RecyclerView recyclerView0) {
        this.a = recyclerView0;
    }

    public final void a(a a0) {
        RecyclerView recyclerView0 = this.a;
        switch(a0.a) {
            case 1: {
                recyclerView0.mLayout.onItemsAdded(recyclerView0, a0.b, a0.d);
                return;
            }
            case 2: {
                recyclerView0.mLayout.onItemsRemoved(recyclerView0, a0.b, a0.d);
                return;
            }
            case 4: {
                recyclerView0.mLayout.onItemsUpdated(recyclerView0, a0.b, a0.d, a0.c);
                return;
            }
            case 8: {
                recyclerView0.mLayout.onItemsMoved(recyclerView0, a0.b, a0.d, 1);
            }
        }
    }

    @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
    public final ViewHolder findViewHolder(int v) {
        RecyclerView recyclerView0 = this.a;
        ViewHolder recyclerView$ViewHolder0 = recyclerView0.findViewHolderForPosition(v, true);
        if(recyclerView$ViewHolder0 == null) {
            return null;
        }
        if(recyclerView0.mChildHelper.c.contains(recyclerView$ViewHolder0.itemView)) {
            if(RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }
        return recyclerView$ViewHolder0;
    }

    @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
    public final void markViewHoldersUpdated(int v, int v1, Object object0) {
        this.a.viewRangeUpdate(v, v1, object0);
        this.a.mItemsChanged = true;
    }

    @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
    public final void offsetPositionsForAdd(int v, int v1) {
        this.a.offsetPositionRecordsForInsert(v, v1);
        this.a.mItemsAddedOrRemoved = true;
    }

    @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
    public final void offsetPositionsForMove(int v, int v1) {
        this.a.offsetPositionRecordsForMove(v, v1);
        this.a.mItemsAddedOrRemoved = true;
    }

    @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
    public final void offsetPositionsForRemovingInvisible(int v, int v1) {
        this.a.offsetPositionRecordsForRemove(v, v1, true);
        this.a.mItemsAddedOrRemoved = true;
        this.a.mState.d += v1;
    }

    @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
    public final void offsetPositionsForRemovingLaidOutOrNewView(int v, int v1) {
        this.a.offsetPositionRecordsForRemove(v, v1, false);
        this.a.mItemsAddedOrRemoved = true;
    }

    @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
    public final void onDispatchFirstPass(a a0) {
        this.a(a0);
    }

    @Override  // androidx.recyclerview.widget.AdapterHelper$Callback
    public final void onDispatchSecondPass(a a0) {
        this.a(a0);
    }
}

