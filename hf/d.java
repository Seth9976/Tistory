package hf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;

public final class d extends Lambda implements Function1 {
    public static final d w;

    static {
        d.w = new d(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((UnwrappedType)object0), "it");
        return ((UnwrappedType)object0) instanceof StubTypeForBuilderInference || ((UnwrappedType)object0).getConstructor() instanceof TypeVariableTypeConstructorMarker || KotlinTypeKt.isError(((UnwrappedType)object0));
    }
}

