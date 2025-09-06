package androidx.appcompat.view.menu;

import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem;

public final class o implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final MenuItemWrapperICS b;

    public o(MenuItemWrapperICS menuItemWrapperICS0, MenuItem.OnActionExpandListener menuItem$OnActionExpandListener0) {
        this.b = menuItemWrapperICS0;
        this.a = menuItem$OnActionExpandListener0;
    }

    @Override  // android.view.MenuItem$OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem0) {
        MenuItem menuItem1 = this.b.a(menuItem0);
        return this.a.onMenuItemActionCollapse(menuItem1);
    }

    @Override  // android.view.MenuItem$OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem0) {
        MenuItem menuItem1 = this.b.a(menuItem0);
        return this.a.onMenuItemActionExpand(menuItem1);
    }
}

