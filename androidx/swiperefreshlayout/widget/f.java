package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class f extends Animation {
    public final int a;
    public final int b;
    public final SwipeRefreshLayout c;

    public f(SwipeRefreshLayout swipeRefreshLayout0, int v, int v1) {
        this.c = swipeRefreshLayout0;
        this.a = v;
        this.b = v1;
        super();
    }

    @Override  // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation0) {
        this.c.z.setAlpha(((int)(((float)(this.b - this.a)) * f + ((float)this.a))));
    }
}

