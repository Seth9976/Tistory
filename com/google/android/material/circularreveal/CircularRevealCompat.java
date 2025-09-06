package com.google.android.material.circularreveal;

import a8.e;
import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.NonNull;

public final class CircularRevealCompat {
    @NonNull
    public static Animator createCircularReveal(@NonNull CircularRevealWidget circularRevealWidget0, float f, float f1, float f2) {
        RevealInfo[] arr_circularRevealWidget$RevealInfo = {new RevealInfo(f, f1, f2)};
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofObject(circularRevealWidget0, CircularRevealProperty.CIRCULAR_REVEAL, CircularRevealEvaluator.CIRCULAR_REVEAL, arr_circularRevealWidget$RevealInfo);
        RevealInfo circularRevealWidget$RevealInfo0 = circularRevealWidget0.getRevealInfo();
        if(circularRevealWidget$RevealInfo0 == null) {
            throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
        }
        Animator animator0 = ViewAnimationUtils.createCircularReveal(((View)circularRevealWidget0), ((int)f), ((int)f1), circularRevealWidget$RevealInfo0.radius, f2);
        Animator animator1 = new AnimatorSet();
        ((AnimatorSet)animator1).playTogether(new Animator[]{objectAnimator0, animator0});
        return animator1;
    }

    @NonNull
    public static Animator createCircularReveal(CircularRevealWidget circularRevealWidget0, float f, float f1, float f2, float f3) {
        RevealInfo[] arr_circularRevealWidget$RevealInfo = {new RevealInfo(f, f1, f2), new RevealInfo(f, f1, f3)};
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofObject(circularRevealWidget0, CircularRevealProperty.CIRCULAR_REVEAL, CircularRevealEvaluator.CIRCULAR_REVEAL, arr_circularRevealWidget$RevealInfo);
        Animator animator0 = ViewAnimationUtils.createCircularReveal(((View)circularRevealWidget0), ((int)f), ((int)f1), f2, f3);
        Animator animator1 = new AnimatorSet();
        ((AnimatorSet)animator1).playTogether(new Animator[]{objectAnimator0, animator0});
        return animator1;
    }

    @NonNull
    public static Animator.AnimatorListener createCircularRevealListener(@NonNull CircularRevealWidget circularRevealWidget0) {
        return new e(circularRevealWidget0, 12);
    }
}

