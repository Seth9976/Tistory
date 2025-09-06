package org.chromium.support_lib_boundary.util;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import xg.a;

public class BoundaryInterfaceReflectionUtil {
    @Nullable
    public static Object castToSuppLibClass(@NonNull Class class0, @Nullable InvocationHandler invocationHandler0) {
        return invocationHandler0 == null ? null : class0.cast(Proxy.newProxyInstance(BoundaryInterfaceReflectionUtil.class.getClassLoader(), new Class[]{class0}, invocationHandler0));
    }

    // 去混淆评级： 低(40)
    public static boolean containsFeature(Collection collection0, String s) {
        return collection0.contains(s) || ("eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE)) && collection0.contains(s + ":dev");
    }

    public static boolean containsFeature(String[] arr_s, String s) {
        return BoundaryInterfaceReflectionUtil.containsFeature(Arrays.asList(arr_s), s);
    }

    @Nullable
    @RequiresApi(19)
    public static InvocationHandler createInvocationHandlerFor(@Nullable Object object0) {
        return object0 == null ? null : new a(object0);
    }

    @Nullable
    @RequiresApi(19)
    public static InvocationHandler[] createInvocationHandlersForArray(@Nullable Object[] arr_object) {
        if(arr_object == null) {
            return null;
        }
        InvocationHandler[] arr_invocationHandler = new InvocationHandler[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            arr_invocationHandler[v] = BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(arr_object[v]);
        }
        return arr_invocationHandler;
    }

    public static Method dupeMethod(Method method0, ClassLoader classLoader0) throws ClassNotFoundException, NoSuchMethodException {
        Class class0 = Class.forName(method0.getDeclaringClass().getName(), true, classLoader0);
        Class[] arr_class = method0.getParameterTypes();
        return class0.getDeclaredMethod(method0.getName(), arr_class);
    }

    @Nullable
    @RequiresApi(19)
    public static Object getDelegateFromInvocationHandler(@Nullable InvocationHandler invocationHandler0) {
        return invocationHandler0 == null ? null : ((a)invocationHandler0).a;
    }

    public static boolean instanceOfInOwnClassLoader(Object object0, String s) {
        try {
            return Class.forName(s, false, object0.getClass().getClassLoader()).isInstance(object0);
        }
        catch(ClassNotFoundException unused_ex) {
            return false;
        }
    }
}

