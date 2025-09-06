package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\bA\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u00C1\u0001\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\u0006\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\f\u001A\u00020\u0006\u0012\u0006\u0010\r\u001A\u00020\u0006\u0012\u0006\u0010\u000F\u001A\u00020\u000E\u0012\u0006\u0010\u0010\u001A\u00020\u0006\u0012\b\u0010\u0011\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001A\u00020\u0013\u0012\u0006\u0010\u0015\u001A\u00020\u0006\u0012\u0006\u0010\u0016\u001A\u00020\u000E\u0012\u0006\u0010\u0018\u001A\u00020\u0017\u0012\u0006\u0010\u0019\u001A\u00020\u0002\u0012\u0006\u0010\u001A\u001A\u00020\u000E\u0012\u000E\b\u0002\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u001E\u001A\u00020\u001D\u00A2\u0006\u0004\b\u001F\u0010 J\u0010\u0010\"\u001A\u00020!H\u0096\u0001\u00A2\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001A\u00020\u000E2\u0006\u0010$\u001A\u00020\u0006\u00A2\u0006\u0004\b%\u0010&R \u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010*R\u001A\u0010\u0007\u001A\u00020\u00068\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.R\u001A\u0010\b\u001A\u00020\u00068\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b/\u0010,\u001A\u0004\b0\u0010.R\u001A\u0010\t\u001A\u00020\u00068\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b1\u0010,\u001A\u0004\b2\u0010.R\u001A\u0010\u000B\u001A\u00020\n8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b3\u00104\u001A\u0004\b5\u00106R\u001A\u0010\f\u001A\u00020\u00068\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b7\u0010,\u001A\u0004\b8\u0010.R\u001A\u0010\r\u001A\u00020\u00068\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b9\u0010,\u001A\u0004\b:\u0010.R\u001A\u0010\u000F\u001A\u00020\u000E8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>R\u001A\u0010\u0010\u001A\u00020\u00068\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b?\u0010,\u001A\u0004\b@\u0010.R\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bA\u0010B\u001A\u0004\bC\u0010DR\u0019\u0010\u0012\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\bE\u0010B\u001A\u0004\bF\u0010DR\"\u0010\u0014\u001A\u00020\u00138\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bG\u0010H\u001A\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010\u0015\u001A\u00020\u00068\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bM\u0010,\u001A\u0004\bN\u0010.\"\u0004\bO\u0010PR\"\u0010\u0016\u001A\u00020\u000E8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bQ\u0010<\u001A\u0004\bR\u0010>\"\u0004\bS\u0010TR\u001A\u0010\u0018\u001A\u00020\u00178\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bU\u0010V\u001A\u0004\bW\u0010XR\u0017\u0010\u001A\u001A\u00020\u000E8\u0006\u00A2\u0006\f\n\u0004\bY\u0010<\u001A\u0004\bZ\u0010>R\u001D\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006\u00A2\u0006\f\n\u0004\b[\u0010(\u001A\u0004\b\\\u0010*R\u001D\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006\u00A2\u0006\f\n\u0004\b]\u0010(\u001A\u0004\b^\u0010*R\u0017\u0010\u001E\u001A\u00020\u001D8\u0006\u00A2\u0006\f\n\u0004\b_\u0010`\u001A\u0004\ba\u0010bR \u0010g\u001A\u000E\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u00060c8\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\be\u0010fR\u0014\u0010i\u001A\u00020\u00068\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bh\u0010.R\'\u0010o\u001A\u0015\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020!\u0018\u00010j\u00A2\u0006\u0002\bl8VX\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bm\u0010nR\u0014\u0010q\u001A\u00020\u00068\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\bp\u0010.R\u001A\u0010u\u001A\u00020r8VX\u0096\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\bs\u0010tR\u0014\u0010w\u001A\u00020\u00068VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bv\u0010.R\u0011\u0010y\u001A\u00020\u000E8F\u00A2\u0006\u0006\u001A\u0004\bx\u0010>\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006z"}, d2 = {"Landroidx/compose/foundation/pager/PagerMeasureResult;", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "", "Landroidx/compose/foundation/pager/MeasuredPage;", "visiblePagesInfo", "", "pageSize", "pageSpacing", "afterContentPadding", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "viewportStartOffset", "viewportEndOffset", "", "reverseLayout", "beyondViewportPageCount", "firstVisiblePage", "currentPage", "", "currentPageOffsetFraction", "firstVisiblePageScrollOffset", "canScrollForward", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "measureResult", "remeasureNeeded", "extraPagesBefore", "extraPagesAfter", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Ljava/util/List;IIILandroidx/compose/foundation/gestures/Orientation;IIZILandroidx/compose/foundation/pager/MeasuredPage;Landroidx/compose/foundation/pager/MeasuredPage;FIZLandroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/ui/layout/MeasureResult;ZLjava/util/List;Ljava/util/List;Lkotlinx/coroutines/CoroutineScope;)V", "", "placeChildren", "()V", "delta", "tryToApplyScrollWithoutRemeasure", "(I)Z", "a", "Ljava/util/List;", "getVisiblePagesInfo", "()Ljava/util/List;", "b", "I", "getPageSize", "()I", "c", "getPageSpacing", "d", "getAfterContentPadding", "e", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "f", "getViewportStartOffset", "g", "getViewportEndOffset", "h", "Z", "getReverseLayout", "()Z", "i", "getBeyondViewportPageCount", "j", "Landroidx/compose/foundation/pager/MeasuredPage;", "getFirstVisiblePage", "()Landroidx/compose/foundation/pager/MeasuredPage;", "k", "getCurrentPage", "l", "F", "getCurrentPageOffsetFraction", "()F", "setCurrentPageOffsetFraction", "(F)V", "m", "getFirstVisiblePageScrollOffset", "setFirstVisiblePageScrollOffset", "(I)V", "n", "getCanScrollForward", "setCanScrollForward", "(Z)V", "o", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "getSnapPosition", "()Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "p", "getRemeasureNeeded", "q", "getExtraPagesBefore", "r", "getExtraPagesAfter", "s", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "alignmentLines", "getHeight", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lkotlin/jvm/functions/Function1;", "rulers", "getWidth", "width", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "viewportSize", "getBeforeContentPadding", "beforeContentPadding", "getCanScrollBackward", "canScrollBackward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagerMeasureResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,131:1\n33#2,6:132\n33#2,6:138\n33#2,6:144\n*S KotlinDebug\n*F\n+ 1 PagerMeasureResult.kt\nandroidx/compose/foundation/pager/PagerMeasureResult\n*L\n112#1:132,6\n115#1:138,6\n118#1:144,6\n*E\n"})
public final class PagerMeasureResult implements PagerLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final Orientation e;
    public final int f;
    public final int g;
    public final boolean h;
    public final int i;
    public final MeasuredPage j;
    public final MeasuredPage k;
    public float l;
    public int m;
    public boolean n;
    public final SnapPosition o;
    public final boolean p;
    public final List q;
    public final List r;
    public final CoroutineScope s;
    public final MeasureResult t;

    public PagerMeasureResult(@NotNull List list0, int v, int v1, int v2, @NotNull Orientation orientation0, int v3, int v4, boolean z, int v5, @Nullable MeasuredPage measuredPage0, @Nullable MeasuredPage measuredPage1, float f, int v6, boolean z1, @NotNull SnapPosition snapPosition0, @NotNull MeasureResult measureResult0, boolean z2, @NotNull List list1, @NotNull List list2, @NotNull CoroutineScope coroutineScope0) {
        this.a = list0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = orientation0;
        this.f = v3;
        this.g = v4;
        this.h = z;
        this.i = v5;
        this.j = measuredPage0;
        this.k = measuredPage1;
        this.l = f;
        this.m = v6;
        this.n = z1;
        this.o = snapPosition0;
        this.p = z2;
        this.q = list1;
        this.r = list2;
        this.s = coroutineScope0;
        this.t = measureResult0;
    }

    public PagerMeasureResult(List list0, int v, int v1, int v2, Orientation orientation0, int v3, int v4, boolean z, int v5, MeasuredPage measuredPage0, MeasuredPage measuredPage1, float f, int v6, boolean z1, SnapPosition snapPosition0, MeasureResult measureResult0, boolean z2, List list1, List list2, CoroutineScope coroutineScope0, int v7, DefaultConstructorMarker defaultConstructorMarker0) {
        this(list0, v, v1, v2, orientation0, v3, v4, z, v5, measuredPage0, measuredPage1, f, v6, z1, snapPosition0, measureResult0, z2, ((v7 & 0x20000) == 0 ? list1 : CollectionsKt__CollectionsKt.emptyList()), ((v7 & 0x40000) == 0 ? list2 : CollectionsKt__CollectionsKt.emptyList()), coroutineScope0);
    }

    @Override  // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getAfterContentPadding() {
        return this.d;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @NotNull
    public Map getAlignmentLines() {
        return this.t.getAlignmentLines();
    }

    @Override  // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeforeContentPadding() {
        return -this.getViewportStartOffset();
    }

    @Override  // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getBeyondViewportPageCount() {
        return this.i;
    }

    public final boolean getCanScrollBackward() {
        return (this.j == null ? 0 : this.j.getIndex()) != 0 || this.m != 0;
    }

    public final boolean getCanScrollForward() {
        return this.n;
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.s;
    }

    @Nullable
    public final MeasuredPage getCurrentPage() {
        return this.k;
    }

    public final float getCurrentPageOffsetFraction() {
        return this.l;
    }

    @NotNull
    public final List getExtraPagesAfter() {
        return this.r;
    }

    @NotNull
    public final List getExtraPagesBefore() {
        return this.q;
    }

    @Nullable
    public final MeasuredPage getFirstVisiblePage() {
        return this.j;
    }

    public final int getFirstVisiblePageScrollOffset() {
        return this.m;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.t.getHeight();
    }

    @Override  // androidx.compose.foundation.pager.PagerLayoutInfo
    @NotNull
    public Orientation getOrientation() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSize() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getPageSpacing() {
        return this.c;
    }

    public final boolean getRemeasureNeeded() {
        return this.p;
    }

    @Override  // androidx.compose.foundation.pager.PagerLayoutInfo
    public boolean getReverseLayout() {
        return this.h;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @Nullable
    public Function1 getRulers() {
        return this.t.getRulers();
    }

    @Override  // androidx.compose.foundation.pager.PagerLayoutInfo
    @NotNull
    public SnapPosition getSnapPosition() {
        return this.o;
    }

    @Override  // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportEndOffset() {
        return this.g;
    }

    @Override  // androidx.compose.foundation.pager.PagerLayoutInfo
    public long getViewportSize-YbymL2g() {
        return IntSizeKt.IntSize(this.getWidth(), this.getHeight());
    }

    @Override  // androidx.compose.foundation.pager.PagerLayoutInfo
    public int getViewportStartOffset() {
        return this.f;
    }

    @Override  // androidx.compose.foundation.pager.PagerLayoutInfo
    @NotNull
    public List getVisiblePagesInfo() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.t.getWidth();
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.t.placeChildren();
    }

    public final void setCanScrollForward(boolean z) {
        this.n = z;
    }

    public final void setCurrentPageOffsetFraction(float f) {
        this.l = f;
    }

    public final void setFirstVisiblePageScrollOffset(int v) {
        this.m = v;
    }

    public final boolean tryToApplyScrollWithoutRemeasure(int v) {
        int v1 = this.getPageSpacing() + this.getPageSize();
        int v2 = 0;
        if(!this.p && !this.getVisiblePagesInfo().isEmpty() && this.j != null) {
            int v3 = this.m - v;
            if(v3 >= 0 && v3 < v1) {
                float f = v1 == 0 ? 0.0f : ((float)v) / ((float)v1);
                float f1 = this.l - f;
                if(this.k != null && f1 < 0.5f && f1 > -0.5f) {
                    MeasuredPage measuredPage0 = (MeasuredPage)CollectionsKt___CollectionsKt.first(this.getVisiblePagesInfo());
                    MeasuredPage measuredPage1 = (MeasuredPage)CollectionsKt___CollectionsKt.last(this.getVisiblePagesInfo());
                    if(v >= 0) {
                        if(Math.min(this.getViewportStartOffset() - measuredPage0.getOffset(), this.getViewportEndOffset() - measuredPage1.getOffset()) > v) {
                        label_14:
                            this.l -= f;
                            this.m -= v;
                            List list0 = this.getVisiblePagesInfo();
                            int v4 = list0.size();
                            for(int v5 = 0; v5 < v4; ++v5) {
                                ((MeasuredPage)list0.get(v5)).applyScrollDelta(v);
                            }
                            List list1 = this.q;
                            int v6 = list1.size();
                            for(int v7 = 0; v7 < v6; ++v7) {
                                ((MeasuredPage)list1.get(v7)).applyScrollDelta(v);
                            }
                            List list2 = this.r;
                            int v8 = list2.size();
                            while(v2 < v8) {
                                ((MeasuredPage)list2.get(v2)).applyScrollDelta(v);
                                ++v2;
                            }
                            v2 = 1;
                            if(!this.n && v > 0) {
                                this.n = true;
                            }
                        }
                    }
                    else if(Math.min(measuredPage0.getOffset() + v1 - this.getViewportStartOffset(), measuredPage1.getOffset() + v1 - this.getViewportEndOffset()) > -v) {
                        goto label_14;
                    }
                }
            }
        }
        return v2 != 0;
    }
}

