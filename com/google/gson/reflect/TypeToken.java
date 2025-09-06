package com.google.gson.reflect;

import com.google.gson.internal..Gson.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Objects;

public class TypeToken {
    public final Class a;
    public final Type b;
    public final int c;

    public TypeToken() {
        Type type0 = this.getClass().getGenericSuperclass();
        Class class0 = TypeToken.class;
        if(!(type0 instanceof ParameterizedType)) {
            throw type0 == class0 ? new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.") : new IllegalStateException("Must only create direct subclasses of TypeToken");
        }
        if(((ParameterizedType)type0).getRawType() != class0) {
            throw new IllegalStateException("Must only create direct subclasses of TypeToken");
        }
        Type type1 = .Gson.Types.canonicalize(((ParameterizedType)type0).getActualTypeArguments()[0]);
        this.b = type1;
        this.a = .Gson.Types.getRawType(type1);
        this.c = type1.hashCode();
    }

    public TypeToken(Type type0) {
        Objects.requireNonNull(type0);
        Type type1 = .Gson.Types.canonicalize(type0);
        this.b = type1;
        this.a = .Gson.Types.getRawType(type1);
        this.c = type1.hashCode();
    }

    public static boolean a(Type type0, ParameterizedType parameterizedType0, HashMap hashMap0) {
        if(type0 == null) {
            return false;
        }
        if(parameterizedType0.equals(type0)) {
            return true;
        }
        Class class0 = .Gson.Types.getRawType(type0);
        ParameterizedType parameterizedType1 = type0 instanceof ParameterizedType ? ((ParameterizedType)type0) : null;
        if(parameterizedType1 != null) {
            Type[] arr_type = parameterizedType1.getActualTypeArguments();
            TypeVariable[] arr_typeVariable = class0.getTypeParameters();
            for(int v1 = 0; v1 < arr_type.length; ++v1) {
                Type type1 = arr_type[v1];
                TypeVariable typeVariable0 = arr_typeVariable[v1];
                while(type1 instanceof TypeVariable) {
                    type1 = (Type)hashMap0.get(((TypeVariable)type1).getName());
                }
                hashMap0.put(typeVariable0.getName(), type1);
            }
            if(parameterizedType1.getRawType().equals(parameterizedType0.getRawType())) {
                Type[] arr_type1 = parameterizedType1.getActualTypeArguments();
                Type[] arr_type2 = parameterizedType0.getActualTypeArguments();
                int v2 = 0;
                while(v2 < arr_type1.length) {
                    Type type2 = arr_type1[v2];
                    Type type3 = arr_type2[v2];
                    if(!type3.equals(type2) && (!(type2 instanceof TypeVariable) || !type3.equals(hashMap0.get(((TypeVariable)type2).getName())))) {
                        goto label_31;
                    }
                    ++v2;
                }
                return true;
            }
        }
    label_31:
        Type[] arr_type3 = class0.getGenericInterfaces();
        for(int v = 0; v < arr_type3.length; ++v) {
            if(TypeToken.a(arr_type3[v], parameterizedType0, new HashMap(hashMap0))) {
                return true;
            }
        }
        return TypeToken.a(class0.getGenericSuperclass(), parameterizedType0, new HashMap(hashMap0));
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof TypeToken && .Gson.Types.equals(this.b, ((TypeToken)object0).b);
    }

    public static TypeToken get(Class class0) {
        return new TypeToken(class0);
    }

    public static TypeToken get(Type type0) {
        return new TypeToken(type0);
    }

    public static TypeToken getArray(Type type0) {
        return new TypeToken(.Gson.Types.arrayOf(type0));
    }

    public static TypeToken getParameterized(Type type0, Type[] arr_type) {
        Objects.requireNonNull(type0);
        Objects.requireNonNull(arr_type);
        if(!(type0 instanceof Class)) {
            throw new IllegalArgumentException("rawType must be of type Class, but was " + type0);
        }
        TypeVariable[] arr_typeVariable = ((Class)type0).getTypeParameters();
        if(arr_type.length != arr_typeVariable.length) {
            throw new IllegalArgumentException(((Class)type0).getName() + " requires " + arr_typeVariable.length + " type arguments, but got " + arr_type.length);
        }
        for(int v = 0; v < arr_typeVariable.length; ++v) {
            Type type1 = arr_type[v];
            Class class0 = .Gson.Types.getRawType(type1);
            TypeVariable typeVariable0 = arr_typeVariable[v];
            Type[] arr_type1 = typeVariable0.getBounds();
            for(int v1 = 0; v1 < arr_type1.length; ++v1) {
                if(!.Gson.Types.getRawType(arr_type1[v1]).isAssignableFrom(class0)) {
                    throw new IllegalArgumentException("Type argument " + type1 + " does not satisfy bounds for type variable " + typeVariable0 + " declared by " + type0);
                }
            }
        }
        return new TypeToken(.Gson.Types.newParameterizedTypeWithOwner(null, type0, arr_type));
    }

    public final Class getRawType() {
        return this.a;
    }

    public final Type getType() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        return this.c;
    }

    @Deprecated
    public boolean isAssignableFrom(TypeToken typeToken0) {
        return this.isAssignableFrom(typeToken0.getType());
    }

    @Deprecated
    public boolean isAssignableFrom(Class class0) {
        return this.isAssignableFrom(class0);
    }

    @Deprecated
    public boolean isAssignableFrom(Type type0) {
        boolean z;
        int v = 0;
        if(type0 == null) {
            return false;
        }
        Type type1 = this.b;
        if(type1.equals(type0)) {
            return true;
        }
        Class class0 = this.a;
        if(type1 instanceof Class) {
            return class0.isAssignableFrom(.Gson.Types.getRawType(type0));
        }
        if(type1 instanceof ParameterizedType) {
            return TypeToken.a(type0, ((ParameterizedType)type1), new HashMap());
        }
        if(type1 instanceof GenericArrayType) {
            if(class0.isAssignableFrom(.Gson.Types.getRawType(type0))) {
                Type type2 = ((GenericArrayType)type1).getGenericComponentType();
                if(type2 instanceof ParameterizedType) {
                    if(type0 instanceof GenericArrayType) {
                        type0 = ((GenericArrayType)type0).getGenericComponentType();
                    }
                    else if(type0 instanceof Class) {
                        for(type0 = (Class)type0; ((Class)type0).isArray(); type0 = ((Class)type0).getComponentType()) {
                        }
                    }
                    z = TypeToken.a(type0, ((ParameterizedType)type2), new HashMap());
                }
                else {
                    z = true;
                }
                if(z) {
                    v = 1;
                }
            }
            return v != 0;
        }
        Class[] arr_class = {Class.class, ParameterizedType.class, GenericArrayType.class};
        StringBuilder stringBuilder0 = new StringBuilder("Unexpected type. Expected one of: ");
        while(v < 3) {
            stringBuilder0.append(arr_class[v].getName());
            stringBuilder0.append(", ");
            ++v;
        }
        stringBuilder0.append("but got: ");
        stringBuilder0.append(type1.getClass().getName());
        stringBuilder0.append(", for type token: ");
        stringBuilder0.append(type1.toString());
        stringBuilder0.append('.');
        throw new AssertionError(stringBuilder0.toString());
    }

    @Override
    public final String toString() {
        return .Gson.Types.typeToString(this.b);
    }
}

