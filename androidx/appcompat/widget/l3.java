package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import java.util.ArrayList;

public final class l3 implements MenuPresenter {
    public MenuBuilder a;
    public MenuItemImpl b;
    public final Toolbar c;

    public l3(Toolbar toolbar0) {
        this.c = toolbar0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final boolean collapseItemActionView(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        Toolbar toolbar0 = this.c;
        View view0 = toolbar0.o;
        if(view0 instanceof CollapsibleActionView) {
            ((CollapsibleActionView)view0).onActionViewCollapsed();
        }
        toolbar0.removeView(toolbar0.o);
        toolbar0.removeView(toolbar0.n);
        toolbar0.o = null;
        ArrayList arrayList0 = toolbar0.K;
        for(int v = arrayList0.size() - 1; v >= 0; --v) {
            toolbar0.addView(((View)arrayList0.get(v)));
        }
        arrayList0.clear();
        this.b = null;
        toolbar0.requestLayout();
        menuItemImpl0.setActionViewExpanded(false);
        toolbar0.q();
        return true;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final boolean expandItemActionView(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        Toolbar toolbar0 = this.c;
        toolbar0.c();
        ViewParent viewParent0 = toolbar0.n.getParent();
        if(viewParent0 != toolbar0) {
            if(viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(toolbar0.n);
            }
            toolbar0.addView(toolbar0.n);
        }
        View view0 = menuItemImpl0.getActionView();
        toolbar0.o = view0;
        this.b = menuItemImpl0;
        ViewParent viewParent1 = view0.getParent();
        if(viewParent1 != toolbar0) {
            if(viewParent1 instanceof ViewGroup) {
                ((ViewGroup)viewParent1).removeView(toolbar0.o);
            }
            LayoutParams toolbar$LayoutParams0 = toolbar0.generateDefaultLayoutParams();
            toolbar$LayoutParams0.gravity = toolbar0.t & 0x70 | 0x800003;
            toolbar$LayoutParams0.a = 2;
            toolbar0.o.setLayoutParams(toolbar$LayoutParams0);
            toolbar0.addView(toolbar0.o);
        }
        for(int v = toolbar0.getChildCount() - 1; v >= 0; --v) {
            View view1 = toolbar0.getChildAt(v);
            if(((LayoutParams)view1.getLayoutParams()).a != 2 && view1 != toolbar0.g) {
                toolbar0.removeViewAt(v);
                toolbar0.K.add(view1);
            }
        }
        toolbar0.requestLayout();
        menuItemImpl0.setActionViewExpanded(true);
        View view2 = toolbar0.o;
        if(view2 instanceof CollapsibleActionView) {
            ((CollapsibleActionView)view2).onActionViewExpanded();
        }
        toolbar0.q();
        return true;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return 0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final MenuView getMenuView(ViewGroup viewGroup0) {
        return null;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(Context context0, MenuBuilder menuBuilder0) {
        MenuBuilder menuBuilder1 = this.a;
        if(menuBuilder1 != null) {
            MenuItemImpl menuItemImpl0 = this.b;
            if(menuItemImpl0 != null) {
                menuBuilder1.collapseItemActionView(menuItemImpl0);
            }
        }
        this.a = menuBuilder0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder0, boolean z) {
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
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final void setCallback(Callback menuPresenter$Callback0) {
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z) {
        if(this.b != null) {
            MenuBuilder menuBuilder0 = this.a;
            if(menuBuilder0 != null) {
                int v = menuBuilder0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    if(this.a.getItem(v1) == this.b) {
                        return;
                    }
                }
            }
            this.collapseItemActionView(this.a, this.b);
        }
    }
}

