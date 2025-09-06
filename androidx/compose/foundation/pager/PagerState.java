package androidx.compose.foundation.pager;

import a5.b;
import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState.PrefetchHandle;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.foundation.text.selection.b1;
import androidx.compose.foundation.text.selection.g1;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot.Companion;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import f0.a0;
import f0.b0;
import f0.c0;
import f0.d0;
import f0.e0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Stable
@Metadata(d1 = {"\u0000\u00D6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001A\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\b\'\u0018\u00002\u00020\u0001B)\b\u0000\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0004\b\b\u0010\tB\u001D\b\u0016\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\b\u0010\nJ\"\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\u00022\b\b\u0003\u0010\f\u001A\u00020\u0004H\u0086@\u00A2\u0006\u0004\b\u000E\u0010\u000FJ%\u0010\u0011\u001A\u00020\r*\u00020\u00102\u0006\u0010\u000B\u001A\u00020\u00022\b\b\u0003\u0010\f\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u001B\u0010\u0014\u001A\u00020\r*\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0014\u0010\u0015J\'\u0010\u001B\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\u00022\u0006\u0010\u0016\u001A\u00020\u00042\u0006\u0010\u0018\u001A\u00020\u0017H\u0000\u00A2\u0006\u0004\b\u0019\u0010\u001AJ!\u0010\u001C\u001A\u00020\r2\b\b\u0001\u0010\u000B\u001A\u00020\u00022\b\b\u0003\u0010\f\u001A\u00020\u0004\u00A2\u0006\u0004\b\u001C\u0010\nJ2\u0010\u001F\u001A\u00020\r2\u0006\u0010\u000B\u001A\u00020\u00022\b\b\u0003\u0010\f\u001A\u00020\u00042\u000E\b\u0002\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00040\u001DH\u0086@\u00A2\u0006\u0004\b\u001F\u0010 JA\u0010(\u001A\u00020\r2\u0006\u0010\"\u001A\u00020!2\'\u0010\'\u001A#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0$\u0012\u0006\u0012\u0004\u0018\u00010%0#\u00A2\u0006\u0002\b&H\u0096@\u00A2\u0006\u0004\b(\u0010)J\u0017\u0010+\u001A\u00020\u00042\u0006\u0010*\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b+\u0010,J!\u00102\u001A\u00020\r2\u0006\u0010.\u001A\u00020-2\b\b\u0002\u0010/\u001A\u00020\u0017H\u0000\u00A2\u0006\u0004\b0\u00101J\u0015\u00103\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0002\u00A2\u0006\u0004\b3\u00104J!\u00109\u001A\u00020\u00022\u0006\u00106\u001A\u0002052\b\b\u0002\u0010\u0003\u001A\u00020\u0002H\u0000\u00A2\u0006\u0004\b7\u00108R1\u0010B\u001A\u00020:2\u0006\u0010;\u001A\u00020:8@@@X\u0080\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0012\n\u0004\b<\u0010=\u001A\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010G\u001A\u00020\u00022\u0006\u0010;\u001A\u00020\u00028\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bC\u0010D\u001A\u0004\bE\u0010FR$\u0010J\u001A\u00020\u00022\u0006\u0010;\u001A\u00020\u00028\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bH\u0010D\u001A\u0004\bI\u0010FR$\u0010M\u001A\u00020\u00022\u0006\u0010;\u001A\u00020\u00028\u0000@BX\u0080\u000E\u00A2\u0006\f\n\u0004\bK\u0010D\u001A\u0004\bL\u0010FR\"\u0010T\u001A\u00020\u00178\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bN\u0010O\u001A\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001A\u00020U8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bV\u0010W\u001A\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001A\u0010b\u001A\u00020]8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b`\u0010aR\u001B\u0010f\u001A\u00020\u00028FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\bc\u0010d\u001A\u0004\be\u0010FR\u001B\u0010\u0013\u001A\u00020\u00028FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\bg\u0010d\u001A\u0004\bh\u0010FR\u001A\u0010n\u001A\u00020i8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bj\u0010k\u001A\u0004\bl\u0010mR\u001A\u0010t\u001A\u00020o8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bp\u0010q\u001A\u0004\br\u0010sR\u001A\u0010z\u001A\u00020u8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\bv\u0010w\u001A\u0004\bx\u0010yR1\u0010\u0081\u0001\u001A\u0004\u0018\u00010{2\b\u0010;\u001A\u0004\u0018\u00010{8@@BX\u0080\u008E\u0002\u00A2\u0006\u0013\n\u0004\b|\u0010=\u001A\u0004\b}\u0010~\"\u0005\b\u007F\u0010\u0080\u0001R \u0010\u0087\u0001\u001A\u00030\u0082\u00018\u0000X\u0080\u0004\u00A2\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001A\u0006\b\u0085\u0001\u0010\u0086\u0001R.\u0010\u008D\u0001\u001A\u00030\u0088\u00018\u0000@\u0000X\u0080\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0016\n\u0006\b\u0089\u0001\u0010\u008A\u0001\u001A\u0005\b\u008B\u0001\u0010?\"\u0005\b\u008C\u0001\u0010AR \u0010\u0093\u0001\u001A\u00030\u008E\u00018\u0000X\u0080\u0004\u00A2\u0006\u0010\n\u0006\b\u008F\u0001\u0010\u0090\u0001\u001A\u0006\b\u0091\u0001\u0010\u0092\u0001R%\u0010\u0098\u0001\u001A\u00030\u0094\u00018\u0000X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000F\n\u0005\b\u0095\u0001\u0010=\u001A\u0006\b\u0096\u0001\u0010\u0097\u0001R%\u0010\u009B\u0001\u001A\u00030\u0094\u00018\u0000X\u0080\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u000F\n\u0005\b\u0099\u0001\u0010=\u001A\u0006\b\u009A\u0001\u0010\u0097\u0001R/\u0010\u009F\u0001\u001A\u00020\u00172\u0006\u0010;\u001A\u00020\u00178F@BX\u0086\u008E\u0002\u00A2\u0006\u0015\n\u0005\b\u009C\u0001\u0010=\u001A\u0005\b\u009D\u0001\u0010Q\"\u0005\b\u009E\u0001\u0010SR/\u0010\u00A3\u0001\u001A\u00020\u00172\u0006\u0010;\u001A\u00020\u00178F@BX\u0086\u008E\u0002\u00A2\u0006\u0015\n\u0005\b\u00A0\u0001\u0010=\u001A\u0005\b\u00A1\u0001\u0010Q\"\u0005\b\u00A2\u0001\u0010SR\u0016\u0010\u00A5\u0001\u001A\u00020\u00028&X\u00A6\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00A4\u0001\u0010FR\u0016\u0010\u00A7\u0001\u001A\u00020\u00028@X\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00A6\u0001\u0010FR\u0015\u0010\u00AB\u0001\u001A\u00030\u00A8\u00018F\u00A2\u0006\b\u001A\u0006\b\u00A9\u0001\u0010\u00AA\u0001R\u0016\u0010\u00AD\u0001\u001A\u00020\u00028@X\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00AC\u0001\u0010FR\u0016\u0010\u00AF\u0001\u001A\u00020\u00028@X\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00AE\u0001\u0010FR\u0016\u0010\u00B1\u0001\u001A\u00020\u00028@X\u0080\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00B0\u0001\u0010FR\u0017\u0010\u00B4\u0001\u001A\u00020\u00048@X\u0080\u0004\u00A2\u0006\b\u001A\u0006\b\u00B2\u0001\u0010\u00B3\u0001R\u0015\u0010\u00B8\u0001\u001A\u00030\u00B5\u00018F\u00A2\u0006\b\u001A\u0006\b\u00B6\u0001\u0010\u00B7\u0001R\u0012\u0010\u0003\u001A\u00020\u00028F\u00A2\u0006\u0007\u001A\u0005\b\u00B9\u0001\u0010FR\u0013\u0010\u0005\u001A\u00020\u00048F\u00A2\u0006\b\u001A\u0006\b\u00BA\u0001\u0010\u00B3\u0001R!\u0010\u00C0\u0001\u001A\u00030\u00BB\u00018@X\u0080\u0084\u0002\u00A2\u0006\u0010\u001A\u0006\b\u00BC\u0001\u0010\u00BD\u0001*\u0006\b\u00BE\u0001\u0010\u00BF\u0001R\u0016\u0010\u00C1\u0001\u001A\u00020\u00178VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00C1\u0001\u0010QR\u0016\u0010\u00C3\u0001\u001A\u00020\u00178VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00C2\u0001\u0010QR\u0016\u0010\u00C5\u0001\u001A\u00020\u00178VX\u0096\u0004\u00A2\u0006\u0007\u001A\u0005\b\u00C4\u0001\u0010Q\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\u00C6\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "currentPage", "", "currentPageOffsetFraction", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "prefetchScheduler", "<init>", "(IFLandroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "(IF)V", "page", "pageOffsetFraction", "", "scrollToPage", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/ScrollScope;", "updateCurrentPage", "(Landroidx/compose/foundation/gestures/ScrollScope;IF)V", "targetPage", "updateTargetPage", "(Landroidx/compose/foundation/gestures/ScrollScope;I)V", "offsetFraction", "", "forceRemeasure", "snapToItem$foundation_release", "(IFZ)V", "snapToItem", "requestScrollToPage", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollToPage", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "(F)F", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "result", "visibleItemsStayedTheSame", "applyMeasureResult$foundation_release", "(Landroidx/compose/foundation/pager/PagerMeasureResult;Z)V", "applyMeasureResult", "getOffsetDistanceInPages", "(I)F", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "itemProvider", "matchScrollPositionWithKey$foundation_release", "(Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;I)I", "matchScrollPositionWithKey", "Landroidx/compose/ui/geometry/Offset;", "<set-?>", "a", "Landroidx/compose/runtime/MutableState;", "getUpDownDifference-F1C5BW0$foundation_release", "()J", "setUpDownDifference-k-4lQ0M$foundation_release", "(J)V", "upDownDifference", "d", "I", "getFirstVisiblePage$foundation_release", "()I", "firstVisiblePage", "e", "getFirstVisiblePageOffset$foundation_release", "firstVisiblePageOffset", "k", "getLayoutWithMeasurement$foundation_release", "layoutWithMeasurement", "m", "Z", "getPrefetchingEnabled$foundation_release", "()Z", "setPrefetchingEnabled$foundation_release", "(Z)V", "prefetchingEnabled", "Landroidx/compose/ui/unit/Density;", "r", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation_release", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "s", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "v", "Landroidx/compose/runtime/State;", "getSettledPage", "settledPage", "w", "getTargetPage", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "x", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "y", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "z", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation_release", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "awaitLayoutModifier", "Landroidx/compose/ui/layout/Remeasurement;", "A", "getRemeasurement$foundation_release", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement", "Landroidx/compose/ui/layout/RemeasurementModifier;", "B", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation_release", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "remeasurementModifier", "Landroidx/compose/ui/unit/Constraints;", "C", "J", "getPremeasureConstraints-msEJaDk$foundation_release", "setPremeasureConstraints-BRTryo0$foundation_release", "premeasureConstraints", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "D", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedPages$foundation_release", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "pinnedPages", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "E", "getPlacementScopeInvalidator-zYiylxw$foundation_release", "()Landroidx/compose/runtime/MutableState;", "placementScopeInvalidator", "F", "getMeasurementScopeInvalidator-zYiylxw$foundation_release", "measurementScopeInvalidator", "G", "getCanScrollForward", "setCanScrollForward", "canScrollForward", "H", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward", "getPageCount", "pageCount", "getNumMeasurePasses$foundation_release", "numMeasurePasses", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "layoutInfo", "getPageSpacing$foundation_release", "pageSpacing", "getPageSize$foundation_release", "pageSize", "getPageSizeWithSpacing$foundation_release", "pageSizeWithSpacing", "getPositionThresholdFraction$foundation_release", "()F", "positionThresholdFraction", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "getCurrentPage", "getCurrentPageOffsetFraction", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation_release$delegate", "(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "getLastScrolledForward", "lastScrolledForward", "getLastScrolledBackward", "lastScrolledBackward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,961:1\n81#2:962\n107#2,2:963\n81#2:983\n81#2:984\n81#2:985\n107#2,2:986\n81#2:988\n81#2:989\n107#2,2:990\n81#2:992\n107#2,2:993\n868#3,4:965\n868#3,4:969\n868#3,4:973\n868#3,4:995\n868#3,4:1000\n75#4:977\n108#4,2:978\n75#4:980\n108#4,2:981\n1#5:999\n602#6,8:1004\n602#6,8:1012\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState\n*L\n186#1:962\n186#1:963,2\n390#1:983\n407#1:984\n457#1:985\n457#1:986,2\n479#1:988\n645#1:989\n645#1:990,2\n647#1:992\n647#1:993,2\n221#1:965,4\n268#1:969,4\n277#1:973,4\n668#1:995,4\n683#1:1000,4\n378#1:977\n378#1:978,2\n380#1:980\n380#1:981,2\n689#1:1004,8\n816#1:1012,8\n*E\n"})
public abstract class PagerState implements ScrollableState {
    public static final int $stable;
    public final MutableState A;
    public final androidx.compose.foundation.pager.PagerState.remeasurementModifier.1 B;
    public long C;
    public final LazyLayoutPinnedItemList D;
    public final MutableState E;
    public final MutableState F;
    public final MutableState G;
    public final MutableState H;
    public final MutableState I;
    public final MutableState J;
    public final MutableState a;
    public final LazyLayoutAnimateScrollScope b;
    public final PagerScrollPosition c;
    public int d;
    public int e;
    public long f;
    public long g;
    public float h;
    public float i;
    public final ScrollableState j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public PrefetchHandle o;
    public boolean p;
    public final MutableState q;
    public Density r;
    public final MutableInteractionSource s;
    public final MutableIntState t;
    public final MutableIntState u;
    public final State v;
    public final State w;
    public final LazyLayoutPrefetchState x;
    public final LazyLayoutBeyondBoundsInfo y;
    public final AwaitFirstLayoutModifier z;

    public PagerState() {
        this(0, 0.0f, null, 7, null);
    }

    public PagerState(int v, @FloatRange(from = -0.5, to = 0.5) float f) {
        this(v, f, null);
    }

    public PagerState(int v, float f, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        this(v, f);
    }

    public PagerState(int v, @FloatRange(from = -0.5, to = 0.5) float f, @Nullable PrefetchScheduler prefetchScheduler0) {
        if(-0.5 > ((double)f) || ((double)f) > 0.5) {
            throw new IllegalArgumentException(("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
        }
        this.a = SnapshotStateKt.mutableStateOf$default(Offset.box-impl(0L), null, 2, null);
        this.b = PagerLazyAnimateScrollScopeKt.PagerLazyAnimateScrollScope(this);
        this.c = new PagerScrollPosition(v, f, this);
        this.d = v;
        this.f = 0x7FFFFFFFFFFFFFFFL;
        this.j = ScrollableStateKt.ScrollableState(new g1(this, 25));
        this.m = true;
        this.n = -1;
        this.q = SnapshotStateKt.mutableStateOf(PagerStateKt.getEmptyLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this.r = PagerStateKt.c;
        this.s = InteractionSourceKt.MutableInteractionSource();
        this.t = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.u = SnapshotIntStateKt.mutableIntStateOf(v);
        this.v = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new e0(this, 0));
        this.w = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new e0(this, 1));
        this.x = new LazyLayoutPrefetchState(prefetchScheduler0, null, 2, null);
        this.y = new LazyLayoutBeyondBoundsInfo();
        this.z = new AwaitFirstLayoutModifier();
        this.A = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.B = new RemeasurementModifier() {
            public final PagerState a;

            {
                this.a = pagerState0;
            }

            @Override  // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(@NotNull Remeasurement remeasurement0) {
                PagerState.access$setRemeasurement(this.a, remeasurement0);
            }
        };
        this.C = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.D = new LazyLayoutPinnedItemList();
        this.E = ObservableScopeInvalidator.constructor-impl$default(null, 1, null);
        this.F = ObservableScopeInvalidator.constructor-impl$default(null, 1, null);
        this.G = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.H = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.I = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.J = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public PagerState(int v, float f, PrefetchScheduler prefetchScheduler0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        if((v1 & 4) != 0) {
            prefetchScheduler0 = null;
        }
        this(v, f, prefetchScheduler0);
    }

    public final int a(int v) {
        return this.getPageCount() <= 0 ? 0 : c.coerceIn(v, 0, this.getPageCount() - 1);
    }

    public static final Object access$awaitScrollDependencies(PagerState pagerState0, Continuation continuation0) {
        Unit unit0 = pagerState0.z.waitForFirstLayout(continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public static final int access$getProgrammaticScrollTargetPage(PagerState pagerState0) {
        return pagerState0.t.getIntValue();
    }

    public static final int access$getSettledPageState(PagerState pagerState0) {
        return pagerState0.u.getIntValue();
    }

    public static final float access$performScroll(PagerState pagerState0, float f) {
        pagerState0.getClass();
        long v = PagerScrollPositionKt.currentAbsoluteScrollOffset(pagerState0);
        float f1 = pagerState0.h + f;
        long v1 = zd.c.roundToLong(f1);
        pagerState0.h = f1 - ((float)v1);
        if(Math.abs(f) >= 0.0001f) {
            long v2 = v1 + v;
            long v3 = c.coerceIn(v2, pagerState0.g, pagerState0.f);
            boolean z = false;
            boolean z1 = Long.compare(v2, v3) != 0;
            long v4 = v3 - v;
            pagerState0.i = (float)v4;
            if(Math.abs(v4) != 0L) {
                pagerState0.I.setValue(Boolean.valueOf(((float)v4) > 0.0f));
                if(((float)v4) < 0.0f) {
                    z = true;
                }
                pagerState0.J.setValue(Boolean.valueOf(z));
            }
            PagerMeasureResult pagerMeasureResult0 = (PagerMeasureResult)pagerState0.q.getValue();
            if(pagerMeasureResult0.tryToApplyScrollWithoutRemeasure(-((int)v4))) {
                pagerState0.applyMeasureResult$foundation_release(pagerMeasureResult0, true);
                ObservableScopeInvalidator.invalidateScope-impl(pagerState0.E);
                ++pagerState0.l;
                return z1 ? v4.floatValue() : f;
            }
            pagerState0.c.applyScrollDelta(((int)v4));
            Remeasurement remeasurement0 = pagerState0.getRemeasurement$foundation_release();
            if(remeasurement0 != null) {
                remeasurement0.forceRemeasure();
            }
            ++pagerState0.k;
            return z1 ? v4.floatValue() : f;
        }
        return f;
    }

    public static final void access$setRemeasurement(PagerState pagerState0, Remeasurement remeasurement0) {
        pagerState0.A.setValue(remeasurement0);
    }

    @Nullable
    public final Object animateScrollToPage(int v, @FloatRange(from = -0.5, to = 0.5) float f, @NotNull AnimationSpec animationSpec0, @NotNull Continuation continuation0) {
        PagerState pagerState0;
        a0 a00;
        if(continuation0 instanceof a0) {
            a00 = (a0)continuation0;
            int v1 = a00.u;
            if((v1 & 0x80000000) == 0) {
                a00 = new a0(this, continuation0);
            }
            else {
                a00.u = v1 ^ 0x80000000;
            }
        }
        else {
            a00 = new a0(this, continuation0);
        }
        Object object0 = a00.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(a00.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                if(v == this.getCurrentPage() && this.getCurrentPageOffsetFraction() == f || this.getPageCount() == 0) {
                    return Unit.INSTANCE;
                }
                a00.o = this;
                a00.p = animationSpec0;
                a00.q = v;
                a00.r = f;
                a00.u = 1;
                Unit unit0 = this.z.waitForFirstLayout(a00);
                if(unit0 != a.getCOROUTINE_SUSPENDED()) {
                    unit0 = Unit.INSTANCE;
                }
                if(unit0 == object1) {
                    return object1;
                }
                pagerState0 = this;
                break;
            }
            case 1: {
                f = a00.r;
                v = a00.q;
                animationSpec0 = a00.p;
                pagerState0 = a00.o;
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
        if(-0.5 > ((double)f) || ((double)f) > 0.5) {
            throw new IllegalArgumentException(("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5").toString());
        }
        int v2 = pagerState0.a(v);
        float f1 = f * ((float)pagerState0.getPageSizeWithSpacing$foundation_release());
        b1 b10 = new b1(pagerState0, 9);
        a00.o = null;
        a00.p = null;
        a00.u = 2;
        return PagerStateKt.access$animateScrollToPage(pagerState0.b, v2, f1, animationSpec0, b10, a00) == object1 ? object1 : Unit.INSTANCE;
    }

    public static Object animateScrollToPage$default(PagerState pagerState0, int v, float f, AnimationSpec animationSpec0, Continuation continuation0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        if((v1 & 4) != 0) {
            animationSpec0 = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return pagerState0.animateScrollToPage(v, f, animationSpec0, continuation0);
    }

    public final void applyMeasureResult$foundation_release(@NotNull PagerMeasureResult pagerMeasureResult0, boolean z) {
        int v1;
        Function1 function10 = null;
        PagerScrollPosition pagerScrollPosition0 = this.c;
        if(z) {
            pagerScrollPosition0.updateCurrentPageOffsetFraction(pagerMeasureResult0.getCurrentPageOffsetFraction());
        }
        else {
            pagerScrollPosition0.updateFromMeasureResult(pagerMeasureResult0);
            if(this.n != -1 && !pagerMeasureResult0.getVisiblePagesInfo().isEmpty()) {
                if(this.p) {
                    int v = ((PageInfo)CollectionsKt___CollectionsKt.last(pagerMeasureResult0.getVisiblePagesInfo())).getIndex();
                    v1 = pagerMeasureResult0.getBeyondViewportPageCount() + v + 1;
                }
                else {
                    v1 = ((PageInfo)CollectionsKt___CollectionsKt.first(pagerMeasureResult0.getVisiblePagesInfo())).getIndex() - pagerMeasureResult0.getBeyondViewportPageCount() - 1;
                }
                if(this.n != v1) {
                    this.n = -1;
                    PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle0 = this.o;
                    if(lazyLayoutPrefetchState$PrefetchHandle0 != null) {
                        lazyLayoutPrefetchState$PrefetchHandle0.cancel();
                    }
                    this.o = null;
                }
            }
        }
        this.q.setValue(pagerMeasureResult0);
        this.G.setValue(Boolean.valueOf(pagerMeasureResult0.getCanScrollForward()));
        Boolean boolean0 = Boolean.valueOf(pagerMeasureResult0.getCanScrollBackward());
        this.H.setValue(boolean0);
        MeasuredPage measuredPage0 = pagerMeasureResult0.getFirstVisiblePage();
        if(measuredPage0 != null) {
            this.d = measuredPage0.getIndex();
        }
        this.e = pagerMeasureResult0.getFirstVisiblePageScrollOffset();
        Companion snapshot$Companion0 = Snapshot.Companion;
        Snapshot snapshot0 = snapshot$Companion0.getCurrentThreadSnapshot();
        if(snapshot0 != null) {
            function10 = snapshot0.getReadObserver();
        }
        Snapshot snapshot1 = snapshot$Companion0.makeCurrentNonObservable(snapshot0);
        try {
            if(Math.abs(this.i) > 0.5f && this.m && this.b(this.i)) {
                this.c(this.i, pagerMeasureResult0);
            }
        }
        finally {
            snapshot$Companion0.restoreNonObservable(snapshot0, snapshot1, function10);
        }
        this.f = PagerStateKt.calculateNewMaxScrollOffset(pagerMeasureResult0, this.getPageCount());
        this.g = PagerStateKt.access$calculateNewMinScrollOffset(pagerMeasureResult0, this.getPageCount());
    }

    public static void applyMeasureResult$foundation_release$default(PagerState pagerState0, PagerMeasureResult pagerMeasureResult0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if((v & 2) != 0) {
            z = false;
        }
        pagerState0.applyMeasureResult$foundation_release(pagerMeasureResult0, z);
    }

    public final boolean b(float f) {
        if(this.getLayoutInfo().getOrientation() == Orientation.Vertical) {
            return Math.signum(f) == Math.signum(-Offset.getY-impl(this.getUpDownDifference-F1C5BW0$foundation_release())) ? true : ((int)Offset.getX-impl(this.getUpDownDifference-F1C5BW0$foundation_release())) == 0 && ((int)Offset.getY-impl(this.getUpDownDifference-F1C5BW0$foundation_release())) == 0;
        }
        return Math.signum(f) == Math.signum(-Offset.getX-impl(this.getUpDownDifference-F1C5BW0$foundation_release())) ? true : ((int)Offset.getX-impl(this.getUpDownDifference-F1C5BW0$foundation_release())) == 0 && ((int)Offset.getY-impl(this.getUpDownDifference-F1C5BW0$foundation_release())) == 0;
    }

    public final void c(float f, PagerMeasureResult pagerMeasureResult0) {
        int v1;
        if(!this.m) {
            return;
        }
        if(!pagerMeasureResult0.getVisiblePagesInfo().isEmpty()) {
            boolean z = Float.compare(f, 0.0f) > 0;
            if(z) {
                int v = ((PageInfo)CollectionsKt___CollectionsKt.last(pagerMeasureResult0.getVisiblePagesInfo())).getIndex();
                v1 = pagerMeasureResult0.getBeyondViewportPageCount() + v + 1;
            }
            else {
                v1 = ((PageInfo)CollectionsKt___CollectionsKt.first(pagerMeasureResult0.getVisiblePagesInfo())).getIndex() - pagerMeasureResult0.getBeyondViewportPageCount() - 1;
            }
            if(v1 >= 0 && v1 < this.getPageCount()) {
                if(v1 != this.n) {
                    if(this.p != z) {
                        PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle0 = this.o;
                        if(lazyLayoutPrefetchState$PrefetchHandle0 != null) {
                            lazyLayoutPrefetchState$PrefetchHandle0.cancel();
                        }
                    }
                    this.p = z;
                    this.n = v1;
                    this.o = this.x.schedulePrefetch-0kLqBqw(v1, this.C);
                }
                if(z) {
                    PageInfo pageInfo0 = (PageInfo)CollectionsKt___CollectionsKt.last(pagerMeasureResult0.getVisiblePagesInfo());
                    int v2 = pagerMeasureResult0.getPageSize();
                    int v3 = pagerMeasureResult0.getPageSpacing();
                    if(((float)(pageInfo0.getOffset() + (v3 + v2) - pagerMeasureResult0.getViewportEndOffset())) < f) {
                        PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle1 = this.o;
                        if(lazyLayoutPrefetchState$PrefetchHandle1 != null) {
                            lazyLayoutPrefetchState$PrefetchHandle1.markAsUrgent();
                        }
                    }
                }
                else {
                    PageInfo pageInfo1 = (PageInfo)CollectionsKt___CollectionsKt.first(pagerMeasureResult0.getVisiblePagesInfo());
                    if(((float)(pagerMeasureResult0.getViewportStartOffset() - pageInfo1.getOffset())) < -f) {
                        PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle2 = this.o;
                        if(lazyLayoutPrefetchState$PrefetchHandle2 != null) {
                            lazyLayoutPrefetchState$PrefetchHandle2.markAsUrgent();
                        }
                    }
                }
            }
        }
    }

    public static Object d(PagerState pagerState0, MutatePriority mutatePriority0, Function2 function20, Continuation continuation0) {
        c0 c00;
        if(continuation0 instanceof c0) {
            c00 = (c0)continuation0;
            int v = c00.t;
            if((v & 0x80000000) == 0) {
                c00 = new c0(pagerState0, continuation0);
            }
            else {
                c00.t = v ^ 0x80000000;
            }
        }
        else {
            c00 = new c0(pagerState0, continuation0);
        }
        Object object0 = c00.r;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(c00.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                c00.o = pagerState0;
                c00.p = mutatePriority0;
                c00.q = function20;
                c00.t = 1;
                Unit unit0 = pagerState0.z.waitForFirstLayout(c00);
                if(unit0 != a.getCOROUTINE_SUSPENDED()) {
                    unit0 = Unit.INSTANCE;
                }
                if(unit0 == object1) {
                    return object1;
                }
                goto label_27;
            }
            case 1: {
                function20 = c00.q;
                mutatePriority0 = c00.p;
                pagerState0 = c00.o;
                ResultKt.throwOnFailure(object0);
            label_27:
                if(!pagerState0.isScrollInProgress()) {
                    int v1 = pagerState0.getCurrentPage();
                    pagerState0.u.setIntValue(v1);
                }
                c00.o = pagerState0;
                c00.p = null;
                c00.q = null;
                c00.t = 2;
                if(pagerState0.j.scroll(mutatePriority0, function20, c00) == object1) {
                    return object1;
                }
                pagerState0.t.setIntValue(-1);
                return Unit.INSTANCE;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        pagerState0 = c00.o;
        ResultKt.throwOnFailure(object0);
        pagerState0.t.setIntValue(-1);
        return Unit.INSTANCE;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f) {
        return this.j.dispatchRawDelta(f);
    }

    @NotNull
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.z;
    }

    @NotNull
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.y;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((Boolean)this.H.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean)this.G.getValue()).booleanValue();
    }

    public final int getCurrentPage() {
        return this.c.getCurrentPage();
    }

    public final float getCurrentPageOffsetFraction() {
        return this.c.getCurrentPageOffsetFraction();
    }

    @NotNull
    public final Density getDensity$foundation_release() {
        return this.r;
    }

    public final int getFirstVisiblePage$foundation_release() {
        return this.d;
    }

    public final int getFirstVisiblePageOffset$foundation_release() {
        return this.e;
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.s;
    }

    @NotNull
    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.s;
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return ((Boolean)this.J.getValue()).booleanValue();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return ((Boolean)this.I.getValue()).booleanValue();
    }

    @NotNull
    public final PagerLayoutInfo getLayoutInfo() {
        return (PagerLayoutInfo)this.q.getValue();
    }

    public final int getLayoutWithMeasurement$foundation_release() {
        return this.k;
    }

    @NotNull
    public final MutableState getMeasurementScopeInvalidator-zYiylxw$foundation_release() {
        return this.F;
    }

    @NotNull
    public final IntRange getNearestRange$foundation_release() {
        return (IntRange)this.c.getNearestRangeState().getValue();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.k + this.l;
    }

    public final float getOffsetDistanceInPages(int v) {
        if(v >= 0 && v <= this.getPageCount()) {
            return ((float)(v - this.getCurrentPage())) - this.getCurrentPageOffsetFraction();
        }
        StringBuilder stringBuilder0 = b.s(v, "page ", " is not within the range 0 to ");
        stringBuilder0.append(this.getPageCount());
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    public abstract int getPageCount();

    public final int getPageSize$foundation_release() {
        return ((PagerMeasureResult)this.q.getValue()).getPageSize();
    }

    public final int getPageSizeWithSpacing$foundation_release() {
        int v = this.getPageSize$foundation_release();
        return this.getPageSpacing$foundation_release() + v;
    }

    public final int getPageSpacing$foundation_release() {
        return ((PagerMeasureResult)this.q.getValue()).getPageSpacing();
    }

    @NotNull
    public final LazyLayoutPinnedItemList getPinnedPages$foundation_release() {
        return this.D;
    }

    @NotNull
    public final MutableState getPlacementScopeInvalidator-zYiylxw$foundation_release() {
        return this.E;
    }

    public final float getPositionThresholdFraction$foundation_release() {
        return Math.min(this.r.toPx-0680j_4(PagerStateKt.getDefaultPositionThreshold()), ((float)this.getPageSize$foundation_release()) / 2.0f) / ((float)this.getPageSize$foundation_release());
    }

    @NotNull
    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.x;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.m;
    }

    public final long getPremeasureConstraints-msEJaDk$foundation_release() {
        return this.C;
    }

    @Nullable
    public final Remeasurement getRemeasurement$foundation_release() {
        return (Remeasurement)this.A.getValue();
    }

    @NotNull
    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.B;
    }

    public final int getSettledPage() {
        return ((Number)this.v.getValue()).intValue();
    }

    public final int getTargetPage() {
        return ((Number)this.w.getValue()).intValue();
    }

    public final long getUpDownDifference-F1C5BW0$foundation_release() {
        return ((Offset)this.a.getValue()).unbox-impl();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.j.isScrollInProgress();
    }

    public final int matchScrollPositionWithKey$foundation_release(@NotNull PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider0, int v) {
        return this.c.matchPageWithKey(pagerLazyLayoutItemProvider0, v);
    }

    public static int matchScrollPositionWithKey$foundation_release$default(PagerState pagerState0, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider0, int v, int v1, Object object0) {
        int v3;
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
        }
        if((v1 & 2) != 0) {
            Snapshot snapshot0 = Snapshot.Companion.getCurrentThreadSnapshot();
            Function1 function10 = snapshot0 == null ? null : snapshot0.getReadObserver();
            Snapshot snapshot1 = Snapshot.Companion.makeCurrentNonObservable(snapshot0);
            try {
                v3 = pagerState0.c.getCurrentPage();
            }
            finally {
                Snapshot.Companion.restoreNonObservable(snapshot0, snapshot1, function10);
            }
            return pagerState0.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProvider0, v3);
        }
        return pagerState0.matchScrollPositionWithKey$foundation_release(pagerLazyLayoutItemProvider0, v);
    }

    public final void requestScrollToPage(@androidx.annotation.IntRange(from = 0L) int v, @FloatRange(from = -0.5, to = 0.5) float f) {
        if(this.isScrollInProgress()) {
            BuildersKt.launch$default(((PagerMeasureResult)this.q.getValue()).getCoroutineScope(), null, null, new b0(this, null), 3, null);
        }
        this.snapToItem$foundation_release(v, f, false);
    }

    public static void requestScrollToPage$default(PagerState pagerState0, int v, float f, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        pagerState0.requestScrollToPage(v, f);
    }

    @Override  // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority0, @NotNull Function2 function20, @NotNull Continuation continuation0) {
        return PagerState.d(this, mutatePriority0, function20, continuation0);
    }

    @Nullable
    public final Object scrollToPage(int v, @FloatRange(from = -0.5, to = 0.5) float f, @NotNull Continuation continuation0) {
        Object object0 = ScrollableState.scroll$default(this, null, new d0(this, f, v, null), continuation0, 1, null);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    public static Object scrollToPage$default(PagerState pagerState0, int v, float f, Continuation continuation0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState0.scrollToPage(v, f, continuation0);
    }

    public final void setDensity$foundation_release(@NotNull Density density0) {
        this.r = density0;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z) {
        this.m = z;
    }

    public final void setPremeasureConstraints-BRTryo0$foundation_release(long v) {
        this.C = v;
    }

    public final void setUpDownDifference-k-4lQ0M$foundation_release(long v) {
        Offset offset0 = Offset.box-impl(v);
        this.a.setValue(offset0);
    }

    public final void snapToItem$foundation_release(int v, float f, boolean z) {
        this.c.requestPositionAndForgetLastKnownKey(v, f);
        if(z) {
            Remeasurement remeasurement0 = this.getRemeasurement$foundation_release();
            if(remeasurement0 != null) {
                remeasurement0.forceRemeasure();
            }
        }
        else {
            ObservableScopeInvalidator.invalidateScope-impl(this.F);
        }
    }

    @ExperimentalFoundationApi
    public final void updateCurrentPage(@NotNull ScrollScope scrollScope0, int v, @FloatRange(from = -0.5, to = 0.5) float f) {
        this.snapToItem$foundation_release(v, f, true);
    }

    public static void updateCurrentPage$default(PagerState pagerState0, ScrollScope scrollScope0, int v, float f, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        pagerState0.updateCurrentPage(scrollScope0, v, f);
    }

    @ExperimentalFoundationApi
    public final void updateTargetPage(@NotNull ScrollScope scrollScope0, int v) {
        int v1 = this.a(v);
        this.t.setIntValue(v1);
    }
}

