package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialSwitch extends SwitchCompat {
    public Drawable T;
    public Drawable U;
    public int V;
    public Drawable W;
    public Drawable a0;
    public ColorStateList b0;
    public ColorStateList c0;
    public PorterDuff.Mode d0;
    public ColorStateList e0;
    public ColorStateList f0;
    public PorterDuff.Mode g0;
    public int[] h0;
    public int[] i0;
    public static final int j0;
    public static final int[] k0;

    static {
        MaterialSwitch.j0 = style.Widget_Material3_CompoundButton_MaterialSwitch;
        MaterialSwitch.k0 = new int[]{attr.state_with_icon};
    }

    public MaterialSwitch(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialSwitch(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialSwitchStyle);
    }

    public MaterialSwitch(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(MaterialThemeOverlay.wrap(context0, attributeSet0, v, MaterialSwitch.j0), attributeSet0, v);
        this.V = -1;
        Context context1 = this.getContext();
        this.T = super.getThumbDrawable();
        this.b0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.W = super.getTrackDrawable();
        this.e0 = super.getTrackTintList();
        super.setTrackTintList(null);
        TintTypedArray tintTypedArray0 = ThemeEnforcement.obtainTintedStyledAttributes(context1, attributeSet0, styleable.MaterialSwitch, v, MaterialSwitch.j0, new int[0]);
        this.U = tintTypedArray0.getDrawable(styleable.MaterialSwitch_thumbIcon);
        this.V = tintTypedArray0.getDimensionPixelSize(styleable.MaterialSwitch_thumbIconSize, -1);
        this.c0 = tintTypedArray0.getColorStateList(styleable.MaterialSwitch_thumbIconTint);
        int v1 = tintTypedArray0.getInt(styleable.MaterialSwitch_thumbIconTintMode, -1);
        PorterDuff.Mode porterDuff$Mode0 = PorterDuff.Mode.SRC_IN;
        this.d0 = ViewUtils.parseTintMode(v1, porterDuff$Mode0);
        this.a0 = tintTypedArray0.getDrawable(styleable.MaterialSwitch_trackDecoration);
        this.f0 = tintTypedArray0.getColorStateList(styleable.MaterialSwitch_trackDecorationTint);
        this.g0 = ViewUtils.parseTintMode(tintTypedArray0.getInt(styleable.MaterialSwitch_trackDecorationTintMode, -1), porterDuff$Mode0);
        tintTypedArray0.recycle();
        this.setEnforceSwitchWidth(false);
        this.e();
        this.f();
    }

    public final void e() {
        this.T = DrawableUtils.createTintableDrawableIfNeeded(this.T, this.b0, this.getThumbTintMode());
        this.U = DrawableUtils.createTintableDrawableIfNeeded(this.U, this.c0, this.d0);
        this.h();
        super.setThumbDrawable(DrawableUtils.compositeTwoLayeredDrawable(this.T, this.U, this.V, this.V));
        this.refreshDrawableState();
    }

    public final void f() {
        this.W = DrawableUtils.createTintableDrawableIfNeeded(this.W, this.e0, this.getTrackTintMode());
        this.a0 = DrawableUtils.createTintableDrawableIfNeeded(this.a0, this.f0, this.g0);
        this.h();
        Drawable drawable0 = this.W;
        if(drawable0 != null && this.a0 != null) {
            drawable0 = new LayerDrawable(new Drawable[]{this.W, this.a0});
        }
        else if(drawable0 == null) {
            drawable0 = this.a0;
        }
        if(drawable0 != null) {
            this.setSwitchMinWidth(drawable0.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable0);
    }

    public static void g(Drawable drawable0, ColorStateList colorStateList0, int[] arr_v, int[] arr_v1, float f) {
        if(drawable0 != null && colorStateList0 != null) {
            DrawableCompat.setTint(drawable0, ColorUtils.blendARGB(colorStateList0.getColorForState(arr_v, 0), colorStateList0.getColorForState(arr_v1, 0), f));
        }
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.T;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.U;
    }

    @Px
    public int getThumbIconSize() {
        return this.V;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.c0;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.d0;
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.b0;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.a0;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.f0;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.g0;
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.W;
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.e0;
    }

    public final void h() {
        if(this.b0 == null && this.c0 == null && this.e0 == null && this.f0 == null) {
            return;
        }
        float f = this.getThumbPosition();
        ColorStateList colorStateList0 = this.b0;
        if(colorStateList0 != null) {
            MaterialSwitch.g(this.T, colorStateList0, this.h0, this.i0, f);
        }
        ColorStateList colorStateList1 = this.c0;
        if(colorStateList1 != null) {
            MaterialSwitch.g(this.U, colorStateList1, this.h0, this.i0, f);
        }
        ColorStateList colorStateList2 = this.e0;
        if(colorStateList2 != null) {
            MaterialSwitch.g(this.W, colorStateList2, this.h0, this.i0, f);
        }
        ColorStateList colorStateList3 = this.f0;
        if(colorStateList3 != null) {
            MaterialSwitch.g(this.a0, colorStateList3, this.h0, this.i0, f);
        }
    }

    @Override  // android.view.View
    public void invalidate() {
        this.h();
        super.invalidate();
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    public int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 1);
        if(this.U != null) {
            View.mergeDrawableStates(arr_v, MaterialSwitch.k0);
        }
        this.h0 = DrawableUtils.getUncheckedState(arr_v);
        this.i0 = DrawableUtils.getCheckedState(arr_v);
        return arr_v;
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable0) {
        this.T = drawable0;
        this.e();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable0) {
        this.U = drawable0;
        this.e();
    }

    public void setThumbIconResource(@DrawableRes int v) {
        this.setThumbIconDrawable(AppCompatResources.getDrawable(this.getContext(), v));
    }

    public void setThumbIconSize(@Px int v) {
        if(this.V != v) {
            this.V = v;
            this.e();
        }
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList0) {
        this.c0 = colorStateList0;
        this.e();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode porterDuff$Mode0) {
        this.d0 = porterDuff$Mode0;
        this.e();
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList0) {
        this.b0 = colorStateList0;
        this.e();
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        super.setThumbTintMode(porterDuff$Mode0);
        this.e();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable0) {
        this.a0 = drawable0;
        this.f();
    }

    public void setTrackDecorationResource(@DrawableRes int v) {
        this.setTrackDecorationDrawable(AppCompatResources.getDrawable(this.getContext(), v));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList0) {
        this.f0 = colorStateList0;
        this.f();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode porterDuff$Mode0) {
        this.g0 = porterDuff$Mode0;
        this.f();
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable0) {
        this.W = drawable0;
        this.f();
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList0) {
        this.e0 = colorStateList0;
        this.f();
    }

    @Override  // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        super.setTrackTintMode(porterDuff$Mode0);
        this.f();
    }
}

