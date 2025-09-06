package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

public final class c0 extends e0 {
    public final int a;

    public c0(int v) {
        this.a = v;
        super();
    }

    @Override  // androidx.transition.Slide$CalculateSlide
    public final float getGoneY(ViewGroup viewGroup0, View view0) {
        return this.a == 0 ? view0.getTranslationY() - ((float)viewGroup0.getHeight()) : view0.getTranslationY() + ((float)viewGroup0.getHeight());
    }
}

