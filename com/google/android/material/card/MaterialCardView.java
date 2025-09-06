package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import s7.b;

public class MaterialCardView extends CardView implements Checkable, Shapeable {
    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedIconGravity {
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialCardView arg1, boolean arg2);
    }

    public static final int CHECKED_ICON_GRAVITY_BOTTOM_END = 0x800055;
    public static final int CHECKED_ICON_GRAVITY_BOTTOM_START = 0x800053;
    public static final int CHECKED_ICON_GRAVITY_TOP_END = 0x800035;
    public static final int CHECKED_ICON_GRAVITY_TOP_START = 0x800033;
    public final b j;
    public final boolean k;
    public boolean l;
    public boolean m;
    public OnCheckedChangeListener n;
    public static final int[] o;
    public static final int[] p;
    public static final int[] q;
    public static final int r;

    static {
        MaterialCardView.o = new int[]{0x101009F};
        MaterialCardView.p = new int[]{0x10100A0};
        MaterialCardView.q = new int[]{attr.state_dragged};
        MaterialCardView.r = style.Widget_MaterialComponents_CardView;
    }

    public MaterialCardView(Context context0) {
        this(context0, null);
    }

    public MaterialCardView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context0, AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, MaterialCardView.r), attributeSet0, v);
        this.l = false;
        this.m = false;
        this.k = true;
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(this.getContext(), attributeSet0, styleable.MaterialCardView, v, MaterialCardView.r, new int[0]);
        b b0 = new b(this, attributeSet0, v, MaterialCardView.r);
        this.j = b0;
        ColorStateList colorStateList0 = super.getCardBackgroundColor();
        MaterialShapeDrawable materialShapeDrawable0 = b0.c;
        materialShapeDrawable0.setFillColor(colorStateList0);
        int v1 = super.getContentPaddingLeft();
        int v2 = super.getContentPaddingTop();
        int v3 = super.getContentPaddingRight();
        int v4 = super.getContentPaddingBottom();
        b0.b.set(v1, v2, v3, v4);
        b0.l();
        MaterialCardView materialCardView0 = b0.a;
        ColorStateList colorStateList1 = MaterialResources.getColorStateList(materialCardView0.getContext(), typedArray0, styleable.MaterialCardView_strokeColor);
        b0.n = colorStateList1;
        if(colorStateList1 == null) {
            b0.n = ColorStateList.valueOf(-1);
        }
        b0.h = typedArray0.getDimensionPixelSize(styleable.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray0.getBoolean(styleable.MaterialCardView_android_checkable, false);
        b0.t = z;
        materialCardView0.setLongClickable(z);
        b0.l = MaterialResources.getColorStateList(materialCardView0.getContext(), typedArray0, styleable.MaterialCardView_checkedIconTint);
        b0.g(MaterialResources.getDrawable(materialCardView0.getContext(), typedArray0, styleable.MaterialCardView_checkedIcon));
        b0.f = typedArray0.getDimensionPixelSize(styleable.MaterialCardView_checkedIconSize, 0);
        b0.e = typedArray0.getDimensionPixelSize(styleable.MaterialCardView_checkedIconMargin, 0);
        b0.g = typedArray0.getInteger(styleable.MaterialCardView_checkedIconGravity, 0x800035);
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(materialCardView0.getContext(), typedArray0, styleable.MaterialCardView_rippleColor);
        b0.k = colorStateList2;
        if(colorStateList2 == null) {
            b0.k = ColorStateList.valueOf(MaterialColors.getColor(materialCardView0, attr.colorControlHighlight));
        }
        ColorStateList colorStateList3 = MaterialResources.getColorStateList(materialCardView0.getContext(), typedArray0, styleable.MaterialCardView_cardForegroundColor);
        MaterialShapeDrawable materialShapeDrawable1 = b0.d;
        if(colorStateList3 == null) {
            colorStateList3 = ColorStateList.valueOf(0);
        }
        materialShapeDrawable1.setFillColor(colorStateList3);
        if(RippleUtils.USE_FRAMEWORK_RIPPLE) {
            Drawable drawable0 = b0.o;
            if(drawable0 != null) {
                ((RippleDrawable)drawable0).setColor(b0.k);
                goto label_47;
            }
            goto label_44;
        }
        else {
        label_44:
            MaterialShapeDrawable materialShapeDrawable2 = b0.q;
            if(materialShapeDrawable2 != null) {
                materialShapeDrawable2.setFillColor(b0.k);
            }
        }
    label_47:
        materialShapeDrawable0.setElevation(materialCardView0.getCardElevation());
        materialShapeDrawable1.setStroke(((float)b0.h), b0.n);
        materialCardView0.setBackgroundInternal(b0.d(materialShapeDrawable0));
        if(b0.j()) {
            materialShapeDrawable1 = b0.c();
        }
        b0.i = materialShapeDrawable1;
        materialCardView0.setForeground(b0.d(materialShapeDrawable1));
        typedArray0.recycle();
    }

    public final void d() {
        if(Build.VERSION.SDK_INT > 26) {
            b b0 = this.j;
            Drawable drawable0 = b0.o;
            if(drawable0 != null) {
                Rect rect0 = drawable0.getBounds();
                int v = rect0.bottom;
                b0.o.setBounds(rect0.left, rect0.top, rect0.right, v - 1);
                b0.o.setBounds(rect0.left, rect0.top, rect0.right, v);
            }
        }
    }

    public final void e(int v, int v1, int v2, int v3) {
        super.setContentPadding(v, v1, v2, v3);
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF0 = new RectF();
        rectF0.set(this.j.c.getBounds());
        return rectF0;
    }

    @Override  // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.j.c.getFillColor();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.j.d.getFillColor();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.j.j;
    }

    public int getCheckedIconGravity() {
        return this.j.g;
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.j.e;
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.j.f;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.j.l;
    }

    @Override  // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.j.b.bottom;
    }

    @Override  // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.j.b.left;
    }

    @Override  // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.j.b.right;
    }

    @Override  // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.j.b.top;
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float getProgress() {
        return this.j.c.getInterpolation();
    }

    @Override  // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.j.c.getTopLeftCornerResolvedSize();
    }

    public ColorStateList getRippleColor() {
        return this.j.k;
    }

    @Override  // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.j.m;
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList0 = this.j.n;
        return colorStateList0 == null ? -1 : colorStateList0.getDefaultColor();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.j.n;
    }

    @Dimension
    public int getStrokeWidth() {
        return this.j.h;
    }

    public boolean isCheckable() {
        return this.j != null && this.j.t;
    }

    @Override  // android.widget.Checkable
    public boolean isChecked() {
        return this.l;
    }

    public boolean isDragged() {
        return this.m;
    }

    @Override  // android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j.k();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.j.c);
    }

    @Override  // android.view.ViewGroup
    public int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 3);
        if(this.isCheckable()) {
            View.mergeDrawableStates(arr_v, MaterialCardView.o);
        }
        if(this.isChecked()) {
            View.mergeDrawableStates(arr_v, MaterialCardView.p);
        }
        if(this.isDragged()) {
            View.mergeDrawableStates(arr_v, MaterialCardView.q);
        }
        return arr_v;
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent0.setChecked(this.isChecked());
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo0.setCheckable(this.isCheckable());
        accessibilityNodeInfo0.setClickable(this.isClickable());
        accessibilityNodeInfo0.setChecked(this.isChecked());
    }

    @Override  // androidx.cardview.widget.CardView
    public void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = this.getMeasuredWidth();
        int v3 = this.getMeasuredHeight();
        this.j.e(v2, v3);
    }

    @Override  // android.view.View
    public void setBackground(Drawable drawable0) {
        this.setBackgroundDrawable(drawable0);
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        if(this.k) {
            b b0 = this.j;
            if(!b0.s) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                b0.s = true;
            }
            super.setBackgroundDrawable(drawable0);
        }
    }

    public void setBackgroundInternal(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
    }

    @Override  // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int v) {
        ColorStateList colorStateList0 = ColorStateList.valueOf(v);
        this.j.c.setFillColor(colorStateList0);
    }

    @Override  // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList0) {
        this.j.c.setFillColor(colorStateList0);
    }

    @Override  // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        float f1 = this.j.a.getCardElevation();
        this.j.c.setElevation(f1);
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList0) {
        MaterialShapeDrawable materialShapeDrawable0 = this.j.d;
        if(colorStateList0 == null) {
            colorStateList0 = ColorStateList.valueOf(0);
        }
        materialShapeDrawable0.setFillColor(colorStateList0);
    }

    public void setCheckable(boolean z) {
        this.j.t = z;
    }

    @Override  // android.widget.Checkable
    public void setChecked(boolean z) {
        if(this.l != z) {
            this.toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable0) {
        this.j.g(drawable0);
    }

    public void setCheckedIconGravity(int v) {
        b b0 = this.j;
        if(b0.g != v) {
            b0.g = v;
            b0.e(b0.a.getMeasuredWidth(), b0.a.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(@Dimension int v) {
        this.j.e = v;
    }

    public void setCheckedIconMarginResource(@DimenRes int v) {
        if(v != -1) {
            this.j.e = this.getResources().getDimensionPixelSize(v);
        }
    }

    public void setCheckedIconResource(@DrawableRes int v) {
        Drawable drawable0 = AppCompatResources.getDrawable(this.getContext(), v);
        this.j.g(drawable0);
    }

    public void setCheckedIconSize(@Dimension int v) {
        this.j.f = v;
    }

    public void setCheckedIconSizeResource(@DimenRes int v) {
        if(v != 0) {
            this.j.f = this.getResources().getDimensionPixelSize(v);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList0) {
        this.j.l = colorStateList0;
        Drawable drawable0 = this.j.j;
        if(drawable0 != null) {
            DrawableCompat.setTintList(drawable0, colorStateList0);
        }
    }

    @Override  // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        b b0 = this.j;
        if(b0 != null) {
            b0.k();
        }
    }

    @Override  // androidx.cardview.widget.CardView
    public void setContentPadding(int v, int v1, int v2, int v3) {
        this.j.b.set(v, v1, v2, v3);
        this.j.l();
    }

    public void setDragged(boolean z) {
        if(this.m != z) {
            this.m = z;
            this.refreshDrawableState();
            this.d();
            this.invalidate();
        }
    }

    @Override  // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.j.m();
    }

    public void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener materialCardView$OnCheckedChangeListener0) {
        this.n = materialCardView$OnCheckedChangeListener0;
    }

    @Override  // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.j.m();
        this.j.l();
    }

    public void setProgress(@FloatRange(from = 0.0, to = 1.0) float f) {
        b b0 = this.j;
        b0.c.setInterpolation(f);
        MaterialShapeDrawable materialShapeDrawable0 = b0.d;
        if(materialShapeDrawable0 != null) {
            materialShapeDrawable0.setInterpolation(f);
        }
        MaterialShapeDrawable materialShapeDrawable1 = b0.r;
        if(materialShapeDrawable1 != null) {
            materialShapeDrawable1.setInterpolation(f);
        }
    }

    @Override  // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        b b0 = this.j;
        b0.h(b0.m.withCornerSize(f));
        b0.i.invalidateSelf();
        if(b0.i() || b0.a.getPreventCornerOverlap() && !b0.c.isRoundRect()) {
            b0.l();
        }
        if(b0.i()) {
            b0.m();
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList0) {
        b b0 = this.j;
        b0.k = colorStateList0;
        if(RippleUtils.USE_FRAMEWORK_RIPPLE) {
            Drawable drawable0 = b0.o;
            if(drawable0 != null) {
                ((RippleDrawable)drawable0).setColor(colorStateList0);
                return;
            }
        }
        MaterialShapeDrawable materialShapeDrawable0 = b0.q;
        if(materialShapeDrawable0 != null) {
            materialShapeDrawable0.setFillColor(colorStateList0);
        }
    }

    public void setRippleColorResource(@ColorRes int v) {
        ColorStateList colorStateList0 = AppCompatResources.getColorStateList(this.getContext(), v);
        b b0 = this.j;
        b0.k = colorStateList0;
        if(RippleUtils.USE_FRAMEWORK_RIPPLE) {
            Drawable drawable0 = b0.o;
            if(drawable0 != null) {
                ((RippleDrawable)drawable0).setColor(colorStateList0);
                return;
            }
        }
        MaterialShapeDrawable materialShapeDrawable0 = b0.q;
        if(materialShapeDrawable0 != null) {
            materialShapeDrawable0.setFillColor(colorStateList0);
        }
    }

    @Override  // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel0) {
        this.setClipToOutline(shapeAppearanceModel0.isRoundRect(this.getBoundsAsRectF()));
        this.j.h(shapeAppearanceModel0);
    }

    public void setStrokeColor(@ColorInt int v) {
        this.setStrokeColor(ColorStateList.valueOf(v));
    }

    public void setStrokeColor(ColorStateList colorStateList0) {
        b b0 = this.j;
        if(b0.n != colorStateList0) {
            b0.n = colorStateList0;
            b0.d.setStroke(((float)b0.h), colorStateList0);
        }
        this.invalidate();
    }

    public void setStrokeWidth(@Dimension int v) {
        b b0 = this.j;
        if(v != b0.h) {
            b0.h = v;
            b0.d.setStroke(((float)v), b0.n);
        }
        this.invalidate();
    }

    @Override  // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.j.m();
        this.j.l();
    }

    @Override  // android.widget.Checkable
    public void toggle() {
        if(this.isCheckable() && this.isEnabled()) {
            this.l = !this.l;
            this.refreshDrawableState();
            this.d();
            this.j.f(this.l, true);
            OnCheckedChangeListener materialCardView$OnCheckedChangeListener0 = this.n;
            if(materialCardView$OnCheckedChangeListener0 != null) {
                materialCardView$OnCheckedChangeListener0.onCheckedChanged(this, this.l);
            }
        }
    }
}

