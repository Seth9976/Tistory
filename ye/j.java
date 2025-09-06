package ye;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;

public final class j extends Lambda implements Function1 {
    public static final j w;

    static {
        j.w = new j(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KotlinType)object0), "it");
        return ((KotlinType)object0) instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference)(((KotlinType)object0))).getOriginalTypeVariable() : ((KotlinType)object0);
    }
}

