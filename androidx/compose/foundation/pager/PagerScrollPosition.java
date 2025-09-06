package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000EJ\u001D\u0010\u0011\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001D\u0010\u0015\u001A\u00020\u00022\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u000F\u001A\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001A\u001A\u00020\f2\u0006\u0010\u0019\u001A\u00020\u0002¢\u0006\u0004\b\u001A\u0010\u001BR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR+\u0010\u0003\u001A\u00020\u00022\u0006\u0010 \u001A\u00020\u00028F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\"\u0004\b%\u0010\u001BR+\u0010\u0005\u001A\u00020\u00042\u0006\u0010 \u001A\u00020\u00048F@BX\u0086\u008E\u0002¢\u0006\u0012\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)\"\u0004\b*\u0010\u0018R\u0017\u00100\u001A\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/¨\u00061"}, d2 = {"Landroidx/compose/foundation/pager/PagerScrollPosition;", "", "", "currentPage", "", "currentPageOffsetFraction", "Landroidx/compose/foundation/pager/PagerState;", "state", "<init>", "(IFLandroidx/compose/foundation/pager/PagerState;)V", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "measureResult", "", "updateFromMeasureResult", "(Landroidx/compose/foundation/pager/PagerMeasureResult;)V", "index", "offsetFraction", "requestPositionAndForgetLastKnownKey", "(IF)V", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "itemProvider", "matchPageWithKey", "(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I", "updateCurrentPageOffsetFraction", "(F)V", "delta", "applyScrollDelta", "(I)V", "a", "Landroidx/compose/foundation/pager/PagerState;", "getState", "()Landroidx/compose/foundation/pager/PagerState;", "<set-?>", "b", "Landroidx/compose/runtime/MutableIntState;", "getCurrentPage", "()I", "setCurrentPage", "c", "Landroidx/compose/runtime/MutableFloatState;", "getCurrentPageOffsetFraction", "()F", "setCurrentPageOffsetFraction", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "f", "Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "getNearestRangeState", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "nearestRangeState", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagerScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPositionKt\n*L\n1#1,146:1\n75#2:147\n108#2,2:148\n76#3:150\n109#3,2:151\n136#4,4:153\n*S KotlinDebug\n*F\n+ 1 PagerScrollPosition.kt\nandroidx/compose/foundation/pager/PagerScrollPosition\n*L\n38#1:147\n38#1:148,2\n41#1:150\n41#1:151,2\n114#1:153,4\n*E\n"})
public final class PagerScrollPosition {
    public static final int $stable = 8;
    public final PagerState a;
    public final MutableIntState b;
    public final MutableFloatState c;
    public boolean d;
    public Object e;
    public final LazyLayoutNearestRangeState f;

    public PagerScrollPosition(int v, float f, @NotNull PagerState pagerState0) {
        this.a = pagerState0;
        this.b = SnapshotIntStateKt.mutableIntStateOf(v);
        this.c = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.f = new LazyLayoutNearestRangeState(v, 30, 100);
    }

    public PagerScrollPosition(int v, float f, PagerState pagerState0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        this(v, f, pagerState0);
    }

    public final void applyScrollDelta(int v) {
        float f = this.a.getPageSizeWithSpacing$foundation_release() == 0 ? 0.0f : ((float)v) / ((float)this.a.getPageSizeWithSpacing$foundation_release());
        float f1 = this.getCurrentPageOffsetFraction();
        this.c.setFloatValue(f1 + f);
    }

    public final int getCurrentPage() {
        return this.b.getIntValue();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.c.getFloatValue();
    }

    @NotNull
    public final LazyLayoutNearestRangeState getNearestRangeState() {
        return this.f;
    }

    @NotNull
    public final PagerState getState() {
        return this.a;
    }

    public final int matchPageWithKey(@NotNull PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider0, int v) {
        int v1 = LazyLayoutItemProviderKt.findIndexByKey(pagerLazyLayoutItemProvider0, this.e, v);
        if(v != v1) {
            this.b.setIntValue(v1);
            this.f.update(v);
        }
        return v1;
    }

    public final void requestPositionAndForgetLastKnownKey(int v, float f) {
        this.b.setIntValue(v);
        this.f.update(v);
        this.c.setFloatValue(f);
        this.e = null;
    }

    public final void updateCurrentPageOffsetFraction(float f) {
        this.c.setFloatValue(f);
    }

    public final void updateFromMeasureResult(@NotNull PagerMeasureResult pagerMeasureResult0) {
        MeasuredPage measuredPage0 = pagerMeasureResult0.getCurrentPage();
        this.e = measuredPage0 == null ? null : measuredPage0.getKey();
        if(this.d || !pagerMeasureResult0.getVisiblePagesInfo().isEmpty()) {
            this.d = true;
            MeasuredPage measuredPage1 = pagerMeasureResult0.getCurrentPage();
            int v = measuredPage1 == null ? 0 : measuredPage1.getIndex();
            this.b.setIntValue(v);
            this.f.update(v);
            this.c.setFloatValue(pagerMeasureResult0.getCurrentPageOffsetFraction());
        }
    }
}

