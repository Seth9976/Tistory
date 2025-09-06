package androidx.compose.foundation.lazy;

import androidx.annotation.IntRange;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.VectorConvertersKt;
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
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle;
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
import androidx.compose.ui.unit.Density;
import b0.n;
import b0.o;
import b0.p;
import b0.r;
import b0.s;
import b0.t;
import b0.u;
import b0.v;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(d1 = {"\u0000\u00CA\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0007\u0018\u0000 \u00AB\u00012\u00020\u0001:\u0002\u00AB\u0001B\'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0007\u0010\bB\u001D\b\u0016\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0007\u0010\tJ$\u0010\r\u001A\u00020\f2\b\b\u0001\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u0002H\u0086@\u00A2\u0006\u0004\b\r\u0010\u000EJ!\u0010\u000F\u001A\u00020\f2\b\b\u0001\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u0002\u00A2\u0006\u0004\b\u000F\u0010\tJ\'\u0010\u0014\u001A\u00020\f2\u0006\u0010\n\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b\u0012\u0010\u0013JA\u0010\u001D\u001A\u00020\f2\u0006\u0010\u0016\u001A\u00020\u00152\'\u0010\u001C\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001A0\u0017\u00A2\u0006\u0002\b\u001BH\u0096@\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010!\u001A\u00020\u001F2\u0006\u0010 \u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001A\u00020\u001F2\u0006\u0010#\u001A\u00020\u001FH\u0000\u00A2\u0006\u0004\b$\u0010\"J$\u0010&\u001A\u00020\f2\b\b\u0001\u0010\n\u001A\u00020\u00022\b\b\u0002\u0010\u000B\u001A\u00020\u0002H\u0086@\u00A2\u0006\u0004\b&\u0010\u000EJ)\u0010-\u001A\u00020\f2\u0006\u0010(\u001A\u00020\'2\u0006\u0010)\u001A\u00020\u00102\b\b\u0002\u0010*\u001A\u00020\u0010H\u0000\u00A2\u0006\u0004\b+\u0010,J\u001F\u00103\u001A\u00020\u00022\u0006\u0010/\u001A\u00020.2\u0006\u00100\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b1\u00102R$\u00109\u001A\u00020\u00102\u0006\u00104\u001A\u00020\u00108\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108R(\u0010>\u001A\u0004\u0018\u00010\'2\b\u00104\u001A\u0004\u0018\u00010\'8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R\u001A\u0010D\u001A\u00020?8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b@\u0010A\u001A\u0004\bB\u0010CR$\u0010I\u001A\u00020\u001F2\u0006\u00104\u001A\u00020\u001F8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bE\u0010F\u001A\u0004\bG\u0010HR$\u0010N\u001A\u00020\u00022\u0006\u00104\u001A\u00020\u00028\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010MR\"\u0010S\u001A\u00020\u00108\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bO\u00106\u001A\u0004\bP\u00108\"\u0004\bQ\u0010RR(\u0010Y\u001A\u0004\u0018\u00010T2\b\u00104\u001A\u0004\u0018\u00010T8\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bU\u0010V\u001A\u0004\bW\u0010XR\u001A\u0010_\u001A\u00020Z8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b[\u0010\\\u001A\u0004\b]\u0010^R\u001A\u0010e\u001A\u00020`8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\ba\u0010b\u001A\u0004\bc\u0010dR \u0010l\u001A\b\u0012\u0004\u0012\u00020g0f8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bh\u0010i\u001A\u0004\bj\u0010kR\u001A\u0010r\u001A\u00020m8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bn\u0010o\u001A\u0004\bp\u0010qR\u001A\u0010x\u001A\u00020s8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bt\u0010u\u001A\u0004\bv\u0010wR\u001A\u0010~\u001A\u00020y8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bz\u0010{\u001A\u0004\b|\u0010}R%\u0010\u0084\u0001\u001A\u00020\u007F8\u0000X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001A\u0006\b\u0082\u0001\u0010\u0083\u0001R0\u0010\u0088\u0001\u001A\u00020\u00102\u0006\u00104\u001A\u00020\u00108V@RX\u0096\u008E\u0002\u00A2\u0006\u0016\n\u0006\b\u0085\u0001\u0010\u0081\u0001\u001A\u0005\b\u0086\u0001\u00108\"\u0005\b\u0087\u0001\u0010RR0\u0010\u008C\u0001\u001A\u00020\u00102\u0006\u00104\u001A\u00020\u00108V@RX\u0096\u008E\u0002\u00A2\u0006\u0016\n\u0006\b\u0089\u0001\u0010\u0081\u0001\u001A\u0005\b\u008A\u0001\u00108\"\u0005\b\u008B\u0001\u0010RR%\u0010\u008F\u0001\u001A\u00020\u007F8\u0000X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0010\n\u0006\b\u008D\u0001\u0010\u0081\u0001\u001A\u0006\b\u008E\u0001\u0010\u0083\u0001R\u0012\u0010\u0003\u001A\u00020\u00028F\u00A2\u0006\u0007\u001A\u0005\b\u0090\u0001\u0010MR\u0012\u0010\u0004\u001A\u00020\u00028F\u00A2\u0006\u0007\u001A\u0005\b\u0091\u0001\u0010MR\u0015\u0010\u0095\u0001\u001A\u00030\u0092\u00018F\u00A2\u0006\b\u001A\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0015\u0010\u0099\u0001\u001A\u00030\u0096\u00018F\u00A2\u0006\b\u001A\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009D\u0001\u001A\u00030\u009A\u00018@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u009B\u0001\u0010\u009C\u0001R!\u0010\u00A3\u0001\u001A\u00030\u009E\u00018@X\u0080\u0084\u0002\u00A2\u0006\u0010\u001A\u0006\b\u009F\u0001\u0010\u00A0\u0001*\u0006\b\u00A1\u0001\u0010\u00A2\u0001R\u0016\u0010\u00A4\u0001\u001A\u00020\u00108VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00A4\u0001\u00108R\u0016\u0010\u00A6\u0001\u001A\u00020\u00108VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00A5\u0001\u00108R\u0016\u0010\u00A8\u0001\u001A\u00020\u00108VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00A7\u0001\u00108R\u0016\u0010\u00AA\u0001\u001A\u00020\u001F8@X\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00A9\u0001\u0010H\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00AC\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "prefetchStrategy", "<init>", "(IILandroidx/compose/foundation/lazy/LazyListPrefetchStrategy;)V", "(II)V", "index", "scrollOffset", "", "scrollToItem", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestScrollToItem", "", "forceRemeasure", "snapToItemIndexInternal$foundation_release", "(IIZ)V", "snapToItemIndexInternal", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "(F)F", "distance", "onScroll$foundation_release", "onScroll", "animateScrollToItem", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "result", "isLookingAhead", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/lazy/LazyListMeasureResult;ZZ)V", "applyMeasureResult", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "itemProvider", "firstItemIndex", "updateScrollPositionIfTheFirstItemWasMoved$foundation_release", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;I)I", "updateScrollPositionIfTheFirstItemWasMoved", "<set-?>", "b", "Z", "getHasLookaheadPassOccurred$foundation_release", "()Z", "hasLookaheadPassOccurred", "c", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "getPostLookaheadLayoutInfo$foundation_release", "()Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "postLookaheadLayoutInfo", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "g", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "h", "F", "getScrollToBeConsumed$foundation_release", "()F", "scrollToBeConsumed", "j", "I", "getNumMeasurePasses$foundation_release", "()I", "numMeasurePasses", "k", "getPrefetchingEnabled$foundation_release", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "Landroidx/compose/ui/layout/Remeasurement;", "l", "Landroidx/compose/ui/layout/Remeasurement;", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "m", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "n", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "o", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "getItemAnimator$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "itemAnimator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "p", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "q", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "s", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedItems$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedItems", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "t", "Landroidx/compose/runtime/MutableState;", "getMeasurementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "measurementScopeInvalidator", "u", "getCanScrollForward", "setCanScrollForward", "canScrollForward", "v", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "w", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "placementScopeInvalidator", "getFirstVisibleItemIndex", "getFirstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "layoutInfo", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/lazy/LazyListState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "getLastScrolledForward", "lastScrolledForward", "getLastScrolledBackward", "lastScrolledBackward", "getScrollDeltaBetweenPasses$foundation_release", "scrollDeltaBetweenPasses", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyListState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,673:1\n81#2:674\n81#2:675\n107#2,2:676\n81#2:678\n107#2,2:679\n26#3:681\n1#4:682\n602#5,8:683\n*S KotlinDebug\n*F\n+ 1 LazyListState.kt\nandroidx/compose/foundation/lazy/LazyListState\n*L\n292#1:674\n398#1:675\n398#1:676,2\n400#1:678\n400#1:679,2\n430#1:681\n572#1:683,8\n*E\n"})
public final class LazyListState implements ScrollableState {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001J!\u0010\b\u001A\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007R!\u0010\t\u001A\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState$Companion;", "", "Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;", "prefetchStrategy", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/lazy/LazyListState;", "saver$foundation_release", "(Landroidx/compose/foundation/lazy/LazyListPrefetchStrategy;)Landroidx/compose/runtime/saveable/Saver;", "saver", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Saver getSaver() {
            return LazyListState.y;
        }

        @ExperimentalFoundationApi
        @NotNull
        public final Saver saver$foundation_release(@NotNull LazyListPrefetchStrategy lazyListPrefetchStrategy0) {
            b b0 = new b(lazyListPrefetchStrategy0);
            return ListSaverKt.listSaver(a.w, b0);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final LazyListPrefetchStrategy a;
    public boolean b;
    public LazyListMeasureResult c;
    public final LazyListScrollPosition d;
    public final LazyListAnimateScrollScope e;
    public final MutableState f;
    public final MutableInteractionSource g;
    public float h;
    public final ScrollableState i;
    public int j;
    public boolean k;
    public Remeasurement l;
    public final androidx.compose.foundation.lazy.LazyListState.remeasurementModifier.1 m;
    public final AwaitFirstLayoutModifier n;
    public final LazyLayoutItemAnimator o;
    public final LazyLayoutBeyondBoundsInfo p;
    public final LazyLayoutPrefetchState q;
    public final androidx.compose.foundation.lazy.LazyListState.prefetchScope.1 r;
    public final LazyLayoutPinnedItemList s;
    public final MutableState t;
    public final MutableState u;
    public final MutableState v;
    public final MutableState w;
    public AnimationState x;
    public static final Saver y;

    static {
        LazyListState.Companion = new Companion(null);
        LazyListState.y = ListSaverKt.listSaver(o.w, n.z);
    }

    @ExperimentalFoundationApi
    public LazyListState() {
        this(0, 0, null, 7, null);
    }

    public LazyListState(int v, int v1) {
        this(v, v1, LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null));
    }

    public LazyListState(int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        this(v, v1);
    }

    @ExperimentalFoundationApi
    public LazyListState(int v, int v1, @NotNull LazyListPrefetchStrategy lazyListPrefetchStrategy0) {
        this.a = lazyListPrefetchStrategy0;
        this.d = new LazyListScrollPosition(v, v1);
        this.e = new LazyListAnimateScrollScope(this);
        this.f = SnapshotStateKt.mutableStateOf(LazyListStateKt.b, SnapshotStateKt.neverEqualPolicy());
        this.g = InteractionSourceKt.MutableInteractionSource();
        this.i = ScrollableStateKt.ScrollableState(new g1(this, 13));
        this.k = true;
        this.m = new RemeasurementModifier() {
            public final LazyListState a;

            {
                this.a = lazyListState0;
            }

            @Override  // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(@NotNull Remeasurement remeasurement0) {
                this.a.l = remeasurement0;
            }
        };
        this.n = new AwaitFirstLayoutModifier();
        this.o = new LazyLayoutItemAnimator();
        this.p = new LazyLayoutBeyondBoundsInfo();
        this.q = new LazyLayoutPrefetchState(null, new p(this, v));
        this.r = new LazyListPrefetchScope() {
            public final LazyListState a;

            {
                this.a = lazyListState0;
            }

            @Override  // androidx.compose.foundation.lazy.LazyListPrefetchScope
            @NotNull
            public PrefetchHandle schedulePrefetch(int v) {
                long v2;
                Snapshot snapshot0 = Snapshot.Companion.getCurrentThreadSnapshot();
                Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
                Snapshot snapshot1 = Snapshot.Companion.makeCurrentNonObservable(snapshot0);
                try {
                    v2 = ((LazyListMeasureResult)this.a.f.getValue()).getChildConstraints-msEJaDk();
                }
                finally {
                    Snapshot.Companion.restoreNonObservable(snapshot0, snapshot1, function10);
                }
                return this.a.getPrefetchState$foundation_release().schedulePrefetch-0kLqBqw(v, v2);
            }
        };
        this.s = new LazyLayoutPinnedItemList();
        this.t = ObservableScopeInvalidator.constructor-impl$default(null, 1, null);
        this.u = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.v = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.w = ObservableScopeInvalidator.constructor-impl$default(null, 1, null);
        this.x = AnimationStateKt.AnimationState$default(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), 0.0f, 0.0f, 0L, 0L, false, 56, null);
    }

    public LazyListState(int v, int v1, LazyListPrefetchStrategy lazyListPrefetchStrategy0, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        if((v2 & 4) != 0) {
            lazyListPrefetchStrategy0 = LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null);
        }
        this(v, v1, lazyListPrefetchStrategy0);
    }

    @Nullable
    public final Object animateScrollToItem(@IntRange(from = 0L) int v, int v1, @NotNull Continuation continuation0) {
        Density density0 = this.getDensity$foundation_release();
        Object object0 = LazyAnimateScrollKt.animateScrollToItem(this.e, v, v1, 100, density0, continuation0);
        return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object animateScrollToItem$default(LazyListState lazyListState0, int v, int v1, Continuation continuation0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return lazyListState0.animateScrollToItem(v, v1, continuation0);
    }

    public final void applyMeasureResult$foundation_release(@NotNull LazyListMeasureResult lazyListMeasureResult0, boolean z, boolean z1) {
        if(!z && this.b) {
            this.c = lazyListMeasureResult0;
            return;
        }
        if(z) {
            this.b = true;
        }
        Boolean boolean0 = Boolean.valueOf(lazyListMeasureResult0.getCanScrollBackward());
        this.v.setValue(boolean0);
        this.u.setValue(Boolean.valueOf(lazyListMeasureResult0.getCanScrollForward()));
        this.h -= lazyListMeasureResult0.getConsumedScroll();
        this.f.setValue(lazyListMeasureResult0);
        LazyListScrollPosition lazyListScrollPosition0 = this.d;
        if(z1) {
            lazyListScrollPosition0.updateScrollOffset(lazyListMeasureResult0.getFirstVisibleItemScrollOffset());
        }
        else {
            lazyListScrollPosition0.updateFromMeasureResult(lazyListMeasureResult0);
            if(this.k) {
                this.a.onVisibleItemsUpdated(this.r, lazyListMeasureResult0);
            }
        }
        if(z) {
            float f = lazyListMeasureResult0.getScrollBackAmount();
            CoroutineScope coroutineScope0 = lazyListMeasureResult0.getCoroutineScope();
            if(f > lazyListMeasureResult0.getDensity().toPx-0680j_4(1.0f)) {
                androidx.compose.runtime.snapshots.Snapshot.Companion snapshot$Companion0 = Snapshot.Companion;
                Snapshot snapshot0 = snapshot$Companion0.getCurrentThreadSnapshot();
                Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
                Snapshot snapshot1 = snapshot$Companion0.makeCurrentNonObservable(snapshot0);
                try {
                    float f1 = ((Number)this.x.getValue()).floatValue();
                    if(this.x.isRunning()) {
                        this.x = AnimationStateKt.copy$default(this.x, f1 - f, 0.0f, 0L, 0L, false, 30, null);
                        BuildersKt.launch$default(coroutineScope0, null, null, new u(this, null), 3, null);
                    }
                    else {
                        this.x = new AnimationState(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), ((float)(-f)), null, 0L, 0L, false, 60, null);
                        BuildersKt.launch$default(coroutineScope0, null, null, new v(this, null), 3, null);
                    }
                }
                finally {
                    snapshot$Companion0.restoreNonObservable(snapshot0, snapshot1, function10);
                }
            }
        }
        ++this.j;
    }

    public static void applyMeasureResult$foundation_release$default(LazyListState lazyListState0, LazyListMeasureResult lazyListMeasureResult0, boolean z, boolean z1, int v, Object object0) {
        if((v & 4) != 0) {
            z1 = false;
        }
        lazyListState0.applyMeasureResult$foundation_release(lazyListMeasureResult0, z, z1);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.i.dispatchRawDelta(f);
    }

    @NotNull
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.n;
    }

    @NotNull
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.p;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean)this.v.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean)this.u.getValue()).booleanValue();
    }

    @NotNull
    public final Density getDensity$foundation_release() {
        return ((LazyListMeasureResult)this.f.getValue()).getDensity();
    }

    public final int getFirstVisibleItemIndex() {
        return this.d.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.d.getScrollOffset();
    }

    public final boolean getHasLookaheadPassOccurred$foundation_release() {
        return this.b;
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.g;
    }

    @NotNull
    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.g;
    }

    @NotNull
    public final LazyLayoutItemAnimator getItemAnimator$foundation_release() {
        return this.o;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.i.getLastScrolledBackward();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.i.getLastScrolledForward();
    }

    @NotNull
    public final LazyListLayoutInfo getLayoutInfo() {
        return (LazyListLayoutInfo)this.f.getValue();
    }

    @NotNull
    public final MutableState getMeasurementScopeInvalidator-zYiylxw$foundation_release() {
        return this.t;
    }

    @NotNull
    public final kotlin.ranges.IntRange getNearestRange$foundation_release() {
        return (kotlin.ranges.IntRange)this.d.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.j;
    }

    @NotNull
    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.s;
    }

    @NotNull
    public final MutableState getPlacementScopeInvalidator-zYiylxw$foundation_release() {
        return this.w;
    }

    @Nullable
    public final LazyListMeasureResult getPostLookaheadLayoutInfo$foundation_release() {
        return this.c;
    }

    @NotNull
    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.q;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.k;
    }

    @Nullable
    public final Remeasurement getRemeasurement$foundation_release() {
        return this.l;
    }

    @NotNull
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.m;
    }

    public final float getScrollDeltaBetweenPasses$foundation_release() {
        return ((Number)this.x.getValue()).floatValue();
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.h;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.i.isScrollInProgress();
    }

    public final float onScroll$foundation_release(float f) {
        if(f < 0.0f && !this.getCanScrollForward() || f > 0.0f && !this.getCanScrollBackward()) {
            return 0.0f;
        }
        if(Math.abs(this.h) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.h).toString());
        }
        float f1 = this.h + f;
        this.h = f1;
        if(Math.abs(f1) > 0.5f) {
            LazyListMeasureResult lazyListMeasureResult0 = (LazyListMeasureResult)this.f.getValue();
            float f2 = this.h;
            int v = Math.round(f2);
            LazyListMeasureResult lazyListMeasureResult1 = this.c;
            boolean z = lazyListMeasureResult0.tryToApplyScrollWithoutRemeasure(v, !this.b);
            if(z && lazyListMeasureResult1 != null) {
                z = lazyListMeasureResult1.tryToApplyScrollWithoutRemeasure(v, true);
            }
            LazyListPrefetchStrategy lazyListPrefetchStrategy0 = this.a;
            androidx.compose.foundation.lazy.LazyListState.prefetchScope.1 lazyListState$prefetchScope$10 = this.r;
            if(z) {
                this.applyMeasureResult$foundation_release(lazyListMeasureResult0, this.b, true);
                ObservableScopeInvalidator.invalidateScope-impl(this.w);
                float f3 = f2 - this.h;
                if(this.k) {
                    lazyListPrefetchStrategy0.onScroll(lazyListState$prefetchScope$10, f3, lazyListMeasureResult0);
                }
            }
            else {
                Remeasurement remeasurement0 = this.l;
                if(remeasurement0 != null) {
                    remeasurement0.forceRemeasure();
                }
                float f4 = f2 - this.h;
                LazyListLayoutInfo lazyListLayoutInfo0 = this.getLayoutInfo();
                if(this.k) {
                    lazyListPrefetchStrategy0.onScroll(lazyListState$prefetchScope$10, f4, lazyListLayoutInfo0);
                }
            }
        }
        if(Math.abs(this.h) <= 0.5f) {
            return f;
        }
        float f5 = f - this.h;
        this.h = 0.0f;
        return f5;
    }

    public final void requestScrollToItem(@IntRange(from = 0L) int v, int v1) {
        if(this.isScrollInProgress()) {
            BuildersKt.launch$default(((LazyListMeasureResult)this.f.getValue()).getCoroutineScope(), null, null, new r(this, null), 3, null);
        }
        this.snapToItemIndexInternal$foundation_release(v, v1, false);
    }

    public static void requestScrollToItem$default(LazyListState lazyListState0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        lazyListState0.requestScrollToItem(v, v1);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        LazyListState lazyListState0;
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
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(s0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                s0.o = this;
                s0.p = mutatePriority0;
                s0.q = function20;
                s0.t = 1;
                if(this.n.waitForFirstLayout(s0) == object1) {
                    return object1;
                }
                lazyListState0 = this;
                break;
            }
            case 1: {
                function20 = s0.q;
                mutatePriority0 = s0.p;
                lazyListState0 = s0.o;
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
        return lazyListState0.i.scroll(mutatePriority0, function20, s0) == object1 ? object1 : Unit.INSTANCE;
    }

    @Nullable
    public final Object scrollToItem(@IntRange(from = 0L) int v, int v1, @NotNull Continuation continuation0) {
        Object object0 = ScrollableState.scroll$default(this, null, new t(this, v, v1, null), continuation0, 1, null);
        return object0 == qd.a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object scrollToItem$default(LazyListState lazyListState0, int v, int v1, Continuation continuation0, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return lazyListState0.scrollToItem(v, v1, continuation0);
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.k = z;
    }

    public final void snapToItemIndexInternal$foundation_release(int v, int v1, boolean z) {
        LazyListScrollPosition lazyListScrollPosition0 = this.d;
        if(lazyListScrollPosition0.getIndex() != v || lazyListScrollPosition0.getScrollOffset() != v1) {
            this.o.reset();
        }
        lazyListScrollPosition0.requestPositionAndForgetLastKnownKey(v, v1);
        if(z) {
            Remeasurement remeasurement0 = this.l;
            if(remeasurement0 != null) {
                remeasurement0.forceRemeasure();
            }
        }
        else {
            ObservableScopeInvalidator.invalidateScope-impl(this.t);
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(@NotNull LazyListItemProvider lazyListItemProvider0, int v) {
        return this.d.updateScrollPositionIfTheFirstItemWasMoved(lazyListItemProvider0, v);
    }
}

