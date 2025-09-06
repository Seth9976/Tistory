package androidx.appcompat.widget;

import android.view.View;
import androidx.core.view.ViewCompat;

public final class u1 implements Runnable {
    public final int a;
    public final ListPopupWindow b;

    public u1(ListPopupWindow listPopupWindow0, int v) {
        this.a = v;
        this.b = listPopupWindow0;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                ListPopupWindow listPopupWindow1 = this.b;
                View view0 = listPopupWindow1.getAnchorView();
                if(view0 != null && view0.getWindowToken() != null) {
                    listPopupWindow1.show();
                }
                return;
            }
            case 1: {
                this.b.clearListSelection();
                return;
            }
            default: {
                ListPopupWindow listPopupWindow0 = this.b;
                if(listPopupWindow0.c != null && ViewCompat.isAttachedToWindow(listPopupWindow0.c) && listPopupWindow0.c.getCount() > listPopupWindow0.c.getChildCount() && listPopupWindow0.c.getChildCount() <= listPopupWindow0.o) {
                    listPopupWindow0.F.setInputMethodMode(2);
                    listPopupWindow0.show();
                }
            }
        }
    }
}

