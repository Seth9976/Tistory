package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView.BufferType;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.j;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import jb.m;
import u7.a;
import u7.b;

public class Chip extends AppCompatCheckBox implements Delegate, MaterialCheckable, Shapeable {
    public static final int[] A;
    public ChipDrawable e;
    public InsetDrawable f;
    public RippleDrawable g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;
    public OnCheckedChangeListener j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public CharSequence r;
    public final b s;
    public boolean t;
    public final Rect u;
    public final RectF v;
    public final a w;
    public static final int x;
    public static final Rect y;
    public static final int[] z;

    static {
        Chip.x = style.Widget_MaterialComponents_Chip_Action;
        Chip.y = new Rect();
        Chip.z = new int[]{0x10100A1};
        Chip.A = new int[]{0x101009F};
    }

    public Chip(Context context0) {
        this(context0, null);
    }

    public Chip(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.chipStyle);
    }

    public Chip(Context context0, AttributeSet attributeSet0, int v) {
        int v1 = Chip.x;
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, v1), attributeSet0, v);
        this.u = new Rect();
        this.v = new RectF();
        this.w = new a(this);
        Context context1 = this.getContext();
        if(attributeSet0 != null) {
            if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if(attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null || attributeSet0.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if(!attributeSet0.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if(attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 0x800013) != 0x800013) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        ChipDrawable chipDrawable0 = ChipDrawable.createFromAttributes(context1, attributeSet0, v, v1);
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.Chip, v, v1, new int[0]);
        this.o = typedArray0.getBoolean(styleable.Chip_ensureMinTouchTargetSize, false);
        float f = (float)Math.ceil(ViewUtils.dpToPx(this.getContext(), 0x30));
        this.q = (int)Math.ceil(typedArray0.getDimension(styleable.Chip_chipMinTouchTargetSize, f));
        typedArray0.recycle();
        this.setChipDrawable(chipDrawable0);
        chipDrawable0.setElevation(ViewCompat.getElevation(this));
        TypedArray typedArray1 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.Chip, v, v1, new int[0]);
        boolean z = typedArray1.hasValue(styleable.Chip_shapeAppearance);
        typedArray1.recycle();
        this.s = new b(this, this);
        this.d();
        if(!z) {
            this.setOutlineProvider(new j(this, 2));
        }
        this.setChecked(this.k);
        this.setText(chipDrawable0.getText());
        this.setEllipsize(chipDrawable0.getEllipsize());
        this.h();
        if(!this.e.E0) {
            this.setLines(1);
            this.setHorizontallyScrolling(true);
        }
        this.setGravity(0x800013);
        this.g();
        if(this.shouldEnsureMinTouchTargetSize()) {
            this.setMinHeight(this.q);
        }
        this.p = ViewCompat.getLayoutDirection(this);
        super.setOnCheckedChangeListener(new m(this, 1));
    }

    public final boolean c() {
        return this.e != null && this.e.getCloseIcon() != null;
    }

    public final void d() {
        if(this.c() && this.isCloseIconVisible() && this.h != null) {
            ViewCompat.setAccessibilityDelegate(this, this.s);
            this.t = true;
            return;
        }
        ViewCompat.setAccessibilityDelegate(this, null);
        this.t = false;
    }

    // 去混淆评级： 低(30)
    @Override  // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent0) {
        return this.t ? this.s.dispatchHoverEvent(motionEvent0) || super.dispatchHoverEvent(motionEvent0) : super.dispatchHoverEvent(motionEvent0);
    }

    @Override  // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        if(!this.t) {
            return super.dispatchKeyEvent(keyEvent0);
        }
        return !this.s.dispatchKeyEvent(keyEvent0) || this.s.getKeyboardFocusedVirtualViewId() == 0x80000000 ? super.dispatchKeyEvent(keyEvent0) : true;
    }

    @Override  // androidx.appcompat.widget.AppCompatCheckBox
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int v = 0;
        if(this.e != null && this.e.isCloseIconStateful()) {
            ChipDrawable chipDrawable0 = this.e;
            int v1 = this.isEnabled();
            if(this.n) {
                ++v1;
            }
            if(this.m) {
                ++v1;
            }
            if(this.l) {
                ++v1;
            }
            if(this.isChecked()) {
                ++v1;
            }
            int[] arr_v = new int[v1];
            if(this.isEnabled()) {
                arr_v[0] = 0x101009E;
                v = 1;
            }
            if(this.n) {
                arr_v[v] = 0x101009C;
                ++v;
            }
            if(this.m) {
                arr_v[v] = 0x1010367;
                ++v;
            }
            if(this.l) {
                arr_v[v] = 0x10100A7;
                ++v;
            }
            if(this.isChecked()) {
                arr_v[v] = 0x10100A1;
            }
            v = chipDrawable0.setCloseIconState(arr_v);
        }
        if(v != 0) {
            this.invalidate();
        }
    }

    public final void e() {
        if(RippleUtils.USE_FRAMEWORK_RIPPLE) {
            this.f();
            return;
        }
        this.e.setUseCompatRipple(true);
        ViewCompat.setBackground(this, this.getBackgroundDrawable());
        this.g();
        if(this.getBackgroundDrawable() == this.f && this.e.getCallback() == null) {
            this.e.setCallback(this.f);
        }
    }

    public boolean ensureAccessibleTouchTarget(@Dimension int v) {
        this.q = v;
        int v1 = 0;
        if(!this.shouldEnsureMinTouchTargetSize()) {
            if(this.f != null) {
                this.f = null;
                this.setMinWidth(0);
                this.setMinHeight(((int)this.getChipMinHeight()));
                this.e();
                return false;
            }
            this.e();
            return false;
        }
        int v2 = Math.max(0, v - this.e.getIntrinsicHeight());
        int v3 = Math.max(0, v - this.e.getIntrinsicWidth());
        if(v3 <= 0 && v2 <= 0) {
            if(this.f != null) {
                this.f = null;
                this.setMinWidth(0);
                this.setMinHeight(((int)this.getChipMinHeight()));
                this.e();
                return false;
            }
            this.e();
            return false;
        }
        int v4 = v3 <= 0 ? 0 : v3 / 2;
        if(v2 > 0) {
            v1 = v2 / 2;
        }
        if(this.f != null) {
            Rect rect0 = new Rect();
            this.f.getPadding(rect0);
            if(rect0.top == v1 && rect0.bottom == v1 && rect0.left == v4 && rect0.right == v4) {
                this.e();
                return true;
            }
        }
        if(this.getMinHeight() != v) {
            this.setMinHeight(v);
        }
        if(this.getMinWidth() != v) {
            this.setMinWidth(v);
        }
        this.f = new InsetDrawable(this.e, v4, v1, v4, v1);
        this.e();
        return true;
    }

    public final void f() {
        this.g = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.e.getRippleColor()), this.getBackgroundDrawable(), null);
        this.e.setUseCompatRipple(false);
        ViewCompat.setBackground(this, this.g);
        this.g();
    }

    public final void g() {
        if(!TextUtils.isEmpty(this.getText())) {
            ChipDrawable chipDrawable0 = this.e;
            if(chipDrawable0 != null) {
                int v = (int)(this.e.l() + (this.e.getTextEndPadding() + chipDrawable0.getChipEndPadding()));
                float f = this.e.getChipStartPadding();
                float f1 = this.e.getTextStartPadding();
                int v1 = (int)(this.e.k() + (f1 + f));
                if(this.f != null) {
                    Rect rect0 = new Rect();
                    this.f.getPadding(rect0);
                    v1 += rect0.left;
                    v += rect0.right;
                }
                ViewCompat.setPaddingRelative(this, v1, this.getPaddingTop(), v, this.getPaddingBottom());
            }
        }
    }

    @Override  // android.widget.CheckBox
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if(!TextUtils.isEmpty(this.r)) {
            return this.r;
        }
        if(this.isCheckable()) {
            ViewParent viewParent0 = this.getParent();
            return !(viewParent0 instanceof ChipGroup) || !((ChipGroup)viewParent0).isSingleSelection() ? "android.widget.Button" : "android.widget.RadioButton";
        }
        return this.isClickable() ? "android.widget.Button" : "android.view.View";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        Drawable drawable0 = this.f;
        return drawable0 == null ? this.e : drawable0;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.e == null ? null : this.e.getCheckedIcon();
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.e == null ? null : this.e.getCheckedIconTint();
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        return this.e == null ? null : this.e.getChipBackgroundColor();
    }

    public float getChipCornerRadius() {
        return this.e == null ? 0.0f : Math.max(0.0f, this.e.getChipCornerRadius());
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        return this.e == null ? 0.0f : this.e.getChipEndPadding();
    }

    @Nullable
    public Drawable getChipIcon() {
        return this.e == null ? null : this.e.getChipIcon();
    }

    public float getChipIconSize() {
        return this.e == null ? 0.0f : this.e.getChipIconSize();
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        return this.e == null ? null : this.e.getChipIconTint();
    }

    public float getChipMinHeight() {
        return this.e == null ? 0.0f : this.e.getChipMinHeight();
    }

    public float getChipStartPadding() {
        return this.e == null ? 0.0f : this.e.getChipStartPadding();
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        return this.e == null ? null : this.e.getChipStrokeColor();
    }

    public float getChipStrokeWidth() {
        return this.e == null ? 0.0f : this.e.getChipStrokeWidth();
    }

    @Deprecated
    public CharSequence getChipText() {
        return this.getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        return this.e == null ? null : this.e.getCloseIcon();
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        return this.e == null ? null : this.e.getCloseIconContentDescription();
    }

    public float getCloseIconEndPadding() {
        return this.e == null ? 0.0f : this.e.getCloseIconEndPadding();
    }

    public float getCloseIconSize() {
        return this.e == null ? 0.0f : this.e.getCloseIconSize();
    }

    public float getCloseIconStartPadding() {
        return this.e == null ? 0.0f : this.e.getCloseIconStartPadding();
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        return this.e == null ? null : this.e.getCloseIconTint();
    }

    @NonNull
    private RectF getCloseIconTouchBounds() {
        RectF rectF0 = this.v;
        rectF0.setEmpty();
        if(this.c() && this.h != null) {
            this.e.getCloseIconTouchBounds(rectF0);
        }
        return rectF0;
    }

    @NonNull
    private Rect getCloseIconTouchBoundsInt() {
        RectF rectF0 = this.getCloseIconTouchBounds();
        this.u.set(((int)rectF0.left), ((int)rectF0.top), ((int)rectF0.right), ((int)rectF0.bottom));
        return this.u;
    }

    @Override  // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        return this.e == null ? null : this.e.getEllipsize();
    }

    @Override  // android.widget.TextView
    public void getFocusedRect(@NonNull Rect rect0) {
        if(this.t && (this.s.getKeyboardFocusedVirtualViewId() == 1 || this.s.getAccessibilityFocusedVirtualViewId() == 1)) {
            rect0.set(this.getCloseIconTouchBoundsInt());
            return;
        }
        super.getFocusedRect(rect0);
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.e == null ? null : this.e.getHideMotionSpec();
    }

    public float getIconEndPadding() {
        return this.e == null ? 0.0f : this.e.getIconEndPadding();
    }

    public float getIconStartPadding() {
        return this.e == null ? 0.0f : this.e.getIconStartPadding();
    }

    @Nullable
    public ColorStateList getRippleColor() {
        return this.e == null ? null : this.e.getRippleColor();
    }

    @Override  // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.e.getShapeAppearanceModel();
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.e == null ? null : this.e.getShowMotionSpec();
    }

    @Nullable
    private TextAppearance getTextAppearance() {
        return this.e == null ? null : this.e.getTextAppearance();
    }

    public float getTextEndPadding() {
        return this.e == null ? 0.0f : this.e.getTextEndPadding();
    }

    public float getTextStartPadding() {
        return this.e == null ? 0.0f : this.e.getTextStartPadding();
    }

    public final void h() {
        TextPaint textPaint0 = this.getPaint();
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            textPaint0.drawableState = chipDrawable0.getState();
        }
        TextAppearance textAppearance0 = this.getTextAppearance();
        if(textAppearance0 != null) {
            textAppearance0.updateDrawState(this.getContext(), textPaint0, this.w);
        }
    }

    public boolean isCheckable() {
        return this.e != null && this.e.isCheckable();
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return this.isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.e != null && this.e.isCheckedIconVisible();
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return this.isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.e != null && this.e.isChipIconVisible();
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return this.isCloseIconVisible();
    }

    public boolean isCloseIconVisible() {
        return this.e != null && this.e.isCloseIconVisible();
    }

    @Override  // android.widget.TextView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.e);
    }

    @Override  // com.google.android.material.chip.ChipDrawable$Delegate
    public void onChipDrawableSizeChange() {
        this.ensureAccessibleTouchTarget(this.q);
        this.requestLayout();
        this.invalidateOutline();
    }

    @Override  // android.widget.CompoundButton
    public int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 2);
        if(this.isChecked()) {
            View.mergeDrawableStates(arr_v, Chip.z);
        }
        if(this.isCheckable()) {
            View.mergeDrawableStates(arr_v, Chip.A);
        }
        return arr_v;
    }

    @Override  // android.widget.TextView
    public void onFocusChanged(boolean z, int v, Rect rect0) {
        super.onFocusChanged(z, v, rect0);
        if(this.t) {
            this.s.onFocusChanged(z, v, rect0);
        }
    }

    @Override  // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent0) {
        switch(motionEvent0.getActionMasked()) {
            case 7: {
                this.setCloseIconHovered(this.getCloseIconTouchBounds().contains(motionEvent0.getX(), motionEvent0.getY()));
                return super.onHoverEvent(motionEvent0);
            }
            case 10: {
                this.setCloseIconHovered(false);
                return super.onHoverEvent(motionEvent0);
            }
            default: {
                return super.onHoverEvent(motionEvent0);
            }
        }
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName(this.getAccessibilityClassName());
        accessibilityNodeInfo0.setCheckable(this.isCheckable());
        accessibilityNodeInfo0.setClickable(this.isClickable());
        if(this.getParent() instanceof ChipGroup) {
            ChipGroup chipGroup0 = (ChipGroup)this.getParent();
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0 = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo0);
            int v = -1;
            if(chipGroup0.isSingleLine()) {
                int v2 = 0;
                for(int v1 = 0; v1 < chipGroup0.getChildCount(); ++v1) {
                    View view0 = chipGroup0.getChildAt(v1);
                    if(view0 instanceof Chip && chipGroup0.getChildAt(v1).getVisibility() == 0) {
                        if(((Chip)view0) == this) {
                            v = v2;
                            break;
                        }
                        ++v2;
                    }
                }
            }
            accessibilityNodeInfoCompat0.setCollectionItemInfo(CollectionItemInfoCompat.obtain(chipGroup0.getRowIndex(this), 1, v, 1, false, this.isChecked()));
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.Button
    @TargetApi(24)
    @Nullable
    public PointerIcon onResolvePointerIcon(@NonNull MotionEvent motionEvent0, int v) {
        return !this.getCloseIconTouchBounds().contains(motionEvent0.getX(), motionEvent0.getY()) || !this.isEnabled() ? super.onResolvePointerIcon(motionEvent0, v) : PointerIcon.getSystemIcon(this.getContext(), 1002);
    }

    @Override  // android.widget.TextView
    @TargetApi(17)
    public void onRtlPropertiesChanged(int v) {
        super.onRtlPropertiesChanged(v);
        if(this.p != v) {
            this.p = v;
            this.g();
        }
    }

    @Override  // android.widget.TextView
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent0) {
        boolean z1;
        int v = motionEvent0.getActionMasked();
        boolean z = this.getCloseIconTouchBounds().contains(motionEvent0.getX(), motionEvent0.getY());
        switch(v) {
            case 0: {
                if(!z) {
                    return super.onTouchEvent(motionEvent0);
                }
                this.setCloseIconPressed(true);
                return true;
            }
            case 1: {
                if(this.l) {
                    this.performCloseIconClick();
                    z1 = true;
                }
                else {
                    z1 = false;
                }
                break;
            }
            case 2: {
                if(this.l) {
                    if(!z) {
                        this.setCloseIconPressed(false);
                    }
                    return true;
                }
                return super.onTouchEvent(motionEvent0);
            }
            case 3: {
                z1 = false;
                break;
            }
            default: {
                return super.onTouchEvent(motionEvent0);
            }
        }
        this.setCloseIconPressed(false);
        return z1 || super.onTouchEvent(motionEvent0);
    }

    @CallSuper
    public boolean performCloseIconClick() {
        boolean z = false;
        this.playSoundEffect(0);
        View.OnClickListener view$OnClickListener0 = this.h;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(this);
            z = true;
        }
        if(this.t) {
            this.s.sendEventForVirtualView(1, 1);
        }
        return z;
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence0) {
        this.r = charSequence0;
    }

    @Override  // android.view.View
    public void setBackground(Drawable drawable0) {
        if(drawable0 != this.getBackgroundDrawable() && drawable0 != this.g) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            return;
        }
        super.setBackground(drawable0);
    }

    @Override  // android.view.View
    public void setBackgroundColor(int v) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override  // androidx.appcompat.widget.AppCompatCheckBox
    public void setBackgroundDrawable(Drawable drawable0) {
        if(drawable0 != this.getBackgroundDrawable() && drawable0 != this.g) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
            return;
        }
        super.setBackgroundDrawable(drawable0);
    }

    @Override  // androidx.appcompat.widget.AppCompatCheckBox
    public void setBackgroundResource(int v) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override  // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override  // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCheckable(z);
        }
    }

    public void setCheckableResource(@BoolRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCheckableResource(v);
        }
    }

    @Override  // android.widget.Checkable, android.widget.CompoundButton
    public void setChecked(boolean z) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 == null) {
            this.k = z;
            return;
        }
        if(chipDrawable0.isCheckable()) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable0) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCheckedIcon(drawable0);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        this.setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int v) {
        this.setCheckedIconVisible(v);
    }

    public void setCheckedIconResource(@DrawableRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCheckedIconResource(v);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList0) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCheckedIconTint(colorStateList0);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCheckedIconTintResource(v);
        }
    }

    public void setCheckedIconVisible(@BoolRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCheckedIconVisible(v);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCheckedIconVisible(z);
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList0) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipBackgroundColor(colorStateList0);
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipBackgroundColorResource(v);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipCornerRadius(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipCornerRadiusResource(v);
        }
    }

    public void setChipDrawable(@NonNull ChipDrawable chipDrawable0) {
        ChipDrawable chipDrawable1 = this.e;
        if(chipDrawable1 != chipDrawable0) {
            if(chipDrawable1 != null) {
                chipDrawable1.setDelegate(null);
            }
            this.e = chipDrawable0;
            chipDrawable0.E0 = false;
            chipDrawable0.setDelegate(this);
            this.ensureAccessibleTouchTarget(this.q);
        }
    }

    public void setChipEndPadding(float f) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipEndPadding(f);
        }
    }

    public void setChipEndPaddingResource(@DimenRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipEndPaddingResource(v);
        }
    }

    public void setChipIcon(@Nullable Drawable drawable0) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipIcon(drawable0);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        this.setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int v) {
        this.setChipIconVisible(v);
    }

    public void setChipIconResource(@DrawableRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipIconResource(v);
        }
    }

    public void setChipIconSize(float f) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipIconSize(f);
        }
    }

    public void setChipIconSizeResource(@DimenRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipIconSizeResource(v);
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList0) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipIconTint(colorStateList0);
        }
    }

    public void setChipIconTintResource(@ColorRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipIconTintResource(v);
        }
    }

    public void setChipIconVisible(@BoolRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipIconVisible(v);
        }
    }

    public void setChipIconVisible(boolean z) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipIconVisible(z);
        }
    }

    public void setChipMinHeight(float f) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipMinHeight(f);
        }
    }

    public void setChipMinHeightResource(@DimenRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipMinHeightResource(v);
        }
    }

    public void setChipStartPadding(float f) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipStartPadding(f);
        }
    }

    public void setChipStartPaddingResource(@DimenRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipStartPaddingResource(v);
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList0) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipStrokeColor(colorStateList0);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipStrokeColorResource(v);
        }
    }

    public void setChipStrokeWidth(float f) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipStrokeWidth(f);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setChipStrokeWidthResource(v);
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence0) {
        this.setText(charSequence0);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int v) {
        this.setText(this.getResources().getString(v));
    }

    public void setCloseIcon(@Nullable Drawable drawable0) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCloseIcon(drawable0);
        }
        this.d();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence0) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCloseIconContentDescription(charSequence0);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        this.setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int v) {
        this.setCloseIconVisible(v);
    }

    public void setCloseIconEndPadding(float f) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCloseIconEndPadding(f);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCloseIconEndPaddingResource(v);
        }
    }

    private void setCloseIconHovered(boolean z) {
        if(this.m != z) {
            this.m = z;
            this.refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if(this.l != z) {
            this.l = z;
            this.refreshDrawableState();
        }
    }

    public void setCloseIconResource(@DrawableRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCloseIconResource(v);
        }
        this.d();
    }

    public void setCloseIconSize(float f) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCloseIconSize(f);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCloseIconSizeResource(v);
        }
    }

    public void setCloseIconStartPadding(float f) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCloseIconStartPadding(f);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCloseIconStartPaddingResource(v);
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList0) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCloseIconTint(colorStateList0);
        }
    }

    public void setCloseIconTintResource(@ColorRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCloseIconTintResource(v);
        }
    }

    public void setCloseIconVisible(@BoolRes int v) {
        this.setCloseIconVisible(this.getResources().getBoolean(v));
    }

    public void setCloseIconVisible(boolean z) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setCloseIconVisible(z);
        }
        this.d();
    }

    @Override  // androidx.appcompat.widget.AppCompatCheckBox
    public void setCompoundDrawables(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(null, drawable1, null, drawable3);
    }

    @Override  // androidx.appcompat.widget.AppCompatCheckBox
    @RequiresApi(17)
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(null, drawable1, null, drawable3);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        if(v != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(v2 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, v1, 0, v3);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(null, drawable1, null, drawable3);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        if(v != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if(v2 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(0, v1, 0, v3);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        if(drawable0 != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if(drawable2 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(null, drawable1, null, drawable3);
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setElevation(f);
        }
    }

    @Override  // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt textUtils$TruncateAt0) {
        if(this.e == null) {
            return;
        }
        if(textUtils$TruncateAt0 == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(textUtils$TruncateAt0);
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setEllipsize(textUtils$TruncateAt0);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.o = z;
        this.ensureAccessibleTouchTarget(this.q);
    }

    @Override  // android.widget.TextView
    public void setGravity(int v) {
        if(v != 0x800013) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
            return;
        }
        super.setGravity(0x800013);
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec0) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setHideMotionSpec(motionSpec0);
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setHideMotionSpecResource(v);
        }
    }

    public void setIconEndPadding(float f) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setIconEndPadding(f);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setIconEndPaddingResource(v);
        }
    }

    public void setIconStartPadding(float f) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setIconStartPadding(f);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setIconStartPaddingResource(v);
        }
    }

    @Override  // com.google.android.material.internal.MaterialCheckable
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@Nullable OnCheckedChangeListener materialCheckable$OnCheckedChangeListener0) {
        this.j = materialCheckable$OnCheckedChangeListener0;
    }

    @Override  // android.view.View
    public void setLayoutDirection(int v) {
        if(this.e == null) {
            return;
        }
        super.setLayoutDirection(v);
    }

    @Override  // android.widget.TextView
    public void setLines(int v) {
        if(v > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(v);
    }

    @Override  // android.widget.TextView
    public void setMaxLines(int v) {
        if(v > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(v);
    }

    @Override  // android.widget.TextView
    public void setMaxWidth(@Px int v) {
        super.setMaxWidth(v);
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setMaxWidth(v);
        }
    }

    @Override  // android.widget.TextView
    public void setMinLines(int v) {
        if(v > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(v);
    }

    @Override  // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener compoundButton$OnCheckedChangeListener0) {
        this.i = compoundButton$OnCheckedChangeListener0;
    }

    public void setOnCloseIconClickListener(View.OnClickListener view$OnClickListener0) {
        this.h = view$OnClickListener0;
        this.d();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList0) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setRippleColor(colorStateList0);
        }
        if(!this.e.getUseCompatRipple()) {
            this.f();
        }
    }

    public void setRippleColorResource(@ColorRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setRippleColorResource(v);
            if(!this.e.getUseCompatRipple()) {
                this.f();
            }
        }
    }

    @Override  // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel0) {
        this.e.setShapeAppearanceModel(shapeAppearanceModel0);
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec0) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setShowMotionSpec(motionSpec0);
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setShowMotionSpecResource(v);
        }
    }

    @Override  // android.widget.TextView
    public void setSingleLine(boolean z) {
        if(!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(true);
    }

    @Override  // android.widget.TextView
    public void setText(CharSequence charSequence0, TextView.BufferType textView$BufferType0) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 == null) {
            return;
        }
        if(charSequence0 == null) {
            charSequence0 = "";
        }
        super.setText((chipDrawable0.E0 ? null : charSequence0), textView$BufferType0);
        ChipDrawable chipDrawable1 = this.e;
        if(chipDrawable1 != null) {
            chipDrawable1.setText(charSequence0);
        }
    }

    @Override  // android.widget.TextView
    public void setTextAppearance(int v) {
        super.setTextAppearance(v);
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setTextAppearanceResource(v);
        }
        this.h();
    }

    @Override  // android.widget.TextView
    public void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setTextAppearanceResource(v);
        }
        this.h();
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance0) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setTextAppearance(textAppearance0);
        }
        this.h();
    }

    public void setTextAppearanceResource(@StyleRes int v) {
        this.setTextAppearance(this.getContext(), v);
    }

    public void setTextEndPadding(float f) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setTextEndPadding(f);
        }
    }

    public void setTextEndPaddingResource(@DimenRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setTextEndPaddingResource(v);
        }
    }

    @Override  // android.widget.TextView
    public void setTextSize(int v, float f) {
        super.setTextSize(v, f);
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setTextSize(TypedValue.applyDimension(v, f, this.getResources().getDisplayMetrics()));
        }
        this.h();
    }

    public void setTextStartPadding(float f) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setTextStartPadding(f);
        }
    }

    public void setTextStartPaddingResource(@DimenRes int v) {
        ChipDrawable chipDrawable0 = this.e;
        if(chipDrawable0 != null) {
            chipDrawable0.setTextStartPaddingResource(v);
        }
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return this.o;
    }
}

