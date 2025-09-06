package z5;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class e extends FunctionReferenceImpl implements Function0 {
    public static final e a;

    static {
        e.a = new e(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);  // 初始化器: Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return System.currentTimeMillis();
    }
}

