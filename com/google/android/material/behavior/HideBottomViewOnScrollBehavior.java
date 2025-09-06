package com.google.android.material.behavior;

import a8.e;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R.attr;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.LinkedHashSet;

public class HideBottomViewOnScrollBehavior extends Behavior {
    public interface OnScrollStateChangedListener {
        void onStateChanged(@NonNull View arg1, @ScrollState int arg2);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public @interface ScrollState {
    }

    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;
    public final LinkedHashSet o;
    public int p;
    public int q;
    public TimeInterpolator r;
    public TimeInterpolator s;
    public int t;
    public int u;
    public int v;
    public ViewPropertyAnimator w;
    public static final int x;
    public static final int y;
    public static final int z;

    static {
        HideBottomViewOnScrollBehavior.x = attr.motionDurationLong2;
        HideBottomViewOnScrollBehavior.y = attr.motionDurationMedium4;
        HideBottomViewOnScrollBehavior.z = attr.motionEasingEmphasizedInterpolator;
    }

    public HideBottomViewOnScrollBehavior() {
        this.o = new LinkedHashSet();
        this.t = 0;
        this.u = 2;
        this.v = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.o = new LinkedHashSet();
        this.t = 0;
        this.u = 2;
        this.v = 0;
    }

    public void addOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener hideBottomViewOnScrollBehavior$OnScrollStateChangedListener0) {
        this.o.add(hideBottomViewOnScrollBehavior$OnScrollStateChangedListener0);
    }

    public void clearOnScrollStateChangedListeners() {
        this.o.clear();
    }

    public boolean isScrolledDown() {
        return this.u == 1;
    }

    public boolean isScrolledUp() {
        return this.u == 2;
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, int v) {
        ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)view0.getLayoutParams();
        this.t = view0.getMeasuredHeight() + viewGroup$MarginLayoutParams0.bottomMargin;
        this.p = MotionUtils.resolveThemeDuration(view0.getContext(), HideBottomViewOnScrollBehavior.x, 0xE1);
        this.q = MotionUtils.resolveThemeDuration(view0.getContext(), HideBottomViewOnScrollBehavior.y, 0xAF);
        this.r = MotionUtils.resolveThemeInterpolator(view0.getContext(), HideBottomViewOnScrollBehavior.z, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        this.s = MotionUtils.resolveThemeInterpolator(view0.getContext(), HideBottomViewOnScrollBehavior.z, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        return super.onLayoutChild(coordinatorLayout0, view0, v);
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, int v, int v1, int v2, int v3, int v4, @NonNull int[] arr_v) {
        if(v1 > 0) {
            this.slideDown(view0);
            return;
        }
        if(v1 < 0) {
            this.slideUp(view0);
        }
    }

    @Override  // androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull View view0, @NonNull View view1, @NonNull View view2, int v, int v1) {
        return v == 2;
    }

    public void removeOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener hideBottomViewOnScrollBehavior$OnScrollStateChangedListener0) {
        this.o.remove(hideBottomViewOnScrollBehavior$OnScrollStateChangedListener0);
    }

    public void setAdditionalHiddenOffsetY(@NonNull View view0, @Dimension int v) {
        this.v = v;
        if(this.u == 1) {
            view0.setTranslationY(((float)(this.t + v)));
        }
    }

    public void slideDown(@NonNull View view0) {
        this.slideDown(view0, true);
    }

    public void slideDown(@NonNull View view0, boolean z) {
        if(this.isScrolledDown()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator0 = this.w;
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
            view0.clearAnimation();
        }
        this.u = 1;
        for(Object object0: this.o) {
            ((OnScrollStateChangedListener)object0).onStateChanged(view0, this.u);
        }
        int v = this.t + this.v;
        if(z) {
            long v1 = (long)this.q;
            TimeInterpolator timeInterpolator0 = this.s;
            this.w = view0.animate().translationY(((float)v)).setInterpolator(timeInterpolator0).setDuration(v1).setListener(new e(this, 10));
            return;
        }
        view0.setTranslationY(((float)v));
    }

    public void slideUp(@NonNull View view0) {
        this.slideUp(view0, true);
    }

    public void slideUp(@NonNull View view0, boolean z) {
        if(this.isScrolledUp()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator0 = this.w;
        if(viewPropertyAnimator0 != null) {
            viewPropertyAnimator0.cancel();
            view0.clearAnimation();
        }
        this.u = 2;
        for(Object object0: this.o) {
            ((OnScrollStateChangedListener)object0).onStateChanged(view0, this.u);
        }
        if(z) {
            long v = (long)this.p;
            TimeInterpolator timeInterpolator0 = this.r;
            this.w = view0.animate().translationY(0.0f).setInterpolator(timeInterpolator0).setDuration(v).setListener(new e(this, 10));
            return;
        }
        view0.setTranslationY(0.0f);
    }
}

