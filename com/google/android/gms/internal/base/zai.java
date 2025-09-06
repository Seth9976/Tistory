package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import h7.b;
import h7.c;

public final class zai extends Drawable implements Drawable.Callback {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final boolean g;
    public boolean h;
    public final c i;
    public final Drawable j;
    public final Drawable k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;

    public zai(@Nullable Drawable drawable0, @Nullable Drawable drawable1) {
        this(null);
        if(drawable0 == null) {
            drawable0 = b.a;
        }
        this.j = drawable0;
        drawable0.setCallback(this);
        int v = this.i.b;
        this.i.b = drawable0.getChangingConfigurations() | v;
        if(drawable1 == null) {
            drawable1 = b.a;
        }
        this.k = drawable1;
        drawable1.setCallback(this);
        int v1 = this.i.b;
        this.i.b = drawable1.getChangingConfigurations() | v1;
    }

    public zai(c c0) {
        this.a = 0;
        this.d = 0xFF;
        this.f = 0;
        this.g = true;
        c c1 = new c();  // 初始化器: Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V
        if(c0 != null) {
            c1.a = c0.a;
            c1.b = c0.b;
        }
        this.i = c1;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        boolean z = true;
        switch(this.a) {
            case 1: {
                this.b = SystemClock.uptimeMillis();
                this.a = 2;
                z = false;
                break;
            }
            case 2: {
                if(this.b >= 0L) {
                    float f = ((float)(SystemClock.uptimeMillis() - this.b)) / ((float)this.e);
                    if(f < 1.0f) {
                        z = false;
                    }
                    else {
                        this.a = 0;
                    }
                    this.f = (int)(((float)this.c) * Math.min(f, 1.0f) + 0.0f);
                }
            }
        }
        int v = this.f;
        boolean z1 = this.g;
        Drawable drawable0 = this.j;
        Drawable drawable1 = this.k;
        if(z) {
            if(!z1) {
                drawable0.draw(canvas0);
            }
            else if(v == 0) {
                drawable0.draw(canvas0);
                v = 0;
            }
            int v1 = this.d;
            if(v == v1) {
                drawable1.setAlpha(v1);
                drawable1.draw(canvas0);
            }
            return;
        }
        if(z1) {
            drawable0.setAlpha(this.d - v);
        }
        drawable0.draw(canvas0);
        if(z1) {
            drawable0.setAlpha(this.d);
        }
        if(v > 0) {
            drawable1.setAlpha(v);
            drawable1.draw(canvas0);
            drawable1.setAlpha(this.d);
        }
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.i.a | this.i.b;
    }

    @Override  // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        if(this.zac()) {
            this.i.a = this.getChangingConfigurations();
            return this.i;
        }
        return null;
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.j.getIntrinsicHeight(), this.k.getIntrinsicHeight());
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.j.getIntrinsicWidth(), this.k.getIntrinsicWidth());
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if(!this.n) {
            this.o = Drawable.resolveOpacity(this.j.getOpacity(), this.k.getOpacity());
            this.n = true;
        }
        return this.o;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void invalidateDrawable(Drawable drawable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.invalidateDrawable(this);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if(!this.h && super.mutate() == this) {
            if(!this.zac()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.j.mutate();
            this.k.mutate();
            this.h = true;
            return this;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect0) {
        this.j.setBounds(rect0);
        this.k.setBounds(rect0);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.scheduleDrawable(this, runnable0, v);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        if(this.f == this.d) {
            this.f = v;
        }
        this.d = v;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter0) {
        this.j.setColorFilter(colorFilter0);
        this.k.setColorFilter(colorFilter0);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        Drawable.Callback drawable$Callback0 = this.getCallback();
        if(drawable$Callback0 != null) {
            drawable$Callback0.unscheduleDrawable(this, runnable0);
        }
    }

    public final Drawable zaa() {
        return this.k;
    }

    public final void zab(int v) {
        this.c = this.d;
        this.f = 0;
        this.e = 0xFA;
        this.a = 1;
        this.invalidateSelf();
    }

    public final boolean zac() {
        boolean z = false;
        if(!this.l) {
            if(this.j.getConstantState() != null && this.k.getConstantState() != null) {
                z = true;
            }
            this.m = z;
            this.l = true;
        }
        return this.m;
    }
}

