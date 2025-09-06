package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.Preconditions;
import com.google.android.material.R.attr;
import com.google.android.material.R.integer;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.ArrayList;

public abstract class x {
    public final Matrix A;
    public t B;
    public static final TimeInterpolator C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int[] H;
    public static final int[] I;
    public static final int[] J;
    public static final int[] K;
    public static final int[] L;
    public static final int[] M;
    public ShapeAppearanceModel a;
    public MaterialShapeDrawable b;
    public Drawable c;
    public d d;
    public LayerDrawable e;
    public boolean f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public int k;
    public Animator l;
    public MotionSpec m;
    public MotionSpec n;
    public float o;
    public float p;
    public int q;
    public int r;
    public ArrayList s;
    public ArrayList t;
    public ArrayList u;
    public final FloatingActionButton v;
    public final f w;
    public final Rect x;
    public final RectF y;
    public final RectF z;

    static {
        x.C = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
        x.D = attr.motionDurationLong2;
        x.E = attr.motionEasingEmphasizedInterpolator;
        x.F = attr.motionDurationMedium1;
        x.G = attr.motionEasingEmphasizedAccelerateInterpolator;
        x.H = new int[]{0x10100A7, 0x101009E};
        x.I = new int[]{0x1010367, 0x101009C, 0x101009E};
        x.J = new int[]{0x101009C, 0x101009E};
        x.K = new int[]{0x1010367, 0x101009E};
        x.L = new int[]{0x101009E};
        x.M = new int[0];
    }

    public x(FloatingActionButton floatingActionButton0, f f0) {
        this.g = true;
        this.p = 1.0f;
        this.r = 0;
        this.x = new Rect();
        this.y = new RectF();
        this.z = new RectF();
        this.A = new Matrix();
        this.v = floatingActionButton0;
        this.w = f0;
        StateListAnimator stateListAnimator0 = new StateListAnimator();
        ValueAnimator valueAnimator0 = x.d(new v(((z)this), 1));
        stateListAnimator0.addState(x.H, valueAnimator0);
        ValueAnimator valueAnimator1 = x.d(new v(((z)this), 0));
        stateListAnimator0.addState(x.I, valueAnimator1);
        ValueAnimator valueAnimator2 = x.d(new v(((z)this), 0));
        stateListAnimator0.addState(x.J, valueAnimator2);
        ValueAnimator valueAnimator3 = x.d(new v(((z)this), 0));
        stateListAnimator0.addState(x.K, valueAnimator3);
        ValueAnimator valueAnimator4 = x.d(new v(((z)this), 2));
        stateListAnimator0.addState(x.L, valueAnimator4);
        ValueAnimator valueAnimator5 = x.d(new u(((z)this)));  // 初始化器: Lcom/google/android/material/floatingactionbutton/w;-><init>(Lcom/google/android/material/floatingactionbutton/z;)V
        stateListAnimator0.addState(x.M, valueAnimator5);
        this.o = floatingActionButton0.getRotation();
    }

    public final void a(float f, Matrix matrix0) {
        matrix0.reset();
        Drawable drawable0 = this.v.getDrawable();
        if(drawable0 != null && this.q != 0) {
            float f1 = (float)drawable0.getIntrinsicWidth();
            float f2 = (float)drawable0.getIntrinsicHeight();
            this.y.set(0.0f, 0.0f, f1, f2);
            float f3 = (float)this.q;
            this.z.set(0.0f, 0.0f, f3, f3);
            matrix0.setRectToRect(this.y, this.z, Matrix.ScaleToFit.CENTER);
            float f4 = ((float)this.q) / 2.0f;
            matrix0.postScale(f, f, f4, f4);
        }
    }

