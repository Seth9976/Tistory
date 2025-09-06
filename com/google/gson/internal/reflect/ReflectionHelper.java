package com.google.gson.internal.reflect;

import a9.a;
import com.google.gson.JsonIOException;
import g.b;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionHelper {
    public static final b a;

    static {
        a9.b b0;
        try {
            b0 = new a9.b();
        }
        catch(NoSuchMethodException unused_ex) {
            b0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        ReflectionHelper.a = b0;
    }

    public static void a(AccessibleObject accessibleObject0, StringBuilder stringBuilder0) {
        stringBuilder0.append('(');
        Class[] arr_class = accessibleObject0 instanceof Method ? ((Method)accessibleObject0).getParameterTypes() : ((Constructor)accessibleObject0).getParameterTypes();
        for(int v = 0; v < arr_class.length; ++v) {
            if(v > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(arr_class[v].getSimpleName());
        }
        stringBuilder0.append(')');
    }

    public static String constructorToString(Constructor constructor0) {
        StringBuilder stringBuilder0 = new StringBuilder(constructor0.getDeclaringClass().getName());
        ReflectionHelper.a(constructor0, stringBuilder0);
        return stringBuilder0.toString();
    }

    public static RuntimeException createExceptionForUnexpectedIllegalAccess(IllegalAccessException illegalAccessException0) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException0);
    }

    public static String fieldToString(Field field0) {
        return field0.getDeclaringClass().getName() + "#" + field0.getName();
    }

    public static String getAccessibleObjectDescription(AccessibleObject accessibleObject0, boolean z) {
        String s;
        if(accessibleObject0 instanceof Field) {
            s = "field \'" + ReflectionHelper.fieldToString(((Field)accessibleObject0)) + "\'";
            return !z || !Character.isLowerCase(s.charAt(0)) ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1);
        }
        if(accessibleObject0 instanceof Method) {
            StringBuilder stringBuilder0 = new StringBuilder(((Method)accessibleObject0).getName());
            ReflectionHelper.a(((Method)accessibleObject0), stringBuilder0);
            s = "method \'" + ((Method)accessibleObject0).getDeclaringClass().getName() + "#" + stringBuilder0.toString() + "\'";
            return !z || !Character.isLowerCase(s.charAt(0)) ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1);
        }
        s = accessibleObject0 instanceof Constructor ? "constructor \'" + ReflectionHelper.constructorToString(((Constructor)accessibleObject0)) + "\'" : "<unknown AccessibleObject> " + accessibleObject0.toString();
        return !z || !Character.isLowerCase(s.charAt(0)) ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    public static Method getAccessor(Class class0, Field field0) {
        return ReflectionHelper.a.k(class0, field0);
    }

    public static Constructor getCanonicalRecordConstructor(Class class0) {
        return ReflectionHelper.a.l(class0);
    }

    public static String[] getRecordComponentNames(Class class0) {
        return ReflectionHelper.a.p(class0);
    }

    public static boolean isRecord(Class class0) {
        return ReflectionHelper.a.s(class0);
    }

    public static void makeAccessible(AccessibleObject accessibleObject0) throws JsonIOException {
        try {
            accessibleObject0.setAccessible(true);
        }
        catch(Exception exception0) {
            throw new JsonIOException(wb.a.d("Failed making ", ReflectionHelper.getAccessibleObjectDescription(accessibleObject0, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), exception0);
        }
    }

    public static String tryMakeAccessible(Constructor constructor0) {
        try {
            constructor0.setAccessible(true);
            return null;
        }
        catch(Exception exception0) {
            return "Failed making constructor \'" + ReflectionHelper.constructorToString(constructor0) + "\' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + exception0.getMessage();
        }
    }
}

