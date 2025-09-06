package com.kakao.tistory.presentation.common.graph;

import a;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001AV\u0010\u0011\u001A\u00020\u00002\u0012\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\u0012\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0014²\u0006\u000E\u0010\u0013\u001A\u00020\u00128\n@\nX\u008A\u008E\u0002"}, d2 = {"", "StatisticsBarGraphPreview", "(Landroidx/compose/runtime/Composer;I)V", "", "Lcom/kakao/tistory/presentation/common/graph/BarGraphItem;", "Lcom/kakao/tistory/presentation/common/graph/StatisticsBarGraphValue;", "entryItemList", "", "selectedPosition", "Landroidx/compose/ui/graphics/Color;", "graphColor", "Landroidx/compose/foundation/lazy/LazyListState;", "listState", "Lkotlin/Function1;", "onClick", "StatisticsBarGraph-T042LqI", "(Ljava/util/List;IJLandroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "StatisticsBarGraph", "Landroidx/compose/ui/unit/Dp;", "graphMaxHeight", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStatisticsBarGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsBarGraph.kt\ncom/kakao/tistory/presentation/common/graph/StatisticsBarGraphKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,198:1\n1223#2,3:199\n1226#2,3:203\n148#3:202\n148#3:242\n148#3:243\n148#3:248\n77#4:206\n71#5:207\n69#5,5:208\n74#5:241\n78#5:247\n78#6,6:213\n85#6,4:228\n89#6,2:238\n93#6:246\n78#6,6:260\n85#6,4:275\n89#6,2:285\n93#6:292\n368#7,9:219\n377#7:240\n378#7,2:244\n368#7,9:266\n377#7:287\n378#7,2:290\n4032#8,6:232\n4032#8,6:279\n83#9:249\n83#9:250\n83#9:251\n50#9:252\n56#9:289\n85#10:253\n82#10,6:254\n88#10:288\n92#10:293\n81#11:294\n107#11,2:295\n*S KotlinDebug\n*F\n+ 1 StatisticsBarGraph.kt\ncom/kakao/tistory/presentation/common/graph/StatisticsBarGraphKt\n*L\n48#1:199,3\n48#1:203,3\n48#1:202\n57#1:242\n58#1:243\n118#1:248\n49#1:206\n51#1:207\n51#1:208,5\n51#1:241\n51#1:247\n51#1:213,6\n51#1:228,4\n51#1:238,2\n51#1:246\n133#1:260,6\n133#1:275,4\n133#1:285,2\n133#1:292\n51#1:219,9\n51#1:240\n51#1:244,2\n133#1:266,9\n133#1:287\n133#1:290,2\n51#1:232,6\n133#1:279,6\n124#1:249\n125#1:250\n126#1:251\n130#1:252\n143#1:289\n133#1:253\n133#1:254,6\n133#1:288\n133#1:293\n48#1:294\n48#1:295,2\n*E\n"})
public final class StatisticsBarGraphKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void StatisticsBarGraph-T042LqI(@NotNull List list0, int v, long v1, @Nullable LazyListState lazyListState0, @NotNull Function1 function10, @Nullable Composer composer0, int v2, int v3) {
        Float float0;
        int v5;
        LazyListState lazyListState1;
        Intrinsics.checkNotNullParameter(list0, "entryItemList");
        Intrinsics.checkNotNullParameter(function10, "onClick");
        Composer composer1 = composer0.startRestartGroup(0xB56AC995);
        long v4 = (v3 & 4) == 0 ? v1 : 0L;
        if((v3 & 8) == 0) {
            lazyListState1 = lazyListState0;
            v5 = v2;
        }
        else {
            lazyListState1 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
            v5 = v2 & 0xFFFFE3FF;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB56AC995, v5, -1, "com.kakao.tistory.presentation.common.graph.StatisticsBarGraph (StatisticsBarGraph.kt:42)");
        }
        Iterator iterator0 = list0.iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            float f;
            for(f = ((StatisticsBarGraphValue)((BarGraphItem)object0).getValue()).getEtcValue() + (((StatisticsBarGraphValue)((BarGraphItem)object0).getValue()).getSnsValue() + ((StatisticsBarGraphValue)((BarGraphItem)object0).getValue()).getSearchValue()); iterator0.hasNext(); f = Math.max(f, ((StatisticsBarGraphValue)((BarGraphItem)object1).getValue()).getEtcValue() + (((StatisticsBarGraphValue)((BarGraphItem)object1).getValue()).getSnsValue() + ((StatisticsBarGraphValue)((BarGraphItem)object1).getValue()).getSearchValue()))) {
                Object object1 = iterator0.next();
            }
            float0 = f;
        }
        else {
            float0 = null;
        }
        float f1 = float0 == null ? 0.0f : ((float)float0);
        composer1.startReplaceGroup(-920304172);
        MutableState mutableState0 = composer1.rememberedValue();
        if(mutableState0 == Composer.Companion.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Dp.box-impl(0.0f), null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceGroup();
        Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getBottomCenter(), false);
        int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
        Function0 function00 = composeUiNode$Companion0.getConstructor();
        if(composer1.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer1.startReusableNode();
        if(composer1.getInserting()) {
            composer1.createNode(function00);
        }
        else {
            composer1.useNode();
        }
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
            d.a(v6, composer1, v6, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        TistoryBarGraphKt.TistoryGraphBackgroundGraduation-ixp7dh8(((Dp)mutableState0.getValue()).unbox-impl(), 0.0f, composer1, 0, 2);
        LazyDslKt.LazyRow(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 210.0f), lazyListState1, PaddingKt.PaddingValues-YgX7TsA$default(20.0f, 0.0f, 2, null), true, null, null, null, false, new d0(list0, density0, f1, mutableState0, v, v4, function10), composer1, v5 >> 6 & 0x70 | 0xD86, 0xF0);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e0(list0, v, v4, lazyListState1, function10, v2, v3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(showBackground = true)
    public static final void StatisticsBarGraphPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xAE091E0D);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAE091E0D, v, -1, "com.kakao.tistory.presentation.common.graph.StatisticsBarGraphPreview (StatisticsBarGraph.kt:26)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.StatisticsBarGraphKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n0(v));
        }
    }

    public static final void a(float f, Function3 function30, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2057168240);
        int v1 = (v & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2057168240, v1, -1, "com.kakao.tistory.presentation.common.graph.ifNotZero (StatisticsBarGraph.kt:195)");
            }
            if(f != 0.0f) {
                function30.invoke(f, composer1, ((int)(v1 & 0x7E)));
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o0(f, function30, v));
        }
    }

    public static final void access$BarGraphUnit-XO-JAsU(ColumnScope columnScope0, float f, long v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(734410377);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(columnScope0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(734410377, v2, -1, "com.kakao.tistory.presentation.common.graph.BarGraphUnit (StatisticsBarGraph.kt:185)");
            }
            BoxKt.Box(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScope0, BackgroundKt.background-bw27NRU$default(Modifier.Companion, v, null, 2, null), f, false, 2, null), 0.0f, 1, null), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v(columnScope0, f, v, v1));
        }
    }

    public static final void access$StatisticsBarGraph-FJfuzF0(Modifier modifier0, boolean z, StatisticsBarGraphValue statisticsBarGraphValue0, float f, float f1, Composer composer0, int v, int v1) {
        boolean z2;
        boolean z1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x90EECD93);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            modifier1 = modifier0;
        }
        else if((v & 14) == 0) {
            modifier1 = modifier0;
            v2 = (composer1.changed(modifier1) ? 4 : 2) | v;
        }
        else {
            modifier1 = modifier0;
            v2 = v;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            z1 = z;
        }
        else if((v & 0x70) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x20 : 16);
        }
        else {
            z1 = z;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(statisticsBarGraphValue0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(f) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier1 : Modifier.Companion;
            if((v1 & 2) != 0) {
                z1 = false;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x90EECD93, v2, -1, "com.kakao.tistory.presentation.common.graph.StatisticsBarGraph (StatisticsBarGraph.kt:115)");
            }
            float f2 = TistoryBarGraphKt.ifNaN(statisticsBarGraphValue0.getSearchValue() / f, l0.a);
            float f3 = TistoryBarGraphKt.ifNaN(statisticsBarGraphValue0.getSnsValue() / f, m0.a);
            float f4 = TistoryBarGraphKt.ifNaN(statisticsBarGraphValue0.getEtcValue() / f, k0.a);
            Modifier modifier3 = SizeKt.fillMaxHeight$default(SizeKt.width-3ABfNKs(modifier2, (z1 ? 16.0f : 8.0f)), 0.0f, 1, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(AnimationModifierKt.animateContentSize$default(Modifier.Companion, null, null, 3, null), 0.0f, 1, null), f1 - TistoryBarGraphKt.maxOrZero-YgX7TsA(f1 * f2 + f1 * f3 + f1 * f4, (z1 ? 16.0f : 8.0f))), composer1, 0);
            StatisticsBarGraphKt.a(f2 + f3 + f4, ComposableLambdaKt.rememberComposableLambda(0xB7106F64, true, new i0(ColumnScopeInstance.INSTANCE, f4, f3, f2, (z1 ? 1.0f : 0.75f)), composer1, 54), composer1, 0x30);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z1;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            z2 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j0(modifier1, z2, statisticsBarGraphValue0, f, f1, v, v1));
        }
    }

    public static final float access$StatisticsBarGraph_T042LqI$lambda$2(MutableState mutableState0) {
        return ((Dp)mutableState0.getValue()).unbox-impl();
    }

    public static final void access$StatisticsBarGraph_T042LqI$lambda$3(MutableState mutableState0, float f) {
        mutableState0.setValue(Dp.box-impl(f));
    }
}

