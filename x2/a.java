package x2;

import androidx.constraintlayout.core.motion.utils.DifferentialInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;

public final class a implements DifferentialInterpolator {
    public float a;
    public final Easing b;

    public a(Easing easing0) {
        this.b = easing0;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
    public final float getInterpolation(float f) {
        this.a = f;
        return (float)this.b.get(((double)f));
    }

    @Override  // androidx.constraintlayout.core.motion.utils.DifferentialInterpolator
    public final float getVelocity() {
        return (float)this.b.getDiff(((double)this.a));
    }
}

