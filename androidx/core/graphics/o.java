package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class o {
    public static final Field a;
    public static final Method b;
    public static final Method c;
    public static final Constructor d;
    public static final LongSparseArray e;
    public static final Object f;

    static {
        Constructor constructor0;
        Method method1;
        Method method0;
        Field field0;
        try {
            field0 = Typeface.class.getDeclaredField("native_instance");
            Class class0 = Long.TYPE;
            Class class1 = Integer.TYPE;
            method0 = Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", class0, class1);
            method0.setAccessible(true);
            method1 = Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", class0, class1);
            method1.setAccessible(true);
            constructor0 = Typeface.class.getDeclaredConstructor(class0);
            constructor0.setAccessible(true);
        }
        catch(NoSuchFieldException | NoSuchMethodException noSuchFieldException0) {
            Log.e("WeightTypeface", noSuchFieldException0.getClass().getName(), noSuchFieldException0);
            field0 = null;
            constructor0 = null;
            method0 = null;
            method1 = null;
        }
        o.a = field0;
        o.b = method0;
        o.c = method1;
        o.d = constructor0;
        o.e = new LongSparseArray(3);
        o.f = new Object();
    }

    public static Typeface a(long v) {
        try {
            return (Typeface)o.d.newInstance(v);
        }
        catch(IllegalAccessException | InstantiationException | InvocationTargetException unused_ex) {
            return null;
        }
    }

    public static Typeface b(Typeface typeface0, int v, boolean z) {
        Typeface typeface2;
        long v4;
        long v3;
        Field field0 = o.a;
        if(field0 != null) {
            int v1 = v << 1 | z;
            synchronized(o.f) {
                try {
                    v3 = field0.getLong(typeface0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new RuntimeException(illegalAccessException0);
                }
            }
            LongSparseArray longSparseArray0 = o.e;
            SparseArray sparseArray0 = (SparseArray)longSparseArray0.get(v3);
            if(sparseArray0 == null) {
                sparseArray0 = new SparseArray(4);
                longSparseArray0.put(v3, sparseArray0);
            }
            else {
                Typeface typeface1 = (Typeface)sparseArray0.get(v1);
                if(typeface1 != null) {
                    return typeface1;
                }
            }
            if(z == typeface0.isItalic()) {
                try {
                    v4 = (long)(((Long)o.c.invoke(null, v3, v)));
                }
                catch(IllegalAccessException illegalAccessException1) {
                    throw new RuntimeException(illegalAccessException1);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw new RuntimeException(invocationTargetException0);
                }
                typeface2 = o.a(v4);
            }
            else {
                typeface2 = o.a(o.c(v3, z, v));
            }
            sparseArray0.put(v1, typeface2);
            return typeface2;
        }
        return null;
    }

    public static long c(long v, boolean z, int v1) {
        try {
            Long long0 = (Long)o.b.invoke(null, v, ((int)(z ? 2 : 0)));
            long0.longValue();
            return (long)(((Long)o.c.invoke(null, long0, v1)));
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
    }
}

