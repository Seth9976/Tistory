package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class m implements Runnable {
    public final BaseTransientBottomBar a;

    public m(BaseTransientBottomBar baseTransientBottomBar0) {
        this.a = baseTransientBottomBar0;
    }

    @Override
    public final void run() {
        BaseTransientBottomBar baseTransientBottomBar0 = this.a;
        SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout0 = baseTransientBottomBar0.view;
        if(baseTransientBottomBar$SnackbarBaseLayout0 == null) {
            return;
        }
        if(baseTransientBottomBar$SnackbarBaseLayout0.getParent() != null) {
            baseTransientBottomBar0.view.setVisibility(0);
        }
        if(baseTransientBottomBar0.view.getAnimationMode() == 1) {
            ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            valueAnimator0.setInterpolator(baseTransientBottomBar0.d);
            valueAnimator0.addUpdateListener(new b(baseTransientBottomBar0));
            ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
            valueAnimator1.setInterpolator(baseTransientBottomBar0.f);
            valueAnimator1.addUpdateListener(new c(baseTransientBottomBar0));
            AnimatorSet animatorSet0 = new AnimatorSet();
            animatorSet0.playTogether(new Animator[]{valueAnimator0, valueAnimator1});
            animatorSet0.setDuration(((long)baseTransientBottomBar0.a));
            animatorSet0.addListener(new d(baseTransientBottomBar0, 1));
            animatorSet0.start();
            return;
        }
        int v = baseTransientBottomBar0.view.getHeight();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = baseTransientBottomBar0.view.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams) {
            v += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).bottomMargin;
        }
        baseTransientBottomBar0.view.setTranslationY(((float)v));
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setIntValues(new int[]{v, 0});
        valueAnimator2.setInterpolator(baseTransientBottomBar0.e);
        valueAnimator2.setDuration(((long)baseTransientBottomBar0.c));
        valueAnimator2.addListener(new d(baseTransientBottomBar0, 0));
        valueAnimator2.addUpdateListener(new e(baseTransientBottomBar0, v));
        valueAnimator2.start();
    }
}

