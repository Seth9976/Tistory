package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.Easing;

public final class h implements Interpolator {
    public final int a;
    public final Easing b;

    public h(Easing easing0, int v) {
        this.a = v;
        this.b = easing0;
        super();
    }

    @Override  // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch(this.a) {
            case 0: {
                return (float)this.b.get(((double)f));
            }
            case 1: {
                return (float)this.b.get(((double)f));
            }
            default: {
                return (float)this.b.get(((double)f));
            }
        }
    }
}

