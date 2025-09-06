package androidx.appcompat.view.menu;

import androidx.appcompat.widget.ForwardingListener;

public final class a extends ForwardingListener {
    public final ActionMenuItemView j;

    public a(ActionMenuItemView actionMenuItemView0) {
        this.j = actionMenuItemView0;
        super(actionMenuItemView0);
    }

    @Override  // androidx.appcompat.widget.ForwardingListener
    public final ShowableListMenu getPopup() {
        PopupCallback actionMenuItemView$PopupCallback0 = this.j.m;
        return actionMenuItemView$PopupCallback0 == null ? null : actionMenuItemView$PopupCallback0.getPopup();
    }

    @Override  // androidx.appcompat.widget.ForwardingListener
    public final boolean onForwardingStarted() {
        ItemInvoker menuBuilder$ItemInvoker0 = this.j.k;
        if(menuBuilder$ItemInvoker0 != null && menuBuilder$ItemInvoker0.invokeItem(this.j.h)) {
            ShowableListMenu showableListMenu0 = this.getPopup();
            return showableListMenu0 != null && showableListMenu0.isShowing();
        }
        return false;
    }
}

