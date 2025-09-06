package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.ActionProvider;

public abstract class l extends ActionProvider {
    public final android.view.ActionProvider d;
    public final MenuItemWrapperICS e;

    public l(MenuItemWrapperICS menuItemWrapperICS0, Context context0, android.view.ActionProvider actionProvider0) {
        this.e = menuItemWrapperICS0;
        super(context0);
        this.d = actionProvider0;
    }

    @Override  // androidx.core.view.ActionProvider
    public final boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    @Override  // androidx.core.view.ActionProvider
    public final View onCreateActionView() {
        return this.d.onCreateActionView();
    }

    @Override  // androidx.core.view.ActionProvider
    public final boolean onPerformDefaultAction() {
        return this.d.onPerformDefaultAction();
    }

    @Override  // androidx.core.view.ActionProvider
    public final void onPrepareSubMenu(SubMenu subMenu0) {
        SubMenu subMenu1 = this.e.b(subMenu0);
        this.d.onPrepareSubMenu(subMenu1);
    }
}

