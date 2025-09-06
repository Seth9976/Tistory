package z1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.math.MathKt;

public final class a extends FunctionReferenceImpl implements Function2 {
    public static final a a;

    static {
        a.a = new a(2, MathKt.class, "min", "min(II)I", 1);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return Math.min(((Number)object0).intValue(), ((Number)object1).intValue());
    }
}

