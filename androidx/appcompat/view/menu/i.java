package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class i extends BaseAdapter {
    public int a;
    public final ListMenuPresenter b;

    public i(ListMenuPresenter listMenuPresenter0) {
        this.b = listMenuPresenter0;
        super();
        this.a = -1;
        this.a();
    }

    public final void a() {
        ListMenuPresenter listMenuPresenter0 = this.b;
        MenuItemImpl menuItemImpl0 = listMenuPresenter0.c.getExpandedItem();
        if(menuItemImpl0 != null) {
            ArrayList arrayList0 = listMenuPresenter0.c.getNonActionItems();
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                if(((MenuItemImpl)arrayList0.get(v1)) == menuItemImpl0) {
                    this.a = v1;
                    return;
                }
            }
        }
        this.a = -1;
    }

    public final MenuItemImpl b(int v) {
        ArrayList arrayList0 = this.b.c.getNonActionItems();
        int v1 = v + this.b.e;
        return (MenuItemImpl)arrayList0.get((this.a < 0 || v1 < this.a ? v + this.b.e : v1 + 1));
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        int v = this.b.c.getNonActionItems().size() - this.b.e;
        return this.a >= 0 ? v - 1 : v;
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.b(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            view0 = this.b.b.inflate(this.b.g, viewGroup0, false);
        }
        ((ItemView)view0).initialize(this.b(v), 0);
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}

