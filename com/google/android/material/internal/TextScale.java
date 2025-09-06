package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.material.appbar.g;
import java.util.Map;

@RestrictTo({Scope.LIBRARY_GROUP})
public class TextScale extends Transition {
    @Override  // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues0) {
        View view0 = transitionValues0.view;
        if(view0 instanceof TextView) {
            Float float0 = ((TextView)view0).getScaleX();
            transitionValues0.values.put("android:textscale:scale", float0);
        }
    }

    @Override  // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues0) {
        View view0 = transitionValues0.view;
        if(view0 instanceof TextView) {
            Float float0 = ((TextView)view0).getScaleX();
            transitionValues0.values.put("android:textscale:scale", float0);
        }
    }

    @Override  // androidx.transition.Transition
    public Animator createAnimator(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        if(transitionValues0 != null && transitionValues1 != null && transitionValues0.view instanceof TextView) {
            View view0 = transitionValues1.view;
            if(view0 instanceof TextView) {
                Map map0 = transitionValues1.values;
                float f = 1.0f;
                float f1 = transitionValues0.values.get("android:textscale:scale") == null ? 1.0f : ((float)(((Float)transitionValues0.values.get("android:textscale:scale"))));
                if(map0.get("android:textscale:scale") != null) {
                    f = (float)(((Float)map0.get("android:textscale:scale")));
                }
                if(f1 == f) {
                    return null;
                }
                Animator animator0 = ValueAnimator.ofFloat(new float[]{f1, f});
                ((ValueAnimator)animator0).addUpdateListener(new g(((TextView)view0), 1));
                return animator0;
            }
        }
        return null;
    }
}

