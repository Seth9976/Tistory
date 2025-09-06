package androidx.appcompat.view.menu;

import android.widget.PopupWindow.OnDismissListener;

public final class r implements PopupWindow.OnDismissListener {
    public final MenuPopupHelper a;

    public r(MenuPopupHelper menuPopupHelper0) {
        this.a = menuPopupHelper0;
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        this.a.onDismiss();
    }
}

