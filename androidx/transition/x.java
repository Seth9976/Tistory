package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.core.view.ViewCompat;

public final class x implements ViewTreeObserver.OnPreDrawListener {
    public final y a;

    public x(y y0) {
        this.a = y0;
    }

    @Override  // android.view.ViewTreeObserver$OnPreDrawListener
    public final boolean onPreDraw() {
        y y0 = this.a;
        ViewCompat.postInvalidateOnAnimation(y0);
        ViewGroup viewGroup0 = y0.a;
        if(viewGroup0 != null) {
            View view0 = y0.b;
            if(view0 != null) {
                viewGroup0.endViewTransition(view0);
                ViewCompat.postInvalidateOnAnimation(y0.a);
                y0.a = null;
                y0.b = null;
            }
        }
        return true;
    }
}

