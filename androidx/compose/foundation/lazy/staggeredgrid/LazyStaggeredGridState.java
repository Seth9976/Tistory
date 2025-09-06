package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.platform.i;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import e0.k;
import e0.m;
import e0.n;
import e0.o;
import e0.p;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;
import zd.c;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00D6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00AE\u00012\u00020\u0001:\u0002\u00AE\u0001B#\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\u0004\b\u0007\u0010\bB\u001D\b\u0016\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\b\b\u0002\u0010\u000B\u001A\u00020\t\u00A2\u0006\u0004\b\u0007\u0010\fJA\u0010\u0016\u001A\u00020\u00122\u0006\u0010\u000E\u001A\u00020\r2\'\u0010\u0015\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000F\u00A2\u0006\u0002\b\u0014H\u0096@\u00A2\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001A\u001A\u00020\u00122\u0006\u0010\u0018\u001A\u00020\t2\b\b\u0002\u0010\u0019\u001A\u00020\tH\u0086@\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\"\u0010\u001C\u001A\u00020\u00122\u0006\u0010\u0018\u001A\u00020\t2\b\b\u0002\u0010\u0019\u001A\u00020\tH\u0086@\u00A2\u0006\u0004\b\u001C\u0010\u001BJ!\u0010\u001D\u001A\u00020\u00122\b\b\u0001\u0010\u0018\u001A\u00020\t2\b\b\u0002\u0010\u0019\u001A\u00020\t\u00A2\u0006\u0004\b\u001D\u0010\fJ\'\u0010\"\u001A\u00020\u00122\u0006\u0010\u0018\u001A\u00020\t2\u0006\u0010\u0019\u001A\u00020\t2\u0006\u0010\u001F\u001A\u00020\u001EH\u0000\u00A2\u0006\u0004\b \u0010!J\u001F\u0010(\u001A\u00020\u00022\u0006\u0010$\u001A\u00020#2\u0006\u0010%\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b&\u0010\'J\u0017\u0010+\u001A\u00020)2\u0006\u0010*\u001A\u00020)H\u0016\u00A2\u0006\u0004\b+\u0010,J!\u00102\u001A\u00020\u00122\u0006\u0010.\u001A\u00020-2\b\b\u0002\u0010/\u001A\u00020\u001EH\u0000\u00A2\u0006\u0004\b0\u00101R\u001A\u00108\u001A\u0002038\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u00107R\u001A\u0010>\u001A\u0002098\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R+\u0010F\u001A\u00020\u001E2\u0006\u0010?\u001A\u00020\u001E8V@RX\u0096\u008E\u0002\u00A2\u0006\u0012\n\u0004\b@\u0010A\u001A\u0004\bB\u0010C\"\u0004\bD\u0010ER+\u0010J\u001A\u00020\u001E2\u0006\u0010?\u001A\u00020\u001E8V@RX\u0096\u008E\u0002\u00A2\u0006\u0012\n\u0004\bG\u0010A\u001A\u0004\bH\u0010C\"\u0004\bI\u0010ER(\u0010P\u001A\u0004\u0018\u00010K2\b\u0010?\u001A\u0004\u0018\u00010K8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010OR\u001A\u0010V\u001A\u00020Q8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bR\u0010S\u001A\u0004\bT\u0010UR\u001A\u0010\\\u001A\u00020W8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bX\u0010Y\u001A\u0004\bZ\u0010[R\u001A\u0010b\u001A\u00020]8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b`\u0010aR\"\u0010g\u001A\u00020\u001E8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bc\u0010d\u001A\u0004\be\u0010C\"\u0004\bf\u0010ER\u001A\u0010m\u001A\u00020h8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bi\u0010j\u001A\u0004\bk\u0010lR$\u0010r\u001A\u00020)2\u0006\u0010?\u001A\u00020)8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bn\u0010o\u001A\u0004\bp\u0010qR\"\u0010y\u001A\u00020\t8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bs\u0010t\u001A\u0004\bu\u0010v\"\u0004\bw\u0010xR\u001A\u0010\u007F\u001A\u00020z8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b{\u0010|\u001A\u0004\b}\u0010~R \u0010\u0085\u0001\u001A\u00030\u0080\u00018\u0000X\u0080\u0004\u00A2\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001A\u0006\b\u0083\u0001\u0010\u0084\u0001R\'\u0010\u008C\u0001\u001A\n\u0012\u0005\u0012\u00030\u0087\u00010\u0086\u00018\u0000X\u0080\u0004\u00A2\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001A\u0006\b\u008A\u0001\u0010\u008B\u0001R%\u0010\u0091\u0001\u001A\u00030\u008D\u00018\u0000X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000F\n\u0005\b\u008E\u0001\u0010A\u001A\u0006\b\u008F\u0001\u0010\u0090\u0001R%\u0010\u0094\u0001\u001A\u00030\u008D\u00018\u0000X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000F\n\u0005\b\u0092\u0001\u0010A\u001A\u0006\b\u0093\u0001\u0010\u0090\u0001R\u0013\u0010\u0096\u0001\u001A\u00020\t8F\u00A2\u0006\u0007\u001A\u0005\b\u0095\u0001\u0010vR\u0013\u0010\u0098\u0001\u001A\u00020\t8F\u00A2\u0006\u0007\u001A\u0005\b\u0097\u0001\u0010vR\u0015\u0010\u009C\u0001\u001A\u00030\u0099\u00018F\u00A2\u0006\b\u001A\u0006\b\u009A\u0001\u0010\u009B\u0001R\u0016\u0010\u009E\u0001\u001A\u00020\u001E8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u009D\u0001\u0010CR\u0016\u0010\u00A0\u0001\u001A\u00020\u001E8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u009F\u0001\u0010CR\u0016\u0010\u00A2\u0001\u001A\u00020\t8@X\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00A1\u0001\u0010vR\u0015\u0010\u00A6\u0001\u001A\u00030\u00A3\u00018F\u00A2\u0006\b\u001A\u0006\b\u00A4\u0001\u0010\u00A5\u0001R!\u0010\u00AC\u0001\u001A\u00030\u00A7\u00018@X\u0080\u0084\u0002\u00A2\u0006\u0010\u001A\u0006\b\u00A8\u0001\u0010\u00A9\u0001*\u0006\b\u00AA\u0001\u0010\u00AB\u0001R\u0016\u0010\u00AD\u0001\u001A\u00020\u001E8VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00AD\u0001\u0010C\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00AF\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "initialFirstVisibleItems", "initialFirstVisibleOffsets", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "prefetchScheduler", "<init>", "([I[ILandroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "", "initialFirstVisibleItemIndex", "initialFirstVisibleItemOffset", "(II)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "index", "scrollOffset", "scrollToItem", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateScrollToItem", "requestScrollToItem", "", "forceRemeasure", "snapToItemInternal$foundation_release", "(IIZ)V", "snapToItemInternal", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;[I)[I", "updateScrollPositionIfTheFirstItemWasMoved", "", "delta", "dispatchRawDelta", "(F)F", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "result", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;Z)V", "applyMeasureResult", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "a", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "getScrollPosition$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;", "scrollPosition", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "c", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "getLaneInfo$foundation_release", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;", "laneInfo", "<set-?>", "d", "Landroidx/compose/runtime/MutableState;", "getCanScrollForward", "()Z", "setCanScrollForward", "(Z)V", "canScrollForward", "e", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "Landroidx/compose/ui/layout/Remeasurement;", "g", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "h", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "i", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "j", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "k", "Z", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "prefetchingEnabled", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "l", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "n", "F", "getScrollToBeConsumed$foundation_release", "()F", "scrollToBeConsumed", "o", "I", "getMeasurePassCount$foundation_release", "()I", "setMeasurePassCount$foundation_release", "(I)V", "measurePassCount", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "r", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getMutableInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "mutableInteractionSource", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "s", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "t", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "getItemAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "u", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "placementScopeInvalidator", "v", "getMeasurementScopeInvalidator-zYiylxw$foundation_release", "measurementScopeInvalidator", "getFirstVisibleItemIndex", "firstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "firstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLayoutInfo;", "layoutInfo", "getLastScrolledForward", "lastScrolledForward", "getLastScrolledBackward", "lastScrolledBackward", "getLaneCount$foundation_release", "laneCount", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,595:1\n81#2:596\n107#2,2:597\n81#2:599\n107#2,2:600\n81#2:602\n1855#3,2:603\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridState.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState\n*L\n145#1:596\n145#1:597,2\n147#1:599\n147#1:600,2\n219#1:602\n507#1:603,2\n*E\n"})
public final class LazyStaggeredGridState implements ScrollableState {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R#\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState$Companion;", "", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver getSaver() {
            return LazyStaggeredGridState.w;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final LazyStaggeredGridScrollPosition a;
    public final MutableState b;
    public final LazyStaggeredGridLaneInfo c;
    public final MutableState d;
    public final MutableState e;
    public final LazyStaggeredGridAnimateScrollScope f;
    public Remeasurement g;
    public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.remeasurementModifier.1 h;
    public final AwaitFirstLayoutModifier i;
    public final LazyLayoutBeyondBoundsInfo j;
    public boolean k;
    public final LazyLayoutPrefetchState l;
    public final ScrollableState m;
    public float n;
    public int o;
    public int p;
    public final LinkedHashMap q;
    public final MutableInteractionSource r;
    public final LazyLayoutPinnedItemList s;
    public final LazyLayoutItemAnimator t;
    public final MutableState u;
    public final MutableState v;
    public static final Saver w;

