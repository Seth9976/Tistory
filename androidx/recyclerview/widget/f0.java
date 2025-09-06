package androidx.recyclerview.widget;

import android.graphics.Rect;
import androidx.core.view.ViewCompat;

public final class f0 implements Runnable {
    public final ItemTouchHelper a;

    public f0(ItemTouchHelper itemTouchHelper0) {
        this.a = itemTouchHelper0;
    }

    @Override
    public final void run() {
        int v11;
        int v6;
        int v3;
        ItemTouchHelper itemTouchHelper0 = this.a;
        if(itemTouchHelper0.o != null) {
            long v = System.currentTimeMillis();
            long v1 = itemTouchHelper0.N == 0x8000000000000000L ? 0L : v - itemTouchHelper0.N;
            LayoutManager recyclerView$LayoutManager0 = itemTouchHelper0.D.getLayoutManager();
            if(itemTouchHelper0.M == null) {
                itemTouchHelper0.M = new Rect();
            }
            recyclerView$LayoutManager0.calculateItemDecorationsForChild(itemTouchHelper0.o.itemView, itemTouchHelper0.M);
            if(recyclerView$LayoutManager0.canScrollHorizontally()) {
                int v2 = (int)(itemTouchHelper0.v + itemTouchHelper0.t);
                v3 = v2 - itemTouchHelper0.M.left - itemTouchHelper0.D.getPaddingLeft();
                float f = itemTouchHelper0.t;
                if(f >= 0.0f || v3 >= 0) {
                    if(f > 0.0f) {
                        v3 = itemTouchHelper0.o.itemView.getWidth() + v2 + itemTouchHelper0.M.right - (itemTouchHelper0.D.getWidth() - itemTouchHelper0.D.getPaddingRight());
                        if(v3 <= 0) {
                            v3 = 0;
                        }
                    }
                    else {
                        v3 = 0;
                    }
                }
            }
            else {
                v3 = 0;
            }
            if(recyclerView$LayoutManager0.canScrollVertically()) {
                int v4 = (int)(itemTouchHelper0.w + itemTouchHelper0.u);
                int v5 = v4 - itemTouchHelper0.M.top - itemTouchHelper0.D.getPaddingTop();
                float f1 = itemTouchHelper0.u;
                if(f1 < 0.0f && v5 < 0) {
                    v6 = v5;
                }
                else if(f1 > 0.0f) {
                    v5 = itemTouchHelper0.o.itemView.getHeight() + v4 + itemTouchHelper0.M.bottom - (itemTouchHelper0.D.getHeight() - itemTouchHelper0.D.getPaddingBottom());
                    v6 = v5 > 0 ? v5 : 0;
                }
                else {
                    v6 = 0;
                }
            }
            else {
                v6 = 0;
            }
            if(v3 != 0) {
                RecyclerView recyclerView0 = itemTouchHelper0.D;
                int v7 = itemTouchHelper0.o.itemView.getWidth();
                int v8 = itemTouchHelper0.D.getWidth();
                v3 = itemTouchHelper0.y.interpolateOutOfBoundsScroll(recyclerView0, v7, v3, v8, v1);
            }
            if(v6 == 0) {
                v11 = v3;
            }
            else {
                RecyclerView recyclerView1 = itemTouchHelper0.D;
                int v9 = itemTouchHelper0.o.itemView.getHeight();
                int v10 = itemTouchHelper0.D.getHeight();
                v11 = v3;
                v6 = itemTouchHelper0.y.interpolateOutOfBoundsScroll(recyclerView1, v9, v6, v10, v1);
            }
            if(v11 == 0 && v6 == 0) {
                itemTouchHelper0.N = 0x8000000000000000L;
                return;
            }
            if(itemTouchHelper0.N == 0x8000000000000000L) {
                itemTouchHelper0.N = v;
            }
            itemTouchHelper0.D.scrollBy(v11, v6);
            ViewHolder recyclerView$ViewHolder0 = itemTouchHelper0.o;
            if(recyclerView$ViewHolder0 != null) {
                itemTouchHelper0.h(recyclerView$ViewHolder0);
            }
            itemTouchHelper0.D.removeCallbacks(itemTouchHelper0.E);
            ViewCompat.postOnAnimation(itemTouchHelper0.D, this);
        }
    }
}

