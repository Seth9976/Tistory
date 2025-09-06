package androidx.appcompat.widget;

import android.view.View;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;

public class AbsActionBarView.VisibilityAnimListener implements ViewPropertyAnimatorListener {
    public boolean a;
    public int b;
    public final b c;

    public AbsActionBarView.VisibilityAnimListener(b b0) {
        this.c = b0;
        super();
        this.a = false;
    }

    @Override  // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationCancel(View view0) {
        this.a = true;
    }

    @Override  // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationEnd(View view0) {
        if(this.a) {
            return;
        }
        this.c.mVisibilityAnim = null;
        this.c.super.setVisibility(this.b);
    }

    @Override  // androidx.core.view.ViewPropertyAnimatorListener
    public void onAnimationStart(View view0) {
        b.a(this.c);
        this.a = false;
    }

    public AbsActionBarView.VisibilityAnimListener withFinalVisibility(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat0, int v) {
        this.c.mVisibilityAnim = viewPropertyAnimatorCompat0;
        this.b = v;
        return this;
    }
}

