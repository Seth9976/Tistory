package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import g.b;

@RestrictTo({Scope.LIBRARY_GROUP})
public class FadeThroughDrawable extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public final float[] c;
    public float d;

    public FadeThroughDrawable(@NonNull Drawable drawable0, @NonNull Drawable drawable1) {
        this.a = drawable0.getConstantState().newDrawable().mutate();
        Drawable drawable2 = drawable1.getConstantState().newDrawable().mutate();
        this.b = drawable2;
        drawable2.setAlpha(0);
        this.c = new float[2];
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        this.a.draw(canvas0);
        this.b.draw(canvas0);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.a.getIntrinsicHeight(), this.b.getIntrinsicHeight());
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.a.getIntrinsicWidth(), this.b.getIntrinsicWidth());
    }

    @Override  // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.a.getMinimumHeight(), this.b.getMinimumHeight());
    }

    @Override  // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.a.getMinimumWidth(), this.b.getMinimumWidth());
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    // 去混淆评级： 低(20)
    @Override  // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.a.isStateful() || this.b.isStateful();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        Drawable drawable0 = this.b;
        Drawable drawable1 = this.a;
        if(Float.compare(this.d, 0.5f) <= 0) {
            drawable1.setAlpha(v);
            drawable0.setAlpha(0);
        }
        else {
            drawable1.setAlpha(0);
            drawable0.setAlpha(v);
        }
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setBounds(int v, int v1, int v2, int v3) {
        super.setBounds(v, v1, v2, v3);
        this.a.setBounds(v, v1, v2, v3);
        this.b.setBounds(v, v1, v2, v3);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.a.setColorFilter(colorFilter0);
        this.b.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }

    public void setProgress(@FloatRange(from = 0.0, to = 1.0) float f) {
        if(this.d != f) {
            this.d = f;
            b.b(f, this.c);
            this.a.setAlpha(((int)(this.c[0] * 255.0f)));
            this.b.setAlpha(((int)(this.c[1] * 255.0f)));
            this.invalidateSelf();
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.graphics.drawable.Drawable
    public boolean setState(int[] arr_v) {
        return this.a.setState(arr_v) || this.b.setState(arr_v);
    }
}

