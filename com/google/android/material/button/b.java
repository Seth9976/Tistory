package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

public final class b {
    public final MaterialButton a;
    public ShapeAppearanceModel b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public MaterialShapeDrawable m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public RippleDrawable s;
    public int t;

    public b(MaterialButton materialButton0, ShapeAppearanceModel shapeAppearanceModel0) {
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = true;
        this.a = materialButton0;
        this.b = shapeAppearanceModel0;
    }

    public final Shapeable a() {
        if(this.s != null && this.s.getNumberOfLayers() > 1) {
            return this.s.getNumberOfLayers() <= 2 ? ((Shapeable)this.s.getDrawable(1)) : ((Shapeable)this.s.getDrawable(2));
        }
        return null;
    }

    public final MaterialShapeDrawable b(boolean z) {
        return this.s == null || this.s.getNumberOfLayers() <= 0 ? null : ((MaterialShapeDrawable)((LayerDrawable)((InsetDrawable)this.s.getDrawable(0)).getDrawable()).getDrawable(!z));
    }

    public final void c(ShapeAppearanceModel shapeAppearanceModel0) {
        this.b = shapeAppearanceModel0;
        if(this.b(false) != null) {
            this.b(false).setShapeAppearanceModel(shapeAppearanceModel0);
        }
        if(this.b(true) != null) {
            this.b(true).setShapeAppearanceModel(shapeAppearanceModel0);
        }
        if(this.a() != null) {
            this.a().setShapeAppearanceModel(shapeAppearanceModel0);
        }
    }

    public final void d(int v, int v1) {
        MaterialButton materialButton0 = this.a;
        int v2 = ViewCompat.getPaddingStart(materialButton0);
        int v3 = materialButton0.getPaddingTop();
        int v4 = ViewCompat.getPaddingEnd(materialButton0);
        int v5 = materialButton0.getPaddingBottom();
        int v6 = this.e;
        int v7 = this.f;
        this.f = v1;
        this.e = v;
        if(!this.o) {
            this.e();
        }
        ViewCompat.setPaddingRelative(materialButton0, v2, v3 + v - v6, v4, v5 + v1 - v7);
    }

    public final void e() {
        MaterialShapeDrawable materialShapeDrawable0 = new MaterialShapeDrawable(this.b);
        MaterialButton materialButton0 = this.a;
        materialShapeDrawable0.initializeElevationOverlay(materialButton0.getContext());
        DrawableCompat.setTintList(materialShapeDrawable0, this.j);
        PorterDuff.Mode porterDuff$Mode0 = this.i;
        if(porterDuff$Mode0 != null) {
            DrawableCompat.setTintMode(materialShapeDrawable0, porterDuff$Mode0);
        }
        materialShapeDrawable0.setStroke(((float)this.h), this.k);
        MaterialShapeDrawable materialShapeDrawable1 = new MaterialShapeDrawable(this.b);
        materialShapeDrawable1.setTint(0);
        materialShapeDrawable1.setStroke(((float)this.h), (this.n ? MaterialColors.getColor(materialButton0, attr.colorSurface) : 0));
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.b);
        this.m = materialShapeDrawable2;
        DrawableCompat.setTint(materialShapeDrawable2, -1);
        RippleDrawable rippleDrawable0 = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.l), new InsetDrawable(new LayerDrawable(new Drawable[]{materialShapeDrawable1, materialShapeDrawable0}), this.c, this.e, this.d, this.f), this.m);
        this.s = rippleDrawable0;
        materialButton0.setInternalBackground(rippleDrawable0);
        MaterialShapeDrawable materialShapeDrawable3 = this.b(false);
        if(materialShapeDrawable3 != null) {
            materialShapeDrawable3.setElevation(((float)this.t));
            materialShapeDrawable3.setState(materialButton0.getDrawableState());
        }
    }

    public final void f() {
        int v = 0;
        MaterialShapeDrawable materialShapeDrawable0 = this.b(false);
        MaterialShapeDrawable materialShapeDrawable1 = this.b(true);
        if(materialShapeDrawable0 != null) {
            materialShapeDrawable0.setStroke(((float)this.h), this.k);
            if(materialShapeDrawable1 != null) {
                float f = (float)this.h;
                if(this.n) {
                    v = MaterialColors.getColor(this.a, attr.colorSurface);
                }
                materialShapeDrawable1.setStroke(f, v);
            }
        }
    }
}

