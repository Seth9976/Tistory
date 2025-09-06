package androidx.appcompat.app;

import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ContentFrameLayout.OnAttachListener;
import androidx.appcompat.widget.DecorContentParent;
import androidx.core.view.ViewPropertyAnimatorCompat;

public final class s implements OnAttachListener {
    public final i0 a;

    public s(i0 i00) {
        this.a = i00;
    }

    @Override  // androidx.appcompat.widget.ContentFrameLayout$OnAttachListener
    public final void onAttachedFromWindow() {
    }

    @Override  // androidx.appcompat.widget.ContentFrameLayout$OnAttachListener
    public final void onDetachedFromWindow() {
        i0 i00 = this.a;
        DecorContentParent decorContentParent0 = i00.r;
        if(decorContentParent0 != null) {
            decorContentParent0.dismissPopups();
        }
        if(i00.w != null) {
            i00.l.getDecorView().removeCallbacks(i00.x);
            if(i00.w.isShowing()) {
                try {
                    i00.w.dismiss();
                }
                catch(IllegalArgumentException unused_ex) {
                }
            }
            i00.w = null;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0 = i00.y;
        if(viewPropertyAnimatorCompat0 != null) {
            viewPropertyAnimatorCompat0.cancel();
        }
        MenuBuilder menuBuilder0 = i00.s(0).h;
        if(menuBuilder0 != null) {
            menuBuilder0.close();
        }
    }
}

