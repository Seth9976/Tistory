package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ChangeScroll extends Transition {
    public static final String[] I;

    static {
        ChangeScroll.I = new String[]{"android:changeScroll:x", "android:changeScroll:y"};
    }

    public ChangeScroll() {
    }

    public ChangeScroll(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues0) {
        ChangeScroll.l(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues0) {
        ChangeScroll.l(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        Animator animator0;
        ObjectAnimator objectAnimator0 = null;
        if(transitionValues0 != null && transitionValues1 != null) {
            View view0 = transitionValues1.view;
            int v = (int)(((Integer)transitionValues0.values.get("android:changeScroll:x")));
            int v1 = (int)(((Integer)transitionValues1.values.get("android:changeScroll:x")));
            int v2 = (int)(((Integer)transitionValues0.values.get("android:changeScroll:y")));
            int v3 = (int)(((Integer)transitionValues1.values.get("android:changeScroll:y")));
            if(v == v1) {
                animator0 = null;
            }
            else {
                view0.setScrollX(v);
                animator0 = ObjectAnimator.ofInt(view0, "scrollX", new int[]{v, v1});
            }
            if(v2 != v3) {
                view0.setScrollY(v2);
                objectAnimator0 = ObjectAnimator.ofInt(view0, "scrollY", new int[]{v2, v3});
            }
            if(animator0 == null) {
                return objectAnimator0;
            }
            if(objectAnimator0 != null) {
                AnimatorSet animatorSet0 = new AnimatorSet();
                animatorSet0.playTogether(new Animator[]{animator0, objectAnimator0});
                return animatorSet0;
            }
            return animator0;
        }
        return null;
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return ChangeScroll.I;
    }

    public static void l(TransitionValues transitionValues0) {
        Integer integer0 = transitionValues0.view.getScrollX();
        transitionValues0.values.put("android:changeScroll:x", integer0);
        Integer integer1 = transitionValues0.view.getScrollY();
        transitionValues0.values.put("android:changeScroll:y", integer1);
    }
}

