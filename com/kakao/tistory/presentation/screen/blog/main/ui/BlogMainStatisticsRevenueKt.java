package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue;
import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.theme.TypeKt;
import d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Revenue;", "item", "", "BlogMainStatisticsRevenue", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Revenue;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainStatisticsRevenue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainStatisticsRevenue.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainStatisticsRevenueKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,77:1\n148#2:78\n148#2:118\n148#2:160\n85#3:79\n82#3,6:80\n88#3:114\n92#3:159\n78#4,6:86\n85#4,4:101\n89#4,2:111\n78#4,6:122\n85#4,4:137\n89#4,2:147\n93#4:153\n93#4:158\n368#5,9:92\n377#5:113\n368#5,9:128\n377#5:149\n378#5,2:151\n378#5,2:156\n4032#6,6:105\n4032#6,6:141\n1549#7:115\n1620#7,2:116\n1622#7:155\n98#8,3:119\n101#8:150\n105#8:154\n*S KotlinDebug\n*F\n+ 1 BlogMainStatisticsRevenue.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainStatisticsRevenueKt\n*L\n29#1:78\n34#1:118\n52#1:160\n28#1:79\n28#1:80,6\n28#1:114\n28#1:159\n28#1:86,6\n28#1:101,4\n28#1:111,2\n32#1:122,6\n32#1:137,4\n32#1:147,2\n32#1:153\n28#1:158\n28#1:92,9\n28#1:113\n32#1:128,9\n32#1:149\n32#1:151,2\n28#1:156,2\n28#1:105,6\n32#1:141,6\n31#1:115\n31#1:116,2\n31#1:155\n32#1:119,3\n32#1:150\n32#1:154\n*E\n"})
public final class BlogMainStatisticsRevenueKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogMainStatisticsRevenue(@NotNull Revenue statisticsItem$Revenue0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(statisticsItem$Revenue0, "item");
        Composer composer1 = composer0.startRestartGroup(0xBA2755D3);
        int v1 = (v & 14) == 0 ? (composer1.changed(statisticsItem$Revenue0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xBA2755D3, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainStatisticsRevenue (BlogMainStatisticsRevenue.kt:23)");
            }
            int v2 = Vendor.getEntries().size();
            List list0 = statisticsItem$Revenue0.getList();
            Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 20.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
            composer1.startReplaceGroup(0xA0BA8F9B);
            IntRange intRange0 = c.until(0, v2);
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(intRange0, 10));
            Iterator iterator0 = intRange0.iterator();
            while(iterator0.hasNext()) {
                int v4 = ((IntIterator)iterator0).nextInt();
                Modifier modifier2 = ColumnScope.weight$default(columnScopeInstance0, Modifier.Companion, 1.0f, false, 2, null);
                MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(7.0f), Alignment.Companion.getCenterVertically(), composer1, 54);
                int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
                Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
                Function0 function01 = composeUiNode$Companion1.getConstructor();
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
                Function2 function21 = a.a(composeUiNode$Companion1, composer1, measurePolicy1, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                    d.a(v5, composer1, v5, function21);
                }
                Updater.set-impl(composer1, modifier3, composeUiNode$Companion1.getSetModifier());
                RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
                Data statisticsItem$Revenue$Data0 = (Data)CollectionsKt___CollectionsKt.getOrNull(list0, v4);
                composer1.startReplaceGroup(0x4A0ECBC3);
                if(statisticsItem$Revenue$Data0 != null) {
                    BlogMainStatisticsRevenueKt.a(rowScopeInstance0, statisticsItem$Revenue$Data0, composer1, 6);
                }
                composer1.endReplaceGroup();
                composer1.endNode();
                arrayList0.add(Unit.INSTANCE);
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j3(statisticsItem$Revenue0, v));
        }
    }

    public static final void a(RowScope rowScope0, Data statisticsItem$Revenue$Data0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x4868E9FE);
        int v1 = (v & 14) == 0 ? (composer1.changed(rowScope0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(statisticsItem$Revenue$Data0) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4868E9FE, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.RevenueContent (BlogMainStatisticsRevenue.kt:47)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(statisticsItem$Revenue$Data0.getVendor().getDrawable(), composer1, 0), null, SizeKt.size-3ABfNKs(Modifier.Companion, 20.0f), null, null, 0.0f, null, composer1, 440, 120);
            String s = StringResources_androidKt.stringResource(statisticsItem$Revenue$Data0.getVendor().getTitle(), composer1, 0);
            TextStyle textStyle0 = new TextStyle(0L, 0x141600000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null);
            TextKt.Text--4IGK_g(s, RowScope.weight$default(rowScope0, Modifier.Companion, 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, textStyle0, composer1, 0x180, 0xC30, 0xD7F8);
            TextKt.Text--4IGK_g(statisticsItem$Revenue$Data0.getEarning(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141600000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, 0x180, 0, 0xFFFA);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k3(rowScope0, statisticsItem$Revenue$Data0, v));
        }
    }
}

