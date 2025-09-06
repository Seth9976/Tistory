package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Visibility;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

public abstract class l extends Visibility {
    public final VisibilityAnimatorProvider K;
    public VisibilityAnimatorProvider L;
    public final ArrayList M;

    public l(VisibilityAnimatorProvider visibilityAnimatorProvider0, VisibilityAnimatorProvider visibilityAnimatorProvider1) {
        this.M = new ArrayList();
        this.K = visibilityAnimatorProvider0;
        this.L = visibilityAnimatorProvider1;
    }

    public static void n(ArrayList arrayList0, VisibilityAnimatorProvider visibilityAnimatorProvider0, ViewGroup viewGroup0, View view0, boolean z) {
        if(visibilityAnimatorProvider0 == null) {
            return;
        }
        Animator animator0 = z ? visibilityAnimatorProvider0.createAppear(viewGroup0, view0) : visibilityAnimatorProvider0.createDisappear(viewGroup0, view0);
        if(animator0 != null) {
            arrayList0.add(animator0);
        }
    }

    public final AnimatorSet o(ViewGroup viewGroup0, View view0, boolean z) {
        AnimatorSet animatorSet0 = new AnimatorSet();
        ArrayList arrayList0 = new ArrayList();
        l.n(arrayList0, this.K, viewGroup0, view0, z);
        l.n(arrayList0, this.L, viewGroup0, view0, z);
        for(Object object0: this.M) {
            l.n(arrayList0, ((VisibilityAnimatorProvider)object0), viewGroup0, view0, z);
        }
        Context context0 = viewGroup0.getContext();
        int v = this.q(z);
        if(v != 0 && this.getDuration() == -1L) {
            int v1 = MotionUtils.resolveThemeDuration(context0, v, -1);
            if(v1 != -1) {
                this.setDuration(((long)v1));
            }
        }
        int v2 = this.r(z);
        TimeInterpolator timeInterpolator0 = this.p();
        if(v2 != 0 && this.getInterpolator() == null) {
            this.setInterpolator(MotionUtils.resolveThemeInterpolator(context0, v2, timeInterpolator0));
        }
        AnimatorSetCompat.playTogether(animatorSet0, arrayList0);
        return animatorSet0;
    }

    public TimeInterpolator p() {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public int q(boolean z) {
        return 0;
    }

    public int r(boolean z) {
        return 0;
    }
}

