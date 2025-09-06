package s7;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.id;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.motion.e;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.CutCornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel.Builder;
import com.google.android.material.shape.ShapeAppearanceModel;

public final class b {
    public static final ColorDrawable A;
    public final MaterialCardView a;
    public final Rect b;
    public final MaterialShapeDrawable c;
    public final MaterialShapeDrawable d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Drawable i;
    public Drawable j;
    public ColorStateList k;
    public ColorStateList l;
    public ShapeAppearanceModel m;
    public ColorStateList n;
    public Drawable o;
    public LayerDrawable p;
    public MaterialShapeDrawable q;
    public MaterialShapeDrawable r;
    public boolean s;
    public boolean t;
    public ValueAnimator u;
    public final TimeInterpolator v;
    public final int w;
    public final int x;
    public float y;
    public static final double z;

    static {
        b.z = 0.707107;
        b.A = Build.VERSION.SDK_INT > 28 ? null : new ColorDrawable();
    }

    public b(MaterialCardView materialCardView0, AttributeSet attributeSet0, int v, int v1) {
        this.b = new Rect();
        this.s = false;
        this.y = 0.0f;
        this.a = materialCardView0;
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(materialCardView0.getContext(), attributeSet0, v, v1);
        this.c = materialShapeDrawable0;
        materialShapeDrawable0.initializeElevationOverlay(materialCardView0.getContext());
        materialShapeDrawable0.setShadowColor(-12303292);
        Builder shapeAppearanceModel$Builder0 = materialShapeDrawable0.getShapeAppearanceModel().toBuilder();
        TypedArray typedArray0 = materialCardView0.getContext().obtainStyledAttributes(attributeSet0, styleable.CardView, v, style.CardView);
        if(typedArray0.hasValue(styleable.CardView_cardCornerRadius)) {
            shapeAppearanceModel$Builder0.setAllCornerSizes(typedArray0.getDimension(styleable.CardView_cardCornerRadius, 0.0f));
        }
        this.d = new MaterialShapeDrawable();
        this.h(shapeAppearanceModel$Builder0.build());
        this.v = MotionUtils.resolveThemeInterpolator(materialCardView0.getContext(), attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR);
        this.w = MotionUtils.resolveThemeDuration(materialCardView0.getContext(), attr.motionDurationShort2, 300);
        this.x = MotionUtils.resolveThemeDuration(materialCardView0.getContext(), attr.motionDurationShort1, 300);
        typedArray0.recycle();
    }

    public final float a() {
        return Math.max(Math.max(b.b(this.m.getTopLeftCorner(), this.c.getTopLeftCornerResolvedSize()), b.b(this.m.getTopRightCorner(), this.c.getTopRightCornerResolvedSize())), Math.max(b.b(this.m.getBottomRightCorner(), this.c.getBottomRightCornerResolvedSize()), b.b(this.m.getBottomLeftCorner(), this.c.getBottomLeftCornerResolvedSize())));
    }

    public static float b(CornerTreatment cornerTreatment0, float f) {
        if(cornerTreatment0 instanceof RoundedCornerTreatment) {
            return (float)((1.0 - b.z) * ((double)f));
        }
        return cornerTreatment0 instanceof CutCornerTreatment ? f / 2.0f : 0.0f;
    }

    public final LayerDrawable c() {
        RippleDrawable rippleDrawable0;
        if(this.o == null) {
            if(RippleUtils.USE_FRAMEWORK_RIPPLE) {
                this.r = new MaterialShapeDrawable(this.m);
                rippleDrawable0 = new RippleDrawable(this.k, null, this.r);
            }
            else {
                rippleDrawable0 = new StateListDrawable();
                MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(this.m);
                this.q = materialShapeDrawable0;
                materialShapeDrawable0.setFillColor(this.k);
                ((StateListDrawable)rippleDrawable0).addState(new int[]{0x10100A7}, this.q);
            }
            this.o = rippleDrawable0;
        }
        if(this.p == null) {
            LayerDrawable layerDrawable0 = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable0;
            layerDrawable0.setId(2, id.mtrl_card_checked_layer_id);
        }
        return this.p;
    }

    public final a d(Drawable drawable0) {
        MaterialCardView materialCardView0 = this.a;
        if(materialCardView0.getUseCompatPadding()) {
            float f = 0.0f;
            int v = (int)Math.ceil(materialCardView0.getMaxCardElevation() * 1.5f + (this.i() ? this.a() : 0.0f));
            float f1 = materialCardView0.getMaxCardElevation();
            if(this.i()) {
                f = this.a();
            }
            int v1 = (int)Math.ceil(f1 + f);
            return new a(drawable0, v1, v, v1, v);  // 初始化器: Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V
        }
        return new a(drawable0, 0, 0, 0, 0);  // 初始化器: Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V
    }

