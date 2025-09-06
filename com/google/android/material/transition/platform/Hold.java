package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
public final class Hold extends Visibility {
    @Override  // android.transition.Visibility
    @NonNull
    public Animator onAppear(@NonNull ViewGroup viewGroup0, @NonNull View view0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        return ValueAnimator.ofFloat(new float[]{0.0f});
    }

    @Override  // android.transition.Visibility
    @NonNull
    public Animator onDisappear(@NonNull ViewGroup viewGroup0, @NonNull View view0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        return ValueAnimator.ofFloat(new float[]{0.0f});
    }
}

