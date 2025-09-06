package com.kakao.tistory.presentation.view.statistics.viewholder;

import a;
import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
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
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import b;
import c;
import com.kakao.tistory.data.model.StatisticsItem.RefererKeywordItem;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.dimen;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.viewmodel.StatisticsViewModel;
import com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.ButtonColors;
import com.kakao.tistory.presentation.widget.common.RoundButtonKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000E\u001A\u00020\f2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\t\u001A\u00020\b2\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000E\u0010\u000FJ5\u0010\u0010\u001A\u00020\f2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\t\u001A\u00020\b2\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0012\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001A\u00020\f2\b\b\u0001\u0010\u0015\u001A\u00020\u00142\b\b\u0001\u0010\u0016\u001A\u00020\u00142\u0006\u0010\u0018\u001A\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001AJ+\u0010\u001B\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00020\u00062\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u001B\u0010\u001C¨\u0006#²\u0006\u000E\u0010\u001E\u001A\u0004\u0018\u00010\u001D8\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u001F\u001A\u0004\u0018\u00010\u000B8\nX\u008A\u0084\u0002²\u0006\u000E\u0010 \u001A\u0004\u0018\u00010\u00178\nX\u008A\u0084\u0002²\u0006\u000E\u0010!\u001A\u0004\u0018\u00010\u00178\nX\u008A\u0084\u0002²\u0006\u000E\u0010\"\u001A\u0004\u0018\u00010\u00178\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsRefererKeywordViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Landroidx/compose/ui/platform/ComposeView;)V", "Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;", "refererKeywordItem", "Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel;", "statisticsViewModel", "Lkotlin/Function1;", "", "", "onClickKeyword", "setRefererKeyword", "(Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel;Lkotlin/jvm/functions/Function1;)V", "RefererKeyword", "(Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "RefererKeywordInfo", "(Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;Lcom/kakao/tistory/presentation/viewmodel/StatisticsViewModel;Landroidx/compose/runtime/Composer;I)V", "", "titleRes", "color", "", "count", "RefererTitleAndCount", "(IIJLandroidx/compose/runtime/Composer;I)V", "RefererKeywordButton", "(Lcom/kakao/tistory/data/model/StatisticsItem$RefererKeywordItem;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "entryItem", "selectedKeyword", "keywordInfoDaumCount", "keywordInfoNaverCount", "keywordInfoEtcCount", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStatisticsRefererKeywordViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsRefererKeywordViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsRefererKeywordViewHolder\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,193:1\n148#2:194\n148#2:195\n148#2:232\n148#2:274\n148#2:279\n148#2:316\n158#2:317\n148#2:322\n158#2:323\n85#3:196\n82#3,6:197\n88#3:231\n92#3:236\n78#4,6:203\n85#4,4:218\n89#4,2:228\n93#4:235\n78#4,6:245\n85#4,4:260\n89#4,2:270\n93#4:277\n78#4,6:287\n85#4,4:302\n89#4,2:312\n93#4:320\n368#5,9:209\n377#5:230\n378#5,2:233\n368#5,9:251\n377#5:272\n378#5,2:275\n368#5,9:293\n377#5:314\n378#5,2:318\n4032#6,6:222\n4032#6,6:264\n4032#6,6:306\n98#7:237\n94#7,7:238\n101#7:273\n105#7:278\n98#7:280\n95#7,6:281\n101#7:315\n105#7:321\n81#8:324\n81#8:325\n81#8:326\n81#8:327\n81#8:328\n*S KotlinDebug\n*F\n+ 1 StatisticsRefererKeywordViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsRefererKeywordViewHolder\n*L\n85#1:194\n87#1:195\n94#1:232\n117#1:274\n145#1:279\n153#1:316\n156#1:317\n170#1:322\n175#1:323\n82#1:196\n82#1:197,6\n82#1:231\n82#1:236\n82#1:203,6\n82#1:218,4\n82#1:228,2\n82#1:235\n116#1:245,6\n116#1:260,4\n116#1:270,2\n116#1:277\n143#1:287,6\n143#1:302,4\n143#1:312,2\n143#1:320\n82#1:209,9\n82#1:230\n82#1:233,2\n116#1:251,9\n116#1:272\n116#1:275,2\n143#1:293,9\n143#1:314\n143#1:318,2\n82#1:222,6\n116#1:264,6\n143#1:306,6\n116#1:237\n116#1:238,7\n116#1:273\n116#1:278\n143#1:280\n143#1:281,6\n143#1:315\n143#1:321\n62#1:324\n109#1:325\n110#1:326\n111#1:327\n112#1:328\n*E\n"})
public final class StatisticsRefererKeywordViewHolder extends ViewHolder {
    public static final int $stable;
    public final ComposeView a;

