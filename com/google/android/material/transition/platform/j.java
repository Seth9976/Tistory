package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

public abstract class j extends Visibility {
    public final VisibilityAnimatorProvider a;
    public VisibilityAnimatorProvider b;
    public final ArrayList c;

    public j(VisibilityAnimatorProvider visibilityAnimatorProvider0, VisibilityAnimatorProvider visibilityAnimatorProvider1) {
        this.c = new ArrayList();
        this.a = visibilityAnimatorProvider0;
        this.b = visibilityAnimatorProvider1;
    }

    public static void a(ArrayList arrayList0, VisibilityAnimatorProvider visibilityAnimatorProvider0, ViewGroup viewGroup0, View view0, boolean z) {
        if(visibilityAnimatorProvider0 == null) {
            return;
        }
        Animator animator0 = z ? visibilityAnimatorProvider0.createAppear(viewGroup0, view0) : visibilityAnimatorProvider0.createDisappear(viewGroup0, view0);
        if(animator0 != null) {
            arrayList0.add(animator0);
        }
    }

    public final AnimatorSet b(ViewGroup viewGroup0, View view0, boolean z) {
        AnimatorSet animatorSet0 = new AnimatorSet();
        ArrayList arrayList0 = new ArrayList();
        j.a(arrayList0, this.a, viewGroup0, view0, z);
        j.a(arrayList0, this.b, viewGroup0, view0, z);
        for(Object object0: this.c) {
            j.a(arrayList0, ((VisibilityAnimatorProvider)object0), viewGroup0, view0, z);
        }
        Context context0 = viewGroup0.getContext();
        int v = this.d(z);
        if(v != 0 && this.getDuration() == -1L) {
            int v1 = MotionUtils.resolveThemeDuration(context0, v, -1);
            if(v1 != -1) {
                this.setDuration(((long)v1));
            }
        }
        int v2 = this.e(z);
        TimeInterpolator timeInterpolator0 = this.c();
        if(v2 != 0 && this.getInterpolator() == null) {
            this.setInterpolator(MotionUtils.resolveThemeInterpolator(context0, v2, timeInterpolator0));
        }
        AnimatorSetCompat.playTogether(animatorSet0, arrayList0);
        return animatorSet0;
    }

    public TimeInterpolator c() {
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public int d(boolean z) {
        return 0;
    }

    public int e(boolean z) {
        return 0;
    }
}

