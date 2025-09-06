package androidx.dynamicanimation.animation;

import android.view.View;

public final class n extends ViewProperty {
    @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final float getValue(Object object0) {
        return ((View)object0).getScaleY();
    }

    @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final void setValue(Object object0, float f) {
        ((View)object0).setScaleY(f);
    }
}

