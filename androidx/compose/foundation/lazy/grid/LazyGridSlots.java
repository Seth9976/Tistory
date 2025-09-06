package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u000B\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\b\u001A\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "", "", "sizes", "positions", "<init>", "([I[I)V", "a", "[I", "getSizes", "()[I", "b", "getPositions", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyGridSlots {
    public static final int $stable = 8;
    public final int[] a;
    public final int[] b;

    public LazyGridSlots(@NotNull int[] arr_v, @NotNull int[] arr_v1) {
        this.a = arr_v;
        this.b = arr_v1;
    }

    @NotNull
    public final int[] getPositions() {
        return this.b;
    }

    @NotNull
    public final int[] getSizes() {
        return this.a;
    }
}

