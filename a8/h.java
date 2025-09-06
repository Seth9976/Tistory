package a8;

import android.animation.ObjectAnimator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

public final class h extends l {
    public ObjectAnimator d;
    public ObjectAnimator e;
    public final FastOutSlowInInterpolator f;
    public final CircularProgressIndicatorSpec g;
    public int h;
    public float i;
    public float j;
    public b k;
    public static final int[] l;
    public static final int[] m;
    public static final int[] n;
    public static final g o;
    public static final g p;

    static {
        h.l = new int[]{0, 1350, 2700, 4050};
        h.m = new int[]{667, 2017, 0xD27, 4717};
        h.n = new int[]{1000, 2350, 3700, 5050};
        h.o = new g(0, "animationFraction", Float.class);
        h.p = new g(1, "completeEndFraction", Float.class);
    }

    public h(CircularProgressIndicatorSpec circularProgressIndicatorSpec0) {
        super(1);
        this.h = 0;
        this.k = null;
        this.g = circularProgressIndicatorSpec0;
        this.f = new FastOutSlowInInterpolator();
    }

    @Override  // a8.l
    public final void a() {
        ObjectAnimator objectAnimator0 = this.d;
        if(objectAnimator0 != null) {
            objectAnimator0.cancel();
        }
    }

    @Override  // a8.l
    public final void b() {
        this.h = 0;
        this.c[0] = MaterialColors.compositeARGBWithAlpha(this.g.indicatorColors[0], this.a.getAlpha());
        this.j = 0.0f;
    }

    @Override  // a8.l
    public final void c(b b0) {
        this.k = b0;
    }

    @Override  // a8.l
    public final void d() {
        if(this.e != null && !this.e.isRunning()) {
            if(this.a.isVisible()) {
                this.e.start();
                return;
            }
            this.a();
        }
    }

    @Override  // a8.l
    public final void e() {
        if(this.d == null) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, h.o, new float[]{0.0f, 1.0f});
            this.d = objectAnimator0;
            objectAnimator0.setDuration(5400L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new e(this, 0));
        }
        if(this.e == null) {
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this, h.p, new float[]{0.0f, 1.0f});
            this.e = objectAnimator1;
            objectAnimator1.setDuration(333L);
            this.e.setInterpolator(this.f);
            this.e.addListener(new f(this));
        }
        this.h = 0;
        this.c[0] = MaterialColors.compositeARGBWithAlpha(this.g.indicatorColors[0], this.a.getAlpha());
        this.j = 0.0f;
        this.d.start();
    }

    @Override  // a8.l
    public final void f() {
        this.k = null;
    }
}

