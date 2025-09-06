package androidx.compose.foundation.lazy.grid;

import androidx.annotation.IntRange;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import c0.g;
import c0.n;
import c0.q;
import c0.r;
import c0.s;
import c0.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Stable
@Metadata(d1 = {"\u0000\u00CA\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00A2\u00012\u00020\u0001:\u0002\u00A2\u0001B\'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bB\u001D\b\u0016\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0007\u0010\tJ$\u0010\r\u001A\u00020\f2\b\b\u0001\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u0002H\u0086@\u00A2\u0006\u0004\b\r\u0010\u000EJ!\u0010\u000F\u001A\u00020\f2\b\b\u0001\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u0002\u00A2\u0006\u0004\b\u000F\u0010\tJ\'\u0010\u0014\u001A\u00020\f2\u0006\u0010\n\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u001D\u001A\u00020\f2\u0006\u0010\u0016\u001A\u00020\u00152\'\u0010\u001C\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001A0\u0017\u00A2\u0006\u0002\b\u001BH\u0096@\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010!\u001A\u00020\u001F2\u0006\u0010 \u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001A\u00020\u001F2\u0006\u0010#\u001A\u00020\u001FH\u0000\u00A2\u0006\u0004\b$\u0010\"J$\u0010&\u001A\u00020\f2\b\b\u0001\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u0002H\u0086@\u00A2\u0006\u0004\b&\u0010\u000EJ!\u0010,\u001A\u00020\f2\u0006\u0010(\u001A\u00020\'2\b\b\u0002\u0010)\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b*\u0010+J\u001F\u00102\u001A\u00020\u00022\u0006\u0010.\u001A\u00020-2\u0006\u0010/\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b0\u00101R\u001A\u00108\u001A\u0002038\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u00107R$\u0010>\u001A\u00020\u001F2\u0006\u00109\u001A\u00020\u001F8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R$\u0010C\u001A\u00020\u00022\u0006\u00109\u001A\u00020\u00028\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010BR\"\u0010J\u001A\u00020\u00108\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bD\u0010E\u001A\u0004\bF\u0010G\"\u0004\bH\u0010IR(\u0010P\u001A\u0004\u0018\u00010K2\b\u00109\u001A\u0004\u0018\u00010K8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010OR\u001A\u0010V\u001A\u00020Q8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bR\u0010S\u001A\u0004\bT\u0010UR\u001A\u0010\\\u001A\u00020W8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bX\u0010Y\u001A\u0004\bZ\u0010[R \u0010c\u001A\b\u0012\u0004\u0012\u00020^0]8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b_\u0010`\u001A\u0004\ba\u0010bR\u001A\u0010i\u001A\u00020d8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\be\u0010f\u001A\u0004\bg\u0010hR\u001A\u0010o\u001A\u00020j8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bk\u0010l\u001A\u0004\bm\u0010nR\u001A\u0010u\u001A\u00020p8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bq\u0010r\u001A\u0004\bs\u0010tR \u0010{\u001A\u00020v8\u0000X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\bw\u0010x\u001A\u0004\by\u0010zR \u0010~\u001A\u00020v8\u0000X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\f\n\u0004\b|\u0010x\u001A\u0004\b}\u0010zR.\u0010\u0082\u0001\u001A\u00020\u00102\u0006\u00109\u001A\u00020\u00108V@RX\u0096\u008E\u0002\u00A2\u0006\u0014\n\u0004\b\u007F\u0010x\u001A\u0005\b\u0080\u0001\u0010G\"\u0005\b\u0081\u0001\u0010IR/\u0010\u0086\u0001\u001A\u00020\u00102\u0006\u00109\u001A\u00020\u00108V@RX\u0096\u008E\u0002\u00A2\u0006\u0015\n\u0005\b\u0083\u0001\u0010x\u001A\u0005\b\u0084\u0001\u0010G\"\u0005\b\u0085\u0001\u0010IR\u0012\u0010\u0003\u001A\u00020\u00028F\u00A2\u0006\u0007\u001A\u0005\b\u0087\u0001\u0010BR\u0012\u0010\u0004\u001A\u00020\u00028F\u00A2\u0006\u0007\u001A\u0005\b\u0088\u0001\u0010BR\u0015\u0010\u008C\u0001\u001A\u00030\u0089\u00018F\u00A2\u0006\b\u001A\u0006\b\u008A\u0001\u0010\u008B\u0001R\u0015\u0010\u0090\u0001\u001A\u00030\u008D\u00018F\u00A2\u0006\b\u001A\u0006\b\u008E\u0001\u0010\u008F\u0001R\u0016\u0010\u0092\u0001\u001A\u00020\u00028@X\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u0091\u0001\u0010BR\u0018\u0010\u0096\u0001\u001A\u00030\u0093\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u0094\u0001\u0010\u0095\u0001R!\u0010\u009C\u0001\u001A\u00030\u0097\u00018@X\u0080\u0084\u0002\u00A2\u0006\u0010\u001A\u0006\b\u0098\u0001\u0010\u0099\u0001*\u0006\b\u009A\u0001\u0010\u009B\u0001R\u0016\u0010\u009D\u0001\u001A\u00020\u00108VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u009D\u0001\u0010GR\u0016\u0010\u009F\u0001\u001A\u00020\u00108VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u009E\u0001\u0010GR\u0016\u0010\u00A1\u0001\u001A\u00020\u00108VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00A0\u0001\u0010G\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00A3\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "prefetchStrategy", "<init>", "(IILandroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;)V", "(II)V", "index", "scrollOffset", "", "scrollToItem", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestScrollToItem", "", "forceRemeasure", "snapToItemIndexInternal$foundation_release", "(IIZ)V", "snapToItemIndexInternal", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "(F)F", "distance", "onScroll$foundation_release", "onScroll", "animateScrollToItem", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "result", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;Z)V", "applyMeasureResult", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "itemProvider", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;I)I", "updateScrollPositionIfTheFirstItemWasMoved", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "d", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "<set-?>", "e", "F", "getScrollToBeConsumed$foundation_release", "()F", "scrollToBeConsumed", "g", "I", "getNumMeasurePasses$foundation_release", "()I", "numMeasurePasses", "h", "Z", "getPrefetchingEnabled$foundation_release", "()Z", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "Landroidx/compose/ui/layout/Remeasurement;", "i", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "j", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "k", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;", "l", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "getItemAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "m", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "n", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "q", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "r", "Landroidx/compose/runtime/MutableState;", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "placementScopeInvalidator", "s", "getMeasurementScopeInvalidator-zYiylxw$foundation_release", "measurementScopeInvalidator", "t", "getCanScrollForward", "setCanScrollForward", "canScrollForward", "u", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "getFirstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/grid/LazyGridLayoutInfo;", "layoutInfo", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "getSlotsPerLine$foundation_release", "slotsPerLine", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "getLastScrolledForward", "lastScrolledForward", "getLastScrolledBackward", "lastScrolledBackward", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,566:1\n81#2:567\n81#2:568\n107#2,2:569\n81#2:571\n107#2,2:572\n*S KotlinDebug\n*F\n+ 1 LazyGridState.kt\nandroidx/compose/foundation/lazy/grid/LazyGridState\n*L\n282#1:567\n380#1:568\n380#1:569,2\n382#1:571\n382#1:572,2\n*E\n"})
public final class LazyGridState implements ScrollableState {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001J!\u0010\b\u001A\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\t\u001A\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState$Companion;", "", "Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;", "prefetchStrategy", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "saver$foundation_release", "(Landroidx/compose/foundation/lazy/grid/LazyGridPrefetchStrategy;)Landroidx/compose/runtime/saveable/Saver;", "saver", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver getSaver() {
            return LazyGridState.v;
        }

        @ExperimentalFoundationApi
        @NotNull
        public final Saver saver$foundation_release(@NotNull LazyGridPrefetchStrategy lazyGridPrefetchStrategy0) {
            c c0 = new c(lazyGridPrefetchStrategy0);
            return ListSaverKt.listSaver(b.w, c0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final LazyGridPrefetchStrategy a;
    public final LazyGridScrollPosition b;
    public final MutableState c;
    public final MutableInteractionSource d;
    public float e;
    public final ScrollableState f;
    public int g;
    public boolean h;
    public Remeasurement i;
    public final androidx.compose.foundation.lazy.grid.LazyGridState.remeasurementModifier.1 j;
    public final AwaitFirstLayoutModifier k;
    public final LazyLayoutItemAnimator l;
    public final LazyLayoutBeyondBoundsInfo m;
    public final LazyLayoutPrefetchState n;
    public final androidx.compose.foundation.lazy.grid.LazyGridState.prefetchScope.1 o;
    public final LazyGridAnimateScrollScope p;
    public final LazyLayoutPinnedItemList q;
    public final MutableState r;
    public final MutableState s;
    public final MutableState t;
    public final MutableState u;
    public static final Saver v;

    static {
        LazyGridState.Companion = new Companion(null);
        LazyGridState.v = ListSaverKt.listSaver(g.y, n.y);
    }

    @ExperimentalFoundationApi
    public LazyGridState() {
        this(0, 0, null, 7, null);
    }

    public LazyGridState(int v, int v1) {
        this(v, v1, LazyGridPrefetchStrategyKt.LazyGridPrefetchStrategy$default(0, 1, null));
    }

    public LazyGridState(int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        this(v, v1);
    }

    @ExperimentalFoundationApi
    public LazyGridState(int v, int v1, @NotNull LazyGridPrefetchStrategy lazyGridPrefetchStrategy0) {
        this.a = lazyGridPrefetchStrategy0;
        this.b = new LazyGridScrollPosition(v, v1);
        this.c = SnapshotStateKt.mutableStateOf(LazyGridStateKt.a, SnapshotStateKt.neverEqualPolicy());
        this.d = InteractionSourceKt.MutableInteractionSource();
        this.f = ScrollableStateKt.ScrollableState(new g1(this, 16));
        this.h = true;
        this.j = new RemeasurementModifier() {
            public final LazyGridState a;

            {
                this.a = lazyGridState0;
            }

            @Override  // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(@NotNull Remeasurement remeasurement0) {
                this.a.i = remeasurement0;
            }
        };
        this.k = new AwaitFirstLayoutModifier();
        this.l = new LazyLayoutItemAnimator();
        this.m = new LazyLayoutBeyondBoundsInfo();
        this.n = new LazyLayoutPrefetchState(null, new q(this, v));
        this.o = new LazyGridPrefetchScope() {
            public final LazyGridState a;

            {
                this.a = lazyGridState0;
            }

            @Override  // androidx.compose.foundation.lazy.grid.LazyGridPrefetchScope
            @NotNull
            public List scheduleLinePrefetch(int v) {
                List list0 = new ArrayList();
                androidx.compose.runtime.snapshots.Snapshot.Companion snapshot$Companion0 = Snapshot.Companion;
                LazyGridState lazyGridState0 = this.a;
                Snapshot snapshot0 = snapshot$Companion0.getCurrentThreadSnapshot();
                Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
                Snapshot snapshot1 = snapshot$Companion0.makeCurrentNonObservable(snapshot0);
                try {
                    List list1 = (List)((LazyGridMeasureResult)lazyGridState0.c.getValue()).getPrefetchInfoRetriever().invoke(v);
                    int v2 = list1.size();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        Pair pair0 = (Pair)list1.get(v3);
                        list0.add(lazyGridState0.getPrefetchState$foundation_release().schedulePrefetch-0kLqBqw(((Number)pair0.getFirst()).intValue(), ((Constraints)pair0.getSecond()).unbox-impl()));
                    }
                    return list0;
                }
                finally {
                    snapshot$Companion0.restoreNonObservable(snapshot0, snapshot1, function10);
                }
            }
        };
        this.p = new LazyGridAnimateScrollScope(this);
        this.q = new LazyLayoutPinnedItemList();
        this.r = ObservableScopeInvalidator.constructor-impl$default(null, 1, null);
        this.s = ObservableScopeInvalidator.constructor-impl$default(null, 1, null);
        this.t = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.u = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public LazyGridState(int v, int v1, LazyGridPrefetchStrategy lazyGridPrefetchStrategy0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        if((v2 & 4) != 0) {
            lazyGridPrefetchStrategy0 = LazyGridPrefetchStrategyKt.LazyGridPrefetchStrategy$default(0, 1, null);
        }
        this(v, v1, lazyGridPrefetchStrategy0);
    }

    @Nullable
    public final Object animateScrollToItem(@IntRange(from = 0L) int v, int v1, @NotNull Continuation continuation0) {
        int v2 = this.getSlotsPerLine$foundation_release();
        Density density0 = this.getDensity$foundation_release();
        Object object0 = LazyAnimateScrollKt.animateScrollToItem(this.p, v, v1, v2 * 100, density0, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object animateScrollToItem$default(LazyGridState lazyGridState0, int v, int v1, Continuation continuation0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return lazyGridState0.animateScrollToItem(v, v1, continuation0);
    }

    public final void applyMeasureResult$foundation_release(@NotNull LazyGridMeasureResult lazyGridMeasureResult0, boolean z) {
        this.e -= lazyGridMeasureResult0.getConsumedScroll();
        this.c.setValue(lazyGridMeasureResult0);
        Boolean boolean0 = Boolean.valueOf(lazyGridMeasureResult0.getCanScrollBackward());
        this.u.setValue(boolean0);
        this.t.setValue(Boolean.valueOf(lazyGridMeasureResult0.getCanScrollForward()));
        LazyGridScrollPosition lazyGridScrollPosition0 = this.b;
        if(z) {
            lazyGridScrollPosition0.updateScrollOffset(lazyGridMeasureResult0.getFirstVisibleLineScrollOffset());
        }
        else {
            lazyGridScrollPosition0.updateFromMeasureResult(lazyGridMeasureResult0);
            if(this.h) {
                this.a.onVisibleItemsUpdated(this.o, lazyGridMeasureResult0);
            }
        }
        ++this.g;
    }

    public static void applyMeasureResult$foundation_release$default(LazyGridState lazyGridState0, LazyGridMeasureResult lazyGridMeasureResult0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        lazyGridState0.applyMeasureResult$foundation_release(lazyGridMeasureResult0, z);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.f.dispatchRawDelta(f);
    }

    @NotNull
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.k;
    }

    @NotNull
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.m;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean)this.u.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean)this.t.getValue()).booleanValue();
    }

    @NotNull
    public final Density getDensity$foundation_release() {
        return ((LazyGridMeasureResult)this.c.getValue()).getDensity();
    }

    public final int getFirstVisibleItemIndex() {
        return this.b.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.b.getScrollOffset();
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.d;
    }

    @NotNull
    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.d;
    }

    @NotNull
    public final LazyLayoutItemAnimator getItemAnimator$foundation_release() {
        return this.l;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.f.getLastScrolledBackward();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.f.getLastScrolledForward();
    }

    @NotNull
    public final LazyGridLayoutInfo getLayoutInfo() {
        return (LazyGridLayoutInfo)this.c.getValue();
    }

    @NotNull
    public final MutableState getMeasurementScopeInvalidator-zYiylxw$foundation_release() {
        return this.s;
    }

    @NotNull
    public final kotlin.ranges.IntRange getNearestRange$foundation_release() {
        return (kotlin.ranges.IntRange)this.b.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.g;
    }

    @NotNull
    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.q;
    }

    @NotNull
    public final MutableState getPlacementScopeInvalidator-zYiylxw$foundation_release() {
        return this.r;
    }

    @NotNull
    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.n;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.h;
    }

    @Nullable
    public final Remeasurement getRemeasurement$foundation_release() {
        return this.i;
    }

    @NotNull
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.j;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.e;
    }

    public final int getSlotsPerLine$foundation_release() {
        return ((LazyGridMeasureResult)this.c.getValue()).getSlotsPerLine();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.f.isScrollInProgress();
    }

    public final float onScroll$foundation_release(float f) {
        if(f < 0.0f && !this.getCanScrollForward() || f > 0.0f && !this.getCanScrollBackward()) {
            return 0.0f;
        }
        if(Math.abs(this.e) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.e).toString());
        }
        float f1 = this.e + f;
        this.e = f1;
        if(Math.abs(f1) > 0.5f) {
            LazyGridMeasureResult lazyGridMeasureResult0 = (LazyGridMeasureResult)this.c.getValue();
            float f2 = this.e;
            boolean z = lazyGridMeasureResult0.tryToApplyScrollWithoutRemeasure(zd.c.roundToInt(f2));
            LazyGridPrefetchStrategy lazyGridPrefetchStrategy0 = this.a;
            androidx.compose.foundation.lazy.grid.LazyGridState.prefetchScope.1 lazyGridState$prefetchScope$10 = this.o;
            if(z) {
                this.applyMeasureResult$foundation_release(lazyGridMeasureResult0, true);
                ObservableScopeInvalidator.invalidateScope-impl(this.r);
                float f3 = f2 - this.e;
                if(this.h) {
                    lazyGridPrefetchStrategy0.onScroll(lazyGridState$prefetchScope$10, f3, lazyGridMeasureResult0);
                }
            }
            else {
                Remeasurement remeasurement0 = this.i;
                if(remeasurement0 != null) {
                    remeasurement0.forceRemeasure();
                }
                float f4 = f2 - this.e;
                LazyGridLayoutInfo lazyGridLayoutInfo0 = this.getLayoutInfo();
                if(this.h) {
                    lazyGridPrefetchStrategy0.onScroll(lazyGridState$prefetchScope$10, f4, lazyGridLayoutInfo0);
                }
            }
        }
        if(Math.abs(this.e) <= 0.5f) {
            return f;
        }
        float f5 = f - this.e;
        this.e = 0.0f;
        return f5;
    }

    public final void requestScrollToItem(@IntRange(from = 0L) int v, int v1) {
        if(this.isScrollInProgress()) {
            BuildersKt.launch$default(((LazyGridMeasureResult)this.c.getValue()).getCoroutineScope(), null, null, new r(this, null), 3, null);
        }
        this.snapToItemIndexInternal$foundation_release(v, v1, false);
    }

    public static void requestScrollToItem$default(LazyGridState lazyGridState0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        lazyGridState0.requestScrollToItem(v, v1);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        LazyGridState lazyGridState0;
        s s0;
        if(continuation0 instanceof s) {
            s0 = (s)continuation0;
            int v = s0.t;
            if((v & 0x80000000) == 0) {
                s0 = new s(this, continuation0);
            }
            else {
                s0.t = v ^ 0x80000000;
            }
        }
        else {
            s0 = new s(this, continuation0);
        }
        Object object0 = s0.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(s0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                s0.o = this;
                s0.p = mutatePriority0;
                s0.q = function20;
                s0.t = 1;
                if(this.k.waitForFirstLayout(s0) == object1) {
                    return object1;
                }
                lazyGridState0 = this;
                break;
            }
            case 1: {
                function20 = s0.q;
                mutatePriority0 = s0.p;
                lazyGridState0 = s0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                return Unit.INSTANCE;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        s0.o = null;
        s0.p = null;
        s0.q = null;
        s0.t = 2;
        return lazyGridState0.f.scroll(mutatePriority0, function20, s0) == object1 ? object1 : Unit.INSTANCE;
    }

    @Nullable
    public final Object scrollToItem(@IntRange(from = 0L) int v, int v1, @NotNull Continuation continuation0) {
        Object object0 = ScrollableState.scroll$default(this, null, new t(this, v, v1, null), continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object scrollToItem$default(LazyGridState lazyGridState0, int v, int v1, Continuation continuation0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return lazyGridState0.scrollToItem(v, v1, continuation0);
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.h = z;
    }

    public final void snapToItemIndexInternal$foundation_release(int v, int v1, boolean z) {
        LazyGridScrollPosition lazyGridScrollPosition0 = this.b;
        if(lazyGridScrollPosition0.getIndex() != v || lazyGridScrollPosition0.getScrollOffset() != v1) {
            this.l.reset();
        }
        lazyGridScrollPosition0.requestPositionAndForgetLastKnownKey(v, v1);
        if(z) {
            Remeasurement remeasurement0 = this.i;
            if(remeasurement0 != null) {
                remeasurement0.forceRemeasure();
            }
        }
        else {
            ObservableScopeInvalidator.invalidateScope-impl(this.s);
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@NotNull LazyGridItemProvider lazyGridItemProvider0, int v) {
        return this.b.updateScrollPositionIfTheFirstItemWasMoved(lazyGridItemProvider0, v);
    }
}

