package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

public final class r0 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view0) {
        int v = this.k.size();
        View view1 = null;
        int v1 = 0x7FFFFFFF;
        for(int v2 = 0; v2 < v; ++v2) {
            View view2 = ((ViewHolder)this.k.get(v2)).itemView;
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view2.getLayoutParams();
            if(view2 != view0 && !recyclerView$LayoutParams0.isItemRemoved()) {
                int v3 = (recyclerView$LayoutParams0.getViewLayoutPosition() - this.d) * this.e;
                if(v3 >= 0 && v3 < v1) {
                    view1 = view2;
                    if(v3 == 0) {
                        break;
                    }
                    v1 = v3;
                }
            }
        }
        if(view1 == null) {
            this.d = -1;
            return;
        }
        this.d = ((LayoutParams)view1.getLayoutParams()).getViewLayoutPosition();
    }

    public final View b(Recycler recyclerView$Recycler0) {
        List list0 = this.k;
        if(list0 != null) {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = ((ViewHolder)this.k.get(v1)).itemView;
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                if(!recyclerView$LayoutParams0.isItemRemoved() && this.d == recyclerView$LayoutParams0.getViewLayoutPosition()) {
                    this.a(view0);
                    return view0;
                }
            }
            return null;
        }
        View view1 = recyclerView$Recycler0.getViewForPosition(this.d);
        this.d += this.e;
        return view1;
    }
}

