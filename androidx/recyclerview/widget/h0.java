package androidx.recyclerview.widget;

import android.animation.Animator;
import android.view.View;

public final class h0 extends n0 {
    public final int n;
    public final ViewHolder o;
    public final ItemTouchHelper p;

    public h0(ItemTouchHelper itemTouchHelper0, ViewHolder recyclerView$ViewHolder0, int v, int v1, float f, float f1, float f2, float f3, int v2, ViewHolder recyclerView$ViewHolder1) {
        this.p = itemTouchHelper0;
        this.n = v2;
        this.o = recyclerView$ViewHolder1;
        super(recyclerView$ViewHolder0, v1, f, f1, f2, f3);
    }

    @Override  // androidx.recyclerview.widget.n0
    public final void onAnimationEnd(Animator animator0) {
        super.onAnimationEnd(animator0);
        if(this.k) {
            return;
        }
        int v = this.n;
        ViewHolder recyclerView$ViewHolder0 = this.o;
        ItemTouchHelper itemTouchHelper0 = this.p;
        if(v <= 0) {
            itemTouchHelper0.y.clearView(itemTouchHelper0.D, recyclerView$ViewHolder0);
        }
        else {
            itemTouchHelper0.m.add(recyclerView$ViewHolder0.itemView);
            this.h = true;
            itemTouchHelper0.D.post(new i0(itemTouchHelper0, this, v));
        }
        View view0 = recyclerView$ViewHolder0.itemView;
        if(itemTouchHelper0.I == view0) {
            itemTouchHelper0.i(view0);
        }
    }
}

