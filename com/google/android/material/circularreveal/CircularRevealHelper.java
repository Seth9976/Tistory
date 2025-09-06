package com.google.android.material.circularreveal;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path.Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.math.MathUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularRevealHelper {
    public interface Delegate {
        void actualDraw(Canvas arg1);

        boolean actualIsOpaque();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY;
    public final Delegate a;
    public final View b;
    public final Path c;
    public final Paint d;
    public final Paint e;
    public RevealInfo f;
    public Drawable g;
    public boolean h;
    public boolean i;

    static {
        CircularRevealHelper.STRATEGY = 2;
    }

    public CircularRevealHelper(Delegate circularRevealHelper$Delegate0) {
        this.a = circularRevealHelper$Delegate0;
        this.b = (View)circularRevealHelper$Delegate0;
        ((View)circularRevealHelper$Delegate0).setWillNotDraw(false);
        this.c = new Path();
        this.d = new Paint(7);
        Paint paint0 = new Paint(1);
        this.e = paint0;
        paint0.setColor(0);
    }

    public final boolean a() {
        int v = this.f == null || this.f.isInvalid() ? 1 : 0;
        return CircularRevealHelper.STRATEGY == 0 ? v == 0 && this.i : v ^ 1;
    }

    public final boolean b() {
        return !this.h && Color.alpha(this.e.getColor()) != 0;
    }

    public void buildCircularRevealCache() {
        if(CircularRevealHelper.STRATEGY == 0) {
            this.h = true;
            this.i = false;
            View view0 = this.b;
            view0.buildDrawingCache();
            Bitmap bitmap0 = view0.getDrawingCache();
            if(bitmap0 == null && view0.getWidth() != 0 && view0.getHeight() != 0) {
                bitmap0 = Bitmap.createBitmap(view0.getWidth(), view0.getHeight(), Bitmap.Config.ARGB_8888);
                view0.draw(new Canvas(bitmap0));
            }
            if(bitmap0 != null) {
                BitmapShader bitmapShader0 = new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                this.d.setShader(bitmapShader0);
            }
            this.h = false;
            this.i = true;
        }
    }

    public void destroyCircularRevealCache() {
        if(CircularRevealHelper.STRATEGY == 0) {
            this.i = false;
            this.b.destroyDrawingCache();
            this.d.setShader(null);
            this.b.invalidate();
        }
    }

    public void draw(@NonNull Canvas canvas0) {
        Paint paint0 = this.e;
        Delegate circularRevealHelper$Delegate0 = this.a;
        View view0 = this.b;
        if(this.a()) {
            int v = CircularRevealHelper.STRATEGY;
            switch(v) {
                case 0: {
                    canvas0.drawCircle(this.f.centerX, this.f.centerY, this.f.radius, this.d);
                    if(this.b()) {
                        canvas0.drawCircle(this.f.centerX, this.f.centerY, this.f.radius, paint0);
                    }
                    break;
                }
                case 1: {
                    int v1 = canvas0.save();
                    canvas0.clipPath(this.c);
                    circularRevealHelper$Delegate0.actualDraw(canvas0);
                    if(this.b()) {
                        canvas0.drawRect(0.0f, 0.0f, ((float)view0.getWidth()), ((float)view0.getHeight()), paint0);
                    }
                    canvas0.restoreToCount(v1);
                    break;
                }
                case 2: {
                    circularRevealHelper$Delegate0.actualDraw(canvas0);
                    if(this.b()) {
                        canvas0.drawRect(0.0f, 0.0f, ((float)view0.getWidth()), ((float)view0.getHeight()), paint0);
                    }
                    break;
                }
                default: {
                    throw new IllegalStateException("Unsupported strategy " + v);
                }
            }
        }
        else {
            circularRevealHelper$Delegate0.actualDraw(canvas0);
            if(this.b()) {
                canvas0.drawRect(0.0f, 0.0f, ((float)view0.getWidth()), ((float)view0.getHeight()), paint0);
            }
        }
        if(!this.h) {
            Drawable drawable0 = this.g;
            if(drawable0 != null && this.f != null) {
                Rect rect0 = drawable0.getBounds();
                float f = this.f.centerX - ((float)rect0.width()) / 2.0f;
                float f1 = this.f.centerY - ((float)rect0.height()) / 2.0f;
                canvas0.translate(f, f1);
                this.g.draw(canvas0);
                canvas0.translate(-f, -f1);
            }
        }
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.g;
    }

    @ColorInt
    public int getCircularRevealScrimColor() {
        return this.e.getColor();
    }

    @Nullable
    public RevealInfo getRevealInfo() {
        RevealInfo circularRevealWidget$RevealInfo0 = this.f;
        if(circularRevealWidget$RevealInfo0 == null) {
            return null;
        }
        RevealInfo circularRevealWidget$RevealInfo1 = new RevealInfo(circularRevealWidget$RevealInfo0);
        if(circularRevealWidget$RevealInfo1.isInvalid()) {
            circularRevealWidget$RevealInfo1.radius = MathUtils.distanceToFurthestCorner(circularRevealWidget$RevealInfo1.centerX, circularRevealWidget$RevealInfo1.centerY, 0.0f, 0.0f, this.b.getWidth(), this.b.getHeight());
        }
        return circularRevealWidget$RevealInfo1;
    }

    // 去混淆评级： 低(20)
    public boolean isOpaque() {
        return this.a.actualIsOpaque() && !this.a();
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable0) {
        this.g = drawable0;
        this.b.invalidate();
    }

    public void setCircularRevealScrimColor(@ColorInt int v) {
        this.e.setColor(v);
        this.b.invalidate();
    }

    public void setRevealInfo(@Nullable RevealInfo circularRevealWidget$RevealInfo0) {
        View view0 = this.b;
        if(circularRevealWidget$RevealInfo0 == null) {
            this.f = null;
        }
        else {
            RevealInfo circularRevealWidget$RevealInfo1 = this.f;
            if(circularRevealWidget$RevealInfo1 == null) {
                this.f = new RevealInfo(circularRevealWidget$RevealInfo0);
            }
            else {
                circularRevealWidget$RevealInfo1.set(circularRevealWidget$RevealInfo0);
            }
            if(MathUtils.geq(circularRevealWidget$RevealInfo0.radius, MathUtils.distanceToFurthestCorner(circularRevealWidget$RevealInfo0.centerX, circularRevealWidget$RevealInfo0.centerY, 0.0f, 0.0f, view0.getWidth(), view0.getHeight()), 0.0001f)) {
                this.f.radius = 3.402823E+38f;
            }
        }
        if(CircularRevealHelper.STRATEGY == 1) {
            Path path0 = this.c;
            path0.rewind();
            RevealInfo circularRevealWidget$RevealInfo2 = this.f;
            if(circularRevealWidget$RevealInfo2 != null) {
                path0.addCircle(circularRevealWidget$RevealInfo2.centerX, circularRevealWidget$RevealInfo2.centerY, circularRevealWidget$RevealInfo2.radius, Path.Direction.CW);
            }
        }
        view0.invalidate();
    }
}

