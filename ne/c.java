package ne;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public static final c w;

    static {
        c.w = new c(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ParameterizedType)object0), "it");
        Type[] arr_type = ((ParameterizedType)object0).getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(arr_type, "it.actualTypeArguments");
        return ArraysKt___ArraysKt.asSequence(arr_type);
    }
}

