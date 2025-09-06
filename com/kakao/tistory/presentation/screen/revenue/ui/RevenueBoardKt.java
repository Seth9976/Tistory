package com.kakao.tistory.presentation.screen.revenue.ui;

import a;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.common.extension.NumberExtensionKt;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.screen.revenue.item.RevenueSummaryUiState;
import com.kakao.tistory.presentation.screen.revenue.item.VariationEarningUiState;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.common.VerticalDividerKt;
import d;
import e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001A!\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\u000E\u0010\b\u001A\u00020\u00078\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;", "revenueSummary", "", "RevenueBoard", "(Landroidx/compose/ui/Modifier;Lcom/kakao/tistory/presentation/screen/revenue/item/RevenueSummaryUiState;Landroidx/compose/runtime/Composer;II)V", "", "revenueBoardInfoHeight", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRevenueBoard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RevenueBoard.kt\ncom/kakao/tistory/presentation/screen/revenue/ui/RevenueBoardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,209:1\n148#2:210\n148#2:211\n148#2:322\n148#2:385\n148#2:390\n148#2:433\n148#2:434\n148#2:439\n148#2:440\n148#2:441\n148#2:478\n71#3:212\n68#3,6:213\n74#3:247\n78#3:334\n78#4,6:219\n85#4,4:234\n89#4,2:244\n78#4,6:256\n85#4,4:271\n89#4,2:281\n78#4,6:293\n85#4,4:308\n89#4,2:318\n93#4:325\n93#4:329\n93#4:333\n78#4,6:350\n85#4,4:365\n89#4,2:375\n93#4:388\n78#4,6:404\n85#4,4:419\n89#4,2:429\n93#4:437\n78#4,6:449\n85#4,4:464\n89#4,2:474\n93#4:481\n368#5,9:225\n377#5:246\n368#5,9:262\n377#5:283\n368#5,9:299\n377#5:320\n378#5,2:323\n378#5,2:327\n378#5,2:331\n368#5,9:356\n377#5:377\n378#5,2:386\n368#5,9:410\n377#5:431\n378#5,2:435\n368#5,9:455\n377#5:476\n378#5,2:479\n4032#6,6:238\n4032#6,6:275\n4032#6,6:312\n4032#6,6:369\n4032#6,6:423\n4032#6,6:468\n85#7:248\n81#7,7:249\n88#7:284\n92#7:330\n85#7:397\n82#7,6:398\n88#7:432\n92#7:438\n98#8:285\n94#8,7:286\n101#8:321\n105#8:326\n98#8:342\n94#8,7:343\n101#8:378\n105#8:389\n98#8:442\n95#8,6:443\n101#8:477\n105#8:482\n77#9:335\n1223#10,6:336\n1223#10,6:379\n1223#10,6:391\n75#11:483\n108#11,2:484\n*S KotlinDebug\n*F\n+ 1 RevenueBoard.kt\ncom/kakao/tistory/presentation/screen/revenue/ui/RevenueBoardKt\n*L\n42#1:210\n44#1:211\n61#1:322\n110#1:385\n135#1:390\n142#1:433\n165#1:434\n184#1:439\n186#1:440\n190#1:441\n196#1:478\n38#1:212\n38#1:213,6\n38#1:247\n38#1:334\n38#1:219,6\n38#1:234,4\n38#1:244,2\n47#1:256,6\n47#1:271,4\n47#1:281,2\n56#1:293,6\n56#1:308,4\n56#1:318,2\n56#1:325\n47#1:329\n38#1:333\n97#1:350,6\n97#1:365,4\n97#1:375,2\n97#1:388\n133#1:404,6\n133#1:419,4\n133#1:429,2\n133#1:437\n182#1:449,6\n182#1:464,4\n182#1:474,2\n182#1:481\n38#1:225,9\n38#1:246\n47#1:262,9\n47#1:283\n56#1:299,9\n56#1:320\n56#1:323,2\n47#1:327,2\n38#1:331,2\n97#1:356,9\n97#1:377\n97#1:386,2\n133#1:410,9\n133#1:431\n133#1:435,2\n182#1:455,9\n182#1:476\n182#1:479,2\n38#1:238,6\n47#1:275,6\n56#1:312,6\n97#1:369,6\n133#1:423,6\n182#1:468,6\n47#1:248\n47#1:249,7\n47#1:284\n47#1:330\n133#1:397\n133#1:398,6\n133#1:432\n133#1:438\n56#1:285\n56#1:286,7\n56#1:321\n56#1:326\n97#1:342\n97#1:343,7\n97#1:378\n97#1:389\n182#1:442\n182#1:443,6\n182#1:477\n182#1:482\n87#1:335\n89#1:336,6\n99#1:379,6\n137#1:391,6\n89#1:483\n89#1:484,2\n*E\n"})
public final class RevenueBoardKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void RevenueBoard(@Nullable Modifier modifier0, @NotNull RevenueSummaryUiState revenueSummaryUiState0, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(revenueSummaryUiState0, "revenueSummary");
        Composer composer1 = composer0.startRestartGroup(0xAEC4F620);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(revenueSummaryUiState0) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAEC4F620, v2, -1, "com.kakao.tistory.presentation.screen.revenue.ui.RevenueBoard (RevenueBoard.kt:35)");
            }
            Modifier modifier2 = ModifierKt.shape-8ww4TTg$default(SizeKt.fillMaxWidth$default(modifier1, 0.0f, 1, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f), 0L, null, 14.0f, 4, null);
            Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Arrangement arrangement0 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                d.a(v5, composer1, v5, function21);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            RevenueBoardKt.a("", null, new Pair(revenueSummaryUiState0.getDay(), revenueSummaryUiState0.getWeek()), composer1, 0, 2);
            MeasurePolicy measurePolicy2 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                d.a(v6, composer1, v6, function22);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            composer1.startReplaceGroup(-371674190);
            for(int v3 = 0; v3 < 2; ++v3) {
                DividerKt.HorizontalDivider-9IZ8Weo(PaddingKt.padding-VpY3zN4$default(RowScope.weight$default(rowScopeInstance0, Modifier.Companion, 1.0f, false, 2, null), 24.0f, 0.0f, 2, null), 0.0f, 0L, composer1, 0x180, 2);
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            RevenueBoardKt.a("", "", new Pair(revenueSummaryUiState0.getMonth(), revenueSummaryUiState0.getTotalEarnings()), composer1, 0, 0);
            if(e.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(modifier1, revenueSummaryUiState0, v, v1));
        }
    }

    public static final void a(Modifier modifier0, VariationEarningUiState variationEarningUiState0, String s, String s1, Composer composer0, int v, int v1) {
        String s3;
        String s2;
        Modifier modifier1;
        String s6;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-936763045);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(variationEarningUiState0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(s) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(s1) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            String s4 = (v1 & 4) == 0 ? s : null;
            String s5 = (v1 & 8) == 0 ? s1 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-936763045, v2, -1, "com.kakao.tistory.presentation.screen.revenue.ui.RevenueBoardInfo (RevenueBoard.kt:125)");
            }
            if(s4 == null) {
                if(s5 == null) {
                    if(ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
                    if(scopeUpdateScope0 != null) {
                        scopeUpdateScope0.updateScope(new j(modifier1, variationEarningUiState0, null, null, v, v1));
                    }
                    return;
                }
                s6 = s5;
            }
            else {
                s6 = s4;
            }
            String s7 = StringResources_androidKt.stringResource(variationEarningUiState0.getTitle(), composer1, 0);
            String s8 = variationEarningUiState0.getValue();
            Double double0 = variationEarningUiState0.getVariation();
            if(double0 == null) {
                double0 = "";
            }
            String s9 = s7 + ", " + s6 + s8 + ", " + double0;
            Modifier modifier2 = SizeKt.fillMaxWidth$default(PaddingKt.padding-3ABfNKs(modifier1, 24.0f), 0.0f, 1, null);
            composer1.startReplaceGroup(0xBA70B8F8);
            boolean z = composer1.changed(s9);
            h h0 = composer1.rememberedValue();
            if(z || h0 == Composer.Companion.getEmpty()) {
                h0 = new h(s9);
                composer1.updateRememberedValue(h0);
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = SemanticsModifierKt.clearAndSetSemantics(modifier2, h0);
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
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, 3.0f), composer1, 6);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(variationEarningUiState0.getTitle(), composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, new TextStyle(0L, 0x141400000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141400000L, null, null, null, 0, 0, null, 0xFDFFD9, null), composer1, 0x180, 0, 0x1FFFA);
            RevenueViewKt.AutoSizeText(null, s6 + variationEarningUiState0.getValue(), new TextStyle(0L, 0x141A00000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141A00000L, null, null, null, 0, 0, null, 0xFDFFD8, null), composer1, 0, 1);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, 7.0f), composer1, 6);
            composer1.startReplaceGroup(0x3E063208);
            if(variationEarningUiState0.getVariation() != null) {
                RevenueBoardKt.a(s6, ((double)variationEarningUiState0.getVariation()), composer1, 0);
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
            s2 = s4;
            s3 = s5;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            s2 = s;
            s3 = s1;
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new i(modifier1, variationEarningUiState0, s2, s3, v, v1));
        }
    }

    public static final void a(String s, double f, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x3AF5F00E);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3AF5F00E, v1, -1, "com.kakao.tistory.presentation.screen.revenue.ui.RevenueChangeRoundedBox (RevenueBoard.kt:173)");
            }
            String s1 = f == 0.0 ? "-" : NumberExtensionKt.numberFormatOfCurrency(f, s);
            int v2 = Double.compare(f, 0.0) < 0 ? drawable.ic_increase : drawable.ic_decrease;
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(BorderKt.border-xT4_qwU(SizeKt.height-3ABfNKs(modifier$Companion0, 26.0f), 1.0f, 0L, RoundedCornerShapeKt.RoundedCornerShape(100)), 10.0f, 0.0f, 2, null);
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
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(v2, composer1, 0), null, null, 0L, composer1, 0xC38, 4);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 3.0f), composer1, 6);
            RevenueViewKt.AutoSizeText(null, String.valueOf(s1), new TextStyle(0L, 0x141500000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141500000L, null, null, null, 0, 0, null, 0xFDFFD8, null), composer1, 0, 1);
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
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.screen.revenue.ui.m(s, f, v));
        }
    }

    public static final void a(String s, String s1, Pair pair0, Composer composer0, int v, int v1) {
        String s2;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xEA945C79);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(pair0) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            String s3 = (v1 & 2) == 0 ? s1 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xEA945C79, v2, -1, "com.kakao.tistory.presentation.screen.revenue.ui.RevenueBoardInfoRowContainer (RevenueBoard.kt:84)");
            }
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            composer1.startReplaceGroup(0x9F53F6E0);
            MutableIntState mutableIntState0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(mutableIntState0 == composer$Companion0.getEmpty()) {
                mutableIntState0 = SnapshotIntStateKt.mutableIntStateOf(0);
                composer1.updateRememberedValue(mutableIntState0);
            }
            composer1.endReplaceGroup();
            float f = density0.toDp-u2uoSUM(mutableIntState0.getIntValue());
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier0, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            composer1.startReplaceGroup(106766617);
            k k0 = composer1.rememberedValue();
            if(k0 == composer$Companion0.getEmpty()) {
                k0 = new k(mutableIntState0);
                composer1.updateRememberedValue(k0);
            }
            composer1.endReplaceGroup();
            RevenueBoardKt.a(RowScope.weight$default(rowScopeInstance0, OnGloballyPositionedModifierKt.onGloballyPositioned(modifier$Companion0, k0), 1.0f, false, 2, null), ((VariationEarningUiState)pair0.getFirst()), s, null, composer1, v2 << 6 & 0x380, 8);
            VerticalDividerKt.VerticalDivider-aM-cp0Q(PaddingKt.padding-VpY3zN4$default(SizeKt.height-3ABfNKs(modifier$Companion0, f), 0.0f, 24.0f, 1, null), 0L, 0.0f, composer1, 0x30, 4);
            RevenueBoardKt.a(RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), ((VariationEarningUiState)pair0.getSecond()), null, (s3 == null ? s : s3), composer1, 0, 4);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            s2 = s3;
        }
        else {
            composer1.skipToGroupEnd();
            s2 = s1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l(s, s2, pair0, v, v1));
        }
    }

    public static final void access$RevenueBoardInfoRowContainer$lambda$6(MutableIntState mutableIntState0, int v) {
        mutableIntState0.setIntValue(v);
    }
}

