package kf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class k extends FunctionReferenceImpl implements Function1 {
    public static final k a;

    static {
        k.a = new k(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Iterable)object0), "p0");
        return ((Iterable)object0).iterator();
    }
}

