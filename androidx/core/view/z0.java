package androidx.core.view;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout.LiftOnScrollListener;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;

public final class z0 implements ValueAnimator.AnimatorUpdateListener {
    public final int a;
    public final Object b;
    public final Object c;

    public z0(int v, Object object0, Object object1) {
        this.a = v;
        this.b = object0;
        this.c = object1;
        super();
    }

    @Override  // android.animation.ValueAnimator$AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator0) {
        Object object0 = this.c;
        Object object1 = this.b;
        switch(this.a) {
            case 0: {
                ((ViewPropertyAnimatorUpdateListener)object1).onAnimationUpdate(((View)object0));
                return;
            }
            case 1: {
                ((AppBarLayout)object1).getClass();
                float f = (float)(((Float)valueAnimator0.getAnimatedValue()));
                ((MaterialShapeDrawable)object0).setElevation(f);
                Drawable drawable0 = ((AppBarLayout)object1).v;
                if(drawable0 instanceof MaterialShapeDrawable) {
                    ((MaterialShapeDrawable)drawable0).setElevation(f);
                }
                for(Object object2: ((AppBarLayout)object1).r) {
                    ((LiftOnScrollListener)object2).onUpdate(f, ((MaterialShapeDrawable)object0).getResolvedTintColor());
                }
                return;
            }
            case 2: {
                ViewUtils.setBoundsFromRect(((ExpandCollapseAnimationHelper)object1).b, ((Rect)object0));
                return;
            }
            default: {
                ((MaterialShapeDrawable)object1).setInterpolation(1.0f - valueAnimator0.getAnimatedFraction());
                ViewCompat.setBackground(((View)object0), ((MaterialShapeDrawable)object1));
                ((View)object0).setAlpha(1.0f);
            }
        }
    }
}

