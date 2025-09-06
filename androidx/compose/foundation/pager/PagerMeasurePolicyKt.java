package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import f0.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A¡\u0001\u0010\u0000\u001A\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u001A2\u0006\u0010\u001B\u001A\u00020\u001C2\u0006\u0010\u001D\u001A\u00020\u001E2\f\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\""}, d2 = {"rememberPagerMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/pager/PagerState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "beyondViewportPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "pageCount", "rememberPagerMeasurePolicy-8u0NR3k", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagerMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,208:1\n1223#2,6:209\n*S KotlinDebug\n*F\n+ 1 PagerMeasurePolicy.kt\nandroidx/compose/foundation/pager/PagerMeasurePolicyKt\n*L\n57#1:209,6\n*E\n"})
public final class PagerMeasurePolicyKt {
    @Composable
    @NotNull
    public static final Function2 rememberPagerMeasurePolicy-8u0NR3k(@NotNull Function0 function00, @NotNull PagerState pagerState0, @NotNull PaddingValues paddingValues0, boolean z, @NotNull Orientation orientation0, int v, float f, @NotNull PageSize pageSize0, @Nullable Horizontal alignment$Horizontal0, @Nullable Vertical alignment$Vertical0, @NotNull SnapPosition snapPosition0, @NotNull CoroutineScope coroutineScope0, @NotNull Function0 function01, @Nullable Composer composer0, int v1, int v2) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x52EF60E7, v1, v2, "androidx.compose.foundation.pager.rememberPagerMeasurePolicy (PagerMeasurePolicy.kt:56)");
        }
        int v3 = ((v1 & 0x70 ^ 0x30) <= 0x20 || !composer0.changed(pagerState0)) && (v1 & 0x30) != 0x20 ? 0 : 1;
        int v4 = ((v1 & 0x380 ^ 0x180) <= 0x100 || !composer0.changed(paddingValues0)) && (v1 & 0x180) != 0x100 ? 0 : 1;
        int v5 = ((v1 & 0x1C00 ^ 0xC00) <= 0x800 || !composer0.changed(z)) && (v1 & 0xC00) != 0x800 ? 0 : 1;
        int v6 = ((0xE000 & v1 ^ 0x6000) <= 0x4000 || !composer0.changed(orientation0)) && (v1 & 0x6000) != 0x4000 ? 0 : 1;
        int v7 = ((0xE000000 & v1 ^ 0x6000000) <= 0x4000000 || !composer0.changed(alignment$Horizontal0)) && (v1 & 0x6000000) != 0x4000000 ? 0 : 1;
        int v8 = ((0x70000000 & v1 ^ 0x30000000) <= 0x20000000 || !composer0.changed(alignment$Vertical0)) && (v1 & 0x30000000) != 0x20000000 ? 0 : 1;
        int v9 = ((0x380000 & v1 ^ 0x180000) <= 0x100000 || !composer0.changed(f)) && (0x180000 & v1) != 0x100000 ? 0 : 1;
        int v10 = ((0x1C00000 & v1 ^ 0xC00000) <= 0x800000 || !composer0.changed(pageSize0)) && (0xC00000 & v1) != 0x800000 ? 0 : 1;
        int v11 = ((v2 & 14 ^ 6) <= 4 || !composer0.changed(snapPosition0)) && (v2 & 6) != 4 ? 0 : 1;
        int v12 = ((v2 & 0x380 ^ 0x180) <= 0x100 || !composer0.changed(function01)) && (v2 & 0x180) != 0x100 ? 0 : 1;
        int v13 = ((0x70000 & v1 ^ 0x30000) <= 0x20000 || !composer0.changed(v)) && (v1 & 0x30000) != 0x20000 ? 0 : 1;
        boolean z1 = composer0.changed(coroutineScope0);
        z z2 = composer0.rememberedValue();
        if((v12 | (v3 | v4 | v5 | v6 | v7 | v8 | v9 | v10 | v11) | v13 | z1) != 0 || z2 == Composer.Companion.getEmpty()) {
            z z3 = new z(pagerState0, orientation0, paddingValues0, z, f, pageSize0, function00, function01, alignment$Vertical0, alignment$Horizontal0, v, snapPosition0, coroutineScope0);
            composer0.updateRememberedValue(z3);
            z2 = z3;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z2;
    }
}

