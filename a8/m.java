package a8;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

public final class m extends k {
    public float c;
    public float d;
    public float e;
    public Path f;

    public m(LinearProgressIndicatorSpec linearProgressIndicatorSpec0) {
        super(linearProgressIndicatorSpec0);
        this.c = 300.0f;
    }

    @Override  // a8.k
    public final void a(Canvas canvas0, Rect rect0, float f) {
        this.c = (float)rect0.width();
        BaseProgressIndicatorSpec baseProgressIndicatorSpec0 = this.a;
        float f1 = (float)((LinearProgressIndicatorSpec)baseProgressIndicatorSpec0).trackThickness;
        float f2 = (float)rect0.left;
        float f3 = ((float)rect0.width()) / 2.0f + f2;
        float f4 = (float)rect0.top;
        float f5 = ((float)rect0.height()) / 2.0f + f4;
        canvas0.translate(f3, Math.max(0.0f, ((float)(rect0.height() - ((LinearProgressIndicatorSpec)baseProgressIndicatorSpec0).trackThickness)) / 2.0f) + f5);
        if(((LinearProgressIndicatorSpec)baseProgressIndicatorSpec0).a) {
            canvas0.scale(-1.0f, 1.0f);
        }
        if(this.b.isShowing() && ((LinearProgressIndicatorSpec)baseProgressIndicatorSpec0).showAnimationBehavior == 1 || this.b.isHiding() && ((LinearProgressIndicatorSpec)baseProgressIndicatorSpec0).hideAnimationBehavior == 2) {
            canvas0.scale(1.0f, -1.0f);
        }
        if(this.b.isShowing() || this.b.isHiding()) {
            canvas0.translate(0.0f, (f - 1.0f) * ((float)((LinearProgressIndicatorSpec)baseProgressIndicatorSpec0).trackThickness) / 2.0f);
        }
        canvas0.clipRect(-this.c / 2.0f, -f1 / 2.0f, this.c / 2.0f, f1 / 2.0f);
        this.d = ((float)((LinearProgressIndicatorSpec)baseProgressIndicatorSpec0).trackThickness) * f;
        this.e = ((float)((LinearProgressIndicatorSpec)baseProgressIndicatorSpec0).trackCornerRadius) * f;
    }

    @Override  // a8.k
    public final void b(Canvas canvas0, Paint paint0, float f, float f1, int v) {
        if(f == f1) {
            return;
        }
        float f2 = -this.c / 2.0f;
        float f3 = f * this.c + f2 - this.e * 2.0f;
        float f4 = f1 * this.c + f2;
        paint0.setStyle(Paint.Style.FILL);
        paint0.setAntiAlias(true);
        paint0.setColor(v);
        canvas0.save();
        canvas0.clipPath(this.f);
        canvas0.drawRoundRect(new RectF(f3, -this.d / 2.0f, f4, this.d / 2.0f), this.e, this.e, paint0);
        canvas0.restore();
    }

    @Override  // a8.k
    public final void c(Canvas canvas0, Paint paint0) {
        int v = MaterialColors.compositeARGBWithAlpha(((LinearProgressIndicatorSpec)this.a).trackColor, this.b.getAlpha());
        paint0.setStyle(Paint.Style.FILL);
        paint0.setAntiAlias(true);
        paint0.setColor(v);
        Path path0 = new Path();
        this.f = path0;
        path0.addRoundRect(new RectF(-this.c / 2.0f, -this.d / 2.0f, this.c / 2.0f, this.d / 2.0f), this.e, this.e, Path.Direction.CCW);
        canvas0.drawPath(this.f, paint0);
    }

    @Override  // a8.k
    public final int d() {
        return ((LinearProgressIndicatorSpec)this.a).trackThickness;
    }

    @Override  // a8.k
    public final int e() {
        return -1;
    }
}

