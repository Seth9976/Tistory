package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u001A\u0012\u0010\u0004\u001A\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0007\u001A\u0012\u0010\u0007\u001A\u00020\b*\b\u0012\u0004\u0012\u00020\t0\u0002H\u0007\u001A\u0012\u0010\n\u001A\u00020\u000B*\b\u0012\u0004\u0012\u00020\f0\u0002H\u0007¨\u0006\r"}, d2 = {"asDoubleState", "Landroidx/compose/runtime/DoubleState;", "Landroidx/compose/runtime/State;", "", "asFloatState", "Landroidx/compose/runtime/FloatState;", "", "asIntState", "Landroidx/compose/runtime/IntState;", "", "asLongState", "Landroidx/compose/runtime/LongState;", "", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class SnapshotStateExtensionsKt {
    @Stable
    @NotNull
    public static final DoubleState asDoubleState(@NotNull State state0) {
        return state0 instanceof DoubleState ? ((DoubleState)state0) : new UnboxedDoubleState(state0);
    }

    @Stable
    @NotNull
    public static final FloatState asFloatState(@NotNull State state0) {
        return state0 instanceof FloatState ? ((FloatState)state0) : new UnboxedFloatState(state0);
    }

    @Stable
    @NotNull
    public static final IntState asIntState(@NotNull State state0) {
        return state0 instanceof IntState ? ((IntState)state0) : new UnboxedIntState(state0);
    }

    @Stable
    @NotNull
    public static final LongState asLongState(@NotNull State state0) {
        return state0 instanceof LongState ? ((LongState)state0) : new UnboxedLongState(state0);
    }
}