    static {
        LazyStaggeredGridState.Companion = new Companion(null);
        LazyStaggeredGridState.$stable = 8;
        LazyStaggeredGridState.w = ListSaverKt.listSaver(m.w, k.y);
    }

    public LazyStaggeredGridState(int v, int v1) {
        this(new int[]{v}, new int[]{v1}, null);
    }

    public LazyStaggeredGridState(int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        this(v, v1);
    }

    public LazyStaggeredGridState(@NotNull int[] arr_v, @NotNull int[] arr_v1, @Nullable PrefetchScheduler prefetchScheduler0) {
        this.a = new LazyStaggeredGridScrollPosition(arr_v, arr_v1, new i(2, this, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0, 3));
        this.b = SnapshotStateKt.mutableStateOf(LazyStaggeredGridMeasureResultKt.getEmptyLazyStaggeredGridLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this.c = new LazyStaggeredGridLaneInfo();
        this.d = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.e = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f = new LazyStaggeredGridAnimateScrollScope(this);
        this.h = new RemeasurementModifier() {
            public final LazyStaggeredGridState a;

            {
                this.a = lazyStaggeredGridState0;
            }

            @Override  // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(@NotNull Remeasurement remeasurement0) {
                this.a.g = remeasurement0;
            }
        };
        this.i = new AwaitFirstLayoutModifier();
        this.j = new LazyLayoutBeyondBoundsInfo();
        this.k = true;
        this.l = new LazyLayoutPrefetchState(prefetchScheduler0, null, 2, null);
        this.m = ScrollableStateKt.ScrollableState(new g1(this, 23));
        this.p = -1;
        this.q = new LinkedHashMap();
        this.r = InteractionSourceKt.MutableInteractionSource();
        this.s = new LazyLayoutPinnedItemList();
        this.t = new LazyLayoutItemAnimator();
        this.u = ObservableScopeInvalidator.constructor-impl$default(null, 1, null);
        this.v = ObservableScopeInvalidator.constructor-impl$default(null, 1, null);
    }

