package a8;

import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

public final class d extends k {
    public int c;
    public float d;
    public float e;
    public float f;

    public d(CircularProgressIndicatorSpec circularProgressIndicatorSpec0) {
        super(circularProgressIndicatorSpec0);
        this.c = 1;
    }

    @Override  // a8.k
    public final void a(Canvas canvas0, Rect rect0, float f) {
        float f1 = ((float)rect0.width()) / ((float)this.g());
        float f2 = ((float)rect0.height()) / ((float)this.g());
        BaseProgressIndicatorSpec baseProgressIndicatorSpec0 = this.a;
        float f3 = ((float)((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).indicatorSize) / 2.0f + ((float)((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).indicatorInset);
        canvas0.translate(f3 * f1 + ((float)rect0.left), f3 * f2 + ((float)rect0.top));
        canvas0.scale(f1, f2);
        canvas0.rotate(-90.0f);
        canvas0.clipRect(-f3, -f3, f3, f3);
        this.c = ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).indicatorDirection == 0 ? 1 : -1;
        this.d = ((float)((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).trackThickness) * f;
        this.e = ((float)((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).trackCornerRadius) * f;
        this.f = ((float)(((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).indicatorSize - ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).trackThickness)) / 2.0f;
        if(this.b.isShowing() && ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).showAnimationBehavior == 2 || this.b.isHiding() && ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).hideAnimationBehavior == 1) {
            this.f = (1.0f - f) * ((float)((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).trackThickness) / 2.0f + this.f;
            return;
        }
        if(this.b.isShowing() && ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).showAnimationBehavior == 1 || this.b.isHiding() && ((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).hideAnimationBehavior == 2) {
            this.f -= (1.0f - f) * ((float)((CircularProgressIndicatorSpec)baseProgressIndicatorSpec0).trackThickness) / 2.0f;
        }
    }

    @Override  // a8.k
    public final void b(Canvas canvas0, Paint paint0, float f, float f1, int v) {
        if(f == f1) {
            return;
        }
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeCap(Paint.Cap.BUTT);
        paint0.setAntiAlias(true);
        paint0.setColor(v);
        paint0.setStrokeWidth(this.d);
        float f2 = f * 360.0f * ((float)this.c);
        float f3 = (f1 >= f ? f1 - f : f1 + 1.0f - f) * 360.0f * ((float)this.c);
        float f4 = -this.f;
        canvas0.drawArc(new RectF(f4, f4, this.f, this.f), f2, f3, false, paint0);
        if(this.e > 0.0f && Math.abs(f3) < 360.0f) {
            paint0.setStyle(Paint.Style.FILL);
            this.f(canvas0, paint0, this.d, this.e, f2);
            this.f(canvas0, paint0, this.d, this.e, f2 + f3);
        }
    }

    @Override  // a8.k
    public final void c(Canvas canvas0, Paint paint0) {
        int v = MaterialColors.compositeARGBWithAlpha(((CircularProgressIndicatorSpec)this.a).trackColor, this.b.getAlpha());
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeCap(Paint.Cap.BUTT);
        paint0.setAntiAlias(true);
        paint0.setColor(v);
        paint0.setStrokeWidth(this.d);
        canvas0.drawArc(new RectF(-this.f, -this.f, this.f, this.f), 0.0f, 360.0f, false, paint0);
    }

    @Override  // a8.k
    public final int d() {
        return this.g();
    }

    @Override  // a8.k
    public final int e() {
        return this.g();
    }

    public final void f(Canvas canvas0, Paint paint0, float f, float f1, float f2) {
        canvas0.save();
        canvas0.rotate(f2);
        canvas0.drawRoundRect(new RectF(this.f - f / 2.0f, f1, this.f + f / 2.0f, -f1), f1, f1, paint0);
        canvas0.restore();
    }

    public final int g() {
        return ((CircularProgressIndicatorSpec)this.a).indicatorInset * 2 + ((CircularProgressIndicatorSpec)this.a).indicatorSize;
    }
}

