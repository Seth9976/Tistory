package com.kakao.tistory.presentation.view.statistics.viewholder;

import a;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import b;
import c;
import com.kakao.tistory.data.model.StatisticsItem.Trend;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.graph.StatisticsBarGraphKt;
import com.kakao.tistory.presentation.common.utils.DateUtils;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel.StatisticsMetricSortType;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import d;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001F\u0010\u000B\u001A\u00020\n2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\u000B\u0010\fJ!\u0010\r\u001A\u00020\n2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\t\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\r\u0010\u000EJ!\u0010\u000F\u001A\u00020\n2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\t\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\u000F\u0010\u000EJ\u0019\u0010\u0010\u001A\u00020\n2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006H\u0007\u00A2\u0006\u0004\b\u0010\u0010\u0011J\'\u0010\u0016\u001A\u00020\n2\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\t\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001A\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\u001A\u0010\u0019J\u0017\u0010\u001B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\u001B\u0010\u0019\u00A8\u0006(\u00B2\u0006\u000E\u0010\u0013\u001A\u0004\u0018\u00010\u00128\nX\u008A\u0084\u0002\u00B2\u0006\u000E\u0010\u0015\u001A\u0004\u0018\u00010\u00128\nX\u008A\u0084\u0002\u00B2\u0006\u000E\u0010\u001D\u001A\u0004\u0018\u00010\u001C8\nX\u008A\u0084\u0002\u00B2\u0006\u000E\u0010\u001E\u001A\u0004\u0018\u00010\u00128\nX\u008A\u0084\u0002\u00B2\u0006\u000E\u0010\u001F\u001A\u0004\u0018\u00010\u00128\nX\u008A\u0084\u0002\u00B2\u0006\u000E\u0010 \u001A\u0004\u0018\u00010\u001C8\nX\u008A\u0084\u0002\u00B2\u0006\f\u0010\"\u001A\u00020!8\nX\u008A\u0084\u0002\u00B2\u0006\u000E\u0010$\u001A\u0004\u0018\u00010#8\nX\u008A\u0084\u0002\u00B2\u0006\u0014\u0010\'\u001A\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsTrendViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Landroidx/compose/ui/platform/ComposeView;)V", "Lcom/kakao/tistory/data/model/StatisticsItem$Trend;", "trend", "Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel;", "statisticsViewModel", "", "setStatisticsTrend", "(Lcom/kakao/tistory/data/model/StatisticsItem$Trend;Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel;)V", "StatisticsTrend", "(Lcom/kakao/tistory/data/model/StatisticsItem$Trend;Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel;Landroidx/compose/runtime/Composer;I)V", "StatisticsTrendVisitInfo", "StatisticsTrendLastUpdateTime", "(Lcom/kakao/tistory/data/model/StatisticsItem$Trend;Landroidx/compose/runtime/Composer;I)V", "", "visitorTitle", "Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel$StatisticsMetricSortType;", "metric", "StatisticsTrendVisitCount", "(Ljava/lang/String;Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel$StatisticsMetricSortType;Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel;Landroidx/compose/runtime/Composer;I)V", "StatisticsTrendCountContainer", "(Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel;Landroidx/compose/runtime/Composer;I)V", "StatisticsTrendIncreaseCount", "StatisticsTrendGraph", "", "totalCount", "lastUpdateTime", "visitorCount", "increaseCount", "", "selectedGraphPosition", "", "isLoading", "", "Lcom/kakao/tistory/domain/entity/TrendItem;", "itemList", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStatisticsTrendViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsTrendViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsTrendViewHolder\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,288:1\n148#2:289\n148#2:326\n148#2:327\n148#2:332\n148#2:369\n148#2:374\n148#2:375\n148#2:449\n148#2:495\n148#2:496\n148#2:501\n148#2:538\n148#2:539\n85#3:290\n82#3,6:291\n88#3:325\n92#3:331\n85#3:376\n82#3,6:377\n88#3:411\n92#3:457\n78#4,6:297\n85#4,4:312\n89#4,2:322\n93#4:330\n78#4,6:340\n85#4,4:355\n89#4,2:365\n93#4:372\n78#4,6:383\n85#4,4:398\n89#4,2:408\n78#4,6:420\n85#4,4:435\n89#4,2:445\n93#4:452\n93#4:456\n78#4,6:466\n85#4,4:481\n89#4,2:491\n93#4:499\n78#4,6:509\n85#4,4:524\n89#4,2:534\n93#4:543\n368#5,9:303\n377#5:324\n378#5,2:328\n368#5,9:346\n377#5:367\n378#5,2:370\n368#5,9:389\n377#5:410\n368#5,9:426\n377#5:447\n378#5,2:450\n378#5,2:454\n368#5,9:472\n377#5:493\n378#5,2:497\n368#5,9:515\n377#5:536\n378#5,2:541\n4032#6,6:316\n4032#6,6:359\n4032#6,6:402\n4032#6,6:439\n4032#6,6:485\n4032#6,6:528\n98#7:333\n95#7,6:334\n101#7:368\n105#7:373\n98#7:412\n94#7,7:413\n101#7:448\n105#7:453\n98#7:458\n94#7,7:459\n101#7:494\n105#7:500\n98#7:502\n95#7,6:503\n101#7:537\n105#7:544\n1#8:540\n1223#9,6:545\n81#10:551\n81#10:552\n81#10:553\n81#10:554\n81#10:555\n81#10:556\n81#10:557\n81#10:558\n81#10:559\n*S KotlinDebug\n*F\n+ 1 StatisticsTrendViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsTrendViewHolder\n*L\n65#1:289\n69#1:326\n77#1:327\n95#1:332\n104#1:369\n132#1:374\n159#1:375\n168#1:449\n190#1:495\n196#1:496\n215#1:501\n220#1:538\n225#1:539\n64#1:290\n64#1:291,6\n64#1:325\n64#1:331\n159#1:376\n159#1:377,6\n159#1:411\n159#1:457\n64#1:297,6\n64#1:312,4\n64#1:322,2\n64#1:330\n94#1:340,6\n94#1:355,4\n94#1:365,2\n94#1:372\n159#1:383,6\n159#1:398,4\n159#1:408,2\n160#1:420,6\n160#1:435,4\n160#1:445,2\n160#1:452\n159#1:456\n186#1:466,6\n186#1:481,4\n186#1:491,2\n186#1:499\n214#1:509,6\n214#1:524,4\n214#1:534,2\n214#1:543\n64#1:303,9\n64#1:324\n64#1:328,2\n94#1:346,9\n94#1:367\n94#1:370,2\n159#1:389,9\n159#1:410\n160#1:426,9\n160#1:447\n160#1:450,2\n159#1:454,2\n186#1:472,9\n186#1:493\n186#1:497,2\n214#1:515,9\n214#1:536\n214#1:541,2\n64#1:316,6\n94#1:359,6\n159#1:402,6\n160#1:439,6\n186#1:485,6\n214#1:528,6\n94#1:333\n94#1:334,6\n94#1:368\n94#1:373\n160#1:412\n160#1:413,7\n160#1:448\n160#1:453\n186#1:458\n186#1:459,7\n186#1:494\n186#1:500\n214#1:502\n214#1:503,6\n214#1:537\n214#1:544\n254#1:545,6\n61#1:551\n62#1:552\n91#1:553\n92#1:554\n184#1:555\n205#1:556\n241#1:557\n242#1:558\n245#1:559\n*E\n"})
public final class StatisticsTrendViewHolder extends ViewHolder {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[StatisticsMetricSortType.values().length];
            try {
                arr_v[StatisticsMetricSortType.VIEW.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[StatisticsMetricSortType.VISIT.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    public final ComposeView a;

    static {
        StatisticsTrendViewHolder.$stable = ComposeView.$stable;
    }

    public StatisticsTrendViewHolder(@NotNull ComposeView composeView0) {
        Intrinsics.checkNotNullParameter(composeView0, "composeView");
        super(composeView0);
        this.a = composeView0;
        composeView0.setViewCompositionStrategy(DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void StatisticsTrend(@Nullable Trend statisticsItem$Trend0, @NotNull StatisticsViewModel statisticsViewModel0, @Nullable Composer composer0, int v) {
        StatisticsMetricSortType statisticsViewModel$StatisticsMetricSortType0;
        Intrinsics.checkNotNullParameter(statisticsViewModel0, "statisticsViewModel");
        Composer composer1 = composer0.startRestartGroup(0xDA911D);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDA911D, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTrendViewHolder.StatisticsTrend (StatisticsTrendViewHolder.kt:58)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(statisticsViewModel0.getVisitorTitle(), composer1, 8);
        State state1 = LiveDataAdapterKt.observeAsState(statisticsViewModel0.getMetric(), composer1, 8);
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 0.0f, 26.0f, 7, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        this.StatisticsTrendGraph(statisticsViewModel0, composer1, 8 | ComposeView.$stable << 3 | v >> 3 & 0x70);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 21.0f), composer1, 6);
        String s = (String)state0.getValue();
        if(s == null) {
            s = "";
        }
        String s1 = (String)state1.getValue();
        if(s1 == null) {
            statisticsViewModel$StatisticsMetricSortType0 = StatisticsMetricSortType.VISIT;
        }
        else {
            statisticsViewModel$StatisticsMetricSortType0 = StatisticsMetricSortType.Companion.valueOfName(s1);
            if(statisticsViewModel$StatisticsMetricSortType0 == null) {
                statisticsViewModel$StatisticsMetricSortType0 = StatisticsMetricSortType.VISIT;
            }
        }
        this.StatisticsTrendVisitCount(s, statisticsViewModel$StatisticsMetricSortType0, statisticsViewModel0, composer1, 0x1200 | v << 3 & 0x1C00);
        b.a(7.0f, modifier$Companion0, composer1, 6);
        this.StatisticsTrendVisitInfo(statisticsItem$Trend0, statisticsViewModel0, composer1, 584 | v & 0x380);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s0(this, statisticsItem$Trend0, statisticsViewModel0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void StatisticsTrendCountContainer(@NotNull StatisticsViewModel statisticsViewModel0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(statisticsViewModel0, "statisticsViewModel");
        Composer composer1 = composer0.startRestartGroup(0x6EBF81BC);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6EBF81BC, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTrendViewHolder.StatisticsTrendCountContainer (StatisticsTrendViewHolder.kt:182)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(statisticsViewModel0.getVisitorCount(), composer1, 8);
        Companion modifier$Companion0 = Modifier.Companion;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer1, 0x30);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
        Modifier modifier1 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 0.0f, 0.0f, 13, null);
        String s = (String)state0.getValue();
        if(s == null) {
            s = "-";
        }
        TextKt.Text--4IGK_g(s, modifier1, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize32Weight700(), composer1, 0x1B0, 0x180000, 0xFFF8);
        c.a(3.0f, modifier$Companion0, composer1, 6);
        this.StatisticsTrendIncreaseCount(statisticsViewModel0, composer1, ComposeView.$stable << 3 | 8 | v & 0x70);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t0(this, statisticsViewModel0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void StatisticsTrendGraph(@NotNull StatisticsViewModel statisticsViewModel0, @Nullable Composer composer0, int v) {
        List list1;
        Intrinsics.checkNotNullParameter(statisticsViewModel0, "statisticsViewModel");
        Composer composer1 = composer0.startRestartGroup(-1860791176);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1860791176, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTrendViewHolder.StatisticsTrendGraph (StatisticsTrendViewHolder.kt:238)");
        }
        State state0 = SnapshotStateKt.collectAsState(statisticsViewModel0.getSelectedGraphPosition(), null, composer1, 8, 1);
        State state1 = LiveDataAdapterKt.observeAsState(statisticsViewModel0.isShowFooter(), composer1, 8);
        LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
        State state2 = LiveDataAdapterKt.observeAsState(statisticsViewModel0.getTrendItems(), composer1, 8);
        EffectsKt.LaunchedEffect(statisticsViewModel0.getScrollToPositionEvent(), new v0(statisticsViewModel0, lazyListState0, null), composer1, 72);
        composer1.startReplaceGroup(0xCD80BA88);
        State state3 = composer1.rememberedValue();
        if(state3 == Composer.Companion.getEmpty()) {
            state3 = SnapshotStateKt.derivedStateOf(new y0(lazyListState0, state2));
            composer1.updateRememberedValue(state3);
        }
        composer1.endReplaceGroup();
        if(((Boolean)state3.getValue()).booleanValue() && (Intrinsics.areEqual(((Boolean)state1.getValue()), Boolean.FALSE) || ((Boolean)state1.getValue()) == null)) {
            statisticsViewModel0.getTrendMore();
        }
        List list0 = (List)state2.getValue();
        if(list0 == null) {
            list1 = CollectionsKt__CollectionsKt.emptyList();
        }
        else {
            list1 = StatisticsTrendViewHolderKt.access$toBarGraphItem(list0, statisticsViewModel0);
            if(list1 == null) {
                list1 = CollectionsKt__CollectionsKt.emptyList();
            }
        }
        StatisticsBarGraphKt.StatisticsBarGraph-T042LqI(list1, ((Number)state0.getValue()).intValue(), 0L, lazyListState0, new w0(statisticsViewModel0), composer1, 8, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x0(this, statisticsViewModel0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void StatisticsTrendIncreaseCount(@NotNull StatisticsViewModel statisticsViewModel0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(statisticsViewModel0, "statisticsViewModel");
        Composer composer1 = composer0.startRestartGroup(0xA5CFFEB9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA5CFFEB9, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTrendViewHolder.StatisticsTrendIncreaseCount (StatisticsTrendViewHolder.kt:202)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(statisticsViewModel0.getIncreaseCount(), composer1, 8);
        Long long0 = (Long)state0.getValue();
        if(long0 == null || ((long)long0) != 0L) {
            Long long1 = (Long)state0.getValue();
            Pair pair0 = (long1 == null ? 0L : ((long)long1)) <= 0L ? TuplesKt.to(drawable.ic_statistics_down, color.color_325cd2) : TuplesKt.to(drawable.ic_statistics_up, color.point1);
            int v1 = ((Number)pair0.component1()).intValue();
            int v2 = ((Number)pair0.component2()).intValue();
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 3.0f, 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Modifier modifier2 = SizeKt.size-VpY3zN4(modifier$Companion0, 6.0f, 4.0f);
            ImageKt.Image(PainterResources_androidKt.painterResource(v1, composer1, 0), null, modifier2, null, null, 0.0f, null, composer1, 440, 120);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 2.0f), composer1, 6);
            Long long2 = (Long)state0.getValue();
            TextKt.Text--4IGK_g(StringUtils.INSTANCE.getNumberFormat(((long)(long2 == null ? 0L : Math.abs(long2.longValue())))), null, ColorResources_androidKt.colorResource(v2, composer1, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize12Weight700(), composer1, 0, 0x180000, 0xFFFA);
            composer1.endNode();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z0(this, statisticsViewModel0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void StatisticsTrendLastUpdateTime(@Nullable Trend statisticsItem$Trend0, @Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xC30F2A46);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC30F2A46, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTrendViewHolder.StatisticsTrendLastUpdateTime (StatisticsTrendViewHolder.kt:120)");
        }
        String s = statisticsItem$Trend0 == null ? null : statisticsItem$Trend0.getLastUpdateTime();
        if(s != null) {
            TextKt.Text--4IGK_g(DateUtils.INSTANCE.getDateTimeFormatFromISO8601(s, "M. d. HH:mm"), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize13Weight400(), composer1, 0x180, 0x180000, 0xFFFA);
            c.a(4.0f, Modifier.Companion, composer1, 6);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_criteria, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize13Weight400(), composer1, 0x180, 0x180000, 0xFFFA);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a1(this, statisticsItem$Trend0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void StatisticsTrendVisitCount(@NotNull String s, @NotNull StatisticsMetricSortType statisticsViewModel$StatisticsMetricSortType0, @NotNull StatisticsViewModel statisticsViewModel0, @Nullable Composer composer0, int v) {
        Pair pair0;
        Intrinsics.checkNotNullParameter(s, "visitorTitle");
        Intrinsics.checkNotNullParameter(statisticsViewModel$StatisticsMetricSortType0, "metric");
        Intrinsics.checkNotNullParameter(statisticsViewModel0, "statisticsViewModel");
        Composer composer1 = composer0.startRestartGroup(0x2D96C790);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2D96C790, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTrendViewHolder.StatisticsTrendVisitCount (StatisticsTrendViewHolder.kt:146)");
        }
        switch(WhenMappings.$EnumSwitchMapping$0[statisticsViewModel$StatisticsMetricSortType0.ordinal()]) {
            case 1: {
                pair0 = TuplesKt.to(string.label_home_statistics_today_view_count, string.label_Statistics_trend_info_view_title);
                break;
            }
            case 2: {
                pair0 = TuplesKt.to(string.label_home_statistics_today_visitor_count, string.label_Statistics_trend_info_visitor_title);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        int v1 = ((Number)pair0.component1()).intValue();
        int v2 = ((Number)pair0.component2()).intValue();
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 20.0f, 0.0f, 2, null);
        Arrangement arrangement0 = Arrangement.INSTANCE;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
            d.a(v3, composer1, v3, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
        Function0 function01 = composeUiNode$Companion0.getConstructor();
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
        Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
            d.a(v4, composer1, v4, function21);
        }
        r0.a.z(composeUiNode$Companion0, composer1, modifier2, composer1, 973478020);
        if(s.length() > 0) {
            TextKt.Text--4IGK_g(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize13Weight300(), composer1, v & 14 | 0x180, 0x180000, 0xFFFA);
            c.a(3.0f, modifier$Companion0, composer1, 6);
        }
        composer1.endReplaceGroup();
        if(s.length() == 0) {
            v2 = v1;
        }
        TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(v2, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize13Weight400(), composer1, 0x180, 0x180000, 0xFFFA);
        composer1.endNode();
        this.StatisticsTrendCountContainer(statisticsViewModel0, composer1, ComposeView.$stable << 3 | 8 | v >> 6 & 0x70);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b1(this, s, statisticsViewModel$StatisticsMetricSortType0, statisticsViewModel0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void StatisticsTrendVisitInfo(@Nullable Trend statisticsItem$Trend0, @NotNull StatisticsViewModel statisticsViewModel0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(statisticsViewModel0, "statisticsViewModel");
        Composer composer1 = composer0.startRestartGroup(899953308);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(899953308, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTrendViewHolder.StatisticsTrendVisitInfo (StatisticsTrendViewHolder.kt:89)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(statisticsViewModel0.getTotalCount(), composer1, 8);
        State state1 = LiveDataAdapterKt.observeAsState(statisticsViewModel0.getLastUpdateTime(), composer1, 8);
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 20.0f, 0.0f, 2, null);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_statistics_accumulation, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize13Weight400(), composer1, 0x180, 0x180000, 0xFFFA);
        SpacerKt.Spacer(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 4.0f, 0.0f, 0.0f, 0.0f, 14, null), composer1, 6);
        Long long0 = (Long)state0.getValue();
        TextKt.Text--4IGK_g(StringUtils.INSTANCE.getNumberFormat(((long)(long0 == null ? 0L : ((long)long0)))), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize13Weight700(), composer1, 0x180, 0x180000, 0xFFFA);
        SpacerKt.Spacer(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        composer1.startReplaceGroup(2010619196);
        String s = (String)state1.getValue();
        if(s != null && s.length() > 0) {
            this.StatisticsTrendLastUpdateTime(statisticsItem$Trend0, composer1, ComposeView.$stable << 3 | 8 | v >> 3 & 0x70);
        }
        if(m.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c1(this, statisticsItem$Trend0, statisticsViewModel0, v));
        }
    }

    public static final List access$StatisticsTrendGraph$lambda$16(State state0) {
        return (List)state0.getValue();
    }

    public final void setStatisticsTrend(@Nullable Trend statisticsItem$Trend0, @NotNull StatisticsViewModel statisticsViewModel0) {
        Intrinsics.checkNotNullParameter(statisticsViewModel0, "statisticsViewModel");
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xD7AE1E47, true, new e1(this, statisticsItem$Trend0, statisticsViewModel0));
        this.a.setContent(composableLambda0);
    }
}

