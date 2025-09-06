package com.google.android.material.progressindicator;

import a8.d;
import a8.i;
import a8.k;
import a8.m;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback;
import com.google.android.material.color.MaterialColors;

public final class DeterminateDrawable extends a {
    public final k l;
    public final SpringForce m;
    public final SpringAnimation n;
    public float o;
    public boolean p;
    public static final i q;

    static {
        DeterminateDrawable.q = new i("indicatorLevel");  // 初始化器: Landroidx/dynamicanimation/animation/FloatPropertyCompat;-><init>(Ljava/lang/String;)V
    }

    public DeterminateDrawable(Context context0, BaseProgressIndicatorSpec baseProgressIndicatorSpec0, k k0) {
        super(context0, baseProgressIndicatorSpec0);
        this.p = false;
        this.l = k0;
        k0.b = this;
        SpringForce springForce0 = new SpringForce();
        this.m = springForce0;
        springForce0.setDampingRatio(1.0f);
        springForce0.setStiffness(50.0f);
        SpringAnimation springAnimation0 = new SpringAnimation(this, DeterminateDrawable.q);
        this.n = springAnimation0;
        springAnimation0.setSpring(springForce0);
        if(this.h != 1.0f) {
            this.h = 1.0f;
            this.invalidateSelf();
        }
    }

    public void addSpringAnimationEndListener(@NonNull OnAnimationEndListener dynamicAnimation$OnAnimationEndListener0) {
        this.n.addEndListener(dynamicAnimation$OnAnimationEndListener0);
    }

    @Override  // com.google.android.material.progressindicator.a
    public final boolean c(boolean z, boolean z1, boolean z2) {
        boolean z3 = super.c(z, z1, z2);
        float f = this.c.getSystemAnimatorDurationScale(this.a.getContentResolver());
        if(f == 0.0f) {
            this.p = true;
            return z3;
        }
        this.p = false;
        this.m.setStiffness(50.0f / f);
        return z3;
    }

    @Override  // com.google.android.material.progressindicator.a
    public void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @NonNull
    public static DeterminateDrawable createCircularDrawable(@NonNull Context context0, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec0) {
        return new DeterminateDrawable(context0, circularProgressIndicatorSpec0, new d(circularProgressIndicatorSpec0));
    }

    @NonNull
    public static DeterminateDrawable createLinearDrawable(@NonNull Context context0, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec0) {
        return new DeterminateDrawable(context0, linearProgressIndicatorSpec0, new m(linearProgressIndicatorSpec0));
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
            this.l.c(canvas0, this.i);
            int v = MaterialColors.compositeARGBWithAlpha(this.b.indicatorColors[0], this.getAlpha());
            this.l.b(canvas0, this.i, 0.0f, this.o, v);
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

    @Override  // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.n.skipToEnd();
        this.o = ((float)this.getLevel()) / 10000.0f;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onLevelChange(int v) {
        SpringAnimation springAnimation0 = this.n;
        if(this.p) {
            springAnimation0.skipToEnd();
            this.o = ((float)v) / 10000.0f;
            this.invalidateSelf();
            return true;
        }
        springAnimation0.setStartValue(this.o * 10000.0f);
        springAnimation0.animateToFinalPosition(((float)v));
        return true;
    }

    @Override  // com.google.android.material.progressindicator.a
    public void registerAnimationCallback(@NonNull AnimationCallback animatable2Compat$AnimationCallback0) {
        super.registerAnimationCallback(animatable2Compat$AnimationCallback0);
    }

    public void removeSpringAnimationEndListener(@NonNull OnAnimationEndListener dynamicAnimation$OnAnimationEndListener0) {
        this.n.removeEndListener(dynamicAnimation$OnAnimationEndListener0);
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

