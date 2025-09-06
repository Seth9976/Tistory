package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.MotionSpec;
import java.util.List;

interface MotionStrategy {
    void addAnimationListener(@NonNull Animator.AnimatorListener arg1);

    AnimatorSet createAnimator();

    MotionSpec getCurrentMotionSpec();

    @AnimatorRes
    int getDefaultMotionSpecResource();

    List getListeners();

    @Nullable
    MotionSpec getMotionSpec();

    void onAnimationCancel();

    void onAnimationEnd();

    void onAnimationStart(Animator arg1);

    void onChange(@Nullable OnChangedCallback arg1);

    void performNow();

    void removeAnimationListener(@NonNull Animator.AnimatorListener arg1);

    void setMotionSpec(@Nullable MotionSpec arg1);

    boolean shouldCancel();
}

