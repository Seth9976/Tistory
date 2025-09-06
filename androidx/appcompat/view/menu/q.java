package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

public abstract class q implements AdapterView.OnItemClickListener, MenuPresenter, ShowableListMenu {
    public Rect a;

    public abstract void a(MenuBuilder arg1);

    public static int b(ListAdapter listAdapter0, Context context0, int v) {
        int v2 = listAdapter0.getCount();
        int v3 = 0;
        int v4 = 0;
        FrameLayout frameLayout0 = null;
        View view0 = null;
        for(int v1 = 0; v1 < v2; ++v1) {
            int v5 = listAdapter0.getItemViewType(v1);
            if(v5 != v4) {
                view0 = null;
                v4 = v5;
            }
            if(frameLayout0 == null) {
                frameLayout0 = new FrameLayout(context0);
            }
            view0 = listAdapter0.getView(v1, view0, frameLayout0);
            view0.measure(0, 0);
            int v6 = view0.getMeasuredWidth();
            if(v6 >= v) {
                return v;
            }
            if(v6 > v3) {
                v3 = v6;
            }
        }
        return v3;
    }

    public abstract void c(View arg1);

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final boolean collapseItemActionView(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        return false;
    }

    public abstract void d(boolean arg1);

    public abstract void e(int arg1);

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final boolean expandItemActionView(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        return false;
    }

    public abstract void f(int arg1);

    public abstract void g(PopupWindow.OnDismissListener arg1);

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return 0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final MenuView getMenuView(ViewGroup viewGroup0) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    public abstract void h(boolean arg1);

    public abstract void i(int arg1);

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(Context context0, MenuBuilder menuBuilder0) {
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        ListAdapter listAdapter0 = (ListAdapter)adapterView0.getAdapter();
        (listAdapter0 instanceof HeaderViewListAdapter ? ((MenuAdapter)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter()) : ((MenuAdapter)listAdapter0)).a.performItemAction(((MenuItem)listAdapter0.getItem(v)), this, (this instanceof h ? 4 : 0));
    }
}

