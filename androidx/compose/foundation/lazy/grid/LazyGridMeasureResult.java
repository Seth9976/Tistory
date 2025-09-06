package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.LazyGridSnapLayoutInfoProviderKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b?\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u00CC\u0001\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\u0007\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0011\u001A\u00020\u0005\u00123\u0010\u0019\u001A/\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u00170\u00160\u0012\u0012\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001A0\u0016\u0012\u0006\u0010\u001C\u001A\u00020\u0005\u0012\u0006\u0010\u001D\u001A\u00020\u0005\u0012\u0006\u0010\u001E\u001A\u00020\u0005\u0012\u0006\u0010\u001F\u001A\u00020\u0007\u0012\u0006\u0010!\u001A\u00020 \u0012\u0006\u0010\"\u001A\u00020\u0005\u0012\u0006\u0010#\u001A\u00020\u0005\u00A2\u0006\u0004\b$\u0010%J\u0010\u0010\'\u001A\u00020&H\u0096\u0001\u00A2\u0006\u0004\b\'\u0010(J\u0015\u0010*\u001A\u00020\u00072\u0006\u0010)\u001A\u00020\u0005\u00A2\u0006\u0004\b*\u0010+R\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00038\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/R\"\u0010\u0006\u001A\u00020\u00058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b0\u00101\u001A\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\b\u001A\u00020\u00078\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b6\u00107\u001A\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\n\u001A\u00020\t8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0017\u0010\f\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\bB\u00107\u001A\u0004\bC\u00109R\u0017\u0010\u000E\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010GR\u0017\u0010\u0010\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010KR\u0017\u0010\u0011\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\bL\u00101\u001A\u0004\bM\u00103RD\u0010\u0019\u001A/\u0012\u0013\u0012\u00110\u0005\u00A2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u00170\u00160\u00128\u0006\u00A2\u0006\f\n\u0004\bN\u0010O\u001A\u0004\bP\u0010QR \u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00168\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bR\u0010S\u001A\u0004\bT\u0010UR\u001A\u0010\u001C\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bV\u00101\u001A\u0004\bW\u00103R\u001A\u0010\u001D\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bX\u00101\u001A\u0004\bY\u00103R\u001A\u0010\u001E\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bZ\u00101\u001A\u0004\b[\u00103R\u001A\u0010\u001F\u001A\u00020\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\\\u00107\u001A\u0004\b]\u00109R\u001A\u0010!\u001A\u00020 8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b`\u0010aR\u001A\u0010\"\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bb\u00101\u001A\u0004\bc\u00103R\u001A\u0010#\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bd\u00101\u001A\u0004\be\u00103R \u0010j\u001A\u000E\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u00050f8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bh\u0010iR\u0014\u0010l\u001A\u00020\u00058\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bk\u00103R\'\u0010p\u001A\u0015\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020&\u0018\u00010\u0012\u00A2\u0006\u0002\bn8VX\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bo\u0010QR\u0014\u0010r\u001A\u00020\u00058\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bq\u00103R\u0011\u0010t\u001A\u00020\u00078F\u00A2\u0006\u0006\u001A\u0004\bs\u00109R\u001A\u0010x\u001A\u00020u8VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bv\u0010wR\u0014\u0010z\u001A\u00020\u00058VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\by\u00103\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006{"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "firstVisibleLine", "", "firstVisibleLineScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "remeasureNeeded", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/unit/Density;", "density", "slotsPerLine", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "line", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Constraints;", "prefetchInfoRetriever", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;IZFLandroidx/compose/ui/layout/MeasureResult;ZLkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;ILkotlin/jvm/functions/Function1;Ljava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;II)V", "", "placeChildren", "()V", "delta", "tryToApplyScrollWithoutRemeasure", "(I)Z", "a", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "getFirstVisibleLine", "()Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine;", "b", "I", "getFirstVisibleLineScrollOffset", "()I", "setFirstVisibleLineScrollOffset", "(I)V", "c", "Z", "getCanScrollForward", "()Z", "setCanScrollForward", "(Z)V", "d", "F", "getConsumedScroll", "()F", "setConsumedScroll", "(F)V", "e", "getRemeasureNeeded", "f", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "g", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "h", "getSlotsPerLine", "i", "Lkotlin/jvm/functions/Function1;", "getPrefetchInfoRetriever", "()Lkotlin/jvm/functions/Function1;", "j", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "k", "getViewportStartOffset", "l", "getViewportEndOffset", "m", "getTotalItemsCount", "n", "getReverseLayout", "o", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "p", "getAfterContentPadding", "q", "getMainAxisItemSpacing", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "rulers", "getWidth", "width", "getCanScrollBackward", "canScrollBackward", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,135:1\n33#2,6:136\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasureResult.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureResult\n*L\n121#1:136,6\n*E\n"})
public final class LazyGridMeasureResult implements LazyGridLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    public final LazyGridMeasuredLine a;
    public int b;
    public boolean c;
    public float d;
    public final boolean e;
    public final CoroutineScope f;
    public final Density g;
    public final int h;
    public final Function1 i;
    public final List j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final Orientation o;
    public final int p;
    public final int q;
    public final MeasureResult r;

    public LazyGridMeasureResult(@Nullable LazyGridMeasuredLine lazyGridMeasuredLine0, int v, boolean z, float f, @NotNull MeasureResult measureResult0, boolean z1, @NotNull CoroutineScope coroutineScope0, @NotNull Density density0, int v1, @NotNull Function1 function10, @NotNull List list0, int v2, int v3, int v4, boolean z2, @NotNull Orientation orientation0, int v5, int v6) {
        this.a = lazyGridMeasuredLine0;
        this.b = v;
        this.c = z;
        this.d = f;
        this.e = z1;
        this.f = coroutineScope0;
        this.g = density0;
        this.h = v1;
        this.i = function10;
        this.j = list0;
        this.k = v2;
        this.l = v3;
        this.m = v4;
        this.n = z2;
        this.o = orientation0;
        this.p = v5;
        this.q = v6;
        this.r = measureResult0;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getAfterContentPadding() {
        return this.p;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @NotNull
    public Map getAlignmentLines() {
        return this.r.getAlignmentLines();
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getBeforeContentPadding() {
        return -this.getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        return (this.a == null ? 0 : this.a.getIndex()) != 0 || this.b != 0;
    }

    public final boolean getCanScrollForward() {
        return this.c;
    }

    public final float getConsumedScroll() {
        return this.d;
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.f;
    }

    @NotNull
    public final Density getDensity() {
        return this.g;
    }

    @Nullable
    public final LazyGridMeasuredLine getFirstVisibleLine() {
        return this.a;
    }

    public final int getFirstVisibleLineScrollOffset() {
        return this.b;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.r.getHeight();
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.q;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return this.o;
    }

    @NotNull
    public final Function1 getPrefetchInfoRetriever() {
        return this.i;
    }

    public final boolean getRemeasureNeeded() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public boolean getReverseLayout() {
        return this.n;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @Nullable
    public Function1 getRulers() {
        return this.r.getRulers();
    }

    public final int getSlotsPerLine() {
        return this.h;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getTotalItemsCount() {
        return this.m;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportEndOffset() {
        return this.l;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public long getViewportSize-YbymL2g() {
        return IntSizeKt.IntSize(this.getWidth(), this.getHeight());
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    public int getViewportStartOffset() {
        return this.k;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo
    @NotNull
    public List getVisibleItemsInfo() {
        return this.j;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.r.getWidth();
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.r.placeChildren();
    }

    public final void setCanScrollForward(boolean z) {
        this.c = z;
    }

    public final void setConsumedScroll(float f) {
        this.d = f;
    }

    public final void setFirstVisibleLineScrollOffset(int v) {
        this.b = v;
    }

    public final boolean tryToApplyScrollWithoutRemeasure(int v) {
        int v1 = 0;
        if(!this.e && !this.getVisibleItemsInfo().isEmpty()) {
            LazyGridMeasuredLine lazyGridMeasuredLine0 = this.a;
            if(lazyGridMeasuredLine0 != null) {
                int v2 = this.b - v;
                if(v2 >= 0 && v2 < lazyGridMeasuredLine0.getMainAxisSizeWithSpacings()) {
                    LazyGridMeasuredItem lazyGridMeasuredItem0 = (LazyGridMeasuredItem)CollectionsKt___CollectionsKt.first(this.getVisibleItemsInfo());
                    LazyGridMeasuredItem lazyGridMeasuredItem1 = (LazyGridMeasuredItem)CollectionsKt___CollectionsKt.last(this.getVisibleItemsInfo());
                    if(!lazyGridMeasuredItem0.getNonScrollableItem() && !lazyGridMeasuredItem1.getNonScrollableItem()) {
                        if(v >= 0) {
                            if(Math.min(this.getViewportStartOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem0, this.getOrientation()), this.getViewportEndOffset() - LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem1, this.getOrientation())) > v) {
                            label_13:
                                this.b -= v;
                                List list0 = this.getVisibleItemsInfo();
                                int v3 = list0.size();
                                while(v1 < v3) {
                                    ((LazyGridMeasuredItem)list0.get(v1)).applyScrollDelta(v);
                                    ++v1;
                                }
                                this.d = (float)v;
                                v1 = 1;
                                if(!this.c && v > 0) {
                                    this.c = true;
                                }
                            }
                        }
                        else if(Math.min(lazyGridMeasuredItem0.getMainAxisSizeWithSpacings() + LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem0, this.getOrientation()) - this.getViewportStartOffset(), lazyGridMeasuredItem1.getMainAxisSizeWithSpacings() + LazyGridSnapLayoutInfoProviderKt.offsetOnMainAxis(lazyGridMeasuredItem1, this.getOrientation()) - this.getViewportEndOffset()) > -v) {
                            goto label_13;
                        }
                    }
                }
            }
        }
        return v1 != 0;
    }
}

