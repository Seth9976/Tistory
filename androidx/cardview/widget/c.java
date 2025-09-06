package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class c extends Drawable {
    public float a;
    public final Paint b;
    public final RectF c;
    public final Rect d;
    public float e;
    public boolean f;
    public boolean g;
    public ColorStateList h;
    public PorterDuffColorFilter i;
    public ColorStateList j;
    public PorterDuff.Mode k;

    public c(float f, ColorStateList colorStateList0) {
        this.f = false;
        this.g = true;
        this.k = PorterDuff.Mode.SRC_IN;
        this.a = f;
        Paint paint0 = new Paint(5);
        this.b = paint0;
        if(colorStateList0 == null) {
            colorStateList0 = ColorStateList.valueOf(0);
        }
        this.h = colorStateList0;
        paint0.setColor(colorStateList0.getColorForState(this.getState(), this.h.getDefaultColor()));
        this.c = new RectF();
        this.d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList0, PorterDuff.Mode porterDuff$Mode0) {
        return colorStateList0 == null || porterDuff$Mode0 == null ? null : new PorterDuffColorFilter(colorStateList0.getColorForState(this.getState(), 0), porterDuff$Mode0);
    }

    public final void b(Rect rect0) {
        if(rect0 == null) {
            rect0 = this.getBounds();
        }
        RectF rectF0 = this.c;
        rectF0.set(((float)rect0.left), ((float)rect0.top), ((float)rect0.right), ((float)rect0.bottom));
        Rect rect1 = this.d;
        rect1.set(rect0);
        if(this.f) {
            float f = d.b(this.e, this.a, this.g);
            rect1.inset(((int)Math.ceil(d.a(this.e, this.a, this.g))), ((int)Math.ceil(f)));
            rectF0.set(rect1);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        boolean z;
        Paint paint0 = this.b;
        if(this.i == null || paint0.getColorFilter() != null) {
            z = false;
        }
        else {
            paint0.setColorFilter(this.i);
            z = true;
        }
        canvas0.drawRoundRect(this.c, this.a, this.a, paint0);
        if(z) {
            paint0.setColorFilter(null);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline0) {
        outline0.setRoundRect(this.d, this.a);
    }

    // 去混淆评级： 中等(50)
    @Override  // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.j != null && this.j.isStateful() || (this.h != null && this.h.isStateful() || super.isStateful());
    }

    @Override  // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect0) {
        super.onBoundsChange(rect0);
        this.b(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] arr_v) {
        int v = this.h.getColorForState(arr_v, this.h.getDefaultColor());
        Paint paint0 = this.b;
        boolean z = v != paint0.getColor();
        if(z) {
            paint0.setColor(v);
        }
        ColorStateList colorStateList0 = this.j;
        if(colorStateList0 != null) {
            PorterDuff.Mode porterDuff$Mode0 = this.k;
            if(porterDuff$Mode0 != null) {
                this.i = this.a(colorStateList0, porterDuff$Mode0);
                return true;
            }
        }
        return z;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        this.b.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        this.b.setColorFilter(colorFilter0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList0) {
        this.j = colorStateList0;
        this.i = this.a(colorStateList0, this.k);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.k = porterDuff$Mode0;
        this.i = this.a(this.j, porterDuff$Mode0);
        this.invalidateSelf();
    }
}

