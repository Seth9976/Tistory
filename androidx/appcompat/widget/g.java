package androidx.appcompat.widget;

import androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback;
import androidx.appcompat.view.menu.ShowableListMenu;

public final class g extends PopupCallback {
    public final o a;

    public g(o o0) {
        this.a = o0;
        super();
    }

    @Override  // androidx.appcompat.view.menu.ActionMenuItemView$PopupCallback
    public final ShowableListMenu getPopup() {
        f f0 = this.a.p;
        return f0 != null ? f0.getPopup() : null;
    }
}

