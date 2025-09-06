package com.google.android.material.navigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;

public final class b implements Callback {
    public final NavigationView a;

    public b(NavigationView navigationView0) {
        this.a = navigationView0;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final boolean onMenuItemSelected(MenuBuilder menuBuilder0, MenuItem menuItem0) {
        OnNavigationItemSelectedListener navigationView$OnNavigationItemSelectedListener0 = this.a.j;
        return navigationView$OnNavigationItemSelectedListener0 != null && navigationView$OnNavigationItemSelectedListener0.onNavigationItemSelected(menuItem0);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final void onMenuModeChange(MenuBuilder menuBuilder0) {
    }
}

