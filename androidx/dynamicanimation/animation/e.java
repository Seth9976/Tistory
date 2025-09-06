package androidx.dynamicanimation.animation;

import android.view.View;
import androidx.core.view.ViewCompat;

public final class e extends ViewProperty {
    @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final float getValue(Object object0) {
        return ViewCompat.getZ(((View)object0));
    }

    @Override  // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final void setValue(Object object0, float f) {
        ViewCompat.setZ(((View)object0), f);
    }
}

