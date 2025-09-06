package a8;

import android.animation.ObjectAnimator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;

public final class n extends l {
    public ObjectAnimator d;
    public final FastOutSlowInInterpolator e;
    public final LinearProgressIndicatorSpec f;
    public int g;
    public boolean h;
    public float i;
    public static final g j;

    static {
        n.j = new g(3, "animationFraction", Float.class);
    }

    public n(LinearProgressIndicatorSpec linearProgressIndicatorSpec0) {
        super(3);
        this.g = 1;
        this.f = linearProgressIndicatorSpec0;
        this.e = new FastOutSlowInInterpolator();
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
        this.h = true;
        this.g = 1;
        int v = MaterialColors.compositeARGBWithAlpha(this.f.indicatorColors[0], this.a.getAlpha());
        Arrays.fill(this.c, v);
    }

    @Override  // a8.l
    public final void c(b b0) {
    }

    @Override  // a8.l
    public final void d() {
    }

    @Override  // a8.l
    public final void e() {
        if(this.d == null) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, n.j, new float[]{0.0f, 1.0f});
            this.d = objectAnimator0;
            objectAnimator0.setDuration(333L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new e(this, 1));
        }
        this.h = true;
        this.g = 1;
        int v = MaterialColors.compositeARGBWithAlpha(this.f.indicatorColors[0], this.a.getAlpha());
        Arrays.fill(this.c, v);
        this.d.start();
    }

    @Override  // a8.l
    public final void f() {
    }
}

