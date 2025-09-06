package androidx.appcompat.app;

import android.view.View;
import android.widget.PopupWindow;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

public final class t extends ViewPropertyAnimatorListenerAdapter {
    public final int a;
    public final Object b;

    public t(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
    public final void onAnimationEnd(View view0) {
        if(this.a != 0) {
            y y0 = (y)this.b;
            y0.b.v.setVisibility(8);
            i0 i00 = y0.b;
            PopupWindow popupWindow0 = i00.w;
            if(popupWindow0 != null) {
                popupWindow0.dismiss();
            }
            else if(i00.v.getParent() instanceof View) {
                ViewCompat.requestApplyInsets(((View)y0.b.v.getParent()));
            }
            y0.b.v.killMode();
            y0.b.y.setListener(null);
            y0.b.y = null;
            ViewCompat.requestApplyInsets(y0.b.B);
            return;
        }
        ((u)this.b).a.v.setAlpha(1.0f);
        ((u)this.b).a.y.setListener(null);
        ((u)this.b).a.y = null;
    }

    @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
    public void onAnimationStart(View view0) {
        if(this.a != 0) {
            super.onAnimationStart(view0);
            return;
        }
        ((u)this.b).a.v.setVisibility(0);
    }
}

