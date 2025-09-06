package androidx.core.app;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public abstract class q {
    public static final Class a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g;

    static {
        Method method2;
        Method method1;
        Field field1;
        Field field0;
        Class class1;
        Class class0 = Activity.class;
        q.g = new Handler(Looper.getMainLooper());
        Method method0 = null;
        try {
            class1 = null;
            class1 = Class.forName("android.app.ActivityThread");
        }
        catch(Throwable unused_ex) {
        }
        try {
            q.a = class1;
            field0 = class0.getDeclaredField("mMainThread");
            field0.setAccessible(true);
        }
        catch(Throwable unused_ex) {
            field0 = null;
        }
        try {
            q.b = field0;
            field1 = class0.getDeclaredField("mToken");
            field1.setAccessible(true);
        }
        catch(Throwable unused_ex) {
            field1 = null;
        }
        q.c = field1;
        Class class2 = q.a;
        Class class3 = IBinder.class;
        if(class2 == null) {
        label_22:
            method1 = null;
        }
        else {
            try {
                method1 = class2.getDeclaredMethod("performStopActivity", class3, Boolean.TYPE, String.class);
                method1.setAccessible(true);
                goto label_23;
            }
            catch(Throwable unused_ex) {
            }
            goto label_22;
        }
    label_23:
        q.d = method1;
        Class class4 = q.a;
        if(class4 == null) {
        label_29:
            method2 = null;
        }
        else {
            try {
                method2 = class4.getDeclaredMethod("performStopActivity", class3, Boolean.TYPE);
                method2.setAccessible(true);
                goto label_30;
            }
            catch(Throwable unused_ex) {
            }
            goto label_29;
        }
    label_30:
        q.e = method2;
        Class class5 = q.a;
        if((Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) && class5 != null) {
            try {
                Method method3 = class5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                method3.setAccessible(true);
                method0 = method3;
            }
            catch(Throwable unused_ex) {
            }
        }
        q.f = method0;
    }
}

