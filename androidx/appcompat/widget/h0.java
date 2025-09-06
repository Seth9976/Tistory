package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.R.styleable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;

public final class h0 extends f0 {
    public final AppCompatSeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public h0(AppCompatSeekBar appCompatSeekBar0) {
        super(appCompatSeekBar0);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = appCompatSeekBar0;
    }

    @Override  // androidx.appcompat.widget.f0
    public final void a(AttributeSet attributeSet0, int v) {
        super.a(attributeSet0, v);
        AppCompatSeekBar appCompatSeekBar0 = this.d;
        TintTypedArray tintTypedArray0 = TintTypedArray.obtainStyledAttributes(appCompatSeekBar0.getContext(), attributeSet0, styleable.AppCompatSeekBar, v, 0);
        ViewCompat.saveAttributeDataForStyleable(appCompatSeekBar0, appCompatSeekBar0.getContext(), styleable.AppCompatSeekBar, attributeSet0, tintTypedArray0.getWrappedTypeArray(), v, 0);
        Drawable drawable0 = tintTypedArray0.getDrawableIfKnown(styleable.AppCompatSeekBar_android_thumb);
        if(drawable0 != null) {
            appCompatSeekBar0.setThumb(drawable0);
        }
        Drawable drawable1 = tintTypedArray0.getDrawable(styleable.AppCompatSeekBar_tickMark);
        Drawable drawable2 = this.e;
        if(drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable1;
        if(drawable1 != null) {
            drawable1.setCallback(appCompatSeekBar0);
            DrawableCompat.setLayoutDirection(drawable1, ViewCompat.getLayoutDirection(appCompatSeekBar0));
            if(drawable1.isStateful()) {
                drawable1.setState(appCompatSeekBar0.getDrawableState());
            }
            this.c();
        }
        appCompatSeekBar0.invalidate();
        if(tintTypedArray0.hasValue(styleable.AppCompatSeekBar_tickMarkTintMode)) {
            this.g = DrawableUtils.parseTintMode(tintTypedArray0.getInt(styleable.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
            this.i = true;
        }
        if(tintTypedArray0.hasValue(styleable.AppCompatSeekBar_tickMarkTint)) {
            this.f = tintTypedArray0.getColorStateList(styleable.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        tintTypedArray0.recycle();
        this.c();
    }

    public final void c() {
        Drawable drawable0 = this.e;
        if(drawable0 != null && (this.h || this.i)) {
            Drawable drawable1 = DrawableCompat.wrap(drawable0.mutate());
            this.e = drawable1;
            if(this.h) {
                DrawableCompat.setTintList(drawable1, this.f);
            }
            if(this.i) {
                DrawableCompat.setTintMode(this.e, this.g);
            }
            if(this.e.isStateful()) {
                this.e.setState(this.d.getDrawableState());
            }
        }
    }

    public final void d(Canvas canvas0) {
        if(this.e != null) {
            AppCompatSeekBar appCompatSeekBar0 = this.d;
            int v = appCompatSeekBar0.getMax();
            int v1 = 1;
            if(v > 1) {
                int v2 = this.e.getIntrinsicWidth();
                int v3 = this.e.getIntrinsicHeight();
                int v4 = v2 < 0 ? 1 : v2 / 2;
                if(v3 >= 0) {
                    v1 = v3 / 2;
                }
                this.e.setBounds(-v4, -v1, v4, v1);
                int v5 = appCompatSeekBar0.getWidth();
                int v6 = appCompatSeekBar0.getPaddingLeft();
                int v7 = appCompatSeekBar0.getPaddingRight();
                int v8 = canvas0.save();
                canvas0.translate(((float)appCompatSeekBar0.getPaddingLeft()), ((float)(appCompatSeekBar0.getHeight() / 2)));
                for(int v9 = 0; v9 <= v; ++v9) {
                    this.e.draw(canvas0);
                    canvas0.translate(((float)(v5 - v6 - v7)) / ((float)v), 0.0f);
                }
                canvas0.restoreToCount(v8);
            }
        }
    }
}

