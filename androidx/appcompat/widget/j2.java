package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.app.ActionBar.Tab;

public final class j2 extends BaseAdapter {
    public final ScrollingTabContainerView a;

    public j2(ScrollingTabContainerView scrollingTabContainerView0) {
        this.a = scrollingTabContainerView0;
        super();
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.a.c.getChildCount();
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return ((l2)this.a.c.getChildAt(v)).a;
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            Tab actionBar$Tab0 = (Tab)this.getItem(v);
            return this.a.a(actionBar$Tab0, true);
        }
        ((l2)view0).a = (Tab)this.getItem(v);
        ((l2)view0).a();
        return view0;
    }
}

