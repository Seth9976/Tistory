package kotlinx.coroutines;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\b\"$\u0010\u0007\u001A\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u001A\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/AbstractTimeSource;", "a", "Lkotlinx/coroutines/AbstractTimeSource;", "getTimeSource", "()Lkotlinx/coroutines/AbstractTimeSource;", "setTimeSource", "(Lkotlinx/coroutines/AbstractTimeSource;)V", "timeSource", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class AbstractTimeSourceKt {
    public static AbstractTimeSource a;

    @Nullable
    public static final AbstractTimeSource getTimeSource() {
        return AbstractTimeSourceKt.a;
    }

    public static final void setTimeSource(@Nullable AbstractTimeSource abstractTimeSource0) {
        AbstractTimeSourceKt.a = abstractTimeSource0;
    }
}

