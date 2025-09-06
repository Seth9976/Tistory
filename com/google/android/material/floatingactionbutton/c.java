package com.google.android.material.floatingactionbutton;

import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

public final class c extends Drawable.ConstantState {
    public final int a;
    public final Object b;

    public c(Drawable.ConstantState drawable$ConstantState0) {
        this.a = 1;
        super();
        this.b = drawable$ConstantState0;
    }

    public c(d d0) {
        this.a = 0;
        this.b = d0;
        super();
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public boolean canApplyTheme() {
        return this.a == 1 ? ((Drawable.ConstantState)this.b).canApplyTheme() : super.canApplyTheme();
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final int getChangingConfigurations() {
        return this.a == 0 ? 0 : ((Drawable.ConstantState)this.b).getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable() {
        if(this.a != 0) {
            Drawable drawable0 = new AnimatedVectorDrawableCompat(null);
            Drawable drawable1 = ((Drawable.ConstantState)this.b).newDrawable();
            drawable0.a = drawable1;
            drawable1.setCallback(drawable0.f);
            return drawable0;
        }
        return (d)this.b;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public Drawable newDrawable(Resources resources0) {
        if(this.a != 1) {
            return super.newDrawable(resources0);
        }
        Drawable drawable0 = new AnimatedVectorDrawableCompat(null);
        Drawable drawable1 = ((Drawable.ConstantState)this.b).newDrawable(resources0);
        drawable0.a = drawable1;
        drawable1.setCallback(drawable0.f);
        return drawable0;
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public Drawable newDrawable(Resources resources0, Resources.Theme resources$Theme0) {
        if(this.a != 1) {
            return super.newDrawable(resources0, resources$Theme0);
        }
        Drawable drawable0 = new AnimatedVectorDrawableCompat(null);
        Drawable drawable1 = ((Drawable.ConstantState)this.b).newDrawable(resources0, resources$Theme0);
        drawable0.a = drawable1;
        drawable1.setCallback(drawable0.f);
        return drawable0;
    }
}

