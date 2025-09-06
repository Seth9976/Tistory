package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import y7.d;

@RestrictTo({Scope.LIBRARY_GROUP})
public class NavigationBarPresenter implements MenuPresenter {
    public NavigationBarMenuView a;
    public boolean b;
    public int c;

    public NavigationBarPresenter() {
        this.b = false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(@Nullable MenuBuilder menuBuilder0, @Nullable MenuItemImpl menuItemImpl0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(@Nullable MenuBuilder menuBuilder0, @Nullable MenuItemImpl menuItemImpl0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.c;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    @Nullable
    public MenuView getMenuView(@Nullable ViewGroup viewGroup0) {
        return this.a;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@NonNull Context context0, @NonNull MenuBuilder menuBuilder0) {
        this.a.initialize(menuBuilder0);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(@Nullable MenuBuilder menuBuilder0, boolean z) {
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(@NonNull Parcelable parcelable0) {
        SparseArray sparseArray1;
        if(parcelable0 instanceof d) {
            NavigationBarMenuView navigationBarMenuView0 = this.a;
            int v = ((d)parcelable0).a;
            int v1 = navigationBarMenuView0.E.size();
            for(int v3 = 0; v3 < v1; ++v3) {
                MenuItem menuItem0 = navigationBarMenuView0.E.getItem(v3);
                if(v == menuItem0.getItemId()) {
                    navigationBarMenuView0.g = v;
                    navigationBarMenuView0.h = v3;
                    menuItem0.setChecked(true);
                    break;
                }
            }
            SparseArray sparseArray0 = BadgeUtils.createBadgeDrawablesFromSavedStates(this.a.getContext(), ((d)parcelable0).b);
            NavigationBarMenuView navigationBarMenuView1 = this.a;
            navigationBarMenuView1.getClass();
            for(int v4 = 0; true; ++v4) {
                sparseArray1 = navigationBarMenuView1.s;
                if(v4 >= sparseArray0.size()) {
                    break;
                }
                int v5 = sparseArray0.keyAt(v4);
                if(sparseArray1.indexOfKey(v5) < 0) {
                    sparseArray1.append(v5, ((BadgeDrawable)sparseArray0.get(v5)));
                }
            }
            NavigationBarItemView[] arr_navigationBarItemView = navigationBarMenuView1.f;
            if(arr_navigationBarItemView != null) {
                for(int v2 = 0; v2 < arr_navigationBarItemView.length; ++v2) {
                    NavigationBarItemView navigationBarItemView0 = arr_navigationBarItemView[v2];
                    BadgeDrawable badgeDrawable0 = (BadgeDrawable)sparseArray1.get(navigationBarItemView0.getId());
                    if(badgeDrawable0 != null) {
                        navigationBarItemView0.setBadge(badgeDrawable0);
                    }
                }
            }
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        parcelable0.a = this.a.getSelectedItemId();
        parcelable0.b = BadgeUtils.createParcelableBadgeStates(this.a.getBadgeDrawables());
        return parcelable0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(@Nullable SubMenuBuilder subMenuBuilder0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(@Nullable Callback menuPresenter$Callback0) {
    }

    public void setId(int v) {
        this.c = v;
    }

    public void setMenuView(@NonNull NavigationBarMenuView navigationBarMenuView0) {
        this.a = navigationBarMenuView0;
    }

    public void setUpdateSuspended(boolean z) {
        this.b = z;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        if(this.b) {
            return;
        }
        if(z) {
            this.a.buildMenuView();
            return;
        }
        this.a.updateMenuView();
    }
}

