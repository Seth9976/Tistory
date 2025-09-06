package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.R.layout;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView.ItemView;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.ActionProvider.SubUiVisibilityListener;
import androidx.core.view.ActionProvider;
import java.util.ArrayList;

public final class o extends BaseMenuPresenter implements SubUiVisibilityListener {
    public j e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public final SparseBooleanArray n;
    public k o;
    public f p;
    public h q;
    public g r;
    public final l s;
    public int t;

    public o(Context context0) {
        super(context0, layout.abc_action_menu_layout, layout.abc_action_menu_item_layout);
        this.n = new SparseBooleanArray();
        this.s = new l(this);
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public final void bindItemView(MenuItemImpl menuItemImpl0, ItemView menuView$ItemView0) {
        menuView$ItemView0.initialize(menuItemImpl0, 0);
        ((ActionMenuItemView)menuView$ItemView0).setItemInvoker(((ActionMenuView)this.mMenuView));
        if(this.r == null) {
            this.r = new g(this);
        }
        ((ActionMenuItemView)menuView$ItemView0).setPopupCallback(this.r);
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public final boolean filterLeftoverView(ViewGroup viewGroup0, int v) {
        return viewGroup0.getChildAt(v) == this.e ? false : super.filterLeftoverView(viewGroup0, v);
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public final boolean flagActionItems() {
        int v;
        ArrayList arrayList0;
        MenuBuilder menuBuilder0 = this.mMenu;
        if(menuBuilder0 == null) {
            arrayList0 = null;
            v = 0;
        }
        else {
            arrayList0 = menuBuilder0.getVisibleItems();
            v = arrayList0.size();
        }
        int v1 = this.l;
        int v2 = this.k;
        ViewGroup viewGroup0 = (ViewGroup)this.mMenuView;
        boolean z = false;
        int v4 = 0;
        int v5 = 0;
        for(int v3 = 0; v3 < v; ++v3) {
            MenuItemImpl menuItemImpl0 = (MenuItemImpl)arrayList0.get(v3);
            if(menuItemImpl0.requiresActionButton()) {
                ++v4;
            }
            else if(menuItemImpl0.requestsActionButton()) {
                ++v5;
            }
            else {
                z = true;
            }
            if(this.m && menuItemImpl0.isActionViewExpanded()) {
                v1 = 0;
            }
        }
        if(this.h && (z || v5 + v4 > v1)) {
            --v1;
        }
        int v6 = v1 - v4;
        SparseBooleanArray sparseBooleanArray0 = this.n;
        sparseBooleanArray0.clear();
        int v8 = 0;
        for(int v7 = 0; v7 < v; ++v7) {
            MenuItemImpl menuItemImpl1 = (MenuItemImpl)arrayList0.get(v7);
            if(menuItemImpl1.requiresActionButton()) {
                View view0 = this.getItemView(menuItemImpl1, null, viewGroup0);
                view0.measure(0, 0);
                int v9 = view0.getMeasuredWidth();
                v2 -= v9;
                if(v8 == 0) {
                    v8 = v9;
                }
                int v10 = menuItemImpl1.getGroupId();
                if(v10 != 0) {
                    sparseBooleanArray0.put(v10, true);
                }
                menuItemImpl1.setIsActionButton(true);
            }
            else if(menuItemImpl1.requestsActionButton()) {
                int v11 = menuItemImpl1.getGroupId();
                boolean z1 = sparseBooleanArray0.get(v11);
                boolean z2 = (v6 > 0 || z1) && v2 > 0;
                if(z2) {
                    View view1 = this.getItemView(menuItemImpl1, null, viewGroup0);
                    view1.measure(0, 0);
                    int v12 = view1.getMeasuredWidth();
                    v2 -= v12;
                    if(v8 == 0) {
                        v8 = v12;
                    }
                    z2 = true & v2 + v8 > 0;
                }
                if(z2 && v11 != 0) {
                    sparseBooleanArray0.put(v11, true);
                }
                else if(z1) {
                    sparseBooleanArray0.put(v11, false);
                    for(int v13 = 0; v13 < v7; ++v13) {
                        MenuItemImpl menuItemImpl2 = (MenuItemImpl)arrayList0.get(v13);
                        if(menuItemImpl2.getGroupId() == v11) {
                            if(menuItemImpl2.isActionButton()) {
                                ++v6;
                            }
                            menuItemImpl2.setIsActionButton(false);
                        }
                    }
                }
                if(z2) {
                    --v6;
                }
                menuItemImpl1.setIsActionButton(z2);
            }
            else {
                menuItemImpl1.setIsActionButton(false);
            }
        }
        return true;
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public final View getItemView(MenuItemImpl menuItemImpl0, View view0, ViewGroup viewGroup0) {
        View view1 = menuItemImpl0.getActionView();
        if(view1 == null || menuItemImpl0.hasCollapsibleActionView()) {
            view1 = super.getItemView(menuItemImpl0, view0, viewGroup0);
        }
        view1.setVisibility((menuItemImpl0.isActionViewExpanded() ? 8 : 0));
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
        if(!((ActionMenuView)viewGroup0).checkLayoutParams(viewGroup$LayoutParams0)) {
            view1.setLayoutParams(((ActionMenuView)viewGroup0).generateLayoutParams(viewGroup$LayoutParams0));
        }
        return view1;
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public final MenuView getMenuView(ViewGroup viewGroup0) {
        MenuView menuView0 = this.mMenuView;
        MenuView menuView1 = super.getMenuView(viewGroup0);
        if(menuView0 != menuView1) {
            ((ActionMenuView)menuView1).setPresenter(this);
        }
        return menuView1;
    }

    public final boolean h() {
        h h0 = this.q;
        if(h0 != null) {
            MenuView menuView0 = this.mMenuView;
            if(menuView0 != null) {
                ((View)menuView0).removeCallbacks(h0);
                this.q = null;
                return true;
            }
        }
        k k0 = this.o;
        if(k0 != null) {
            k0.dismiss();
            return true;
        }
        return false;
    }

    public final boolean i() {
        return this.o != null && this.o.isShowing();
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public final void initForMenu(Context context0, MenuBuilder menuBuilder0) {
        super.initForMenu(context0, menuBuilder0);
        Resources resources0 = context0.getResources();
        ActionBarPolicy actionBarPolicy0 = ActionBarPolicy.get(context0);
        if(!this.i) {
            this.h = true;
        }
        this.j = actionBarPolicy0.getEmbeddedMenuWidthLimit();
        this.l = actionBarPolicy0.getMaxActionButtons();
        int v = this.j;
        if(this.h) {
            if(this.e == null) {
                j j0 = new j(this, this.mSystemContext);
                this.e = j0;
                if(this.g) {
                    j0.setImageDrawable(this.f);
                    this.f = null;
                    this.g = false;
                }
                this.e.measure(0, 0);
            }
            v -= this.e.getMeasuredWidth();
        }
        else {
            this.e = null;
        }
        this.k = v;
        resources0.getDisplayMetrics();
    }

    public final void j() {
        this.l = ActionBarPolicy.get(this.mContext).getMaxActionButtons();
        MenuBuilder menuBuilder0 = this.mMenu;
        if(menuBuilder0 != null) {
            menuBuilder0.onItemsChanged(true);
        }
    }

    public final void k(ActionMenuView actionMenuView0) {
        this.mMenuView = actionMenuView0;
        actionMenuView0.initialize(this.mMenu);
    }

    public final boolean l() {
        if(this.h && !this.i() && (this.mMenu != null && this.mMenuView != null && this.q == null && !this.mMenu.getNonActionItems().isEmpty())) {
            h h0 = new h(0, this, new k(this, this.mContext, this.mMenu, this.e));
            this.q = h0;
            ((View)this.mMenuView).post(h0);
            return true;
        }
        return false;
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder0, boolean z) {
        this.h();
        f f0 = this.p;
        if(f0 != null) {
            f0.dismiss();
        }
        super.onCloseMenu(menuBuilder0, z);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof n)) {
            return;
        }
        int v = ((n)parcelable0).a;
        if(v > 0) {
            MenuItem menuItem0 = this.mMenu.findItem(v);
            if(menuItem0 != null) {
                this.onSubMenuSelected(((SubMenuBuilder)menuItem0.getSubMenu()));
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new n();  // 初始化器: Ljava/lang/Object;-><init>()V
        parcelable0.a = this.t;
        return parcelable0;
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder0) {
        boolean z = false;
        if(!subMenuBuilder0.hasVisibleItems()) {
            return false;
        }
        SubMenuBuilder subMenuBuilder1;
        for(subMenuBuilder1 = subMenuBuilder0; subMenuBuilder1.getParentMenu() != this.mMenu; subMenuBuilder1 = (SubMenuBuilder)subMenuBuilder1.getParentMenu()) {
        }
        MenuItem menuItem0 = subMenuBuilder1.getItem();
        ViewGroup viewGroup0 = (ViewGroup)this.mMenuView;
        View view0 = null;
        if(viewGroup0 != null) {
            int v = viewGroup0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = viewGroup0.getChildAt(v1);
                if(view1 instanceof ItemView && ((ItemView)view1).getItemData() == menuItem0) {
                    view0 = view1;
                    break;
                }
            }
        }
        if(view0 == null) {
            return false;
        }
        this.t = subMenuBuilder0.getItem().getItemId();
        int v2 = subMenuBuilder0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            MenuItem menuItem1 = subMenuBuilder0.getItem(v3);
            if(menuItem1.isVisible() && menuItem1.getIcon() != null) {
                z = true;
                break;
            }
        }
        f f0 = new f(this, this.mContext, subMenuBuilder0, view0);
        this.p = f0;
        f0.setForceShowIcon(z);
        this.p.show();
        super.onSubMenuSelected(subMenuBuilder0);
        return true;
    }

    @Override  // androidx.core.view.ActionProvider$SubUiVisibilityListener
    public final void onSubUiVisibilityChanged(boolean z) {
        if(z) {
            super.onSubMenuSelected(null);
            return;
        }
        MenuBuilder menuBuilder0 = this.mMenu;
        if(menuBuilder0 != null) {
            menuBuilder0.close(false);
        }
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public final boolean shouldIncludeItem(int v, MenuItemImpl menuItemImpl0) {
        return menuItemImpl0.isActionButton();
    }

    @Override  // androidx.appcompat.view.menu.BaseMenuPresenter
    public final void updateMenuView(boolean z) {
        super.updateMenuView(z);
        ((View)this.mMenuView).requestLayout();
        MenuBuilder menuBuilder0 = this.mMenu;
        int v = 0;
        if(menuBuilder0 != null) {
            ArrayList arrayList0 = menuBuilder0.getActionItems();
            int v1 = arrayList0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ActionProvider actionProvider0 = ((MenuItemImpl)arrayList0.get(v2)).getSupportActionProvider();
                if(actionProvider0 != null) {
                    actionProvider0.setSubUiVisibilityListener(this);
                }
            }
        }
        ArrayList arrayList1 = this.mMenu == null ? null : this.mMenu.getNonActionItems();
        if(this.h && arrayList1 != null) {
            int v3 = arrayList1.size();
            if(v3 == 1) {
                v = !((MenuItemImpl)arrayList1.get(0)).isActionViewExpanded();
            }
            else if(v3 > 0) {
                v = 1;
            }
        }
        if(v == 0) {
            j j0 = this.e;
            if(j0 != null) {
                ViewParent viewParent0 = j0.getParent();
                MenuView menuView0 = this.mMenuView;
                if(viewParent0 == menuView0) {
                    ((ViewGroup)menuView0).removeView(this.e);
                }
            }
        }
        else {
            if(this.e == null) {
                this.e = new j(this, this.mSystemContext);
            }
            ViewGroup viewGroup0 = (ViewGroup)this.e.getParent();
            if(viewGroup0 != this.mMenuView) {
                if(viewGroup0 != null) {
                    viewGroup0.removeView(this.e);
                }
                ActionMenuView actionMenuView0 = (ActionMenuView)this.mMenuView;
                actionMenuView0.addView(this.e, actionMenuView0.generateOverflowButtonLayoutParams());
            }
        }
        ((ActionMenuView)this.mMenuView).setOverflowReserved(this.h);
    }
}

