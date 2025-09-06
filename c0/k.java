package c0;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridItemProvider;
import androidx.compose.foundation.lazy.grid.LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredItemProvider.1;
import androidx.compose.foundation.lazy.grid.LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredLineProvider.1;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureKt;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureResult;
import androidx.compose.foundation.lazy.grid.LazyGridSlots;
import androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.a;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.snapshots.Snapshot.Companion;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class k extends Lambda implements Function2 {
    public final Function0 A;
    public final LazyGridSlotsProvider B;
    public final Vertical C;
    public final Horizontal D;
    public final CoroutineScope E;
    public final GraphicsContext F;
    public final LazyGridState w;
    public final boolean x;
    public final PaddingValues y;
    public final boolean z;

    public k(LazyGridState lazyGridState0, boolean z, PaddingValues paddingValues0, boolean z1, Function0 function00, LazyGridSlotsProvider lazyGridSlotsProvider0, Vertical arrangement$Vertical0, Horizontal arrangement$Horizontal0, CoroutineScope coroutineScope0, GraphicsContext graphicsContext0) {
        this.w = lazyGridState0;
        this.x = z;
        this.y = paddingValues0;
        this.z = z1;
        this.A = function00;
        this.B = lazyGridSlotsProvider0;
        this.C = arrangement$Vertical0;
        this.D = arrangement$Horizontal0;
        this.E = coroutineScope0;
        this.F = graphicsContext0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v17;
        int v16;
        long v13;
        float f;
        int v7;
        long v = ((Constraints)object1).unbox-impl();
        LazyGridState lazyGridState0 = this.w;
        ObservableScopeInvalidator.attachToScope-impl(lazyGridState0.getMeasurementScopeInvalidator-zYiylxw$foundation_release());
        boolean z = this.x;
        CheckScrollableContainerConstraintsKt.checkScrollableContainerConstraints-K40F9xA(v, (z ? Orientation.Vertical : Orientation.Horizontal));
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
        Object object2 = this.A.invoke();
        LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider0 = ((LazyGridItemProvider)object2).getSpanLayoutProvider();
        LazyGridSlots lazyGridSlots0 = this.B.invoke-0kLqBqw(((LazyLayoutMeasureScope)object0), v);
        int[] arr_v = lazyGridSlots0.getSizes();
        lazyGridSpanLayoutProvider0.setSlotsPerLine(arr_v.length);
        if(z) {
            Vertical arrangement$Vertical0 = this.C;
            if(arrangement$Vertical0 == null) {
                throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
            }
            f = arrangement$Vertical0.getSpacing-D9Ej5fM();
        }
        else {
            Horizontal arrangement$Horizontal0 = this.D;
            if(arrangement$Horizontal0 == null) {
                throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
            }
            f = arrangement$Horizontal0.getSpacing-D9Ej5fM();
        }
        int v10 = ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(f);
        int v11 = ((LazyGridItemProvider)object2).getItemCount();
        int v12 = z ? Constraints.getMaxHeight-impl(v) - v5 : Constraints.getMaxWidth-impl(v) - v6;
        if(z1 && v12 <= 0) {
            if(!z) {
                v1 += v12;
            }
            if(z) {
                v3 += v12;
            }
        }
        v13 = IntOffsetKt.IntOffset(v1, v3);
        LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredItemProvider.1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$10 = new LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredItemProvider.1(((LazyGridItemProvider)object2), ((LazyLayoutMeasureScope)object0), v10, this.w, this.x, this.z, v7, v8, v13);
        LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredLineProvider.1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$10 = new LazyGridKt.rememberLazyGridMeasurePolicy.1.1.measuredLineProvider.1(this.x, lazyGridSlots0, v11, v10, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$10, lazyGridSpanLayoutProvider0);
        a a0 = new a(lazyGridSpanLayoutProvider0, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$10);
        Companion snapshot$Companion0 = Snapshot.Companion;
        Snapshot snapshot0 = snapshot$Companion0.getCurrentThreadSnapshot();
        Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
        Snapshot snapshot1 = snapshot$Companion0.makeCurrentNonObservable(snapshot0);
        try {
            int v15 = lazyGridState0.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(((LazyGridItemProvider)object2), lazyGridState0.getFirstVisibleItemIndex());
            if(v15 < v11 || v11 <= 0) {
                v16 = lazyGridSpanLayoutProvider0.getLineIndexOfItem(v15);
                v17 = lazyGridState0.getFirstVisibleItemScrollOffset();
            }
            else {
                v16 = lazyGridSpanLayoutProvider0.getLineIndexOfItem(v11 - 1);
                v17 = 0;
            }
        }
        finally {
            snapshot$Companion0.restoreNonObservable(snapshot0, snapshot1, function10);
        }
        List list0 = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(((LazyGridItemProvider)object2), lazyGridState0.getPinnedItems$foundation_release(), lazyGridState0.getBeyondBoundsInfo$foundation_release());
        j j0 = new j(((LazyLayoutMeasureScope)object0), v, v6, v5);
        LazyGridMeasureResult lazyGridMeasureResult0 = LazyGridMeasureKt.measureLazyGrid-OZKpZRA(v11, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$10, lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$10, v12, v7, v8, v10, v16, v17, lazyGridState0.getScrollToBeConsumed$foundation_release(), v9, this.x, this.C, this.D, this.z, ((LazyLayoutMeasureScope)object0), lazyGridState0.getItemAnimator$foundation_release(), arr_v.length, list0, this.E, lazyGridState0.getPlacementScopeInvalidator-zYiylxw$foundation_release(), this.F, a0, j0);
        LazyGridState.applyMeasureResult$foundation_release$default(lazyGridState0, lazyGridMeasureResult0, false, 2, null);
        return lazyGridMeasureResult0;
    }
}

