package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

public final class e extends Lambda implements Function1 {
    public static final e w;

    static {
        e.w = new e(1);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KotlinBuiltIns)object0), "$this$null");
        SimpleType simpleType0 = ((KotlinBuiltIns)object0).getUnitType();
        Intrinsics.checkNotNullExpressionValue(simpleType0, "unitType");
        return simpleType0;
    }
}

