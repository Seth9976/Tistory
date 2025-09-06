package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.unit.LayoutDirection;
import e0.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u007F\u0010\u001B\u001A\u0019\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0014¢\u0006\u0002\b\u00182\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u0012H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001A\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001C"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "itemProviderLambda", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/unit/Dp;", "mainAxisSpacing", "crossAxisSpacing", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "slots", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "Lkotlin/ExtensionFunctionType;", "rememberStaggeredGridMeasurePolicy-qKj4JfE", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;FFLkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/graphics/GraphicsContext;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rememberStaggeredGridMeasurePolicy", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,169:1\n1223#2,6:170\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n*L\n51#1:170,6\n*E\n"})
public final class LazyStaggeredGridMeasurePolicyKt {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Orientation.values().length];
            try {
                arr_v[Orientation.Vertical.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Orientation.Horizontal.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final float access$afterPadding(PaddingValues paddingValues0, Orientation orientation0, boolean z, LayoutDirection layoutDirection0) {
        switch(orientation0) {
            case 1: {
                return z ? paddingValues0.calculateTopPadding-D9Ej5fM() : paddingValues0.calculateBottomPadding-D9Ej5fM();
            }
            case 2: {
                return z ? PaddingKt.calculateStartPadding(paddingValues0, layoutDirection0) : PaddingKt.calculateEndPadding(paddingValues0, layoutDirection0);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final float access$beforePadding(PaddingValues paddingValues0, Orientation orientation0, boolean z, LayoutDirection layoutDirection0) {
        switch(orientation0) {
            case 1: {
                return z ? paddingValues0.calculateBottomPadding-D9Ej5fM() : paddingValues0.calculateTopPadding-D9Ej5fM();
            }
            case 2: {
                return z ? PaddingKt.calculateEndPadding(paddingValues0, layoutDirection0) : PaddingKt.calculateStartPadding(paddingValues0, layoutDirection0);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final float access$startPadding(PaddingValues paddingValues0, Orientation orientation0, LayoutDirection layoutDirection0) {
        switch(orientation0) {
            case 1: {
                return PaddingKt.calculateStartPadding(paddingValues0, layoutDirection0);
            }
            case 2: {
                return paddingValues0.calculateTopPadding-D9Ej5fM();
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Composable
    @NotNull
    public static final Function2 rememberStaggeredGridMeasurePolicy-qKj4JfE(@NotNull LazyStaggeredGridState lazyStaggeredGridState0, @NotNull Function0 function00, @NotNull PaddingValues paddingValues0, boolean z, @NotNull Orientation orientation0, float f, float f1, @NotNull CoroutineScope coroutineScope0, @NotNull LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider0, @NotNull GraphicsContext graphicsContext0, @Nullable Composer composer0, int v) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1630140849, v, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:50)");
        }
        boolean z1 = composer0.changed(lazyStaggeredGridState0);
        int v1 = 0;
        boolean z2 = (v & 0x70 ^ 0x30) > 0x20 && composer0.changed(function00) || (v & 0x30) == 0x20;
        int v2 = ((v & 0x380 ^ 0x180) <= 0x100 || !composer0.changed(paddingValues0)) && (v & 0x180) != 0x100 ? 0 : 1;
        int v3 = ((v & 0x1C00 ^ 0xC00) <= 0x800 || !composer0.changed(z)) && (v & 0xC00) != 0x800 ? 0 : 1;
        int v4 = ((0xE000 & v ^ 0x6000) <= 0x4000 || !composer0.changed(orientation0)) && (v & 0x6000) != 0x4000 ? 0 : 1;
        int v5 = ((0x70000 & v ^ 0x30000) <= 0x20000 || !composer0.changed(f)) && (v & 0x30000) != 0x20000 ? 0 : 1;
        int v6 = ((0x380000 & v ^ 0x180000) <= 0x100000 || !composer0.changed(f1)) && (v & 0x180000) != 0x100000 ? 0 : 1;
        if((0xE000000 & v ^ 0x6000000) > 0x4000000 && composer0.changed(lazyGridStaggeredGridSlotsProvider0) || (v & 0x6000000) == 0x4000000) {
            v1 = 1;
        }
        boolean z3 = composer0.changed(graphicsContext0);
        j j0 = composer0.rememberedValue();
        if((z1 | z2 | v2 | v3 | v4 | v5 | v6 | v1 | z3) != 0 || j0 == Composer.Companion.getEmpty()) {
            j0 = new j(lazyStaggeredGridState0, orientation0, lazyGridStaggeredGridSlotsProvider0, function00, paddingValues0, z, f, coroutineScope0, graphicsContext0);
            composer0.updateRememberedValue(j0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j0;
    }
}

