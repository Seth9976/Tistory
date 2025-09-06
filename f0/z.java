package f0;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerLazyLayoutItemProvider;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.foundation.pager.PagerMeasureResult;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;
import kotlinx.coroutines.CoroutineScope;

public final class z extends Lambda implements Function2 {
    public final float A;
    public final PageSize B;
    public final Function0 C;
    public final Function0 D;
    public final Vertical E;
    public final Horizontal F;
    public final int G;
    public final SnapPosition H;
    public final CoroutineScope I;
    public final PagerState w;
    public final Orientation x;
    public final PaddingValues y;
    public final boolean z;

    public z(PagerState pagerState0, Orientation orientation0, PaddingValues paddingValues0, boolean z, float f, PageSize pageSize0, Function0 function00, Function0 function01, Vertical alignment$Vertical0, Horizontal alignment$Horizontal0, int v, SnapPosition snapPosition0, CoroutineScope coroutineScope0) {
        this.w = pagerState0;
        this.x = orientation0;
        this.y = paddingValues0;
        this.z = z;
        this.A = f;
        this.B = pageSize0;
        this.C = function00;
        this.D = function01;
        this.E = alignment$Vertical0;
        this.F = alignment$Horizontal0;
        this.G = v;
        this.H = snapPosition0;
        this.I = coroutineScope0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v16;
        int v15;
        long v12;
        int v7;
        long v = ((Constraints)object1).unbox-impl();
        PagerState pagerState0 = this.w;
        ObservableScopeInvalidator.attachToScope-impl(pagerState0.getMeasurementScopeInvalidator-zYiylxw$foundation_release());
        Orientation orientation0 = Orientation.Vertical;
        Orientation orientation1 = this.x;
        boolean z = orientation1 == orientation0;
        CheckScrollableContainerConstraintsKt.checkScrollableContainerConstraints-K40F9xA(v, (z ? orientation0 : Orientation.Horizontal));
        int v1 = z ? ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(this.y.calculateLeftPadding-u2uoSUM(((LazyLayoutMeasureScope)object0).getLayoutDirection())) : ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(PaddingKt.calculateStartPadding(this.y, ((LazyLayoutMeasureScope)object0).getLayoutDirection()));
        int v2 = z ? ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(this.y.calculateRightPadding-u2uoSUM(((LazyLayoutMeasureScope)object0).getLayoutDirection())) : ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(PaddingKt.calculateEndPadding(this.y, ((LazyLayoutMeasureScope)object0).getLayoutDirection()));
        int v3 = ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(this.y.calculateTopPadding-D9Ej5fM());
        int v4 = ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(this.y.calculateBottomPadding-D9Ej5fM());
        int v5 = v3 + v4;
        int v6 = v1 + v2;
        boolean z1 = this.z;
        if(z && !z1) {
            v7 = v3;
        }
        else if(!z || !z1) {
            v7 = z || z1 ? v2 : v1;
        }
        else {
            v7 = v4;
        }
        int v8 = (z ? v5 : v6) - v7;
        long v9 = ConstraintsKt.offset-NN6Ew-U(v, -v6, -v5);
        pagerState0.setDensity$foundation_release(((LazyLayoutMeasureScope)object0));
        int v10 = ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(this.A);
        int v11 = z ? Constraints.getMaxHeight-impl(v) - v5 : Constraints.getMaxWidth-impl(v) - v6;
        if(z1 && v11 <= 0) {
            if(!z) {
                v1 += v11;
            }
            if(z) {
                v3 += v11;
            }
        }
        v12 = IntOffsetKt.IntOffset(v1, v3);
        int v13 = c.coerceAtLeast(this.B.calculateMainAxisPageSize(((LazyLayoutMeasureScope)object0), v11, v10), 0);
        pagerState0.setPremeasureConstraints-BRTryo0$foundation_release(ConstraintsKt.Constraints$default(0, (orientation1 == orientation0 ? Constraints.getMaxWidth-impl(v9) : v13), 0, (orientation1 == orientation0 ? v13 : Constraints.getMaxHeight-impl(v9)), 5, null));
        PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider0 = (PagerLazyLayoutItemProvider)this.C.invoke();
        Snapshot snapshot0 = Snapshot.Companion.getCurrentThreadSnapshot();
        Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
        Snapshot snapshot1 = Snapshot.Companion.makeCurrentNonObservable(snapshot0);
        try {
            v15 = pagerState0.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProvider0, pagerState0.getCurrentPage());
            v16 = PagerKt.currentPageOffset(this.H, v11, v13, v10, v7, v8, pagerState0.getCurrentPage(), pagerState0.getCurrentPageOffsetFraction(), pagerState0.getPageCount());
        }
        finally {
            Snapshot.Companion.restoreNonObservable(snapshot0, snapshot1, function10);
        }
        List list0 = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(pagerLazyLayoutItemProvider0, pagerState0.getPinnedPages$foundation_release(), pagerState0.getBeyondBoundsInfo$foundation_release());
        int v17 = ((Number)this.D.invoke()).intValue();
        y y0 = new y(((LazyLayoutMeasureScope)object0), v, v6, v5);
        PagerMeasureResult pagerMeasureResult0 = PagerMeasureKt.measurePager-bmk8ZPk(((LazyLayoutMeasureScope)object0), v17, pagerLazyLayoutItemProvider0, v11, v7, v8, v10, v15, v16, v9, this.x, this.E, this.F, this.z, v12, v13, this.G, list0, this.H, pagerState0.getPlacementScopeInvalidator-zYiylxw$foundation_release(), this.I, y0);
        PagerState.applyMeasureResult$foundation_release$default(pagerState0, pagerMeasureResult0, false, 2, null);
        return pagerMeasureResult0;
    }
}

