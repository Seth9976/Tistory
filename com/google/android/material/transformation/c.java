package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo;
import com.google.android.material.circularreveal.CircularRevealWidget;

public final class c extends AnimatorListenerAdapter {
    public final CircularRevealWidget a;

    public c(CircularRevealWidget circularRevealWidget0) {
        this.a = circularRevealWidget0;
        super();
    }

    @Override  // android.animation.AnimatorListenerAdapter
    public final void onAnimationEnd(Animator animator0) {
        RevealInfo circularRevealWidget$RevealInfo0 = this.a.getRevealInfo();
        circularRevealWidget$RevealInfo0.radius = 3.402823E+38f;
        this.a.setRevealInfo(circularRevealWidget$RevealInfo0);
    }
}

