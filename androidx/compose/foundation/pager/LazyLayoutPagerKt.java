package androidx.compose.foundation.pager;

import aa.m;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.material3.rg;
import androidx.compose.material3.td;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.a;
import f0.f;
import f0.g;
import f0.h;
import f0.j0;
import f0.k;
import f0.l;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001AÞ\u0001\u0010*\u001A\u00020$2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\u00062\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u00132#\u0010\u001A\u001A\u001F\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00152\u0006\u0010\u001C\u001A\u00020\u001B2\u0006\u0010\u001E\u001A\u00020\u001D2\u0006\u0010 \u001A\u00020\u001F21\u0010\'\u001A-\u0012\u0004\u0012\u00020\"\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020$0!¢\u0006\u0002\b%¢\u0006\u0002\b&H\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "flingBehavior", "userScrollEnabled", "", "beyondViewportPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageNestedScrollConnection", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "key", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "pageContent", "Pager-uYRUAWA", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZIFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "Pager", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyLayoutPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,397:1\n148#2:398\n1223#3,6:399\n1223#3,3:410\n1226#3,3:416\n1223#3,6:420\n1223#3,6:426\n1223#3,6:433\n1223#3,6:440\n488#4:405\n487#4,4:406\n491#4,2:413\n495#4:419\n487#5:415\n77#6:432\n77#6:439\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPager.kt\nandroidx/compose/foundation/pager/LazyLayoutPagerKt\n*L\n87#1:398\n112#1:399,6\n114#1:410,3\n114#1:416,3\n129#1:420,6\n137#1:426,6\n142#1:433,6\n262#1:440,6\n114#1:405\n114#1:406,4\n114#1:413,2\n114#1:419\n114#1:415\n141#1:432\n173#1:439\n*E\n"})
public final class LazyLayoutPagerKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Pager-uYRUAWA(@NotNull Modifier modifier0, @NotNull PagerState pagerState0, @NotNull PaddingValues paddingValues0, boolean z, @NotNull Orientation orientation0, @NotNull TargetedFlingBehavior targetedFlingBehavior0, boolean z1, int v, float f, @NotNull PageSize pageSize0, @NotNull NestedScrollConnection nestedScrollConnection0, @Nullable Function1 function10, @NotNull Horizontal alignment$Horizontal0, @NotNull Vertical alignment$Vertical0, @NotNull SnapPosition snapPosition0, @NotNull Function4 function40, @Nullable Composer composer0, int v1, int v2, int v3) {
        float f1;
        int v10;
        int v9;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x2016E66E);
        if((v3 & 1) == 0) {
            v4 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        int v5 = 16;
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v4 |= (composer1.changed(pagerState0) ? 0x20 : 16);
        }
        int v6 = 0x100;
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v4 |= (composer1.changed(paddingValues0) ? 0x100 : 0x80);
        }
        int v7 = 0x800;
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v4 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        int v8 = 0x4000;
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v4 |= (composer1.changed(orientation0) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x30000) == 0) {
            v4 |= (composer1.changed(targetedFlingBehavior0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((0x180000 & v1) == 0) {
            v4 |= (composer1.changed(z1) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v1 & 0xC00000) == 0) {
            v4 |= (composer1.changed(v) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v4 |= (composer1.changed(f) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((0x30000000 & v1) == 0) {
            v4 |= (composer1.changed(pageSize0) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v9 = (v2 & 6) == 0 ? (composer1.changedInstance(nestedScrollConnection0) ? 4 : 2) | v2 : v2;
        }
        else {
            v9 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v9 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            if(composer1.changedInstance(function10)) {
                v5 = 0x20;
            }
            v9 |= v5;
        }
        if((v3 & 0x1000) != 0) {
            v9 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            if(!composer1.changed(alignment$Horizontal0)) {
                v6 = 0x80;
            }
            v9 |= v6;
        }
        if((v3 & 0x2000) != 0) {
            v9 |= 0xC00;
        }
        else if((v2 & 0xC00) == 0) {
            if(!composer1.changed(alignment$Vertical0)) {
                v7 = 0x400;
            }
            v9 |= v7;
        }
        if((v3 & 0x4000) != 0) {
            v9 |= 0x6000;
        }
        else if((v2 & 0x6000) == 0) {
            if(!composer1.changed(snapPosition0)) {
                v8 = 0x2000;
            }
            v9 |= v8;
        }
        if((v3 & 0x8000) != 0) {
            v9 |= 0x30000;
        }
        else if((v2 & 0x30000) == 0) {
            v9 |= (composer1.changedInstance(function40) ? 0x20000 : 0x10000);
        }
        if((v4 & 306783379) == 306783378 && (74899 & v9) == 74898 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            v10 = v;
            f1 = f;
        }
        else {
            int v11 = (v3 & 0x80) == 0 ? v : 0;
            float f2 = (v3 & 0x100) == 0 ? f : 0.0f;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2016E66E, v4, v9, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:101)");
            }
            if(v11 < 0) {
                throw new IllegalArgumentException(("beyondViewportPageCount should be greater than or equal to 0, you selected " + v11).toString());
            }
            h h0 = composer1.rememberedValue();
            if((v4 & 0x70) == 0x20 || h0 == Composer.Companion.getEmpty()) {
                h0 = new h(pagerState0);
                composer1.updateRememberedValue(h0);
            }
            int v12 = v4 >> 3 & 14;
            int v13 = v12 | v9 >> 12 & 0x70 | v9 << 3 & 0x380;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1372505274, v13, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:258)");
            }
            State state0 = SnapshotStateKt.rememberUpdatedState(function40, composer1, v13 >> 3 & 14);
            State state1 = SnapshotStateKt.rememberUpdatedState(function10, composer1, v13 >> 6 & 14);
            boolean z2 = (v13 & 14 ^ 6) > 4 && composer1.changed(pagerState0) || (v13 & 6) == 4;
            boolean z3 = composer1.changed(state0);
            boolean z4 = composer1.changed(state1);
            boolean z5 = composer1.changed(h0);
            rg rg0 = composer1.rememberedValue();
            if((z2 | z3 | z4 | z5) != 0 || rg0 == Composer.Companion.getEmpty()) {
                State state2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new td(state0, state1, 7, h0));
                rg0 = new rg(0, SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new m(state2, pagerState0, 18)), State.class, "value", "getValue()Ljava/lang/Object;", 5);
                composer1.updateRememberedValue(rg0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            g g0 = composer1.rememberedValue();
            if((v4 & 0x70) == 0x20 || g0 == composer$Companion0.getEmpty()) {
                g0 = new g(pagerState0);
                composer1.updateRememberedValue(g0);
            }
            Function2 function20 = PagerMeasurePolicyKt.rememberPagerMeasurePolicy-8u0NR3k(rg0, pagerState0, paddingValues0, z, orientation0, v11, f2, pageSize0, alignment$Horizontal0, alignment$Vertical0, snapPosition0, coroutineScope0, g0, composer1, 0xFFF0 & v4 | v4 >> 6 & 0x70000 | 0x380000 & v4 >> 6 | 0x1C00000 & v4 >> 6 | 0xE000000 & v9 << 18 | v9 << 18 & 0x70000000, v9 >> 12 & 14);
            Orientation orientation1 = Orientation.Vertical;
            LazyLayoutSemanticState lazyLayoutSemanticState0 = PagerSemanticsKt.rememberPagerSemanticState(pagerState0, orientation0 == orientation1, composer1, v12);
            j0 j00 = composer1.rememberedValue();
            if((((v4 & 0x70000) == 0x20000 ? 1 : 0) | ((v4 & 0x70) == 0x20 ? 1 : 0)) != 0 || j00 == composer$Companion0.getEmpty()) {
                j00 = new j0(targetedFlingBehavior0, pagerState0);
                composer1.updateRememberedValue(j00);
            }
            BringIntoViewSpec bringIntoViewSpec0 = (BringIntoViewSpec)composer1.consume(BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec());
            boolean z6 = composer1.changed(bringIntoViewSpec0);
            l l0 = composer1.rememberedValue();
            if(z6 || (v4 & 0x70) == 0x20 || l0 == composer$Companion0.getEmpty()) {
                l0 = new l(pagerState0, bringIntoViewSpec0);
                composer1.updateRememberedValue(l0);
            }
            Modifier modifier1 = ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(PagerKt.pagerSemantics(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier0.then(pagerState0.getRemeasurementModifier$foundation_release()).then(pagerState0.getAwaitLayoutModifier$foundation_release()), rg0, lazyLayoutSemanticState0, orientation0, z1, z, composer1, v4 >> 3 & 0x1C00 | v4 >> 6 & 0xE000 | v4 << 6 & 0x70000), pagerState0, orientation0 == orientation1, coroutineScope0, z1), PagerBeyondBoundsModifierKt.rememberPagerBeyondBoundsState(pagerState0, v11, composer1, v4 >> 18 & 0x70 | v12), pagerState0.getBeyondBoundsInfo$foundation_release(), z, ((LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection())), orientation0, z1, composer1, MutableVector.$stable << 6 | v4 & 0x1C00 | v4 << 3 & 0x70000 | v4 & 0x380000), pagerState0, orientation0, z1, z, j00, pagerState0.getInternalInteractionSource$foundation_release(), l0, composer1, v4 >> 6 & 0x380 | v4 & 0x70 | v4 >> 9 & 0x1C00 | v4 << 3 & 0xE000, 0);
            k k0 = new k(pagerState0, null);
            LazyLayoutKt.LazyLayout(rg0, NestedScrollModifierKt.nestedScroll$default(modifier1.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, pagerState0, k0)), nestedScrollConnection0, null, 2, null), pagerState0.getPrefetchState$foundation_release(), function20, composer1, 0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f1 = f2;
            v10 = v11;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(modifier0, pagerState0, paddingValues0, z, orientation0, targetedFlingBehavior0, z1, v10, f1, pageSize0, nestedScrollConnection0, function10, alignment$Horizontal0, alignment$Vertical0, snapPosition0, function40, v1, v2, v3));
        }
    }
}

