package ue;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

public final class g extends Lambda implements Function1 {
    public static final g w;

    static {
        g.w = new g(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((UnwrappedType)object0), "it");
        return Boolean.valueOf(((UnwrappedType)object0) instanceof RawType);
    }
}

