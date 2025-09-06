package androidx.recyclerview.widget;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

public final class g0 implements OnItemTouchListener {
    public final ItemTouchHelper a;

    public g0(ItemTouchHelper itemTouchHelper0) {
        this.a = itemTouchHelper0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView0, MotionEvent motionEvent0) {
        ItemTouchHelper itemTouchHelper0 = this.a;
        itemTouchHelper0.J.onTouchEvent(motionEvent0);
        int v = motionEvent0.getActionMasked();
        n0 n00 = null;
        if(v == 0) {
            itemTouchHelper0.x = motionEvent0.getPointerId(0);
            itemTouchHelper0.p = motionEvent0.getX();
            itemTouchHelper0.q = motionEvent0.getY();
            VelocityTracker velocityTracker0 = itemTouchHelper0.F;
            if(velocityTracker0 != null) {
                velocityTracker0.recycle();
            }
            itemTouchHelper0.F = VelocityTracker.obtain();
            if(itemTouchHelper0.o == null) {
                ArrayList arrayList0 = itemTouchHelper0.B;
                if(!arrayList0.isEmpty()) {
                    View view0 = itemTouchHelper0.e(motionEvent0);
                    for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                        n0 n01 = (n0)arrayList0.get(v1);
                        if(n01.e.itemView == view0) {
                            n00 = n01;
                            break;
                        }
                    }
                }
                if(n00 != null) {
                    itemTouchHelper0.p -= n00.i;
                    itemTouchHelper0.q -= n00.j;
                    ViewHolder recyclerView$ViewHolder0 = n00.e;
                    itemTouchHelper0.d(recyclerView$ViewHolder0, true);
                    if(itemTouchHelper0.m.remove(recyclerView$ViewHolder0.itemView)) {
                        itemTouchHelper0.y.clearView(itemTouchHelper0.D, recyclerView$ViewHolder0);
                    }
                    itemTouchHelper0.j(recyclerView$ViewHolder0, n00.f);
                    itemTouchHelper0.k(motionEvent0, itemTouchHelper0.A, 0);
                }
            }
        }
        else if(v == 1 || v == 3) {
            itemTouchHelper0.x = -1;
            itemTouchHelper0.j(null, 0);
        }
        else {
            int v2 = itemTouchHelper0.x;
            if(v2 != -1) {
                int v3 = motionEvent0.findPointerIndex(v2);
                if(v3 >= 0) {
                    itemTouchHelper0.b(motionEvent0, v, v3);
                }
            }
        }
        VelocityTracker velocityTracker1 = itemTouchHelper0.F;
        if(velocityTracker1 != null) {
            velocityTracker1.addMovement(motionEvent0);
        }
        return itemTouchHelper0.o != null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public final void onRequestDisallowInterceptTouchEvent(boolean z) {
        if(!z) {
            return;
        }
        this.a.j(null, 0);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$OnItemTouchListener
    public final void onTouchEvent(RecyclerView recyclerView0, MotionEvent motionEvent0) {
        ItemTouchHelper itemTouchHelper0 = this.a;
        itemTouchHelper0.J.onTouchEvent(motionEvent0);
        VelocityTracker velocityTracker0 = itemTouchHelper0.F;
        if(velocityTracker0 != null) {
            velocityTracker0.addMovement(motionEvent0);
        }
        if(itemTouchHelper0.x == -1) {
            return;
        }
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.findPointerIndex(itemTouchHelper0.x);
        if(v1 >= 0) {
            itemTouchHelper0.b(motionEvent0, v, v1);
        }
        int v2 = 0;
        ViewHolder recyclerView$ViewHolder0 = itemTouchHelper0.o;
        if(recyclerView$ViewHolder0 == null) {
            return;
        }
        switch(v) {
            case 1: {
                itemTouchHelper0.j(null, 0);
                itemTouchHelper0.x = -1;
                return;
            }
            case 2: {
                if(v1 >= 0) {
                    itemTouchHelper0.k(motionEvent0, itemTouchHelper0.A, v1);
                    itemTouchHelper0.h(recyclerView$ViewHolder0);
                    itemTouchHelper0.D.removeCallbacks(itemTouchHelper0.E);
                    itemTouchHelper0.E.run();
                    itemTouchHelper0.D.invalidate();
                    return;
                }
                break;
            }
            case 3: {
                VelocityTracker velocityTracker1 = itemTouchHelper0.F;
                if(velocityTracker1 != null) {
                    velocityTracker1.clear();
                }
                itemTouchHelper0.j(null, 0);
                itemTouchHelper0.x = -1;
                return;
            }
            case 6: {
                int v3 = motionEvent0.getActionIndex();
                if(motionEvent0.getPointerId(v3) == itemTouchHelper0.x) {
                    if(v3 == 0) {
                        v2 = 1;
                    }
                    itemTouchHelper0.x = motionEvent0.getPointerId(v2);
                    itemTouchHelper0.k(motionEvent0, itemTouchHelper0.A, v3);
                    return;
                }
                break;
            }
        }
    }
}

