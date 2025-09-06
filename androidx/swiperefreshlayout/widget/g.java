package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;

public final class g implements Animation.AnimationListener {
    public final SwipeRefreshLayout a;

    public g(SwipeRefreshLayout swipeRefreshLayout0) {
        this.a = swipeRefreshLayout0;
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationEnd(Animation animation0) {
        SwipeRefreshLayout swipeRefreshLayout0 = this.a;
        if(!swipeRefreshLayout0.s) {
            h h0 = new h(swipeRefreshLayout0, 2);
            swipeRefreshLayout0.B = h0;
            h0.setDuration(150L);
            swipeRefreshLayout0.u.a = null;
            swipeRefreshLayout0.u.clearAnimation();
            swipeRefreshLayout0.u.startAnimation(swipeRefreshLayout0.B);
        }
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationRepeat(Animation animation0) {
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationStart(Animation animation0) {
    }
}

