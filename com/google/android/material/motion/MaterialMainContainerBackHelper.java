package com.google.android.material.motion;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.R.dimen;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ViewUtils;

@RestrictTo({Scope.LIBRARY_GROUP})
public class MaterialMainContainerBackHelper extends MaterialBackAnimationHelper {
    public final float c;
    public final float d;
    public float e;
    public Rect f;
    public Rect g;
    public Integer h;

    public MaterialMainContainerBackHelper(@NonNull View view0) {
        super(view0);
        Resources resources0 = view0.getResources();
        this.c = resources0.getDimension(dimen.m3_back_progress_main_container_min_edge_gap);
        this.d = resources0.getDimension(dimen.m3_back_progress_main_container_max_translation_y);
    }

    public final AnimatorSet a(View view0) {
        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.view, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.view, View.SCALE_Y, new float[]{1.0f}), ObjectAnimator.ofFloat(this.view, View.TRANSLATION_X, new float[]{0.0f}), ObjectAnimator.ofFloat(this.view, View.TRANSLATION_Y, new float[]{0.0f})});
        animatorSet0.addListener(new d(view0, 1));
        return animatorSet0;
    }

    public void cancelBackProgress(@Nullable View view0) {
        if(super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet0 = this.a(view0);
        View view1 = this.view;
        if(view1 instanceof ClippableRoundedCornerLayout) {
            ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{((ClippableRoundedCornerLayout)view1).getCornerRadius(), ((float)this.getExpandedCornerSize())});
            valueAnimator0.addUpdateListener(new e(((ClippableRoundedCornerLayout)view1), 0));
            animatorSet0.playTogether(new Animator[]{valueAnimator0});
        }
        animatorSet0.setDuration(((long)this.cancelDuration));
        animatorSet0.start();
        this.e = 0.0f;
        this.f = null;
        this.g = null;
    }

    public void finishBackProgress(long v, @Nullable View view0) {
        AnimatorSet animatorSet0 = this.a(view0);
        animatorSet0.setDuration(v);
        animatorSet0.start();
        this.e = 0.0f;
        this.f = null;
        this.g = null;
    }

    public int getExpandedCornerSize() {
        if(this.h == null) {
            int[] arr_v = new int[2];
            this.view.getLocationOnScreen(arr_v);
            int v = 0;
            if(arr_v[1] == 0 && Build.VERSION.SDK_INT >= 0x1F) {
                WindowInsets windowInsets0 = this.view.getRootWindowInsets();
                if(windowInsets0 != null) {
                    RoundedCorner roundedCorner0 = windowInsets0.getRoundedCorner(0);
                    int v1 = roundedCorner0 == null ? 0 : roundedCorner0.getRadius();
                    RoundedCorner roundedCorner1 = windowInsets0.getRoundedCorner(1);
                    int v2 = Math.max(v1, (roundedCorner1 == null ? 0 : roundedCorner1.getRadius()));
                    RoundedCorner roundedCorner2 = windowInsets0.getRoundedCorner(3);
                    int v3 = roundedCorner2 == null ? 0 : roundedCorner2.getRadius();
                    RoundedCorner roundedCorner3 = windowInsets0.getRoundedCorner(2);
                    if(roundedCorner3 != null) {
                        v = roundedCorner3.getRadius();
                    }
                    v = Math.max(v2, Math.max(v3, v));
                }
            }
            this.h = v;
        }
        return (int)this.h;
    }

    @Nullable
    public Rect getInitialHideFromClipBounds() {
        return this.g;
    }

    @Nullable
    public Rect getInitialHideToClipBounds() {
        return this.f;
    }

    @VisibleForTesting
    public void startBackProgress(float f, @Nullable View view0) {
        this.f = ViewUtils.calculateRectFromBounds(this.view);
        if(view0 != null) {
            this.g = ViewUtils.calculateOffsetRectFromBounds(this.view, view0);
        }
        this.e = f;
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat0, @Nullable View view0) {
        super.onStartBackProgress(backEventCompat0);
        this.startBackProgress(backEventCompat0.getTouchY(), view0);
    }

    @VisibleForTesting
    public void updateBackProgress(float f, boolean z, float f1, float f2) {
        float f3 = this.interpolateProgress(f);
        float f4 = (float)this.view.getWidth();
        float f5 = (float)this.view.getHeight();
        if(f4 > 0.0f && f5 > 0.0f) {
            float f6 = AnimationUtils.lerp(1.0f, 0.9f, f3);
            float f7 = f1 - this.e;
            this.view.setScaleX(f6);
            this.view.setScaleY(f6);
            this.view.setTranslationX(AnimationUtils.lerp(0.0f, Math.max(0.0f, (f4 - f4 * 0.9f) / 2.0f - this.c), f3) * ((float)(z ? 1 : -1)));
            this.view.setTranslationY(AnimationUtils.lerp(0.0f, Math.min(Math.max(0.0f, (f5 - f6 * f5) / 2.0f - this.c), this.d), Math.abs(f7) / f5) * Math.signum(f7));
            View view0 = this.view;
            if(view0 instanceof ClippableRoundedCornerLayout) {
                ((ClippableRoundedCornerLayout)view0).updateCornerRadius(AnimationUtils.lerp(this.getExpandedCornerSize(), f2, f3));
            }
        }
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat0, @Nullable View view0, float f) {
        if(super.onUpdateBackProgress(backEventCompat0) == null) {
            return;
        }
        if(view0 != null && view0.getVisibility() != 4) {
            view0.setVisibility(4);
        }
        this.updateBackProgress(backEventCompat0.getProgress(), backEventCompat0.getSwipeEdge() == 0, backEventCompat0.getTouchY(), f);
    }
}

