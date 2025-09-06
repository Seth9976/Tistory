package a8;

import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.google.android.material.progressindicator.DeterminateDrawable;

public final class i extends FloatPropertyCompat {
    @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final float getValue(Object object0) {
        return ((DeterminateDrawable)object0).o * 10000.0f;
    }

    @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final void setValue(Object object0, float f) {
        ((DeterminateDrawable)object0).o = f / 10000.0f;
        ((DeterminateDrawable)object0).invalidateSelf();
    }
}

