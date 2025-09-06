package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import com.google.android.material.R.color;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.ArrayList;

public final class z extends x {
    public StateListAnimator N;

    @Override  // com.google.android.material.floatingactionbutton.x
    public final float e() {
        return this.v.getElevation();
    }

    @Override  // com.google.android.material.floatingactionbutton.x
    public final void f(Rect rect0) {
        if(((FloatingActionButton)this.w.b).k) {
            super.f(rect0);
            return;
        }
        if(this.f) {
            FloatingActionButton floatingActionButton0 = this.v;
            int v = floatingActionButton0.getSizeDimension();
            int v1 = this.k;
            if(v < v1) {
                int v2 = (v1 - floatingActionButton0.getSizeDimension()) / 2;
                rect0.set(v2, v2, v2, v2);
                return;
            }
        }
        rect0.set(0, 0, 0, 0);
    }

    @Override  // com.google.android.material.floatingactionbutton.x
    public final void g(ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0, ColorStateList colorStateList1, int v) {
        MaterialShapeDrawable materialShapeDrawable0;
        y y0 = new y(((ShapeAppearanceModel)Preconditions.checkNotNull(this.a)));  // 初始化器: Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>(Lcom/google/android/material/shape/ShapeAppearanceModel;)V
        this.b = y0;
        y0.setTintList(colorStateList0);
        if(porterDuff$Mode0 != null) {
            this.b.setTintMode(porterDuff$Mode0);
        }
        FloatingActionButton floatingActionButton0 = this.v;
        this.b.initializeElevationOverlay(floatingActionButton0.getContext());
        if(v > 0) {
            Context context0 = floatingActionButton0.getContext();
            d d0 = new d(((ShapeAppearanceModel)Preconditions.checkNotNull(this.a)));
            int v1 = ContextCompat.getColor(context0, color.design_fab_stroke_top_outer_color);
            int v2 = ContextCompat.getColor(context0, color.design_fab_stroke_top_inner_color);
            int v3 = ContextCompat.getColor(context0, color.design_fab_stroke_end_inner_color);
            int v4 = ContextCompat.getColor(context0, color.design_fab_stroke_end_outer_color);
            d0.i = v1;
            d0.j = v2;
            d0.k = v3;
            d0.l = v4;
            if(Float.compare(d0.h, v) != 0) {
                d0.h = (float)v;
                d0.b.setStrokeWidth(((float)v) * 1.3333f);
                d0.n = true;
                d0.invalidateSelf();
            }
            if(colorStateList0 != null) {
                d0.m = colorStateList0.getColorForState(d0.getState(), d0.m);
            }
            d0.p = colorStateList0;
            d0.n = true;
            d0.invalidateSelf();
            this.d = d0;
            materialShapeDrawable0 = new LayerDrawable(new Drawable[]{((Drawable)Preconditions.checkNotNull(this.d)), ((Drawable)Preconditions.checkNotNull(this.b))});
        }
        else {
            this.d = null;
            materialShapeDrawable0 = this.b;
        }
        RippleDrawable rippleDrawable0 = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList1), materialShapeDrawable0, null);
        this.c = rippleDrawable0;
        this.e = rippleDrawable0;
    }

    @Override  // com.google.android.material.floatingactionbutton.x
    public final void h() {
    }

    @Override  // com.google.android.material.floatingactionbutton.x
    public final void i() {
        this.q();
    }

    @Override  // com.google.android.material.floatingactionbutton.x
    public final void j(int[] arr_v) {
    }

    @Override  // com.google.android.material.floatingactionbutton.x
    public final void k(float f, float f1, float f2) {
        FloatingActionButton floatingActionButton0 = this.v;
        if(floatingActionButton0.getStateListAnimator() == this.N) {
            StateListAnimator stateListAnimator0 = new StateListAnimator();
            AnimatorSet animatorSet0 = this.r(f, f2);
            stateListAnimator0.addState(x.H, animatorSet0);
            AnimatorSet animatorSet1 = this.r(f, f1);
            stateListAnimator0.addState(x.I, animatorSet1);
            AnimatorSet animatorSet2 = this.r(f, f1);
            stateListAnimator0.addState(x.J, animatorSet2);
            AnimatorSet animatorSet3 = this.r(f, f1);
            stateListAnimator0.addState(x.K, animatorSet3);
            AnimatorSet animatorSet4 = new AnimatorSet();
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(ObjectAnimator.ofFloat(floatingActionButton0, "elevation", new float[]{f}).setDuration(0L));
            arrayList0.add(ObjectAnimator.ofFloat(floatingActionButton0, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100L));
            animatorSet4.playSequentially(((Animator[])arrayList0.toArray(new Animator[0])));
            animatorSet4.setInterpolator(x.C);
            stateListAnimator0.addState(x.L, animatorSet4);
            AnimatorSet animatorSet5 = this.r(0.0f, 0.0f);
            stateListAnimator0.addState(x.M, animatorSet5);
            this.N = stateListAnimator0;
            floatingActionButton0.setStateListAnimator(stateListAnimator0);
        }
        if(this.o()) {
            this.q();
        }
    }

    @Override  // com.google.android.material.floatingactionbutton.x
    public final void m(ColorStateList colorStateList0) {
        Drawable drawable0 = this.c;
        if(drawable0 instanceof RippleDrawable) {
            ((RippleDrawable)drawable0).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList0));
            return;
        }
        super.m(colorStateList0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.material.floatingactionbutton.x
    public final boolean o() {
        return ((FloatingActionButton)this.w.b).k || this.f && this.v.getSizeDimension() < this.k;
    }

    @Override  // com.google.android.material.floatingactionbutton.x
    public final void p() {
    }

    public final AnimatorSet r(float f, float f1) {
        AnimatorSet animatorSet0 = new AnimatorSet();
        animatorSet0.play(ObjectAnimator.ofFloat(this.v, "elevation", new float[]{f}).setDuration(0L)).with(ObjectAnimator.ofFloat(this.v, View.TRANSLATION_Z, new float[]{f1}).setDuration(100L));
        animatorSet0.setInterpolator(x.C);
        return animatorSet0;
    }
}

