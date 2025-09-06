package com.kakao.tistory.presentation.screen.revenue;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import com.kakao.tistory.presentation.common.graph.RevenueTwinBarGraphKt;
import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.screen.revenue.item.GraphDetailInfoUiState;
import com.kakao.tistory.presentation.screen.revenue.item.RevenueSummaryUiState;
import com.kakao.tistory.presentation.screen.revenue.ui.GraphPeriodType;
import com.kakao.tistory.presentation.screen.revenue.ui.PeriodStatisticsTableKt;
import com.kakao.tistory.presentation.screen.revenue.ui.RevenueBoardKt;
import com.kakao.tistory.presentation.screen.revenue.ui.RevenueViewKt;
import d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u009A\u0001\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0018\u0010\u0006\u001A\u0014\u0012\u0010\u0012\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00072\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u00102\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u001223\u0010\u0013\u001A/\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u00010\u0014H\u0007¢\u0006\u0002\u0010\u001A¨\u0006\u001B"}, d2 = {"AdRevenueScreen", "", "currentVendor", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "revenueSummary", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;", "revenueTrendGraph", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/kakao/tistory/presentation/common/graph/BarGraphItem;", "Lcom/kakao/tistory/presentation/common/graph/TweenBarGraphValue;", "revenueGraphDetailInfo", "Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "selectedGraphPosition", "", "selectedPeriodType", "Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "onClickGraphPeriodType", "Lkotlin/Function1;", "onClickGraphItem", "Lkotlin/Function4;", "", "Lkotlin/ParameterName;", "name", "vendor", "Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;", "(Lcom/kakao/tistory/presentation/screen/item/Vendor;Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;Lkotlinx/coroutines/flow/Flow;Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;ILcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAdRevenueScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdRevenueScreen.kt\ncom/kakao/tistory/presentation/screen/revenue/AdRevenueScreenKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,108:1\n488#2:109\n487#2,4:110\n491#2,2:117\n495#2:123\n1223#3,3:114\n1226#3,3:120\n1223#3,6:163\n487#4:119\n85#5:124\n82#5,6:125\n88#5:159\n92#5:174\n78#6,6:131\n85#6,4:146\n89#6,2:156\n93#6:173\n368#7,9:137\n377#7:158\n378#7,2:171\n4032#8,6:150\n77#9:160\n148#10:161\n148#10:162\n148#10:169\n148#10:170\n*S KotlinDebug\n*F\n+ 1 AdRevenueScreen.kt\ncom/kakao/tistory/presentation/screen/revenue/AdRevenueScreenKt\n*L\n48#1:109\n48#1:110,4\n48#1:117,2\n48#1:123\n48#1:114,3\n48#1:120,3\n96#1:163,6\n48#1:119\n61#1:124\n61#1:125,6\n61#1:159\n61#1:174\n61#1:131,6\n61#1:146,4\n61#1:156,2\n61#1:173\n61#1:137,9\n61#1:158\n61#1:171,2\n61#1:150,6\n68#1:160\n71#1:161\n76#1:162\n100#1:169\n103#1:170\n*E\n"})
public final class AdRevenueScreenKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Vendor.values().length];
            try {
                arr_v[Vendor.ADSENSE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Vendor.ADFIT.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Vendor.DABLE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Vendor.TENPING.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void AdRevenueScreen(@Nullable Vendor vendor0, @NotNull RevenueSummaryUiState revenueSummaryUiState0, @NotNull Flow flow0, @NotNull GraphDetailInfoUiState graphDetailInfoUiState0, int v, @NotNull GraphPeriodType graphPeriodType0, @NotNull Function1 function10, @NotNull Function4 function40, @Nullable Composer composer0, int v1) {
        Pair pair0;
        Intrinsics.checkNotNullParameter(revenueSummaryUiState0, "revenueSummary");
        Intrinsics.checkNotNullParameter(flow0, "revenueTrendGraph");
        Intrinsics.checkNotNullParameter(graphDetailInfoUiState0, "revenueGraphDetailInfo");
        Intrinsics.checkNotNullParameter(graphPeriodType0, "selectedPeriodType");
        Intrinsics.checkNotNullParameter(function10, "onClickGraphPeriodType");
        Intrinsics.checkNotNullParameter(function40, "onClickGraphItem");
        Composer composer1 = composer0.startRestartGroup(0x89C5635A);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x89C5635A, v1, -1, "com.kakao.tistory.presentation.screen.revenue.AdRevenueScreen (AdRevenueScreen.kt:40)");
        }
        if(vendor0 == null) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new a(null, revenueSummaryUiState0, flow0, graphDetailInfoUiState0, v, graphPeriodType0, function10, function40, v1));
            }
            return;
        }
        ScrollState scrollState0 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
        LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = androidx.room.a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
        }
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        LazyPagingItems lazyPagingItems0 = LazyPagingItemsKt.collectAsLazyPagingItems(flow0, null, composer1, 8, 1);
        int v2 = WhenMappings.$EnumSwitchMapping$0[vendor0.ordinal()];
        switch(v2) {
            case 1: {
                pair0 = new Pair(Color.box-impl(0L), Color.box-impl(0L));
                break;
            }
            case 2: {
                pair0 = new Pair(Color.box-impl(0L), Color.box-impl(0L));
                break;
            }
            case 3: {
                pair0 = new Pair(Color.box-impl(0L), Color.box-impl(0L));
                break;
            }
            default: {
                if(v2 != 4) {
                    if(ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
                    if(scopeUpdateScope1 != null) {
                        scopeUpdateScope1.updateScope(new b(vendor0, revenueSummaryUiState0, flow0, graphDetailInfoUiState0, v, graphPeriodType0, function10, function40, v1));
                    }
                    return;
                }
                pair0 = new Pair(Color.box-impl(0L), Color.box-impl(0L));
            }
        }
        long v3 = ((Color)pair0.component1()).unbox-impl();
        long v4 = ((Color)pair0.component2()).unbox-impl();
        String s = StringResources_androidKt.stringResource(vendor0.getTitle(), composer1, 0);
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = ScrollKt.verticalScroll$default(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), 0L, null, 2, null), scrollState0, false, null, false, 14, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
        int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
            d.a(v5, composer1, v5, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        Context context0 = (Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        RevenueBoardKt.RevenueBoard(PaddingKt.padding-VpY3zN4(modifier$Companion0, 20.0f, 18.0f), revenueSummaryUiState0, composer1, v1 & 0x70 | 6, 0);
        RevenueViewKt.GraphPeriodTabBar(PaddingKt.padding-VpY3zN4(modifier$Companion0, 20.0f, 18.0f), graphPeriodType0, new com.kakao.tistory.presentation.screen.revenue.d(context0, coroutineScope0, function10, lazyListState0), composer1, v1 >> 12 & 0x70 | 6, 0);
        composer1.startReplaceGroup(0xE69D7191);
        boolean z = (0x1C00000 & v1 ^ 0xC00000) > 0x800000 && composer1.changed(function40) || (v1 & 0xC00000) == 0x800000;
        boolean z1 = composer1.changed(s);
        int v6 = ((0x70000 & v1 ^ 0x30000) <= 0x20000 || !composer1.changed(graphPeriodType0)) && (v1 & 0x30000) != 0x20000 ? 0 : 1;
        e e0 = composer1.rememberedValue();
        if((z | z1 | v6) != 0 || e0 == composer$Companion0.getEmpty()) {
            e0 = new e(function40, s, graphPeriodType0);
            composer1.updateRememberedValue(e0);
        }
        composer1.endReplaceGroup();
        RevenueTwinBarGraphKt.RevenueTwinBarGraph-jA1GFJw(lazyListState0, lazyPagingItems0, v, v3, v4, e0, composer1, LazyPagingItems.$stable << 3 | v1 >> 6 & 0x380);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 10.0f), composer1, 6);
        PeriodStatisticsTableKt.PeriodStatisticsTable-FNF3uiM(PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 20.0f, 0.0f, 2, null), graphDetailInfoUiState0, v3, composer1, v1 >> 6 & 0x70 | 6, 0);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope2 = composer1.endRestartGroup();
        if(scopeUpdateScope2 != null) {
            scopeUpdateScope2.updateScope(new f(vendor0, revenueSummaryUiState0, flow0, graphDetailInfoUiState0, v, graphPeriodType0, function10, function40, v1));
        }
    }
}

