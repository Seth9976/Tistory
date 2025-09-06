package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

public final class j0 implements Interpolator {
    @Override  // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return f * f * f * f * f;
    }
}

