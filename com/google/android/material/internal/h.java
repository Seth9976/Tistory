package com.google.android.material.internal;

import android.view.View.OnClickListener;
import android.view.View;
import androidx.appcompat.view.menu.MenuItemImpl;

public final class h implements View.OnClickListener {
    public final NavigationMenuPresenter a;

    public h(NavigationMenuPresenter navigationMenuPresenter0) {
        this.a = navigationMenuPresenter0;
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        NavigationMenuPresenter navigationMenuPresenter0 = this.a;
        boolean z = true;
        navigationMenuPresenter0.setUpdateSuspended(true);
        MenuItemImpl menuItemImpl0 = ((NavigationMenuItemView)view0).getItemData();
        if(menuItemImpl0 == null || !menuItemImpl0.isCheckable() || !navigationMenuPresenter0.d.performItemAction(menuItemImpl0, navigationMenuPresenter0, 0)) {
            z = false;
        }
        else {
            navigationMenuPresenter0.f.b(menuItemImpl0);
        }
        navigationMenuPresenter0.setUpdateSuspended(false);
        if(z) {
            navigationMenuPresenter0.updateMenuView(false);
        }
    }
}

