package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class l implements Factory {
    public static void a(Type type0, Class class0) {
        Class class1 = Types.getRawType(type0);
        if(class0.isAssignableFrom(class1)) {
            throw new IllegalArgumentException("No JsonAdapter for " + type0 + ", you should probably use " + class0.getSimpleName() + " instead of " + class1.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
        }
    }

    @Override  // com.squareup.moshi.JsonAdapter$Factory
    public final JsonAdapter create(Type type0, Set set0, Moshi moshi0) {
        i i0;
        Class class3;
        Class class2;
        Type type1 = type0;
        Class class0 = Object.class;
        if(!(type1 instanceof Class) && !(type1 instanceof ParameterizedType)) {
            return null;
        }
        Class class1 = Types.getRawType(type0);
        if(class1.isInterface() || class1.isEnum() || !set0.isEmpty()) {
            return null;
        }
        if(Util.isPlatformType(class1)) {
            l.a(type1, List.class);
            l.a(type1, Set.class);
            l.a(type1, Map.class);
            l.a(type1, Collection.class);
            throw new IllegalArgumentException((type1 instanceof ParameterizedType ? "Platform " + class1 + " in " + type1 : "Platform " + class1) + " requires explicit JsonAdapter to be registered");
        }
        if(class1.isAnonymousClass()) {
            throw new IllegalArgumentException("Cannot serialize anonymous class " + class1.getName());
        }
        if(class1.isLocalClass()) {
            throw new IllegalArgumentException("Cannot serialize local class " + class1.getName());
        }
        if(class1.getEnclosingClass() != null && !Modifier.isStatic(class1.getModifiers())) {
            throw new IllegalArgumentException("Cannot serialize non-static nested class " + class1.getName());
        }
        if(Modifier.isAbstract(class1.getModifiers())) {
            throw new IllegalArgumentException("Cannot serialize abstract class " + class1.getName());
        }
        if(Util.isKotlin(class1)) {
            throw new IllegalArgumentException("Cannot serialize Kotlin type " + class1.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
        }
        try {
            class2 = ObjectStreamClass.class;
            class3 = Class.class;
            Constructor constructor0 = class1.getDeclaredConstructor(null);
            constructor0.setAccessible(true);
            i0 = new i(constructor0, class1, 0);
        }
        catch(NoSuchMethodException unused_ex) {
            try {
                Class class4 = Class.forName("sun.misc.Unsafe");
                Field field0 = class4.getDeclaredField("theUnsafe");
                field0.setAccessible(true);
                Object object0 = field0.get(null);
                i0 = new j(class4.getMethod("allocateInstance", class3), object0, class1);
            }
            catch(IllegalAccessException unused_ex) {
                throw new AssertionError();
            }
            catch(ClassNotFoundException | NoSuchMethodException | NoSuchFieldException unused_ex) {
                try {
                    Method method0 = class2.getDeclaredMethod("getConstructorId", class3);
                    method0.setAccessible(true);
                    int v = (int)(((Integer)method0.invoke(null, class0)));
                    Method method1 = class2.getDeclaredMethod("newInstance", class3, Integer.TYPE);
                    method1.setAccessible(true);
                    i0 = new k(method1, class1, v);
                }
                catch(IllegalAccessException unused_ex) {
                    throw new AssertionError();
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw Util.rethrowCause(invocationTargetException0);
                }
                catch(NoSuchMethodException unused_ex) {
                    try {
                        Method method2 = ObjectInputStream.class.getDeclaredMethod("newInstance", class3, class3);
                        method2.setAccessible(true);
                        i0 = new i(method2, class1, 1);
                    }
                    catch(Exception unused_ex) {
                        throw new IllegalArgumentException("cannot construct instances of " + class1.getName());
                    }
                }
            }
        }
        TreeMap treeMap0 = new TreeMap();
        while(type1 != class0) {
            Class class5 = Types.getRawType(type1);
            boolean z = Util.isPlatformType(class5);
            Field[] arr_field = class5.getDeclaredFields();
            for(int v1 = 0; v1 < arr_field.length; ++v1) {
                Field field1 = arr_field[v1];
                int v2 = field1.getModifiers();
                if(!Modifier.isStatic(v2) && !Modifier.isTransient(v2) && (Modifier.isPublic(v2) || Modifier.isProtected(v2) || !z)) {
                    Type type2 = Util.resolve(type1, class5, field1.getGenericType());
                    Set set1 = Util.jsonAnnotations(field1);
                    String s = field1.getName();
                    JsonAdapter jsonAdapter0 = moshi0.adapter(type2, set1, s);
                    field1.setAccessible(true);
                    Json json0 = (Json)field1.getAnnotation(Json.class);
                    if(json0 != null) {
                        s = json0.name();
                    }
                    m m0 = (m)treeMap0.put(s, new m(s, field1, jsonAdapter0));
                    if(m0 != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + m0.b + "\n    " + field1);
                    }
                }
            }
            Class class6 = Types.getRawType(type1);
            type1 = Util.resolve(type1, class6, class6.getGenericSuperclass());
        }
        return new n(i0, treeMap0).nullSafe();
    }
}

