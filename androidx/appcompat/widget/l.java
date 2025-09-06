package androidx.appcompat.widget;

import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.SubMenuBuilder;

public final class l implements Callback {
    public final o a;

    public l(o o0) {
        this.a = o0;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
    public final void onCloseMenu(MenuBuilder menuBuilder0, boolean z) {
        if(menuBuilder0 instanceof SubMenuBuilder) {
            menuBuilder0.getRootMenu().close(false);
        }
        Callback menuPresenter$Callback0 = this.a.getCallback();
        if(menuPresenter$Callback0 != null) {
            menuPresenter$Callback0.onCloseMenu(menuBuilder0, z);
        }
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
    public final boolean onOpenSubMenu(MenuBuilder menuBuilder0) {
        o o0 = this.a;
        if(menuBuilder0 == o0.mMenu) {
            return false;
        }
        o0.t = ((SubMenuBuilder)menuBuilder0).getItem().getItemId();
        Callback menuPresenter$Callback0 = o0.getCallback();
        return menuPresenter$Callback0 == null ? false : menuPresenter$Callback0.onOpenSubMenu(menuBuilder0);
    }
}

