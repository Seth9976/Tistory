package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

public abstract class d extends Drawable {
    public static final double a;

    static {
        d.a = 0.707107;
    }

    // 去混淆评级： 低(20)
    public static float a(float f, float f1, boolean z) {
        return z ? ((float)((1.0 - d.a) * ((double)f1) + ((double)f))) : f;
    }

    // 去混淆评级： 低(20)
    public static float b(float f, float f1, boolean z) {
        return z ? ((float)((1.0 - d.a) * ((double)f1) + ((double)(f * 1.5f)))) : f * 1.5f;
    }
}

