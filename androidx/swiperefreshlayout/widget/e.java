package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation.AnimationListener;
import android.view.animation.Animation;

public final class e implements Animation.AnimationListener {
    public final SwipeRefreshLayout a;

    public e(SwipeRefreshLayout swipeRefreshLayout0) {
        this.a = swipeRefreshLayout0;
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationEnd(Animation animation0) {
        SwipeRefreshLayout swipeRefreshLayout0 = this.a;
        if(swipeRefreshLayout0.c) {
            swipeRefreshLayout0.z.setAlpha(0xFF);
            swipeRefreshLayout0.z.start();
            if(swipeRefreshLayout0.F) {
                OnRefreshListener swipeRefreshLayout$OnRefreshListener0 = swipeRefreshLayout0.b;
                if(swipeRefreshLayout$OnRefreshListener0 != null) {
                    swipeRefreshLayout$OnRefreshListener0.onRefresh();
                }
            }
            swipeRefreshLayout0.n = swipeRefreshLayout0.u.getTop();
            return;
        }
        swipeRefreshLayout0.e();
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationRepeat(Animation animation0) {
    }

    @Override  // android.view.animation.Animation$AnimationListener
    public final void onAnimationStart(Animation animation0) {
    }
}

