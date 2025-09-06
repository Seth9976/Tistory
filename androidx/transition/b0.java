package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

public final class b0 extends d0 {
    public final int a;

    public b0(int v) {
        this.a = v;
        super();
    }

    @Override  // androidx.transition.Slide$CalculateSlide
    public final float getGoneX(ViewGroup viewGroup0, View view0) {
        switch(this.a) {
            case 0: {
                return view0.getTranslationX() - ((float)viewGroup0.getWidth());
            }
            case 1: {
                return ViewCompat.getLayoutDirection(viewGroup0) == 1 ? view0.getTranslationX() + ((float)viewGroup0.getWidth()) : view0.getTranslationX() - ((float)viewGroup0.getWidth());
            }
            case 2: {
                return view0.getTranslationX() + ((float)viewGroup0.getWidth());
            }
            default: {
                return ViewCompat.getLayoutDirection(viewGroup0) == 1 ? view0.getTranslationX() - ((float)viewGroup0.getWidth()) : view0.getTranslationX() + ((float)viewGroup0.getWidth());
            }
        }
    }
}

