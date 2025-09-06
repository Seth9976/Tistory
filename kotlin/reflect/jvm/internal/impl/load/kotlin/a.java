package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public static final a w;

    static {
        a.w = new a(2);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((AnnotationsContainerWithConstants)object0), "$this$loadConstantFromProperty");
        Intrinsics.checkNotNullParameter(((MemberSignature)object1), "it");
        return ((AnnotationsContainerWithConstants)object0).getAnnotationParametersDefaultValues().get(((MemberSignature)object1));
    }
}

