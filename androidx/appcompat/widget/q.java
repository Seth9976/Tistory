package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;

public final class q implements Callback {
    public final ActionMenuView a;

    public q(ActionMenuView actionMenuView0) {
        this.a = actionMenuView0;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final boolean onMenuItemSelected(MenuBuilder menuBuilder0, MenuItem menuItem0) {
        OnMenuItemClickListener actionMenuView$OnMenuItemClickListener0 = this.a.A;
        return actionMenuView$OnMenuItemClickListener0 != null && actionMenuView$OnMenuItemClickListener0.onMenuItemClick(menuItem0);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final void onMenuModeChange(MenuBuilder menuBuilder0) {
        Callback menuBuilder$Callback0 = this.a.v;
        if(menuBuilder$Callback0 != null) {
            menuBuilder$Callback0.onMenuModeChange(menuBuilder0);
        }
    }
}

