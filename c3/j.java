package c3;

public final class j {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;
    public static final j k;

    static {
        float f = a.c[0];
        float[] arr_f = a.a[0];
        float f1 = arr_f[0] * f;
        float f2 = a.c[1];
        float f3 = arr_f[1] * f2 + f1;
        float f4 = a.c[2];
        float f5 = arr_f[2] * f4 + f3;
        float[] arr_f1 = a.a[1];
        float f6 = arr_f1[2] * f4 + (arr_f1[1] * f2 + arr_f1[0] * f);
        float[] arr_f2 = a.a[2];
        float f7 = f4 * arr_f2[2] + (f2 * arr_f2[1] + f * arr_f2[0]);
        float[] arr_f3 = {100.0f / f5 * 0.84509f + 1.0f - 0.84509f, 100.0f / f6 * 0.84509f + 1.0f - 0.84509f, 100.0f / f7 * 0.84509f + 1.0f - 0.84509f};
        float f8 = 18.418652f / a.c[1];
        double f9 = ((double)(arr_f3[0] * 0.388481f * f5)) / 100.0;
        float f10 = 0.725f / ((float)Math.pow(f8, 0.2));
        float f11 = (float)Math.pow(f9, 0.42);
        float f12 = (float)Math.pow(((double)(arr_f3[1] * 0.388481f * f6)) / 100.0, 0.42);
        float f13 = (float)Math.pow(((double)(arr_f3[2] * 0.388481f * f7)) / 100.0, 0.42);
        new float[]{f11 * 400.0f / (f11 + 27.129999f), f12 * 400.0f / (f12 + 27.129999f), 400.0f * f13 / (f13 + 27.129999f)};
        j.k = new j(f8, (400.0f * f13 / (f13 + 27.129999f) * 0.05f + (f11 * 400.0f / (f11 + 27.129999f) * 2.0f + f12 * 400.0f / (f12 + 27.129999f))) * f10, f10, f10, 0.69f, 1.0f, arr_f3, 0.388481f, 0.789483f, ((float)Math.sqrt(f8)) + 1.48f);
    }

    public j(float f, float f1, float f2, float f3, float f4, float f5, float[] arr_f, float f6, float f7, float f8) {
        this.f = f;
        this.a = f1;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.g = arr_f;
        this.h = f6;
        this.i = f7;
        this.j = f8;
    }
}

