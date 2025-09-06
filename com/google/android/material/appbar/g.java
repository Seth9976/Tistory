package com.google.android.material.appbar;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.transition.k;
import com.google.android.material.transition.platform.h;

public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int a;
    public final Object b;

    public g(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        switch(this.a) {
            case 0: {
                int v = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                ((CollapsingToolbarLayout)this.b).setScrimAlpha(v);
                return;
            }
            case 1: {
                float f1 = (float)(((Float)valueAnimator0.getAnimatedValue()));
                ((TextView)this.b).setScaleX(f1);
                ((TextView)this.b).setScaleY(f1);
                return;
            }
            case 2: {
                float f2 = valueAnimator0.getAnimatedFraction();
                k k0 = (k)this.b;
                if(k0.L != f2) {
                    k0.d(f2);
                }
                return;
            }
            case 3: {
                float f3 = valueAnimator0.getAnimatedFraction();
                h h0 = (h)this.b;
                if(h0.L != f3) {
                    h0.d(f3);
                }
                return;
            }
            case 4: {
                int v1 = (int)(((Integer)valueAnimator0.getAnimatedValue()));
                ((TabLayout)this.b).scrollTo(v1, 0);
                return;
            }
            case 5: {
                float f4 = (float)(((Float)valueAnimator0.getAnimatedValue()));
                ((TextInputLayout)this.b).y0.setExpansionFraction(f4);
                return;
            }
            default: {
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                MaterialShapeDrawable materialShapeDrawable0 = ((BottomSheetBehavior)this.b).x;
                if(materialShapeDrawable0 != null) {
                    materialShapeDrawable0.setInterpolation(f);
                }
            }
        }
    }
}

