package jd;

import kotlin.Triple;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

public final class c extends FunctionReference implements Function3 {
    public static final c a;

    static {
        c.a = new c(3);  // 初始化器: Lkotlin/jvm/internal/FunctionReference;-><init>(I)V
    }

    @Override  // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "<init>";
    }

    @Override  // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(Triple.class);
    }

    @Override  // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V";
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Intrinsics.checkParameterIsNotNull(object0, "p1");
        Intrinsics.checkParameterIsNotNull(object1, "p2");
        Intrinsics.checkParameterIsNotNull(object2, "p3");
        return new Triple(object0, object1, object2);
    }
}

