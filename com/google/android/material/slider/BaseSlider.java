package com.google.android.material.slider;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.color;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.android.material.tooltip.TooltipDrawable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.text.q;

abstract class BaseSlider extends View {
    public int A;
    public int B;
    public int C;
    public int D;
    public final int E;
    public float F;
    public MotionEvent G;
    public LabelFormatter H;
    public boolean I;
    public float J;
    public float K;
    public ArrayList L;
    public int M;
    public int N;
    public float O;
    public float[] P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public ColorStateList W;
    public final Paint a;
    public ColorStateList a0;
    public final Paint b;
    public ColorStateList b0;
    public final Paint c;
    public ColorStateList c0;
    public final Paint d;
    public ColorStateList d0;
    public final Paint e;
    public final MaterialShapeDrawable e0;
    public final Paint f;
    public Drawable f0;
    public final d g;
    public List g0;
    public final AccessibilityManager h;
    public float h0;
    public c i;
    public int i0;
    public final int j;
    public static final int j0;
    public final ArrayList k;
    public static final int k0;
    public final ArrayList l;
    public static final int l0;
    public final ArrayList m;
    public static final int m0;
    public boolean n;
    public static final int n0;
    public ValueAnimator o;
    public ValueAnimator p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public int y;
    public int z;

    static {
        BaseSlider.j0 = style.Widget_MaterialComponents_Slider;
        BaseSlider.k0 = attr.motionDurationMedium4;
        BaseSlider.l0 = attr.motionDurationShort3;
        BaseSlider.m0 = attr.motionEasingEmphasizedInterpolator;
        BaseSlider.n0 = attr.motionEasingEmphasizedAccelerateInterpolator;
    }

