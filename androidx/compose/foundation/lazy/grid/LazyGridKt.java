package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.a;
import c0.i;
import c0.k;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0080\u0001\u0010\u0017\u001A\u00020\u00142\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u00102\u0017\u0010\u0016\u001A\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0002\b\u0015H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "slots", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "LazyGrid", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,378:1\n148#2:379\n488#3:380\n487#3,4:381\n491#3,2:388\n495#3:394\n1223#4,3:385\n1226#4,3:391\n1223#4,6:397\n487#5:390\n77#6:395\n77#6:396\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n*L\n63#1:379\n83#1:380\n83#1:381,4\n83#1:388,2\n83#1:394\n83#1:385,3\n83#1:391,3\n162#1:397,6\n83#1:390\n84#1:395\n114#1:396\n*E\n"})
public final class LazyGridKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void LazyGrid(@Nullable Modifier modifier0, @NotNull LazyGridState lazyGridState0, @NotNull LazyGridSlotsProvider lazyGridSlotsProvider0, @Nullable PaddingValues paddingValues0, boolean z, boolean z1, @Nullable FlingBehavior flingBehavior0, boolean z2, @NotNull Vertical arrangement$Vertical0, @NotNull Horizontal arrangement$Horizontal0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1, int v2) {
        FlingBehavior flingBehavior1;
        PaddingValues paddingValues1;
        Modifier modifier1;
        boolean z3;
        int v18;
        PaddingValues paddingValues4;
        boolean z6;
        Modifier modifier5;
        int v17;
        Modifier modifier4;
        int v9;
        int v8;
        boolean z4;
        PaddingValues paddingValues2;
        int v5;
        Modifier modifier2;
        FlingBehavior flingBehavior2;
        int v4;
        int v3;
        Composer composer1 = composer0.startRestartGroup(-649686062);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changed(lazyGridState0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (((v & 0x200) == 0 ? composer1.changed(lazyGridSlotsProvider0) : composer1.changedInstance(lazyGridSlotsProvider0)) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(paddingValues0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changed(z) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changed(z1) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v3 |= ((v2 & 0x40) != 0 || !composer1.changed(flingBehavior0) ? 0x80000 : 0x100000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v3 |= (composer1.changed(z2) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((0x6000000 & v) == 0) {
            v3 |= (composer1.changed(arrangement$Vertical0) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((0x30000000 & v) == 0) {
            v3 |= (composer1.changed(arrangement$Horizontal0) ? 0x20000000 : 0x10000000);
        }
        if((v2 & 0x400) == 0) {
            v4 = (v1 & 6) == 0 ? v1 | (composer1.changedInstance(function10) ? 4 : 2) : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 306783379) != 306783378 || (v4 & 3) != 2 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
                PaddingValues paddingValues3 = (v2 & 8) == 0 ? paddingValues0 : PaddingKt.PaddingValues-0680j_4(0.0f);
                if((v2 & 0x40) == 0) {
                    flingBehavior2 = flingBehavior0;
                }
                else {
                    v3 &= 0xFFC7FFFF;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composer1, 6);
                }
                v5 = v3;
                paddingValues2 = paddingValues3;
                z4 = (v2 & 16) == 0 ? z : false;
                modifier2 = modifier3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x40) != 0) {
                    v3 &= 0xFFC7FFFF;
                }
                flingBehavior2 = flingBehavior0;
                modifier2 = modifier0;
                v5 = v3;
                paddingValues2 = paddingValues0;
                z4 = z;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-649686062, v5, v4, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
            }
            int v6 = v5 >> 3 & 14;
            Function0 function00 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState0, function10, composer1, v4 << 3 & 0x70 | v6);
            LazyLayoutSemanticState lazyLayoutSemanticState0 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState0, z4, composer1, v5 >> 9 & 0x70 | v6);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalGraphicsContext());
            int v7 = 0x7FFF0 & v5 | v5 >> 9 & 0x380000 | v5 >> 3 & 0x1C00000;
            if(ComposerKt.isTraceInProgress()) {
                v8 = v5;
                v9 = v5 >> 3;
                modifier4 = modifier2;
                ComposerKt.traceEventStart(-1585069765, v7, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:161)");
            }
            else {
                v8 = v5;
                v9 = v5 >> 3;
                modifier4 = modifier2;
            }
            int v10 = ((v7 & 0x70 ^ 0x30) <= 0x20 || !composer1.changed(lazyGridState0)) && (v7 & 0x30) != 0x20 ? 0 : 1;
            int v11 = ((v7 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(lazyGridSlotsProvider0)) && (v7 & 0x180) != 0x100 ? 0 : 1;
            int v12 = ((v7 & 0x1C00 ^ 0xC00) <= 0x800 || !composer1.changed(paddingValues2)) && (v7 & 0xC00) != 0x800 ? 0 : 1;
            int v13 = ((v7 & 0xE000 ^ 0x6000) <= 0x4000 || !composer1.changed(z4)) && (v7 & 0x6000) != 0x4000 ? 0 : 1;
            int v14 = ((v7 & 0x70000 ^ 0x30000) <= 0x20000 || !composer1.changed(z1)) && (v7 & 0x30000) != 0x20000 ? 0 : 1;
            int v15 = ((v7 & 0x380000 ^ 0x180000) <= 0x100000 || !composer1.changed(arrangement$Horizontal0)) && (0x180000 & v7) != 0x100000 ? 0 : 1;
            int v16 = ((0x1C00000 & v7 ^ 0xC00000) <= 0x800000 || !composer1.changed(arrangement$Vertical0)) && (v7 & 0xC00000) != 0x800000 ? 0 : 1;
            boolean z5 = composer1.changed(((GraphicsContext)object0));
            k k0 = composer1.rememberedValue();
            if((v10 | v11 | v12 | v13 | v14 | v15 | v16 | z5) != 0 || k0 == composer$Companion0.getEmpty()) {
                v18 = v8;
                v17 = v6;
                z6 = z4;
                paddingValues4 = paddingValues2;
                modifier5 = modifier4;
                k k1 = new k(lazyGridState0, z1, paddingValues2, z4, function00, lazyGridSlotsProvider0, arrangement$Vertical0, arrangement$Horizontal0, coroutineScope0, ((GraphicsContext)object0));
                composer1.updateRememberedValue(k1);
                k0 = k1;
            }
            else {
                v17 = v6;
                modifier5 = modifier4;
                z6 = z4;
                paddingValues4 = paddingValues2;
                v18 = v8;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Orientation orientation0 = z1 ? Orientation.Vertical : Orientation.Horizontal;
            LazyLayoutKt.LazyLayout(function00, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier5.then(lazyGridState0.getRemeasurementModifier$foundation_release()).then(lazyGridState0.getAwaitLayoutModifier$foundation_release()), function00, lazyLayoutSemanticState0, orientation0, z2, z6, composer1, v5 >> 9 & 0xE000 | v18 << 3 & 0x70000), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState0, composer1, v17), lazyGridState0.getBeyondBoundsInfo$foundation_release(), z6, ((LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection())), orientation0, z2, composer1, MutableVector.$stable << 6 | v9 & 0x1C00 | v9 & 0x380000).then(lazyGridState0.getItemAnimator$foundation_release().getModifier()), lazyGridState0, orientation0, z2, z6, flingBehavior2, lazyGridState0.getInternalInteractionSource$foundation_release(), null, composer1, v5 & 0x70 | v18 >> 12 & 0x1C00 | v5 & 0xE000 | v9 & 0x70000, 0x40), lazyGridState0.getPrefetchState$foundation_release(), k0, composer1, 0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier5;
            flingBehavior1 = flingBehavior2;
            z3 = z6;
            paddingValues1 = paddingValues4;
        }
        else {
            composer1.skipToGroupEnd();
            z3 = z;
            modifier1 = modifier0;
            paddingValues1 = paddingValues0;
            flingBehavior1 = flingBehavior0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(modifier1, lazyGridState0, lazyGridSlotsProvider0, paddingValues1, z3, z1, flingBehavior1, z2, arrangement$Vertical0, arrangement$Horizontal0, function10, v, v1, v2));
        }
    }
}

