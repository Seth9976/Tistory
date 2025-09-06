package a8;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.Interpolator;
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat;
import com.google.android.material.R.anim;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

public final class p extends l {
    public ObjectAnimator d;
    public ObjectAnimator e;
    public final Interpolator[] f;
    public final LinearProgressIndicatorSpec g;
    public int h;
    public boolean i;
    public float j;
    public b k;
    public static final int[] l;
    public static final int[] m;
    public static final g n;

    static {
        p.l = new int[]{533, 567, 850, 750};
        p.m = new int[]{0x4F3, 1000, 333, 0};
        p.n = new g(4, "animationFraction", Float.class);
    }

    public p(Context context0, LinearProgressIndicatorSpec linearProgressIndicatorSpec0) {
        super(2);
        this.h = 0;
        this.k = null;
        this.g = linearProgressIndicatorSpec0;
        this.f = new Interpolator[]{AnimationUtilsCompat.loadInterpolator(context0, anim.linear_indeterminate_line1_head_interpolator), AnimationUtilsCompat.loadInterpolator(context0, anim.linear_indeterminate_line1_tail_interpolator), AnimationUtilsCompat.loadInterpolator(context0, anim.linear_indeterminate_line2_head_interpolator), AnimationUtilsCompat.loadInterpolator(context0, anim.linear_indeterminate_line2_tail_interpolator)};
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
        int v = MaterialColors.compositeARGBWithAlpha(this.g.indicatorColors[0], this.a.getAlpha());
        this.c[0] = v;
        this.c[1] = v;
    }

    @Override  // a8.l
    public final void c(b b0) {
        this.k = b0;
    }

    @Override  // a8.l
    public final void d() {
        if(this.e != null && !this.e.isRunning()) {
            this.a();
            if(this.a.isVisible()) {
                this.e.setFloatValues(new float[]{this.j, 1.0f});
                this.e.setDuration(((long)((1.0f - this.j) * 1800.0f)));
                this.e.start();
            }
        }
    }

    @Override  // a8.l
    public final void e() {
        g g0 = p.n;
        if(this.d == null) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, g0, new float[]{0.0f, 1.0f});
            this.d = objectAnimator0;
            objectAnimator0.setDuration(1800L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new e(this, 2));
        }
        if(this.e == null) {
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(this, g0, new float[]{1.0f});
            this.e = objectAnimator1;
            objectAnimator1.setDuration(1800L);
            this.e.setInterpolator(null);
            this.e.addListener(new o(this));
        }
        this.h = 0;
        int v = MaterialColors.compositeARGBWithAlpha(this.g.indicatorColors[0], this.a.getAlpha());
        this.c[0] = v;
        this.c[1] = v;
        this.d.start();
    }

    @Override  // a8.l
    public final void f() {
        this.k = null;
    }
}

