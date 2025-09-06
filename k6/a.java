package k6;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.futuremind.fastscroll.FastScroller;

public final class a implements ViewGroup.OnHierarchyChangeListener {
    public final int a;
    public final ViewGroup b;

    public a(ViewGroup viewGroup0, int v) {
        this.a = v;
        this.b = viewGroup0;
        super();
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public final void onChildViewAdded(View view0, View view1) {
        ViewGroup viewGroup0 = this.b;
        if(this.a != 0) {
            ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0 = ((CoordinatorLayout)viewGroup0).r;
            if(viewGroup$OnHierarchyChangeListener0 != null) {
                viewGroup$OnHierarchyChangeListener0.onChildViewAdded(view0, view1);
            }
            return;
        }
        ((FastScroller)viewGroup0).b();
    }

    @Override  // android.view.ViewGroup$OnHierarchyChangeListener
    public final void onChildViewRemoved(View view0, View view1) {
        ViewGroup viewGroup0 = this.b;
        if(this.a != 0) {
            ((CoordinatorLayout)viewGroup0).g(2);
            ViewGroup.OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener0 = ((CoordinatorLayout)viewGroup0).r;
            if(viewGroup$OnHierarchyChangeListener0 != null) {
                viewGroup$OnHierarchyChangeListener0.onChildViewRemoved(view0, view1);
            }
            return;
        }
        ((FastScroller)viewGroup0).b();
    }
}

