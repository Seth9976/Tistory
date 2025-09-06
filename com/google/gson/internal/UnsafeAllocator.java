package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class UnsafeAllocator {
    public static final UnsafeAllocator INSTANCE;

    static {
        r r0;
        Class class1;
        Class class0;
        try {
            class0 = ObjectStreamClass.class;
            class1 = Class.class;
            Class class2 = Class.forName("sun.misc.Unsafe");
            Field field0 = class2.getDeclaredField("theUnsafe");
            field0.setAccessible(true);
            Object object0 = field0.get(null);
            r0 = new r(class2.getMethod("allocateInstance", class1), object0);
        }
        catch(Exception unused_ex) {
            try {
                Method method0 = class0.getDeclaredMethod("getConstructorId", class1);
                method0.setAccessible(true);
                int v = (int)(((Integer)method0.invoke(null, Object.class)));
                Method method1 = class0.getDeclaredMethod("newInstance", class1, Integer.TYPE);
                method1.setAccessible(true);
                r0 = new s(method1, v);
            }
            catch(Exception unused_ex) {
                try {
                    Method method2 = ObjectInputStream.class.getDeclaredMethod("newInstance", class1, class1);
                    method2.setAccessible(true);
                    r0 = new t(method2);
                }
                catch(Exception unused_ex) {
                    r0 = new u();  // 初始化器: Lcom/google/gson/internal/UnsafeAllocator;-><init>()V
                }
            }
        }
        UnsafeAllocator.INSTANCE = r0;
    }

    public abstract Object newInstance(Class arg1) throws Exception;
}

