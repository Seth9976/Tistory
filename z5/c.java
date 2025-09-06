package z5;

import android.os.SystemClock;
import java.io.File;

public final class c {
    public static final c a;
    public static final File b;
    public static int c;
    public static long d;
    public static boolean e;

    static {
        c.a = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        c.b = new File("/proc/self/fd");
        c.c = 30;
        c.d = SystemClock.uptimeMillis();
        c.e = true;
    }
}

