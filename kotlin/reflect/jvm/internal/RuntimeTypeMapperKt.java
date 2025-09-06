package kotlin.reflect.jvm.internal;

import fe.a;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class RuntimeTypeMapperKt {
    public static final String access$getSignature(Method method0) {
        Class[] arr_class = method0.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(arr_class, "parameterTypes");
        Class class0 = method0.getReturnType();
        Intrinsics.checkNotNullExpressionValue(class0, "returnType");
        return method0.getName() + ArraysKt___ArraysKt.joinToString$default(arr_class, "", "(", ")", 0, null, a.G, 24, null) + ReflectClassUtilKt.getDesc(class0);
    }
}

