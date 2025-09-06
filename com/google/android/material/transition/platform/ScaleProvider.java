package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.transition.m;

@RequiresApi(21)
public final class ScaleProvider implements VisibilityAnimatorProvider {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;

    public ScaleProvider() {
        this(true);
    }

    public ScaleProvider(boolean z) {
        this.a = 1.0f;
        this.b = 1.1f;
        this.c = 0.8f;
        this.d = 1.0f;
        this.f = true;
        this.e = z;
    }

    public static ObjectAnimator a(View view0, float f, float f1) {
        float f2 = view0.getScaleX();
        float f3 = view0.getScaleY();
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofPropertyValuesHolder(view0, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{f2 * f, f2 * f1}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f * f3, f1 * f3})});
        objectAnimator0.addListener(new m(view0, f2, f3, 1));
        return objectAnimator0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        return this.e ? ScaleProvider.a(view0, this.c, this.d) : ScaleProvider.a(view0, this.b, this.a);
    }

    @Override  // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup0, @NonNull View view0) {
        if(!this.f) {
            return null;
        }
        return this.e ? ScaleProvider.a(view0, this.a, this.b) : ScaleProvider.a(view0, this.d, this.c);
    }

    public float getIncomingEndScale() {
        return this.d;
    }

    public float getIncomingStartScale() {
        return this.c;
    }

    public float getOutgoingEndScale() {
        return this.b;
    }

    public float getOutgoingStartScale() {
        return this.a;
    }

    public boolean isGrowing() {
        return this.e;
    }

    public boolean isScaleOnDisappear() {
        return this.f;
    }

    public void setGrowing(boolean z) {
        this.e = z;
    }

    public void setIncomingEndScale(float f) {
        this.d = f;
    }

    public void setIncomingStartScale(float f) {
        this.c = f;
    }

    public void setOutgoingEndScale(float f) {
        this.b = f;
    }

    public void setOutgoingStartScale(float f) {
        this.a = f;
    }

    public void setScaleOnDisappear(boolean z) {
        this.f = z;
    }
}