    public BaseSlider(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.sliderStyle);
    }

    public BaseSlider(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, BaseSlider.j0), attributeSet0, v);
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = false;
        this.I = false;
        this.L = new ArrayList();
        this.M = -1;
        this.N = -1;
        this.O = 0.0f;
        this.Q = true;
        this.U = false;
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable();
        this.e0 = materialShapeDrawable0;
        this.g0 = Collections.emptyList();
        this.i0 = 0;
        Context context1 = this.getContext();
        Paint paint0 = new Paint();
        this.a = paint0;
        Paint.Style paint$Style0 = Paint.Style.STROKE;
        paint0.setStyle(paint$Style0);
        Paint.Cap paint$Cap0 = Paint.Cap.ROUND;
        paint0.setStrokeCap(paint$Cap0);
        Paint paint1 = new Paint();
        this.b = paint1;
        paint1.setStyle(paint$Style0);
        paint1.setStrokeCap(paint$Cap0);
        Paint paint2 = new Paint(1);
        this.c = paint2;
        Paint.Style paint$Style1 = Paint.Style.FILL;
        paint2.setStyle(paint$Style1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint3 = new Paint(1);
        this.d = paint3;
        paint3.setStyle(paint$Style1);
        Paint paint4 = new Paint();
        this.e = paint4;
        paint4.setStyle(paint$Style0);
        paint4.setStrokeCap(paint$Cap0);
        Paint paint5 = new Paint();
        this.f = paint5;
        paint5.setStyle(paint$Style0);
        paint5.setStrokeCap(paint$Cap0);
        Resources resources0 = context1.getResources();
        this.x = resources0.getDimensionPixelSize(dimen.mtrl_slider_widget_height);
        int v1 = resources0.getDimensionPixelOffset(dimen.mtrl_slider_track_side_padding);
        this.r = v1;
        this.B = v1;
        this.s = resources0.getDimensionPixelSize(dimen.mtrl_slider_thumb_radius);
        this.t = resources0.getDimensionPixelSize(dimen.mtrl_slider_track_height);
        this.u = resources0.getDimensionPixelSize(dimen.mtrl_slider_tick_radius);
        this.v = resources0.getDimensionPixelSize(dimen.mtrl_slider_tick_radius);
        this.E = resources0.getDimensionPixelSize(dimen.mtrl_slider_label_padding);
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.Slider, v, BaseSlider.j0, new int[0]);
        this.j = typedArray0.getResourceId(styleable.Slider_labelStyle, style.Widget_MaterialComponents_Tooltip);
        this.J = typedArray0.getFloat(styleable.Slider_android_valueFrom, 0.0f);
        this.K = typedArray0.getFloat(styleable.Slider_android_valueTo, 1.0f);
        this.setValues(new Float[]{this.J});
        this.O = typedArray0.getFloat(styleable.Slider_android_stepSize, 0.0f);
        float f = (float)Math.ceil(ViewUtils.dpToPx(this.getContext(), 0x30));
        this.w = (int)Math.ceil(typedArray0.getDimension(styleable.Slider_minTouchTargetSize, f));
        boolean z = typedArray0.hasValue(styleable.Slider_trackColor);
        int v2 = z ? styleable.Slider_trackColor : styleable.Slider_trackColorActive;
        ColorStateList colorStateList0 = MaterialResources.getColorStateList(context1, typedArray0, (z ? styleable.Slider_trackColor : styleable.Slider_trackColorInactive));
        if(colorStateList0 == null) {
            colorStateList0 = AppCompatResources.getColorStateList(context1, color.material_slider_inactive_track_color);
        }
        this.setTrackInactiveTintList(colorStateList0);
        ColorStateList colorStateList1 = MaterialResources.getColorStateList(context1, typedArray0, v2);
        if(colorStateList1 == null) {
            colorStateList1 = AppCompatResources.getColorStateList(context1, color.material_slider_active_track_color);
        }
        this.setTrackActiveTintList(colorStateList1);
        materialShapeDrawable0.setFillColor(MaterialResources.getColorStateList(context1, typedArray0, styleable.Slider_thumbColor));
        if(typedArray0.hasValue(styleable.Slider_thumbStrokeColor)) {
            this.setThumbStrokeColor(MaterialResources.getColorStateList(context1, typedArray0, styleable.Slider_thumbStrokeColor));
        }
        this.setThumbStrokeWidth(typedArray0.getDimension(styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context1, typedArray0, styleable.Slider_haloColor);
        if(colorStateList2 == null) {
            colorStateList2 = AppCompatResources.getColorStateList(context1, color.material_slider_halo_color);
        }
        this.setHaloTintList(colorStateList2);
        this.Q = typedArray0.getBoolean(styleable.Slider_tickVisible, true);
        boolean z1 = typedArray0.hasValue(styleable.Slider_tickColor);
        int v3 = z1 ? styleable.Slider_tickColor : styleable.Slider_tickColorActive;
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(context1, typedArray0, (z1 ? styleable.Slider_tickColor : styleable.Slider_tickColorInactive));
        if(colorStateList3 == null) {
            colorStateList3 = AppCompatResources.getColorStateList(context1, color.material_slider_inactive_tick_marks_color);
        }
        this.setTickInactiveTintList(colorStateList3);
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context1, typedArray0, v3);
        if(colorStateList4 == null) {
            colorStateList4 = AppCompatResources.getColorStateList(context1, color.material_slider_active_tick_marks_color);
        }
        this.setTickActiveTintList(colorStateList4);
        this.setThumbRadius(typedArray0.getDimensionPixelSize(styleable.Slider_thumbRadius, 0));
        this.setHaloRadius(typedArray0.getDimensionPixelSize(styleable.Slider_haloRadius, 0));
        this.setThumbElevation(typedArray0.getDimension(styleable.Slider_thumbElevation, 0.0f));
        this.setTrackHeight(typedArray0.getDimensionPixelSize(styleable.Slider_trackHeight, 0));
        this.setTickActiveRadius(typedArray0.getDimensionPixelSize(styleable.Slider_tickRadiusActive, 0));
        this.setTickInactiveRadius(typedArray0.getDimensionPixelSize(styleable.Slider_tickRadiusInactive, 0));
        this.setLabelBehavior(typedArray0.getInt(styleable.Slider_labelBehavior, 0));
        if(!typedArray0.getBoolean(styleable.Slider_android_enabled, true)) {
            this.setEnabled(false);
        }
        typedArray0.recycle();
        this.setFocusable(true);
        this.setClickable(true);
        materialShapeDrawable0.setShadowCompatibilityMode(2);
        this.q = ViewConfiguration.get(context1).getScaledTouchSlop();
        d d0 = new d(this);
        this.g = d0;
        ViewCompat.setAccessibilityDelegate(this, d0);
        this.h = (AccessibilityManager)this.getContext().getSystemService("accessibility");
    }

    public final void a(Drawable drawable0) {
        int v = this.C * 2;
        int v1 = drawable0.getIntrinsicWidth();
        int v2 = drawable0.getIntrinsicHeight();
        if(v1 == -1 && v2 == -1) {
            drawable0.setBounds(0, 0, v, v);
            return;
        }
        float f = ((float)v) / ((float)Math.max(v1, v2));
        drawable0.setBounds(0, 0, ((int)(((float)v1) * f)), ((int)(((float)v2) * f)));
    }

    public final int b() {
        return this.y / 2 + (this.z != 1 && this.z != 3 ? 0 : ((TooltipDrawable)this.k.get(0)).getIntrinsicHeight());
    }

    public final ValueAnimator c(boolean z) {
        TimeInterpolator timeInterpolator0;
        int v;
        float f = 1.0f;
        float f1 = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator0 = z ? this.p : this.o;
        if(valueAnimator0 != null && valueAnimator0.isRunning()) {
            f1 = (float)(((Float)valueAnimator0.getAnimatedValue()));
            valueAnimator0.cancel();
        }
        if(!z) {
            f = 0.0f;
        }
        ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{f1, f});
        if(z) {
            v = MotionUtils.resolveThemeDuration(this.getContext(), BaseSlider.k0, 83);
            timeInterpolator0 = MotionUtils.resolveThemeInterpolator(this.getContext(), BaseSlider.m0, AnimationUtils.DECELERATE_INTERPOLATOR);
        }
        else {
            v = MotionUtils.resolveThemeDuration(this.getContext(), BaseSlider.l0, 0x75);
            timeInterpolator0 = MotionUtils.resolveThemeInterpolator(this.getContext(), BaseSlider.n0, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        }
        valueAnimator1.setDuration(((long)v));
        valueAnimator1.setInterpolator(timeInterpolator0);
        valueAnimator1.addUpdateListener(new a(this));
        return valueAnimator1;
    }

    public final void d(Canvas canvas0, int v, int v1, float f, Drawable drawable0) {
        canvas0.save();
        canvas0.translate(((float)(this.B + ((int)(this.n(f) * ((float)v))))) - ((float)drawable0.getBounds().width()) / 2.0f, ((float)v1) - ((float)drawable0.getBounds().height()) / 2.0f);
        drawable0.draw(canvas0);
        canvas0.restore();
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent0) {
        return this.g.dispatchHoverEvent(motionEvent0) || super.dispatchHoverEvent(motionEvent0);
    }

    @Override  // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int v = this.g(this.d0);
        this.a.setColor(v);
        int v1 = this.g(this.c0);
        this.b.setColor(v1);
        int v2 = this.g(this.b0);
        this.e.setColor(v2);
        int v3 = this.g(this.a0);
        this.f.setColor(v3);
        for(Object object0: this.k) {
            TooltipDrawable tooltipDrawable0 = (TooltipDrawable)object0;
            if(tooltipDrawable0.isStateful()) {
                tooltipDrawable0.setState(this.getDrawableState());
            }
        }
        MaterialShapeDrawable materialShapeDrawable0 = this.e0;
        if(materialShapeDrawable0.isStateful()) {
            materialShapeDrawable0.setState(this.getDrawableState());
        }
        int v4 = this.g(this.W);
        this.d.setColor(v4);
        this.d.setAlpha(0x3F);
    }

    public final String e(float f) {
        if(this.hasLabelFormatter()) {
            return this.H.getFormattedValue(f);
        }
        return ((float)(((int)f))) == f ? String.format("%.0f", f) : String.format("%.2f", f);
    }

    public final float[] f() {
        float f = (float)(((Float)Collections.max(this.getValues())));
        float f1 = (float)(((Float)Collections.min(this.getValues())));
        if(this.L.size() == 1) {
            f1 = this.J;
        }
        float f2 = this.n(f1);
        float f3 = this.n(f);
        return this.j() ? new float[]{f3, f2} : new float[]{f2, f3};
    }

    public final int g(ColorStateList colorStateList0) {
        return colorStateList0.getColorForState(this.getDrawableState(), colorStateList0.getDefaultColor());
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.SeekBar";
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.g.getAccessibilityFocusedVirtualViewId();
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getValueFrom() {
        return this.J;
    }

    public float getValueTo() {
        return this.K;
    }

    @NonNull
    public List getValues() {
        return new ArrayList(this.L);
    }

    public final boolean h(float f) {
        double f1 = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.O)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double)Math.round(f1)) - f1) < 0.0001;
    }

    public boolean hasLabelFormatter() {
        return this.H != null;
    }

    public final boolean i(MotionEvent motionEvent0) {
        if(motionEvent0.getToolType(0) != 3) {
            for(ViewParent viewParent0 = this.getParent(); viewParent0 instanceof ViewGroup; viewParent0 = viewParent0.getParent()) {
                if((((ViewGroup)viewParent0).canScrollVertically(1) || ((ViewGroup)viewParent0).canScrollVertically(-1)) && ((ViewGroup)viewParent0).shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public final void k() {
        if(this.O <= 0.0f) {
            return;
        }
        this.w();
        int v = Math.min(((int)((this.K - this.J) / this.O + 1.0f)), this.T / (this.A * 2) + 1);
        if(this.P == null || this.P.length != v * 2) {
            this.P = new float[v * 2];
        }
        float f = ((float)this.T) / ((float)(v - 1));
        for(int v1 = 0; v1 < v * 2; v1 += 2) {
            float[] arr_f = this.P;
            arr_f[v1] = ((float)v1) / 2.0f * f + ((float)this.B);
            arr_f[v1 + 1] = (float)this.b();
        }
    }

    public final boolean l(int v) {
        int v1 = this.N;
        int v2 = (int)MathUtils.clamp(((long)v1) + ((long)v), 0L, this.L.size() - 1);
        this.N = v2;
        if(v2 == v1) {
            return false;
        }
        if(this.M != -1) {
            this.M = v2;
        }
        this.u();
        this.postInvalidate();
        return true;
    }

    public final void m(int v) {
        if(this.j()) {
            v = v == 0x80000000 ? 0x7FFFFFFF : -v;
        }
        this.l(v);
    }

    public final float n(float f) {
        float f1 = (f - this.J) / (this.K - this.J);
        return this.j() ? 1.0f - f1 : f1;
    }

    public final void o() {
        for(Object object0: this.m) {
            ((BaseOnSliderTouchListener)object0).onStartTrackingTouch(this);
        }
    }

    @Override  // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for(Object object0: this.k) {
            ((TooltipDrawable)object0).setRelativeToView(ViewUtils.getContentView(this));
        }
    }

    @Override  // android.view.View
    public void onDetachedFromWindow() {
        c c0 = this.i;
        if(c0 != null) {
            this.removeCallbacks(c0);
        }
        this.n = false;
        for(Object object0: this.k) {
            TooltipDrawable tooltipDrawable0 = (TooltipDrawable)object0;
            ViewOverlayImpl viewOverlayImpl0 = ViewUtils.getContentViewOverlay(this);
            if(viewOverlayImpl0 != null) {
                viewOverlayImpl0.remove(tooltipDrawable0);
                tooltipDrawable0.detachView(ViewUtils.getContentView(this));
            }
        }
        super.onDetachedFromWindow();
    }

    @Override  // android.view.View
    public void onDraw(@NonNull Canvas canvas0) {
        if(this.V) {
            this.w();
            this.k();
        }
        super.onDraw(canvas0);
        int v = this.b();
        int v1 = this.T;
        float[] arr_f = this.f();
        int v2 = this.B;
        float f = ((float)v2) + arr_f[1] * ((float)v1);
        float f1 = (float)(v2 + v1);
        Paint paint0 = this.a;
        if(Float.compare(f, f1) < 0) {
            canvas0.drawLine(f, ((float)v), f1, ((float)v), paint0);
        }
        float f2 = (float)this.B;
        float f3 = arr_f[0] * ((float)v1) + f2;
        if(f3 > f2) {
            canvas0.drawLine(f2, ((float)v), f3, ((float)v), paint0);
        }
        if(((float)(((Float)Collections.max(this.getValues())))) > this.J) {
            int v4 = this.T;
            float[] arr_f1 = this.f();
            float f4 = (float)this.B;
            canvas0.drawLine(arr_f1[0] * ((float)v4) + f4, ((float)v), arr_f1[1] * ((float)v4) + f4, ((float)v), this.b);
        }
        if(this.Q && this.O > 0.0f) {
            float[] arr_f2 = this.f();
            int v5 = Math.round(arr_f2[0] * ((float)(this.P.length / 2 - 1)));
            int v6 = Math.round(arr_f2[1] * ((float)(this.P.length / 2 - 1)));
            canvas0.drawPoints(this.P, 0, v5 * 2, this.e);
            canvas0.drawPoints(this.P, v5 * 2, v6 * 2 - v5 * 2, this.f);
            canvas0.drawPoints(this.P, v6 * 2, this.P.length - v6 * 2, this.e);
        }
        if((this.I || this.isFocused()) && this.isEnabled()) {
            int v7 = this.T;
            if(!(this.getBackground() instanceof RippleDrawable)) {
                float f5 = (float)this.B;
                int v8 = (int)(this.n(((float)(((Float)this.L.get(this.N))))) * ((float)v7) + f5);
                if(Build.VERSION.SDK_INT < 28) {
                    canvas0.clipRect(((float)(v8 - this.D)), ((float)(v - this.D)), ((float)(v8 + this.D)), ((float)(this.D + v)), Region.Op.UNION);
                }
                canvas0.drawCircle(((float)v8), ((float)v), ((float)this.D), this.d);
            }
        }
        if((this.M != -1 || this.z == 3) && this.isEnabled()) {
            if(this.z != 2) {
                if(!this.n) {
                    this.n = true;
                    ValueAnimator valueAnimator0 = this.c(true);
                    this.o = valueAnimator0;
                    this.p = null;
                    valueAnimator0.start();
                }
                ArrayList arrayList0 = this.k;
                Iterator iterator0 = arrayList0.iterator();
                for(int v9 = 0; v9 < this.L.size() && iterator0.hasNext(); ++v9) {
                    if(v9 != this.N) {
                        Object object0 = iterator0.next();
                        this.p(((TooltipDrawable)object0), ((float)(((Float)this.L.get(v9)))));
                    }
                }
                if(!iterator0.hasNext()) {
                    throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", arrayList0.size(), this.L.size()));
                }
                Object object1 = iterator0.next();
                this.p(((TooltipDrawable)object1), ((float)(((Float)this.L.get(this.N)))));
            }
        }
        else if(this.n) {
            this.n = false;
            ValueAnimator valueAnimator1 = this.c(false);
            this.p = valueAnimator1;
            this.o = null;
            valueAnimator1.addListener(new b(this));
            this.p.start();
        }
        int v10 = this.T;
        for(int v3 = 0; v3 < this.L.size(); ++v3) {
            float f6 = (float)(((Float)this.L.get(v3)));
            Drawable drawable0 = this.f0;
            if(drawable0 != null) {
                this.d(canvas0, v10, v, f6, drawable0);
            }
            else if(v3 < this.g0.size()) {
                this.d(canvas0, v10, v, f6, ((Drawable)this.g0.get(v3)));
            }
            else {
                if(!this.isEnabled()) {
                    float f7 = (float)this.B;
                    canvas0.drawCircle(this.n(f6) * ((float)v10) + f7, ((float)v), ((float)this.C), this.c);
                }
                this.d(canvas0, v10, v, f6, this.e0);
            }
        }
    }

    @Override  // android.view.View
    public void onFocusChanged(boolean z, int v, @Nullable Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        d d0 = this.g;
        if(!z) {
            this.M = -1;
            d0.clearKeyboardFocusForVirtualView(this.N);
            return;
        }
        switch(v) {
            case 1: {
                this.l(0x7FFFFFFF);
                break;
            }
            case 2: {
                this.l(0x80000000);
                break;
            }
            case 17: {
                this.m(0x7FFFFFFF);
                break;
            }
            case 66: {
                this.m(0x80000000);
            }
        }
        d0.requestKeyboardFocusForVirtualView(this.N);
    }

    @Override  // android.view.View
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(!this.isEnabled()) {
            return super.onKeyDown(v, keyEvent0);
        }
        if(this.L.size() == 1) {
            this.M = 0;
        }
        Boolean boolean0 = null;
        if(this.M == -1) {
            switch(v) {
                case 21: {
                    this.m(-1);
                    return true;
                }
                case 22: {
                    this.m(1);
                    return true;
                }
                case 61: {
                    if(keyEvent0.hasNoModifiers()) {
                        boolean0 = Boolean.valueOf(this.l(1));
                        return boolean0 == null ? super.onKeyDown(61, keyEvent0) : boolean0.booleanValue();
                    }
                    boolean0 = keyEvent0.isShiftPressed() ? Boolean.valueOf(this.l(-1)) : Boolean.FALSE;
                    return boolean0 == null ? super.onKeyDown(61, keyEvent0) : boolean0.booleanValue();
                }
                case 23: 
                case 66: {
                    this.M = this.N;
                    this.postInvalidate();
                    return true;
                }
                case 69: {
                    this.l(-1);
                    return true;
                }
                case 70: 
                case 81: {
                    this.l(1);
                    return true;
                }
                default: {
                    return super.onKeyDown(v, keyEvent0);
                }
            }
        }
        int v1 = this.U | keyEvent0.isLongPress();
        this.U = v1;
        float f = 1.0f;
        if(v1 == 0) {
            float f3 = this.O;
            if(f3 != 0.0f) {
                f = f3;
            }
        }
        else {
            float f1 = this.O;
            if(f1 != 0.0f) {
                f = f1;
            }
            float f2 = (this.K - this.J) / f;
            if(f2 > 20.0f) {
                f *= (float)Math.round(f2 / 20.0f);
            }
        }
        if(v == 21) {
            if(!this.j()) {
                f = -f;
            }
            boolean0 = f;
        }
        else {
            switch(v) {
                case 22: {
                    if(this.j()) {
                        f = -f;
                    }
                    boolean0 = f;
                    break;
                }
                case 69: {
                    boolean0 = (float)(-f);
                    break;
                }
                case 70: 
                case 81: {
                    boolean0 = f;
                }
            }
        }
        if(boolean0 != null) {
            if(this.r(((float)(((Float)boolean0))) + ((float)(((Float)this.L.get(this.M)))), this.M)) {
                this.u();
                this.postInvalidate();
            }
            return true;
        }
        switch(v) {
            case 61: {
                if(keyEvent0.hasNoModifiers()) {
                    return this.l(1);
                }
                return keyEvent0.isShiftPressed() ? this.l(-1) : false;
            }
            case 23: 
            case 66: {
                this.M = -1;
                this.postInvalidate();
                return true;
            }
            default: {
                return super.onKeyDown(v, keyEvent0);
            }
        }
    }

    @Override  // android.view.View
    public boolean onKeyUp(int v, KeyEvent keyEvent0) {
        this.U = false;
        return super.onKeyUp(v, keyEvent0);
    }

    @Override  // android.view.View
    public void onMeasure(int v, int v1) {
        super.onMeasure(v, View.MeasureSpec.makeMeasureSpec(this.y + (this.z != 1 && this.z != 3 ? 0 : ((TooltipDrawable)this.k.get(0)).getIntrinsicHeight()), 0x40000000));
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        super.onRestoreInstanceState(((e)parcelable0).getSuperState());
        this.J = ((e)parcelable0).a;
        this.K = ((e)parcelable0).b;
        this.q(((e)parcelable0).c);
        this.O = ((e)parcelable0).d;
        if(((e)parcelable0).e) {
            this.requestFocus();
        }
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new e(super.onSaveInstanceState());  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.a = this.J;
        parcelable0.b = this.K;
        parcelable0.c = new ArrayList(this.L);
        parcelable0.d = this.O;
        parcelable0.e = this.hasFocus();
        return parcelable0;
    }

    @Override  // android.view.View
    public void onSizeChanged(int v, int v1, int v2, int v3) {
        this.T = Math.max(v - this.B * 2, 0);
        this.k();
        this.u();
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        if(!this.isEnabled()) {
            return false;
        }
        float f = motionEvent0.getX();
        this.h0 = Math.min(1.0f, Math.max(0.0f, (f - ((float)this.B)) / ((float)this.T)));
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.F = f;
            if(!this.i(motionEvent0)) {
                this.getParent().requestDisallowInterceptTouchEvent(true);
                if(this.pickActiveThumb()) {
                    this.requestFocus();
                    this.I = true;
                    this.s();
                    this.u();
                    this.invalidate();
                    this.o();
                }
            }
        }
        else {
            int v1 = this.q;
            switch(v) {
                case 2: {
                    if(!this.I) {
                        if(this.i(motionEvent0) && Math.abs(f - this.F) < ((float)v1)) {
                            return false;
                        }
                        this.getParent().requestDisallowInterceptTouchEvent(true);
                        this.o();
                    }
                    if(this.pickActiveThumb()) {
                        this.I = true;
                        this.s();
                        this.u();
                        this.invalidate();
                    }
                    break;
                }
                case 1: 
                case 3: {
                    this.I = false;
                    if(this.G != null && this.G.getActionMasked() == 0 && Math.abs(this.G.getX() - motionEvent0.getX()) <= ((float)v1) && Math.abs(this.G.getY() - motionEvent0.getY()) <= ((float)v1) && this.pickActiveThumb()) {
                        this.o();
                    }
                    if(this.M != -1) {
                        this.s();
                        this.u();
                        this.M = -1;
                        for(Object object0: this.m) {
                            ((BaseOnSliderTouchListener)object0).onStopTrackingTouch(this);
                        }
                    }
                    this.invalidate();
                }
            }
        }
        this.setPressed(this.I);
        this.G = MotionEvent.obtain(motionEvent0);
        return true;
    }

    @Override  // android.view.View
    public void onVisibilityChanged(@NonNull View view0, int v) {
        super.onVisibilityChanged(view0, v);
        if(v != 0) {
            ViewOverlayImpl viewOverlayImpl0 = ViewUtils.getContentViewOverlay(this);
            if(viewOverlayImpl0 == null) {
                return;
            }
            for(Object object0: this.k) {
                viewOverlayImpl0.remove(((TooltipDrawable)object0));
            }
        }
    }

    public final void p(TooltipDrawable tooltipDrawable0, float f) {
        tooltipDrawable0.setText(this.e(f));
        int v = this.B + ((int)(this.n(f) * ((float)this.T))) - tooltipDrawable0.getIntrinsicWidth() / 2;
        int v1 = this.b() - (this.E + this.C);
        tooltipDrawable0.setBounds(v, v1 - tooltipDrawable0.getIntrinsicHeight(), tooltipDrawable0.getIntrinsicWidth() + v, v1);
        Rect rect0 = new Rect(tooltipDrawable0.getBounds());
        DescendantOffsetUtils.offsetDescendantRect(ViewUtils.getContentView(this), this, rect0);
        tooltipDrawable0.setBounds(rect0);
        ViewUtils.getContentViewOverlay(this).add(tooltipDrawable0);
    }

    public boolean pickActiveThumb() {
        boolean z;
        if(this.M != -1) {
            return true;
        }
        float f = this.h0;
        f = this.j() ? 1.0f - f : this.h0;
        float f1 = (this.K - this.J) * f + this.J;
        float f2 = this.n(f1) * ((float)this.T) + ((float)this.B);
        this.M = 0;
        float f3 = Math.abs(((float)(((Float)this.L.get(0)))) - f1);
        for(int v = 1; v < this.L.size(); ++v) {
            float f4 = Math.abs(((float)(((Float)this.L.get(v)))) - f1);
            float f5 = this.n(((float)(((Float)this.L.get(v))))) * ((float)this.T) + ((float)this.B);
            if(Float.compare(f4, f3) > 1) {
                break;
            }
            if(!this.j()) {
                if(f5 - f2 < 0.0f) {
                    z = true;
                }
            }
            else if(f5 - f2 > 0.0f) {
                z = true;
            }
            else {
                z = false;
            }
            if(Float.compare(f4, f3) < 0) {
                this.M = v;
                f3 = f4;
            }
            else if(Float.compare(f4, f3) == 0) {
                if(Math.abs(f5 - f2) < ((float)this.q)) {
                    this.M = -1;
                    return false;
                }
                if(z) {
                    this.M = v;
                    f3 = f4;
                }
            }
        }
        return this.M != -1;
    }

    public final void q(ArrayList arrayList0) {
        if(arrayList0.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList0);
        if(this.L.size() == arrayList0.size() && this.L.equals(arrayList0)) {
            return;
        }
        this.L = arrayList0;
        int v = 1;
        this.V = true;
        this.N = 0;
        this.u();
        ArrayList arrayList1 = this.k;
        if(arrayList1.size() > this.L.size()) {
            List list0 = arrayList1.subList(this.L.size(), arrayList1.size());
            for(Object object0: list0) {
                TooltipDrawable tooltipDrawable0 = (TooltipDrawable)object0;
                if(ViewCompat.isAttachedToWindow(this)) {
                    ViewOverlayImpl viewOverlayImpl0 = ViewUtils.getContentViewOverlay(this);
                    if(viewOverlayImpl0 != null) {
                        viewOverlayImpl0.remove(tooltipDrawable0);
                        tooltipDrawable0.detachView(ViewUtils.getContentView(this));
                    }
                }
            }
            list0.clear();
        }
        while(arrayList1.size() < this.L.size()) {
            TooltipDrawable tooltipDrawable1 = TooltipDrawable.createFromAttributes(this.getContext(), null, 0, this.j);
            arrayList1.add(tooltipDrawable1);
            if(ViewCompat.isAttachedToWindow(this)) {
                tooltipDrawable1.setRelativeToView(ViewUtils.getContentView(this));
            }
        }
        if(arrayList1.size() == 1) {
            v = 0;
        }
        for(Object object1: arrayList1) {
            ((TooltipDrawable)object1).setStrokeWidth(((float)v));
        }
        for(Object object2: this.l) {
            BaseOnChangeListener baseOnChangeListener0 = (BaseOnChangeListener)object2;
            for(Object object3: this.L) {
                baseOnChangeListener0.onValueChange(this, ((float)(((Float)object3))), false);
            }
        }
        this.postInvalidate();
    }

    public final boolean r(float f, int v) {
        this.N = v;
        if(((double)Math.abs(f - ((float)(((Float)this.L.get(v)))))) < 0.0001) {
            return false;
        }
        float f1 = this.getMinSeparation();
        if(this.i0 == 0) {
            f1 = f1 == 0.0f ? 0.0f : q.a(this.J, this.K, (f1 - ((float)this.B)) / ((float)this.T), this.J);
        }
        if(this.j()) {
            f1 = -f1;
        }
        float f2 = v + 1 < this.L.size() ? ((float)(((Float)this.L.get(v + 1)))) - f1 : this.K;
        float f3 = v - 1 >= 0 ? f1 + ((float)(((Float)this.L.get(v - 1)))) : this.J;
        this.L.set(v, MathUtils.clamp(f, f3, f2));
        for(Object object0: this.l) {
            ((BaseOnChangeListener)object0).onValueChange(this, ((float)(((Float)this.L.get(v)))), true);
        }
        if(this.h != null && this.h.isEnabled()) {
            c c0 = this.i;
            if(c0 == null) {
                this.i = new c(this);
            }
            else {
                this.removeCallbacks(c0);
            }
            this.i.a = v;
            this.postDelayed(this.i, 200L);
        }
        return true;
    }

    public final void s() {
        double f2;
        float f = this.h0;
        float f1 = this.O;
        if(f1 > 0.0f) {
            int v = (int)((this.K - this.J) / f1);
            f2 = ((double)Math.round(f * ((float)v))) / ((double)v);
        }
        else {
            f2 = (double)f;
        }
        if(this.j()) {
            f2 = 1.0 - f2;
        }
        this.r(((float)(f2 * ((double)(this.K - this.J)) + ((double)this.J))), this.M);
    }

    public void setActiveThumbIndex(int v) {
        this.M = v;
    }

    public void setCustomThumbDrawable(Drawable drawable0) {
        Drawable drawable1 = drawable0.mutate().getConstantState().newDrawable();
        this.a(drawable1);
        this.f0 = drawable1;
        this.g0.clear();
        this.postInvalidate();
    }

    public void setCustomThumbDrawablesForValues(@DrawableRes @NonNull int[] arr_v) {
        Drawable[] arr_drawable = new Drawable[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_drawable[v] = this.getResources().getDrawable(arr_v[v]);
        }
        this.setCustomThumbDrawablesForValues(arr_drawable);
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable[] arr_drawable) {
        this.f0 = null;
        this.g0 = new ArrayList();
        for(int v = 0; v < arr_drawable.length; ++v) {
            List list0 = this.g0;
            Drawable drawable0 = arr_drawable[v].mutate().getConstantState().newDrawable();
            this.a(drawable0);
            list0.add(drawable0);
        }
        this.postInvalidate();
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.setLayerType((z ? 0 : 2), null);
    }

    public void setFocusedThumbIndex(int v) {
        if(v < 0 || v >= this.L.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.N = v;
        this.g.requestKeyboardFocusForVirtualView(v);
        this.postInvalidate();
    }

    public void setHaloRadius(int v) {
        if(v == this.D) {
            return;
        }
        this.D = v;
        Drawable drawable0 = this.getBackground();
        if(this.getBackground() instanceof RippleDrawable && drawable0 instanceof RippleDrawable) {
            DrawableUtils.setRippleDrawableRadius(((RippleDrawable)drawable0), this.D);
            return;
        }
        this.postInvalidate();
    }

    public void setHaloTintList(ColorStateList colorStateList0) {
        if(colorStateList0.equals(this.W)) {
            return;
        }
        this.W = colorStateList0;
        Drawable drawable0 = this.getBackground();
        if(this.getBackground() instanceof RippleDrawable && drawable0 instanceof RippleDrawable) {
            ((RippleDrawable)drawable0).setColor(colorStateList0);
            return;
        }
        int v = this.g(colorStateList0);
        this.d.setColor(v);
        this.d.setAlpha(0x3F);
        this.invalidate();
    }

    public void setLabelBehavior(int v) {
        if(this.z != v) {
            this.z = v;
            this.requestLayout();
        }
    }

    public void setSeparationUnit(int v) {
        this.i0 = v;
        this.V = true;
        this.postInvalidate();
    }

    public void setStepSize(float f) {
        if(f >= 0.0f) {
            if(this.O != f) {
                this.O = f;
                this.V = true;
                this.postInvalidate();
            }
            return;
        }
        float f1 = this.J;
        float f2 = this.K;
        StringBuilder stringBuilder0 = new StringBuilder("The stepSize(");
        stringBuilder0.append(f);
        stringBuilder0.append(") must be 0, or a factor of the valueFrom(");
        stringBuilder0.append(f1);
        stringBuilder0.append(")-valueTo(");
        throw new IllegalArgumentException(androidx.room.a.h(f2, ") range", stringBuilder0));
    }

    public void setThumbElevation(float f) {
        this.e0.setElevation(f);
    }

    public void setThumbRadius(int v) {
        if(v == this.C) {
            return;
        }
        this.C = v;
        ShapeAppearanceModel shapeAppearanceModel0 = ShapeAppearanceModel.builder().setAllCorners(0, ((float)this.C)).build();
        this.e0.setShapeAppearanceModel(shapeAppearanceModel0);
        this.e0.setBounds(0, 0, this.C * 2, this.C * 2);
        Drawable drawable0 = this.f0;
        if(drawable0 != null) {
            this.a(drawable0);
        }
        for(Object object0: this.g0) {
            this.a(((Drawable)object0));
        }
        this.v();
    }

    public void setThumbStrokeColor(ColorStateList colorStateList0) {
        this.e0.setStrokeColor(colorStateList0);
        this.postInvalidate();
    }

    public void setThumbStrokeWidth(float f) {
        this.e0.setStrokeWidth(f);
        this.postInvalidate();
    }

    public void setTickActiveRadius(int v) {
        if(this.R != v) {
            this.R = v;
            this.f.setStrokeWidth(((float)(v * 2)));
            this.v();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList0) {
        if(colorStateList0.equals(this.a0)) {
            return;
        }
        this.a0 = colorStateList0;
        int v = this.g(colorStateList0);
        this.f.setColor(v);
        this.invalidate();
    }

    public void setTickInactiveRadius(int v) {
        if(this.S != v) {
            this.S = v;
            this.e.setStrokeWidth(((float)(v * 2)));
            this.v();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList0) {
        if(colorStateList0.equals(this.b0)) {
            return;
        }
        this.b0 = colorStateList0;
        int v = this.g(colorStateList0);
        this.e.setColor(v);
        this.invalidate();
    }

    public void setTrackActiveTintList(ColorStateList colorStateList0) {
        if(colorStateList0.equals(this.c0)) {
            return;
        }
        this.c0 = colorStateList0;
        int v = this.g(colorStateList0);
        this.b.setColor(v);
        this.invalidate();
    }

    public void setTrackHeight(int v) {
        if(this.A != v) {
            this.A = v;
            this.a.setStrokeWidth(((float)v));
            this.b.setStrokeWidth(((float)this.A));
            this.v();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList0) {
        if(colorStateList0.equals(this.d0)) {
            return;
        }
        this.d0 = colorStateList0;
        int v = this.g(colorStateList0);
        this.a.setColor(v);
        this.invalidate();
    }

    public void setValues(@NonNull List list0) {
        this.q(new ArrayList(list0));
    }

    public void setValues(@NonNull Float[] arr_float) {
        ArrayList arrayList0 = new ArrayList();
        Collections.addAll(arrayList0, arr_float);
        this.q(arrayList0);
    }

    public final void t(int v, Rect rect0) {
        int v1 = this.B + ((int)(this.n(((float)(((Float)this.getValues().get(v))))) * ((float)this.T)));
        int v2 = this.b();
        int v3 = this.C;
        int v4 = this.w;
        if(v3 <= v4) {
            v3 = v4;
        }
        rect0.set(v1 - v3 / 2, v2 - v3 / 2, v1 + v3 / 2, v2 + v3 / 2);
    }

    public final void u() {
        if(this.getBackground() instanceof RippleDrawable && this.getMeasuredWidth() > 0) {
            Drawable drawable0 = this.getBackground();
            if(drawable0 instanceof RippleDrawable) {
                int v = (int)(this.n(((float)(((Float)this.L.get(this.N))))) * ((float)this.T) + ((float)this.B));
                int v1 = this.b();
                DrawableCompat.setHotspotBounds(drawable0, v - this.D, v1 - this.D, v + this.D, v1 + this.D);
            }
        }
    }

    public final void v() {
        boolean z1;
        int v = this.getPaddingTop();
        int v1 = this.getPaddingBottom();
        int v2 = this.A + (v1 + v);
        int v3 = this.C * 2;
        int v4 = this.getPaddingTop();
        int v5 = Math.max(v2, this.getPaddingBottom() + (v4 + v3));
        int v6 = Math.max(this.x, v5);
        boolean z = false;
        if(v6 == this.y) {
            z1 = false;
        }
        else {
            this.y = v6;
            z1 = true;
        }
        int v7 = Math.max(Math.max(Math.max(this.C - this.s, 0), Math.max((this.A - this.t) / 2, 0)), Math.max(Math.max(this.R - this.u, 0), Math.max(this.S - this.v, 0))) + this.r;
        if(this.B != v7) {
            this.B = v7;
            if(ViewCompat.isLaidOut(this)) {
                this.T = Math.max(this.getWidth() - this.B * 2, 0);
                this.k();
            }
            z = true;
        }
        if(z1) {
            this.requestLayout();
            return;
        }
        if(z) {
            this.postInvalidate();
        }
    }

    public final void w() {
        if(this.V) {
            float f = this.J;
            float f1 = this.K;
            if(Float.compare(f, f1) >= 0) {
                throw new IllegalStateException("valueFrom(" + this.J + ") must be smaller than valueTo(" + this.K + ")");
            }
            if(f1 <= f) {
                throw new IllegalStateException("valueTo(" + this.K + ") must be greater than valueFrom(" + this.J + ")");
            }
            if(this.O > 0.0f && !this.h(f1 - f)) {
                float f2 = this.O;
                float f3 = this.J;
                float f4 = this.K;
                StringBuilder stringBuilder0 = new StringBuilder("The stepSize(");
                stringBuilder0.append(f2);
                stringBuilder0.append(") must be 0, or a factor of the valueFrom(");
                stringBuilder0.append(f3);
                stringBuilder0.append(")-valueTo(");
                throw new IllegalStateException(androidx.room.a.h(f4, ") range", stringBuilder0));
            }
            for(Object object0: this.L) {
                Float float0 = (Float)object0;
                if(((float)float0) >= this.J && ((float)float0) <= this.K) {
                    if(this.O > 0.0f && !this.h(((float)float0) - this.J)) {
                        throw new IllegalStateException("Value(" + float0 + ") must be equal to valueFrom(" + this.J + ") plus a multiple of stepSize(" + this.O + ") when using stepSize(" + this.O + ")");
                    }
                    continue;
                }
                float f5 = this.J;
                float f6 = this.K;
                StringBuilder stringBuilder1 = new StringBuilder("Slider value(");
                stringBuilder1.append(float0);
                stringBuilder1.append(") must be greater or equal to valueFrom(");
                stringBuilder1.append(f5);
                stringBuilder1.append("), and lower or equal to valueTo(");
                throw new IllegalStateException(androidx.room.a.h(f6, ")", stringBuilder1));
            }
            float f7 = this.getMinSeparation();
            if(Float.compare(f7, 0.0f) < 0) {
                throw new IllegalStateException("minSeparation(" + f7 + ") must be greater or equal to 0");
            }
            float f8 = this.O;
            if(f8 > 0.0f && f7 > 0.0f) {
                if(this.i0 != 1) {
                    throw new IllegalStateException("minSeparation(" + f7 + ") cannot be set as a dimension when using stepSize(" + this.O + ")");
                }
                if(f7 < f8 || !this.h(f7)) {
                    float f9 = this.O;
                    StringBuilder stringBuilder2 = new StringBuilder("minSeparation(");
                    stringBuilder2.append(f7);
                    stringBuilder2.append(") must be greater or equal and a multiple of stepSize(");
                    stringBuilder2.append(f9);
                    stringBuilder2.append(") when using stepSize(");
                    throw new IllegalStateException(androidx.room.a.h(f9, ")", stringBuilder2));
                }
            }
            float f10 = this.O;
            if(f10 != 0.0f) {
                if(Float.compare(((int)f10), f10) != 0) {
                    Log.w("BaseSlider", "Floating point value used for stepSize(" + f10 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f11 = this.J;
                if(((float)(((int)f11))) != f11) {
                    Log.w("BaseSlider", "Floating point value used for valueFrom(" + f11 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f12 = this.K;
                if(((float)(((int)f12))) != f12) {
                    Log.w("BaseSlider", "Floating point value used for valueTo(" + f12 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.V = false;
        }
    }
}

