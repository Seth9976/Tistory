package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0011\u001A\u00020\u0005\u0012\u0006\u0010\u0013\u001A\u00020\u0012\u0012\u0006\u0010\u0014\u001A\u00020\u0005\u0012\u0006\u0010\u0015\u001A\u00020\u0005\u0012\u0006\u0010\u0016\u001A\u00020\r\u0012\u0006\u0010\u0017\u001A\u00020\u0005\u0012\u0006\u0010\u0019\u001A\u00020\u0018\u0012\u0006\u0010\u001B\u001A\u00020\u001A\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0019\u0010\u001F\u001A\u00020\r*\u00020\u00072\u0006\u0010\u001E\u001A\u00020\u0005\u00A2\u0006\u0004\b\u001F\u0010 J\'\u0010%\u001A\u00020\"*\u00020\u00072\u0006\u0010\u001E\u001A\u00020\u00052\u0006\u0010!\u001A\u00020\u0005\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105R\u001D\u0010\f\u001A\u00020\u000B8\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R\u0017\u0010\u000E\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b\u000E\u0010<R\u0017\u0010\u0010\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@R\u0017\u0010\u0011\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010DR\u001D\u0010\u0013\u001A\u00020\u00128\u0006\u00F8\u0001\u0001\u00F8\u0001\u0000\u00A2\u0006\f\n\u0004\bE\u00107\u001A\u0004\bF\u00109R\u0017\u0010\u0014\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\bG\u0010B\u001A\u0004\bH\u0010DR\u0017\u0010\u0015\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\bI\u0010B\u001A\u0004\bJ\u0010DR\u0017\u0010\u0016\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\bK\u0010;\u001A\u0004\bL\u0010<R\u0017\u0010\u0017\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\bM\u0010B\u001A\u0004\bN\u0010DR\u0017\u0010\u0019\u001A\u00020\u00188\u0006\u00A2\u0006\f\n\u0004\bO\u0010P\u001A\u0004\bQ\u0010RR\u0017\u0010\u001B\u001A\u00020\u001A8\u0006\u00A2\u0006\f\n\u0004\bS\u0010T\u001A\u0004\bU\u0010VR\u0017\u0010\\\u001A\u00020W8\u0006\u00A2\u0006\f\n\u0004\bX\u0010Y\u001A\u0004\bZ\u0010[R\u0017\u0010b\u001A\u00020]8\u0006\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b`\u0010aR\u0017\u0010e\u001A\u00020\u00058\u0006\u00A2\u0006\f\n\u0004\bc\u0010B\u001A\u0004\bd\u0010DR\u0016\u0010\u001F\u001A\u00020\r*\u00020\"8\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\bf\u0010gR\u0016\u0010b\u001A\u00020\u0005*\u00020\"8\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\bh\u0010i\u0082\u0002\u000B\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006j"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "", "", "pinnedItems", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "resolvedSlots", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "isVertical", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "measureScope", "mainAxisAvailableSize", "Landroidx/compose/ui/unit/IntOffset;", "contentOffset", "beforeContentPadding", "afterContentPadding", "reverseLayout", "mainAxisSpacing", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZLandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJIIZILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "itemIndex", "isFullSpan", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;I)Z", "lane", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "getSpanRange-lOCCd4c", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J", "getSpanRange", "a", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "getState", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "b", "Ljava/util/List;", "getPinnedItems", "()Ljava/util/List;", "c", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "getItemProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "d", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "getResolvedSlots", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "e", "J", "getConstraints-msEJaDk", "()J", "f", "Z", "()Z", "g", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "getMeasureScope", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "h", "I", "getMainAxisAvailableSize", "()I", "i", "getContentOffset-nOcc-ac", "j", "getBeforeContentPadding", "k", "getAfterContentPadding", "l", "getReverseLayout", "m", "getMainAxisSpacing", "n", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "o", "Landroidx/compose/ui/graphics/GraphicsContext;", "getGraphicsContext", "()Landroidx/compose/ui/graphics/GraphicsContext;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "p", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "getMeasuredItemProvider", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;", "measuredItemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "q", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneInfo", "r", "getLaneCount", "laneCount", "isFullSpan-SZVOQXA", "(J)Z", "getLaneInfo-SZVOQXA", "(J)I", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1334:1\n243#1:1340\n1009#2:1335\n1008#2:1336\n1007#2:1338\n1009#2:1341\n1008#2:1342\n1007#2:1344\n114#3:1337\n107#3:1339\n114#3:1343\n107#3:1345\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n*L\n246#1:1340\n243#1:1335\n243#1:1336\n243#1:1338\n246#1:1341\n246#1:1342\n246#1:1344\n243#1:1337\n243#1:1339\n246#1:1343\n246#1:1345\n*E\n"})
public final class LazyStaggeredGridMeasureContext {
    public static final int $stable = 8;
    public final LazyStaggeredGridState a;
    public final List b;
    public final LazyStaggeredGridItemProvider c;
    public final LazyStaggeredGridSlots d;
    public final long e;
    public final boolean f;
    public final LazyLayoutMeasureScope g;
    public final int h;
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final int m;
    public final CoroutineScope n;
    public final GraphicsContext o;
    public final LazyStaggeredGridMeasureContext.measuredItemProvider.1 p;
    public final LazyStaggeredGridLaneInfo q;
    public final int r;

