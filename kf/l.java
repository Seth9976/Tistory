package kf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

public final class l extends FunctionReferenceImpl implements Function1 {
    public static final l a;

    static {
        l.a = new l(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Sequence)object0), "p0");
        return ((Sequence)object0).iterator();
    }
}

