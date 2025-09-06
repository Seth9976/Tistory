package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.layout;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

public final class h extends q implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;
    public static final int B;
    public final Context b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Handler g;
    public final ArrayList h;
    public final ArrayList i;
    public final c j;
    public final d k;
    public final f l;
    public int m;
    public int n;
    public View o;
    public View p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public Callback x;
    public ViewTreeObserver y;
    public r z;

    static {
        h.B = layout.abc_cascading_menu_item_layout;
    }

    public h(Context context0, View view0, int v, int v1, boolean z) {
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new c(this, 0);
        this.k = new d(this, 0);
        this.l = new f(this, 0);
        int v2 = 0;
        this.m = 0;
        this.n = 0;
        this.b = context0;
        this.o = view0;
        this.d = v;
        this.e = v1;
        this.f = z;
        this.v = false;
        if(ViewCompat.getLayoutDirection(view0) != 1) {
            v2 = 1;
        }
        this.q = v2;
        Resources resources0 = context0.getResources();
        this.c = Math.max(resources0.getDisplayMetrics().widthPixels / 2, resources0.getDimensionPixelSize(dimen.abc_config_prefDialogWidth));
        this.g = new Handler();
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void a(MenuBuilder menuBuilder0) {
        menuBuilder0.addMenuPresenter(this, this.b);
        if(this.isShowing()) {
            this.j(menuBuilder0);
            return;
        }
        this.h.add(menuBuilder0);
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void c(View view0) {
        if(this.o != view0) {
            this.o = view0;
            this.n = GravityCompat.getAbsoluteGravity(this.m, ViewCompat.getLayoutDirection(view0));
        }
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void d(boolean z) {
        this.v = z;
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        ArrayList arrayList0 = this.i;
        int v = arrayList0.size();
        if(v > 0) {
            g[] arr_g = (g[])arrayList0.toArray(new g[v]);
            for(int v1 = v - 1; v1 >= 0; --v1) {
                g g0 = arr_g[v1];
                if(g0.a.isShowing()) {
                    g0.a.dismiss();
                }
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void e(int v) {
        if(this.m != v) {
            this.m = v;
            this.n = GravityCompat.getAbsoluteGravity(v, ViewCompat.getLayoutDirection(this.o));
        }
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void f(int v) {
        this.r = true;
        this.t = v;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void g(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.z = (r)popupWindow$OnDismissListener0;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView getListView() {
        return this.i.isEmpty() ? null : ((g)this.i.get(this.i.size() - 1)).a.getListView();
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void h(boolean z) {
        this.w = z;
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void i(int v) {
        this.s = true;
        this.u = v;
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean isShowing() {
        return this.i.size() > 0 && ((g)this.i.get(0)).a.isShowing();
    }

    public final void j(MenuBuilder menuBuilder0) {
        int v10;
        MenuAdapter menuAdapter1;
        int v5;
        View view0;
        g g0;
        boolean z;
        Context context0 = this.b;
        LayoutInflater layoutInflater0 = LayoutInflater.from(context0);
        MenuAdapter menuAdapter0 = new MenuAdapter(menuBuilder0, layoutInflater0, this.f, h.B);
        if(!this.isShowing() && this.v) {
            menuAdapter0.setForceShowIcon(true);
        }
        else if(this.isShowing()) {
            int v = menuBuilder0.size();
            for(int v1 = 0; true; ++v1) {
                z = false;
                if(v1 >= v) {
                    break;
                }
                MenuItem menuItem0 = menuBuilder0.getItem(v1);
                if(menuItem0.isVisible() && menuItem0.getIcon() != null) {
                    z = true;
                    break;
                }
            }
            menuAdapter0.setForceShowIcon(z);
        }
        int v2 = q.b(menuAdapter0, context0, this.c);
        MenuPopupWindow menuPopupWindow0 = new MenuPopupWindow(context0, null, this.d, this.e);
        menuPopupWindow0.setHoverListener(this.l);
        menuPopupWindow0.setOnItemClickListener(this);
        menuPopupWindow0.setOnDismissListener(this);
        menuPopupWindow0.setAnchorView(this.o);
        menuPopupWindow0.setDropDownGravity(this.n);
        menuPopupWindow0.setModal(true);
        menuPopupWindow0.setInputMethodMode(2);
        menuPopupWindow0.setAdapter(menuAdapter0);
        menuPopupWindow0.setContentWidth(v2);
        menuPopupWindow0.setDropDownGravity(this.n);
        ArrayList arrayList0 = this.i;
        if(arrayList0.size() > 0) {
            g0 = (g)arrayList0.get(arrayList0.size() - 1);
            MenuBuilder menuBuilder1 = g0.b;
            int v3 = menuBuilder1.size();
            for(int v4 = 0; true; ++v4) {
                MenuItem menuItem1 = null;
                if(v4 >= v3) {
                    break;
                }
                MenuItem menuItem2 = menuBuilder1.getItem(v4);
                if(menuItem2.hasSubMenu() && menuBuilder0 == menuItem2.getSubMenu()) {
                    menuItem1 = menuItem2;
                    break;
                }
            }
            if(menuItem1 == null) {
                view0 = null;
            }
            else {
                ListView listView0 = g0.a.getListView();
                ListAdapter listAdapter0 = listView0.getAdapter();
                if(listAdapter0 instanceof HeaderViewListAdapter) {
                    v5 = ((HeaderViewListAdapter)listAdapter0).getHeadersCount();
                    menuAdapter1 = (MenuAdapter)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter();
                }
                else {
                    menuAdapter1 = (MenuAdapter)listAdapter0;
                    v5 = 0;
                }
                int v6 = menuAdapter1.getCount();
                int v7;
                for(v7 = 0; true; ++v7) {
                    if(v7 >= v6) {
                        v7 = -1;
                        break;
                    }
                    if(menuItem1 == menuAdapter1.getItem(v7)) {
                        break;
                    }
                }
                if(v7 == -1) {
                    view0 = null;
                }
                else {
                    int v8 = v7 + v5 - listView0.getFirstVisiblePosition();
                    view0 = v8 < 0 || v8 >= listView0.getChildCount() ? null : listView0.getChildAt(v8);
                }
            }
        }
        else {
            view0 = null;
            g0 = null;
        }
        if(view0 == null) {
            if(this.r) {
                menuPopupWindow0.setHorizontalOffset(this.t);
            }
            if(this.s) {
                menuPopupWindow0.setVerticalOffset(this.u);
            }
            menuPopupWindow0.setEpicenterBounds(this.a);
        }
        else {
            menuPopupWindow0.setTouchModal(false);
            menuPopupWindow0.setEnterTransition(null);
            ListView listView1 = ((g)arrayList0.get(arrayList0.size() - 1)).a.getListView();
            int[] arr_v = new int[2];
            listView1.getLocationOnScreen(arr_v);
            Rect rect0 = new Rect();
            this.p.getWindowVisibleDisplayFrame(rect0);
            if(this.q == 1) {
                int v9 = arr_v[0];
                v10 = listView1.getWidth() + v9 + v2 <= rect0.right ? 1 : 0;
            }
            else {
                v10 = arr_v[0] - v2 >= 0 ? 0 : 1;
            }
            this.q = v10;
            menuPopupWindow0.setAnchorView(view0);
            if((this.n & 5) != 5) {
                v2 = v10 == 1 ? -v2 : view0.getWidth();
            }
            else if(v10 != 1) {
                v2 = -view0.getWidth();
            }
            menuPopupWindow0.setHorizontalOffset(v2);
            menuPopupWindow0.setOverlapAnchor(true);
            menuPopupWindow0.setVerticalOffset(0);
        }
        arrayList0.add(new g(menuPopupWindow0, menuBuilder0, this.q));
        menuPopupWindow0.show();
        ListView listView2 = menuPopupWindow0.getListView();
        listView2.setOnKeyListener(this);
        if(g0 == null && this.w && menuBuilder0.getHeaderTitle() != null) {
            FrameLayout frameLayout0 = (FrameLayout)layoutInflater0.inflate(layout.abc_popup_menu_header_item_layout, listView2, false);
            TextView textView0 = (TextView)frameLayout0.findViewById(0x1020016);
            frameLayout0.setEnabled(false);
            textView0.setText(menuBuilder0.getHeaderTitle());
            listView2.addHeaderView(frameLayout0, null, false);
            menuPopupWindow0.show();
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder0, boolean z) {
        ArrayList arrayList0 = this.i;
        int v = arrayList0.size();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v) {
                v1 = -1;
                break;
            }
            if(menuBuilder0 == ((g)arrayList0.get(v1)).b) {
                break;
            }
        }
        if(v1 < 0) {
            return;
        }
        if(v1 + 1 < arrayList0.size()) {
            ((g)arrayList0.get(v1 + 1)).b.close(false);
        }
        g g0 = (g)arrayList0.remove(v1);
        g0.b.removeMenuPresenter(this);
        MenuPopupWindow menuPopupWindow0 = g0.a;
        if(this.A) {
            menuPopupWindow0.setExitTransition(null);
            menuPopupWindow0.setAnimationStyle(0);
        }
        menuPopupWindow0.dismiss();
        int v2 = arrayList0.size();
        if(v2 > 0) {
            this.q = ((g)arrayList0.get(v2 - 1)).c;
        }
        else {
            this.q = ViewCompat.getLayoutDirection(this.o) == 1 ? 0 : 1;
        }
        if(v2 == 0) {
            this.dismiss();
            Callback menuPresenter$Callback0 = this.x;
            if(menuPresenter$Callback0 != null) {
                menuPresenter$Callback0.onCloseMenu(menuBuilder0, true);
            }
            ViewTreeObserver viewTreeObserver0 = this.y;
            if(viewTreeObserver0 != null) {
                if(viewTreeObserver0.isAlive()) {
                    this.y.removeGlobalOnLayoutListener(this.j);
                }
                this.y = null;
            }
            this.p.removeOnAttachStateChangeListener(this.k);
            this.z.onDismiss();
            return;
        }
        if(z) {
            ((g)arrayList0.get(0)).b.close(false);
        }
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        g g0;
        ArrayList arrayList0 = this.i;
        int v = arrayList0.size();
        for(int v1 = 0; true; ++v1) {
            g0 = null;
            if(v1 >= v) {
                break;
            }
            g g1 = (g)arrayList0.get(v1);
            if(!g1.a.isShowing()) {
                g0 = g1;
                break;
            }
        }
        if(g0 != null) {
            g0.b.close(false);
        }
    }

    @Override  // android.view.View$OnKeyListener
    public final boolean onKey(View view0, int v, KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 1 && v == 82) {
            this.dismiss();
            return true;
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable0) {
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder0) {
        for(Object object0: this.i) {
            g g0 = (g)object0;
            if(subMenuBuilder0 == g0.b) {
                g0.a.getListView().requestFocus();
                return true;
            }
            if(false) {
                break;
            }
        }
        if(subMenuBuilder0.hasVisibleItems()) {
            this.a(subMenuBuilder0);
            Callback menuPresenter$Callback0 = this.x;
            if(menuPresenter$Callback0 != null) {
                menuPresenter$Callback0.onOpenSubMenu(subMenuBuilder0);
            }
            return true;
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(Callback menuPresenter$Callback0) {
        this.x = menuPresenter$Callback0;
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        if(this.isShowing()) {
            return;
        }
        ArrayList arrayList0 = this.h;
        for(Object object0: arrayList0) {
            this.j(((MenuBuilder)object0));
        }
        arrayList0.clear();
        View view0 = this.o;
        this.p = view0;
        if(view0 != null) {
            boolean z = this.y == null;
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            this.y = viewTreeObserver0;
            if(z) {
                viewTreeObserver0.addOnGlobalLayoutListener(this.j);
            }
            this.p.addOnAttachStateChangeListener(this.k);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z) {
        for(Object object0: this.i) {
            ListAdapter listAdapter0 = ((g)object0).a.getListView().getAdapter();
            (listAdapter0 instanceof HeaderViewListAdapter ? ((MenuAdapter)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter()) : ((MenuAdapter)listAdapter0)).notifyDataSetChanged();
        }
    }
}