    public LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState0, List list0, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider0, LazyStaggeredGridSlots lazyStaggeredGridSlots0, long v, boolean z, LazyLayoutMeasureScope lazyLayoutMeasureScope0, int v1, long v2, int v3, int v4, boolean z1, int v5, CoroutineScope coroutineScope0, GraphicsContext graphicsContext0, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = lazyStaggeredGridState0;
        this.b = list0;
        this.c = lazyStaggeredGridItemProvider0;
        this.d = lazyStaggeredGridSlots0;
        this.e = v;
        this.f = z;
        this.g = lazyLayoutMeasureScope0;
        this.h = v1;
        this.i = v2;
        this.j = v3;
        this.k = v4;
        this.l = z1;
        this.m = v5;
        this.n = coroutineScope0;
        this.o = graphicsContext0;
        this.p = new LazyStaggeredGridMeasureContext.measuredItemProvider.1(this, z, lazyStaggeredGridItemProvider0, lazyLayoutMeasureScope0, lazyStaggeredGridSlots0);
        this.q = lazyStaggeredGridState0.getLaneInfo$foundation_release();
        this.r = lazyStaggeredGridSlots0.getSizes().length;
    }

    public final int getAfterContentPadding() {
        return this.k;
    }

    public final int getBeforeContentPadding() {
        return this.j;
    }

    public final long getConstraints-msEJaDk() {
        return this.e;
    }

    public final long getContentOffset-nOcc-ac() {
        return this.i;
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.n;
    }

    @NotNull
    public final GraphicsContext getGraphicsContext() {
        return this.o;
    }

    @NotNull
    public final LazyStaggeredGridItemProvider getItemProvider() {
        return this.c;
    }

    public final int getLaneCount() {
        return this.r;
    }

    @NotNull
    public final LazyStaggeredGridLaneInfo getLaneInfo() {
        return this.q;
    }

    public final int getLaneInfo-SZVOQXA(long v) {
        return ((int)(0xFFFFFFFFL & v)) - ((int)(v >> 0x20)) == 1 ? ((int)(v >> 0x20)) : -2;
    }

    public final int getMainAxisAvailableSize() {
        return this.h;
    }

    public final int getMainAxisSpacing() {
        return this.m;
    }

    @NotNull
    public final LazyLayoutMeasureScope getMeasureScope() {
        return this.g;
    }

    @NotNull
    public final LazyStaggeredGridMeasureProvider getMeasuredItemProvider() {
        return this.p;
    }

    @NotNull
    public final List getPinnedItems() {
        return this.b;
    }

    @NotNull
    public final LazyStaggeredGridSlots getResolvedSlots() {
        return this.d;
    }

    public final boolean getReverseLayout() {
        return this.l;
    }

    public final long getSpanRange-lOCCd4c(@NotNull LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider0, int v, int v1) {
        boolean z = lazyStaggeredGridItemProvider0.getSpanProvider().isFullSpan(v);
        int v2 = z ? this.r : 1;
        if(z) {
            v1 = 0;
        }
        return ((long)(v2 + v1)) & 0xFFFFFFFFL | ((long)v1) << 0x20;
    }

    @NotNull
    public final LazyStaggeredGridState getState() {
        return this.a;
    }

    public final boolean isFullSpan(@NotNull LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider0, int v) {
        return lazyStaggeredGridItemProvider0.getSpanProvider().isFullSpan(v);
    }

    public final boolean isFullSpan-SZVOQXA(long v) {
        return ((int)(0xFFFFFFFFL & v)) - ((int)(v >> 0x20)) != 1;
    }

    public final boolean isVertical() {
        return this.f;
    }
}