    static {
        StatisticsRefererKeywordViewHolder.$stable = ComposeView.$stable;
    }

    public StatisticsRefererKeywordViewHolder(@NotNull ComposeView composeView0) {
        Intrinsics.checkNotNullParameter(composeView0, "composeView");
        super(composeView0);
        this.a = composeView0;
        composeView0.setViewCompositionStrategy(DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void RefererKeyword(@Nullable RefererKeywordItem statisticsItem$RefererKeywordItem0, @NotNull StatisticsViewModel statisticsViewModel0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(statisticsViewModel0, "statisticsViewModel");
        Intrinsics.checkNotNullParameter(function10, "onClickKeyword");
        Composer composer1 = composer0.startRestartGroup(0x75EC443E);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x75EC443E, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererKeywordViewHolder.RefererKeyword (StatisticsRefererKeywordViewHolder.kt:57)");
        }
        if(statisticsItem$RefererKeywordItem0 == null) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new p(this, null, statisticsViewModel0, function10, v));
            }
            return;
        }
        State state0 = LiveDataAdapterKt.observeAsState(statisticsViewModel0.getEntryItem(), composer1, 8);
        float f = PrimitiveResources_androidKt.dimensionResource((statisticsItem$RefererKeywordItem0.isFirstItem() ? dimen.statistics_referer_keyword_first_item_padding_top : dimen.statistics_referer_keyword_item_padding_top), composer1, 0);
        float f1 = PrimitiveResources_androidKt.dimensionResource((statisticsItem$RefererKeywordItem0.isLastItem() ? dimen.statistics_referer_keyword_last_item_padding_bottom : dimen.statistics_referer_keyword_item_padding_bottom), composer1, 0);
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = ModifierKt.noRippleClickable(SizeKt.fillMaxWidth$default(PaddingKt.padding-qDBjuR0(modifier$Companion0, 20.0f, f, 20.0f, f1), 0.0f, 1, null), new q(function10, statisticsItem$RefererKeywordItem0));
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
        r0.a.z(composeUiNode$Companion0, composer1, modifier1, composer1, 0xD75DB52D);
        if(((EntryItem)state0.getValue()) == null && statisticsItem$RefererKeywordItem0.isFirstItem()) {
            b.a(2.0f, modifier$Companion0, composer1, 6);
        }
        composer1.endReplaceGroup();
        int v2 = v >> 3 & 0x380;
        this.RefererKeywordButton(statisticsItem$RefererKeywordItem0, function10, composer1, 8 | v >> 3 & 0x70 | ComposeView.$stable << 6 | v2);
        this.RefererKeywordInfo(statisticsItem$RefererKeywordItem0, statisticsViewModel0, composer1, v2 | (ComposeView.$stable << 6 | 72));
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new r(this, statisticsItem$RefererKeywordItem0, statisticsViewModel0, function10, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void RefererKeywordButton(@NotNull RefererKeywordItem statisticsItem$RefererKeywordItem0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(statisticsItem$RefererKeywordItem0, "refererKeywordItem");
        Intrinsics.checkNotNullParameter(function10, "onClickKeyword");
        Composer composer1 = composer0.startRestartGroup(-1402811963);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402811963, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererKeywordViewHolder.RefererKeywordButton (StatisticsRefererKeywordViewHolder.kt:167)");
        }
        PaddingValues paddingValues0 = PaddingKt.PaddingValues-YgX7TsA(15.0f, 6.0f);
        ButtonColors roundButtonDefaults$ButtonColors0 = new ButtonColors(0L, 0L, 0L, 0L, 0L, 0L, 60, null);
        BorderStroke borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(0.5f, 0L);
        RoundButtonKt.RoundButton(new s(function10, statisticsItem$RefererKeywordItem0), null, roundButtonDefaults$ButtonColors0, null, borderStroke0, null, false, null, paddingValues0, ComposableLambdaKt.rememberComposableLambda(0x9D5C4AA1, true, new t(statisticsItem$RefererKeywordItem0), composer1, 54), composer1, 0x36006180, 0xEA);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(this, statisticsItem$RefererKeywordItem0, function10, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void RefererKeywordInfo(@NotNull RefererKeywordItem statisticsItem$RefererKeywordItem0, @NotNull StatisticsViewModel statisticsViewModel0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(statisticsItem$RefererKeywordItem0, "refererKeywordItem");
        Intrinsics.checkNotNullParameter(statisticsViewModel0, "statisticsViewModel");
        Composer composer1 = composer0.startRestartGroup(0x9DD87839);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9DD87839, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererKeywordViewHolder.RefererKeywordInfo (StatisticsRefererKeywordViewHolder.kt:106)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(statisticsViewModel0.getSelectedKeyword(), composer1, 8);
        State state1 = LiveDataAdapterKt.observeAsState(statisticsViewModel0.getKeywordInfoDaumCount(), composer1, 8);
        State state2 = LiveDataAdapterKt.observeAsState(statisticsViewModel0.getKeywordInfoNaverCount(), composer1, 8);
        State state3 = LiveDataAdapterKt.observeAsState(statisticsViewModel0.getKeywordInfoEtcCount(), composer1, 8);
        if(Intrinsics.areEqual("", ((String)state0.getValue()))) {
            Companion modifier$Companion0 = Modifier.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer1, 0);
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
            c.a(5.0f, modifier$Companion0, composer1, 6);
            int v2 = string.label_Statistics_referer_keyword_daum;
            int v3 = color.color_0387f9;
            Long long0 = (Long)state1.getValue();
            int v4 = ComposeView.$stable << 9 | v << 3 & 0x1C00;
            this.RefererTitleAndCount(v2, v3, (long0 == null ? 0L : ((long)long0)), composer1, v4);
            int v5 = string.label_Statistics_referer_keyword_naver;
            int v6 = color.color_3ec728;
            Long long1 = (Long)state2.getValue();
            this.RefererTitleAndCount(v5, v6, (long1 == null ? 0L : ((long)long1)), composer1, v4);
            int v7 = string.label_Statistics_referer_keyword_etc;
            int v8 = color.gray5;
            Long long2 = (Long)state3.getValue();
            this.RefererTitleAndCount(v7, v8, (long2 == null ? 0L : ((long)long2)), composer1, v4);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new x(this, statisticsItem$RefererKeywordItem0, statisticsViewModel0, v));
            }
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new v(this, statisticsItem$RefererKeywordItem0, statisticsViewModel0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void RefererTitleAndCount(@StringRes int v, @ColorRes int v1, long v2, @Nullable Composer composer0, int v3) {
        Composer composer1 = composer0.startRestartGroup(0xE00F3B00);
        int v4 = (v3 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v3 : v3;
        if((v3 & 0x70) == 0) {
            v4 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v3 & 0x380) == 0) {
            v4 |= (composer1.changed(v2) ? 0x100 : 0x80);
        }
        if((v4 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE00F3B00, v4, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsRefererKeywordViewHolder.RefererTitleAndCount (StatisticsRefererKeywordViewHolder.kt:141)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 10.0f, 6.0f, 0.0f, 0.0f, 12, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
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
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(v, composer1, v4 & 14), null, ColorResources_androidKt.colorResource(v1, composer1, v4 >> 3 & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize13Weight400(), composer1, 0, 0x180000, 0xFFFA);
            c.a(4.0f, modifier$Companion0, composer1, 6);
            Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 2.5f, 0.0f, 0.0f, 13, null);
            TextKt.Text--4IGK_g(StringUtils.INSTANCE.getNumberFormat(v2), modifier2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize12Weight300(), composer1, 0x1B0, 0x180000, 0xFFF8);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(this, v, v1, v2, v3));
        }
    }

    public final void setRefererKeyword(@Nullable RefererKeywordItem statisticsItem$RefererKeywordItem0, @NotNull StatisticsViewModel statisticsViewModel0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(statisticsViewModel0, "statisticsViewModel");
        Intrinsics.checkNotNullParameter(function10, "onClickKeyword");
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0x7B5DF68, true, new a0(this, statisticsItem$RefererKeywordItem0, statisticsViewModel0, function10));
        this.a.setContent(composableLambda0);
    }
}

