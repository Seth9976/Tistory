package b0;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListItemProvider;
import androidx.compose.foundation.lazy.LazyListKt.rememberLazyListMeasurePolicy.1.1.measuredItemProvider.1;
import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class k extends Lambda implements Function2 {
    public final Function0 A;
    public final Vertical B;
    public final Horizontal C;
    public final boolean D;
    public final int E;
    public final CoroutineScope F;
    public final GraphicsContext G;
    public final androidx.compose.ui.Alignment.Horizontal H;
    public final androidx.compose.ui.Alignment.Vertical I;
    public final LazyListState w;
    public final boolean x;
    public final PaddingValues y;
    public final boolean z;

    public k(LazyListState lazyListState0, boolean z, PaddingValues paddingValues0, boolean z1, Function0 function00, Vertical arrangement$Vertical0, Horizontal arrangement$Horizontal0, boolean z2, int v, CoroutineScope coroutineScope0, GraphicsContext graphicsContext0, androidx.compose.ui.Alignment.Horizontal alignment$Horizontal0, androidx.compose.ui.Alignment.Vertical alignment$Vertical0) {
        this.w = lazyListState0;
        this.x = z;
        this.y = paddingValues0;
        this.z = z1;
        this.A = function00;
        this.B = arrangement$Vertical0;
        this.C = arrangement$Horizontal0;
        this.D = z2;
        this.E = v;
        this.F = coroutineScope0;
        this.G = graphicsContext0;
        this.H = alignment$Horizontal0;
        this.I = alignment$Vertical0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v16;
        int v15;
        long v13;
        float f;
        int v7;
        long v = ((Constraints)object1).unbox-impl();
        LazyListState lazyListState0 = this.w;
        ObservableScopeInvalidator.attachToScope-impl(lazyListState0.getMeasurementScopeInvalidator-zYiylxw$foundation_release());
        boolean z = lazyListState0.getHasLookaheadPassOccurred$foundation_release() || ((LazyLayoutMeasureScope)object0).isLookingAhead();
        boolean z1 = this.x;
        CheckScrollableContainerConstraintsKt.checkScrollableContainerConstraints-K40F9xA(v, (z1 ? Orientation.Vertical : Orientation.Horizontal));
        int v1 = z1 ? ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(this.y.calculateLeftPadding-u2uoSUM(((LazyLayoutMeasureScope)object0).getLayoutDirection())) : ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(PaddingKt.calculateStartPadding(this.y, ((LazyLayoutMeasureScope)object0).getLayoutDirection()));
        int v2 = z1 ? ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(this.y.calculateRightPadding-u2uoSUM(((LazyLayoutMeasureScope)object0).getLayoutDirection())) : ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(PaddingKt.calculateEndPadding(this.y, ((LazyLayoutMeasureScope)object0).getLayoutDirection()));
        int v3 = ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(this.y.calculateTopPadding-D9Ej5fM());
        int v4 = ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(this.y.calculateBottomPadding-D9Ej5fM());
        int v5 = v3 + v4;
        int v6 = v1 + v2;
        boolean z2 = this.z;
        if(z1 && !z2) {
            v7 = v3;
        }
        else if(!z1 || !z2) {
            v7 = z1 || z2 ? v2 : v1;
        }
        else {
            v7 = v4;
        }
        int v8 = (z1 ? v5 : v6) - v7;
        long v9 = ConstraintsKt.offset-NN6Ew-U(v, -v6, -v5);
        Object object2 = this.A.invoke();
        ((LazyListItemProvider)object2).getItemScope().setMaxSize(Constraints.getMaxWidth-impl(v9), Constraints.getMaxHeight-impl(v9));
        if(z1) {
            Vertical arrangement$Vertical0 = this.B;
            if(arrangement$Vertical0 == null) {
                throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
            }
            f = arrangement$Vertical0.getSpacing-D9Ej5fM();
        }
        else {
            Horizontal arrangement$Horizontal0 = this.C;
            if(arrangement$Horizontal0 == null) {
                throw new IllegalArgumentException("null horizontalAlignment when isVertical == false");
            }
            f = arrangement$Horizontal0.getSpacing-D9Ej5fM();
        }
        int v10 = ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(f);
        int v11 = ((LazyListItemProvider)object2).getItemCount();
        int v12 = z1 ? Constraints.getMaxHeight-impl(v) - v5 : Constraints.getMaxWidth-impl(v) - v6;
        if(z2 && v12 <= 0) {
            if(!z1) {
                v1 += v12;
            }
            if(z1) {
                v3 += v12;
            }
        }
        v13 = IntOffsetKt.IntOffset(v1, v3);
        LazyListKt.rememberLazyListMeasurePolicy.1.1.measuredItemProvider.1 lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$10 = new LazyListKt.rememberLazyListMeasurePolicy.1.1.measuredItemProvider.1(v9, this.x, ((LazyListItemProvider)object2), ((LazyLayoutMeasureScope)object0), v11, v10, this.H, this.I, this.z, v7, v8, v13, this.w);
        Snapshot snapshot0 = Snapshot.Companion.getCurrentThreadSnapshot();
        Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
        Snapshot snapshot1 = Snapshot.Companion.makeCurrentNonObservable(snapshot0);
        try {
            v15 = lazyListState0.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(((LazyListItemProvider)object2), lazyListState0.getFirstVisibleItemIndex());
            v16 = lazyListState0.getFirstVisibleItemScrollOffset();
        }
        finally {
            Snapshot.Companion.restoreNonObservable(snapshot0, snapshot1, function10);
        }
        List list0 = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(((LazyListItemProvider)object2), lazyListState0.getPinnedItems$foundation_release(), lazyListState0.getBeyondBoundsInfo$foundation_release());
        float f1 = ((LazyLayoutMeasureScope)object0).isLookingAhead() || !z ? lazyListState0.getScrollToBeConsumed$foundation_release() : lazyListState0.getScrollDeltaBetweenPasses$foundation_release();
        List list1 = this.D ? ((LazyListItemProvider)object2).getHeaderIndexes() : CollectionsKt__CollectionsKt.emptyList();
        j j0 = new j(((LazyLayoutMeasureScope)object0), v, v6, v5);
        LazyListMeasureResult lazyListMeasureResult0 = LazyListMeasureKt.measureLazyList-x0Ok8Vo(v11, lazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$10, v12, v7, v8, v10, v15, v16, f1, v9, this.x, list1, this.B, this.C, this.z, ((LazyLayoutMeasureScope)object0), lazyListState0.getItemAnimator$foundation_release(), this.E, list0, z, ((LazyLayoutMeasureScope)object0).isLookingAhead(), lazyListState0.getPostLookaheadLayoutInfo$foundation_release(), this.F, lazyListState0.getPlacementScopeInvalidator-zYiylxw$foundation_release(), this.G, j0);
        LazyListState.applyMeasureResult$foundation_release$default(this.w, lazyListMeasureResult0, ((LazyLayoutMeasureScope)object0).isLookingAhead(), false, 4, null);
        return lazyListMeasureResult0;
    }
}