    public final AnimatorSet b(MotionSpec motionSpec0, float f, float f1, float f2) {
        ArrayList arrayList0 = new ArrayList();
        FloatingActionButton floatingActionButton0 = this.v;
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(floatingActionButton0, View.ALPHA, new float[]{f});
        motionSpec0.getTiming("opacity").apply(objectAnimator0);
        arrayList0.add(objectAnimator0);
        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(floatingActionButton0, View.SCALE_X, new float[]{f1});
        motionSpec0.getTiming("scale").apply(objectAnimator1);
        int v = Build.VERSION.SDK_INT;
        if(v == 26) {
            s s0 = new s();  // 初始化器: Ljava/lang/Object;-><init>()V
            s0.a = new FloatEvaluator();
            objectAnimator1.setEvaluator(s0);
        }
        arrayList0.add(objectAnimator1);
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(floatingActionButton0, View.SCALE_Y, new float[]{f1});
        motionSpec0.getTiming("scale").apply(objectAnimator2);
        if(v == 26) {
            s s1 = new s();  // 初始化器: Ljava/lang/Object;-><init>()V
            s1.a = new FloatEvaluator();
            objectAnimator2.setEvaluator(s1);
        }
        arrayList0.add(objectAnimator2);
        this.a(f2, this.A);
        ObjectAnimator objectAnimator3 = ObjectAnimator.ofObject(floatingActionButton0, new ImageMatrixProperty(), new q(this), new Matrix[]{new Matrix(this.A)});
        motionSpec0.getTiming("iconScale").apply(objectAnimator3);
        arrayList0.add(objectAnimator3);
        AnimatorSet animatorSet0 = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet0, arrayList0);
        return animatorSet0;
    }

    public final AnimatorSet c(int v, float f, float f1, int v1, float f2) {
        AnimatorSet animatorSet0 = new AnimatorSet();
        ArrayList arrayList0 = new ArrayList();
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator0.addUpdateListener(new r(this, this.v.getAlpha(), f, this.v.getScaleX(), f1, this.v.getScaleY(), this.p, f2, new Matrix(this.A)));
        arrayList0.add(valueAnimator0);
        AnimatorSetCompat.playTogether(animatorSet0, arrayList0);
        animatorSet0.setDuration(((long)MotionUtils.resolveThemeDuration(this.v.getContext(), v, this.v.getContext().getResources().getInteger(integer.material_motion_duration_long_1))));
        animatorSet0.setInterpolator(MotionUtils.resolveThemeInterpolator(this.v.getContext(), v1, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet0;
    }

    public static ValueAnimator d(w w0) {
        ValueAnimator valueAnimator0 = new ValueAnimator();
        valueAnimator0.setInterpolator(x.C);
        valueAnimator0.setDuration(100L);
        valueAnimator0.addListener(w0);
        valueAnimator0.addUpdateListener(w0);
        valueAnimator0.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator0;
    }

    public abstract float e();

    public void f(Rect rect0) {
        int v = this.f ? Math.max((this.k - this.v.getSizeDimension()) / 2, 0) : 0;
        float f = this.g ? this.e() + this.j : 0.0f;
        int v1 = Math.max(v, ((int)Math.ceil(f)));
        int v2 = Math.max(v, ((int)Math.ceil(f * 1.5f)));
        rect0.set(v1, v2, v1, v2);
    }

    public abstract void g(ColorStateList arg1, PorterDuff.Mode arg2, ColorStateList arg3, int arg4);

    public abstract void h();

    public abstract void i();

    public abstract void j(int[] arg1);

    public abstract void k(float arg1, float arg2, float arg3);

    public final void l() {
        ArrayList arrayList0 = this.u;
        if(arrayList0 != null) {
            for(Object object0: arrayList0) {
                ((FloatingActionButtonImpl.InternalTransformationCallback)object0).onTranslationChanged();
            }
        }
    }

    public void m(ColorStateList colorStateList0) {
        Drawable drawable0 = this.c;
        if(drawable0 != null) {
            DrawableCompat.setTintList(drawable0, RippleUtils.sanitizeRippleDrawableColor(colorStateList0));
        }
    }

    public final void n(ShapeAppearanceModel shapeAppearanceModel0) {
        this.a = shapeAppearanceModel0;
        MaterialShapeDrawable materialShapeDrawable0 = this.b;
        if(materialShapeDrawable0 != null) {
            materialShapeDrawable0.setShapeAppearanceModel(shapeAppearanceModel0);
        }
        Drawable drawable0 = this.c;
        if(drawable0 instanceof Shapeable) {
            ((Shapeable)drawable0).setShapeAppearanceModel(shapeAppearanceModel0);
        }
        d d0 = this.d;
        if(d0 != null) {
            d0.o = shapeAppearanceModel0;
            d0.invalidateSelf();
        }
    }

    public abstract boolean o();

    public abstract void p();

    public final void q() {
        Rect rect0 = this.x;
        this.f(rect0);
        Preconditions.checkNotNull(this.e, "Didn\'t initialize content background");
        boolean z = this.o();
        f f0 = this.w;
        if(z) {
            f0.setBackgroundDrawable(new InsetDrawable(this.e, rect0.left, rect0.top, rect0.right, rect0.bottom));
        }
        else {
            f0.setBackgroundDrawable(this.e);
        }
        f0.setShadowPadding(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }
}

