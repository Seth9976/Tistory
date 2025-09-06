package androidx.core.view;

import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem;

public final class t implements MenuItem.OnActionExpandListener {
    public final OnActionExpandListener a;

    public t(OnActionExpandListener menuItemCompat$OnActionExpandListener0) {
        this.a = menuItemCompat$OnActionExpandListener0;
    }

    @Override  // android.view.MenuItem$OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem0) {
        return this.a.onMenuItemActionCollapse(menuItem0);
    }

    @Override  // android.view.MenuItem$OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem0) {
        return this.a.onMenuItemActionExpand(menuItem0);
    }
}

