package androidx.compose.foundation.pager;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateScrollScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.unit.IntSize;
import f0.e;
import f0.g0;
import f0.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000>\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A1\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\b\u0003\u0010\u0003\u001A\u00020\u00022\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001A/\u0010\u000B\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\u00002\b\b\u0003\u0010\n\u001A\u00020\u00022\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u000B\u0010\f\u001A\u0014\u0010\u000E\u001A\u00020\r*\u00020\u0006H\u0080@¢\u0006\u0004\b\u000E\u0010\u000F\u001A\u0014\u0010\u0010\u001A\u00020\r*\u00020\u0006H\u0080@¢\u0006\u0004\b\u0010\u0010\u000F\u001A\u001B\u0010\u0013\u001A\u00020\u0012*\u00020\u00112\u0006\u0010\u0005\u001A\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u001A\u0010\u001A\u001A\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001B\u001A\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001B\u0010\u001C\"\u001A\u0010\"\u001A\u00020\u001D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u001F\u001A\u0004\b \u0010!¨\u0006#"}, d2 = {"", "initialPage", "", "initialPageOffsetFraction", "Lkotlin/Function0;", "pageCount", "Landroidx/compose/foundation/pager/PagerState;", "rememberPagerState", "(IFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/pager/PagerState;", "currentPage", "currentPageOffsetFraction", "PagerState", "(IFLkotlin/jvm/functions/Function0;)Landroidx/compose/foundation/pager/PagerState;", "", "animateToNextPage", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToPreviousPage", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "", "calculateNewMaxScrollOffset", "(Landroidx/compose/foundation/pager/PagerLayoutInfo;I)J", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getDefaultPositionThreshold", "()F", "DefaultPositionThreshold", "PagesToPrefetch", "I", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "b", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "getEmptyLayoutInfo", "()Landroidx/compose/foundation/pager/PagerMeasureResult;", "EmptyLayoutInfo", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,961:1\n868#1,4:968\n1223#2,6:962\n148#3:972\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n895#1:968,4\n88#1:962,6\n828#1:972\n*E\n"})
public final class PagerStateKt {
    public static final int PagesToPrefetch = 1;
    public static final float a;
    public static final PagerMeasureResult b;
    public static final PagerStateKt.UnitDensity.1 c;

    static {
        PagerStateKt.a = 56.0f;
        PagerStateKt.EmptyLayoutInfo.1 pagerStateKt$EmptyLayoutInfo$10 = new PagerStateKt.EmptyLayoutInfo.1();
        CoroutineScope coroutineScope0 = CoroutineScopeKt.CoroutineScope(EmptyCoroutineContext.INSTANCE);
        PagerStateKt.b = new PagerMeasureResult(CollectionsKt__CollectionsKt.emptyList(), 0, 0, 0, Orientation.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, (int v, int v1, int v2, int v3, int v4, int v5) -> 0, pagerStateKt$EmptyLayoutInfo$10, false, null, null, coroutineScope0, 0x60000, null);
        PagerStateKt.c = new PagerStateKt.UnitDensity.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public static final PagerState PagerState(int v, @FloatRange(from = -0.5, to = 0.5) float f, @NotNull Function0 function00) {
        return new e(v, f, function00);
    }

    public static PagerState PagerState$default(int v, float f, Function0 function00, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        if((v1 & 2) != 0) {
            f = 0.0f;
        }
        return PagerStateKt.PagerState(v, f, function00);
    }

    public static final Object access$animateScrollToPage(LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope0, int v, float f, AnimationSpec animationSpec0, Function2 function20, Continuation continuation0) {
        Unit unit0 = lazyLayoutAnimateScrollScope0.scroll(new g0(lazyLayoutAnimateScrollScope0, v, f, animationSpec0, function20, null), continuation0);
        return unit0 == a.getCOROUTINE_SUSPENDED() ? unit0 : Unit.INSTANCE;
    }

    public static final long access$calculateNewMinScrollOffset(PagerMeasureResult pagerMeasureResult0, int v) {
        int v1;
        if(pagerMeasureResult0.getOrientation() == Orientation.Horizontal) {
            v1 = IntSize.getWidth-impl(pagerMeasureResult0.getViewportSize-YbymL2g());
            return (long)c.coerceIn(pagerMeasureResult0.getSnapPosition().position(v1, pagerMeasureResult0.getPageSize(), pagerMeasureResult0.getBeforeContentPadding(), pagerMeasureResult0.getAfterContentPadding(), 0, v), 0, v1);
        }
        v1 = IntSize.getHeight-impl(pagerMeasureResult0.getViewportSize-YbymL2g());
        return (long)c.coerceIn(pagerMeasureResult0.getSnapPosition().position(v1, pagerMeasureResult0.getPageSize(), pagerMeasureResult0.getBeforeContentPadding(), pagerMeasureResult0.getAfterContentPadding(), 0, v), 0, v1);
    }

    @Nullable
    public static final Object animateToNextPage(@NotNull PagerState pagerState0, @NotNull Continuation continuation0) {
        if(pagerState0.getCurrentPage() + 1 < pagerState0.getPageCount()) {
            Object object0 = PagerState.animateScrollToPage$default(pagerState0, pagerState0.getCurrentPage() + 1, 0.0f, null, continuation0, 6, null);
            return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public static final Object animateToPreviousPage(@NotNull PagerState pagerState0, @NotNull Continuation continuation0) {
        if(pagerState0.getCurrentPage() - 1 >= 0) {
            Object object0 = PagerState.animateScrollToPage$default(pagerState0, pagerState0.getCurrentPage() - 1, 0.0f, null, continuation0, 6, null);
            return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final long calculateNewMaxScrollOffset(@NotNull PagerLayoutInfo pagerLayoutInfo0, int v) {
        int v3;
        int v1 = pagerLayoutInfo0.getPageSpacing();
        long v2 = ((long)v) * ((long)(pagerLayoutInfo0.getPageSize() + v1)) + ((long)pagerLayoutInfo0.getBeforeContentPadding()) + ((long)pagerLayoutInfo0.getAfterContentPadding());
        if(pagerLayoutInfo0.getOrientation() == Orientation.Horizontal) {
            v3 = IntSize.getWidth-impl(pagerLayoutInfo0.getViewportSize-YbymL2g());
            return c.coerceAtLeast(v2 - ((long)(v3 - c.coerceIn(pagerLayoutInfo0.getSnapPosition().position(v3, pagerLayoutInfo0.getPageSize(), pagerLayoutInfo0.getBeforeContentPadding(), pagerLayoutInfo0.getAfterContentPadding(), v - 1, v), 0, v3))), 0L);
        }
        v3 = IntSize.getHeight-impl(pagerLayoutInfo0.getViewportSize-YbymL2g());
        return c.coerceAtLeast(v2 - ((long)(v3 - c.coerceIn(pagerLayoutInfo0.getSnapPosition().position(v3, pagerLayoutInfo0.getPageSize(), pagerLayoutInfo0.getBeforeContentPadding(), pagerLayoutInfo0.getAfterContentPadding(), v - 1, v), 0, v3))), 0L);
    }

    public static final float getDefaultPositionThreshold() {
        return PagerStateKt.a;
    }

    @NotNull
    public static final PagerMeasureResult getEmptyLayoutInfo() {
        return PagerStateKt.b;
    }

    @Composable
    @NotNull
    public static final PagerState rememberPagerState(int v, @FloatRange(from = -0.5, to = 0.5) float f, @NotNull Function0 function00, @Nullable Composer composer0, int v1, int v2) {
        int v3 = 0;
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            f = 0.0f;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB7D52303, v1, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:86)");
        }
        Saver saver0 = e.L.getSaver();
        int v4 = ((v1 & 14 ^ 6) <= 4 || !composer0.changed(v)) && (v1 & 6) != 4 ? 0 : 1;
        int v5 = ((v1 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(f)) && (v1 & 0x30) != 0x20 ? 0 : 1;
        if((v1 & 0x380 ^ 0x180) > 0x100 && composer0.changed(function00) || (v1 & 0x180) == 0x100) {
            v3 = 1;
        }
        h0 h00 = composer0.rememberedValue();
        if((v4 | v5 | v3) != 0 || h00 == Composer.Companion.getEmpty()) {
            h00 = new h0(v, f, function00);
            composer0.updateRememberedValue(h00);
        }
        PagerState pagerState0 = (e)RememberSaveableKt.rememberSaveable(new Object[0], saver0, null, h00, composer0, 0, 4);
        pagerState0.K.setValue(function00);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pagerState0;
    }
}

