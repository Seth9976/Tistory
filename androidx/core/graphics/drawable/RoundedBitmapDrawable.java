package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class RoundedBitmapDrawable extends Drawable {
    public final Bitmap a;
    public int b;
    public int c;
    public final Paint d;
    public final BitmapShader e;
    public final Matrix f;
    public float g;
    public final Rect h;
    public final RectF i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;

    public RoundedBitmapDrawable(Resources resources0, Bitmap bitmap0) {
        this.b = 0xA0;
        this.c = 0x77;
        this.d = new Paint(3);
        this.f = new Matrix();
        this.h = new Rect();
        this.i = new RectF();
        this.j = true;
        if(resources0 != null) {
            this.b = resources0.getDisplayMetrics().densityDpi;
        }
        this.a = bitmap0;
        if(bitmap0 != null) {
            this.l = bitmap0.getScaledWidth(this.b);
            this.m = bitmap0.getScaledHeight(this.b);
            this.e = new BitmapShader(bitmap0, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            return;
        }
        this.m = -1;
        this.l = -1;
        this.e = null;
    }

    public void a(int v, int v1, int v2, Rect rect0, Rect rect1) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        if(this.j) {
            Rect rect0 = this.h;
            if(this.k) {
                int v = Math.min(this.l, this.m);
                this.a(this.c, v, v, this.getBounds(), this.h);
                int v1 = Math.min(rect0.width(), rect0.height());
                rect0.inset(Math.max(0, (rect0.width() - v1) / 2), Math.max(0, (rect0.height() - v1) / 2));
                this.g = ((float)v1) * 0.5f;
            }
            else {
                this.a(this.c, this.l, this.m, this.getBounds(), this.h);
            }
            RectF rectF0 = this.i;
            rectF0.set(rect0);
            BitmapShader bitmapShader0 = this.e;
            if(bitmapShader0 != null) {
                this.f.setTranslate(rectF0.left, rectF0.top);
                float f = rectF0.width() / ((float)this.a.getWidth());
                float f1 = rectF0.height() / ((float)this.a.getHeight());
                this.f.preScale(f, f1);
                bitmapShader0.setLocalMatrix(this.f);
                this.d.setShader(bitmapShader0);
            }
            this.j = false;
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas0) {
        Bitmap bitmap0 = this.a;
        if(bitmap0 == null) {
            return;
        }
        this.b();
        Paint paint0 = this.d;
        if(paint0.getShader() == null) {
            canvas0.drawBitmap(bitmap0, null, this.h, paint0);
            return;
        }
        canvas0.drawRoundRect(this.i, this.g, this.g, paint0);
    }

    @Override  // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.d.getAlpha();
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.a;
    }

    @Override  // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.d.getColorFilter();
    }

    public float getCornerRadius() {
        return this.g;
    }

    public int getGravity() {
        return this.c;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.m;
    }

    @Override  // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.l;
    }

    // 去混淆评级： 低(20)
    @Override  // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.c != 0x77 || this.k || (this.a == null || this.a.hasAlpha() || this.d.getAlpha() < 0xFF || this.g > 0.05f) ? -3 : -1;
    }

    @NonNull
    public final Paint getPaint() {
        return this.d;
    }

    public boolean hasAntiAlias() {
        return this.d.isAntiAlias();
    }

    public boolean hasMipMap() {
        throw new UnsupportedOperationException();
    }

    public boolean isCircular() {
        return this.k;
    }

    @Override  // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect0) {
        super.onBoundsChange(rect0);
        if(this.k) {
            this.g = (float)(Math.min(this.m, this.l) / 2);
        }
        this.j = true;
    }

    @Override  // android.graphics.drawable.Drawable
    public void setAlpha(int v) {
        Paint paint0 = this.d;
        if(v != paint0.getAlpha()) {
            paint0.setAlpha(v);
            this.invalidateSelf();
        }
    }

    public void setAntiAlias(boolean z) {
        this.d.setAntiAlias(z);
        this.invalidateSelf();
    }

    public void setCircular(boolean z) {
        this.k = z;
        this.j = true;
        if(z) {
            this.g = (float)(Math.min(this.m, this.l) / 2);
            this.d.setShader(this.e);
            this.invalidateSelf();
            return;
        }
        this.setCornerRadius(0.0f);
    }

    @Override  // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter0) {
        this.d.setColorFilter(colorFilter0);
        this.invalidateSelf();
    }

    public void setCornerRadius(float f) {
        if(this.g == f) {
            return;
        }
        boolean z = false;
        this.k = false;
        if(f > 0.05f) {
            z = true;
        }
        Paint paint0 = this.d;
        if(z) {
            paint0.setShader(this.e);
        }
        else {
            paint0.setShader(null);
        }
        this.g = f;
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.d.setDither(z);
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.d.setFilterBitmap(z);
        this.invalidateSelf();
    }

    public void setGravity(int v) {
        if(this.c != v) {
            this.c = v;
            this.j = true;
            this.invalidateSelf();
        }
    }

    public void setMipMap(boolean z) {
        throw new UnsupportedOperationException();
    }

    public void setTargetDensity(int v) {
        if(this.b != v) {
            if(v == 0) {
                v = 0xA0;
            }
            this.b = v;
            Bitmap bitmap0 = this.a;
            if(bitmap0 != null) {
                this.l = bitmap0.getScaledWidth(v);
                this.m = bitmap0.getScaledHeight(this.b);
            }
            this.invalidateSelf();
        }
    }

    public void setTargetDensity(@NonNull Canvas canvas0) {
        this.setTargetDensity(canvas0.getDensity());
    }

    public void setTargetDensity(@NonNull DisplayMetrics displayMetrics0) {
        this.setTargetDensity(displayMetrics0.densityDpi);
    }
}

