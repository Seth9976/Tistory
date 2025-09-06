package se;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;

public final class t extends Lambda implements Function1 {
    public static final t w;

    static {
        t.w = new t(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((JavaMember)object0), "it");
        return Boolean.valueOf(((JavaMember)object0).isStatic());
    }
}

