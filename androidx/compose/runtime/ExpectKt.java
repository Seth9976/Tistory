package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import y0.a;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001A\u0016\u0010\u0000\u001A\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u0000\u001A\f\u0010\u0003\u001A\u00020\u0004*\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"ThreadLocal", "Landroidx/compose/runtime/ThreadLocal;", "T", "postIncrement", "", "Landroidx/compose/runtime/AtomicInt;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ExpectKt {
    @NotNull
    public static final ThreadLocal ThreadLocal() {
        return new ThreadLocal(a.z);
    }

    public static final int postIncrement(@NotNull AtomicInt atomicInt0) {
        return atomicInt0.add(1) - 1;
    }
}

