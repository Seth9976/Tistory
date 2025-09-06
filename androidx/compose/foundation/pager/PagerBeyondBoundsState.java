package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Remeasurement;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u0014\u0010\u0011\u001A\u00020\u000E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0013\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\fR\u0014\u0010\u0015\u001A\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/pager/PagerBeyondBoundsState;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "Landroidx/compose/foundation/pager/PagerState;", "state", "", "beyondViewportPageCount", "<init>", "(Landroidx/compose/foundation/pager/PagerState;I)V", "", "remeasure", "()V", "getItemCount", "()I", "itemCount", "", "getHasVisibleItems", "()Z", "hasVisibleItems", "getFirstPlacedIndex", "firstPlacedIndex", "getLastPlacedIndex", "lastPlacedIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PagerBeyondBoundsState implements LazyLayoutBeyondBoundsState {
    public static final int $stable;
    public final PagerState a;
    public final int b;

    public PagerBeyondBoundsState(@NotNull PagerState pagerState0, int v) {
        this.a = pagerState0;
        this.b = v;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getFirstPlacedIndex() {
        return Math.max(0, this.a.getFirstVisiblePage$foundation_release() - this.b);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public boolean getHasVisibleItems() {
        return !this.a.getLayoutInfo().getVisiblePagesInfo().isEmpty();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getItemCount() {
        return this.a.getPageCount();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public int getLastPlacedIndex() {
        return Math.min(this.getItemCount() - 1, ((PageInfo)CollectionsKt___CollectionsKt.last(this.a.getLayoutInfo().getVisiblePagesInfo())).getIndex() + this.b);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState
    public void remeasure() {
        Remeasurement remeasurement0 = this.a.getRemeasurement$foundation_release();
        if(remeasurement0 != null) {
            remeasurement0.forceRemeasure();
        }
    }
}

