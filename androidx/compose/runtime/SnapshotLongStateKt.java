package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class SnapshotLongStateKt {
    public static final long getValue(@NotNull LongState longState0, @Nullable Object object0, @NotNull KProperty kProperty0) {
        return longState0.getLongValue();
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableLongState mutableLongStateOf(long v) {
        return ActualAndroid_androidKt.createSnapshotMutableLongState(v);
    }

    public static final void setValue(@NotNull MutableLongState mutableLongState0, @Nullable Object object0, @NotNull KProperty kProperty0, long v) {
        mutableLongState0.setLongValue(v);
    }
}

