package androidx.transition;

import a8.g;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;

public abstract class r0 {
    public static final t0 a;
    public static final g b;
    public static final g c;

    static {
        r0.a = Build.VERSION.SDK_INT >= 29 ? new u0() : new t0();  // 初始化器: Ljava/lang/Object;-><init>()V / 初始化器: Ljava/lang/Object;-><init>()V
        r0.b = new g(14, "translationAlpha", Float.class);
        r0.c = new g(15, "clipBounds", Rect.class);
    }

    public static void a(View view0, int v, int v1, int v2, int v3) {
        r0.a.e(view0, v, v1, v2, v3);
    }

    public static void b(View view0, float f) {
        r0.a.c(view0, f);
    }

    public static void c(int v, View view0) {
        r0.a.a(v, view0);
    }
}

