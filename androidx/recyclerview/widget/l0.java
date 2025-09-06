package androidx.recyclerview.widget;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

public final class l0 extends GestureDetector.SimpleOnGestureListener {
    public boolean a;
    public final ItemTouchHelper b;

    public l0(ItemTouchHelper itemTouchHelper0) {
        this.b = itemTouchHelper0;
        super();
        this.a = true;
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public final boolean onDown(MotionEvent motionEvent0) {
        return true;
    }

    @Override  // android.view.GestureDetector$SimpleOnGestureListener
    public final void onLongPress(MotionEvent motionEvent0) {
        if(!this.a) {
            return;
        }
        ItemTouchHelper itemTouchHelper0 = this.b;
        View view0 = itemTouchHelper0.e(motionEvent0);
        if(view0 != null) {
            ViewHolder recyclerView$ViewHolder0 = itemTouchHelper0.D.getChildViewHolder(view0);
            if(recyclerView$ViewHolder0 == null || !itemTouchHelper0.y.hasDragFlag(itemTouchHelper0.D, recyclerView$ViewHolder0)) {
                return;
            }
            int v = motionEvent0.getPointerId(0);
            int v1 = itemTouchHelper0.x;
            if(v == v1) {
                int v2 = motionEvent0.findPointerIndex(v1);
                float f = motionEvent0.getX(v2);
                float f1 = motionEvent0.getY(v2);
                itemTouchHelper0.p = f;
                itemTouchHelper0.q = f1;
                itemTouchHelper0.u = 0.0f;
                itemTouchHelper0.t = 0.0f;
                if(itemTouchHelper0.y.isLongPressDragEnabled()) {
                    itemTouchHelper0.j(recyclerView$ViewHolder0, 2);
                }
            }
        }
    }
}

