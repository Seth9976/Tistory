package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

public final class v extends ViewPropertyAnimatorListenerAdapter {
    public final i0 a;

    public v(i0 i00) {
        this.a = i00;
        super();
    }

    @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
    public final void onAnimationEnd(View view0) {
        this.a.v.setAlpha(1.0f);
        this.a.y.setListener(null);
        this.a.y = null;
    }

    @Override  // androidx.core.view.ViewPropertyAnimatorListenerAdapter
    public final void onAnimationStart(View view0) {
        i0 i00 = this.a;
        i00.v.setVisibility(0);
        if(i00.v.getParent() instanceof View) {
            ViewCompat.requestApplyInsets(((View)i00.v.getParent()));
        }
    }
}

