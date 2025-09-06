package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.view.menu.c;

public final class q0 implements PopupWindow.OnDismissListener {
    public final c a;
    public final r0 b;

    public q0(r0 r00, c c0) {
        this.b = r00;
        this.a = c0;
    }

    @Override  // android.widget.PopupWindow$OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver0 = this.b.M.getViewTreeObserver();
        if(viewTreeObserver0 != null) {
            viewTreeObserver0.removeGlobalOnLayoutListener(this.a);
        }
    }
}

