package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement.Vertical;
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
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.a;
import b0.i;
import b0.k;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u009A\u0001\u0010\u001B\u001A\u00020\u00182\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\u00062\b\b\u0002\u0010\r\u001A\u00020\f2\n\b\u0002\u0010\u000F\u001A\u0004\u0018\u00010\u000E2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00142\u0017\u0010\u001A\u001A\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "userScrollEnabled", "", "beyondBoundsItemCount", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "LazyList", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,365:1\n488#2:366\n487#2,4:367\n491#2,2:374\n495#2:380\n1223#3,3:371\n1226#3,3:377\n1223#3,6:384\n487#4:376\n77#5:381\n77#5:382\n77#5:383\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n*L\n85#1:366\n85#1:367,4\n85#1:374,2\n85#1:380\n85#1:371,3\n85#1:377,3\n171#1:384,6\n85#1:376\n86#1:381\n87#1:382\n124#1:383\n*E\n"})
public final class LazyListKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void LazyList(@NotNull Modifier modifier0, @NotNull LazyListState lazyListState0, @NotNull PaddingValues paddingValues0, boolean z, boolean z1, @NotNull FlingBehavior flingBehavior0, boolean z2, int v, @Nullable Horizontal alignment$Horizontal0, @Nullable Vertical arrangement$Vertical0, @Nullable androidx.compose.ui.Alignment.Vertical alignment$Vertical0, @Nullable androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal0, @NotNull Function1 function10, @Nullable Composer composer0, int v1, int v2, int v3) {
        int v8;
        androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal1;
        androidx.compose.ui.Alignment.Vertical alignment$Vertical1;
        Vertical arrangement$Vertical1;
        Horizontal alignment$Horizontal1;
        int v23;
        Horizontal alignment$Horizontal3;
        androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal3;
        androidx.compose.ui.Alignment.Vertical alignment$Vertical3;
        Vertical arrangement$Vertical3;
        int v22;
        int v21;
        int v13;
        int v6;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x25001C13);
        if((v3 & 1) == 0) {
            v4 = (v1 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v4 |= (composer1.changed(lazyListState0) ? 0x20 : 16);
        }
        int v5 = 0x80;
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v4 |= (composer1.changed(paddingValues0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0xC00) == 0) {
            v4 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0x6000) == 0) {
            v4 |= (composer1.changed(z1) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((0x30000 & v1) == 0) {
            v4 |= (composer1.changed(flingBehavior0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x180000) == 0) {
            v4 |= (composer1.changed(z2) ? 0x100000 : 0x80000);
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
            v4 |= (composer1.changed(alignment$Horizontal0) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v1 & 0x30000000) == 0) {
            v4 |= (composer1.changed(arrangement$Vertical0) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v6 = (v2 & 6) == 0 ? v2 | (composer1.changed(alignment$Vertical0) ? 4 : 2) : v2;
        }
        else {
            v6 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v6 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v6 |= (composer1.changed(arrangement$Horizontal0) ? 0x20 : 16);
        }
        int v7 = v6;
        if((v3 & 0x1000) != 0) {
            v7 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            if(composer1.changedInstance(function10)) {
                v5 = 0x100;
            }
            v7 |= v5;
        }
        if((306783379 & v4) != 306783378 || (v7 & 0x93) != 0x92 || !composer1.getSkipping()) {
            int v9 = (v3 & 0x80) == 0 ? v : 0;
            androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal2 = null;
            Horizontal alignment$Horizontal2 = (v3 & 0x100) == 0 ? alignment$Horizontal0 : null;
            Vertical arrangement$Vertical2 = (v3 & 0x200) == 0 ? arrangement$Vertical0 : null;
            androidx.compose.ui.Alignment.Vertical alignment$Vertical2 = (v3 & 0x400) == 0 ? alignment$Vertical0 : null;
            if((v3 & 0x800) == 0) {
                arrangement$Horizontal2 = arrangement$Horizontal0;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x25001C13, v4, v7, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
            }
            int v10 = v4 >> 3 & 14;
            Function0 function00 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState0, function10, composer1, v7 >> 3 & 0x70 | v10);
            LazyLayoutSemanticState lazyLayoutSemanticState0 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState0, z1, composer1, v10 | v4 >> 9 & 0x70);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            Object object0 = composer1.consume(CompositionLocalsKt.getLocalGraphicsContext());
            boolean z3 = ((Boolean)composer1.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue();
            int v11 = 1;
            int v12 = v4 & 0xFFF0 | v4 >> 6 & 0x70000 | v4 >> 6 & 0x380000 | v7 << 21 & 0x1C00000 | v7 << 21 & 0xE000000 | v4 & 0x70000000;
            if(ComposerKt.isTraceInProgress()) {
                v13 = v4;
                ComposerKt.traceEventStart(0x758FA0A6, v12, 0, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:170)");
            }
            else {
                v13 = v4;
            }
            int v14 = ((v12 & 0x70 ^ 0x30) <= 0x20 || !composer1.changed(lazyListState0)) && (v12 & 0x30) != 0x20 ? 0 : 1;
            int v15 = ((v12 & 0x380 ^ 0x180) <= 0x100 || !composer1.changed(paddingValues0)) && (v12 & 0x180) != 0x100 ? 0 : 1;
            int v16 = ((v12 & 0x1C00 ^ 0xC00) <= 0x800 || !composer1.changed(z)) && (v12 & 0xC00) != 0x800 ? 0 : 1;
            int v17 = ((0xE000 & v12 ^ 0x6000) <= 0x4000 || !composer1.changed(z1)) && (v12 & 0x6000) != 0x4000 ? 0 : 1;
            int v18 = ((0x380000 & v12 ^ 0x180000) <= 0x100000 || !composer1.changed(alignment$Horizontal2)) && (v12 & 0x180000) != 0x100000 ? 0 : 1;
            int v19 = ((0x1C00000 & v12 ^ 0xC00000) <= 0x800000 || !composer1.changed(alignment$Vertical2)) && (v12 & 0xC00000) != 0x800000 ? 0 : 1;
            int v20 = ((0xE000000 & v12 ^ 0x6000000) <= 0x4000000 || !composer1.changed(arrangement$Horizontal2)) && (v12 & 0x6000000) != 0x4000000 ? 0 : 1;
            if(((0x70000000 & v12 ^ 0x30000000) <= 0x20000000 || !composer1.changed(arrangement$Vertical2)) && (v12 & 0x30000000) != 0x20000000) {
                v11 = 0;
            }
            boolean z4 = composer1.changed(((GraphicsContext)object0));
            boolean z5 = composer1.changed(!z3);
            k k0 = composer1.rememberedValue();
            if((v14 | v15 | v16 | v17 | v18 | v19 | v20 | v11 | z4 | z5) != 0 || k0 == composer$Companion0.getEmpty()) {
                v23 = v13;
                arrangement$Vertical3 = arrangement$Vertical2;
                alignment$Vertical3 = alignment$Vertical2;
                arrangement$Horizontal3 = arrangement$Horizontal2;
                alignment$Horizontal3 = alignment$Horizontal2;
                v22 = v4 & 0x1C00;
                v21 = v4 >> 9;
                k k1 = new k(lazyListState0, z1, paddingValues0, z, function00, arrangement$Vertical3, arrangement$Horizontal3, !z3, v9, coroutineScope0, ((GraphicsContext)object0), alignment$Horizontal3, alignment$Vertical3);
                composer1.updateRememberedValue(k1);
                k0 = k1;
            }
            else {
                v21 = v4 >> 9;
                v22 = v4 & 0x1C00;
                arrangement$Vertical3 = arrangement$Vertical2;
                alignment$Vertical3 = alignment$Vertical2;
                arrangement$Horizontal3 = arrangement$Horizontal2;
                alignment$Horizontal3 = alignment$Horizontal2;
                v23 = v13;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Orientation orientation0 = z1 ? Orientation.Vertical : Orientation.Horizontal;
            LazyLayoutKt.LazyLayout(function00, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier0.then(lazyListState0.getRemeasurementModifier$foundation_release()).then(lazyListState0.getAwaitLayoutModifier$foundation_release()), function00, lazyLayoutSemanticState0, orientation0, z2, z, composer1, v4 >> 6 & 0xE000 | v23 << 6 & 0x70000), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState0, v9, composer1, v10 | v23 >> 18 & 0x70), lazyListState0.getBeyondBoundsInfo$foundation_release(), z, ((LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection())), orientation0, z2, composer1, MutableVector.$stable << 6 | v22 | v23 & 0x380000).then(lazyListState0.getItemAnimator$foundation_release().getModifier()), lazyListState0, orientation0, z2, z, flingBehavior0, lazyListState0.getInternalInteractionSource$foundation_release(), null, composer1, v4 & 0x70 | v21 & 0x1C00 | 0xE000 & v23 << 3 | v23 & 0x70000, 0x40), lazyListState0.getPrefetchState$foundation_release(), k0, composer1, 0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v8 = v9;
            arrangement$Vertical1 = arrangement$Vertical3;
            alignment$Vertical1 = alignment$Vertical3;
            arrangement$Horizontal1 = arrangement$Horizontal3;
            alignment$Horizontal1 = alignment$Horizontal3;
        }
        else {
            composer1.skipToGroupEnd();
            alignment$Horizontal1 = alignment$Horizontal0;
            arrangement$Vertical1 = arrangement$Vertical0;
            alignment$Vertical1 = alignment$Vertical0;
            arrangement$Horizontal1 = arrangement$Horizontal0;
            v8 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(modifier0, lazyListState0, paddingValues0, z, z1, flingBehavior0, z2, v8, alignment$Horizontal1, arrangement$Vertical1, alignment$Vertical1, arrangement$Horizontal1, function10, v1, v2, v3));
        }
    }
}

