package wf;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

public final class j extends Lambda implements Function0 {
    public static final j w;

    static {
        j.w = new j(0);  // 初始化器: Lkotlin/jvm/internal/Lambda;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DebugProbesImpl.i.runWeakRefQueueCleaningLoopUntilInterrupted();
        return Unit.INSTANCE;
    }
}

