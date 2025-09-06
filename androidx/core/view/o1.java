package androidx.core.view;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public final class o1 extends r1 {
    public WindowInsets c;
    public Insets d;
    public static Field e = null;
    public static boolean f = false;
    public static Constructor g = null;
    public static boolean h = false;

    public o1() {
        this.c = o1.l();
    }

    public o1(@NonNull WindowInsetsCompat windowInsetsCompat0) {
        super(windowInsetsCompat0);
        this.c = windowInsetsCompat0.toWindowInsets();
    }

    @Override  // androidx.core.view.r1
    @NonNull
    public WindowInsetsCompat b() {
        this.a();
        WindowInsetsCompat windowInsetsCompat0 = WindowInsetsCompat.toWindowInsetsCompat(this.c);
        windowInsetsCompat0.a.r(this.b);
        windowInsetsCompat0.a.u(this.d);
        return windowInsetsCompat0;
    }

    @Override  // androidx.core.view.r1
    public void g(@Nullable Insets insets0) {
        this.d = insets0;
    }

    @Override  // androidx.core.view.r1
    public void i(@NonNull Insets insets0) {
        WindowInsets windowInsets0 = this.c;
        if(windowInsets0 != null) {
            this.c = windowInsets0.replaceSystemWindowInsets(insets0.left, insets0.top, insets0.right, insets0.bottom);
        }
    }

    @Nullable
    private static WindowInsets l() {
        Class class0 = WindowInsets.class;
        if(!o1.f) {
            try {
                o1.e = class0.getDeclaredField("CONSUMED");
            }
            catch(ReflectiveOperationException reflectiveOperationException0) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", reflectiveOperationException0);
            }
            o1.f = true;
        }
        Field field0 = o1.e;
        if(field0 != null) {
            try {
                WindowInsets windowInsets0 = (WindowInsets)field0.get(null);
                if(windowInsets0 != null) {
                    return new WindowInsets(windowInsets0);
                }
            }
            catch(ReflectiveOperationException reflectiveOperationException1) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", reflectiveOperationException1);
            }
        }
        if(!o1.h) {
            try {
                o1.g = class0.getConstructor(Rect.class);
            }
            catch(ReflectiveOperationException reflectiveOperationException2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", reflectiveOperationException2);
            }
            o1.h = true;
        }
        Constructor constructor0 = o1.g;
        if(constructor0 != null) {
            try {
                return (WindowInsets)constructor0.newInstance(new Rect());
            }
            catch(ReflectiveOperationException reflectiveOperationException3) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", reflectiveOperationException3);
            }
        }
        return null;
    }
}

