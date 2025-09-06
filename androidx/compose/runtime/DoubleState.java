package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0012\u0010\u0003\u001A\u00020\u0002X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001A\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/DoubleState;", "Landroidx/compose/runtime/State;", "", "doubleValue", "getDoubleValue", "()D", "value", "getValue", "()Ljava/lang/Double;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public interface DoubleState extends State {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
        @Deprecated
        @NotNull
        public static Double getValue(@NotNull DoubleState doubleState0) {
            return DoubleState.access$getValue$jd(doubleState0);
        }
    }

    static double access$getValue$jd(DoubleState doubleState0) {
        return (double)doubleState0.super.getValue();
    }

    double getDoubleValue();

    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    @NotNull
    default Double getValue() {
        return this.getDoubleValue();
    }

    @Override  // androidx.compose.runtime.State
    default Object getValue() {
        return this.getValue();
    }
}

