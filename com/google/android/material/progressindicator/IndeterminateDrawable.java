package com.google.android.material.progressindicator;

import a8.d;
import a8.h;
import a8.k;
import a8.l;
import a8.m;
import a8.n;
import a8.p;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;

public final class IndeterminateDrawable extends a {
    public final k l;
    public l m;

    public IndeterminateDrawable(Context context0, BaseProgressIndicatorSpec baseProgressIndicatorSpec0, k k0, l l0) {
        super(context0, baseProgressIndicatorSpec0);
        this.l = k0;
        k0.b = this;
        this.m = l0;
        l0.a = this;
    }

    @Override  // com.google.android.material.progressindicator.a
    public final boolean c(boolean z, boolean z1, boolean z2) {
        boolean z3 = super.c(z, z1, z2);
        if(!this.isRunning()) {
            this.m.a();
        }
        this.c.getSystemAnimatorDurationScale(this.a.getContentResolver());
        if(z && z2) {
            this.m.e();
        }
        return z3;
    }

    @Override  // com.google.android.material.progressindicator.a
    public void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @NonNull
    public static IndeterminateDrawable createCircularDrawable(@NonNull Context context0, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec0) {
        return new IndeterminateDrawable(context0, circularProgressIndicatorSpec0, new d(circularProgressIndicatorSpec0), new h(circularProgressIndicatorSpec0));
    }

    @NonNull
    public static IndeterminateDrawable createLinearDrawable(@NonNull Context context0, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec0) {
        m m0 = new m(linearProgressIndicatorSpec0);
        return linearProgressIndicatorSpec0.indeterminateAnimationType == 0 ? new IndeterminateDrawable(context0, linearProgressIndicatorSpec0, m0, new n(linearProgressIndicatorSpec0)) : new IndeterminateDrawable(context0, linearProgressIndicatorSpec0, m0, new p(context0, linearProgressIndicatorSpec0));
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        Rect rect0 = new Rect();
        if(!this.getBounds().isEmpty() && this.isVisible() && canvas0.getClipBounds(rect0)) {
            canvas0.save();
            Rect rect1 = this.getBounds();
            float f = this.b();
            this.l.a.a();
            this.l.a(canvas0, rect1, f);
            Paint paint0 = this.i;
            this.l.c(canvas0, paint0);
            for(int v = 0; true; ++v) {
                l l0 = this.m;
                int[] arr_v = l0.c;
                if(v >= arr_v.length) {
                    break;
                }
                this.l.b(canvas0, paint0, l0.b[v * 2], l0.b[v * 2 + 1], arr_v[v]);
            }
            canvas0.restore();
        }
    }

    @Override  // com.google.android.material.progressindicator.a
    public int getAlpha() {
        return this.j;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.l.d();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.l.e();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override  // com.google.android.material.progressindicator.a
    public boolean hideNow() {
        return this.setVisible(false, false, false);
    }

    @Override  // com.google.android.material.progressindicator.a
    public boolean isHiding() {
        return this.e != null && this.e.isRunning();
    }

    @Override  // com.google.android.material.progressindicator.a
    public boolean isRunning() {
        return super.isRunning();
    }

    @Override  // com.google.android.material.progressindicator.a
    public boolean isShowing() {
        return this.d != null && this.d.isRunning();
    }

    @Override  // com.google.android.material.progressindicator.a
    public void registerAnimationCallback(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        super.registerAnimationCallback(animatable2Compat$AnimationCallback0);
    }

    @Override  // com.google.android.material.progressindicator.a
    public void setAlpha(int v) {
        super.setAlpha(v);
    }

    @Override  // com.google.android.material.progressindicator.a
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        super.setColorFilter(colorFilter0);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z1) {
        return this.setVisible(z, z1, true);
    }

    @Override  // com.google.android.material.progressindicator.a
    public boolean setVisible(boolean z, boolean z1, boolean z2) {
        return !z2 || this.c.getSystemAnimatorDurationScale(this.a.getContentResolver()) <= 0.0f ? this.c(z, z1, false) : this.c(z, z1, true);
    }

    @Override  // com.google.android.material.progressindicator.a
    public void start() {
        super.start();
    }

    @Override  // com.google.android.material.progressindicator.a
    public void stop() {
        super.stop();
    }

    @Override  // com.google.android.material.progressindicator.a
    public boolean unregisterAnimationCallback(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        return super.unregisterAnimationCallback(animatable2Compat$AnimationCallback0);
    }
}

