package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class f extends FunctionReferenceImpl implements Function1 {
    public static final f a;

    static {
        f.a = new f(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((MatchResult)object0), "p0");
        return ((MatchResult)object0).next();
    }
}

