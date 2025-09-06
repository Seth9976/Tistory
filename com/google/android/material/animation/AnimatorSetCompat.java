package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
public class AnimatorSetCompat {
    public static void playTogether(@NonNull AnimatorSet animatorSet0, @NonNull List list0) {
        int v = list0.size();
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            Animator animator0 = (Animator)list0.get(v2);
            long v3 = animator0.getStartDelay();
            v1 = Math.max(v1, animator0.getDuration() + v3);
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofInt(new int[]{0, 0});
        valueAnimator0.setDuration(v1);
        list0.add(0, valueAnimator0);
        animatorSet0.playTogether(list0);
    }
}

