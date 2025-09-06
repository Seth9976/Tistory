package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Remeasurement;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000ER\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0018\u001A\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001A\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u0012R\u0014\u0010\u001C\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u0012¨\u0006\u001D"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListBeyondBoundsState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "", "beyondBoundsItemCount", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;I)V", "", "remeasure", "()V", "a", "Landroidx/compose/foundation/lazy/LazyListState;", "getState", "()Landroidx/compose/foundation/lazy/LazyListState;", "b", "I", "getBeyondBoundsItemCount", "()I", "getItemCount", "itemCount", "", "getHasVisibleItems", "()Z", "hasVisibleItems", "getFirstPlacedIndex", "firstPlacedIndex", "getLastPlacedIndex", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class LazyListBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    public static final int $stable;
    public final LazyListState a;
    public final int b;

    public LazyListBeyondBoundsState(@NotNull LazyListState lazyListState0, int v) {
        this.a = lazyListState0;
        this.b = v;
    }

    public final int getBeyondBoundsItemCount() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getFirstPlacedIndex() {
        return Math.max(0, this.a.getFirstVisibleItemIndex() - this.b);
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
        return Math.min(this.getItemCount() - 1, ((LazyListItemInfo)CollectionsKt___CollectionsKt.last(this.a.getLayoutInfo().getVisibleItemsInfo())).getIndex() + this.b);
    }

    @NotNull
    public final LazyListState getState() {
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

