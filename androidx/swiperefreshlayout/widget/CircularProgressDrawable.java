package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Cap;
import android.graphics.Path.FillType;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularProgressDrawable extends Drawable implements Animatable {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProgressDrawableSize {
    }

    public static final int DEFAULT = 1;
    public static final int LARGE;
    public final d a;
    public float b;
    public final Resources c;
    public final ValueAnimator d;
    public float e;
    public boolean f;
    public static final LinearInterpolator g;
    public static final FastOutSlowInInterpolator h;
    public static final int[] i;

    static {
        CircularProgressDrawable.g = new LinearInterpolator();
        CircularProgressDrawable.h = new FastOutSlowInInterpolator();
        CircularProgressDrawable.i = new int[]{0xFF000000};
    }

    public CircularProgressDrawable(@NonNull Context context0) {
        this.c = ((Context)Preconditions.checkNotNull(context0)).getResources();
        d d0 = new d();
        this.a = d0;
        d0.i = CircularProgressDrawable.i;
        d0.a(0);
        this.setStrokeWidth(2.5f);
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        valueAnimator0.addUpdateListener(new b(this, d0));
        valueAnimator0.setRepeatCount(-1);
        valueAnimator0.setRepeatMode(1);
        valueAnimator0.setInterpolator(CircularProgressDrawable.g);
        valueAnimator0.addListener(new c(this, d0));
        this.d = valueAnimator0;
    }

    public final void a(float f, d d0, boolean z) {
        float f3;
        float f2;
        if(this.f) {
            CircularProgressDrawable.c(f, d0);
            d0.e = (d0.l - 0.01f - d0.k) * f + d0.k;
            d0.f = d0.l;
            d0.g = (((float)(Math.floor(d0.m / 0.8f) + 1.0)) - d0.m) * f + d0.m;
            return;
        }
        if(f != 1.0f || z) {
            float f1 = d0.m;
            FastOutSlowInInterpolator fastOutSlowInInterpolator0 = CircularProgressDrawable.h;
            if(Float.compare(f, 0.5f) < 0) {
                f2 = d0.k;
                f3 = fastOutSlowInInterpolator0.getInterpolation(f / 0.5f) * 0.79f + 0.01f + f2;
            }
            else {
                float f4 = d0.k + 0.79f;
                f2 = f4 - ((1.0f - fastOutSlowInInterpolator0.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f + 0.01f);
                f3 = f4;
            }
            float f5 = (f + this.e) * 216.0f;
            d0.e = f2;
            d0.f = f3;
            d0.g = 0.21f * f + f1;
            this.b = f5;
        }
    }

    public final void b(float f, float f1, float f2, float f3) {
        float f4 = this.c.getDisplayMetrics().density;
        float f5 = f1 * f4;
        this.a.h = f5;
        this.a.b.setStrokeWidth(f5);
        this.a.q = f * f4;
        this.a.a(0);
        this.a.r = (int)(f2 * f4);
        this.a.s = (int)(f3 * f4);
    }

    public static void c(float f, d d0) {
        if(f > 0.75f) {
            float f1 = (f - 0.75f) / 0.25f;
            int[] arr_v = d0.i;
            int v = d0.j;
            int v1 = arr_v[v];
            int v2 = arr_v[(v + 1) % arr_v.length];
            int v3 = v1 >> 24 & 0xFF;
            int v4 = v1 >> 16 & 0xFF;
            int v5 = v1 >> 8 & 0xFF;
            d0.u = v3 + ((int)(((float)((v2 >> 24 & 0xFF) - v3)) * f1)) << 24 | v4 + ((int)(((float)((v2 >> 16 & 0xFF) - v4)) * f1)) << 16 | v5 + ((int)(((float)((v2 >> 8 & 0xFF) - v5)) * f1)) << 8 | (v1 & 0xFF) + ((int)(f1 * ((float)((v2 & 0xFF) - (v1 & 0xFF)))));
            return;
        }
        d0.u = d0.i[d0.j];
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Rect rect0 = this.getBounds();
        canvas0.save();
        canvas0.rotate(this.b, rect0.exactCenterX(), rect0.exactCenterY());
        d d0 = this.a;
        RectF rectF0 = d0.a;
        float f = d0.q <= 0.0f ? ((float)Math.min(rect0.width(), rect0.height())) / 2.0f - Math.max(((float)d0.r) * d0.p / 2.0f, d0.h / 2.0f) : d0.h / 2.0f + d0.q;
        rectF0.set(((float)rect0.centerX()) - f, ((float)rect0.centerY()) - f, ((float)rect0.centerX()) + f, ((float)rect0.centerY()) + f);
        float f1 = (d0.e + d0.g) * 360.0f;
        float f2 = (d0.f + d0.g) * 360.0f - f1;
        d0.b.setColor(d0.u);
        d0.b.setAlpha(d0.t);
        float f3 = d0.h / 2.0f;
        rectF0.inset(f3, f3);
        canvas0.drawCircle(rectF0.centerX(), rectF0.centerY(), rectF0.width() / 2.0f, d0.d);
        rectF0.inset(-f3, -f3);
        canvas0.drawArc(rectF0, f1, f2, false, d0.b);
        if(d0.n) {
            Path path0 = d0.o;
            if(path0 == null) {
                Path path1 = new Path();
                d0.o = path1;
                path1.setFillType(Path.FillType.EVEN_ODD);
            }
            else {
                path0.reset();
            }
            float f4 = Math.min(rectF0.width(), rectF0.height());
            float f5 = ((float)d0.r) * d0.p / 2.0f;
            d0.o.moveTo(0.0f, 0.0f);
            d0.o.lineTo(((float)d0.r) * d0.p, 0.0f);
            d0.o.lineTo(((float)d0.r) * d0.p / 2.0f, ((float)d0.s) * d0.p);
            Path path2 = d0.o;
            float f6 = rectF0.centerX();
            float f7 = rectF0.centerY();
            path2.offset(f6 + f4 / 2.0f - f5, d0.h / 2.0f + f7);
            d0.o.close();
            d0.c.setColor(d0.u);
            d0.c.setAlpha(d0.t);
            canvas0.save();
            canvas0.rotate(f1 + f2, rectF0.centerX(), rectF0.centerY());
            canvas0.drawPath(d0.o, d0.c);
            canvas0.restore();
        }
        canvas0.restore();
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.t;
    }

    public boolean getArrowEnabled() {
        return this.a.n;
    }

    public float getArrowHeight() {
        return (float)this.a.s;
    }

    public float getArrowScale() {
        return this.a.p;
    }

    public float getArrowWidth() {
        return (float)this.a.r;
    }

    public int getBackgroundColor() {
        return this.a.d.getColor();
    }

    public float getCenterRadius() {
        return this.a.q;
    }

    @NonNull
    public int[] getColorSchemeColors() {
        return this.a.i;
    }

    public float getEndTrim() {
        return this.a.f;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float getProgressRotation() {
        return this.a.g;
    }

    public float getStartTrim() {
        return this.a.e;
    }

    @NonNull
    public Paint.Cap getStrokeCap() {
        return this.a.b.getStrokeCap();
    }

    public float getStrokeWidth() {
        return this.a.h;
    }

    @Override  // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.d.isRunning();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        this.a.t = v;
        this.invalidateSelf();
    }

    public void setArrowDimensions(float f, float f1) {
        this.a.r = (int)f;
        this.a.s = (int)f1;
        this.invalidateSelf();
    }

    public void setArrowEnabled(boolean z) {
        d d0 = this.a;
        if(d0.n != z) {
            d0.n = z;
        }
        this.invalidateSelf();
    }

    public void setArrowScale(float f) {
        d d0 = this.a;
        if(f != d0.p) {
            d0.p = f;
        }
        this.invalidateSelf();
    }

    public void setBackgroundColor(int v) {
        this.a.d.setColor(v);
        this.invalidateSelf();
    }

    public void setCenterRadius(float f) {
        this.a.q = f;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.a.b.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }

    public void setColorSchemeColors(@NonNull int[] arr_v) {
        this.a.i = arr_v;
        this.a.a(0);
        this.a.a(0);
        this.invalidateSelf();
    }

    public void setProgressRotation(float f) {
        this.a.g = f;
        this.invalidateSelf();
    }

    public void setStartEndTrim(float f, float f1) {
        this.a.e = f;
        this.a.f = f1;
        this.invalidateSelf();
    }

    public void setStrokeCap(@NonNull Paint.Cap paint$Cap0) {
        this.a.b.setStrokeCap(paint$Cap0);
        this.invalidateSelf();
    }

    public void setStrokeWidth(float f) {
        this.a.h = f;
        this.a.b.setStrokeWidth(f);
        this.invalidateSelf();
    }

    public void setStyle(int v) {
        if(v == 0) {
            this.b(11.0f, 3.0f, 12.0f, 6.0f);
        }
        else {
            this.b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Animatable
    public void start() {
        this.d.cancel();
        d d0 = this.a;
        d0.k = d0.e;
        d0.l = d0.f;
        d0.m = d0.g;
        if(d0.f != d0.e) {
            this.f = true;
            this.d.setDuration(666L);
            this.d.start();
            return;
        }
        d0.a(0);
        d0.k = 0.0f;
        d0.l = 0.0f;
        d0.m = 0.0f;
        d0.e = 0.0f;
        d0.f = 0.0f;
        d0.g = 0.0f;
        this.d.setDuration(0x534L);
        this.d.start();
    }

    @Override  // android.graphics.drawable.Animatable
    public void stop() {
        this.d.cancel();
        this.b = 0.0f;
        d d0 = this.a;
        if(d0.n) {
            d0.n = false;
        }
        d0.a(0);
        d0.k = 0.0f;
        d0.l = 0.0f;
        d0.m = 0.0f;
        d0.e = 0.0f;
        d0.f = 0.0f;
        d0.g = 0.0f;
        this.invalidateSelf();
    }
}

