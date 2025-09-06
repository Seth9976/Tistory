package com.google.android.material.navigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;

public final class a implements Callback {
    public final NavigationBarView a;

    public a(NavigationBarView navigationBarView0) {
        this.a = navigationBarView0;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final boolean onMenuItemSelected(MenuBuilder menuBuilder0, MenuItem menuItem0) {
        NavigationBarView navigationBarView0 = this.a;
        if(navigationBarView0.f != null && menuItem0.getItemId() == navigationBarView0.getSelectedItemId()) {
            navigationBarView0.f.onNavigationItemReselected(menuItem0);
            return true;
        }
        return navigationBarView0.e != null && !navigationBarView0.e.onNavigationItemSelected(menuItem0);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final void onMenuModeChange(MenuBuilder menuBuilder0) {
    }
}

