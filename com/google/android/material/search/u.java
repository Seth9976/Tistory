package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.browser.browseractions.c;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.motion.e;

public final class u {
    public final SearchView a;
    public final View b;
    public final ClippableRoundedCornerLayout c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final MaterialToolbar f;
    public final Toolbar g;
    public final TextView h;
    public final EditText i;
    public final ImageButton j;
    public final View k;
    public final TouchObserverFrameLayout l;
    public final MaterialMainContainerBackHelper m;
    public AnimatorSet n;
    public SearchBar o;

    public u(SearchView searchView0) {
        this.a = searchView0;
        this.b = searchView0.a;
        this.c = searchView0.b;
        this.d = searchView0.e;
        this.e = searchView0.f;
        this.f = searchView0.g;
        this.g = searchView0.h;
        this.h = searchView0.i;
        this.i = searchView0.j;
        this.j = searchView0.k;
        this.k = searchView0.l;
        this.l = searchView0.m;
        this.m = new MaterialMainContainerBackHelper(searchView0.b);
    }

    public static void a(u u0, float f) {
        u0.j.setAlpha(f);
        u0.k.setAlpha(f);
        u0.l.setAlpha(f);
        if(u0.a.isMenuItemsAnimated()) {
            ActionMenuView actionMenuView0 = ToolbarUtils.getActionMenuView(u0.f);
            if(actionMenuView0 != null) {
                actionMenuView0.setAlpha(f);
            }
        }
    }

    public final void b(AnimatorSet animatorSet0) {
        ImageButton imageButton0 = ToolbarUtils.getNavigationIconButton(this.f);
        if(imageButton0 == null) {
            return;
        }
        Drawable drawable0 = DrawableCompat.unwrap(imageButton0.getDrawable());
        if(this.a.isAnimatedNavigationIcon()) {
            if(drawable0 instanceof DrawerArrowDrawable) {
                ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                valueAnimator0.addUpdateListener(new e(((DrawerArrowDrawable)drawable0), 1));
                animatorSet0.playTogether(new Animator[]{valueAnimator0});
            }
            if(drawable0 instanceof FadeThroughDrawable) {
                ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                valueAnimator1.addUpdateListener(new e(((FadeThroughDrawable)drawable0), 2));
                animatorSet0.playTogether(new Animator[]{valueAnimator1});
            }
        }
        else {
            if(drawable0 instanceof DrawerArrowDrawable) {
                ((DrawerArrowDrawable)drawable0).setProgress(1.0f);
            }
            if(drawable0 instanceof FadeThroughDrawable) {
                ((FadeThroughDrawable)drawable0).setProgress(1.0f);
            }
        }
    }

