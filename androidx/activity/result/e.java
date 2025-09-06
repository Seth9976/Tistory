package androidx.activity.result;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;

public final class e extends Lambda implements Function0 {
    public static final e w;

    static {
        e.w = new e(0);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (int)(Random.Default.nextInt(0x7FFF0000) + 0x10000);
    }
}

