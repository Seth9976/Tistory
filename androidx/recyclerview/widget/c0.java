package androidx.recyclerview.widget;

import java.util.Arrays;

public final class c0 implements LayoutPrefetchRegistry {
    public int a;
    public int b;
    public int[] c;
    public int d;

    public final void a(RecyclerView recyclerView0, boolean z) {
        this.d = 0;
        int[] arr_v = this.c;
        if(arr_v != null) {
            Arrays.fill(arr_v, -1);
        }
        LayoutManager recyclerView$LayoutManager0 = recyclerView0.mLayout;
        if(recyclerView0.mAdapter != null && recyclerView$LayoutManager0 != null && recyclerView$LayoutManager0.isItemPrefetchEnabled()) {
            if(!z) {
                if(!recyclerView0.hasPendingAdapterUpdates()) {
                    recyclerView$LayoutManager0.collectAdjacentPrefetchPositions(this.a, this.b, recyclerView0.mState, this);
                }
            }
            else if(!recyclerView0.mAdapterHelper.g()) {
                recyclerView$LayoutManager0.collectInitialPrefetchPositions(recyclerView0.mAdapter.getItemCount(), this);
            }
            int v = this.d;
            if(v > recyclerView$LayoutManager0.mPrefetchMaxCountObserved) {
                recyclerView$LayoutManager0.mPrefetchMaxCountObserved = v;
                recyclerView$LayoutManager0.mPrefetchMaxObservedInInitialPrefetch = z;
                recyclerView0.mRecycler.m();
            }
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$LayoutManager$LayoutPrefetchRegistry
    public final void addPosition(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int v2 = this.d;
        int[] arr_v = this.c;
        if(arr_v == null) {
            int[] arr_v1 = new int[4];
            this.c = arr_v1;
            Arrays.fill(arr_v1, -1);
        }
        else if(v2 * 2 >= arr_v.length) {
            int[] arr_v2 = new int[v2 * 4];
            this.c = arr_v2;
            System.arraycopy(arr_v, 0, arr_v2, 0, arr_v.length);
        }
        int[] arr_v3 = this.c;
        arr_v3[v2 * 2] = v;
        arr_v3[v2 * 2 + 1] = v1;
        ++this.d;
    }
}

