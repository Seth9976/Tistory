package androidx.constraintlayout.compose;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.constraintlayout.core.motion.Motion;

public final class f0 {
    public float[] a;
    public int[] b;
    public float[] c;
    public Path d;
    public Paint e;
    public Paint f;
    public Paint g;
    public Paint h;
    public Paint i;
    public float[] j;
    public int k;
    public Rect l;

    public final void a(Canvas canvas0, int v, int v1, Motion motion0, int v2, int v3) {
        int v9;
        float f3;
        float f2;
        Paint paint1;
        int v7;
        int v6;
        int[] arr_v = this.b;
        if(v == 4) {
            boolean z = false;
            boolean z1 = false;
            for(int v4 = 0; v4 < this.k; ++v4) {
                int v5 = arr_v[v4];
                if(v5 == 1) {
                    z = true;
                }
                if(v5 == 0) {
                    z1 = true;
                }
            }
            if(z) {
                canvas0.drawLine(this.a[0], this.a[1], this.a[this.a.length - 2], this.a[this.a.length - 1], this.g);
            }
            if(z1) {
                this.b(canvas0);
            }
        }
        if(v == 2) {
            canvas0.drawLine(this.a[0], this.a[1], this.a[this.a.length - 2], this.a[this.a.length - 1], this.g);
        }
        if(v == 3) {
            this.b(canvas0);
        }
        canvas0.drawLines(this.a, this.e);
        if(motion0.getView() == null) {
            v6 = 0;
            v7 = 0;
        }
        else {
            v6 = motion0.getView().getWidth();
            v7 = motion0.getView().getHeight();
        }
        int v8 = 1;
        while(v8 < v1 - 1) {
            if(v != 4 || arr_v[v8 - 1] != 0) {
                float[] arr_f = this.c;
                float f = arr_f[v8 * 2];
                float f1 = arr_f[v8 * 2 + 1];
                this.d.reset();
                this.d.moveTo(f, f1 + 10.0f);
                this.d.lineTo(f + 10.0f, f1);
                this.d.lineTo(f, f1 - 10.0f);
                this.d.lineTo(f - 10.0f, f1);
                this.d.close();
                motion0.getKeyFrame(v8 - 1);
                Paint paint0 = this.i;
                if(v == 4) {
                    int v10 = arr_v[v8 - 1];
                    if(v10 == 1) {
                        this.d(canvas0, f - 0.0f, f1 - 0.0f);
                    }
                    else if(v10 == 0) {
                        this.c(canvas0, f - 0.0f, f1 - 0.0f);
                    }
                    else if(v10 == 2) {
                        paint1 = paint0;
                        f2 = f1;
                        f3 = f;
                        v9 = v8;
                        this.e(canvas0, f - 0.0f, f1 - 0.0f, v6, v7, v2, v3);
                        goto label_63;
                    }
                    paint1 = paint0;
                    f2 = f1;
                    f3 = f;
                    v9 = v8;
                label_63:
                    canvas0.drawPath(this.d, paint1);
                }
                else {
                    paint1 = paint0;
                    f2 = f1;
                    f3 = f;
                    v9 = v8;
                }
                if(v == 2) {
                    this.d(canvas0, f3 - 0.0f, f2 - 0.0f);
                }
                if(v == 3) {
                    this.c(canvas0, f3 - 0.0f, f2 - 0.0f);
                }
                if(v == 6) {
                    this.e(canvas0, f3 - 0.0f, f2 - 0.0f, v6, v7, v2, v3);
                }
                canvas0.drawPath(this.d, paint1);
            }
            else {
                v9 = v8;
            }
            v8 = v9 + 1;
        }
        float[] arr_f1 = this.a;
        if(arr_f1.length > 1) {
            Paint paint2 = this.f;
            canvas0.drawCircle(arr_f1[0], arr_f1[1], 8.0f, paint2);
            canvas0.drawCircle(this.a[this.a.length - 2], this.a[this.a.length - 1], 8.0f, paint2);
        }
    }

