package com.kakao.tistory.presentation.view.statistics.viewholder;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import b;
import com.kakao.tistory.data.model.StatisticsItem.Title;
import com.kakao.tistory.data.model.viewtype.StatisticsViewType;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TColor;
import com.kakao.tistory.presentation.theme.TTextStyle;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStatisticsItemHeaderViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsItemHeaderViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsItemHeaderViewHolderKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,108:1\n85#2:109\n81#2,7:110\n88#2:145\n92#2:192\n78#3,6:117\n85#3,4:132\n89#3,2:142\n78#3,6:156\n85#3,4:171\n89#3,2:181\n93#3:187\n93#3:191\n368#4,9:123\n377#4:144\n368#4,9:162\n377#4:183\n378#4,2:185\n378#4,2:189\n4032#5,6:136\n4032#5,6:175\n148#6:146\n148#6:147\n148#6:148\n148#6:193\n148#6:194\n148#6:195\n98#7:149\n95#7,6:150\n101#7:184\n105#7:188\n*S KotlinDebug\n*F\n+ 1 StatisticsItemHeaderViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsItemHeaderViewHolderKt\n*L\n53#1:109\n53#1:110,7\n53#1:145\n53#1:192\n53#1:117,6\n53#1:132,4\n53#1:142,2\n63#1:156,6\n63#1:171,4\n63#1:181,2\n63#1:187\n53#1:191\n53#1:123,9\n53#1:144\n63#1:162,9\n63#1:183\n63#1:185,2\n53#1:189,2\n53#1:136,6\n63#1:175,6\n57#1:146\n61#1:147\n64#1:148\n83#1:193\n93#1:194\n103#1:195\n63#1:149\n63#1:150,6\n63#1:184\n63#1:188\n*E\n"})
public final class StatisticsItemHeaderViewHolderKt {
    public static final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1371708320);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1371708320, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsItemHeaderDescription (StatisticsItemHeaderViewHolder.kt:100)");
            }
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 3.0f, 7, null);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_statistics_referer_keyword_info, composer1, 0), modifier0, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, TTextStyle.INSTANCE.getSize12Weight300(), composer1, 0x30, 0x180C00, 0xDFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(v));
        }
    }

    public static final void a(Modifier modifier0, int v, Composer composer0, int v1, int v2) {
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0xF843BEDE);
        if((v2 & 1) != 0) {
            v3 = v1 | 6;
            modifier1 = modifier0;
        }
        else if((v1 & 14) == 0) {
            modifier1 = modifier0;
            v3 = (composer1.changed(modifier1) ? 4 : 2) | v1;
        }
        else {
            modifier1 = modifier0;
            v3 = v1;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v3 & 91) != 18 || !composer1.getSkipping()) {
            Modifier modifier2 = (v2 & 1) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF843BEDE, v3, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsItemHeaderTitle (StatisticsItemHeaderViewHolder.kt:80)");
            }
            Modifier modifier3 = PaddingKt.padding-qDBjuR0$default(modifier2, 0.0f, 0.0f, 0.0f, 4.0f, 7, null);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(v, composer1, v3 >> 3 & 14), modifier3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize16Weight600(), composer1, 0, 0x180000, 0xFFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(modifier1, v, v1, v2));
        }
    }

    public static final void a(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x68A69426);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x68A69426, v1, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsItemHeaderMoreText (StatisticsItemHeaderViewHolder.kt:89)");
            }
            Modifier modifier0 = ModifierKt.noRippleClickable(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 10.0f, 0.0f, 0.0f, 4.0f, 6, null), function00);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_see_all, composer1, 0), modifier0, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize14Weight400(), composer1, 0, 0x180000, 0xFFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(function00, v));
        }
    }

    public static final void access$StatisticsItemHeader(Title statisticsItem$Title0, EntryItem entryItem0, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xD2353FC9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD2353FC9, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsItemHeader (StatisticsItemHeaderViewHolder.kt:50)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Arrangement arrangement0 = Arrangement.INSTANCE;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier0 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
        androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
        Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
        SpacerKt.Spacer(BackgroundKt.background-bw27NRU$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 10.0f), TColor.INSTANCE.getGray100-0d7_KjU(), null, 2, null), composer1, 6);
        b.a(25.0f, modifier$Companion0, composer1, 6);
        Modifier modifier1 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 20.0f, 0.0f, 2, null);
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
        Function0 function02 = composeUiNode$Companion0.getConstructor();
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
        Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function21);
        }
        Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        Integer integer0 = statisticsItem$Title0.getTitleResourceId();
        composer1.startReplaceGroup(0x5F9D9504);
        if(integer0 != null) {
            StatisticsItemHeaderViewHolderKt.a(RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), integer0.intValue(), composer1, 0, 0);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(1604167000);
        if(statisticsItem$Title0.getHasSeeAll()) {
            StatisticsItemHeaderViewHolderKt.a(function00, composer1, v >> 6 & 14);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(1604170861);
        if(entryItem0 != null && statisticsItem$Title0.getChildViewType() == StatisticsViewType.REFERER_KEYWORD) {
            StatisticsItemHeaderViewHolderKt.a(composer1, 0);
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(statisticsItem$Title0, entryItem0, function00, v));
        }
    }
}

