package com.kakao.tistory.presentation.view.statistics.viewholder;

import a;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import c;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000E\n\u0002\b\u0004¨\u0006\u0004²\u0006\u000E\u0010\u0001\u001A\u0004\u0018\u00010\u00008\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u0002\u001A\u0004\u0018\u00010\u00008\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u0003\u001A\u0004\u0018\u00010\u00008\nX\u008A\u0084\u0002"}, d2 = {"", "title", "selectedSortTitle", "selectedMetricSortTitle", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStatisticsTopHeaderViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatisticsTopHeaderViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsTopHeaderViewHolderKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,120:1\n148#2:121\n148#2:158\n148#2:163\n148#2:200\n98#3:122\n95#3,6:123\n101#3:157\n105#3:162\n98#3:164\n95#3,6:165\n101#3:199\n105#3:204\n78#4,6:129\n85#4,4:144\n89#4,2:154\n93#4:161\n78#4,6:171\n85#4,4:186\n89#4,2:196\n93#4:203\n368#5,9:135\n377#5:156\n378#5,2:159\n368#5,9:177\n377#5:198\n378#5,2:201\n4032#6,6:148\n4032#6,6:190\n81#7:205\n81#7:206\n81#7:207\n*S KotlinDebug\n*F\n+ 1 StatisticsTopHeaderViewHolder.kt\ncom/kakao/tistory/presentation/view/statistics/viewholder/StatisticsTopHeaderViewHolderKt\n*L\n62#1:121\n67#1:158\n104#1:163\n113#1:200\n59#1:122\n59#1:123,6\n59#1:157\n59#1:162\n102#1:164\n102#1:165,6\n102#1:199\n102#1:204\n59#1:129,6\n59#1:144,4\n59#1:154,2\n59#1:161\n102#1:171,6\n102#1:186,4\n102#1:196,2\n102#1:203\n59#1:135,9\n59#1:156\n59#1:159,2\n102#1:177,9\n102#1:198\n102#1:201,2\n59#1:148,6\n102#1:190,6\n54#1:205\n55#1:206\n57#1:207\n*E\n"})
public final class StatisticsTopHeaderViewHolderKt {
    public static final void a(Modifier modifier0, String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x90E165E2);
        int v1 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 91) == 18 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            goto label_13;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x90E165E2, v1, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTopHeaderTitle (StatisticsTopHeaderViewHolder.kt:85)");
        }
        if(s != null && s.length() != 0) {
            TextKt.Text--4IGK_g(s, modifier0, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, TTextStyle.INSTANCE.getSize32Weight600(), composer1, v1 >> 3 & 14 | v1 << 3 & 0x70, 0x180C30, 0xD7FC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        label_13:
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new o0(modifier0, s, v));
            }
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new n0(modifier0, s, v));
        }
    }

    public static final void a(String s, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xC92DBE0B);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) == 18 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            goto label_35;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC92DBE0B, v1, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTopHeaderFilter (StatisticsTopHeaderViewHolder.kt:98)");
        }
        if(s != null && s.length() != 0) {
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = ModifierKt.noRippleClickable(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 16.0f, 0.0f, 0.0f, 0.0f, 14, null), function00);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            TextKt.Text--4IGK_g(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TTextStyle.INSTANCE.getSize15Weight400(), composer1, v1 & 14, 0x180000, 0xFFFE);
            c.a(6.0f, modifier$Companion0, composer1, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_list_fold, composer1, 0), null, null, null, null, 0.0f, null, composer1, 56, 0x7C);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        label_35:
            ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.updateScope(new m0(s, function00, v));
            }
            return;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new l0(s, function00, v));
        }
    }

    public static final void access$StatisticsTopHeader(TopViewModel topViewModel0, EntryItem entryItem0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xB2EC9F68);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB2EC9F68, v, -1, "com.kakao.tistory.presentation.view.statistics.viewholder.StatisticsTopHeader (StatisticsTopHeaderViewHolder.kt:51)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(topViewModel0.getTitle(), composer1, 8);
        State state1 = LiveDataAdapterKt.observeAsState(topViewModel0.getSelectedSortTitle(), composer1, 8);
        State state2 = LiveDataAdapterKt.observeAsState(topViewModel0.getSelectedMetricSortTitle(), composer1, 8);
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 20.0f, 12.0f, 20.0f, 15.0f);
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getBottom(), composer1, 0x30);
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
        StatisticsTopHeaderViewHolderKt.a(PaddingKt.padding-qDBjuR0$default(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), 0.0f, 0.0f, 0.0f, 3.0f, 7, null), ((String)state0.getValue()), composer1, 0);
        composer1.startReplaceGroup(0xEEDC7046);
        if(entryItem0 == null) {
            StatisticsTopHeaderViewHolderKt.a(((String)state2.getValue()), new h0(topViewModel0), composer1, 0);
        }
        composer1.endReplaceGroup();
        StatisticsTopHeaderViewHolderKt.a(((String)state1.getValue()), new j0(topViewModel0, entryItem0), composer1, 0);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k0(topViewModel0, entryItem0, v));
        }
    }
}