    public final void b(Canvas canvas0) {
        float[] arr_f = this.a;
        float f = arr_f[0];
        float f1 = arr_f[1];
        float f2 = arr_f[arr_f.length - 2];
        float f3 = arr_f[arr_f.length - 1];
        Paint paint0 = this.g;
        canvas0.drawLine(Math.min(f, f2), Math.max(f1, f3), Math.max(f, f2), Math.max(f1, f3), paint0);
        canvas0.drawLine(Math.min(f, f2), Math.min(f1, f3), Math.min(f, f2), Math.max(f1, f3), paint0);
    }

    public final void c(Canvas canvas0, float f, float f1) {
        float[] arr_f = this.a;
        float f2 = arr_f[0];
        float f3 = arr_f[1];
        float f4 = arr_f[arr_f.length - 2];
        float f5 = arr_f[arr_f.length - 1];
        float f6 = f - Math.min(f2, f4);
        float f7 = Math.max(f3, f5) - f1;
        String s = "" + ((float)(((int)(((double)(f6 * 100.0f / Math.abs(f4 - f2))) + 0.5)))) / 100.0f;
        Paint paint0 = this.h;
        paint0.getTextBounds(s, 0, s.length(), this.l);
        Rect rect0 = this.l;
        canvas0.drawText(s, f6 / 2.0f - ((float)(rect0.width() / 2)) + Math.min(f2, f4), f1 - 20.0f, paint0);
        Paint paint1 = this.g;
        canvas0.drawLine(f, f1, Math.min(f2, f4), f1, paint1);
        String s1 = "" + ((float)(((int)(((double)(f7 * 100.0f / Math.abs(f5 - f3))) + 0.5)))) / 100.0f;
        paint0.getTextBounds(s1, 0, s1.length(), this.l);
        canvas0.drawText(s1, f + 5.0f, Math.max(f3, f5) - (f7 / 2.0f - ((float)(rect0.height() / 2))), paint0);
        canvas0.drawLine(f, f1, f, Math.max(f3, f5), paint1);
    }

    public final void d(Canvas canvas0, float f, float f1) {
        float[] arr_f = this.a;
        float f2 = arr_f[0];
        float f3 = arr_f[1];
        float f4 = arr_f[arr_f.length - 2];
        float f5 = arr_f[arr_f.length - 1];
        float f6 = (float)Math.hypot(f2 - f4, f3 - f5);
        float f7 = f4 - f2;
        float f8 = f5 - f3;
        float f9 = ((f1 - f3) * f8 + (f - f2) * f7) / (f6 * f6);
        float f10 = f2 + f7 * f9;
        float f11 = f3 + f9 * f8;
        Path path0 = new Path();
        path0.moveTo(f, f1);
        path0.lineTo(f10, f11);
        float f12 = (float)Math.hypot(f10 - f, f11 - f1);
        String s = "" + ((float)(((int)(f12 * 100.0f / f6)))) / 100.0f;
        Paint paint0 = this.h;
        paint0.getTextBounds(s, 0, s.length(), this.l);
        canvas0.drawTextOnPath(s, path0, f12 / 2.0f - ((float)(this.l.width() / 2)), -20.0f, paint0);
        canvas0.drawLine(f, f1, f10, f11, this.g);
    }

    public final void e(Canvas canvas0, float f, float f1, int v, int v1, int v2, int v3) {
        String s = "" + ((float)(((int)(((double)((f - ((float)(v / 2))) * 100.0f / ((float)(v2 - v)))) + 0.5)))) / 100.0f;
        Paint paint0 = this.h;
        paint0.getTextBounds(s, 0, s.length(), this.l);
        Rect rect0 = this.l;
        canvas0.drawText(s, f / 2.0f - ((float)(rect0.width() / 2)) + 0.0f, f1 - 20.0f, paint0);
        Paint paint1 = this.g;
        canvas0.drawLine(f, f1, 0.0f, f1, paint1);
        String s1 = "" + ((float)(((int)(((double)((f1 - ((float)(v1 / 2))) * 100.0f / ((float)(v3 - v1)))) + 0.5)))) / 100.0f;
        paint0.getTextBounds(s1, 0, s1.length(), this.l);
        canvas0.drawText(s1, f + 5.0f, 0.0f - (f1 / 2.0f - ((float)(rect0.height() / 2))), paint0);
        canvas0.drawLine(f, f1, f, 1.0f, paint1);
    }
}

