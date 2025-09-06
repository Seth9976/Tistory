package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
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
import e0.f;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0089\u0001\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0010\u001A\u00020\r2\b\b\u0002\u0010\u0011\u001A\u00020\u00122\b\b\u0002\u0010\u0013\u001A\u00020\u00122\u0017\u0010\u0014\u001A\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"LazyStaggeredGrid", "", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "slots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacing", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyStaggeredGrid-LJWHXA8", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZFFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyStaggeredGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,118:1\n148#2:119\n148#2:120\n148#2:121\n488#3:122\n487#3,4:123\n491#3,2:130\n495#3:136\n1223#4,3:127\n1226#4,3:133\n487#5:132\n77#6:137\n77#6:138\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGrid.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridKt\n*L\n48#1:119\n56#1:120\n58#1:121\n63#1:122\n63#1:123,4\n63#1:130,2\n63#1:136\n63#1:127,3\n63#1:133,3\n63#1:132\n64#1:137\n94#1:138\n*E\n"})
public final class LazyStaggeredGridKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void LazyStaggeredGrid-LJWHXA8(@NotNull LazyStaggeredGridState lazyStaggeredGridState0, @NotNull Orientation orientation0, @NotNull LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider0, @Nullable Modifier modifier0, @Nullable PaddingValues paddingValues0, boolean z, @Nullable FlingBehavior flingBehavior0, boolean z1, float f, float f1, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1, int v2) {
        float f3;
        float f2;
        boolean z3;
        FlingBehavior flingBehavior1;
        boolean z2;
        PaddingValues paddingValues1;
        Modifier modifier1;
        int v5;
        float f5;
        float f4;
        boolean z5;
        FlingBehavior flingBehavior2;
        boolean z4;
        PaddingValues paddingValues2;
        Modifier modifier2;
        FlingBehavior flingBehavior3;
        int v4;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x112F08D6);
        if((v2 & 1) == 0) {
            v3 = (v & 6) == 0 ? (composer1.changedInstance(lazyStaggeredGridState0) ? 4 : 2) | v : v;
        }
        else {
            v3 = v | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v3 |= (composer1.changed(orientation0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v3 |= (((v & 0x200) == 0 ? composer1.changed(lazyGridStaggeredGridSlotsProvider0) : composer1.changedInstance(lazyGridStaggeredGridSlotsProvider0)) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v3 |= (composer1.changed(modifier0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v3 |= (composer1.changed(paddingValues0) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v3 |= (composer1.changed(z) ? 0x20000 : 0x10000);
        }
        if((v & 0x180000) == 0) {
            v3 |= ((v2 & 0x40) != 0 || !composer1.changed(flingBehavior0) ? 0x80000 : 0x100000);
        }
        if((v2 & 0x80) != 0) {
            v3 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v3 |= (composer1.changed(z1) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x100) != 0) {
            v3 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v3 |= (composer1.changed(f) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x200) != 0) {
            v3 |= 0x30000000;
        }
        else if((v & 0x30000000) == 0) {
            v3 |= (composer1.changed(f1) ? 0x20000000 : 0x10000000);
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
                Modifier modifier3 = (v2 & 8) == 0 ? modifier0 : Modifier.Companion;
                PaddingValues paddingValues3 = (v2 & 16) == 0 ? paddingValues0 : PaddingKt.PaddingValues-0680j_4(0.0f);
                z4 = (v2 & 0x20) == 0 ? z : false;
                if((v2 & 0x40) == 0) {
                    flingBehavior3 = flingBehavior0;
                }
                else {
                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(composer1, 6);
                    v3 &= 0xFFC7FFFF;
                }
                f5 = (v2 & 0x200) == 0 ? f1 : 0.0f;
                z5 = (v2 & 0x80) == 0 ? z1 : true;
                paddingValues2 = paddingValues3;
                flingBehavior2 = flingBehavior3;
                f4 = (v2 & 0x100) == 0 ? f : 0.0f;
                v5 = v3;
                modifier2 = modifier3;
            }
            else {
                composer1.skipToGroupEnd();
                if((v2 & 0x40) != 0) {
                    v3 &= 0xFFC7FFFF;
                }
                modifier2 = modifier0;
                paddingValues2 = paddingValues0;
                z4 = z;
                flingBehavior2 = flingBehavior0;
                z5 = z1;
                f4 = f;
                f5 = f1;
                v5 = v3;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x112F08D6, v5, v4, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:60)");
            }
            Function0 function00 = LazyStaggeredGridItemProviderKt.rememberStaggeredGridItemProviderLambda(lazyStaggeredGridState0, function10, composer1, v4 << 3 & 0x70 | v5 & 14);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            if(compositionScopedCoroutineScopeCanceller0 == Composer.Companion.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            int v6 = v5 >> 6 & 0x1C00;
            Function2 function20 = LazyStaggeredGridMeasurePolicyKt.rememberStaggeredGridMeasurePolicy-qKj4JfE(lazyStaggeredGridState0, function00, paddingValues2, z4, orientation0, f4, f5, compositionScopedCoroutineScopeCanceller0.getCoroutineScope(), lazyGridStaggeredGridSlotsProvider0, ((GraphicsContext)composer1.consume(CompositionLocalsKt.getLocalGraphicsContext())), composer1, v5 >> 6 & 0x380 | v5 & 14 | v6 | v5 << 9 & 0xE000 | v5 >> 9 & 0x70000 | v5 >> 9 & 0x380000 | v5 << 18 & 0xE000000);
            LazyLayoutSemanticState lazyLayoutSemanticState0 = LazyStaggeredGridSemanticsKt.rememberLazyStaggeredGridSemanticState(lazyStaggeredGridState0, z4, composer1, v5 >> 12 & 0x70 | v5 & 14);
            LazyLayoutKt.LazyLayout(function00, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier2.then(lazyStaggeredGridState0.getRemeasurementModifier$foundation_release()).then(lazyStaggeredGridState0.getAwaitLayoutModifier$foundation_release()), function00, lazyLayoutSemanticState0, orientation0, z5, z4, composer1, v5 << 6 & 0x1C00 | v5 >> 9 & 0xE000 | v5 & 0x70000), LazyStaggeredGridBeyondBoundsModifierKt.rememberLazyStaggeredGridBeyondBoundsState(lazyStaggeredGridState0, composer1, v5 & 14), lazyStaggeredGridState0.getBeyondBoundsInfo$foundation_release(), z4, ((LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection())), orientation0, z5, composer1, MutableVector.$stable << 6 | v6 | v5 << 12 & 0x70000 | 0x380000 & v5 >> 3).then(lazyStaggeredGridState0.getItemAnimator$foundation_release().getModifier()), lazyStaggeredGridState0, orientation0, z5, z4, flingBehavior2, lazyStaggeredGridState0.getMutableInteractionSource$foundation_release(), null, composer1, v5 >> 12 & 0x1C00 | v5 << 3 & 0x3F0 | v5 >> 3 & 0xE000 | v5 >> 3 & 0x70000, 0x40), lazyStaggeredGridState0.getPrefetchState$foundation_release(), function20, composer1, 0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z4;
            modifier1 = modifier2;
            paddingValues1 = paddingValues2;
            flingBehavior1 = flingBehavior2;
            z3 = z5;
            f2 = f4;
            f3 = f5;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            paddingValues1 = paddingValues0;
            z2 = z;
            flingBehavior1 = flingBehavior0;
            z3 = z1;
            f2 = f;
            f3 = f1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(lazyStaggeredGridState0, orientation0, lazyGridStaggeredGridSlotsProvider0, modifier1, paddingValues1, z2, flingBehavior1, z3, f2, f3, function10, v, v1, v2));
        }
    }
}

