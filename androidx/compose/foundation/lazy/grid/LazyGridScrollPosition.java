package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\r\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u001D\u0010\u0010\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u001D\u0010\u0013\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u000F\u001A\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R+\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u00028F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u000ER+\u0010\f\u001A\u00020\u00022\u0006\u0010\u0015\u001A\u00020\u00028F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b\u001B\u0010\u0017\u001A\u0004\b\u001C\u0010\u0019\"\u0004\b\u001D\u0010\u000ER\u0017\u0010#\u001A\u00020\u001E8\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridScrollPosition;", "", "", "initialIndex", "initialScrollOffset", "<init>", "(II)V", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "measureResult", "", "updateFromMeasureResult", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;)V", "scrollOffset", "updateScrollOffset", "(I)V", "index", "requestPositionAndForgetLastKnownKey", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "updateScrollPositionIfTheFirstItemWasMoved", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;I)I", "<set-?>", "a", "Landroidx/compose/runtime/MutableIntState;", "getIndex", "()I", "setIndex", "b", "getScrollOffset", "setScrollOffset", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "e", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n75#2:130\n108#2,2:131\n75#2:133\n108#2,2:134\n1#3:136\n*S KotlinDebug\n*F\n+ 1 LazyGridScrollPosition.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollPosition\n*L\n35#1:130\n35#1:131,2\n38#1:133\n38#1:134,2\n*E\n"})
public final class LazyGridScrollPosition {
    public static final int $stable = 8;
    public final MutableIntState a;
    public final MutableIntState b;
    public boolean c;
    public Object d;
    public final LazyLayoutNearestRangeState e;

    public LazyGridScrollPosition() {
        this(0, 0, 3, null);
    }

    public LazyGridScrollPosition(int v, int v1) {
        this.a = SnapshotIntStateKt.mutableIntStateOf(v);
        this.b = SnapshotIntStateKt.mutableIntStateOf(v1);
        this.e = new LazyLayoutNearestRangeState(v, 90, 200);
    }

    public LazyGridScrollPosition(int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
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
        this.a.setIntValue(v);
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

    public final void updateFromMeasureResult(@NotNull LazyGridMeasureResult lazyGridMeasureResult0) {
        int v1;
        Object object0;
        LazyGridMeasuredLine lazyGridMeasuredLine0 = lazyGridMeasureResult0.getFirstVisibleLine();
        if(lazyGridMeasuredLine0 == null) {
            object0 = null;
        }
        else {
            LazyGridMeasuredItem[] arr_lazyGridMeasuredItem = lazyGridMeasuredLine0.getItems();
            if(arr_lazyGridMeasuredItem == null) {
                object0 = null;
            }
            else {
                LazyGridMeasuredItem lazyGridMeasuredItem0 = (LazyGridMeasuredItem)ArraysKt___ArraysKt.firstOrNull(arr_lazyGridMeasuredItem);
                object0 = lazyGridMeasuredItem0 == null ? null : lazyGridMeasuredItem0.getKey();
            }
        }
        this.d = object0;
        if(this.c || lazyGridMeasureResult0.getTotalItemsCount() > 0) {
            this.c = true;
            int v = lazyGridMeasureResult0.getFirstVisibleLineScrollOffset();
            if(((float)v) < 0.0f) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + v + ')').toString());
            }
            LazyGridMeasuredLine lazyGridMeasuredLine1 = lazyGridMeasureResult0.getFirstVisibleLine();
            if(lazyGridMeasuredLine1 == null) {
                v1 = 0;
            }
            else {
                LazyGridMeasuredItem[] arr_lazyGridMeasuredItem1 = lazyGridMeasuredLine1.getItems();
                if(arr_lazyGridMeasuredItem1 == null) {
                    v1 = 0;
                }
                else {
                    LazyGridMeasuredItem lazyGridMeasuredItem1 = (LazyGridMeasuredItem)ArraysKt___ArraysKt.firstOrNull(arr_lazyGridMeasuredItem1);
                    v1 = lazyGridMeasuredItem1 == null ? 0 : lazyGridMeasuredItem1.getIndex();
                }
            }
            this.a(v1, v);
        }
    }

    public final void updateScrollOffset(int v) {
        if(((float)v) < 0.0f) {
            throw new IllegalStateException(("scrollOffset should be non-negative (" + v + ')').toString());
        }
        this.b.setIntValue(v);
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved(@NotNull LazyGridItemProvider lazyGridItemProvider0, int v) {
        int v1 = LazyLayoutItemProviderKt.findIndexByKey(lazyGridItemProvider0, this.d, v);
        if(v != v1) {
            this.a.setIntValue(v1);
            this.e.update(v);
        }
        return v1;
    }
}

