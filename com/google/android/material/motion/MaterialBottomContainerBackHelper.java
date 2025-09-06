package com.google.android.material.motion;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.R.dimen;
import com.google.android.material.animation.AnimationUtils;

@RestrictTo({Scope.LIBRARY_GROUP})
public class MaterialBottomContainerBackHelper extends MaterialBackAnimationHelper {
    public final float c;
    public final float d;

    public MaterialBottomContainerBackHelper(@NonNull View view0) {
        super(view0);
        Resources resources0 = view0.getResources();
        this.c = resources0.getDimension(dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.d = resources0.getDimension(dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.view, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(this.view, View.SCALE_Y, new float[]{1.0f})});
        View view0 = this.view;
        if(view0 instanceof ViewGroup) {
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                animatorSet0.playTogether(new Animator[]{ObjectAnimator.ofFloat(((ViewGroup)view0).getChildAt(v), View.SCALE_Y, new float[]{1.0f})});
            }
        }
        animatorSet0.setInterpolator(new FastOutSlowInInterpolator());
        return animatorSet0;
    }

    public void cancelBackProgress() {
        if(super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet0 = this.a();
        animatorSet0.setDuration(((long)this.cancelDuration));
        animatorSet0.start();
    }

    public void finishBackProgressNotPersistent(@NonNull BackEventCompat backEventCompat0, @Nullable Animator.AnimatorListener animator$AnimatorListener0) {
        float f = (float)this.view.getHeight();
        float[] arr_f = {this.view.getScaleY() * f};
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this.view, View.TRANSLATION_Y, arr_f);
        objectAnimator0.setInterpolator(new FastOutSlowInInterpolator());
        objectAnimator0.setDuration(((long)AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, backEventCompat0.getProgress())));
        objectAnimator0.addListener(new d(this, 0));
        if(animator$AnimatorListener0 != null) {
            objectAnimator0.addListener(animator$AnimatorListener0);
        }
        objectAnimator0.start();
    }

    public void finishBackProgressPersistent(@NonNull BackEventCompat backEventCompat0, @Nullable Animator.AnimatorListener animator$AnimatorListener0) {
        AnimatorSet animatorSet0 = this.a();
        animatorSet0.setDuration(((long)AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, backEventCompat0.getProgress())));
        if(animator$AnimatorListener0 != null) {
            animatorSet0.addListener(animator$AnimatorListener0);
        }
        animatorSet0.start();
    }

    public void startBackProgress(@NonNull BackEventCompat backEventCompat0) {
        super.onStartBackProgress(backEventCompat0);
    }

    @VisibleForTesting
    public void updateBackProgress(float f) {
        float f1 = this.interpolateProgress(f);
        float f2 = (float)this.view.getWidth();
        float f3 = (float)this.view.getHeight();
        if(f2 > 0.0f && f3 > 0.0f) {
            float f4 = AnimationUtils.lerp(0.0f, this.c / f2, f1);
            float f5 = AnimationUtils.lerp(0.0f, this.d / f3, f1);
            this.view.setScaleX(1.0f - f4);
            this.view.setPivotY(f3);
            this.view.setScaleY(1.0f - f5);
            View view0 = this.view;
            if(view0 instanceof ViewGroup) {
                for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                    View view1 = ((ViewGroup)view0).getChildAt(v);
                    view1.setPivotY(((float)(-view1.getTop())));
                    view1.setScaleY((1.0f - f5 == 0.0f ? 1.0f : (1.0f - f4) / (1.0f - f5)));
                }
            }
        }
    }

    public void updateBackProgress(@NonNull BackEventCompat backEventCompat0) {
        if(super.onUpdateBackProgress(backEventCompat0) == null) {
            return;
        }
        this.updateBackProgress(backEventCompat0.getProgress());
    }
}

