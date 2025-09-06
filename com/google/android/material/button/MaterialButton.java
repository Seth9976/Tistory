package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout.Alignment;
import android.text.TextPaint;
import android.text.TextUtils;
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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashSet;

public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {
    @Retention(RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(MaterialButton arg1, boolean arg2);
    }

    interface OnPressedChangeListener {
        void onPressedChanged(MaterialButton arg1, boolean arg2);
    }

    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 0x20;
    public static final int ICON_GRAVITY_TOP = 16;
    public final b d;
    public final LinkedHashSet e;
    public OnPressedChangeListener f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public String j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public static final int[] r;
    public static final int[] s;
    public static final int t;

    static {
        MaterialButton.r = new int[]{0x101009F};
        MaterialButton.s = new int[]{0x10100A0};
        MaterialButton.t = style.Widget_MaterialComponents_Button;
    }

    public MaterialButton(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialButtonStyle);
    }

    public MaterialButton(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, MaterialButton.t), attributeSet0, v);
        this.e = new LinkedHashSet();
        boolean z = false;
        this.o = false;
        this.p = false;
        Context context1 = this.getContext();
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context1, attributeSet0, styleable.MaterialButton, v, MaterialButton.t, new int[0]);
        this.n = typedArray0.getDimensionPixelSize(styleable.MaterialButton_iconPadding, 0);
        int v1 = typedArray0.getInt(styleable.MaterialButton_iconTintMode, -1);
        PorterDuff.Mode porterDuff$Mode0 = PorterDuff.Mode.SRC_IN;
        this.g = ViewUtils.parseTintMode(v1, porterDuff$Mode0);
        this.h = MaterialResources.getColorStateList(this.getContext(), typedArray0, styleable.MaterialButton_iconTint);
        this.i = MaterialResources.getDrawable(this.getContext(), typedArray0, styleable.MaterialButton_icon);
        this.q = typedArray0.getInteger(styleable.MaterialButton_iconGravity, 1);
        this.k = typedArray0.getDimensionPixelSize(styleable.MaterialButton_iconSize, 0);
        b b0 = new b(this, ShapeAppearanceModel.builder(context1, attributeSet0, v, MaterialButton.t).build());
        this.d = b0;
        b0.c = typedArray0.getDimensionPixelOffset(styleable.MaterialButton_android_insetLeft, 0);
        b0.d = typedArray0.getDimensionPixelOffset(styleable.MaterialButton_android_insetRight, 0);
        b0.e = typedArray0.getDimensionPixelOffset(styleable.MaterialButton_android_insetTop, 0);
        b0.f = typedArray0.getDimensionPixelOffset(styleable.MaterialButton_android_insetBottom, 0);
        if(typedArray0.hasValue(styleable.MaterialButton_cornerRadius)) {
            int v2 = typedArray0.getDimensionPixelSize(styleable.MaterialButton_cornerRadius, -1);
            b0.g = v2;
            b0.c(b0.b.withCornerSize(((float)v2)));
            b0.p = true;
        }
        b0.h = typedArray0.getDimensionPixelSize(styleable.MaterialButton_strokeWidth, 0);
        b0.i = ViewUtils.parseTintMode(typedArray0.getInt(styleable.MaterialButton_backgroundTintMode, -1), porterDuff$Mode0);
        b0.j = MaterialResources.getColorStateList(this.getContext(), typedArray0, styleable.MaterialButton_backgroundTint);
        b0.k = MaterialResources.getColorStateList(this.getContext(), typedArray0, styleable.MaterialButton_strokeColor);
        b0.l = MaterialResources.getColorStateList(this.getContext(), typedArray0, styleable.MaterialButton_rippleColor);
        b0.q = typedArray0.getBoolean(styleable.MaterialButton_android_checkable, false);
        b0.t = typedArray0.getDimensionPixelSize(styleable.MaterialButton_elevation, 0);
        b0.r = typedArray0.getBoolean(styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int v3 = ViewCompat.getPaddingStart(this);
        int v4 = this.getPaddingTop();
        int v5 = ViewCompat.getPaddingEnd(this);
        int v6 = this.getPaddingBottom();
        if(typedArray0.hasValue(styleable.MaterialButton_android_background)) {
            b0.o = true;
            this.setSupportBackgroundTintList(b0.j);
            this.setSupportBackgroundTintMode(b0.i);
        }
        else {
            b0.e();
        }
        ViewCompat.setPaddingRelative(this, v3 + b0.c, v4 + b0.e, v5 + b0.d, v6 + b0.f);
        typedArray0.recycle();
        this.setCompoundDrawablePadding(this.n);
        if(this.i != null) {
            z = true;
        }
        this.c(z);
    }

    public final boolean a() {
        return this.d != null && !this.d.o;
    }

    public void addOnCheckedChangeListener(@NonNull OnCheckedChangeListener materialButton$OnCheckedChangeListener0) {
        this.e.add(materialButton$OnCheckedChangeListener0);
    }

    public final void b() {
        int v = this.q;
        if(v == 1 || v == 2) {
            TextViewCompat.setCompoundDrawablesRelative(this, this.i, null, null, null);
            return;
        }
        switch(v) {
            case 3: 
            case 4: {
                TextViewCompat.setCompoundDrawablesRelative(this, null, null, this.i, null);
                return;
            }
            case 16: 
            case 0x20: {
                TextViewCompat.setCompoundDrawablesRelative(this, null, this.i, null, null);
            }
        }
    }

    public final void c(boolean z) {
        Drawable drawable0 = this.i;
        if(drawable0 != null) {
            Drawable drawable1 = drawable0.mutate();
            this.i = drawable1;
            DrawableCompat.setTintList(drawable1, this.h);
            PorterDuff.Mode porterDuff$Mode0 = this.g;
            if(porterDuff$Mode0 != null) {
                DrawableCompat.setTintMode(this.i, porterDuff$Mode0);
            }
            int v = this.k == 0 ? this.i.getIntrinsicWidth() : this.k;
            int v1 = this.k == 0 ? this.i.getIntrinsicHeight() : this.k;
            this.i.setBounds(this.l, this.m, v + this.l, v1 + this.m);
            this.i.setVisible(true, z);
        }
        if(z) {
            this.b();
            return;
        }
        Drawable[] arr_drawable = TextViewCompat.getCompoundDrawablesRelative(this);
        if((this.q == 1 || this.q == 2) && arr_drawable[0] != this.i || (this.q == 3 || this.q == 4) && arr_drawable[2] != this.i || (this.q == 16 || this.q == 0x20) && arr_drawable[1] != this.i) {
            this.b();
        }
    }

    public void clearOnCheckedChangeListeners() {
        this.e.clear();
    }

    public final void d(int v, int v1) {
        if(this.i != null && this.getLayout() != null) {
            int v2 = this.q;
            int v3 = 1;
            if(v2 != 1 && v2 != 2 && (v2 != 3 && v2 != 4)) {
                if(v2 != 16 && v2 != 0x20) {
                    return;
                }
                this.l = 0;
                if(v2 == 16) {
                    this.m = 0;
                    this.c(false);
                    return;
                }
                int v4 = this.k == 0 ? this.i.getIntrinsicHeight() : this.k;
                int v5 = Math.max(0, (v1 - this.getTextHeight() - this.getPaddingTop() - v4 - this.n - this.getPaddingBottom()) / 2);
                if(this.m == v5) {
                    return;
                }
                this.m = v5;
                this.c(false);
                return;
            }
            this.m = 0;
            Layout.Alignment layout$Alignment0 = this.getActualTextAlignment();
            int v6 = this.q;
            switch(v6) {
                case 2: {
                    if(layout$Alignment0 != Layout.Alignment.ALIGN_NORMAL) {
                    label_22:
                        if(v6 != 4 || layout$Alignment0 != Layout.Alignment.ALIGN_OPPOSITE) {
                            int v7 = this.k == 0 ? this.i.getIntrinsicWidth() : this.k;
                            int v8 = v - this.getTextLayoutWidth() - ViewCompat.getPaddingEnd(this) - v7 - this.n - ViewCompat.getPaddingStart(this);
                            if(layout$Alignment0 == Layout.Alignment.ALIGN_CENTER) {
                                v8 /= 2;
                            }
                            int v9 = ViewCompat.getLayoutDirection(this) == 1 ? 1 : 0;
                            if(this.q != 4) {
                                v3 = 0;
                            }
                            if(v9 != v3) {
                                v8 = -v8;
                            }
                            if(this.l != v8) {
                                this.l = v8;
                                this.c(false);
                            }
                            return;
                        }
                    }
                    break;
                }
                case 1: 
                case 3: {
                    break;
                }
                default: {
                    goto label_22;
                }
            }
            this.l = 0;
            this.c(false);
        }
    }

    // 去混淆评级： 低(23)
    @NonNull
    public String getA11yClassName() {
        if(!TextUtils.isEmpty(this.j)) {
            return this.j;
        }
        return this.isCheckable() ? "android.widget.CompoundButton" : "android.widget.Button";
    }

    private Layout.Alignment getActualTextAlignment() {
        switch(this.getTextAlignment()) {
            case 1: {
                return this.getGravityTextAlignment();
            }
            case 4: {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case 3: 
            case 6: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            default: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
        }
    }

    @Override  // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return this.getSupportBackgroundTintList();
    }

    @Override  // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.getSupportBackgroundTintMode();
    }

    // 去混淆评级： 低(20)
    @Px
    public int getCornerRadius() {
        return this.a() ? this.d.g : 0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        switch(this.getGravity() & 0x800007) {
            case 1: {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case 5: 
            case 0x800005: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            default: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
        }
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.q;
    }

    @Px
    public int getIconPadding() {
        return this.n;
    }

    @Px
    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    @Dimension
    public int getInsetBottom() {
        return this.d.f;
    }

    @Dimension
    public int getInsetTop() {
        return this.d.e;
    }

    // 去混淆评级： 低(20)
    @Nullable
    public ColorStateList getRippleColor() {
        return this.a() ? this.d.l : null;
    }

    @Override  // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        if(!this.a()) {
            throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        }
        return this.d.b;
    }

    // 去混淆评级： 低(20)
    public ColorStateList getStrokeColor() {
        return this.a() ? this.d.k : null;
    }

    // 去混淆评级： 低(20)
    @Px
    public int getStrokeWidth() {
        return this.a() ? this.d.h : 0;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        return this.a() ? this.d.j : super.getSupportBackgroundTintList();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.a() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    private int getTextHeight() {
        if(this.getLineCount() > 1) {
            return this.getLayout().getHeight();
        }
        TextPaint textPaint0 = this.getPaint();
        String s = this.getText().toString();
        if(this.getTransformationMethod() != null) {
            s = this.getTransformationMethod().getTransformation(s, this).toString();
        }
        Rect rect0 = new Rect();
        textPaint0.getTextBounds(s, 0, s.length(), rect0);
        return Math.min(rect0.height(), this.getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int v = this.getLineCount();
        float f = 0.0f;
        for(int v1 = 0; v1 < v; ++v1) {
            f = Math.max(f, this.getLayout().getLineWidth(v1));
        }
        return (int)Math.ceil(f);
    }

    public boolean isCheckable() {
        return this.d != null && this.d.q;
    }

    @Override  // android.widget.Checkable
    public boolean isChecked() {
        return this.o;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.d.r;
    }

    @Override  // android.widget.TextView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.a()) {
            MaterialShapeUtils.setParentAbsoluteElevation(this, this.d.b(false));
        }
    }

    @Override  // android.widget.TextView
    public int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 2);
        if(this.isCheckable()) {
            View.mergeDrawableStates(arr_v, MaterialButton.r);
        }
        if(this.isChecked()) {
            View.mergeDrawableStates(arr_v, MaterialButton.s);
        }
        return arr_v;
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName(this.getA11yClassName());
        accessibilityEvent0.setChecked(this.isChecked());
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName(this.getA11yClassName());
        accessibilityNodeInfo0.setCheckable(this.isCheckable());
        accessibilityNodeInfo0.setChecked(this.isChecked());
        accessibilityNodeInfo0.setClickable(this.isClickable());
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.d(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    @Override  // android.widget.TextView
    public void onRestoreInstanceState(@Nullable Parcelable parcelable0) {
        if(!(parcelable0 instanceof a)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((a)parcelable0).getSuperState());
        this.setChecked(((a)parcelable0).b);
    }

    @Override  // android.widget.TextView
    @NonNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new a(super.onSaveInstanceState());  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V
        parcelable0.b = this.o;
        return parcelable0;
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        super.onTextChanged(charSequence0, v, v1, v2);
        this.d(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    @Override  // android.view.View
    public boolean performClick() {
        if(this.d.r) {
            this.toggle();
        }
        return super.performClick();
    }

    @Override  // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if(this.i != null) {
            int[] arr_v = this.getDrawableState();
            if(this.i.setState(arr_v)) {
                this.invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(@NonNull OnCheckedChangeListener materialButton$OnCheckedChangeListener0) {
        this.e.remove(materialButton$OnCheckedChangeListener0);
    }

    public void setA11yClassName(@Nullable String s) {
        this.j = s;
    }

    @Override  // android.view.View
    public void setBackground(@NonNull Drawable drawable0) {
        this.setBackgroundDrawable(drawable0);
    }

    @Override  // android.view.View
    public void setBackgroundColor(@ColorInt int v) {
        if(this.a()) {
            b b0 = this.d;
            if(b0.b(false) != null) {
                b0.b(false).setTint(v);
            }
        }
        else {
            super.setBackgroundColor(v);
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public void setBackgroundDrawable(@NonNull Drawable drawable0) {
        if(this.a()) {
            if(drawable0 != this.getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.d.o = true;
                this.d.a.setSupportBackgroundTintList(this.d.j);
                this.d.a.setSupportBackgroundTintMode(this.d.i);
                super.setBackgroundDrawable(drawable0);
                return;
            }
            this.getBackground().setState(drawable0.getState());
            return;
        }
        super.setBackgroundDrawable(drawable0);
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    public void setBackgroundResource(@DrawableRes int v) {
        this.setBackgroundDrawable((v == 0 ? null : AppCompatResources.getDrawable(this.getContext(), v)));
    }

    @Override  // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        this.setSupportBackgroundTintList(colorStateList0);
    }

    @Override  // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.setSupportBackgroundTintMode(porterDuff$Mode0);
    }

    public void setCheckable(boolean z) {
        if(this.a()) {
            this.d.q = z;
        }
    }

    @Override  // android.widget.Checkable
    public void setChecked(boolean z) {
        if(this.isCheckable() && this.isEnabled() && this.o != z) {
            this.o = z;
            this.refreshDrawableState();
            if(this.getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup0 = (MaterialButtonToggleGroup)this.getParent();
                boolean z1 = this.o;
                if(!materialButtonToggleGroup0.f) {
                    materialButtonToggleGroup0.b(this.getId(), z1);
                }
            }
            if(this.p) {
                return;
            }
            this.p = true;
            for(Object object0: this.e) {
                ((OnCheckedChangeListener)object0).onCheckedChanged(this, this.o);
            }
            this.p = false;
        }
    }

    public void setCornerRadius(@Px int v) {
        if(this.a()) {
            b b0 = this.d;
            if(!b0.p || b0.g != v) {
                b0.g = v;
                b0.p = true;
                b0.c(b0.b.withCornerSize(((float)v)));
            }
        }
    }

    public void setCornerRadiusResource(@DimenRes int v) {
        if(this.a()) {
            this.setCornerRadius(this.getResources().getDimensionPixelSize(v));
        }
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        if(this.a()) {
            this.d.b(false).setElevation(f);
        }
    }

    public void setIcon(@Nullable Drawable drawable0) {
        if(this.i != drawable0) {
            this.i = drawable0;
            this.c(true);
            this.d(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }

    public void setIconGravity(int v) {
        if(this.q != v) {
            this.q = v;
            this.d(this.getMeasuredWidth(), this.getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int v) {
        if(this.n != v) {
            this.n = v;
            this.setCompoundDrawablePadding(v);
        }
    }

    public void setIconResource(@DrawableRes int v) {
        this.setIcon((v == 0 ? null : AppCompatResources.getDrawable(this.getContext(), v)));
    }

    public void setIconSize(@Px int v) {
        if(v < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if(this.k != v) {
            this.k = v;
            this.c(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList0) {
        if(this.h != colorStateList0) {
            this.h = colorStateList0;
            this.c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode porterDuff$Mode0) {
        if(this.g != porterDuff$Mode0) {
            this.g = porterDuff$Mode0;
            this.c(false);
        }
    }

    public void setIconTintResource(@ColorRes int v) {
        this.setIconTint(AppCompatResources.getColorStateList(this.getContext(), v));
    }

    public void setInsetBottom(@Dimension int v) {
        this.d.d(this.d.e, v);
    }

    public void setInsetTop(@Dimension int v) {
        this.d.d(v, this.d.f);
    }

    public void setInternalBackground(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
    }

    public void setOnPressedChangeListenerInternal(@Nullable OnPressedChangeListener materialButton$OnPressedChangeListener0) {
        this.f = materialButton$OnPressedChangeListener0;
    }

    @Override  // android.view.View
    public void setPressed(boolean z) {
        OnPressedChangeListener materialButton$OnPressedChangeListener0 = this.f;
        if(materialButton$OnPressedChangeListener0 != null) {
            materialButton$OnPressedChangeListener0.onPressedChanged(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList0) {
        if(this.a()) {
            b b0 = this.d;
            if(b0.l != colorStateList0) {
                b0.l = colorStateList0;
                MaterialButton materialButton0 = b0.a;
                if(materialButton0.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable)materialButton0.getBackground()).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList0));
                }
            }
        }
    }

    public void setRippleColorResource(@ColorRes int v) {
        if(this.a()) {
            this.setRippleColor(AppCompatResources.getColorStateList(this.getContext(), v));
        }
    }

    @Override  // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel0) {
        if(!this.a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.c(shapeAppearanceModel0);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if(this.a()) {
            this.d.n = z;
            this.d.f();
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList0) {
        if(this.a()) {
            b b0 = this.d;
            if(b0.k != colorStateList0) {
                b0.k = colorStateList0;
                b0.f();
            }
        }
    }

    public void setStrokeColorResource(@ColorRes int v) {
        if(this.a()) {
            this.setStrokeColor(AppCompatResources.getColorStateList(this.getContext(), v));
        }
    }

    public void setStrokeWidth(@Px int v) {
        if(this.a()) {
            b b0 = this.d;
            if(b0.h != v) {
                b0.h = v;
                b0.f();
            }
        }
    }

    public void setStrokeWidthResource(@DimenRes int v) {
        if(this.a()) {
            this.setStrokeWidth(this.getResources().getDimensionPixelSize(v));
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        if(this.a()) {
            b b0 = this.d;
            if(b0.j != colorStateList0) {
                b0.j = colorStateList0;
                if(b0.b(false) != null) {
                    DrawableCompat.setTintList(b0.b(false), b0.j);
                }
            }
        }
        else {
            super.setSupportBackgroundTintList(colorStateList0);
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        if(this.a()) {
            b b0 = this.d;
            if(b0.i != porterDuff$Mode0) {
                b0.i = porterDuff$Mode0;
                if(b0.b(false) != null && b0.i != null) {
                    DrawableCompat.setTintMode(b0.b(false), b0.i);
                }
            }
        }
        else {
            super.setSupportBackgroundTintMode(porterDuff$Mode0);
        }
    }

    @Override  // android.view.View
    @RequiresApi(17)
    public void setTextAlignment(int v) {
        super.setTextAlignment(v);
        this.d(this.getMeasuredWidth(), this.getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.r = z;
    }

    @Override  // android.widget.Checkable
    public void toggle() {
        this.setChecked(!this.o);
    }
}

