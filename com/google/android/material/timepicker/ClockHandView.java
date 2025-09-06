package com.google.android.material.timepicker;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.math.MathUtils;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

class ClockHandView extends View {
    public interface OnActionUpListener {
        void onActionUp(@FloatRange(from = 0.0, to = 360.0) float arg1, boolean arg2);
    }

    public interface OnRotateListener {
        void onRotate(@FloatRange(from = 0.0, to = 360.0) float arg1, boolean arg2);
    }

    public final int a;
    public final TimeInterpolator b;
    public final ValueAnimator c;
    public boolean d;
    public float e;
    public float f;
    public boolean g;
    public final int h;
    public boolean i;
    public final ArrayList j;
    public final int k;
    public final float l;
    public final Paint m;
    public final RectF n;
    public final int o;
    public float p;
    public boolean q;
    public n r;
    public double s;
    public int t;
    public int u;
    public static final int v;

    public ClockHandView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialClockStyle);
    }

    public ClockHandView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c = new ValueAnimator();
        this.j = new ArrayList();
        Paint paint0 = new Paint();
        this.m = paint0;
        this.n = new RectF();
        this.u = 1;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ClockHandView, v, style.Widget_MaterialComponents_TimePicker_Clock);
        this.a = MotionUtils.resolveThemeDuration(context0, attr.motionDurationLong2, 200);
        this.b = MotionUtils.resolveThemeInterpolator(context0, attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.t = typedArray0.getDimensionPixelSize(styleable.ClockHandView_materialCircleRadius, 0);
        this.k = typedArray0.getDimensionPixelSize(styleable.ClockHandView_selectorSize, 0);
        Resources resources0 = this.getResources();
        this.o = resources0.getDimensionPixelSize(dimen.material_clock_hand_stroke_width);
        this.l = (float)resources0.getDimensionPixelSize(dimen.material_clock_hand_center_dot_radius);
        int v1 = typedArray0.getColor(styleable.ClockHandView_clockHandColor, 0);
        paint0.setAntiAlias(true);
        paint0.setColor(v1);
        this.c(0.0f, false);
        this.h = ViewConfiguration.get(context0).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        typedArray0.recycle();
    }

    public final int a(float f, float f1) {
        int v = this.getWidth();
        int v1 = (int)Math.toDegrees(Math.atan2(f1 - ((float)(this.getHeight() / 2)), f - ((float)(v / 2))));
        return v1 + 90 >= 0 ? v1 + 90 : v1 + 450;
    }

    public final int b(int v) {
        return v == 2 ? Math.round(((float)this.t) * 0.66f) : this.t;
    }

    public final void c(float f, boolean z) {
        ValueAnimator valueAnimator0 = this.c;
        if(valueAnimator0 != null) {
            valueAnimator0.cancel();
        }
        if(!z) {
            this.d(f, false);
            return;
        }
        float f1 = this.p;
        if(Math.abs(f1 - f) > 180.0f) {
            if(Float.compare(f1, 180.0f) > 0 && f < 180.0f) {
                f += 360.0f;
            }
            if(f1 < 180.0f && f > 180.0f) {
                f1 += 360.0f;
            }
        }
        Pair pair0 = new Pair(f1, f);
        valueAnimator0.setFloatValues(new float[]{((float)(((Float)pair0.first))), ((float)(((Float)pair0.second)))});
        valueAnimator0.setDuration(((long)this.a));
        valueAnimator0.setInterpolator(this.b);
        valueAnimator0.addUpdateListener(new d(this));
        valueAnimator0.addListener(new e());  // 初始化器: Landroid/animation/AnimatorListenerAdapter;-><init>()V
        valueAnimator0.start();
    }

    public final void d(float f, boolean z) {
        this.p = f % 360.0f;
        this.s = Math.toRadians(f % 360.0f - 90.0f);
        int v = this.getHeight();
        int v1 = this.getWidth();
        float f1 = (float)this.b(this.u);
        float f2 = ((float)Math.cos(this.s)) * f1 + ((float)(v1 / 2));
        float f3 = f1 * ((float)Math.sin(this.s)) + ((float)(v / 2));
        this.n.set(f2 - ((float)this.k), f3 - ((float)this.k), f2 + ((float)this.k), f3 + ((float)this.k));
        for(Object object0: this.j) {
            ((OnRotateListener)object0).onRotate(f % 360.0f, z);
        }
        this.invalidate();
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        int v = this.getHeight();
        int v1 = this.getWidth();
        int v2 = this.b(this.u);
        float f = ((float)Math.cos(this.s)) * ((float)v2) + ((float)(v1 / 2));
        float f1 = ((float)v2) * ((float)Math.sin(this.s)) + ((float)(v / 2));
        this.m.setStrokeWidth(0.0f);
        canvas0.drawCircle(f, f1, ((float)this.k), this.m);
        double f2 = Math.sin(this.s);
        double f3 = Math.cos(this.s);
        double f4 = (double)(((float)(v2 - this.k)));
        this.m.setStrokeWidth(((float)this.o));
        canvas0.drawLine(((float)(v1 / 2)), ((float)(v / 2)), ((float)(v1 / 2 + ((int)(f3 * f4)))), ((float)(v / 2 + ((int)(f4 * f2)))), this.m);
        canvas0.drawCircle(((float)(v1 / 2)), ((float)(v / 2)), this.l, this.m);
    }

    @Override  // android.view.View
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(!this.c.isRunning()) {
            this.c(this.p, false);
        }
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z3;
        boolean z2;
        boolean z1;
        int v = 2;
        int v1 = motionEvent0.getActionMasked();
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        boolean z = false;
        if(v1 == 0) {
            this.e = f;
            this.f = f1;
            this.g = true;
            this.q = false;
            z2 = true;
            z1 = false;
            z3 = false;
        }
        else if(v1 != 1 && v1 != 2) {
            z1 = false;
            z2 = false;
            z3 = false;
        }
        else {
            int v2 = (int)(f - this.e);
            int v3 = (int)(f1 - this.f);
            this.g = v3 * v3 + v2 * v2 > this.h;
            z3 = this.q;
            z1 = v1 == 1;
            if(this.i) {
                if(MathUtils.dist(this.getWidth() / 2, this.getHeight() / 2, f, f1) > ((float)this.b(2)) + ViewUtils.dpToPx(this.getContext(), 12)) {
                    v = 1;
                }
                this.u = v;
            }
            z2 = false;
        }
        boolean z4 = this.q;
        int v4 = this.a(f, f1);
        boolean z5 = this.p != ((float)v4);
        if(z2 && z5) {
            z = true;
        }
        else if(z5 || z3) {
            if(z1 && this.d) {
                z = true;
            }
            this.c(((float)v4), z);
            z = true;
        }
        int v5 = z | z4;
        this.q = v5;
        if(v5 != 0 && z1) {
            n n0 = this.r;
            if(n0 != null) {
                n0.onActionUp(((float)this.a(f, f1)), this.g);
            }
        }
        return true;
    }
}

