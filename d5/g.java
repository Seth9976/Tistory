package d5;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import androidx.annotation.ColorInt;
import androidx.core.content.res.ComplexColorCompat;

public final class g extends j {
    public ComplexColorCompat d;
    public float e;
    public ComplexColorCompat f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    // 去混淆评级： 低(20)
    @Override  // d5.i
    public final boolean a() {
        return this.f.isStateful() || this.d.isStateful();
    }

    @Override  // d5.i
    public final boolean b(int[] arr_v) {
        boolean z = this.f.onStateChanged(arr_v);
        return this.d.onStateChanged(arr_v) | z;
    }

    public float getFillAlpha() {
        return this.h;
    }

    @ColorInt
    public int getFillColor() {
        return this.f.getColor();
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    @ColorInt
    public int getStrokeColor() {
        return this.d.getColor();
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f) {
        this.h = f;
    }

    public void setFillColor(int v) {
        this.f.setColor(v);
    }

    public void setStrokeAlpha(float f) {
        this.g = f;
    }

    public void setStrokeColor(int v) {
        this.d.setColor(v);
    }

    public void setStrokeWidth(float f) {
        this.e = f;
    }

    public void setTrimPathEnd(float f) {
        this.j = f;
    }

    public void setTrimPathOffset(float f) {
        this.k = f;
    }

    public void setTrimPathStart(float f) {
        this.i = f;
    }
}