    public final void e(int v, int v1) {
        int v9;
        int v8;
        int v3;
        int v2;
        if(this.p != null) {
            MaterialCardView materialCardView0 = this.a;
            if(materialCardView0.getUseCompatPadding()) {
                float f = 0.0f;
                v2 = (int)Math.ceil((materialCardView0.getMaxCardElevation() * 1.5f + (this.i() ? this.a() : 0.0f)) * 2.0f);
                float f1 = materialCardView0.getMaxCardElevation();
                if(this.i()) {
                    f = this.a();
                }
                v3 = (int)Math.ceil((f1 + f) * 2.0f);
            }
            else {
                v2 = 0;
                v3 = 0;
            }
            int v4 = (this.g & 0x800005) == 0x800005 ? v - this.e - this.f - v3 : this.e;
            int v5 = (this.g & 80) == 80 ? this.e : v1 - this.e - this.f - v2;
            int v6 = (this.g & 0x800005) == 0x800005 ? this.e : v - this.e - this.f - v3;
            int v7 = (this.g & 80) == 80 ? v1 - this.e - this.f - v2 : this.e;
            if(ViewCompat.getLayoutDirection(materialCardView0) == 1) {
                v8 = v6;
                v9 = v4;
            }
            else {
                v9 = v6;
                v8 = v4;
            }
            this.p.setLayerInset(2, v8, v7, v9, v5);
        }
    }

    public final void f(boolean z, boolean z1) {
        float f = 0.0f;
        int v = 0;
        Drawable drawable0 = this.j;
        if(drawable0 != null) {
            if(z1) {
                if(z) {
                    f = 1.0f;
                }
                float f1 = z ? 1.0f - this.y : this.y;
                ValueAnimator valueAnimator0 = this.u;
                if(valueAnimator0 != null) {
                    valueAnimator0.cancel();
                    this.u = null;
                }
                ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[]{this.y, f});
                this.u = valueAnimator1;
                valueAnimator1.addUpdateListener(new e(this, 5));
                this.u.setInterpolator(this.v);
                this.u.setDuration(((long)(((float)(z ? this.w : this.x)) * f1)));
                this.u.start();
                return;
            }
            if(z) {
                v = 0xFF;
            }
            drawable0.setAlpha(v);
            if(z) {
                f = 1.0f;
            }
            this.y = f;
        }
    }

    public final void g(Drawable drawable0) {
        if(drawable0 == null) {
            this.j = b.A;
        }
        else {
            Drawable drawable1 = drawable0.mutate();
            this.j = drawable1;
            DrawableCompat.setTintList(drawable1, this.l);
            this.f(this.a.isChecked(), false);
        }
        LayerDrawable layerDrawable0 = this.p;
        if(layerDrawable0 != null) {
            layerDrawable0.setDrawableByLayerId(id.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(ShapeAppearanceModel shapeAppearanceModel0) {
        this.m = shapeAppearanceModel0;
        this.c.setShapeAppearanceModel(shapeAppearanceModel0);
        boolean z = this.c.isRoundRect();
        this.c.setShadowBitmapDrawingEnable(!z);
        MaterialShapeDrawable materialShapeDrawable0 = this.d;
        if(materialShapeDrawable0 != null) {
            materialShapeDrawable0.setShapeAppearanceModel(shapeAppearanceModel0);
        }
        MaterialShapeDrawable materialShapeDrawable1 = this.r;
        if(materialShapeDrawable1 != null) {
            materialShapeDrawable1.setShapeAppearanceModel(shapeAppearanceModel0);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.q;
        if(materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearanceModel(shapeAppearanceModel0);
        }
    }

    // 去混淆评级： 低(30)
    public final boolean i() {
        return this.a.getPreventCornerOverlap() && this.c.isRoundRect() && this.a.getUseCompatPadding();
    }

    public final boolean j() {
        View view0 = this.a;
        if(view0.isClickable()) {
            return true;
        }
        while(view0.isDuplicateParentStateEnabled() && view0.getParent() instanceof View) {
            view0 = (View)view0.getParent();
        }
        return view0.isClickable();
    }

    public final void k() {
        Drawable drawable0 = this.i;
        LayerDrawable layerDrawable0 = this.j() ? this.c() : this.d;
        this.i = layerDrawable0;
        if(drawable0 != layerDrawable0) {
            MaterialCardView materialCardView0 = this.a;
            if(materialCardView0.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable)materialCardView0.getForeground()).setDrawable(layerDrawable0);
                return;
            }
            materialCardView0.setForeground(this.d(layerDrawable0));
        }
    }

    public final void l() {
        MaterialCardView materialCardView0 = this.a;
        float f = 0.0f;
        float f1 = materialCardView0.getPreventCornerOverlap() && !this.c.isRoundRect() || this.i() ? this.a() : 0.0f;
        if(materialCardView0.getPreventCornerOverlap() && materialCardView0.getUseCompatPadding()) {
            double f2 = (double)materialCardView0.getCardViewRadius();
            f = (float)((1.0 - b.z) * f2);
        }
        int v = (int)(f1 - f);
        materialCardView0.e(this.b.left + v, this.b.top + v, this.b.right + v, this.b.bottom + v);
    }

    public final void m() {
        MaterialCardView materialCardView0 = this.a;
        if(!this.s) {
            materialCardView0.setBackgroundInternal(this.d(this.c));
        }
        materialCardView0.setForeground(this.d(this.i));
    }
}

