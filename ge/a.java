package ge;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

public final class a implements InvocationHandler {
    public final Class a;
    public final Map b;
    public final Lazy c;
    public final Lazy d;
    public final List e;

    public a(Class class0, Map map0, Lazy lazy0, Lazy lazy1, List list0) {
        this.a = class0;
        this.b = map0;
        this.c = lazy0;
        this.d = lazy1;
        this.e = list0;
    }

    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        boolean z2;
        Class class1;
        Class class0 = this.a;
        Intrinsics.checkNotNullParameter(class0, "$annotationClass");
        Map map0 = this.b;
        Intrinsics.checkNotNullParameter(map0, "$values");
        Lazy lazy0 = this.c;
        Intrinsics.checkNotNullParameter(lazy0, "$toString$delegate");
        Lazy lazy1 = this.d;
        Intrinsics.checkNotNullParameter(lazy1, "$hashCode$delegate");
        List list0 = this.e;
        Intrinsics.checkNotNullParameter(list0, "$methods");
        String s = method0.getName();
        if(s != null) {
            switch(s) {
                case "annotationType": {
                    return class0;
                }
                case "hashCode": {
                    return ((Number)lazy1.getValue()).intValue();
                }
                case "toString": {
                    return (String)lazy0.getValue();
                }
            }
        }
        boolean z = false;
        if(Intrinsics.areEqual(s, "equals") && arr_object != null && arr_object.length == 1) {
            Intrinsics.checkNotNullExpressionValue(arr_object, "args");
            Object object1 = ArraysKt___ArraysKt.single(arr_object);
            Annotation annotation0 = object1 instanceof Annotation ? ((Annotation)object1) : null;
            if(annotation0 == null) {
                class1 = null;
            }
            else {
                KClass kClass0 = JvmClassMappingKt.getAnnotationClass(annotation0);
                class1 = kClass0 == null ? null : JvmClassMappingKt.getJavaClass(kClass0);
            }
            boolean z1 = true;
            if(Intrinsics.areEqual(class1, class0)) {
                if(!(list0 instanceof Collection) || !list0.isEmpty()) {
                    for(Object object2: list0) {
                        Object object3 = map0.get(((Method)object2).getName());
                        Object object4 = ((Method)object2).invoke(object1, null);
                        if(object3 instanceof boolean[]) {
                            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.BooleanArray");
                            z2 = Arrays.equals(((boolean[])object3), ((boolean[])object4));
                        }
                        else if(object3 instanceof char[]) {
                            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.CharArray");
                            z2 = Arrays.equals(((char[])object3), ((char[])object4));
                        }
                        else if(object3 instanceof byte[]) {
                            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.ByteArray");
                            z2 = Arrays.equals(((byte[])object3), ((byte[])object4));
                        }
                        else if(object3 instanceof short[]) {
                            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.ShortArray");
                            z2 = Arrays.equals(((short[])object3), ((short[])object4));
                        }
                        else if(object3 instanceof int[]) {
                            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.IntArray");
                            z2 = Arrays.equals(((int[])object3), ((int[])object4));
                        }
                        else if(object3 instanceof float[]) {
                            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.FloatArray");
                            z2 = Arrays.equals(((float[])object3), ((float[])object4));
                        }
                        else if(object3 instanceof long[]) {
                            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.LongArray");
                            z2 = Arrays.equals(((long[])object3), ((long[])object4));
                        }
                        else if(object3 instanceof double[]) {
                            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.DoubleArray");
                            z2 = Arrays.equals(((double[])object3), ((double[])object4));
                        }
                        else if(object3 instanceof Object[]) {
                            Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlin.Array<*>");
                            z2 = Arrays.equals(((Object[])object3), ((Object[])object4));
                        }
                        else {
                            z2 = Intrinsics.areEqual(object3, object4);
                        }
                        if(!z2) {
                            z1 = false;
                            break;
                        }
                    }
                }
                if(z1) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        if(map0.containsKey(s)) {
            return map0.get(s);
        }
        StringBuilder stringBuilder0 = new StringBuilder("Method is not supported: ");
        stringBuilder0.append(method0);
        stringBuilder0.append(" (args: ");
        if(arr_object == null) {
            arr_object = new Object[0];
        }
        stringBuilder0.append(ArraysKt___ArraysKt.toList(arr_object));
        stringBuilder0.append(')');
        throw new KotlinReflectionInternalError(stringBuilder0.toString());
    }
}

