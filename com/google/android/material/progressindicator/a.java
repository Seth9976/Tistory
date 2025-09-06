package com.google.android.material.progressindicator;

import a8.g;
import a8.j;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;

public abstract class a extends Drawable implements Animatable2Compat {
    public final Context a;
    public final BaseProgressIndicatorSpec b;
    public AnimatorDurationScaleProvider c;
    public ObjectAnimator d;
    public ObjectAnimator e;
    public ArrayList f;
    public boolean g;
    public float h;
    public final Paint i;
    public int j;
    public static final g k;

    static {
        a.k = new g(2, "growFraction", Float.class);
    }

    public a(Context context0, BaseProgressIndicatorSpec baseProgressIndicatorSpec0) {
        this.i = new Paint();
        this.a = context0;
        this.b = baseProgressIndicatorSpec0;
        this.c = new AnimatorDurationScaleProvider();
        this.setAlpha(0xFF);
    }

    public static void a(a a0) {
        a0.super.setVisible(false, false);
    }

    // 去混淆评级： 低(20)
    public final float b() {
        return this.b.isShowAnimationEnabled() || this.b.isHideAnimationEnabled() ? this.h : 1.0f;
    }

    public boolean c(boolean z, boolean z1, boolean z2) {
        g g0 = a.k;
        if(this.d == null) {
            ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, g0, new float[]{0.0f, 1.0f});
            this.d = objectAnimator0;
            objectAnimator0.setDuration(500L);
            this.d.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            ObjectAnimator objectAnimator1 = this.d;
            if(objectAnimator1 != null && objectAnimator1.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.d = objectAnimator1;
            objectAnimator1.addListener(new j(this, 0));
        }
        if(this.e == null) {
            ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(this, g0, new float[]{1.0f, 0.0f});
            this.e = objectAnimator2;
            objectAnimator2.setDuration(500L);
            this.e.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            ObjectAnimator objectAnimator3 = this.e;
            if(objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.e = objectAnimator3;
            objectAnimator3.addListener(new j(this, 1));
        }
        if(!this.isVisible() && !z) {
            return false;
        }
        ObjectAnimator objectAnimator4 = z ? this.d : this.e;
        ObjectAnimator objectAnimator5 = z ? this.e : this.d;
        if(!z2) {
            if(objectAnimator5.isRunning()) {
                boolean z3 = this.g;
                this.g = true;
                objectAnimator5.cancel();
                this.g = z3;
            }
            if(objectAnimator4.isRunning()) {
                objectAnimator4.end();
                return super.setVisible(z, false);
            }
            boolean z4 = this.g;
            this.g = true;
            objectAnimator4.end();
            this.g = z4;
            return super.setVisible(z, false);
        }
        if(objectAnimator4.isRunning()) {
            return false;
        }
        boolean z5 = !z || super.setVisible(true, false);
        if(!(z ? this.b.isShowAnimationEnabled() : this.b.isHideAnimationEnabled())) {
            boolean z6 = this.g;
            this.g = true;
            objectAnimator4.end();
            this.g = z6;
            return z5;
        }
        if(!z1 && objectAnimator4.isPaused()) {
            objectAnimator4.resume();
            return z5;
        }
        objectAnimator4.start();
        return z5;
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        this.f.clear();
        this.f = null;
    }

    @Override  // android.graphics.drawable.Drawable
    public abstract int getAlpha();

    public abstract boolean hideNow();

    public abstract boolean isHiding();

    // 去混淆评级： 低(20)
    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.isShowing() || this.isHiding();
    }

    public abstract boolean isShowing();

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(AnimationCallback animatable2Compat$AnimationCallback0) {
        if(this.f == null) {
            this.f = new ArrayList();
        }
        if(!this.f.contains(animatable2Compat$AnimationCallback0)) {
            this.f.add(animatable2Compat$AnimationCallback0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.j = v;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.i.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }

    public abstract boolean setVisible(boolean arg1, boolean arg2, boolean arg3);

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        this.c(true, true, false);
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        this.c(false, true, false);
    }

    @Override  // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(AnimationCallback animatable2Compat$AnimationCallback0) {
        if(this.f != null && this.f.contains(animatable2Compat$AnimationCallback0)) {
            this.f.remove(animatable2Compat$AnimationCallback0);
            if(this.f.isEmpty()) {
                this.f = null;
            }
            return true;
        }
        return false;
    }
}

