package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.R.styleable;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ForegroundLinearLayout extends LinearLayoutCompat {
    protected boolean mForegroundInPadding;
    public Drawable p;
    public final Rect q;
    public final Rect r;
    public int s;
    public boolean t;

    public ForegroundLinearLayout(@NonNull Context context0) {
        this(context0, null);
    }

    public ForegroundLinearLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ForegroundLinearLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.q = new Rect();
        this.r = new Rect();
        this.s = 0x77;
        this.mForegroundInPadding = true;
        this.t = false;
        TypedArray typedArray0 = ThemeEnforcement.obtainStyledAttributes(context0, attributeSet0, styleable.ForegroundLinearLayout, v, 0, new int[0]);
        this.s = typedArray0.getInt(styleable.ForegroundLinearLayout_android_foregroundGravity, this.s);
        Drawable drawable0 = typedArray0.getDrawable(styleable.ForegroundLinearLayout_android_foreground);
        if(drawable0 != null) {
            this.setForeground(drawable0);
        }
        this.mForegroundInPadding = typedArray0.getBoolean(styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArray0.recycle();
    }

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        super.draw(canvas0);
        Drawable drawable0 = this.p;
        if(drawable0 != null) {
            if(this.t) {
                this.t = false;
                int v = this.getRight() - this.getLeft();
                int v1 = this.getBottom() - this.getTop();
                Rect rect0 = this.q;
                if(this.mForegroundInPadding) {
                    rect0.set(0, 0, v, v1);
                }
                else {
                    rect0.set(this.getPaddingLeft(), this.getPaddingTop(), v - this.getPaddingRight(), v1 - this.getPaddingBottom());
                }
                Gravity.apply(this.s, drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), rect0, this.r);
                drawable0.setBounds(this.r);
            }
            drawable0.draw(canvas0);
        }
    }

    @Override  // android.view.View
    @TargetApi(21)
    @RequiresApi(21)
    public void drawableHotspotChanged(float f, float f1) {
        super.drawableHotspotChanged(f, f1);
        Drawable drawable0 = this.p;
        if(drawable0 != null) {
            drawable0.setHotspot(f, f1);
        }
    }

    @Override  // android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if(this.p != null && this.p.isStateful()) {
            this.p.setState(this.getDrawableState());
        }
    }

    @Override  // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.p;
    }

    @Override  // android.view.View
    public int getForegroundGravity() {
        return this.s;
    }

    @Override  // android.view.ViewGroup
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable0 = this.p;
        if(drawable0 != null) {
            drawable0.jumpToCurrentState();
        }
    }

    @Override  // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.t |= z;
    }

    @Override  // android.view.View
    public void onSizeChanged(int v, int v1, int v2, int v3) {
        super.onSizeChanged(v, v1, v2, v3);
        this.t = true;
    }

    @Override  // android.view.View
    public void setForeground(@Nullable Drawable drawable0) {
        Drawable drawable1 = this.p;
        if(drawable1 != drawable0) {
            if(drawable1 != null) {
                drawable1.setCallback(null);
                this.unscheduleDrawable(this.p);
            }
            this.p = drawable0;
            this.t = true;
            if(drawable0 == null) {
                this.setWillNotDraw(true);
            }
            else {
                this.setWillNotDraw(false);
                drawable0.setCallback(this);
                if(drawable0.isStateful()) {
                    drawable0.setState(this.getDrawableState());
                }
                if(this.s == 0x77) {
                    drawable0.getPadding(new Rect());
                }
            }
            this.requestLayout();
            this.invalidate();
        }
    }

    @Override  // android.view.View
    public void setForegroundGravity(int v) {
        if(this.s != v) {
            if((0x800007 & v) == 0) {
                v |= 0x800003;
            }
            if((v & 0x70) == 0) {
                v |= 0x30;
            }
            this.s = v;
            if(v == 0x77 && this.p != null) {
                Rect rect0 = new Rect();
                this.p.getPadding(rect0);
            }
            this.requestLayout();
        }
    }

    @Override  // android.view.View
    public boolean verifyDrawable(Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.p;
    }
}

