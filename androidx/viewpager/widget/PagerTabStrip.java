package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import e5.a;
import e5.b;

public class PagerTabStrip extends PagerTitleStrip {
    public boolean A;
    public final int B;
    public boolean C;
    public float D;
    public float E;
    public final int F;
    public int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final Paint w;
    public final Rect x;
    public int y;
    public boolean z;

    public PagerTabStrip(@NonNull Context context0) {
        this(context0, null);
    }

    public PagerTabStrip(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        Paint paint0 = new Paint();
        this.w = paint0;
        this.x = new Rect();
        this.y = 0xFF;
        this.z = false;
        this.A = false;
        this.q = this.n;
        paint0.setColor(this.n);
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        this.r = (int)(3.0f * displayMetrics0.density + 0.5f);
        this.s = (int)(6.0f * displayMetrics0.density + 0.5f);
        this.t = (int)(64.0f * displayMetrics0.density);
        this.v = (int)(16.0f * displayMetrics0.density + 0.5f);
        this.B = (int)(1.0f * displayMetrics0.density + 0.5f);
        this.u = (int)(displayMetrics0.density * 32.0f + 0.5f);
        this.F = ViewConfiguration.get(context0).getScaledTouchSlop();
        this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        this.setTextSpacing(this.getTextSpacing());
        this.setWillNotDraw(false);
        this.b.setFocusable(true);
        a a0 = new a(this);
        this.b.setOnClickListener(a0);
        this.d.setFocusable(true);
        b b0 = new b(this);
        this.d.setOnClickListener(b0);
        if(this.getBackground() == null) {
            this.z = true;
        }
    }

    @Override  // androidx.viewpager.widget.PagerTitleStrip
    public final void c(int v, float f, boolean z) {
        int v1 = this.getHeight();
        int v2 = this.c.getLeft();
        int v3 = this.c.getRight();
        int v4 = v1 - this.r;
        this.x.set(v2 - this.v, v4, v3 + this.v, v1);
        super.c(v, f, z);
        this.y = (int)(Math.abs(f - 0.5f) * 510.0f);
        int v5 = this.c.getLeft();
        int v6 = this.c.getRight();
        this.x.union(v5 - this.v, v4, v6 + this.v, v1);
        this.invalidate(this.x);
    }

    public boolean getDrawFullUnderline() {
        return this.z;
    }

    @Override  // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.u);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.q;
    }

    @Override  // android.view.View
    public void onDraw(Canvas canvas0) {
        super.onDraw(canvas0);
        int v = this.getHeight();
        int v1 = this.c.getLeft();
        int v2 = this.c.getRight();
        Paint paint0 = this.w;
        paint0.setColor(this.y << 24 | this.q & 0xFFFFFF);
        canvas0.drawRect(((float)(v1 - this.v)), ((float)(v - this.r)), ((float)(v2 + this.v)), ((float)v), paint0);
        if(this.z) {
            paint0.setColor(0xFF000000 | this.q);
            float f = (float)this.getPaddingLeft();
            int v3 = this.getWidth();
            int v4 = this.getPaddingRight();
            canvas0.drawRect(f, ((float)(v - this.B)), ((float)(v3 - v4)), ((float)v), paint0);
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        if(v != 0 && this.C) {
            return false;
        }
        float f = motionEvent0.getX();
        float f1 = motionEvent0.getY();
        switch(v) {
            case 0: {
                this.D = f;
                this.E = f1;
                this.C = false;
                return true;
            label_11:
                if(v == 2) {
                    float f2 = (float)this.F;
                    if(Math.abs(f - this.D) > f2 || Math.abs(f1 - this.E) > f2) {
                        this.C = true;
                        return true;
                    }
                }
                break;
            }
            case 1: {
                TextView textView0 = this.c;
                int v1 = textView0.getLeft();
                int v2 = this.v;
                if(f < ((float)(v1 - v2))) {
                    this.a.setCurrentItem(this.a.getCurrentItem() - 1);
                    return true;
                }
                if(f > ((float)(textView0.getRight() + v2))) {
                    this.a.setCurrentItem(this.a.getCurrentItem() + 1);
                    return true;
                }
                break;
            }
            default: {
                goto label_11;
            }
        }
        return true;
    }

    @Override  // android.view.View
    public void setBackgroundColor(@ColorInt int v) {
        super.setBackgroundColor(v);
        if(!this.A) {
            this.z = (v & 0xFF000000) == 0;
        }
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        if(!this.A) {
            this.z = drawable0 == null;
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(@DrawableRes int v) {
        super.setBackgroundResource(v);
        if(!this.A) {
            this.z = v == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.z = z;
        this.A = true;
        this.invalidate();
    }

    @Override  // android.view.View
    public void setPadding(int v, int v1, int v2, int v3) {
        int v4 = this.s;
        if(v3 < v4) {
            v3 = v4;
        }
        super.setPadding(v, v1, v2, v3);
    }

    public void setTabIndicatorColor(@ColorInt int v) {
        this.q = v;
        this.w.setColor(v);
        this.invalidate();
    }

    public void setTabIndicatorColorResource(@ColorRes int v) {
        this.setTabIndicatorColor(ContextCompat.getColor(this.getContext(), v));
    }

    @Override  // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int v) {
        int v1 = this.t;
        if(v < v1) {
            v = v1;
        }
        super.setTextSpacing(v);
    }
}

