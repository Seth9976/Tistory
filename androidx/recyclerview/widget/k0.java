package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

public final class k0 implements Interpolator {
    @Override  // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) * (f - 1.0f) + 1.0f;
    }
}

