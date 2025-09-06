package androidx.appcompat.view.menu;

import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;

public final class p implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener a;
    public final MenuItemWrapperICS b;

    public p(MenuItemWrapperICS menuItemWrapperICS0, MenuItem.OnMenuItemClickListener menuItem$OnMenuItemClickListener0) {
        this.b = menuItemWrapperICS0;
        this.a = menuItem$OnMenuItemClickListener0;
    }

    @Override  // android.view.MenuItem$OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem0) {
        MenuItem menuItem1 = this.b.a(menuItem0);
        return this.a.onMenuItemClick(menuItem1);
    }
}

