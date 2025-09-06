package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.core.graphics.ColorUtils;
import c3.a;
import c3.j;

@RestrictTo({Scope.LIBRARY_GROUP})
public class CamColor {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public CamColor(float f, float f1, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    public static CamColor a(int v) {
        float[] arr_f = new float[7];
        float[] arr_f1 = new float[3];
        CamColor.b(v, j.k, arr_f, arr_f1);
        return new CamColor(arr_f1[0], arr_f1[1], arr_f[0], arr_f[4], arr_f[5], arr_f[6]);
    }

    public static void b(int v, j j0, float[] arr_f, float[] arr_f1) {
        float f = a.c(Color.red(v));
        float f1 = a.c(Color.green(v));
        float f2 = a.c(Color.blue(v));
        float[] arr_f2 = a.d[0];
        float f3 = arr_f2[2] * f2 + (arr_f2[1] * f1 + arr_f2[0] * f);
        arr_f1[0] = f3;
        float[] arr_f3 = a.d[1];
        float f4 = arr_f3[2] * f2 + (arr_f3[1] * f1 + arr_f3[0] * f);
        arr_f1[1] = f4;
        float[] arr_f4 = a.d[2];
        float f5 = f2 * arr_f4[2] + (f1 * arr_f4[1] + f * arr_f4[0]);
        arr_f1[2] = f5;
        float[] arr_f5 = a.a[0];
        float f6 = arr_f5[2] * f5 + (arr_f5[1] * f4 + arr_f5[0] * f3);
        float[] arr_f6 = a.a[1];
        float f7 = arr_f6[2] * f5 + (arr_f6[1] * f4 + arr_f6[0] * f3);
        float[] arr_f7 = a.a[2];
        float f8 = f5 * arr_f7[2] + (f4 * arr_f7[1] + f3 * arr_f7[0]);
        float f9 = j0.g[0] * f6;
        float f10 = j0.g[1] * f7;
        float f11 = j0.g[2] * f8;
        float f12 = (float)Math.pow(((double)(Math.abs(f9) * j0.h)) / 100.0, 0.42);
        float f13 = (float)Math.pow(((double)(Math.abs(f10) * j0.h)) / 100.0, 0.42);
        float f14 = (float)Math.pow(((double)(Math.abs(f11) * j0.h)) / 100.0, 0.42);
        float f15 = Math.signum(f9) * 400.0f * f12 / (f12 + 27.129999f);
        float f16 = Math.signum(f10) * 400.0f * f13 / (f13 + 27.129999f);
        float f17 = Math.signum(f11) * 400.0f * f14 / (f14 + 27.129999f);
        float f18 = ((float)(((double)f16) * -12.0 + ((double)f15) * 11.0 + ((double)f17))) / 11.0f;
        float f19 = ((float)(((double)(f15 + f16)) - ((double)f17) * 2.0)) / 9.0f;
        float f20 = ((float)Math.atan2(f19, f18)) * 180.0f / 3.141593f;
        if(Float.compare(f20, 0.0f) < 0) {
            f20 += 360.0f;
        }
        else if(f20 >= 360.0f) {
            f20 -= 360.0f;
        }
        float f21 = ((float)Math.pow((f15 * 40.0f + f16 * 20.0f + f17) / 20.0f * j0.b / j0.a, j0.j * j0.d)) * 100.0f;
        float f22 = 4.0f / j0.d * ((float)Math.sqrt(f21 / 100.0f)) * (j0.a + 4.0f) * j0.i;
        float f23 = ((float)Math.pow(1.64 - Math.pow(0.29, j0.f), 0.73)) * ((float)Math.pow(((float)(Math.cos(((double)(((double)f20) < 20.14 ? f20 + 360.0f : f20)) * 3.141593 / 180.0 + 2.0) + 3.8)) * 961.538452f * j0.e * j0.c * ((float)Math.sqrt(f19 * f19 + f18 * f18)) / ((21.0f * f17 + (f15 * 20.0f + f16 * 20.0f)) / 20.0f + 0.305f), 0.9));
        float f24 = ((float)Math.sqrt(((double)f21) / 100.0)) * f23;
        float f25 = j0.i * f24;
        float f26 = ((float)Math.sqrt(f23 * j0.d / (j0.a + 4.0f))) * 50.0f;
        float f27 = ((float)Math.log(0.0228f * f25 + 1.0f)) * 43.85965f;
        double f28 = (double)(3.141593f * f20 / 180.0f);
        float f29 = ((float)Math.cos(f28)) * f27;
        float f30 = f27 * ((float)Math.sin(f28));
        arr_f1[0] = f20;
        arr_f1[1] = f24;
        if(arr_f != null) {
            arr_f[0] = f21;
            arr_f[1] = f22;
            arr_f[2] = f25;
            arr_f[3] = f26;
            arr_f[4] = 1.7f * f21 / (0.007f * f21 + 1.0f);
            arr_f[5] = f29;
            arr_f[6] = f30;
        }
    }

    public static CamColor c(float f, float f1, float f2) {
        float f3 = f1 / ((float)Math.sqrt(((double)f) / 100.0)) * j.k.d / (j.k.a + 4.0f);
        float f4 = ((float)Math.log(((double)(j.k.i * f1)) * 0.0228 + 1.0)) * 43.85965f;
        double f5 = (double)(3.141593f * f2 / 180.0f);
        return new CamColor(f2, f1, f, 1.7f * f / (0.007f * f + 1.0f), f4 * ((float)Math.cos(f5)), f4 * ((float)Math.sin(f5)));
    }

    public final int d(j j0) {
        float f = (float)Math.pow(((double)(Double.compare(this.b, 0.0) == 0 || ((double)this.c) == 0.0 ? 0.0f : this.b / ((float)Math.sqrt(((double)this.c) / 100.0)))) / Math.pow(1.64 - Math.pow(0.29, j0.f), 0.73), 1.111111);
        double f1 = (double)(this.a * 3.141593f / 180.0f);
        float f2 = j0.a * ((float)Math.pow(((double)this.c) / 100.0, 1.0 / ((double)j0.d) / ((double)j0.j))) / j0.b;
        float f3 = (float)Math.sin(f1);
        float f4 = (float)Math.cos(f1);
        float f5 = (f2 + 0.305f) * 23.0f * f / (f * 108.0f * f3 + (11.0f * f * f4 + ((float)(Math.cos(f1 + 2.0) + 3.8)) * 961.538452f * j0.e * j0.c * 23.0f));
        float f6 = f4 * f5;
        float f7 = f5 * f3;
        float f8 = (288.0f * f7 + (451.0f * f6 + f2 * 460.0f)) / 1403.0f;
        float f9 = (f2 * 460.0f - 891.0f * f6 - f7 * 261.0f) / 1403.0f;
        float f10 = (f2 * 460.0f - f6 * 220.0f - f7 * 6300.0f) / 1403.0f;
        float f11 = Math.signum(f8) * (100.0f / j0.h) * ((float)Math.pow(((float)Math.max(0.0, ((double)Math.abs(f8)) * 27.13 / (400.0 - ((double)Math.abs(f8))))), 2.380952)) / j0.g[0];
        float f12 = Math.signum(f9) * (100.0f / j0.h) * ((float)Math.pow(((float)Math.max(0.0, ((double)Math.abs(f9)) * 27.13 / (400.0 - ((double)Math.abs(f9))))), 2.380952)) / j0.g[1];
        float f13 = Math.signum(f10) * (100.0f / j0.h) * ((float)Math.pow(((float)Math.max(0.0, ((double)Math.abs(f10)) * 27.13 / (400.0 - ((double)Math.abs(f10))))), 2.380952)) / j0.g[2];
        float[] arr_f = a.b[0];
        float f14 = arr_f[2] * f13 + (arr_f[1] * f12 + arr_f[0] * f11);
        float[] arr_f1 = a.b[1];
        float f15 = arr_f1[2] * f13 + (arr_f1[1] * f12 + arr_f1[0] * f11);
        float[] arr_f2 = a.b[2];
        return ColorUtils.XYZToColor(f14, f15, f13 * arr_f2[2] + (f12 * arr_f2[1] + f11 * arr_f2[0]));
    }

    public static void getM3HCTfromColor(@ColorInt int v, @NonNull @Size(3L) float[] arr_f) {
        CamColor.b(v, j.k, null, arr_f);
        arr_f[2] = a.b(v);
    }

    public static int toColor(@FloatRange(from = 0.0, to = 360.0) float f, @FloatRange(from = 0.0, to = Infinity, toInclusive = false) float f1, @FloatRange(from = 0.0, to = 100.0) float f2) {
        float f20;
        float f17;
        float f15;
        float f14;
        j j0 = j.k;
        float f3 = f1;
        if(((double)f3) >= 1.0 && ((double)Math.round(f2)) > 0.0 && ((double)Math.round(f2)) < 100.0) {
            float f4 = f < 0.0f ? 0.0f : Math.min(360.0f, f);
            float f5 = 0.0f;
            boolean z = true;
            CamColor camColor0 = null;
            float f6 = f3;
            while(Math.abs(f5 - f3) >= 0.4f) {
                float f7 = 100.0f;
                float f8 = 1000.0f;
                float f9 = 0.0f;
                float f10 = 1000.0f;
                CamColor camColor1 = null;
                while(true) {
                    if(Float.compare(Math.abs(f9 - f7), 0.01f) > 0) {
                        float f11 = (f7 - f9) / 2.0f + f9;
                        int v = CamColor.c(f11, f6, f4).d(j.k);
                        float f12 = a.b(v);
                        float f13 = Math.abs(f2 - f12);
                        if(f13 < 0.2f) {
                            CamColor camColor2 = CamColor.a(v);
                            f14 = f6;
                            CamColor camColor3 = CamColor.c(camColor2.c, camColor2.b, f4);
                            f15 = f4;
                            float f16 = camColor2.d - camColor3.d;
                            f17 = f7;
                            float f18 = camColor2.e - camColor3.e;
                            float f19 = camColor2.f - camColor3.f;
                            CamColor camColor4 = camColor2;
                            f20 = f8;
                            float f21 = (float)(Math.pow(Math.sqrt(f19 * f19 + (f18 * f18 + f16 * f16)), 0.63) * 1.41);
                            if(f21 <= 1.0f) {
                                camColor1 = camColor4;
                                f10 = f21;
                                f8 = f13;
                                goto label_41;
                            }
                        }
                        else {
                            f15 = f4;
                            f14 = f6;
                            f17 = f7;
                            f20 = f8;
                        }
                        f8 = f20;
                    label_41:
                        if(f8 == 0.0f && f10 == 0.0f) {
                            break;
                        }
                        else {
                            if(f12 < f2) {
                                f9 = f11;
                                f7 = f17;
                            }
                            else {
                                f7 = f11;
                            }
                            f6 = f14;
                            f4 = f15;
                            continue;
                        }
                    }
                    f15 = f4;
                    f14 = f6;
                    break;
                }
                if(z) {
                    if(camColor1 != null) {
                        return camColor1.d(j0);
                    }
                    f6 = (f3 - f5) / 2.0f + f5;
                    z = false;
                }
                else {
                    if(camColor1 == null) {
                        f3 = f14;
                    }
                    else {
                        camColor0 = camColor1;
                        f5 = f14;
                    }
                    f6 = (f3 - f5) / 2.0f + f5;
                }
                f4 = f15;
            }
            return camColor0 == null ? a.a(f2) : camColor0.d(j0);
        }
        return a.a(f2);
    }
}

