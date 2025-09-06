package androidx.recyclerview.widget;

import java.util.ArrayList;

public final class i0 implements Runnable {
    public final h0 a;
    public final int b;
    public final ItemTouchHelper c;

    public i0(ItemTouchHelper itemTouchHelper0, h0 h00, int v) {
        this.c = itemTouchHelper0;
        this.a = h00;
        this.b = v;
    }

    @Override
    public final void run() {
        ItemTouchHelper itemTouchHelper0 = this.c;
        if(itemTouchHelper0.D != null && itemTouchHelper0.D.isAttachedToWindow()) {
            h0 h00 = this.a;
            if(!h00.k) {
                ViewHolder recyclerView$ViewHolder0 = h00.e;
                if(recyclerView$ViewHolder0.getAbsoluteAdapterPosition() != -1) {
                    ItemAnimator recyclerView$ItemAnimator0 = itemTouchHelper0.D.getItemAnimator();
                    if(recyclerView$ItemAnimator0 == null || !recyclerView$ItemAnimator0.isRunning(null)) {
                        ArrayList arrayList0 = itemTouchHelper0.B;
                        int v = arrayList0.size();
                        for(int v1 = 0; v1 < v; ++v1) {
                            if(!((n0)arrayList0.get(v1)).l) {
                                itemTouchHelper0.D.post(this);
                                return;
                            }
                        }
                        itemTouchHelper0.y.onSwiped(recyclerView$ViewHolder0, this.b);
                        return;
                    }
                    itemTouchHelper0.D.post(this);
                }
            }
        }
    }
}

