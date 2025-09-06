package androidx.core.graphics;

import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class p {
    public static final Field a;
    public static final Method b;
    public static final Constructor c;
    public static final LongSparseArray d;
    public static final Object e;

    static {
        Constructor constructor0;
        Method method0;
        Field field0;
        try {
            field0 = Typeface.class.getDeclaredField("native_instance");
            Class class0 = Long.TYPE;
            method0 = Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", class0, Integer.TYPE, Boolean.TYPE);
            method0.setAccessible(true);
            constructor0 = Typeface.class.getDeclaredConstructor(class0);
            constructor0.setAccessible(true);
        }
        catch(NoSuchFieldException | NoSuchMethodException noSuchFieldException0) {
            Log.e("WeightTypeface", noSuchFieldException0.getClass().getName(), noSuchFieldException0);
            field0 = null;
            constructor0 = null;
            method0 = null;
        }
        p.a = field0;
        p.b = method0;
        p.c = constructor0;
        p.d = new LongSparseArray(3);
        p.e = new Object();
    }

    public static Typeface a(Typeface typeface0, int v, boolean z) {
        Long long0;
        long v3;
        Field field0 = p.a;
        Typeface typeface1 = null;
        if(field0 != null) {
            int v1 = v << 1 | z;
            synchronized(p.e) {
                try {
                    v3 = field0.getLong(typeface0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new RuntimeException(illegalAccessException0);
                }
            }
            LongSparseArray longSparseArray0 = p.d;
            SparseArray sparseArray0 = (SparseArray)longSparseArray0.get(v3);
            if(sparseArray0 == null) {
                sparseArray0 = new SparseArray(4);
                longSparseArray0.put(v3, sparseArray0);
            }
            else {
                Typeface typeface2 = (Typeface)sparseArray0.get(v1);
                if(typeface2 != null) {
                    return typeface2;
                }
            }
            try {
                long0 = (Long)p.b.invoke(null, v3, v, Boolean.valueOf(z));
                long0.longValue();
            }
            catch(IllegalAccessException illegalAccessException1) {
                throw new RuntimeException(illegalAccessException1);
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new RuntimeException(invocationTargetException0);
            }
            try {
                typeface1 = (Typeface)p.c.newInstance(long0);
            }
            catch(IllegalAccessException | InstantiationException | InvocationTargetException unused_ex) {
            }
            sparseArray0.put(v1, typeface1);
            return typeface1;
        }
        return null;
    }
}

