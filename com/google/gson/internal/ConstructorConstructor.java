package com.google.gson.internal;

import a7.c;
import com.google.gson.InstanceCreator;
import com.google.gson.ReflectionAccessFilter.FilterResult;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class ConstructorConstructor {
    public final Map a;
    public final boolean b;
    public final List c;

    public ConstructorConstructor(Map map0, boolean z, List list0) {
        this.a = map0;
        this.b = z;
        this.c = list0;
    }

    public static String a(Class class0) {
        int v = class0.getModifiers();
        if(Modifier.isInterface(v)) {
            return "Interfaces can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + class0.getName();
        }
        return Modifier.isAbstract(v) ? "Abstract classes can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + class0.getName() : null;
    }

    public ObjectConstructor get(TypeToken typeToken0) {
        Constructor constructor0;
        ObjectConstructor objectConstructor1;
        Type type0 = typeToken0.getType();
        Class class0 = typeToken0.getRawType();
        Map map0 = this.a;
        InstanceCreator instanceCreator0 = (InstanceCreator)map0.get(type0);
        if(instanceCreator0 != null) {
            return new d(instanceCreator0, type0, 0);
        }
        ObjectConstructor objectConstructor0 = null;
        InstanceCreator instanceCreator1 = (InstanceCreator)map0.get(class0);
        if(instanceCreator1 != null) {
            return new d(instanceCreator1, type0, 1);
        }
        if(EnumSet.class.isAssignableFrom(class0)) {
            objectConstructor1 = new f(0, type0);
        }
        else if(class0 == EnumMap.class) {
            objectConstructor1 = new f(1, type0);
        }
        else {
            objectConstructor1 = null;
        }
        if(objectConstructor1 != null) {
            return objectConstructor1;
        }
        FilterResult reflectionAccessFilter$FilterResult0 = ReflectionAccessFilterHelper.getFilterResult(this.c, class0);
        ObjectConstructor objectConstructor2 = null;
        if(!Modifier.isAbstract(class0.getModifiers())) {
            try {
                constructor0 = class0.getDeclaredConstructor(null);
            }
            catch(NoSuchMethodException unused_ex) {
                goto label_35;
            }
            FilterResult reflectionAccessFilter$FilterResult1 = FilterResult.ALLOW;
            if(reflectionAccessFilter$FilterResult0 != reflectionAccessFilter$FilterResult1 && (!ReflectionAccessFilterHelper.canAccess(constructor0, null) || reflectionAccessFilter$FilterResult0 == FilterResult.BLOCK_ALL && !Modifier.isPublic(constructor0.getModifiers()))) {
                objectConstructor2 = new g("Unable to invoke no-args constructor of " + class0 + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
            }
            else if(reflectionAccessFilter$FilterResult0 == reflectionAccessFilter$FilterResult1) {
                String s = ReflectionHelper.tryMakeAccessible(constructor0);
                objectConstructor2 = s == null ? new i(constructor0) : new h(s);
            }
            else {
                objectConstructor2 = new i(constructor0);
            }
        }
    label_35:
        if(objectConstructor2 != null) {
            return objectConstructor2;
        }
        if(!Collection.class.isAssignableFrom(class0)) {
            if(Map.class.isAssignableFrom(class0)) {
                if(ConcurrentNavigableMap.class.isAssignableFrom(class0)) {
                    objectConstructor0 = new c(17);
                }
                else if(ConcurrentMap.class.isAssignableFrom(class0)) {
                    objectConstructor0 = new c(18);
                }
                else if(SortedMap.class.isAssignableFrom(class0)) {
                    objectConstructor0 = new c(19);
                }
                else if(type0 instanceof ParameterizedType) {
                    Class class1 = TypeToken.get(((ParameterizedType)type0).getActualTypeArguments()[0]).getRawType();
                    objectConstructor0 = String.class.isAssignableFrom(class1) ? new c(21) : new c(20);
                }
                else {
                    objectConstructor0 = new c(21);
                }
            }
        }
        else if(SortedSet.class.isAssignableFrom(class0)) {
            objectConstructor0 = new c(13);
        }
        else if(Set.class.isAssignableFrom(class0)) {
            objectConstructor0 = new c(14);
        }
        else if(Queue.class.isAssignableFrom(class0)) {
            objectConstructor0 = new c(15);
        }
        else {
            objectConstructor0 = new c(16);
        }
        if(objectConstructor0 != null) {
            return objectConstructor0;
        }
        String s1 = ConstructorConstructor.a(class0);
        if(s1 != null) {
            return new e(s1, 1);
        }
        if(reflectionAccessFilter$FilterResult0 == FilterResult.ALLOW) {
            return this.b ? new cd.d(class0) : new e("Unable to create instance of " + class0 + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.", 0);
        }
        return new e("Unable to create instance of " + class0 + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.", 2);
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

