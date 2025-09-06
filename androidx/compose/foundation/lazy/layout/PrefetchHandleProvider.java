package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0018B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000Eø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0017\u001A\u00020\u00142\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000Eø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchHandleProvider;", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "subcomposeLayoutState", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "executor", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "", "index", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "prefetchMetrics", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch-VKLhPVY", "(IJLandroidx/compose/foundation/lazy/layout/PrefetchMetrics;)Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "schedulePrefetch", "Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "createNestedPrefetchRequest-VKLhPVY", "(IJLandroidx/compose/foundation/lazy/layout/PrefetchMetrics;)Landroidx/compose/foundation/lazy/layout/PrefetchRequest;", "createNestedPrefetchRequest", "androidx/compose/foundation/lazy/layout/e", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PrefetchHandleProvider {
    public static final int $stable = 8;
    public final LazyLayoutItemContentFactory a;
    public final SubcomposeLayoutState b;
    public final PrefetchScheduler c;

    public PrefetchHandleProvider(@NotNull LazyLayoutItemContentFactory lazyLayoutItemContentFactory0, @NotNull SubcomposeLayoutState subcomposeLayoutState0, @NotNull PrefetchScheduler prefetchScheduler0) {
        this.a = lazyLayoutItemContentFactory0;
        this.b = subcomposeLayoutState0;
        this.c = prefetchScheduler0;
    }

    @NotNull
    public final PrefetchRequest createNestedPrefetchRequest-VKLhPVY(int v, long v1, @NotNull PrefetchMetrics prefetchMetrics0) {
        return new e(this, v, v1, prefetchMetrics0);
    }

    @NotNull
    public final PrefetchHandle schedulePrefetch-VKLhPVY(int v, long v1, @NotNull PrefetchMetrics prefetchMetrics0) {
        PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle0 = new e(this, v, v1, prefetchMetrics0);
        this.c.schedulePrefetch(((PrefetchRequest)lazyLayoutPrefetchState$PrefetchHandle0));
        return lazyLayoutPrefetchState$PrefetchHandle0;
    }
}

