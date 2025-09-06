package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class MenuAdapter extends BaseAdapter {
    public final MenuBuilder a;
    public int b;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public MenuAdapter(MenuBuilder menuBuilder0, LayoutInflater layoutInflater0, boolean z, int v) {
        this.b = -1;
        this.d = z;
        this.e = layoutInflater0;
        this.a = menuBuilder0;
        this.f = v;
        this.a();
    }

    public final void a() {
        MenuBuilder menuBuilder0 = this.a;
        MenuItemImpl menuItemImpl0 = menuBuilder0.getExpandedItem();
        if(menuItemImpl0 != null) {
            ArrayList arrayList0 = menuBuilder0.getNonActionItems();
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                if(((MenuItemImpl)arrayList0.get(v1)) == menuItemImpl0) {
                    this.b = v1;
                    return;
                }
            }
        }
        this.b = -1;
    }

    public MenuBuilder getAdapterMenu() {
        return this.a;
    }

    @Override  // android.widget.Adapter
    public int getCount() {
        ArrayList arrayList0 = this.d ? this.a.getNonActionItems() : this.a.getVisibleItems();
        return this.b >= 0 ? arrayList0.size() - 1 : arrayList0.size();
    }

    public boolean getForceShowIcon() {
        return this.c;
    }

    public MenuItemImpl getItem(int v) {
        ArrayList arrayList0 = this.d ? this.a.getNonActionItems() : this.a.getVisibleItems();
        if(this.b >= 0 && v >= this.b) {
            ++v;
        }
        return (MenuItemImpl)arrayList0.get(v);
    }

    @Override  // android.widget.Adapter
    public Object getItem(int v) {
        return this.getItem(v);
    }

    @Override  // android.widget.Adapter
    public long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public View getView(int v, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            view0 = this.e.inflate(this.f, viewGroup0, false);
        }
        int v1 = this.getItem(v).getGroupId();
        int v2 = v - 1 < 0 ? v1 : this.getItem(v - 1).getGroupId();
        ((ListMenuItemView)view0).setGroupDividerEnabled(this.a.isGroupDividerEnabled() && v1 != v2);
        if(this.c) {
            ((ListMenuItemView)view0).setForceShowIcon(true);
        }
        ((ItemView)view0).initialize(this.getItem(v), 0);
        return view0;
    }

    @Override  // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }

    public void setForceShowIcon(boolean z) {
        this.c = z;
    }
}

