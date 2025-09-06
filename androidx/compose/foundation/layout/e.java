package androidx.compose.foundation.layout;

public abstract class e {
    public static final float[] a;
    public static final float[] b;

    static {
        float f13;
        float f12;
        float f11;
        float f10;
        float f7;
        float f6;
        float f5;
        float f4;
        e.a = new float[101];
        e.b = new float[101];
        float f = 0.0f;
        float f1 = 0.0f;
        for(int v = 0; v < 100; ++v) {
            float f2 = ((float)v) / 100.0f;
            float f3 = 1.0f;
            while(true) {
                f4 = (f3 - f) / 2.0f + f;
                f5 = 1.0f - f4;
                f6 = f4 * 3.0f * f5;
                f7 = f4 * f4 * f4;
                float f8 = (f4 * 0.35f + f5 * 0.175f) * f6 + f7;
                if(((double)Math.abs(f8 - f2)) < 0.00001) {
                    break;
                }
                if(f8 > f2) {
                    f3 = f4;
                }
                else {
                    f = f4;
                }
            }
            e.a[v] = (f5 * 0.5f + f4) * f6 + f7;
            float f9 = 1.0f;
            while(true) {
                f10 = (f9 - f1) / 2.0f + f1;
                f11 = 1.0f - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f14 = (f11 * 0.5f + f10) * f12 + f13;
                if(((double)Math.abs(f14 - f2)) < 0.00001) {
                    break;
                }
                if(f14 > f2) {
                    f9 = f10;
                }
                else {
                    f1 = f10;
                }
            }
            e.b[v] = (f10 * 0.35f + f11 * 0.175f) * f12 + f13;
        }
        e.b[100] = 1.0f;
        e.a[100] = 1.0f;
    }

    public static long a(float f) [...] // 潜在的解密器
}

