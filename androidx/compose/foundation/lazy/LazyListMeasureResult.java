package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b@\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u009F\u0001\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\u0002\u0012\u0006\u0010\f\u001A\u00020\t\u0012\u0006\u0010\r\u001A\u00020\u0007\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0011\u001A\u00020\u0010\u0012\u0006\u0010\u0013\u001A\u00020\u0012\u0012\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\u0006\u0010\u0016\u001A\u00020\u0005\u0012\u0006\u0010\u0017\u001A\u00020\u0005\u0012\u0006\u0010\u0018\u001A\u00020\u0005\u0012\u0006\u0010\u0019\u001A\u00020\u0007\u0012\u0006\u0010\u001B\u001A\u00020\u001A\u0012\u0006\u0010\u001C\u001A\u00020\u0005\u0012\u0006\u0010\u001D\u001A\u00020\u0005\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010!\u001A\u00020 H\u0096\u0001\u00A2\u0006\u0004\b!\u0010\"J\u001D\u0010%\u001A\u00020\u00072\u0006\u0010#\u001A\u00020\u00052\u0006\u0010$\u001A\u00020\u0007\u00A2\u0006\u0004\b%\u0010&R\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00038\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*R\"\u0010\u0006\u001A\u00020\u00058\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\b\u001A\u00020\u00078\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b1\u00102\u001A\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\n\u001A\u00020\t8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b7\u00108\u001A\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0017\u0010\f\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b=\u00108\u001A\u0004\b>\u0010:R\u0017\u0010\r\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b?\u00102\u001A\u0004\b@\u00104R\u0017\u0010\u000F\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010DR\u0017\u0010\u0011\u001A\u00020\u00108\u0006\u00A2\u0006\f\n\u0004\bE\u0010F\u001A\u0004\bG\u0010HR\u001D\u0010\u0013\u001A\u00020\u00128\u0006\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bI\u0010J\u001A\u0004\bK\u0010LR \u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00030\u00148\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010PR\u001A\u0010\u0016\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bQ\u0010,\u001A\u0004\bR\u0010.R\u001A\u0010\u0017\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bS\u0010,\u001A\u0004\bT\u0010.R\u001A\u0010\u0018\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bU\u0010,\u001A\u0004\bV\u0010.R\u001A\u0010\u0019\u001A\u00020\u00078\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bW\u00102\u001A\u0004\bX\u00104R\u001A\u0010\u001B\u001A\u00020\u001A8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bY\u0010Z\u001A\u0004\b[\u0010\\R\u001A\u0010\u001C\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b]\u0010,\u001A\u0004\b^\u0010.R\u001A\u0010\u001D\u001A\u00020\u00058\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b_\u0010,\u001A\u0004\b`\u0010.R \u0010e\u001A\u000E\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u00050a8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bc\u0010dR\u0014\u0010g\u001A\u00020\u00058\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bf\u0010.R\'\u0010m\u001A\u0015\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020 \u0018\u00010h\u00A2\u0006\u0002\bj8VX\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bk\u0010lR\u0014\u0010o\u001A\u00020\u00058\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bn\u0010.R\u0011\u0010q\u001A\u00020\u00078F\u00A2\u0006\u0006\u001A\u0004\bp\u00104R\u001A\u0010t\u001A\u00020r8VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bs\u0010LR\u0014\u0010v\u001A\u00020\u00058VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bu\u0010.\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006w"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "firstVisibleItem", "", "firstVisibleItemScrollOffset", "", "canScrollForward", "", "consumedScroll", "measureResult", "scrollBackAmount", "remeasureNeeded", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Constraints;", "childConstraints", "", "visibleItemsInfo", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "afterContentPadding", "mainAxisItemSpacing", "<init>", "(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;JLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "placeChildren", "()V", "delta", "updateAnimations", "tryToApplyScrollWithoutRemeasure", "(IZ)Z", "a", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "getFirstVisibleItem", "()Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "b", "I", "getFirstVisibleItemScrollOffset", "()I", "setFirstVisibleItemScrollOffset", "(I)V", "c", "Z", "getCanScrollForward", "()Z", "setCanScrollForward", "(Z)V", "d", "F", "getConsumedScroll", "()F", "setConsumedScroll", "(F)V", "e", "getScrollBackAmount", "f", "getRemeasureNeeded", "g", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "h", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "i", "J", "getChildConstraints-msEJaDk", "()J", "j", "Ljava/util/List;", "getVisibleItemsInfo", "()Ljava/util/List;", "k", "getViewportStartOffset", "l", "getViewportEndOffset", "m", "getTotalItemsCount", "n", "getReverseLayout", "o", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "p", "getAfterContentPadding", "q", "getMainAxisItemSpacing", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width", "getCanScrollBackward", "canScrollBackward", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyListMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,134:1\n33#2,6:135\n*S KotlinDebug\n*F\n+ 1 LazyListMeasureResult.kt\nandroidx/compose/foundation/lazy/LazyListMeasureResult\n*L\n120#1:135,6\n*E\n"})
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    public final LazyListMeasuredItem a;
    public int b;
    public boolean c;
    public float d;
    public final float e;
    public final boolean f;
    public final CoroutineScope g;
    public final Density h;
    public final long i;
    public final List j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final Orientation o;
    public final int p;
    public final int q;
    public final MeasureResult r;

    public LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem0, int v, boolean z, float f, MeasureResult measureResult0, float f1, boolean z1, CoroutineScope coroutineScope0, Density density0, long v1, List list0, int v2, int v3, int v4, boolean z2, Orientation orientation0, int v5, int v6, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = lazyListMeasuredItem0;
        this.b = v;
        this.c = z;
        this.d = f;
        this.e = f1;
        this.f = z1;
        this.g = coroutineScope0;
        this.h = density0;
        this.i = v1;
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

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getAfterContentPadding() {
        return this.p;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @NotNull
    public Map getAlignmentLines() {
        return this.r.getAlignmentLines();
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getBeforeContentPadding() {
        return -this.getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        return (this.a == null ? 0 : this.a.getIndex()) != 0 || this.b != 0;
    }

    public final boolean getCanScrollForward() {
        return this.c;
    }

    public final long getChildConstraints-msEJaDk() {
        return this.i;
    }

    public final float getConsumedScroll() {
        return this.d;
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.g;
    }

    @NotNull
    public final Density getDensity() {
        return this.h;
    }

    @Nullable
    public final LazyListMeasuredItem getFirstVisibleItem() {
        return this.a;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.b;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.r.getHeight();
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.q;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return this.o;
    }

    public final boolean getRemeasureNeeded() {
        return this.f;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public boolean getReverseLayout() {
        return this.n;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @Nullable
    public Function1 getRulers() {
        return this.r.getRulers();
    }

    public final float getScrollBackAmount() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return this.m;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportEndOffset() {
        return this.l;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public long getViewportSize-YbymL2g() {
        return IntSizeKt.IntSize(this.getWidth(), this.getHeight());
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportStartOffset() {
        return this.k;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
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

    public final void setFirstVisibleItemScrollOffset(int v) {
        this.b = v;
    }

    public final boolean tryToApplyScrollWithoutRemeasure(int v, boolean z) {
        int v1 = 0;
        if(!this.f && !this.getVisibleItemsInfo().isEmpty()) {
            LazyListMeasuredItem lazyListMeasuredItem0 = this.a;
            if(lazyListMeasuredItem0 != null) {
                int v2 = this.b - v;
                if(v2 >= 0 && v2 < lazyListMeasuredItem0.getMainAxisSizeWithSpacings()) {
                    LazyListMeasuredItem lazyListMeasuredItem1 = (LazyListMeasuredItem)CollectionsKt___CollectionsKt.first(this.getVisibleItemsInfo());
                    LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem)CollectionsKt___CollectionsKt.last(this.getVisibleItemsInfo());
                    if(!lazyListMeasuredItem1.getNonScrollableItem() && !lazyListMeasuredItem2.getNonScrollableItem()) {
                        if(v >= 0) {
                            if(Math.min(this.getViewportStartOffset() - lazyListMeasuredItem1.getOffset(), this.getViewportEndOffset() - lazyListMeasuredItem2.getOffset()) > v) {
                            label_13:
                                this.b -= v;
                                List list0 = this.getVisibleItemsInfo();
                                int v3 = list0.size();
                                while(v1 < v3) {
                                    ((LazyListMeasuredItem)list0.get(v1)).applyScrollDelta(v, z);
                                    ++v1;
                                }
                                this.d = (float)v;
                                v1 = 1;
                                if(!this.c && v > 0) {
                                    this.c = true;
                                }
                            }
                        }
                        else if(Math.min(lazyListMeasuredItem1.getMainAxisSizeWithSpacings() + lazyListMeasuredItem1.getOffset() - this.getViewportStartOffset(), lazyListMeasuredItem2.getMainAxisSizeWithSpacings() + lazyListMeasuredItem2.getOffset() - this.getViewportEndOffset()) > -v) {
                            goto label_13;
                        }
                    }
                }
            }
        }
        return v1 != 0;
    }
}

