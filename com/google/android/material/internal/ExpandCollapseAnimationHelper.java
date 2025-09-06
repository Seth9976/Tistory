package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.z0;
import com.google.android.material.animation.AnimationUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ExpandCollapseAnimationHelper {
    public final View a;
    public final View b;
    public final ArrayList c;
    public final ArrayList d;
    public ValueAnimator.AnimatorUpdateListener e;
    public long f;
    public int g;
    public int h;

    public ExpandCollapseAnimationHelper(@NonNull View view0, @NonNull View view1) {
        this.a = view0;
        this.b = view1;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final AnimatorSet a(boolean z) {
        AnimatorSet animatorSet0 = new AnimatorSet();
        View view0 = this.a;
        Rect rect0 = ViewUtils.calculateRectFromBounds(view0, this.g);
        View view1 = this.b;
        Rect rect1 = ViewUtils.calculateRectFromBounds(view1, this.h);
        Rect rect2 = new Rect(rect0);
        ValueAnimator valueAnimator0 = ValueAnimator.ofObject(new RectEvaluator(rect2), new Object[]{rect0, rect1});
        valueAnimator0.addUpdateListener(new z0(2, this, rect2));
        ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0 = this.e;
        if(valueAnimator$AnimatorUpdateListener0 != null) {
            valueAnimator0.addUpdateListener(valueAnimator$AnimatorUpdateListener0);
        }
        valueAnimator0.setDuration(this.f);
        valueAnimator0.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        List list0 = ViewUtils.getChildren(view1);
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator1.addUpdateListener(MultiViewUpdateListener.alphaListener(list0));
        valueAnimator1.setDuration(this.f);
        valueAnimator1.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.LINEAR_INTERPOLATOR));
        int v = view1.getLeft();
        int v1 = view0.getLeft();
        ValueAnimator valueAnimator2 = ValueAnimator.ofFloat(new float[]{((float)(view0.getRight() - view1.getRight() + (v - v1))), 0.0f});
        valueAnimator2.addUpdateListener(MultiViewUpdateListener.translationXListener(this.d));
        valueAnimator2.setDuration(this.f);
        valueAnimator2.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        animatorSet0.playTogether(new Animator[]{valueAnimator0, valueAnimator1, valueAnimator2});
        return animatorSet0;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addEndAnchoredViews(@NonNull Collection collection0) {
        this.d.addAll(collection0);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addEndAnchoredViews(@NonNull View[] arr_view) {
        Collections.addAll(this.d, arr_view);
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper addListener(@NonNull AnimatorListenerAdapter animatorListenerAdapter0) {
        this.c.add(animatorListenerAdapter0);
        return this;
    }

    @NonNull
    public Animator getCollapseAnimator() {
        Animator animator0 = this.a(false);
        animator0.addListener(new f(this, 1));
        for(Object object0: this.c) {
            animator0.addListener(((AnimatorListenerAdapter)object0));
        }
        return animator0;
    }

    @NonNull
    public Animator getExpandAnimator() {
        Animator animator0 = this.a(true);
        animator0.addListener(new f(this, 0));
        for(Object object0: this.c) {
            animator0.addListener(((AnimatorListenerAdapter)object0));
        }
        return animator0;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setAdditionalUpdateListener(@Nullable ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        this.e = valueAnimator$AnimatorUpdateListener0;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setCollapsedViewOffsetY(int v) {
        this.g = v;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setDuration(long v) {
        this.f = v;
        return this;
    }

    @NonNull
    @CanIgnoreReturnValue
    public ExpandCollapseAnimationHelper setExpandedViewOffsetY(int v) {
        this.h = v;
        return this;
    }
}

