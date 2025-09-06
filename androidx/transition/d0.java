package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

public abstract class d0 implements CalculateSlide {
    @Override  // androidx.transition.Slide$CalculateSlide
    public final float getGoneY(ViewGroup viewGroup0, View view0) {
        return view0.getTranslationY();
    }
}

