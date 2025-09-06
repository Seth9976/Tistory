package androidx.appcompat.app;

import android.view.Window.Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;

public final class x implements Callback {
    public final i0 a;

    public x(i0 i00) {
        this.a = i00;
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
    public final void onCloseMenu(MenuBuilder menuBuilder0, boolean z) {
        this.a.j(menuBuilder0);
    }

    @Override  // androidx.appcompat.view.menu.MenuPresenter$Callback
    public final boolean onOpenSubMenu(MenuBuilder menuBuilder0) {
        Window.Callback window$Callback0 = this.a.l.getCallback();
        if(window$Callback0 != null) {
            window$Callback0.onMenuOpened(108, menuBuilder0);
        }
        return true;
    }
}

