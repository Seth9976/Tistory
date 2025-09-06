package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R.styleable;
import androidx.core.view.ViewCompat;

public final class y {
    public final View a;
    public final AppCompatDrawableManager b;
    public int c;
    public TintInfo d;
    public TintInfo e;
    public TintInfo f;

    public y(View view0) {
        this.c = -1;
        this.a = view0;
        this.b = AppCompatDrawableManager.get();
    }

    public final void a() {
        View view0 = this.a;
        Drawable drawable0 = view0.getBackground();
        if(drawable0 != null) {
            if(this.d != null) {
                if(this.f == null) {
                    this.f = new TintInfo();
                }
                TintInfo tintInfo0 = this.f;
                tintInfo0.mTintList = null;
                tintInfo0.mHasTintList = false;
                tintInfo0.mTintMode = null;
                tintInfo0.mHasTintMode = false;
                ColorStateList colorStateList0 = ViewCompat.getBackgroundTintList(view0);
                if(colorStateList0 != null) {
                    tintInfo0.mHasTintList = true;
                    tintInfo0.mTintList = colorStateList0;
                }
                PorterDuff.Mode porterDuff$Mode0 = ViewCompat.getBackgroundTintMode(view0);
                if(porterDuff$Mode0 != null) {
                    tintInfo0.mHasTintMode = true;
                    tintInfo0.mTintMode = porterDuff$Mode0;
                }
                if(tintInfo0.mHasTintList || tintInfo0.mHasTintMode) {
                    AppCompatDrawableManager.a(drawable0, tintInfo0, view0.getDrawableState());
                    return;
                }
            }
            TintInfo tintInfo1 = this.e;
            if(tintInfo1 != null) {
                AppCompatDrawableManager.a(drawable0, tintInfo1, view0.getDrawableState());
                return;
            }
            TintInfo tintInfo2 = this.d;
            if(tintInfo2 != null) {
                AppCompatDrawableManager.a(drawable0, tintInfo2, view0.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        return this.e == null ? null : this.e.mTintList;
    }

    public final PorterDuff.Mode c() {
        return this.e == null ? null : this.e.mTintMode;
    }

    public final void d(AttributeSet attributeSet0, int v) {
        ColorStateList colorStateList0;
        View view0 = this.a;
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(view0.getContext(), attributeSet0, styleable.ViewBackgroundHelper, v, 0);
        Context context0 = this.a.getContext();
        ViewCompat.saveAttributeDataForStyleable(this.a, context0, styleable.ViewBackgroundHelper, attributeSet0, tintTypedArray0.getWrappedTypeArray(), v, 0);
        try {
            if(tintTypedArray0.hasValue(styleable.ViewBackgroundHelper_android_background)) {
                this.c = tintTypedArray0.getResourceId(styleable.ViewBackgroundHelper_android_background, -1);
                AppCompatDrawableManager appCompatDrawableManager0 = this.b;
                Context context1 = view0.getContext();
                synchronized(appCompatDrawableManager0) {
                    colorStateList0 = appCompatDrawableManager0.a.d(context1, this.c);
                }
                if(colorStateList0 != null) {
                    this.g(colorStateList0);
                }
            }
            if(tintTypedArray0.hasValue(styleable.ViewBackgroundHelper_backgroundTint)) {
                ViewCompat.setBackgroundTintList(view0, tintTypedArray0.getColorStateList(styleable.ViewBackgroundHelper_backgroundTint));
            }
            if(tintTypedArray0.hasValue(styleable.ViewBackgroundHelper_backgroundTintMode)) {
                ViewCompat.setBackgroundTintMode(view0, DrawableUtils.parseTintMode(tintTypedArray0.getInt(styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        }
        finally {
            tintTypedArray0.recycle();
        }
    }

    public final void e() {
        this.c = -1;
        this.g(null);
        this.a();
    }

    public final void f(int v) {
        ColorStateList colorStateList0;
        this.c = v;
        AppCompatDrawableManager appCompatDrawableManager0 = this.b;
        if(appCompatDrawableManager0 == null) {
            colorStateList0 = null;
        }
        else {
            Context context0 = this.a.getContext();
            synchronized(appCompatDrawableManager0) {
                colorStateList0 = appCompatDrawableManager0.a.d(context0, v);
            }
        }
        this.g(colorStateList0);
        this.a();
    }

    public final void g(ColorStateList colorStateList0) {
        if(colorStateList0 == null) {
            this.d = null;
        }
        else {
            if(this.d == null) {
                this.d = new TintInfo();
            }
            this.d.mTintList = colorStateList0;
            this.d.mHasTintList = true;
        }
        this.a();
    }

    public final void h(ColorStateList colorStateList0) {
        if(this.e == null) {
            this.e = new TintInfo();
        }
        this.e.mTintList = colorStateList0;
        this.e.mHasTintList = true;
        this.a();
    }

    public final void i(PorterDuff.Mode porterDuff$Mode0) {
        if(this.e == null) {
            this.e = new TintInfo();
        }
        this.e.mTintMode = porterDuff$Mode0;
        this.e.mHasTintMode = true;
        this.a();
    }
}

