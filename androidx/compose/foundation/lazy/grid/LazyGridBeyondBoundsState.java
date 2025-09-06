package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Remeasurement;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\fR\u0014\u0010\u0010\u001A\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0014\u001A\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001A\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u000FR\u0014\u0010\u0018\u001A\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u000F¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridBeyondBoundsState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)V", "", "remeasure", "()V", "a", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "getState", "()Landroidx/compose/foundation/lazy/grid/LazyGridState;", "", "getItemCount", "()I", "itemCount", "", "getHasVisibleItems", "()Z", "hasVisibleItems", "getFirstPlacedIndex", "firstPlacedIndex", "getLastPlacedIndex", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyGridBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    public static final int $stable;
    public final LazyGridState a;

    public LazyGridBeyondBoundsState(@NotNull LazyGridState lazyGridState0) {
        this.a = lazyGridState0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getFirstPlacedIndex() {
        return this.a.getFirstVisibleItemIndex();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public boolean getHasVisibleItems() {
        return !this.a.getLayoutInfo().getVisibleItemsInfo().isEmpty();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getItemCount() {
        return this.a.getLayoutInfo().getTotalItemsCount();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getLastPlacedIndex() {
        return ((LazyGridItemInfo)CollectionsKt___CollectionsKt.last(this.a.getLayoutInfo().getVisibleItemsInfo())).getIndex();
    }

    @NotNull
    public final LazyGridState getState() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public void remeasure() {
        Remeasurement remeasurement0 = this.a.getRemeasurement$foundation_release();
        if(remeasurement0 != null) {
            remeasurement0.forceRemeasure();
        }
    }
}

