package com.google.gson.internal;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;

public final class .Gson.Types {
    public static final Type[] a;

    static {
        .Gson.Types.a = new Type[0];
    }

    public static void a(Type type0) {
        .Gson.Preconditions.checkArgument(!(type0 instanceof Class) || !((Class)type0).isPrimitive());
    }

    public static GenericArrayType arrayOf(Type type0) {
        return new a(type0);
    }

    public static Type b(Type type0, Class class0, Class class1) {
        if(class1 == class0) {
            return type0;
        }
        if(class1.isInterface()) {
            Class[] arr_class = class0.getInterfaces();
            for(int v = 0; v < arr_class.length; ++v) {
                Class class2 = arr_class[v];
                if(class2 == class1) {
                    return class0.getGenericInterfaces()[v];
                }
                if(class1.isAssignableFrom(class2)) {
                    return .Gson.Types.b(class0.getGenericInterfaces()[v], arr_class[v], class1);
                }
            }
        }
        if(!class0.isInterface()) {
            while(class0 != Object.class) {
                Class class3 = class0.getSuperclass();
                if(class3 == class1) {
                    return class0.getGenericSuperclass();
                }
                if(class1.isAssignableFrom(class3)) {
                    return .Gson.Types.b(class0.getGenericSuperclass(), class3, class1);
                }
                class0 = class3;
            }
        }
        return class1;
    }

    public static Type c(Type type0, Class class0, Type type1, HashMap hashMap0) {
        int v;
        TypeVariable typeVariable0 = null;
    alab1:
        do {
            v = 0;
            if(!(type1 instanceof TypeVariable)) {
                goto label_26;
            }
            TypeVariable typeVariable1 = (TypeVariable)type1;
            Type type2 = (Type)hashMap0.get(typeVariable1);
            if(type2 != null) {
                return type2 == Void.TYPE ? type1 : type2;
            }
            hashMap0.put(typeVariable1, Void.TYPE);
            if(typeVariable0 == null) {
                typeVariable0 = typeVariable1;
            }
            GenericDeclaration genericDeclaration0 = typeVariable1.getGenericDeclaration();
            Class class1 = genericDeclaration0 instanceof Class ? ((Class)genericDeclaration0) : null;
            if(class1 != null) {
                Type type3 = .Gson.Types.b(type0, class0, class1);
                if(type3 instanceof ParameterizedType) {
                    TypeVariable[] arr_typeVariable = class1.getTypeParameters();
                    while(v < arr_typeVariable.length) {
                        if(typeVariable1.equals(arr_typeVariable[v])) {
                            type1 = ((ParameterizedType)type3).getActualTypeArguments()[v];
                            continue alab1;
                        }
                        ++v;
                    }
                    throw new NoSuchElementException();
                }
            }
            type1 = typeVariable1;
        }
        while(type1 != typeVariable1);
        goto label_73;
    label_26:
        if(type1 instanceof Class && ((Class)type1).isArray()) {
            Class class2 = ((Class)type1).getComponentType();
            Type type4 = .Gson.Types.c(type0, class0, class2, hashMap0);
            type1 = Objects.equals(class2, type4) ? ((Class)type1) : .Gson.Types.arrayOf(type4);
        }
        else if(type1 instanceof GenericArrayType) {
            type1 = (GenericArrayType)type1;
            Type type5 = ((GenericArrayType)type1).getGenericComponentType();
            Type type6 = .Gson.Types.c(type0, class0, type5, hashMap0);
            if(!Objects.equals(type5, type6)) {
                type1 = .Gson.Types.arrayOf(type6);
            }
        }
        else if(type1 instanceof ParameterizedType) {
            type1 = (ParameterizedType)type1;
            Type type7 = ((ParameterizedType)type1).getOwnerType();
            Type type8 = .Gson.Types.c(type0, class0, type7, hashMap0);
            int v1 = !Objects.equals(type8, type7);
            Type[] arr_type = ((ParameterizedType)type1).getActualTypeArguments();
            int v2 = arr_type.length;
            while(v < v2) {
                Type type9 = .Gson.Types.c(type0, class0, arr_type[v], hashMap0);
                if(!Objects.equals(type9, arr_type[v])) {
                    if(v1 == 0) {
                        arr_type = (Type[])arr_type.clone();
                        v1 = 1;
                    }
                    arr_type[v] = type9;
                }
                ++v;
            }
            if(v1 != 0) {
                type1 = .Gson.Types.newParameterizedTypeWithOwner(type8, ((ParameterizedType)type1).getRawType(), arr_type);
            }
        }
        else if(type1 instanceof WildcardType) {
            type1 = (WildcardType)type1;
            Type[] arr_type1 = ((WildcardType)type1).getLowerBounds();
            Type[] arr_type2 = ((WildcardType)type1).getUpperBounds();
            if(arr_type1.length == 1) {
                Type type10 = .Gson.Types.c(type0, class0, arr_type1[0], hashMap0);
                if(type10 != arr_type1[0]) {
                    type1 = .Gson.Types.supertypeOf(type10);
                }
            }
            else if(arr_type2.length == 1) {
                Type type11 = .Gson.Types.c(type0, class0, arr_type2[0], hashMap0);
                if(type11 != arr_type2[0]) {
                    type1 = .Gson.Types.subtypeOf(type11);
                }
            }
        }
    label_73:
        if(typeVariable0 != null) {
            hashMap0.put(typeVariable0, type1);
        }
        return type1;
    }

