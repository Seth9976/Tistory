package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MotionTiming {
    public final long a;
    public final long b;
    public final TimeInterpolator c;
    public int d;
    public int e;

    public MotionTiming(long v, long v1) {
        this.c = null;
        this.d = 0;
        this.e = 1;
        this.a = v;
        this.b = v1;
    }

    public MotionTiming(long v, long v1, @NonNull TimeInterpolator timeInterpolator0) {
        this.d = 0;
        this.e = 1;
        this.a = v;
        this.b = v1;
        this.c = timeInterpolator0;
    }

    public void apply(@NonNull Animator animator0) {
        animator0.setStartDelay(this.getDelay());
        animator0.setDuration(this.getDuration());
        animator0.setInterpolator(this.getInterpolator());
        if(animator0 instanceof ValueAnimator) {
            ((ValueAnimator)animator0).setRepeatCount(this.getRepeatCount());
            ((ValueAnimator)animator0).setRepeatMode(this.getRepeatMode());
        }
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MotionTiming)) {
            return false;
        }
        if(this.getDelay() != ((MotionTiming)object0).getDelay()) {
            return false;
        }
        if(this.getDuration() != ((MotionTiming)object0).getDuration()) {
            return false;
        }
        if(this.getRepeatCount() != ((MotionTiming)object0).getRepeatCount()) {
            return false;
        }
        return this.getRepeatMode() == ((MotionTiming)object0).getRepeatMode() ? this.getInterpolator().getClass().equals(((MotionTiming)object0).getInterpolator().getClass()) : false;
    }

    public long getDelay() {
        return this.a;
    }

    public long getDuration() {
        return this.b;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        return this.c == null ? AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR : this.c;
    }

    public int getRepeatCount() {
        return this.d;
    }

    public int getRepeatMode() {
        return this.e;
    }

    @Override
    public int hashCode() {
        return this.getRepeatMode() + (this.getRepeatCount() + (this.getInterpolator().getClass().hashCode() + (((int)(this.getDelay() ^ this.getDelay() >>> 0x20)) * 0x1F + ((int)(this.getDuration() ^ this.getDuration() >>> 0x20))) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    @NonNull
    public String toString() {
        return "\n" + this.getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.getDelay() + " duration: " + this.getDuration() + " interpolator: " + this.getInterpolator().getClass() + " repeatCount: " + this.getRepeatCount() + " repeatMode: " + this.getRepeatMode() + "}\n";
    }
}

