package com.google.android.material.motion;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.R.dimen;
import com.google.android.material.animation.AnimationUtils;

@RestrictTo({Scope.LIBRARY_GROUP})
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper {
    public final float c;
    public final float d;
    public final float e;

    public MaterialSideContainerBackHelper(@NonNull View view0) {
        super(view0);
        Resources resources0 = view0.getResources();
        this.c = resources0.getDimension(dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.d = resources0.getDimension(dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.e = resources0.getDimension(dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public void cancelBackProgress() {
        if(super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.view, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.view, View.SCALE_Y, new float[]{1.0f})});
        View view0 = this.view;
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                animatorSet0.playTogether(new Animator[]{ObjectAnimator.ofFloat(((ViewGroup)view0).getChildAt(v), View.SCALE_Y, new float[]{1.0f})});
            }
        }
        animatorSet0.setDuration(((long)this.cancelDuration));
        animatorSet0.start();
    }

    public void finishBackProgress(@NonNull BackEventCompat backEventCompat0, @GravityInt int v, @Nullable Animator.AnimatorListener animator$AnimatorListener0, @Nullable ValueAnimator.AnimatorUpdateListener valueAnimator$AnimatorUpdateListener0) {
        int v1;
        boolean z = backEventCompat0.getSwipeEdge() == 0;
        boolean z1 = (GravityCompat.getAbsoluteGravity(v, ViewCompat.getLayoutDirection(this.view)) & 3) == 3;
        float f = (float)this.view.getWidth();
        float f1 = this.view.getScaleX();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.view.getLayoutParams();
        if(!(viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams)) {
            v1 = 0;
        }
        else if(z1) {
            v1 = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin;
        }
        else {
            v1 = ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin;
        }
        float f2 = f1 * f + ((float)v1);
        View view0 = this.view;
        Property property0 = View.TRANSLATION_X;
        if(z1) {
            f2 = -f2;
        }
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(view0, property0, new float[]{f2});
        if(valueAnimator$AnimatorUpdateListener0 != null) {
            objectAnimator0.addUpdateListener(valueAnimator$AnimatorUpdateListener0);
        }
        objectAnimator0.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimator0.setDuration(((long)AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, backEventCompat0.getProgress())));
        objectAnimator0.addListener(new f(this, z, v));
        if(animator$AnimatorListener0 != null) {
            objectAnimator0.addListener(animator$AnimatorListener0);
        }
        objectAnimator0.start();
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat0) {
        super.onStartBackProgress(backEventCompat0);
    }

    @VisibleForTesting
    public void updateBackProgress(float f, boolean z, @GravityInt int v) {
        float f8;
        float f1 = this.interpolateProgress(f);
        boolean z1 = true;
        boolean z2 = (GravityCompat.getAbsoluteGravity(v, ViewCompat.getLayoutDirection(this.view)) & 3) == 3;
        if(z != z2) {
            z1 = false;
        }
        int v2 = this.view.getWidth();
        int v3 = this.view.getHeight();
        float f2 = (float)v2;
        if(f2 > 0.0f && ((float)v3) > 0.0f) {
            float f3 = this.c / f2;
            float f4 = this.d / f2;
            float f5 = this.e / ((float)v3);
            View view0 = this.view;
            if(z2) {
                f2 = 0.0f;
            }
            view0.setPivotX(f2);
            if(!z1) {
                f4 = -f3;
            }
            float f6 = AnimationUtils.lerp(0.0f, f4, f1);
            this.view.setScaleX(f6 + 1.0f);
            float f7 = AnimationUtils.lerp(0.0f, f5, f1);
            this.view.setScaleY(1.0f - f7);
            View view1 = this.view;
            if(view1 instanceof ViewGroup) {
                for(int v1 = 0; v1 < ((ViewGroup)view1).getChildCount(); ++v1) {
                    View view2 = ((ViewGroup)view1).getChildAt(v1);
                    if(z2) {
                        int v4 = view2.getRight();
                        f8 = (float)(view2.getWidth() + (v2 - v4));
                    }
                    else {
                        f8 = (float)(-view2.getLeft());
                    }
                    view2.setPivotX(f8);
                    view2.setPivotY(((float)(-view2.getTop())));
                    float f9 = z1 ? 1.0f - f6 : 1.0f;
                    view2.setScaleX(f9);
                    view2.setScaleY((1.0f - f7 == 0.0f ? 1.0f : (f6 + 1.0f) / (1.0f - f7) * f9));
                }
            }
        }
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat0, @GravityInt int v) {
        if(super.onUpdateBackProgress(backEventCompat0) == null) {
            return;
        }
        this.updateBackProgress(backEventCompat0.getProgress(), backEventCompat0.getSwipeEdge() == 0, v);
    }
}

