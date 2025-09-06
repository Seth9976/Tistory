package retrofit2;

import a5.b;
import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Unit;

public abstract class p0 {
    public static final Type[] a = null;
    public static boolean b = true;
    public static Constructor c;

    static {
        p0.a = new Type[0];
    }

    public abstract void a(g0 arg1, Object arg2);

    public static void b(Type type0) {
        if(type0 instanceof Class && ((Class)type0).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean c(Type type0, Type type1) {
        if(type0 == type1) {
            return true;
        }
        if(type0 instanceof Class) {
            return type0.equals(type1);
        }
        if(type0 instanceof ParameterizedType) {
            if(!(type1 instanceof ParameterizedType)) {
                return false;
            }
            Type type2 = ((ParameterizedType)type0).getOwnerType();
            Type type3 = ((ParameterizedType)type1).getOwnerType();
            return (type2 == type3 || type2 != null && type2.equals(type3)) && ((ParameterizedType)type0).getRawType().equals(((ParameterizedType)type1).getRawType()) && Arrays.equals(((ParameterizedType)type0).getActualTypeArguments(), ((ParameterizedType)type1).getActualTypeArguments());
        }
        if(type0 instanceof GenericArrayType) {
            return type1 instanceof GenericArrayType ? p0.c(((GenericArrayType)type0).getGenericComponentType(), ((GenericArrayType)type1).getGenericComponentType()) : false;
        }
        if(type0 instanceof WildcardType) {
            return type1 instanceof WildcardType ? Arrays.equals(((WildcardType)type0).getUpperBounds(), ((WildcardType)type1).getUpperBounds()) && Arrays.equals(((WildcardType)type0).getLowerBounds(), ((WildcardType)type1).getLowerBounds()) : false;
        }
        return type0 instanceof TypeVariable && type1 instanceof TypeVariable ? ((TypeVariable)type0).getGenericDeclaration() == ((TypeVariable)type1).getGenericDeclaration() && ((TypeVariable)type0).getName().equals(((TypeVariable)type1).getName()) : false;
    }

    public static Type d(Type type0, Class class0, Class class1) {
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
                    return p0.d(class0.getGenericInterfaces()[v], arr_class[v], class1);
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
                    return p0.d(class0.getGenericSuperclass(), class3, class1);
                }
                class0 = class3;
            }
        }
        return class1;
    }

    public static Type e(int v, ParameterizedType parameterizedType0) {
        Type[] arr_type = parameterizedType0.getActualTypeArguments();
        if(v >= 0 && v < arr_type.length) {
            Type type0 = arr_type[v];
            return type0 instanceof WildcardType ? ((WildcardType)type0).getUpperBounds()[0] : type0;
        }
        StringBuilder stringBuilder0 = b.s(v, "Index ", " not in range [0,");
        stringBuilder0.append(arr_type.length);
        stringBuilder0.append(") for ");
        stringBuilder0.append(parameterizedType0);
        throw new IllegalArgumentException(stringBuilder0.toString());
    }

    public static Class f(Type type0) {
        Objects.requireNonNull(type0, "type == null");
        if(type0 instanceof Class) {
            return (Class)type0;
        }
        if(type0 instanceof ParameterizedType) {
            Type type1 = ((ParameterizedType)type0).getRawType();
            if(!(type1 instanceof Class)) {
                throw new IllegalArgumentException();
            }
            return (Class)type1;
        }
        if(type0 instanceof GenericArrayType) {
            return Array.newInstance(p0.f(((GenericArrayType)type0).getGenericComponentType()), 0).getClass();
        }
        if(type0 instanceof TypeVariable) {
            return Object.class;
        }
        if(!(type0 instanceof WildcardType)) {
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type0 + "> is of type " + type0.getClass().getName());
        }
        return p0.f(((WildcardType)type0).getUpperBounds()[0]);
    }

    public static Type g(Type type0, Class class0) {
        Class class1 = Map.class;
        if(!class1.isAssignableFrom(class0)) {
            throw new IllegalArgumentException();
        }
        return p0.o(type0, class0, p0.d(type0, class0, class1));
    }

    public static boolean h(Type type0) {
        if(type0 instanceof Class) {
            return false;
        }
        if(type0 instanceof ParameterizedType) {
            Type[] arr_type = ((ParameterizedType)type0).getActualTypeArguments();
            for(int v = 0; v < arr_type.length; ++v) {
                if(p0.h(arr_type[v])) {
                    return true;
                }
            }
            return false;
        }
        if(type0 instanceof GenericArrayType) {
            return p0.h(((GenericArrayType)type0).getGenericComponentType());
        }
        if(type0 instanceof TypeVariable) {
            return true;
        }
        if(!(type0 instanceof WildcardType)) {
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type0 + "> is of type " + (type0 == null ? "null" : type0.getClass().getName()));
        }
        return true;
    }

    public static Object i(Method method0, Class class0, Object object0, Object[] arr_object) {
        Constructor constructor0 = p0.c;
        if(constructor0 == null) {
            constructor0 = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor0.setAccessible(true);
            p0.c = constructor0;
        }
        return ((MethodHandles.Lookup)constructor0.newInstance(class0, -1)).unreflectSpecial(method0, class0).bindTo(object0).invokeWithArguments(arr_object);
    }

    public static boolean j(Annotation[] arr_annotation, Class class0) {
        for(int v = 0; v < arr_annotation.length; ++v) {
            if(class0.isInstance(arr_annotation[v])) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(Type type0) {
        return p0.b && type0 == Unit.class;
    }

    public static IllegalArgumentException l(Method method0, Exception exception0, String s, Object[] arr_object) {
        StringBuilder stringBuilder0 = b.u(String.format(s, arr_object), "\n    for method ");
        stringBuilder0.append(method0.getDeclaringClass().getSimpleName());
        stringBuilder0.append(".");
        stringBuilder0.append(method0.getName());
        return new IllegalArgumentException(stringBuilder0.toString(), exception0);
    }

    public static IllegalArgumentException m(Method method0, int v, String s, Object[] arr_object) {
        return p0.l(method0, null, s + " (" + d0.b.a(method0, v) + ")", arr_object);
    }

    public static IllegalArgumentException n(Method method0, Exception exception0, int v, String s, Object[] arr_object) {
        return p0.l(method0, exception0, s + " (" + d0.b.a(method0, v) + ")", arr_object);
    }

    public static Type o(Type type0, Class class0, Type type1) {
        Type type3;
        while(type1 instanceof TypeVariable) {
            TypeVariable typeVariable0 = (TypeVariable)type1;
            GenericDeclaration genericDeclaration0 = typeVariable0.getGenericDeclaration();
            Class class1 = genericDeclaration0 instanceof Class ? ((Class)genericDeclaration0) : null;
            if(class1 != null) {
                Type type2 = p0.d(type0, class0, class1);
                if(type2 instanceof ParameterizedType) {
                    TypeVariable[] arr_typeVariable = class1.getTypeParameters();
                    int v1 = 0;
                    while(v1 < arr_typeVariable.length) {
                        if(typeVariable0.equals(arr_typeVariable[v1])) {
                            type3 = ((ParameterizedType)type2).getActualTypeArguments()[v1];
                            goto label_18;
                        }
                        ++v1;
                    }
                    throw new NoSuchElementException();
                }
            }
            type3 = typeVariable0;
        label_18:
            if(type3 == typeVariable0) {
                return type3;
            }
            type1 = type3;
        }
        if(type1 instanceof Class && ((Class)type1).isArray()) {
            Class class2 = ((Class)type1).getComponentType();
            Type type4 = p0.o(type0, class0, class2);
            return class2 != type4 ? new m0(type4) : ((Class)type1);
        }
        if(type1 instanceof GenericArrayType) {
            Type type5 = ((GenericArrayType)type1).getGenericComponentType();
            Type type6 = p0.o(type0, class0, type5);
            return type5 != type6 ? new m0(type6) : ((GenericArrayType)type1);
        }
        if(type1 instanceof ParameterizedType) {
            Type type7 = ((ParameterizedType)type1).getOwnerType();
            Type type8 = p0.o(type0, class0, type7);
            boolean z = type8 != type7;
            Type[] arr_type = ((ParameterizedType)type1).getActualTypeArguments();
            int v2 = arr_type.length;
            for(int v = 0; v < v2; ++v) {
                Type type9 = p0.o(type0, class0, arr_type[v]);
                if(type9 != arr_type[v]) {
                    if(!z) {
                        arr_type = (Type[])arr_type.clone();
                        z = true;
                    }
                    arr_type[v] = type9;
                }
            }
            return z ? new n0(type8, ((ParameterizedType)type1).getRawType(), arr_type) : ((ParameterizedType)type1);
        }
        if(type1 instanceof WildcardType) {
            type1 = (WildcardType)type1;
            Type[] arr_type1 = ((WildcardType)type1).getLowerBounds();
            Type[] arr_type2 = ((WildcardType)type1).getUpperBounds();
            if(arr_type1.length == 1) {
                Type type10 = p0.o(type0, class0, arr_type1[0]);
                if(type10 != arr_type1[0]) {
                    return new o0(new Type[]{Object.class}, new Type[]{type10});
                }
            }
            else if(arr_type2.length == 1) {
                Type type11 = p0.o(type0, class0, arr_type2[0]);
                if(type11 != arr_type2[0]) {
                    return new o0(new Type[]{type11}, p0.a);
                }
            }
        }
        return type1;
    }

    public static void p(Throwable throwable0) {
        if(throwable0 instanceof VirtualMachineError) {
            throw (VirtualMachineError)throwable0;
        }
        if(throwable0 instanceof ThreadDeath) {
            throw (ThreadDeath)throwable0;
        }
        if(throwable0 instanceof LinkageError) {
            throw (LinkageError)throwable0;
        }
    }

    // 去混淆评级： 低(20)
    public static String q(Type type0) {
        return type0 instanceof Class ? ((Class)type0).getName() : type0.toString();
    }
}

