package androidx.dynamicanimation.animation;

import android.view.View;

public final class h extends ViewProperty {
    @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final float getValue(Object object0) {
        return (float)((View)object0).getScrollY();
    }

    @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final void setValue(Object object0, float f) {
        ((View)object0).setScrollY(((int)f));
    }
}

