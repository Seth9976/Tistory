package com.kakao.tistory.presentation.view.statistics.viewholder;

import a;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import c;
import com.kakao.tistory.data.model.StatisticsItem.RefererRankItem;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.ButtonColors;
import com.kakao.tistory.presentation.widget.common.RoundButtonKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStatisticsRefererRankViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsRefererRankViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsRefererRankViewHolderKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,127:1\n148#2:128\n148#2:165\n148#2:202\n148#2:203\n148#2:204\n148#2:205\n148#2:206\n148#2:211\n158#2:216\n148#2:217\n85#3:129\n82#3,6:130\n88#3:164\n92#3:215\n78#4,6:136\n85#4,4:151\n89#4,2:161\n78#4,6:173\n85#4,4:188\n89#4,2:198\n93#4:209\n93#4:214\n368#5,9:142\n377#5:163\n368#5,9:179\n377#5:200\n378#5,2:207\n378#5,2:212\n4032#6,6:155\n4032#6,6:192\n98#7:166\n95#7,6:167\n101#7:201\n105#7:210\n*S KotlinDebug\n*F\n+ 1 StatisticsRefererRankViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsRefererRankViewHolderKt\n*L\n56#1:128\n65#1:165\n73#1:202\n74#1:203\n77#1:204\n80#1:205\n88#1:206\n105#1:211\n119#1:216\n120#1:217\n58#1:129\n58#1:130,6\n58#1:164\n58#1:215\n58#1:136,6\n58#1:151,4\n58#1:161,2\n63#1:173,6\n63#1:188,4\n63#1:198,2\n63#1:209\n58#1:214\n58#1:142,9\n58#1:163\n63#1:179,9\n63#1:200\n63#1:207,2\n58#1:212,2\n58#1:155,6\n63#1:192,6\n63#1:166\n63#1:167,6\n63#1:201\n63#1:210\n*E\n"})
public final class StatisticsRefererRankViewHolderKt {
    public static final void a(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xC20DE675);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC20DE675, v1, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.RefererRankSeeDetailButton (StatisticsRefererRankViewHolder.kt:111)");
            }
            RoundButtonKt.RoundButton(function00, null, new ButtonColors(0L, 0L, 0L, 0L, 0L, 0L, 60, null), null, BorderStrokeKt.BorderStroke-cXLIe8U(0.5f, 0L), null, false, null, PaddingKt.PaddingValues-YgX7TsA(16.0f, 5.0f), ComposableSingletons.StatisticsRefererRankViewHolderKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, v1 & 14 | 0x36006180, 0xEA);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e0(function00, v));
        }
    }

    public static final void access$RefererRank(RefererRankItem statisticsItem$RefererRankItem0, Function0 function00, Composer composer0, int v) {
        Companion modifier$Companion1;
        Composer composer1 = composer0.startRestartGroup(0xD94238D5);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD94238D5, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.RefererRank (StatisticsRefererRankViewHolder.kt:53)");
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxWidth$default(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 0.0f, (statisticsItem$RefererRankItem0 == null || !statisticsItem$RefererRankItem0.isLastItem() ? 0.0f : 15.0f), 7, null), 0.0f, 1, null);
        Arrangement arrangement0 = Arrangement.INSTANCE;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        Modifier modifier2 = PaddingKt.padding-VpY3zN4(modifier$Companion0, 20.0f, 10.0f);
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        CommonImageKt.CommonImage((statisticsItem$RefererRankItem0 == null ? null : statisticsItem$RefererRankItem0.getServiceIcon()), null, ClipKt.clip(SizeKt.size-3ABfNKs(modifier$Companion0, 18.0f), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(4.0f)), null, null, null, composer1, 0x30, 56);
        SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 10.0f), composer1, 6);
        Modifier modifier4 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 0.0f, 4.0f, 1, null);
        String s = statisticsItem$RefererRankItem0 == null ? null : statisticsItem$RefererRankItem0.getRefLabel();
        TTextStyle tTextStyle0 = TTextStyle.INSTANCE;
        TextKt.Text--4IGK_g((s == null ? "" : s), modifier4, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tTextStyle0.getSize16Weight400(), composer1, 0x30, 0x180C30, 0xD7FC);
        composer1.startReplaceGroup(0x5E833D78);
        if(statisticsItem$RefererRankItem0 == null) {
            modifier$Companion1 = modifier$Companion0;
        }
        else if(statisticsItem$RefererRankItem0.isRefTypeEtc()) {
            modifier$Companion1 = modifier$Companion0;
            c.a(10.0f, modifier$Companion1, composer1, 6);
            StatisticsRefererRankViewHolderKt.a(function00, composer1, v >> 3 & 14);
        }
        else {
            modifier$Companion1 = modifier$Companion0;
        }
        composer1.endReplaceGroup();
        SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance0, modifier$Companion1, 1.0f, false, 2, null), composer1, 0);
        TextKt.Text--4IGK_g(StringUtils.INSTANCE.getNumberFormat(((long)(statisticsItem$RefererRankItem0 == null ? 0L : statisticsItem$RefererRankItem0.getCount()))), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tTextStyle0.getSize15Weight700(), composer1, 0x180, 0x180000, 0xFFFA);
        composer1.endNode();
        composer1.startReplaceGroup(-1601352620);
        if(statisticsItem$RefererRankItem0 == null || !statisticsItem$RefererRankItem0.isLastItem()) {
            DividerKt.HorizontalDivider-9IZ8Weo(null, 1.0f, 0L, composer1, 0x1B0, 1);
        }
        if(m.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d0(statisticsItem$RefererRankItem0, function00, v));
        }
    }
}

