package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.layout;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.ViewCompat;

public final class t extends q implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context b;
    public final MenuBuilder c;
    public final MenuAdapter d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final MenuPopupWindow i;
    public final c j;
    public final d k;
    public r l;
    public View m;
    public View n;
    public Callback o;
    public ViewTreeObserver p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public boolean u;
    public static final int v;

    static {
        t.v = layout.abc_popup_menu_item_layout;
    }

    public t(Context context0, MenuBuilder menuBuilder0, View view0, boolean z, int v, int v1) {
        this.j = new c(this, 1);
        this.k = new d(this, 1);
        this.t = 0;
        this.b = context0;
        this.c = menuBuilder0;
        this.e = z;
        this.d = new MenuAdapter(menuBuilder0, LayoutInflater.from(context0), z, t.v);
        this.g = v;
        this.h = v1;
        Resources resources0 = context0.getResources();
        this.f = Math.max(resources0.getDisplayMetrics().widthPixels / 2, resources0.getDimensionPixelSize(dimen.abc_config_prefDialogWidth));
        this.m = view0;
        this.i = new MenuPopupWindow(context0, null, v, v1);
        menuBuilder0.addMenuPresenter(this, context0);
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void a(MenuBuilder menuBuilder0) {
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void c(View view0) {
        this.m = view0;
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void d(boolean z) {
        this.d.setForceShowIcon(z);
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        if(this.isShowing()) {
            this.i.dismiss();
        }
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void e(int v) {
        this.t = v;
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void f(int v) {
        this.i.setHorizontalOffset(v);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void g(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.l = (r)popupWindow$OnDismissListener0;
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView getListView() {
        return this.i.getListView();
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void h(boolean z) {
        this.u = z;
    }

    @Override  // androidx.appcompat.view.menu.q
    public final void i(int v) {
        this.i.setVerticalOffset(v);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean isShowing() {
        return !this.q && this.i.isShowing();
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder0, boolean z) {
        if(menuBuilder0 != this.c) {
            return;
        }
        this.dismiss();
        Callback menuPresenter$Callback0 = this.o;
        if(menuPresenter$Callback0 != null) {
            menuPresenter$Callback0.onCloseMenu(menuBuilder0, z);
        }
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        this.q = true;
        this.c.close();
        ViewTreeObserver viewTreeObserver0 = this.p;
        if(viewTreeObserver0 != null) {
            if(!viewTreeObserver0.isAlive()) {
                this.p = this.n.getViewTreeObserver();
            }
            this.p.removeGlobalOnLayoutListener(this.j);
            this.p = null;
        }
        this.n.removeOnAttachStateChangeListener(this.k);
        r r0 = this.l;
        if(r0 != null) {
            r0.onDismiss();
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
        boolean z;
        if(subMenuBuilder0.hasVisibleItems()) {
            MenuPopupHelper menuPopupHelper0 = new MenuPopupHelper(this.b, subMenuBuilder0, this.n, this.e, this.g, this.h);
            menuPopupHelper0.setPresenterCallback(this.o);
            int v = subMenuBuilder0.size();
            for(int v1 = 0; true; ++v1) {
                z = false;
                if(v1 >= v) {
                    break;
                }
                MenuItem menuItem0 = subMenuBuilder0.getItem(v1);
                if(menuItem0.isVisible() && menuItem0.getIcon() != null) {
                    z = true;
                    break;
                }
            }
            menuPopupHelper0.setForceShowIcon(z);
            menuPopupHelper0.setOnDismissListener(this.l);
            this.l = null;
            this.c.close(false);
            int v2 = this.i.getHorizontalOffset();
            int v3 = this.i.getVerticalOffset();
            if((Gravity.getAbsoluteGravity(this.t, ViewCompat.getLayoutDirection(this.m)) & 7) == 5) {
                v2 += this.m.getWidth();
            }
            if(menuPopupHelper0.tryShow(v2, v3)) {
                Callback menuPresenter$Callback0 = this.o;
                if(menuPresenter$Callback0 != null) {
                    menuPresenter$Callback0.onOpenSubMenu(subMenuBuilder0);
                }
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(Callback menuPresenter$Callback0) {
        this.o = menuPresenter$Callback0;
    }

    @Override  // androidx.appcompat.view.menu.ShowableListMenu
    public final void show() {
        if(!this.isShowing()) {
            if(!this.q) {
                View view0 = this.m;
                if(view0 != null) {
                    this.n = view0;
                    MenuPopupWindow menuPopupWindow0 = this.i;
                    menuPopupWindow0.setOnDismissListener(this);
                    menuPopupWindow0.setOnItemClickListener(this);
                    menuPopupWindow0.setModal(true);
                    View view1 = this.n;
                    boolean z = this.p == null;
                    ViewTreeObserver viewTreeObserver0 = view1.getViewTreeObserver();
                    this.p = viewTreeObserver0;
                    if(z) {
                        viewTreeObserver0.addOnGlobalLayoutListener(this.j);
                    }
                    view1.addOnAttachStateChangeListener(this.k);
                    menuPopupWindow0.setAnchorView(view1);
                    menuPopupWindow0.setDropDownGravity(this.t);
                    Context context0 = this.b;
                    MenuAdapter menuAdapter0 = this.d;
                    if(!this.r) {
                        this.s = q.b(menuAdapter0, context0, this.f);
                        this.r = true;
                    }
                    menuPopupWindow0.setContentWidth(this.s);
                    menuPopupWindow0.setInputMethodMode(2);
                    menuPopupWindow0.setEpicenterBounds(this.a);
                    menuPopupWindow0.show();
                    ListView listView0 = menuPopupWindow0.getListView();
                    listView0.setOnKeyListener(this);
                    if(this.u) {
                        MenuBuilder menuBuilder0 = this.c;
                        if(menuBuilder0.getHeaderTitle() != null) {
                            FrameLayout frameLayout0 = (FrameLayout)LayoutInflater.from(context0).inflate(layout.abc_popup_menu_header_item_layout, listView0, false);
                            TextView textView0 = (TextView)frameLayout0.findViewById(0x1020016);
                            if(textView0 != null) {
                                textView0.setText(menuBuilder0.getHeaderTitle());
                            }
                            frameLayout0.setEnabled(false);
                            listView0.addHeaderView(frameLayout0, null, false);
                        }
                    }
                    menuPopupWindow0.setAdapter(menuAdapter0);
                    menuPopupWindow0.show();
                    return;
                }
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z) {
        this.r = false;
        MenuAdapter menuAdapter0 = this.d;
        if(menuAdapter0 != null) {
            menuAdapter0.notifyDataSetChanged();
        }
    }
}

