package kotlin.reflect;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class e extends FunctionReferenceImpl implements Function1 {
    public static final e a;

    static {
        e.a = new e(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Class)object0), "p0");
        return ((Class)object0).getComponentType();
    }
}

