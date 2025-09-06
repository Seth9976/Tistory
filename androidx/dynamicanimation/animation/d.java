package androidx.dynamicanimation.animation;

import android.view.View;

public final class d extends ViewProperty {
    @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final float getValue(Object object0) {
        return ((View)object0).getY();
    }

    @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final void setValue(Object object0, float f) {
        ((View)object0).setY(f);
    }
}

