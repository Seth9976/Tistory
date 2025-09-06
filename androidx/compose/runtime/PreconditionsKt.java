package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\u001A\u001C\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001A\u0002\u0010\u0001\u001A*\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001A\u0002\u0010\u0001\u001A*\u0010\u0007\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001A\u0002\u0010\u0001\u001A\u0010\u0010\b\u001A\u00020\u00012\u0006\u0010\t\u001A\u00020\u0006H\u0000\u001A\u0010\u0010\n\u001A\u00020\u00012\u0006\u0010\t\u001A\u00020\u0006H\u0000¨\u0006\u000B"}, d2 = {"checkPrecondition", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "requirePrecondition", "throwIllegalArgumentException", "message", "throwIllegalStateException", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PreconditionsKt {
    public static final void checkPrecondition(boolean z) {
        if(!z) {
            PreconditionsKt.throwIllegalStateException("Check failed.");
        }
    }

    public static final void checkPrecondition(boolean z, @NotNull Function0 function00) {
        if(!z) {
            PreconditionsKt.throwIllegalStateException(((String)function00.invoke()));
        }
    }

    public static final void requirePrecondition(boolean z, @NotNull Function0 function00) {
        if(!z) {
            PreconditionsKt.throwIllegalArgumentException(((String)function00.invoke()));
        }
    }

    public static final void throwIllegalArgumentException(@NotNull String s) {
        throw new IllegalArgumentException(s);
    }

    public static final void throwIllegalStateException(@NotNull String s) {
        throw new IllegalStateException(s);
    }
}

