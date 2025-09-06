package com.google.android.material.floatingactionbutton;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.core.util.Preconditions;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionSpec;
import java.util.ArrayList;
import java.util.List;

public abstract class b implements MotionStrategy {
    public final Context a;
    public final ExtendedFloatingActionButton b;
    public final ArrayList c;
    public final f d;
    public MotionSpec e;
    public MotionSpec f;

    public b(ExtendedFloatingActionButton extendedFloatingActionButton0, f f0) {
        this.c = new ArrayList();
        this.b = extendedFloatingActionButton0;
        this.a = extendedFloatingActionButton0.getContext();
        this.d = f0;
    }

    public final AnimatorSet a(MotionSpec motionSpec0) {
        ArrayList arrayList0 = new ArrayList();
        boolean z = motionSpec0.hasPropertyValues("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton0 = this.b;
        if(z) {
            arrayList0.add(motionSpec0.getAnimator("opacity", extendedFloatingActionButton0, View.ALPHA));
        }
        if(motionSpec0.hasPropertyValues("scale")) {
            arrayList0.add(motionSpec0.getAnimator("scale", extendedFloatingActionButton0, View.SCALE_Y));
            arrayList0.add(motionSpec0.getAnimator("scale", extendedFloatingActionButton0, View.SCALE_X));
        }
        if(motionSpec0.hasPropertyValues("width")) {
            arrayList0.add(motionSpec0.getAnimator("width", extendedFloatingActionButton0, ExtendedFloatingActionButton.J));
        }
        if(motionSpec0.hasPropertyValues("height")) {
            arrayList0.add(motionSpec0.getAnimator("height", extendedFloatingActionButton0, ExtendedFloatingActionButton.K));
        }
        if(motionSpec0.hasPropertyValues("paddingStart")) {
            arrayList0.add(motionSpec0.getAnimator("paddingStart", extendedFloatingActionButton0, ExtendedFloatingActionButton.L));
        }
        if(motionSpec0.hasPropertyValues("paddingEnd")) {
            arrayList0.add(motionSpec0.getAnimator("paddingEnd", extendedFloatingActionButton0, ExtendedFloatingActionButton.M));
        }
        if(motionSpec0.hasPropertyValues("labelOpacity")) {
            arrayList0.add(motionSpec0.getAnimator("labelOpacity", extendedFloatingActionButton0, new a(this)));
        }
        AnimatorSet animatorSet0 = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet0, arrayList0);
        return animatorSet0;
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void addAnimationListener(Animator.AnimatorListener animator$AnimatorListener0) {
        this.c.add(animator$AnimatorListener0);
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public AnimatorSet createAnimator() {
        return this.a(this.getCurrentMotionSpec());
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final MotionSpec getCurrentMotionSpec() {
        MotionSpec motionSpec0 = this.f;
        if(motionSpec0 != null) {
            return motionSpec0;
        }
        if(this.e == null) {
            int v = this.getDefaultMotionSpecResource();
            this.e = MotionSpec.createFromResource(this.a, v);
        }
        return (MotionSpec)Preconditions.checkNotNull(this.e);
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final List getListeners() {
        return this.c;
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final MotionSpec getMotionSpec() {
        return this.f;
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public void onAnimationCancel() {
        this.d.b = null;
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public void onAnimationEnd() {
        this.d.b = null;
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public void onAnimationStart(Animator animator0) {
        f f0 = this.d;
        Animator animator1 = (Animator)f0.b;
        if(animator1 != null) {
            animator1.cancel();
        }
        f0.b = animator0;
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void removeAnimationListener(Animator.AnimatorListener animator$AnimatorListener0) {
        this.c.remove(animator$AnimatorListener0);
    }

    @Override  // com.google.android.material.floatingactionbutton.MotionStrategy
    public final void setMotionSpec(MotionSpec motionSpec0) {
        this.f = motionSpec0;
    }
}

