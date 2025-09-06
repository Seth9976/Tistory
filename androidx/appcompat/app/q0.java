package androidx.appcompat.app;

import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;

public final class q0 implements Callback {
    public boolean a;
    public final t0 b;

    public q0(t0 t00) {
        this.b = t00;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
    public final void onCloseMenu(MenuBuilder menuBuilder0, boolean z) {
        if(this.a) {
            return;
        }
        this.a = true;
        this.b.a.dismissPopupMenus();
        this.b.b.onPanelClosed(108, menuBuilder0);
        this.a = false;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
    public final boolean onOpenSubMenu(MenuBuilder menuBuilder0) {
        this.b.b.onMenuOpened(108, menuBuilder0);
        return true;
    }
}

