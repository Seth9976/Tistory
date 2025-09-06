package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class SnapshotDoubleStateKt {
    public static final double getValue(@NotNull DoubleState doubleState0, @Nullable Object object0, @NotNull KProperty kProperty0) {
        return doubleState0.getDoubleValue();
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableDoubleState mutableDoubleStateOf(double f) {
        return ActualAndroid_androidKt.createSnapshotMutableDoubleState(f);
    }

    public static final void setValue(@NotNull MutableDoubleState mutableDoubleState0, @Nullable Object object0, @NotNull KProperty kProperty0, double f) {
        mutableDoubleState0.setDoubleValue(f);
    }
}

