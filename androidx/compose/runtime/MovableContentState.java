package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@InternalComposeApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/MovableContentState;", "", "Landroidx/compose/runtime/SlotTable;", "slotTable", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "a", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class MovableContentState {
    public static final int $stable = 8;
    public final SlotTable a;

    public MovableContentState(@NotNull SlotTable slotTable0) {
        this.a = slotTable0;
    }

    @NotNull
    public final SlotTable getSlotTable$runtime_release() {
        return this.a;
    }
}