    public final void a(float f, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult0) {
        int v4;
        LinkedHashMap linkedHashMap0;
        if(this.k && !lazyStaggeredGridMeasureResult0.getVisibleItemsInfo().isEmpty()) {
            boolean z = Float.compare(f, 0.0f) < 0;
            int v = z ? ((LazyStaggeredGridMeasuredItem)CollectionsKt___CollectionsKt.last(lazyStaggeredGridMeasureResult0.getVisibleItemsInfo())).getIndex() : ((LazyStaggeredGridMeasuredItem)CollectionsKt___CollectionsKt.first(lazyStaggeredGridMeasureResult0.getVisibleItemsInfo())).getIndex();
            if(v == this.p) {
                return;
            }
            this.p = v;
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            LazyStaggeredGridSlots lazyStaggeredGridSlots0 = lazyStaggeredGridMeasureResult0.getSlots();
            int[] arr_v = lazyStaggeredGridSlots0.getSizes();
            for(int v1 = 0; true; ++v1) {
                linkedHashMap0 = this.q;
                if(v1 >= arr_v.length) {
                    break;
                }
                v = z ? this.c.findNextItemIndex(v, v1) : this.c.findPreviousItemIndex(v, v1);
                if(v < 0 || v >= lazyStaggeredGridMeasureResult0.getTotalItemsCount() || linkedHashSet0.contains(v)) {
                    break;
                }
                linkedHashSet0.add(v);
                if(!linkedHashMap0.containsKey(v)) {
                    boolean z1 = lazyStaggeredGridMeasureResult0.getSpanProvider().isFullSpan(v);
                    int v2 = z1 ? 0 : v1;
                    int v3 = z1 ? arr_v.length : 1;
                    if(v3 == 1) {
                        v4 = lazyStaggeredGridSlots0.getSizes()[v2];
                    }
                    else {
                        int v5 = v2 + v3 - 1;
                        v4 = lazyStaggeredGridSlots0.getPositions()[v5] + lazyStaggeredGridSlots0.getSizes()[v5] - lazyStaggeredGridSlots0.getPositions()[v2];
                    }
                    long v6 = lazyStaggeredGridMeasureResult0.getOrientation() == Orientation.Vertical ? Constraints.Companion.fixedWidth-OenEA2s(v4) : Constraints.Companion.fixedHeight-OenEA2s(v4);
                    linkedHashMap0.put(v, this.l.schedulePrefetch-0kLqBqw(v, v6));
                }
            }
            Iterator iterator0 = linkedHashMap0.entrySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(!linkedHashSet0.contains(map$Entry0.getKey())) {
                    ((PrefetchHandle)map$Entry0.getValue()).cancel();
                    iterator0.remove();
                }
            }
        }
    }

    public static final int[] access$fillNearestIndices(LazyStaggeredGridState lazyStaggeredGridState0, int v, int v1) {
        int v3;
        lazyStaggeredGridState0.getClass();
        int[] arr_v = new int[v1];
        if(((LazyStaggeredGridMeasureResult)lazyStaggeredGridState0.b.getValue()).getSpanProvider().isFullSpan(v)) {
            ArraysKt___ArraysJvmKt.fill$default(arr_v, v, 0, 0, 6, null);
            return arr_v;
        }
        LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo0 = lazyStaggeredGridState0.c;
        lazyStaggeredGridLaneInfo0.ensureValidIndex(v + v1);
        int v2 = lazyStaggeredGridLaneInfo0.getLane(v);
        if(v2 == -2 || v2 == -1) {
            v3 = 0;
        }
        else {
            if(v2 < 0) {
                throw new IllegalArgumentException(("Expected positive lane number, got " + v2 + " instead.").toString());
            }
            v3 = Math.min(v2, v1);
        }
        int v4 = v3;
        int v5 = v4 - 1;
        int v6 = v;
        while(-1 < v5) {
            v6 = lazyStaggeredGridLaneInfo0.findPreviousItemIndex(v6, v5);
            arr_v[v5] = v6;
            if(v6 == -1) {
                ArraysKt___ArraysJvmKt.fill$default(arr_v, -1, 0, v5, 2, null);
                break;
            }
            --v5;
        }
        arr_v[v4] = v;
        while(true) {
            ++v4;
            if(v4 >= v1) {
                break;
            }
            v = lazyStaggeredGridLaneInfo0.findNextItemIndex(v, v4);
            arr_v[v4] = v;
        }
        return arr_v;
    }

    public static final float access$onScroll(LazyStaggeredGridState lazyStaggeredGridState0, float f) {
        if(f < 0.0f && !lazyStaggeredGridState0.getCanScrollForward() || f > 0.0f && !lazyStaggeredGridState0.getCanScrollBackward()) {
            return 0.0f;
        }
        if(Math.abs(lazyStaggeredGridState0.n) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + lazyStaggeredGridState0.n).toString());
        }
        float f1 = lazyStaggeredGridState0.n + f;
        lazyStaggeredGridState0.n = f1;
        if(Math.abs(f1) > 0.5f) {
            MutableState mutableState0 = lazyStaggeredGridState0.b;
            LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult0 = (LazyStaggeredGridMeasureResult)mutableState0.getValue();
            float f2 = lazyStaggeredGridState0.n;
            if(lazyStaggeredGridMeasureResult0.tryToApplyScrollWithoutRemeasure(c.roundToInt(f2))) {
                lazyStaggeredGridState0.applyMeasureResult$foundation_release(lazyStaggeredGridMeasureResult0, true);
                ObservableScopeInvalidator.invalidateScope-impl(lazyStaggeredGridState0.u);
                lazyStaggeredGridState0.a(f2 - lazyStaggeredGridState0.n, lazyStaggeredGridMeasureResult0);
            }
            else {
                Remeasurement remeasurement0 = lazyStaggeredGridState0.g;
                if(remeasurement0 != null) {
                    remeasurement0.forceRemeasure();
                }
                lazyStaggeredGridState0.a(f2 - lazyStaggeredGridState0.n, ((LazyStaggeredGridMeasureResult)mutableState0.getValue()));
            }
        }
        if(Math.abs(lazyStaggeredGridState0.n) > 0.5f) {
            f -= lazyStaggeredGridState0.n;
            lazyStaggeredGridState0.n = 0.0f;
        }
        return f;
    }

    @Nullable
    public final Object animateScrollToItem(int v, int v1, @NotNull Continuation continuation0) {
        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult0 = (LazyStaggeredGridMeasureResult)this.b.getValue();
        Object object0 = LazyAnimateScrollKt.animateScrollToItem(this.f, v, v1, lazyStaggeredGridMeasureResult0.getSlots().getSizes().length * 100, lazyStaggeredGridMeasureResult0.getDensity(), continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState0, int v, int v1, Continuation continuation0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return lazyStaggeredGridState0.animateScrollToItem(v, v1, continuation0);
    }

    public final void applyMeasureResult$foundation_release(@NotNull LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult0, boolean z) {
        this.n -= lazyStaggeredGridMeasureResult0.getConsumedScroll();
        this.b.setValue(lazyStaggeredGridMeasureResult0);
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition0 = this.a;
        if(z) {
            lazyStaggeredGridScrollPosition0.updateScrollOffset(lazyStaggeredGridMeasureResult0.getFirstVisibleItemScrollOffsets());
        }
        else {
            lazyStaggeredGridScrollPosition0.updateFromMeasureResult(lazyStaggeredGridMeasureResult0);
            List list0 = lazyStaggeredGridMeasureResult0.getVisibleItemsInfo();
            if(this.p != -1 && !list0.isEmpty()) {
                int v = ((LazyStaggeredGridItemInfo)CollectionsKt___CollectionsKt.first(list0)).getIndex();
                int v1 = ((LazyStaggeredGridItemInfo)CollectionsKt___CollectionsKt.last(list0)).getIndex();
                if(v > this.p || this.p > v1) {
                    this.p = -1;
                    LinkedHashMap linkedHashMap0 = this.q;
                    for(Object object0: linkedHashMap0.values()) {
                        ((PrefetchHandle)object0).cancel();
                    }
                    linkedHashMap0.clear();
                }
            }
        }
        Boolean boolean0 = Boolean.valueOf(lazyStaggeredGridMeasureResult0.getCanScrollBackward());
        this.e.setValue(boolean0);
        this.d.setValue(Boolean.valueOf(lazyStaggeredGridMeasureResult0.getCanScrollForward()));
        ++this.o;
    }

    public static void applyMeasureResult$foundation_release$default(LazyStaggeredGridState lazyStaggeredGridState0, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        lazyStaggeredGridState0.applyMeasureResult$foundation_release(lazyStaggeredGridMeasureResult0, z);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.m.dispatchRawDelta(f);
    }

    @NotNull
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.i;
    }

    @NotNull
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.j;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean)this.e.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean)this.d.getValue()).booleanValue();
    }

    public final int getFirstVisibleItemIndex() {
        return this.a.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.a.getScrollOffset();
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.r;
    }

    @NotNull
    public final LazyLayoutItemAnimator getItemAnimator$foundation_release() {
        return this.t;
    }

    public final int getLaneCount$foundation_release() {
        return ((LazyStaggeredGridMeasureResult)this.b.getValue()).getSlots().getSizes().length;
    }

    @NotNull
    public final LazyStaggeredGridLaneInfo getLaneInfo$foundation_release() {
        return this.c;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.m.getLastScrolledBackward();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.m.getLastScrolledForward();
    }

    @NotNull
    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return (LazyStaggeredGridLayoutInfo)this.b.getValue();
    }

    public final int getMeasurePassCount$foundation_release() {
        return this.o;
    }

    @NotNull
    public final MutableState getMeasurementScopeInvalidator-zYiylxw$foundation_release() {
        return this.v;
    }

    @NotNull
    public final MutableInteractionSource getMutableInteractionSource$foundation_release() {
        return this.r;
    }

    @NotNull
    public final IntRange getNearestRange$foundation_release() {
        return (IntRange)this.a.getNearestRangeState().getValue();
    }

    @NotNull
    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.s;
    }

    @NotNull
    public final MutableState getPlacementScopeInvalidator-zYiylxw$foundation_release() {
        return this.u;
    }

    @NotNull
    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.l;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.k;
    }

    @Nullable
    public final Remeasurement getRemeasurement$foundation_release() {
        return this.g;
    }

    @NotNull
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.h;
    }

    @NotNull
    public final LazyStaggeredGridScrollPosition getScrollPosition$foundation_release() {
        return this.a;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.n;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.m.isScrollInProgress();
    }

    public final void requestScrollToItem(@androidx.annotation.IntRange(from = 0L) int v, int v1) {
        if(this.isScrollInProgress()) {
            BuildersKt.launch$default(((LazyStaggeredGridMeasureResult)this.b.getValue()).getCoroutineScope(), null, null, new n(this, null), 3, null);
        }
        this.snapToItemInternal$foundation_release(v, v1, false);
    }

    public static void requestScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        lazyStaggeredGridState0.requestScrollToItem(v, v1);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        LazyStaggeredGridState lazyStaggeredGridState0;
        o o0;
        if(continuation0 instanceof o) {
            o0 = (o)continuation0;
            int v = o0.t;
            if((v & 0x80000000) == 0) {
                o0 = new o(this, continuation0);
            }
            else {
                o0.t = v ^ 0x80000000;
            }
        }
        else {
            o0 = new o(this, continuation0);
        }
        Object object0 = o0.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(o0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                o0.o = this;
                o0.p = mutatePriority0;
                o0.q = function20;
                o0.t = 1;
                if(this.i.waitForFirstLayout(o0) == object1) {
                    return object1;
                }
                lazyStaggeredGridState0 = this;
                break;
            }
            case 1: {
                function20 = o0.q;
                mutatePriority0 = o0.p;
                lazyStaggeredGridState0 = o0.o;
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
        o0.o = null;
        o0.p = null;
        o0.q = null;
        o0.t = 2;
        return lazyStaggeredGridState0.m.scroll(mutatePriority0, function20, o0) == object1 ? object1 : Unit.INSTANCE;
    }

    @Nullable
    public final Object scrollToItem(int v, int v1, @NotNull Continuation continuation0) {
        Object object0 = ScrollableState.scroll$default(this, null, new p(this, v, v1, null), continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState0, int v, int v1, Continuation continuation0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return lazyStaggeredGridState0.scrollToItem(v, v1, continuation0);
    }

    public final void setMeasurePassCount$foundation_release(int v) {
        this.o = v;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.k = z;
    }

    public final void snapToItemInternal$foundation_release(int v, int v1, boolean z) {
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition0 = this.a;
        boolean z1 = lazyStaggeredGridScrollPosition0.getIndex() != v || lazyStaggeredGridScrollPosition0.getScrollOffset() != v1;
        if(z1) {
            this.t.reset();
        }
        LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult0 = (LazyStaggeredGridMeasureResult)this.b.getValue();
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo0 = LazyStaggeredGridMeasureResultKt.findVisibleItem(lazyStaggeredGridMeasureResult0, v);
        if(lazyStaggeredGridItemInfo0 == null || !z1) {
            lazyStaggeredGridScrollPosition0.requestPositionAndForgetLastKnownKey(v, v1);
        }
        else {
            int v3 = lazyStaggeredGridMeasureResult0.getOrientation() == Orientation.Vertical ? IntOffset.getY-impl(lazyStaggeredGridItemInfo0.getOffset-nOcc-ac()) : IntOffset.getX-impl(lazyStaggeredGridItemInfo0.getOffset-nOcc-ac());
            int[] arr_v = lazyStaggeredGridMeasureResult0.getFirstVisibleItemScrollOffsets();
            int[] arr_v1 = new int[arr_v.length];
            for(int v2 = 0; v2 < arr_v.length; ++v2) {
                arr_v1[v2] = lazyStaggeredGridMeasureResult0.getFirstVisibleItemScrollOffsets()[v2] + (v3 + v1);
            }
            lazyStaggeredGridScrollPosition0.updateScrollOffset(arr_v1);
        }
        if(z) {
            Remeasurement remeasurement0 = this.g;
            if(remeasurement0 != null) {
                remeasurement0.forceRemeasure();
            }
        }
        else {
            ObservableScopeInvalidator.invalidateScope-impl(this.v);
        }
    }

    @NotNull
    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@NotNull LazyLayoutItemProvider lazyLayoutItemProvider0, @NotNull int[] arr_v) {
        return this.a.updateScrollPositionIfTheFirstItemWasMoved(lazyLayoutItemProvider0, arr_v);
    }
}

