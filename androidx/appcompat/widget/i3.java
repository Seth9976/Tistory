package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;

public final class i3 implements Callback {
    public final Toolbar a;

    public i3(Toolbar toolbar0) {
        this.a = toolbar0;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final boolean onMenuItemSelected(MenuBuilder menuBuilder0, MenuItem menuItem0) {
        Callback menuBuilder$Callback0 = this.a.U;
        return menuBuilder$Callback0 != null && menuBuilder$Callback0.onMenuItemSelected(menuBuilder0, menuItem0);
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final void onMenuModeChange(MenuBuilder menuBuilder0) {
        Toolbar toolbar0 = this.a;
        if(!toolbar0.g.isOverflowMenuShowing()) {
            toolbar0.M.onPrepareMenu(menuBuilder0);
        }
        Callback menuBuilder$Callback0 = toolbar0.U;
        if(menuBuilder$Callback0 != null) {
            menuBuilder$Callback0.onMenuModeChange(menuBuilder0);
        }
    }
}

