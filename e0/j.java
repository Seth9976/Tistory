package e0;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemProvider;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasurePolicyKt;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class j extends Lambda implements Function2 {
    public final PaddingValues A;
    public final boolean B;
    public final float C;
    public final CoroutineScope D;
    public final GraphicsContext E;
    public final LazyStaggeredGridState w;
    public final Orientation x;
    public final LazyGridStaggeredGridSlotsProvider y;
    public final Function0 z;

    public j(LazyStaggeredGridState lazyStaggeredGridState0, Orientation orientation0, LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider0, Function0 function00, PaddingValues paddingValues0, boolean z, float f, CoroutineScope coroutineScope0, GraphicsContext graphicsContext0) {
        this.w = lazyStaggeredGridState0;
        this.x = orientation0;
        this.y = lazyGridStaggeredGridSlotsProvider0;
        this.z = function00;
        this.A = paddingValues0;
        this.B = z;
        this.C = f;
        this.D = coroutineScope0;
        this.E = graphicsContext0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        long v = ((Constraints)object1).unbox-impl();
        ObservableScopeInvalidator.attachToScope-impl(this.w.getMeasurementScopeInvalidator-zYiylxw$foundation_release());
        CheckScrollableContainerConstraintsKt.checkScrollableContainerConstraints-K40F9xA(v, this.x);
        LazyStaggeredGridSlots lazyStaggeredGridSlots0 = this.y.invoke-0kLqBqw(((LazyLayoutMeasureScope)object0), v);
        Object object2 = this.z.invoke();
        LayoutDirection layoutDirection0 = ((LazyLayoutMeasureScope)object0).getLayoutDirection();
        int v1 = ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(LazyStaggeredGridMeasurePolicyKt.access$beforePadding(this.A, this.x, this.B, layoutDirection0));
        LayoutDirection layoutDirection1 = ((LazyLayoutMeasureScope)object0).getLayoutDirection();
        int v2 = ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(LazyStaggeredGridMeasurePolicyKt.access$afterPadding(this.A, this.x, this.B, layoutDirection1));
        int v3 = ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(LazyStaggeredGridMeasurePolicyKt.access$startPadding(this.A, this.x, ((LazyLayoutMeasureScope)object0).getLayoutDirection()));
        float f = PaddingKt.calculateStartPadding(this.A, ((LazyLayoutMeasureScope)object0).getLayoutDirection());
        int v4 = ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(Dp.constructor-impl(PaddingKt.calculateEndPadding(this.A, ((LazyLayoutMeasureScope)object0).getLayoutDirection()) + f));
        float f1 = this.A.calculateTopPadding-D9Ej5fM();
        int v5 = ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(Dp.constructor-impl(this.A.calculateBottomPadding-D9Ej5fM() + f1));
        List list0 = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(((LazyStaggeredGridItemProvider)object2), this.w.getPinnedItems$foundation_release(), this.w.getBeyondBoundsInfo$foundation_release());
        long v6 = Constraints.copy-Zbe2FdA$default(v, ConstraintsKt.constrainWidth-K40F9xA(v, v4), 0, ConstraintsKt.constrainHeight-K40F9xA(v, v5), 0, 10, null);
        int v7 = ((LazyLayoutMeasureScope)object0).roundToPx-0680j_4(this.C);
        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult0 = LazyStaggeredGridMeasureKt.measureStaggeredGrid-XtK8cYQ(((LazyLayoutMeasureScope)object0), this.w, list0, ((LazyStaggeredGridItemProvider)object2), lazyStaggeredGridSlots0, v6, this.x == Orientation.Vertical, this.B, (this.x == Orientation.Vertical ? IntOffsetKt.IntOffset(v1, v3) : IntOffsetKt.IntOffset(v3, v1)), (this.x == Orientation.Vertical ? Constraints.getMaxHeight-impl(v) : Constraints.getMaxWidth-impl(v)) - v1 - v2, v7, v1, v2, this.D, this.E);
        LazyStaggeredGridState.applyMeasureResult$foundation_release$default(this.w, lazyStaggeredGridMeasureResult0, false, 2, null);
        return lazyStaggeredGridMeasureResult0;
    }
}

