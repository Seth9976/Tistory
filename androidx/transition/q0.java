package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.BaseInterpolator;

public abstract class q0 {
    public static ObjectAnimator a(View view0, TransitionValues transitionValues0, int v, int v1, float f, float f1, float f2, float f3, BaseInterpolator baseInterpolator0, Visibility visibility0) {
        float f7;
        float f6;
        float f4 = view0.getTranslationX();
        float f5 = view0.getTranslationY();
        int[] arr_v = (int[])transitionValues0.view.getTag(id.transition_position);
        if(arr_v == null) {
            f6 = f;
            f7 = f1;
        }
        else {
            f6 = ((float)(arr_v[0] - v)) + f4;
            f7 = ((float)(arr_v[1] - v1)) + f5;
        }
        int v2 = Math.round(f6 - f4);
        int v3 = Math.round(f7 - f5);
        view0.setTranslationX(f6);
        view0.setTranslationY(f7);
        if(f6 == f2 && f7 == f3) {
            return null;
        }
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofPropertyValuesHolder(view0, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f6, f2}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f7, f3})});
        p0 p00 = new p0(view0, transitionValues0.view, v2 + v, v3 + v1, f4, f5);
        visibility0.addListener(p00);
        objectAnimator0.addListener(p00);
        objectAnimator0.addPauseListener(p00);
        objectAnimator0.setInterpolator(baseInterpolator0);
        return objectAnimator0;
    }
}

