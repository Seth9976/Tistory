package com.kakao.tistory.presentation.screen.revenue.ui;

import a5.b;
import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.DateUtils;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.screen.revenue.item.DetailInfo;
import com.kakao.tistory.presentation.screen.revenue.item.GraphDetailInfoUiState;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A,\u0010\t\u001A\u00020\u00062\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;", "revenueGraphDetailInfo", "Landroidx/compose/ui/graphics/Color;", "pointColor", "", "PeriodStatisticsTable-FNF3uiM", "(Landroidx/compose/ui/Modifier;Lcom/kakao/tistory/presentation/screen/revenue/item/GraphDetailInfoUiState;JLandroidx/compose/runtime/Composer;II)V", "PeriodStatisticsTable", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPeriodStatisticsTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeriodStatisticsTable.kt\ncom/kakao/tistory/presentation/screen/revenue/ui/PeriodStatisticsTableKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,135:1\n85#2:136\n82#2,6:137\n88#2:171\n92#2:178\n78#3,6:143\n85#3,4:158\n89#3,2:168\n93#3:177\n78#3,6:187\n85#3,4:202\n89#3,2:212\n93#3:218\n78#3,6:234\n85#3,4:249\n89#3,2:259\n93#3:267\n368#4,9:149\n377#4:170\n378#4,2:175\n368#4,9:193\n377#4:214\n378#4,2:216\n368#4,9:240\n377#4:261\n378#4,2:265\n4032#5,6:162\n4032#5,6:206\n4032#5,6:253\n1#6:172\n1855#7,2:173\n148#8:179\n148#8:220\n148#8:263\n148#8:264\n98#9:180\n95#9,6:181\n101#9:215\n105#9:219\n98#9:227\n95#9,6:228\n101#9:262\n105#9:268\n1223#10,6:221\n*S KotlinDebug\n*F\n+ 1 PeriodStatisticsTable.kt\ncom/kakao/tistory/presentation/screen/revenue/ui/PeriodStatisticsTableKt\n*L\n33#1:136\n33#1:137,6\n33#1:171\n33#1:178\n33#1:143,6\n33#1:158,4\n33#1:168,2\n33#1:177\n69#1:187,6\n69#1:202,4\n69#1:212,2\n69#1:218\n90#1:234,6\n90#1:249,4\n90#1:259,2\n90#1:267\n33#1:149,9\n33#1:170\n33#1:175,2\n69#1:193,9\n69#1:214\n69#1:216,2\n90#1:240,9\n90#1:261\n90#1:265,2\n33#1:162,6\n69#1:206,6\n90#1:253,6\n54#1:173,2\n72#1:179\n93#1:220\n112#1:263\n115#1:264\n69#1:180\n69#1:181,6\n69#1:215\n69#1:219\n90#1:227\n90#1:228,6\n90#1:262\n90#1:268\n94#1:221,6\n*E\n"})
public final class PeriodStatisticsTableKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void PeriodStatisticsTable-FNF3uiM(@Nullable Modifier modifier0, @NotNull GraphDetailInfoUiState graphDetailInfoUiState0, long v, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier1;
        int v3;
        Intrinsics.checkNotNullParameter(graphDetailInfoUiState0, "revenueGraphDetailInfo");
        Composer composer1 = composer0.startRestartGroup(-2095643204);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(graphDetailInfoUiState0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v3 & 731) != 0x92 || !composer1.getSkipping()) {
            modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2095643204, v3, -1, "com.kakao.tistory.presentation.screen.revenue.ui.PeriodStatisticsTable (PeriodStatisticsTable.kt:31)");
            }
            Modifier modifier2 = SizeKt.fillMaxWidth$default(modifier1, 0.0f, 1, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function20);
            }
            r0.a.z(composeUiNode$Companion0, composer1, modifier3, composer1, 0xEB0C6F62);
            composer1.endReplaceGroup();
            DetailInfo detailInfo0 = graphDetailInfoUiState0.getRevenueInfo();
            String s = detailInfo0.getRpm();
            String s1 = detailInfo0.getPageRpm();
            String s2 = detailInfo0.getPageCtr();
            String s3 = detailInfo0.getECpm();
            String s4 = detailInfo0.getVCpm();
            List list0 = CollectionsKt__CollectionsKt.listOfNotNull(new DetailInfoItem[]{new DetailInfoItem(string.revenue_graph_detail_info_earnings, "", Color.box-impl(v), null), new DetailInfoItem(string.revenue_graph_detail_info_impression, "", Color.box-impl(0L), null), new DetailInfoItem(string.revenue_graph_detail_info_click, "", null, 4, null), (s == null ? null : new DetailInfoItem(string.revenue_graph_detail_info_rpm, s, null, 4, null)), (s1 == null ? null : new DetailInfoItem(string.revenue_graph_detail_info_pageRpm, s1, null, 4, null)), (s2 == null ? null : new DetailInfoItem(string.revenue_graph_detail_info_ctr, s2, null, 4, null)), (s3 == null ? null : new DetailInfoItem(string.revenue_graph_detail_info_eCpm, s3, null, 4, null)), (s4 == null ? null : new DetailInfoItem(string.revenue_graph_detail_info_vCpm, s4, null, 4, null))});
            composer1.startReplaceGroup(0xEB0CFEDC);
            for(Object object0: list0) {
                PeriodStatisticsTableKt.a(((DetailInfoItem)object0), composer1, 0);
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(modifier1, graphDetailInfoUiState0, v, v1, v2));
        }
    }

    public static final void a(DetailInfoItem detailInfoItem0, Composer composer0, int v) {
        androidx.compose.ui.Modifier.Companion modifier$Companion1;
        Composer composer1 = composer0.startRestartGroup(0x7B381F17);
        int v1 = (v & 14) == 0 ? (composer1.changed(detailInfoItem0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7B381F17, v1, -1, "com.kakao.tistory.presentation.screen.revenue.ui.PeriodStatisticsTableItem (PeriodStatisticsTable.kt:87)");
            }
            String s = b.m(StringResources_androidKt.stringResource(detailInfoItem0.getTitleRes(), composer1, 0), ", ", detailInfoItem0.getValue());
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 52.0f);
            composer1.startReplaceGroup(-1260328075);
            boolean z = composer1.changed(s);
            com.kakao.tistory.presentation.screen.revenue.ui.d d0 = composer1.rememberedValue();
            if(z || d0 == Composer.Companion.getEmpty()) {
                d0 = new com.kakao.tistory.presentation.screen.revenue.ui.d(s);
                composer1.updateRememberedValue(d0);
            }
            composer1.endReplaceGroup();
            Modifier modifier1 = SemanticsModifierKt.clearAndSetSemantics(modifier0, d0);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            String s1 = StringResources_androidKt.stringResource(detailInfoItem0.getTitleRes(), composer1, 0);
            androidx.compose.ui.text.font.FontWeight.Companion fontWeight$Companion0 = FontWeight.Companion;
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s1, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, new TextStyle(0L, 0x141800000L, fontWeight$Companion0.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, 0x180, 0, 0x1FFFA);
            composer1.startReplaceGroup(1981054612);
            if(detailInfoItem0.getPointColor-QN2ZGVo() == null) {
                modifier$Companion1 = modifier$Companion0;
            }
            else {
                modifier$Companion1 = modifier$Companion0;
                c.a(6.0f, modifier$Companion1, composer1, 6);
                BoxKt.Box(BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(modifier$Companion1, 8.0f), detailInfoItem0.getPointColor-QN2ZGVo().unbox-impl(), RoundedCornerShapeKt.getCircleShape()), composer1, 0);
            }
            composer1.endReplaceGroup();
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance0, modifier$Companion1, 1.0f, false, 2, null), composer1, 0);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(detailInfoItem0.getValue(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, new TextStyle(0L, 0x141800000L, fontWeight$Companion0.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, 0x180, 0, 0x1FFFA);
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
            scopeUpdateScope0.updateScope(new e(detailInfoItem0, v));
        }
    }

    public static final void a(String s, String s1, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xB9DC4C2C);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB9DC4C2C, v1, -1, "com.kakao.tistory.presentation.screen.revenue.ui.PeriodStatisticsTableTitle (PeriodStatisticsTable.kt:60)");
            }
            String s2 = Intrinsics.areEqual(s, s1) ? DateUtils.INSTANCE.dotFormat(s1) : b.m(DateUtils.INSTANCE.dotFormat(s), " ~ ", DateUtils.INSTANCE.dotFormat(s1));
            String s3 = StringResources_androidKt.stringResource(string.revenue_graph_detail_info_title, new Object[]{s2}, composer1, 0x40);
            Modifier modifier0 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 52.0f);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, new TextStyle(0L, 0x141880000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, 0x180, 0, 0x1FFFA);
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
            scopeUpdateScope0.updateScope(new f(s, s1, v));
        }
    }
}