    public static Type canonicalize(Type type0) {
        if(type0 instanceof Class) {
            return ((Class)type0).isArray() ? new a(.Gson.Types.canonicalize(((Class)type0).getComponentType())) : ((Class)type0);
        }
        if(type0 instanceof ParameterizedType) {
            return new b(((ParameterizedType)type0).getOwnerType(), ((ParameterizedType)type0).getRawType(), ((ParameterizedType)type0).getActualTypeArguments());
        }
        if(type0 instanceof GenericArrayType) {
            return new a(((GenericArrayType)type0).getGenericComponentType());
        }
        return type0 instanceof WildcardType ? new c(((WildcardType)type0).getUpperBounds(), ((WildcardType)type0).getLowerBounds()) : type0;
    }

    public static boolean equals(Type type0, Type type1) {
        if(type0 == type1) {
            return true;
        }
        if(type0 instanceof Class) {
            return type0.equals(type1);
        }
        if(type0 instanceof ParameterizedType) {
            return type1 instanceof ParameterizedType ? Objects.equals(((ParameterizedType)type0).getOwnerType(), ((ParameterizedType)type1).getOwnerType()) && ((ParameterizedType)type0).getRawType().equals(((ParameterizedType)type1).getRawType()) && Arrays.equals(((ParameterizedType)type0).getActualTypeArguments(), ((ParameterizedType)type1).getActualTypeArguments()) : false;
        }
        if(type0 instanceof GenericArrayType) {
            return type1 instanceof GenericArrayType ? .Gson.Types.equals(((GenericArrayType)type0).getGenericComponentType(), ((GenericArrayType)type1).getGenericComponentType()) : false;
        }
        if(type0 instanceof WildcardType) {
            return type1 instanceof WildcardType ? Arrays.equals(((WildcardType)type0).getUpperBounds(), ((WildcardType)type1).getUpperBounds()) && Arrays.equals(((WildcardType)type0).getLowerBounds(), ((WildcardType)type1).getLowerBounds()) : false;
        }
        return type0 instanceof TypeVariable && type1 instanceof TypeVariable ? ((TypeVariable)type0).getGenericDeclaration() == ((TypeVariable)type1).getGenericDeclaration() && ((TypeVariable)type0).getName().equals(((TypeVariable)type1).getName()) : false;
    }

    public static Type getArrayComponentType(Type type0) {
        return type0 instanceof GenericArrayType ? ((GenericArrayType)type0).getGenericComponentType() : ((Class)type0).getComponentType();
    }

    public static Type getCollectionElementType(Type type0, Class class0) {
        if(type0 instanceof WildcardType) {
            type0 = ((WildcardType)type0).getUpperBounds()[0];
        }
        .Gson.Preconditions.checkArgument(Collection.class.isAssignableFrom(class0));
        Type type1 = .Gson.Types.resolve(type0, class0, .Gson.Types.b(type0, class0, Collection.class));
        return type1 instanceof ParameterizedType ? ((ParameterizedType)type1).getActualTypeArguments()[0] : Object.class;
    }

    public static Type[] getMapKeyAndValueTypes(Type type0, Class class0) {
        if(type0 == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        if(type0 instanceof WildcardType) {
            type0 = ((WildcardType)type0).getUpperBounds()[0];
        }
        .Gson.Preconditions.checkArgument(Map.class.isAssignableFrom(class0));
        Type type1 = .Gson.Types.resolve(type0, class0, .Gson.Types.b(type0, class0, Map.class));
        return type1 instanceof ParameterizedType ? ((ParameterizedType)type1).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class getRawType(Type type0) {
        if(type0 instanceof Class) {
            return (Class)type0;
        }
        if(type0 instanceof ParameterizedType) {
            Type type1 = ((ParameterizedType)type0).getRawType();
            .Gson.Preconditions.checkArgument(type1 instanceof Class);
            return (Class)type1;
        }
        if(type0 instanceof GenericArrayType) {
            return Array.newInstance(.Gson.Types.getRawType(((GenericArrayType)type0).getGenericComponentType()), 0).getClass();
        }
        if(type0 instanceof TypeVariable) {
            return Object.class;
        }
        if(!(type0 instanceof WildcardType)) {
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type0 + "> is of type " + (type0 == null ? "null" : type0.getClass().getName()));
        }
        return .Gson.Types.getRawType(((WildcardType)type0).getUpperBounds()[0]);
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type0, Type type1, Type[] arr_type) {
        return new b(type0, type1, arr_type);
    }

    public static Type resolve(Type type0, Class class0, Type type1) {
        return .Gson.Types.c(type0, class0, type1, new HashMap());
    }

    // 去混淆评级： 低(20)
    public static WildcardType subtypeOf(Type type0) {
        return type0 instanceof WildcardType ? new c(((WildcardType)type0).getUpperBounds(), .Gson.Types.a) : new c(new Type[]{type0}, .Gson.Types.a);
    }

    public static WildcardType supertypeOf(Type type0) {
        if(type0 instanceof WildcardType) {
            Type[] arr_type = ((WildcardType)type0).getLowerBounds();
            return new c(new Type[]{Object.class}, arr_type);
        }
        return new c(new Type[]{Object.class}, new Type[]{type0});
    }

    // 去混淆评级： 低(20)
    public static String typeToString(Type type0) {
        return type0 instanceof Class ? ((Class)type0).getName() : type0.toString();
    }
}

