package androidx.transition;

import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public abstract class f0 {
    public static final int[] a = null;
    public static final int[] b = null;
    public static final int[] c = null;
    public static final int[] d = null;
    public static final int[] e = null;
    public static final int[] f = null;
    public static final int[] g = null;
    public static final int[] h = null;
    public static final int[] i = null;
    public static final int[] j = null;
    public static final int[] k = null;
    public static Method l = null;
    public static Method m = null;
    public static boolean n = false;
    public static boolean o = true;
    public static boolean p = true;
    public static Method q;
    public static boolean r;

    static {
        f0.a = new int[]{0x101002F, 0x10103DC, 0x1010441, 0x1010442, 0x101044D, 0x101044E};
        f0.b = new int[]{0x10103DD, 0x10103DE, 0x10103DF};
        f0.c = new int[]{0x1010141, 0x1010198, 0x10103E2, 0x101044F};
        f0.d = new int[]{0x10104CF};
        f0.e = new int[]{0x101047C};
        f0.f = new int[]{0x10103E1};
        f0.g = new int[]{0x10104BC, 0x10104BD};
        f0.h = new int[]{0x1010430};
        f0.i = new int[]{0x10103E0};
        f0.j = new int[]{0x101047D, 0x101047E, 0x101047F};
        f0.k = new int[]{0x10104CA};
    }

    public static ArrayList a(Object object0, ArrayList arrayList0) {
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
        }
        if(!arrayList0.contains(object0)) {
            arrayList0.add(object0);
        }
        return arrayList0;
    }

    public static void b(Canvas canvas0, boolean z) {
        Class class0 = Canvas.class;
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            if(z) {
                canvas0.enableZ();
                return;
            }
            canvas0.disableZ();
            return;
        }
        if(v == 28) {
            throw new IllegalStateException("This method doesn\'t work on Pie!");
        }
        if(!f0.n) {
            try {
                Method method0 = class0.getDeclaredMethod("insertReorderBarrier", null);
                f0.l = method0;
                method0.setAccessible(true);
                Method method1 = class0.getDeclaredMethod("insertInorderBarrier", null);
                f0.m = method1;
                method1.setAccessible(true);
            }
            catch(NoSuchMethodException unused_ex) {
            }
            f0.n = true;
        }
        try {
            if(z) {
                Method method2 = f0.l;
                if(method2 != null) {
                    method2.invoke(canvas0, null);
                }
            }
            if(!z) {
                Method method3 = f0.m;
                if(method3 != null) {
                    method3.invoke(canvas0, null);
                    return;
                }
            }
            return;
        }
        catch(IllegalAccessException unused_ex) {
            return;
        }
        catch(InvocationTargetException invocationTargetException0) {
        }
        throw new RuntimeException(invocationTargetException0.getCause());
    }

    public static ArrayList c(Object object0, ArrayList arrayList0) {
        if(arrayList0 != null) {
            arrayList0.remove(object0);
            return arrayList0.isEmpty() ? null : arrayList0;
        }
        return null;
    }

    public static void d(ViewGroup viewGroup0, boolean z) {
        if(Build.VERSION.SDK_INT >= 29) {
            viewGroup0.suppressLayout(z);
            return;
        }
        if(f0.p) {
            try {
                viewGroup0.suppressLayout(z);
            }
            catch(NoSuchMethodError unused_ex) {
                f0.p = false;
            }
        }
    }
}

