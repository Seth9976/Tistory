package androidx.appcompat.app;

import android.view.MenuItem;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.view.menu.MenuBuilder;

public final class r0 implements Callback {
    public final t0 a;

    public r0(t0 t00) {
        this.a = t00;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final boolean onMenuItemSelected(MenuBuilder menuBuilder0, MenuItem menuItem0) {
        return false;
    }

    @Override  // androidx.appcompat.view.menu.MenuBuilder$Callback
    public final void onMenuModeChange(MenuBuilder menuBuilder0) {
        boolean z = this.a.a.isOverflowMenuShowing();
        Window.Callback window$Callback0 = this.a.b;
        if(z) {
            window$Callback0.onPanelClosed(108, menuBuilder0);
            return;
        }
        if(window$Callback0.onPreparePanel(0, null, menuBuilder0)) {
            window$Callback0.onMenuOpened(108, menuBuilder0);
        }
    }
}

