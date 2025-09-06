package androidx.appcompat.widget;

import android.widget.PopupWindow.OnDismissListener;

public final class f2 implements PopupWindow.OnDismissListener {
    public final PopupMenu a;

    public f2(PopupMenu popupMenu0) {
        this.a = popupMenu0;
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        PopupMenu popupMenu0 = this.a;
        OnDismissListener popupMenu$OnDismissListener0 = popupMenu0.f;
        if(popupMenu$OnDismissListener0 != null) {
            popupMenu$OnDismissListener0.onDismiss(popupMenu0);
        }
    }
}

