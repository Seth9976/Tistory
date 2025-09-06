package y7;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import com.google.android.material.navigation.NavigationBarItemView;

public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final float a;
    public final NavigationBarItemView b;

    public a(NavigationBarItemView navigationBarItemView0, float f) {
        this.b = navigationBarItemView0;
        this.a = f;
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
        this.b.d(f, this.a);
    }
}

