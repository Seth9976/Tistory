package androidx.appcompat.widget;

import android.os.Build.VERSION;
import java.lang.reflect.Method;

public final class u2 {
    public Method a;
    public Method b;
    public Method c;

    public u2(Method method0, Method method1, Method method2) {
        this.a = method0;
        this.b = method1;
        this.c = method2;
    }

    public static void a() {
        if(Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}

