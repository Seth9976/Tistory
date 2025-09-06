package androidx.transition;

import android.os.Build.VERSION;

public abstract class n0 {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
        boolean z = true;
        n0.a = true;
        n0.b = true;
        if(Build.VERSION.SDK_INT < 28) {
            z = false;
        }
        n0.c = z;
    }
}

