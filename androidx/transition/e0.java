package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

public abstract class e0 implements CalculateSlide {
    @Override  // androidx.transition.Slide$CalculateSlide
    public final float getGoneX(ViewGroup viewGroup0, View view0) {
        return view0.getTranslationX();
    }
}

