package com.futuremind.fastscroll.viewprovider;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.view.View;
import androidx.annotation.AnimatorRes;
import androidx.transition.m;
import com.kakao.kphotopicker.R.animator;

public class VisibilityAnimationManager {
    public static abstract class AbsBuilder {
        protected int hideAnimatorResource;
        protected int hideDelay;
        protected float pivotX;
        protected float pivotY;
        protected int showAnimatorResource;
        protected final View view;

        public AbsBuilder(View view0) {
            this.showAnimatorResource = animator.fastscroll__default_show;
            this.hideAnimatorResource = animator.fastscroll__default_hide;
            this.hideDelay = 1000;
            this.pivotX = 0.5f;
            this.pivotY = 0.5f;
            this.view = view0;
        }

        public abstract VisibilityAnimationManager build();

        public AbsBuilder withHideAnimator(@AnimatorRes int v) {
            this.hideAnimatorResource = v;
            return this;
        }

        public AbsBuilder withHideDelay(int v) {
            this.hideDelay = v;
            return this;
        }

        public AbsBuilder withPivotX(float f) {
            this.pivotX = f;
            return this;
        }

        public AbsBuilder withPivotY(float f) {
            this.pivotY = f;
            return this;
        }

        public AbsBuilder withShowAnimator(@AnimatorRes int v) {
            this.showAnimatorResource = v;
            return this;
        }
    }

    public static class Builder extends AbsBuilder {
        public Builder(View view0) {
            super(view0);
        }

        @Override  // com.futuremind.fastscroll.viewprovider.VisibilityAnimationManager$AbsBuilder
        public VisibilityAnimationManager build() {
            return new VisibilityAnimationManager(this.view, this.showAnimatorResource, this.hideAnimatorResource, this.pivotX, this.pivotY, this.hideDelay);
        }
    }

    public final float a;
    public final float b;
    protected AnimatorSet hideAnimator;
    protected AnimatorSet showAnimator;
    protected final View view;

    public VisibilityAnimationManager(View view0, @AnimatorRes int v, @AnimatorRes int v1, float f, float f1, int v2) {
        this.view = view0;
        this.a = f;
        this.b = f1;
        AnimatorSet animatorSet0 = (AnimatorSet)AnimatorInflater.loadAnimator(view0.getContext(), v1);
        this.hideAnimator = animatorSet0;
        animatorSet0.setStartDelay(((long)v2));
        this.hideAnimator.setTarget(view0);
        AnimatorSet animatorSet1 = (AnimatorSet)AnimatorInflater.loadAnimator(view0.getContext(), v);
        this.showAnimator = animatorSet1;
        animatorSet1.setTarget(view0);
        this.hideAnimator.addListener(new m(1, view0));
        this.updatePivot();
    }

    public void hide() {
        this.updatePivot();
        this.hideAnimator.start();
    }

    public void show() {
        this.hideAnimator.cancel();
        if(this.view.getVisibility() == 4) {
            this.view.setVisibility(0);
            this.updatePivot();
            this.showAnimator.start();
        }
    }

    public void updatePivot() {
        float f = (float)this.view.getMeasuredWidth();
        this.view.setPivotX(this.a * f);
        float f1 = (float)this.view.getMeasuredHeight();
        this.view.setPivotY(this.b * f1);
    }
}

