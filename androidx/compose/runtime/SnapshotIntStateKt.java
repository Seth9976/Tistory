package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class SnapshotIntStateKt {
    public static final int getValue(@NotNull IntState intState0, @Nullable Object object0, @NotNull KProperty kProperty0) {
        return intState0.getIntValue();
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableIntState mutableIntStateOf(int v) {
        return ActualAndroid_androidKt.createSnapshotMutableIntState(v);
    }

    public static final void setValue(@NotNull MutableIntState mutableIntState0, @Nullable Object object0, @NotNull KProperty kProperty0, int v) {
        mutableIntState0.setIntValue(v);
    }
}

