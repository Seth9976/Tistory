package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\r\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u001D\u0010\u0010\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u001F\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u000F\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R+\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u00028F@FX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u000ER+\u0010\f\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u00028F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u001B\u0010\u0017\u001A\u0004\b\u001C\u0010\u0019\"\u0004\b\u001D\u0010\u000ER\u0017\u0010#\u001A\u00020\u001E8\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScrollPosition;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "measureResult", "", "updateFromMeasureResult", "(Landroidx/compose/foundation/lazy/LazyListMeasureResult;)V", "scrollOffset", "updateScrollOffset", "(I)V", "index", "requestPositionAndForgetLastKnownKey", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;I)I", "<set-?>", "a", "Landroidx/compose/runtime/MutableIntState;", "getIndex", "()I", "setIndex", "b", "getScrollOffset", "setScrollOffset", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "e", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyListScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n75#2:129\n108#2,2:130\n75#2:132\n108#2,2:133\n1#3:135\n*S KotlinDebug\n*F\n+ 1 LazyListScrollPosition.kt\nandroidx/compose/foundation/lazy/LazyListScrollPosition\n*L\n34#1:129\n34#1:130,2\n36#1:132\n36#1:133,2\n*E\n"})
public final class LazyListScrollPosition {
    public static final int $stable = 8;
    public final MutableIntState a;
    public final MutableIntState b;
    public boolean c;
    public Object d;
    public final LazyLayoutNearestRangeState e;

    public LazyListScrollPosition() {
        this(0, 0, 3, null);
    }

    public LazyListScrollPosition(int v, int v1) {
        this.a = SnapshotIntStateKt.mutableIntStateOf(v);
        this.b = SnapshotIntStateKt.mutableIntStateOf(v1);
        this.e = new LazyLayoutNearestRangeState(v, 30, 100);
    }

    public LazyListScrollPosition(int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        this(v, v1);
    }

    public final void a(int v, int v1) {
        if(((float)v) < 0.0f) {
            throw new IllegalArgumentException(("Index should be non-negative (" + v + ')').toString());
        }
        this.setIndex(v);
        this.e.update(v);
        this.b.setIntValue(v1);
    }

    public final int getIndex() {
        return this.a.getIntValue();
    }

    @NotNull
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.e;
    }

    public final int getScrollOffset() {
        return this.b.getIntValue();
    }

    public final void requestPositionAndForgetLastKnownKey(int v, int v1) {
        this.a(v, v1);
        this.d = null;
    }

    public final void setIndex(int v) {
        this.a.setIntValue(v);
    }

    public final void updateFromMeasureResult(@NotNull LazyListMeasureResult lazyListMeasureResult0) {
        LazyListMeasuredItem lazyListMeasuredItem0 = lazyListMeasureResult0.getFirstVisibleItem();
        this.d = lazyListMeasuredItem0 == null ? null : lazyListMeasuredItem0.getKey();
        if(this.c || lazyListMeasureResult0.getTotalItemsCount() > 0) {
            this.c = true;
            int v = lazyListMeasureResult0.getFirstVisibleItemScrollOffset();
            if(((float)v) < 0.0f) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + v + ')').toString());
            }
            LazyListMeasuredItem lazyListMeasuredItem1 = lazyListMeasureResult0.getFirstVisibleItem();
            this.a((lazyListMeasuredItem1 == null ? 0 : lazyListMeasuredItem1.getIndex()), v);
        }
    }

    public final void updateScrollOffset(int v) {
        if(((float)v) < 0.0f) {
            throw new IllegalStateException(("scrollOffset should be non-negative (" + v + ')').toString());
        }
        this.b.setIntValue(v);
    }

    @ExperimentalFoundationApi
    public final int updateScrollPositionIfTheFirstItemWasMoved(@NotNull LazyListItemProvider lazyListItemProvider0, int v) {
        int v1 = LazyLayoutItemProviderKt.findIndexByKey(lazyListItemProvider0, this.d, v);
        if(v != v1) {
            this.setIndex(v1);
            this.e.update(v);
        }
        return v1;
    }
}

