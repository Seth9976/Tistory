package td;

import java.lang.reflect.Method;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

public abstract class a {
    public static final Method a;
    public static final Method b;

    static {
        Method method1;
        Method method0;
        Class class0 = Throwable.class;
        Method[] arr_method = class0.getMethods();
        Intrinsics.checkNotNull(arr_method);
        for(int v1 = 0; true; ++v1) {
            method0 = null;
            method1 = null;
            if(v1 >= arr_method.length) {
                break;
            }
            method0 = arr_method[v1];
            if(Intrinsics.areEqual(method0.getName(), "addSuppressed")) {
                Class[] arr_class = method0.getParameterTypes();
                Intrinsics.checkNotNullExpressionValue(arr_class, "getParameterTypes(...)");
                if(!Intrinsics.areEqual(ArraysKt___ArraysKt.singleOrNull(arr_class), class0)) {
                    continue;
                }
                break;
            }
        }
        a.a = method0;
        for(int v = 0; v < arr_method.length; ++v) {
            Method method2 = arr_method[v];
            if(Intrinsics.areEqual(method2.getName(), "getSuppressed")) {
                method1 = method2;
                break;
            }
        }
        a.b = method1;
    }
}

