package kotlinx.coroutines;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sf.n0;

@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class ThreadPoolDispatcherKt {
    @DelicateCoroutinesApi
    @NotNull
    public static final ExecutorCoroutineDispatcher newFixedThreadPoolContext(int v, @NotNull String s) {
        if(v < 1) {
            throw new IllegalArgumentException(("Expected at least one thread, but " + v + " specified").toString());
        }
        return ExecutorsKt.from(Executors.newScheduledThreadPool(v, new n0(v, s, new AtomicInteger())));
    }

    @DelicateCoroutinesApi
    @ExperimentalCoroutinesApi
    @NotNull
    public static final ExecutorCoroutineDispatcher newSingleThreadContext(@NotNull String s) {
        return ThreadPoolDispatcherKt.newFixedThreadPoolContext(1, s);
    }
}

