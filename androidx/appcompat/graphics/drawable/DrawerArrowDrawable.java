package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.style;
import androidx.appcompat.R.styleable;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class DrawerArrowDrawable extends Drawable {
    @RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ArrowDirection {
    }

    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    public final Paint a;
    public float b;
    public float c;
    public float d;
    public float e;
    public boolean f;
    public final Path g;
    public final int h;
    public boolean i;
    public float j;
    public float k;
    public int l;
    public static final float m;

    static {
        DrawerArrowDrawable.m = 0.785398f;
    }

    public DrawerArrowDrawable(Context context0) {
        Paint paint0 = new Paint();
        this.a = paint0;
        this.g = new Path();
        this.i = false;
        this.l = 2;
        paint0.setStyle(Paint.Style.STROKE);
        paint0.setStrokeJoin(Paint.Join.MITER);
        paint0.setStrokeCap(Paint.Cap.BUTT);
        paint0.setAntiAlias(true);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(null, styleable.DrawerArrowToggle, attr.drawerArrowStyle, style.Base_Widget_AppCompat_DrawerArrowToggle);
        this.setColor(typedArray0.getColor(styleable.DrawerArrowToggle_color, 0));
        this.setBarThickness(typedArray0.getDimension(styleable.DrawerArrowToggle_thickness, 0.0f));
        this.setSpinEnabled(typedArray0.getBoolean(styleable.DrawerArrowToggle_spinBars, true));
        this.setGapSize(((float)Math.round(typedArray0.getDimension(styleable.DrawerArrowToggle_gapBetweenBars, 0.0f))));
        this.h = typedArray0.getDimensionPixelSize(styleable.DrawerArrowToggle_drawableSize, 0);
        this.c = (float)Math.round(typedArray0.getDimension(styleable.DrawerArrowToggle_barLength, 0.0f));
        this.b = (float)Math.round(typedArray0.getDimension(styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.d = typedArray0.getDimension(styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        typedArray0.recycle();
    }

    public static float a(float f, float f1, float f2) {
        return (f1 - f) * f2 + f;
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(Canvas canvas0) {
        Rect rect0 = this.getBounds();
        boolean z = false;
        switch(this.l) {
            case 0: {
                break;
            }
            case 1: {
                z = true;
                break;
            }
            case 3: {
                if(DrawableCompat.getLayoutDirection(this) == 0) {
                    z = true;
                }
                break;
            }
            default: {
                if(DrawableCompat.getLayoutDirection(this) == 1) {
                    z = true;
                }
            }
        }
        float f = DrawerArrowDrawable.a(this.c, ((float)Math.sqrt(this.b * this.b * 2.0f)), this.j);
        float f1 = DrawerArrowDrawable.a(this.c, this.d, this.j);
        float f2 = (float)Math.round(DrawerArrowDrawable.a(0.0f, this.k, this.j));
        float f3 = DrawerArrowDrawable.a(0.0f, DrawerArrowDrawable.m, this.j);
        float f4 = DrawerArrowDrawable.a((z ? 0.0f : -180.0f), (z ? 180.0f : 0.0f), this.j);
        float f5 = (float)Math.round(Math.cos(f3) * ((double)f));
        float f6 = (float)Math.round(Math.sin(f3) * ((double)f));
        Path path0 = this.g;
        path0.rewind();
        float f7 = this.e;
        Paint paint0 = this.a;
        float f8 = DrawerArrowDrawable.a(paint0.getStrokeWidth() + f7, -this.k, this.j);
        path0.moveTo(-f1 / 2.0f + f2, 0.0f);
        path0.rLineTo(f1 - f2 * 2.0f, 0.0f);
        path0.moveTo(-f1 / 2.0f, f8);
        path0.rLineTo(f5, f6);
        path0.moveTo(-f1 / 2.0f, -f8);
        path0.rLineTo(f5, -f6);
        path0.close();
        canvas0.save();
        float f9 = paint0.getStrokeWidth();
        float f10 = ((float)rect0.height()) - 3.0f * f9;
        float f11 = f9 * 1.5f + this.e + ((float)(((int)(f10 - 2.0f * this.e)) / 4 * 2));
        canvas0.translate(((float)rect0.centerX()), f11);
        if(this.f) {
            canvas0.rotate(f4 * ((float)((this.i ^ z) == 0 ? 1 : -1)));
        }
        else if(z) {
            canvas0.rotate(180.0f);
        }
        canvas0.drawPath(path0, paint0);
        canvas0.restore();
    }

    public float getArrowHeadLength() {
        return this.b;
    }

    public float getArrowShaftLength() {
        return this.d;
    }

    public float getBarLength() {
        return this.c;
    }

    public float getBarThickness() {
        return this.a.getStrokeWidth();
    }

    @ColorInt
    public int getColor() {
        return this.a.getColor();
    }

    public int getDirection() {
        return this.l;
    }

    public float getGapSize() {
        return this.e;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.h;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.h;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint getPaint() {
        return this.a;
    }

    @FloatRange(from = 0.0, to = 1.0)
    public float getProgress() {
        return this.j;
    }

    public boolean isSpinEnabled() {
        return this.f;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        Paint paint0 = this.a;
        if(v != paint0.getAlpha()) {
            paint0.setAlpha(v);
            this.invalidateSelf();
        }
    }

    public void setArrowHeadLength(float f) {
        if(this.b != f) {
            this.b = f;
            this.invalidateSelf();
        }
    }

    public void setArrowShaftLength(float f) {
        if(this.d != f) {
            this.d = f;
            this.invalidateSelf();
        }
    }

    public void setBarLength(float f) {
        if(this.c != f) {
            this.c = f;
            this.invalidateSelf();
        }
    }

    public void setBarThickness(float f) {
        Paint paint0 = this.a;
        if(paint0.getStrokeWidth() != f) {
            paint0.setStrokeWidth(f);
            this.k = (float)(Math.cos(DrawerArrowDrawable.m) * ((double)(f / 2.0f)));
            this.invalidateSelf();
        }
    }

    public void setColor(@ColorInt int v) {
        Paint paint0 = this.a;
        if(v != paint0.getColor()) {
            paint0.setColor(v);
            this.invalidateSelf();
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.a.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }

    public void setDirection(int v) {
        if(v != this.l) {
            this.l = v;
            this.invalidateSelf();
        }
    }

    public void setGapSize(float f) {
        if(f != this.e) {
            this.e = f;
            this.invalidateSelf();
        }
    }

    public void setProgress(@FloatRange(from = 0.0, to = 1.0) float f) {
        if(this.j != f) {
            this.j = f;
            this.invalidateSelf();
        }
    }

    public void setSpinEnabled(boolean z) {
        if(this.f != z) {
            this.f = z;
            this.invalidateSelf();
        }
    }

    public void setVerticalMirror(boolean z) {
        if(this.i != z) {
            this.i = z;
            this.invalidateSelf();
        }
    }
}

