package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\bF\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u00A5\u0001\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0002\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\t\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\u0006\u0010\u0014\u001A\u00020\u0013\u0012\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001A\u00020\u0018\u0012\u0006\u0010\u001A\u001A\u00020\u0013\u0012\u0006\u0010\u001B\u001A\u00020\u0013\u0012\u0006\u0010\u001C\u001A\u00020\u0013\u0012\u0006\u0010\u001D\u001A\u00020\u0013\u0012\u0006\u0010\u001E\u001A\u00020\u0013\u0012\u0006\u0010 \u001A\u00020\u001F\u00A2\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001A\u00020#H\u0096\u0001\u00A2\u0006\u0004\b$\u0010%J\u0015\u0010\'\u001A\u00020\t2\u0006\u0010&\u001A\u00020\u0013\u00A2\u0006\u0004\b\'\u0010(R\u0017\u0010\u0004\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R\"\u0010\u0005\u001A\u00020\u00038\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b-\u0010*\u001A\u0004\b.\u0010,\"\u0004\b/\u00100R\"\u0010\u0007\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b1\u00102\u001A\u0004\b3\u00104\"\u0004\b5\u00106R\u0017\u0010\b\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b7\u00108\u001A\u0004\b9\u0010:R\"\u0010\n\u001A\u00020\t8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0017\u0010\u000B\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bA\u0010<\u001A\u0004\b\u000B\u0010>R\u0017\u0010\f\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\bB\u0010<\u001A\u0004\bC\u0010>R\u0017\u0010\u000E\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\bD\u0010E\u001A\u0004\bF\u0010GR\u0017\u0010\u0010\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010KR\u0017\u0010\u0012\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010OR\u001A\u0010\u0014\u001A\u00020\u00138\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010SR \u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u00158\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bT\u0010U\u001A\u0004\bV\u0010WR \u0010\u0019\u001A\u00020\u00188\u0016X\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bX\u0010Y\u001A\u0004\bZ\u0010[R\u001A\u0010\u001A\u001A\u00020\u00138\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\\\u0010Q\u001A\u0004\b]\u0010SR\u001A\u0010\u001B\u001A\u00020\u00138\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b^\u0010Q\u001A\u0004\b_\u0010SR\u001A\u0010\u001C\u001A\u00020\u00138\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b`\u0010Q\u001A\u0004\ba\u0010SR\u001A\u0010\u001D\u001A\u00020\u00138\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bb\u0010Q\u001A\u0004\bc\u0010SR\u001A\u0010\u001E\u001A\u00020\u00138\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bd\u0010Q\u001A\u0004\be\u0010SR\u0017\u0010 \u001A\u00020\u001F8\u0006\u00A2\u0006\f\n\u0004\bf\u0010g\u001A\u0004\bh\u0010iR\u001A\u0010o\u001A\u00020j8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bk\u0010l\u001A\u0004\bm\u0010nR \u0010t\u001A\u000E\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\u00130p8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\br\u0010sR\u0014\u0010v\u001A\u00020\u00138\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bu\u0010SR\'\u0010|\u001A\u0015\u0012\u0004\u0012\u00020x\u0012\u0004\u0012\u00020#\u0018\u00010w\u00A2\u0006\u0002\by8VX\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bz\u0010{R\u0014\u0010~\u001A\u00020\u00138\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b}\u0010SR\u0012\u0010\u0080\u0001\u001A\u00020\t8F\u00A2\u0006\u0006\u001A\u0004\b\u007F\u0010>\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "", "firstVisibleItemIndices", "firstVisibleItemScrollOffsets", "", "consumedScroll", "measureResult", "", "canScrollForward", "isVertical", "remeasureNeeded", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "spanProvider", "Landroidx/compose/ui/unit/Density;", "density", "", "totalItemsCount", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "visibleItemsInfo", "Landroidx/compose/ui/unit/IntSize;", "viewportSize", "viewportStartOffset", "viewportEndOffset", "beforeContentPadding", "afterContentPadding", "mainAxisItemSpacing", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "([I[IFLandroidx/compose/ui/layout/MeasureResult;ZZZLandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;Landroidx/compose/ui/unit/Density;ILjava/util/List;JIIIIILkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "placeChildren", "()V", "delta", "tryToApplyScrollWithoutRemeasure", "(I)Z", "a", "[I", "getFirstVisibleItemIndices", "()[I", "b", "getFirstVisibleItemScrollOffsets", "setFirstVisibleItemScrollOffsets", "([I)V", "c", "F", "getConsumedScroll", "()F", "setConsumedScroll", "(F)V", "d", "Landroidx/compose/ui/layout/MeasureResult;", "getMeasureResult", "()Landroidx/compose/ui/layout/MeasureResult;", "e", "Z", "getCanScrollForward", "()Z", "setCanScrollForward", "(Z)V", "f", "g", "getRemeasureNeeded", "h", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "getSlots", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "i", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "getSpanProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSpanProvider;", "j", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "k", "I", "getTotalItemsCount", "()I", "l", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "m", "J", "getViewportSize-YbymL2g", "()J", "n", "getViewportStartOffset", "o", "getViewportEndOffset", "p", "getBeforeContentPadding", "q", "getAfterContentPadding", "r", "getMainAxisItemSpacing", "s", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/foundation/gestures/Orientation;", "t", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width", "getCanScrollBackward", "canScrollBackward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,265:1\n33#2,6:266\n33#2,6:272\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasureResult.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult\n*L\n190#1:266,6\n223#1:272,6\n*E\n"})
public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    public final int[] a;
    public int[] b;
    public float c;
    public final MeasureResult d;
    public boolean e;
    public final boolean f;
    public final boolean g;
    public final LazyStaggeredGridSlots h;
    public final LazyStaggeredGridSpanProvider i;
    public final Density j;
    public final int k;
    public final List l;
    public final long m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final CoroutineScope s;
    public final Orientation t;

    public LazyStaggeredGridMeasureResult(int[] arr_v, int[] arr_v1, float f, MeasureResult measureResult0, boolean z, boolean z1, boolean z2, LazyStaggeredGridSlots lazyStaggeredGridSlots0, LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider0, Density density0, int v, List list0, long v1, int v2, int v3, int v4, int v5, int v6, CoroutineScope coroutineScope0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = arr_v;
        this.b = arr_v1;
        this.c = f;
        this.d = measureResult0;
        this.e = z;
        this.f = z1;
        this.g = z2;
        this.h = lazyStaggeredGridSlots0;
        this.i = lazyStaggeredGridSpanProvider0;
        this.j = density0;
        this.k = v;
        this.l = list0;
        this.m = v1;
        this.n = v2;
        this.o = v3;
        this.p = v4;
        this.q = v5;
        this.r = v6;
        this.s = coroutineScope0;
        this.t = z1 ? Orientation.Vertical : Orientation.Horizontal;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getAfterContentPadding() {
        return this.q;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @NotNull
    public Map getAlignmentLines() {
        return this.d.getAlignmentLines();
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getBeforeContentPadding() {
        return this.p;
    }

    public final boolean getCanScrollBackward() {
        return this.a[0] != 0 || this.b[0] > 0;
    }

    public final boolean getCanScrollForward() {
        return this.e;
    }

    public final float getConsumedScroll() {
        return this.c;
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.s;
    }

    @NotNull
    public final Density getDensity() {
        return this.j;
    }

    @NotNull
    public final int[] getFirstVisibleItemIndices() {
        return this.a;
    }

    @NotNull
    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.b;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.d.getHeight();
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.r;
    }

    @NotNull
    public final MeasureResult getMeasureResult() {
        return this.d;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return this.t;
    }

    public final boolean getRemeasureNeeded() {
        return this.g;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @Nullable
    public Function1 getRulers() {
        return this.d.getRulers();
    }

    @NotNull
    public final LazyStaggeredGridSlots getSlots() {
        return this.h;
    }

    @NotNull
    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.i;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getTotalItemsCount() {
        return this.k;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportEndOffset() {
        return this.o;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public long getViewportSize-YbymL2g() {
        return this.m;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportStartOffset() {
        return this.n;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @NotNull
    public List getVisibleItemsInfo() {
        return this.l;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.d.getWidth();
    }

    public final boolean isVertical() {
        return this.f;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.d.placeChildren();
    }

    public final void setCanScrollForward(boolean z) {
        this.e = z;
    }

    public final void setConsumedScroll(float f) {
        this.c = f;
    }

    public final void setFirstVisibleItemScrollOffsets(@NotNull int[] arr_v) {
        this.b = arr_v;
    }

    public final boolean tryToApplyScrollWithoutRemeasure(int v) {
        if(!this.g && !this.getVisibleItemsInfo().isEmpty() && this.a.length != 0 && this.b.length != 0) {
            List list0 = this.getVisibleItemsInfo();
            int v2 = list0.size();
            int v3 = 0;
            while(true) {
                int v4 = 1;
                if(v3 >= v2) {
                    break;
                }
                LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem0 = (LazyStaggeredGridMeasuredItem)list0.get(v3);
                if(!lazyStaggeredGridMeasuredItem0.getNonScrollableItem()) {
                    int v5 = lazyStaggeredGridMeasuredItem0.getMainAxisOffset() > 0 ? 0 : 1;
                    if(lazyStaggeredGridMeasuredItem0.getMainAxisOffset() + v > 0) {
                        v4 = 0;
                    }
                    if(v5 != v4) {
                        return false;
                    }
                    if(lazyStaggeredGridMeasuredItem0.getMainAxisOffset() <= this.getViewportStartOffset()) {
                        if(v >= 0) {
                            if(this.getViewportStartOffset() - lazyStaggeredGridMeasuredItem0.getMainAxisOffset() <= v) {
                                return false;
                            }
                            goto label_19;
                        }
                        else if(lazyStaggeredGridMeasuredItem0.getMainAxisSizeWithSpacings() + lazyStaggeredGridMeasuredItem0.getMainAxisOffset() - this.getViewportStartOffset() > -v) {
                            goto label_19;
                        }
                        return false;
                    }
                label_19:
                    if(lazyStaggeredGridMeasuredItem0.getMainAxisSizeWithSpacings() + lazyStaggeredGridMeasuredItem0.getMainAxisOffset() >= this.getViewportEndOffset()) {
                        if(v >= 0) {
                            if(this.getViewportEndOffset() - lazyStaggeredGridMeasuredItem0.getMainAxisOffset() <= v) {
                                return false;
                            }
                            ++v3;
                            continue;
                        }
                        else if(lazyStaggeredGridMeasuredItem0.getMainAxisSizeWithSpacings() + lazyStaggeredGridMeasuredItem0.getMainAxisOffset() - this.getViewportEndOffset() > -v) {
                            ++v3;
                            continue;
                        }
                        return false;
                    }
                    ++v3;
                    continue;
                }
                return false;
            }
            int v6 = this.b.length;
            int[] arr_v = new int[v6];
            for(int v7 = 0; v7 < v6; ++v7) {
                arr_v[v7] = this.b[v7] - v;
            }
            this.b = arr_v;
            List list1 = this.getVisibleItemsInfo();
            int v8 = list1.size();
            for(int v1 = 0; v1 < v8; ++v1) {
                ((LazyStaggeredGridMeasuredItem)list1.get(v1)).applyScrollDelta(v);
            }
            this.c = (float)v;
            if(!this.e && v > 0) {
                this.e = true;
            }
            return true;
        }
        return false;
    }
}

