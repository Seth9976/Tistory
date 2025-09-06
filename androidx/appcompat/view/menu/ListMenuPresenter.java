package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.layout;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AlertDialog;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class ListMenuPresenter implements AdapterView.OnItemClickListener, MenuPresenter {
    public static final String VIEWS_TAG = "android:menu:list";
    public Context a;
    public LayoutInflater b;
    public MenuBuilder c;
    public ExpandedMenuView d;
    public int e;
    public final int f;
    public final int g;
    public Callback h;
    public i i;
    public int j;

    public ListMenuPresenter(int v, int v1) {
        this.g = v;
        this.f = v1;
    }

    public ListMenuPresenter(Context context0, int v) {
        this(v, 0);
        this.a = context0;
        this.b = LayoutInflater.from(context0);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(MenuBuilder menuBuilder0, MenuItemImpl menuItemImpl0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    public ListAdapter getAdapter() {
        if(this.i == null) {
            this.i = new i(this);
        }
        return this.i;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.j;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup0) {
        if(this.d == null) {
            this.d = (ExpandedMenuView)this.b.inflate(layout.abc_expanded_menu_layout, viewGroup0, false);
            if(this.i == null) {
                this.i = new i(this);
            }
            this.d.setAdapter(this.i);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(Context context0, MenuBuilder menuBuilder0) {
        int v = this.f;
        if(v != 0) {
            ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, v);
            this.a = contextThemeWrapper0;
            this.b = LayoutInflater.from(contextThemeWrapper0);
        }
        else if(this.a != null) {
            this.a = context0;
            if(this.b == null) {
                this.b = LayoutInflater.from(context0);
            }
        }
        this.c = menuBuilder0;
        i i0 = this.i;
        if(i0 != null) {
            i0.notifyDataSetChanged();
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder0, boolean z) {
        Callback menuPresenter$Callback0 = this.h;
        if(menuPresenter$Callback0 != null) {
            menuPresenter$Callback0.onCloseMenu(menuBuilder0, z);
        }
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.c.performItemAction(this.i.b(v), this, 0);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable0) {
        this.restoreHierarchyState(((Bundle)parcelable0));
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable onSaveInstanceState() {
        if(this.d == null) {
            return null;
        }
        Parcelable parcelable0 = new Bundle();
        this.saveHierarchyState(((Bundle)parcelable0));
        return parcelable0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder0) {
        if(!subMenuBuilder0.hasVisibleItems()) {
            return false;
        }
        j j0 = new j();  // 初始化器: Ljava/lang/Object;-><init>()V
        j0.a = subMenuBuilder0;
        Builder alertDialog$Builder0 = new Builder(subMenuBuilder0.getContext());
        ListMenuPresenter listMenuPresenter0 = new ListMenuPresenter(alertDialog$Builder0.getContext(), layout.abc_list_menu_item_layout);
        j0.c = listMenuPresenter0;
        listMenuPresenter0.setCallback(j0);
        subMenuBuilder0.addMenuPresenter(j0.c);
        alertDialog$Builder0.setAdapter(j0.c.getAdapter(), j0);
        View view0 = subMenuBuilder0.getHeaderView();
        if(view0 == null) {
            alertDialog$Builder0.setIcon(subMenuBuilder0.getHeaderIcon()).setTitle(subMenuBuilder0.getHeaderTitle());
        }
        else {
            alertDialog$Builder0.setCustomTitle(view0);
        }
        alertDialog$Builder0.setOnKeyListener(j0);
        AlertDialog alertDialog0 = alertDialog$Builder0.create();
        j0.b = alertDialog0;
        alertDialog0.setOnDismissListener(j0);
        WindowManager.LayoutParams windowManager$LayoutParams0 = j0.b.getWindow().getAttributes();
        windowManager$LayoutParams0.type = 1003;
        windowManager$LayoutParams0.flags |= 0x20000;
        j0.b.show();
        Callback menuPresenter$Callback0 = this.h;
        if(menuPresenter$Callback0 != null) {
            menuPresenter$Callback0.onOpenSubMenu(subMenuBuilder0);
        }
        return true;
    }

    public void restoreHierarchyState(Bundle bundle0) {
        SparseArray sparseArray0 = bundle0.getSparseParcelableArray("android:menu:list");
        if(sparseArray0 != null) {
            this.d.restoreHierarchyState(sparseArray0);
        }
    }

    public void saveHierarchyState(Bundle bundle0) {
        SparseArray sparseArray0 = new SparseArray();
        ExpandedMenuView expandedMenuView0 = this.d;
        if(expandedMenuView0 != null) {
            expandedMenuView0.saveHierarchyState(sparseArray0);
        }
        bundle0.putSparseParcelableArray("android:menu:list", sparseArray0);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(Callback menuPresenter$Callback0) {
        this.h = menuPresenter$Callback0;
    }

    public void setId(int v) {
        this.j = v;
    }

    public void setItemIndexOffset(int v) {
        this.e = v;
        if(this.d != null) {
            this.updateMenuView(false);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        i i0 = this.i;
        if(i0 != null) {
            i0.notifyDataSetChanged();
        }
    }
}

