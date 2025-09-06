package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\b\" \u0010\u0007\u001A\u00020\u00008\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/Delay;", "a", "Lkotlinx/coroutines/Delay;", "getDefaultDelay", "()Lkotlinx/coroutines/Delay;", "getDefaultDelay$annotations", "()V", "DefaultDelay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class DefaultExecutorKt {
    public static final Delay a;

    static {
        Delay delay0;
        if(SystemPropsKt.systemProp("kotlinx.coroutines.main.delay", false)) {
            MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain();
            delay0 = MainDispatchersKt.isMissing(mainCoroutineDispatcher0) || !(mainCoroutineDispatcher0 instanceof Delay) ? DefaultExecutor.INSTANCE : ((Delay)mainCoroutineDispatcher0);
        }
        else {
            delay0 = DefaultExecutor.INSTANCE;
        }
        DefaultExecutorKt.a = delay0;
    }

    @NotNull
    public static final Delay getDefaultDelay() {
        return DefaultExecutorKt.a;
    }

    @PublishedApi
    public static void getDefaultDelay$annotations() {
    }
}

