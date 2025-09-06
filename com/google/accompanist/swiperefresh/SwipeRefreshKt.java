package com.google.accompanist.swiperefresh;

import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.a;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.q;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p6.i;
import p6.j;
import p6.l;

@Metadata(d1 = {"\u0000F\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001A¹\u0001\u0010\u001C\u001A\u00020\u00072\u0006\u0010\u0005\u001A\u00020\u00022\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102=\b\u0002\u0010\u0017\u001A7\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0018\u001A\u00020\u00002\u0011\u0010\u0019\u001A\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001A\u0010\u001B\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b\u0019¨\u0006\u001D"}, d2 = {"", "isRefreshing", "Lcom/google/accompanist/swiperefresh/SwipeRefreshState;", "rememberSwipeRefreshState", "(ZLandroidx/compose/runtime/Composer;I)Lcom/google/accompanist/swiperefresh/SwipeRefreshState;", "state", "Lkotlin/Function0;", "", "onRefresh", "Landroidx/compose/ui/Modifier;", "modifier", "swipeEnabled", "Landroidx/compose/ui/unit/Dp;", "refreshTriggerDistance", "Landroidx/compose/ui/Alignment;", "indicatorAlignment", "Landroidx/compose/foundation/layout/PaddingValues;", "indicatorPadding", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "refreshTrigger", "Landroidx/compose/runtime/Composable;", "indicator", "clipIndicatorToPadding", "content", "SwipeRefresh-Fsagccs", "(Lcom/google/accompanist/swiperefresh/SwipeRefreshState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZFLandroidx/compose/ui/Alignment;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "SwipeRefresh", "swiperefresh_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSwipeRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeRefresh.kt\ncom/google/accompanist/swiperefresh/SwipeRefreshKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,318:1\n25#2:319\n25#2:332\n36#2:343\n50#2:352\n49#2:353\n460#2,13:379\n460#2,13:412\n460#2,13:445\n473#2,3:459\n473#2,3:464\n473#2,3:469\n1114#3,6:320\n1114#3,3:333\n1117#3,3:339\n1114#3,6:344\n1114#3,6:354\n154#4:326\n154#4:327\n474#5,4:328\n478#5,2:336\n482#5:342\n474#6:338\n76#7:350\n76#7:367\n76#7:400\n76#7:433\n1#8:351\n67#9,6:360\n73#9:392\n67#9,6:393\n73#9:425\n67#9,6:426\n73#9:458\n77#9:463\n77#9:468\n77#9:473\n75#10:366\n76#10,11:368\n75#10:399\n76#10,11:401\n75#10:432\n76#10,11:434\n89#10:462\n89#10:467\n89#10:472\n*S KotlinDebug\n*F\n+ 1 SwipeRefresh.kt\ncom/google/accompanist/swiperefresh/SwipeRefreshKt\n*L\n76#1:319\n274#1:332\n278#1:343\n288#1:352\n288#1:353\n298#1:379,13\n301#1:412,13\n312#1:445,13\n312#1:459,3\n301#1:464,3\n298#1:469,3\n76#1:320,6\n274#1:333,3\n274#1:339,3\n278#1:344,6\n288#1:354,6\n265#1:326\n267#1:327\n274#1:328,4\n274#1:336,2\n274#1:342\n274#1:338\n285#1:350\n298#1:367\n301#1:400\n312#1:433\n298#1:360,6\n298#1:392\n301#1:393,6\n301#1:425\n312#1:426,6\n312#1:458\n312#1:463\n301#1:468\n298#1:473\n298#1:366\n298#1:368,11\n301#1:399\n301#1:401,11\n312#1:432\n312#1:434,11\n312#1:462\n301#1:467\n298#1:472\n*E\n"})
public final class SwipeRefreshKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(message = "\n accompanist/swiperefresh is deprecated.\n The androidx.compose equivalent of SwipeRefresh is Modifier.pullRefresh().\n This is often migrated as:\n Box(modifier = Modifier.pullRefresh(refreshState)) { \n    ... \n    PullRefreshIndicator(...) \n }\n \n For more migration information, please visit https://google.github.io/accompanist/swiperefresh/#migration\n")
    public static final void SwipeRefresh-Fsagccs(@NotNull SwipeRefreshState swipeRefreshState0, @NotNull Function0 function00, @Nullable Modifier modifier0, boolean z, float f, @Nullable Alignment alignment0, @Nullable PaddingValues paddingValues0, @Nullable Function4 function40, boolean z1, @NotNull Function2 function20, @Nullable Composer composer0, int v, int v1) {
        float f1;
        boolean z3;
        Function4 function41;
        PaddingValues paddingValues1;
        Alignment alignment1;
        boolean z2;
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(swipeRefreshState0, "state");
        Intrinsics.checkNotNullParameter(function00, "onRefresh");
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(2017402940);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(swipeRefreshState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(f) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x70000) == 0) {
            v2 |= (composer1.changed(alignment0) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x40) != 0) {
            v2 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x100000 : 0x80000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0x1C00000) == 0) {
            v2 |= (composer1.changedInstance(function40) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0xE000000) == 0) {
            v2 |= (composer1.changed(z1) ? 0x4000000 : 0x2000000);
        }
        if((v1 & 0x200) != 0) {
            v2 |= 0x30000000;
        }
        else if((0x70000000 & v) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x20000000 : 0x10000000);
        }
        if((0x5B6DB6DB & v2) != 306783378 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
            boolean z4 = true;
            boolean z5 = (v1 & 8) == 0 ? z : true;
            float f2 = (v1 & 16) == 0 ? f : 80.0f;
            Alignment alignment2 = (v1 & 0x20) == 0 ? alignment0 : Alignment.Companion.getTopCenter();
            PaddingValues paddingValues2 = (v1 & 0x40) == 0 ? paddingValues0 : PaddingKt.PaddingValues-0680j_4(0.0f);
            Function4 function42 = (v1 & 0x80) == 0 ? function40 : ComposableSingletons.SwipeRefreshKt.INSTANCE.getLambda-1$swiperefresh_release();
            if((v1 & 0x100) == 0) {
                z4 = z1;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2017402940, v2, -1, "com.google.accompanist.swiperefresh.SwipeRefresh (SwipeRefresh.kt:259)");
            }
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = q.h(0x2E20B340, composer1, 0xE2A708A4);
            Companion composer$Companion0 = Composer.Companion;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
                compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
            }
            composer1.endReplaceableGroup();
            CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
            composer1.endReplaceableGroup();
            State state0 = SnapshotStateKt.rememberUpdatedState(function00, composer1, v2 >> 3 & 14);
            Boolean boolean0 = Boolean.valueOf(swipeRefreshState0.isSwipeInProgress());
            composer1.startReplaceableGroup(0x44FAF204);
            boolean z6 = composer1.changed(swipeRefreshState0);
            i i0 = composer1.rememberedValue();
            if(z6 || i0 == composer$Companion0.getEmpty()) {
                i0 = new i(swipeRefreshState0, null);
                composer1.updateRememberedValue(i0);
            }
            composer1.endReplaceableGroup();
            EffectsKt.LaunchedEffect(boolean0, i0, composer1, 0x40);
            float f3 = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(f2);
            composer1.startReplaceableGroup(0x1E7B2B64);
            boolean z7 = composer1.changed(swipeRefreshState0);
            boolean z8 = composer1.changed(coroutineScope0);
            l l0 = composer1.rememberedValue();
            if(z7 || z8 || l0 == composer$Companion0.getEmpty()) {
                l0 = new l(swipeRefreshState0, coroutineScope0, new aa.l(state0, 24));
                composer1.updateRememberedValue(l0);
            }
            composer1.endReplaceableGroup();
            l0.d = z5;
            l0.e = f3;
            Modifier modifier3 = NestedScrollModifierKt.nestedScroll$default(modifier2, l0, null, 2, null);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = r0.a.i(alignment$Companion0, false, composer1, 0, -1323940314);
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.consume(CompositionLocalsKt.getLocalViewConfiguration());
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            Function3 function30 = LayoutKt.materializerOf(modifier3);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            composer1.disableReusing();
            modifier1 = modifier2;
            Updater.set-impl(composer1, measurePolicy0, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, density0, composeUiNode$Companion0.getSetDensity());
            Updater.set-impl(composer1, layoutDirection0, composeUiNode$Companion0.getSetLayoutDirection());
            Updater.set-impl(composer1, viewConfiguration0, composeUiNode$Companion0.getSetViewConfiguration());
            composer1.enableReusing();
            r0.a.w(0, function30, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            function20.invoke(composer1, ((int)(v2 >> 27 & 14)));
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier4 = z4 ? modifier$Companion0 : ClipKt.clipToBounds(modifier$Companion0);
            Modifier modifier5 = boxScopeInstance0.matchParentSize(PaddingKt.padding(modifier4, paddingValues2));
            if(z4) {
                modifier5 = ClipKt.clipToBounds(modifier5);
            }
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy1 = r0.a.i(alignment$Companion0, false, composer1, 0, -1323940314);
            Density density1 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection1 = (LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration1 = (ViewConfiguration)composer1.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 function02 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.materializerOf(modifier5);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function02);
            }
            else {
                composer1.useNode();
            }
            composer1.disableReusing();
            Updater.set-impl(composer1, measurePolicy1, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, density1, composeUiNode$Companion0.getSetDensity());
            Updater.set-impl(composer1, layoutDirection1, composeUiNode$Companion0.getSetLayoutDirection());
            Updater.set-impl(composer1, viewConfiguration1, composeUiNode$Companion0.getSetViewConfiguration());
            composer1.enableReusing();
            r0.a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            Modifier modifier6 = boxScopeInstance0.align(modifier$Companion0, alignment2);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy2 = r0.a.i(alignment$Companion0, false, composer1, 0, -1323940314);
            Density density2 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection)composer1.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration)composer1.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            Function3 function32 = LayoutKt.materializerOf(modifier6);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            composer1.disableReusing();
            Updater.set-impl(composer1, measurePolicy2, composeUiNode$Companion0.getSetMeasurePolicy());
            Updater.set-impl(composer1, density2, composeUiNode$Companion0.getSetDensity());
            Updater.set-impl(composer1, layoutDirection2, composeUiNode$Companion0.getSetLayoutDirection());
            Updater.set-impl(composer1, viewConfiguration2, composeUiNode$Companion0.getSetViewConfiguration());
            composer1.enableReusing();
            r0.a.w(0, function32, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function42.invoke(swipeRefreshState0, Dp.box-impl(f2), composer1, ((int)(v2 & 14 | v2 >> 9 & 0x70 | v2 >> 15 & 0x380)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function41 = function42;
            f1 = f2;
            alignment1 = alignment2;
            paddingValues1 = paddingValues2;
            z2 = z5;
            z3 = z4;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z;
            alignment1 = alignment0;
            paddingValues1 = paddingValues0;
            function41 = function40;
            z3 = z1;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(swipeRefreshState0, function00, modifier1, z2, f1, alignment1, paddingValues1, function41, z3, function20, v, v1));
        }
    }

    @Composable
    @Deprecated(message = "\n     accompanist/swiperefresh is deprecated.\n     The androidx.compose equivalent of rememberSwipeRefreshState() is rememberPullRefreshState().\n     For more migration information, please visit https://google.github.io/accompanist/swiperefresh/#migration\n    ", replaceWith = @ReplaceWith(expression = "rememberPullRefreshState(isRefreshing, onRefresh = )", imports = {"androidx.compose.material.pullrefresh.rememberPullRefreshState"}))
    @NotNull
    public static final SwipeRefreshState rememberSwipeRefreshState(boolean z, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0x8AFAD11D);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8AFAD11D, v, -1, "com.google.accompanist.swiperefresh.rememberSwipeRefreshState (SwipeRefresh.kt:72)");
        }
        composer0.startReplaceableGroup(0xE2A708A4);
        SwipeRefreshState swipeRefreshState0 = composer0.rememberedValue();
        if(swipeRefreshState0 == Composer.Companion.getEmpty()) {
            swipeRefreshState0 = new SwipeRefreshState(z);
            composer0.updateRememberedValue(swipeRefreshState0);
        }
        composer0.endReplaceableGroup();
        swipeRefreshState0.setRefreshing(z);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceableGroup();
        return swipeRefreshState0;
    }
}

