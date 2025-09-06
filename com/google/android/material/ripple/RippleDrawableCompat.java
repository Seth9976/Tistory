package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.TintAwareDrawable;
import c8.a;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

@RestrictTo({Scope.LIBRARY_GROUP})
public class RippleDrawableCompat extends Drawable implements TintAwareDrawable, Shapeable {
    public a a;

    public RippleDrawableCompat(a a0) {
        this.a = a0;
    }

    public RippleDrawableCompat(ShapeAppearanceModel shapeAppearanceModel0) {
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(shapeAppearanceModel0);
        a a0 = new a();  // 初始化器: Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V
        a0.a = materialShapeDrawable0;
        a0.b = false;
        this(a0);
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        a a0 = this.a;
        if(a0.b) {
            a0.a.draw(canvas0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a.a.getOpacity();
    }

    @Override  // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.a.a.getShapeAppearanceModel();
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override  // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        return this.mutate();
    }

    @NonNull
    public RippleDrawableCompat mutate() {
        this.a = new a(this.a);
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect0) {
        super.onBoundsChange(rect0);
        this.a.a.setBounds(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] arr_v) {
        boolean z = super.onStateChange(arr_v);
        if(this.a.a.setState(arr_v)) {
            z = true;
        }
        boolean z1 = RippleUtils.shouldDrawRippleCompat(arr_v);
        a a0 = this.a;
        if(a0.b != z1) {
            a0.b = z1;
            return true;
        }
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.a.a.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.a.a.setColorFilter(colorFilter0);
    }

    @Override  // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel0) {
        this.a.a.setShapeAppearanceModel(shapeAppearanceModel0);
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int v) {
        this.a.a.setTint(v);
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList0) {
        this.a.a.setTintList(colorStateList0);
    }

    @Override  // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.a.a.setTintMode(porterDuff$Mode0);
    }
}