    public final AnimatorSet c(boolean z) {
        AnimatorSet animatorSet0 = new AnimatorSet();
        MaterialToolbar materialToolbar0 = this.f;
        ImageButton imageButton0 = ToolbarUtils.getNavigationIconButton(materialToolbar0);
        if(imageButton0 != null) {
            ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{((float)this.f(imageButton0)), 0.0f});
            valueAnimator0.addUpdateListener(MultiViewUpdateListener.translationXListener(new View[]{imageButton0}));
            ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{((float)this.g()), 0.0f});
            valueAnimator1.addUpdateListener(MultiViewUpdateListener.translationYListener(new View[]{imageButton0}));
            animatorSet0.playTogether(new Animator[]{valueAnimator0, valueAnimator1});
        }
        ActionMenuView actionMenuView0 = ToolbarUtils.getActionMenuView(materialToolbar0);
        if(actionMenuView0 != null) {
            ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[]{((float)this.e(actionMenuView0)), 0.0f});
            valueAnimator2.addUpdateListener(MultiViewUpdateListener.translationXListener(new View[]{actionMenuView0}));
            ValueAnimator valueAnimator3 = ValueAnimator.ofFloat(new float[]{((float)this.g()), 0.0f});
            valueAnimator3.addUpdateListener(MultiViewUpdateListener.translationYListener(new View[]{actionMenuView0}));
            animatorSet0.playTogether(new Animator[]{valueAnimator2, valueAnimator3});
        }
        animatorSet0.setDuration((z ? 300L : 0xFAL));
        animatorSet0.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet0;
    }

    public final AnimatorSet d(boolean z) {
        AnimatorSet animatorSet0 = new AnimatorSet();
        if(this.n == null) {
            AnimatorSet animatorSet1 = new AnimatorSet();
            this.b(animatorSet1);
            animatorSet1.setDuration((z ? 300L : 0xFAL));
            animatorSet1.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            animatorSet0.playTogether(new Animator[]{animatorSet1, this.c(z)});
        }
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator0.setDuration((z ? 300L : 0xFAL));
        valueAnimator0.setInterpolator(ReversableAnimatedValueInterpolator.of(z, (z ? AnimationUtils.LINEAR_INTERPOLATOR : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR)));
        valueAnimator0.addUpdateListener(MultiViewUpdateListener.alphaListener(new View[]{this.b}));
        MaterialMainContainerBackHelper materialMainContainerBackHelper0 = this.m;
        Rect rect0 = materialMainContainerBackHelper0.getInitialHideToClipBounds();
        Rect rect1 = materialMainContainerBackHelper0.getInitialHideFromClipBounds();
        SearchView searchView0 = this.a;
        if(rect0 == null) {
            rect0 = ViewUtils.calculateRectFromBounds(searchView0);
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout0 = this.c;
        if(rect1 == null) {
            rect1 = ViewUtils.calculateOffsetRectFromBounds(clippableRoundedCornerLayout0, this.o);
        }
        Rect rect2 = new Rect(rect1);
        float f = this.o.getCornerSize();
        float f1 = Math.max(clippableRoundedCornerLayout0.getCornerRadius(), materialMainContainerBackHelper0.getExpandedCornerSize());
        ValueAnimator valueAnimator1 = ValueAnimator.ofObject(new RectEvaluator(rect2), new Object[]{rect1, rect0});
        valueAnimator1.addUpdateListener(new o(this, f, f1, rect2));
        valueAnimator1.setDuration((z ? 300L : 0xFAL));
        valueAnimator1.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator2.setDuration((z ? 50L : 42L));
        valueAnimator2.setStartDelay((z ? 0xFAL : 0L));
        valueAnimator2.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.LINEAR_INTERPOLATOR));
        valueAnimator2.addUpdateListener(MultiViewUpdateListener.alphaListener(new View[]{this.j}));
        AnimatorSet animatorSet2 = new AnimatorSet();
        ValueAnimator valueAnimator3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator3.setDuration((z ? 150L : 83L));
        valueAnimator3.setStartDelay((z ? 75L : 0L));
        valueAnimator3.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.LINEAR_INTERPOLATOR));
        valueAnimator3.addUpdateListener(MultiViewUpdateListener.alphaListener(new View[]{this.k, this.l}));
        ValueAnimator valueAnimator4 = ValueAnimator.ofFloat(new float[]{((float)this.l.getHeight()) * 0.05f / 2.0f, 0.0f});
        valueAnimator4.setDuration((z ? 300L : 0xFAL));
        valueAnimator4.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        valueAnimator4.addUpdateListener(MultiViewUpdateListener.translationYListener(new View[]{this.k}));
        ValueAnimator valueAnimator5 = ValueAnimator.ofFloat(new float[]{0.95f, 1.0f});
        valueAnimator5.setDuration((z ? 300L : 0xFAL));
        valueAnimator5.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        valueAnimator5.addUpdateListener(MultiViewUpdateListener.scaleListener(new View[]{this.l}));
        animatorSet2.playTogether(new Animator[]{valueAnimator3, valueAnimator4, valueAnimator5});
        AnimatorSet animatorSet3 = this.i(this.d, z, false);
        Toolbar toolbar0 = this.g;
        AnimatorSet animatorSet4 = this.i(toolbar0, z, false);
        ValueAnimator valueAnimator6 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator6.setDuration((z ? 300L : 0xFAL));
        valueAnimator6.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        if(searchView0.isMenuItemsAnimated()) {
            valueAnimator6.addUpdateListener(new FadeThroughUpdateListener(ToolbarUtils.getActionMenuView(toolbar0), ToolbarUtils.getActionMenuView(this.f)));
        }
        animatorSet0.playTogether(new Animator[]{valueAnimator0, valueAnimator1, valueAnimator2, animatorSet2, animatorSet3, animatorSet4, valueAnimator6, this.i(this.i, z, true), this.i(this.h, z, true)});
        animatorSet0.addListener(new c(this, z, 2));
        return animatorSet0;
    }

    public final int e(View view0) {
        int v = MarginLayoutParamsCompat.getMarginEnd(((ViewGroup.MarginLayoutParams)view0.getLayoutParams()));
        return ViewUtils.isLayoutRtl(this.o) ? this.o.getLeft() - v : this.o.getRight() - this.a.getWidth() + v;
    }

    public final int f(View view0) {
        int v = MarginLayoutParamsCompat.getMarginStart(((ViewGroup.MarginLayoutParams)view0.getLayoutParams()));
        int v1 = ViewCompat.getPaddingStart(this.o);
        return ViewUtils.isLayoutRtl(this.o) ? this.o.getWidth() - this.o.getRight() + v - v1 : this.o.getLeft() - v + v1;
    }

    public final int g() {
        int v = this.e.getTop();
        int v1 = this.e.getBottom();
        int v2 = this.o.getTop();
        return (this.o.getBottom() + v2) / 2 - (v1 + v) / 2;
    }

    public final AnimatorSet h(boolean z) {
        AnimatorSet animatorSet0 = new AnimatorSet();
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{((float)this.c.getHeight()), 0.0f});
        valueAnimator0.addUpdateListener(MultiViewUpdateListener.translationYListener(new View[]{this.c}));
        animatorSet0.playTogether(new Animator[]{valueAnimator0});
        this.b(animatorSet0);
        animatorSet0.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        animatorSet0.setDuration((z ? 350L : 300L));
        return animatorSet0;
    }

    public final AnimatorSet i(View view0, boolean z, boolean z1) {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{((float)(z1 ? this.f(view0) : this.e(view0))), 0.0f});
        valueAnimator0.addUpdateListener(MultiViewUpdateListener.translationXListener(new View[]{view0}));
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{((float)this.g()), 0.0f});
        valueAnimator1.addUpdateListener(MultiViewUpdateListener.translationYListener(new View[]{view0}));
        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.playTogether(new Animator[]{valueAnimator0, valueAnimator1});
        animatorSet0.setDuration((z ? 300L : 0xFAL));
        animatorSet0.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet0;
    }

    public final AnimatorSet j() {
        SearchView searchView0 = this.a;
        if(this.o != null) {
            if(searchView0.b()) {
                searchView0.clearFocusAndHideKeyboard();
            }
            AnimatorSet animatorSet0 = this.d(false);
            animatorSet0.addListener(new r(this));
            animatorSet0.start();
            return animatorSet0;
        }
        if(searchView0.b()) {
            searchView0.clearFocusAndHideKeyboard();
        }
        AnimatorSet animatorSet1 = this.h(false);
        animatorSet1.addListener(new t(this));
        animatorSet1.start();
        return animatorSet1;
    }
}

