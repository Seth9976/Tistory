package a9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class b extends g.b {
    public final Method b;
    public final Method c;
    public final Method d;
    public final Method e;

    public b() {
        this.b = Class.class.getMethod("isRecord", null);
        Method method0 = Class.class.getMethod("getRecordComponents", null);
        this.c = method0;
        Class class0 = method0.getReturnType().getComponentType();
        this.d = class0.getMethod("getName", null);
        this.e = class0.getMethod("getType", null);
    }

    @Override  // g.b
    public final Method k(Class class0, Field field0) {
        try {
            return class0.getMethod(field0.getName(), null);
        }
        catch(ReflectiveOperationException reflectiveOperationException0) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException0);
        }
    }

    @Override  // g.b
    public final Constructor l(Class class0) {
        try {
            Object[] arr_object = (Object[])this.c.invoke(class0, null);
            Class[] arr_class = new Class[arr_object.length];
            for(int v = 0; v < arr_object.length; ++v) {
                arr_class[v] = (Class)this.e.invoke(arr_object[v], null);
            }
            return class0.getDeclaredConstructor(arr_class);
        }
        catch(ReflectiveOperationException reflectiveOperationException0) {
        }
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException0);
    }

    @Override  // g.b
    public final String[] p(Class class0) {
        try {
            Object[] arr_object = (Object[])this.c.invoke(class0, null);
            String[] arr_s = new String[arr_object.length];
            for(int v = 0; v < arr_object.length; ++v) {
                arr_s[v] = (String)this.d.invoke(arr_object[v], null);
            }
            return arr_s;
        }
        catch(ReflectiveOperationException reflectiveOperationException0) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException0);
        }
    }

    @Override  // g.b
    public final boolean s(Class class0) {
        try {
            return ((Boolean)this.b.invoke(class0, null)).booleanValue();
        }
        catch(ReflectiveOperationException reflectiveOperationException0) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException0);
        }
    }
}

