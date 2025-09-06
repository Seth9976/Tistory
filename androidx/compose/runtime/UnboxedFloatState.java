package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u0014\u0010\u000F\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/UnboxedFloatState;", "Landroidx/compose/runtime/FloatState;", "Landroidx/compose/runtime/State;", "", "baseState", "<init>", "(Landroidx/compose/runtime/State;)V", "", "toString", "()Ljava/lang/String;", "getFloatValue", "()F", "floatValue", "getValue", "()Ljava/lang/Float;", "value", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class UnboxedFloatState implements FloatState {
    public static final int $stable;
    public final State a;

    public UnboxedFloatState(@NotNull State state0) {
        this.a = state0;
    }

    @Override  // androidx.compose.runtime.FloatState
    public float getFloatValue() {
        return ((Number)this.a.getValue()).floatValue();
    }

    @Override  // androidx.compose.runtime.FloatState
    @NotNull
    public Float getValue() {
        return (Float)this.a.getValue();
    }

    @Override  // androidx.compose.runtime.FloatState
    public Object getValue() {
        return this.getValue();
    }

    @Override
    @NotNull
    public String toString() {
        return "UnboxedFloatState(baseState=" + this.a + ")@" + this.hashCode();
    }
}

