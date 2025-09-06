package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {}, d2 = {}, k = 4, mv = {1, 8, 0}, xi = 0x30)
public final class PrimitiveSnapshotStateKt {
    public static final float getValue(@NotNull FloatState floatState0, @Nullable Object object0, @NotNull KProperty kProperty0) {
        return floatState0.getFloatValue();
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableFloatState mutableFloatStateOf(float f) {
        return ActualAndroid_androidKt.createSnapshotMutableFloatState(f);
    }

    public static final void setValue(@NotNull MutableFloatState mutableFloatState0, @Nullable Object object0, @NotNull KProperty kProperty0, float f) {
        mutableFloatState0.setFloatValue(f);
    }
}

