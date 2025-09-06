package androidx.appcompat.view.menu;

import androidx.core.view.ActionProvider.VisibilityListener;

public final class k implements VisibilityListener {
    public final MenuItemImpl a;

    public k(MenuItemImpl menuItemImpl0) {
        this.a = menuItemImpl0;
    }

    @Override  // androidx.core.view.ActionProvider$VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        this.a.n.h = true;
        this.a.n.onItemsChanged(true);
    }
}

