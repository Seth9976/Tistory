package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.graph.BarGraphItem;
import com.kakao.tistory.presentation.common.graph.TweenBarGraphValue;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainStatistics;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Trend;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsState.Error;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsState.Loading;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsState.Success;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsState;
import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TColor;
import com.kakao.tistory.presentation.theme.TypeKt;
import d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A&\u0010\b\u001A\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainStatistics;", "statistics", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "", "blogMainStatistics-mxwnekA", "(Landroidx/compose/foundation/lazy/LazyListScope;Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainStatistics;J)V", "blogMainStatistics", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainStatistics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainStatistics.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainStatisticsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,446:1\n148#2:447\n148#2:454\n148#2:455\n148#2:491\n148#2:537\n148#2:538\n1223#3,6:448\n71#4:456\n69#4,5:457\n74#4:490\n78#4:536\n78#5,6:462\n85#5,4:477\n89#5,2:487\n78#5,6:499\n85#5,4:514\n89#5,2:524\n93#5:530\n93#5:535\n368#6,9:468\n377#6:489\n368#6,9:505\n377#6:526\n378#6,2:528\n378#6,2:533\n4032#7,6:481\n4032#7,6:518\n85#8:492\n82#8,6:493\n88#8:527\n92#8:531\n1#9:532\n*S KotlinDebug\n*F\n+ 1 BlogMainStatistics.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainStatisticsKt\n*L\n256#1:447\n375#1:454\n377#1:455\n388#1:491\n423#1:537\n439#1:538\n261#1:448,6\n371#1:456\n371#1:457,5\n371#1:490\n371#1:536\n371#1:462,6\n371#1:477,4\n371#1:487,2\n385#1:499,6\n385#1:514,4\n385#1:524,2\n385#1:530\n371#1:535\n371#1:468,9\n371#1:489\n385#1:505,9\n385#1:526\n385#1:528,2\n371#1:533,2\n371#1:481,6\n385#1:518,6\n385#1:492\n385#1:493,6\n385#1:527\n385#1:531\n*E\n"})
public final class BlogMainStatisticsKt {
    public static final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x12195A06);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x12195A06, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.StatisticsLoading (BlogMainStatistics.kt:443)");
            }
            ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(null, TColor.INSTANCE.getGray200-0d7_KjU(), 0.0f, 0L, 0, composer1, 0x30, 29);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y2(v));
        }
    }

    public static final void a(BlogMainStatistics blogMainStatistics0, long v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xE33B68B2);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(blogMainStatistics0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE33B68B2, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainStatistics (BlogMainStatistics.kt:254)");
            }
            Modifier modifier0 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            composer1.startReplaceGroup(0xC910DA84);
            b2 b20 = composer1.rememberedValue();
            if((v2 & 0x70) == 0x20 || b20 == Composer.Companion.getEmpty()) {
                b20 = new b2(v, 240.0f);
                composer1.updateRememberedValue(b20);
            }
            composer1.endReplaceGroup();
            BoxWithConstraintsKt.BoxWithConstraints(DrawModifierKt.drawWithCache(modifier0, b20), null, false, ComposableLambdaKt.rememberComposableLambda(0x92FF0D1C, true, new h2(blogMainStatistics0, 240.0f), composer1, 54), composer1, 0xC00, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i2(blogMainStatistics0, v, v1));
        }
    }

    public static final void a(StatisticsState statisticsState0, String s, Function4 function40, Composer composer0, int v, int v1) {
        String s3;
        Modifier modifier2;
        Modifier modifier1;
        boolean z;
        String s1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-28228210);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(statisticsState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
            s1 = s;
        }
        else if((v & 0x70) == 0) {
            s1 = s;
            v2 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        else {
            s1 = s;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function40) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 2) != 0) {
                s1 = null;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-28228210, v2, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.StatisticsContainer (BlogMainStatistics.kt:368)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = ModifierKt.shape-8ww4TTg$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(12.0f), 0L, null, 10.0f, 4, null);
            if(statisticsState0 instanceof Success) {
                z = statisticsState0 instanceof Success;
                modifier1 = modifier0;
                modifier2 = ClickableKt.clickable-XHw0xAI$default(modifier$Companion0, false, null, null, ((Success)statisticsState0).getItem().getOnClick(), 7, null);
            }
            else {
                z = statisticsState0 instanceof Success;
                modifier1 = modifier0;
                modifier2 = modifier$Companion0;
            }
            Modifier modifier3 = modifier1.then(modifier2);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
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
            Modifier modifier5 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), 0.0f, 16.0f, 1, null);
            MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
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
            Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
            ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
            composer1.startReplaceGroup(0xC8216E36);
            if(s1 != null) {
                BlogMainStatisticsKt.b(s1, composer1, 0);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(-937330984);
            if(z) {
                function40.invoke(columnScopeInstance0, ((Success)statisticsState0).getItem(), composer1, ((int)(v2 & 0x380 | 6)));
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            if(statisticsState0 instanceof Error) {
                composer1.startReplaceGroup(-1200109082);
                String s2 = ((Error)statisticsState0).getMessage();
                composer1.startReplaceGroup(0xE356D3D);
                if(s2 == null) {
                    Integer integer0 = ((Error)statisticsState0).getMessageRes();
                    s3 = integer0 == null ? null : StringResources_androidKt.stringResource(integer0.intValue(), composer1, 0);
                }
                else {
                    s3 = s2;
                }
                composer1.endReplaceGroup();
                if(s3 == null) {
                    s3 = "";
                }
                BlogMainStatisticsKt.a(s3, composer1, 0);
            }
            else if(Intrinsics.areEqual(statisticsState0, Loading.INSTANCE)) {
                composer1.startReplaceGroup(0xB87AB88F);
                BlogMainStatisticsKt.a(composer1, 0);
            }
            else {
                composer1.startReplaceGroup(0xB87BCD80);
            }
            composer1.endReplaceGroup();
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
            scopeUpdateScope0.updateScope(new x2(statisticsState0, s1, function40, v, v1));
        }
    }

    public static final void a(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xA2B49200);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA2B49200, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.StatisticsMessage (BlogMainStatistics.kt:427)");
            }
            TextStyle textStyle0 = new TextStyle(0L, 0x141600000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 3, 0, 0L, null, null, null, 0, 0, null, 0xFF7FD9, null);
            TextKt.Text--4IGK_g(s, PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 20.0f, 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, v1 & 14 | 0x1B0, 0, 0xFFF8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z2(s, v));
        }
    }

    public static final void access$BlogMainStatisticsEmptyPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xB466762);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB466762, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainStatisticsEmptyPreview (BlogMainStatistics.kt:66)");
            }
            Success statisticsState$Success0 = new Success(new Trend(j2.a, CollectionsKt__CollectionsKt.emptyList()));
            List list0 = CollectionsKt__CollectionsKt.listOf(new Data[]{new Data("", "keyword", "https://www.tistory.com", "2021-10-10T10:10:10"), new Data(null, "keyword", "https://www.tistory.com", "2021-10-10T10:10:10", 1, null)});
            Success statisticsState$Success1 = new Success(new RefererLog(k2.a, list0));
            List list1 = CollectionsKt__CollectionsKt.listOf(new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword.Data[]{new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword.Data("넷플릭스", 100), new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword.Data("1", 1009)});
            Success statisticsState$Success2 = new Success(new RefererKeyword(l2.a, list1));
            List list2 = CollectionsKt__CollectionsKt.listOf(new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data[]{new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data(Vendor.ADFIT, "-"), new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data(Vendor.SUPPORT, "-")});
            BlogMainStatisticsKt.a(new BlogMainStatistics(statisticsState$Success0, statisticsState$Success1, statisticsState$Success2, new Success(new Revenue(m2.a, list2))), ColorKt.Color(0xFF046873L), composer1, 54);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n2(v));
        }
    }

    public static final void access$BlogMainStatisticsErrorPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x21279B47);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x21279B47, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainStatisticsErrorPreview (BlogMainStatistics.kt:53)");
            }
            BlogMainStatisticsKt.a(new BlogMainStatistics(new Error("error erro r many error kwwwwww", null, 2, null), new Error("error erro r many error kwwwwww", null, 2, null), new Error("error erro r many error kwwwwww", null, 2, null), null), ColorKt.Color(0xFF046873L), composer1, 54);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o2(v));
        }
    }

    public static final void access$BlogMainStatisticsPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2023447639);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2023447639, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainStatisticsPreview (BlogMainStatistics.kt:130)");
            }
            List list0 = CollectionsKt__CollectionsKt.listOf(new BarGraphItem[]{new BarGraphItem("1", "", null, new TweenBarGraphValue(100.0f, 200.0f), 4, null), new BarGraphItem("2", "", null, new TweenBarGraphValue(10.0f, 80.0f), 4, null), new BarGraphItem("3", "", null, new TweenBarGraphValue(50.0f, 150.0f), 4, null)});
            Success statisticsState$Success0 = new Success(new Trend(p2.a, list0));
            List list1 = CollectionsKt__CollectionsKt.listOf(new Data[]{new Data("", "keyword", "https://www.tistory.com", "2021-10-10T10:10:10"), new Data(null, "keyword", "https://www.tistory.com", "2021-10-10T10:10:10", 1, null), new Data("", null, "https://www.tistory.com", null, 10, null), new Data("", "keyword", "https://www.tistory.com", "2021-10-10T10:10:10"), new Data(null, null, "https://www.tistory.com", null, 11, null)});
            Success statisticsState$Success1 = new Success(new RefererLog(q2.a, list1));
            List list2 = CollectionsKt__CollectionsKt.listOf(new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword.Data[]{new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword.Data("넷플릭스", 100), new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword.Data("1", 1009), new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword.Data("1", 1009), new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword.Data("넷플릭스 요금제", 1009), new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword.Data("스페인 숙박", 0xED), new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword.Data("스페인 비박", 0x5B25), new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererKeyword.Data("일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십", 1)});
            Success statisticsState$Success2 = new Success(new RefererKeyword(r2.a, list2));
            List list3 = CollectionsKt__CollectionsKt.listOf(new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data[]{new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data(Vendor.ADSENSE, "1000"), new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data(Vendor.ADFIT, "1000"), new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data(Vendor.DABLE, "1000"), new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data(Vendor.TENPING, "-"), new com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Revenue.Data(Vendor.SUPPORT, "-")});
            BlogMainStatisticsKt.a(new BlogMainStatistics(statisticsState$Success0, statisticsState$Success1, statisticsState$Success2, new Success(new Revenue(s2.a, list3))), ColorKt.Color(0xFF046873L), composer1, 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t2(v));
        }
    }

    public static final void access$RefererKeyword(StatisticsState statisticsState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xDA5A1A73);
        int v1 = (v & 14) == 0 ? (composer1.changed(statisticsState0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDA5A1A73, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.RefererKeyword (BlogMainStatistics.kt:342)");
            }
            BlogMainStatisticsKt.a(statisticsState0, StringResources_androidKt.stringResource(string.label_blog_statistics_referer_keyword, composer1, 0), ComposableSingletons.BlogMainStatisticsKt.INSTANCE.getLambda-3$presentation_prodRelease(), composer1, v1 & 14 | 0x180, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u2(statisticsState0, v));
        }
    }

    public static final void access$RefererLog(StatisticsState statisticsState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xCBE91438);
        int v1 = (v & 14) == 0 ? (composer1.changed(statisticsState0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCBE91438, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.RefererLog (BlogMainStatistics.kt:332)");
            }
            BlogMainStatisticsKt.a(statisticsState0, StringResources_androidKt.stringResource(string.label_blog_statistics_referer_log, composer1, 0), ComposableSingletons.BlogMainStatisticsKt.INSTANCE.getLambda-2$presentation_prodRelease(), composer1, v1 & 14 | 0x180, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v2(statisticsState0, v));
        }
    }

    public static final void access$Revenue(StatisticsState statisticsState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(1009004143);
        int v1 = (v & 14) == 0 ? (composer1.changed(statisticsState0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1009004143, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Revenue (BlogMainStatistics.kt:352)");
            }
            if(statisticsState0 != null) {
                BlogMainStatisticsKt.a(statisticsState0, StringResources_androidKt.stringResource(string.label_blog_statistics_revenue, composer1, 0), ComposableSingletons.BlogMainStatisticsKt.INSTANCE.getLambda-4$presentation_prodRelease(), composer1, 0x180, 0);
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
            scopeUpdateScope0.updateScope(new w2(statisticsState0, v));
        }
    }

    public static final void access$Trend(StatisticsState statisticsState0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xFA8F6D4E);
        int v1 = (v & 14) == 0 ? (composer1.changed(statisticsState0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFA8F6D4E, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.Trend (BlogMainStatistics.kt:324)");
            }
            BlogMainStatisticsKt.a(statisticsState0, null, ComposableSingletons.BlogMainStatisticsKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, v1 & 14 | 0x180, 2);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b3(statisticsState0, v));
        }
    }

    public static final void b(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xA4D4C851);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA4D4C851, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.StatisticsTitle (BlogMainStatistics.kt:413)");
            }
            TextStyle textStyle0 = new TextStyle(0L, 0x141700000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null);
            TextKt.Text--4IGK_g(s, PaddingKt.padding-VpY3zN4(Modifier.Companion, 20.0f, 12.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, v1 & 14 | 0x180, 0, 0xFFF8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a3(s, v));
        }
    }

    public static final void blogMainStatistics-mxwnekA(@NotNull LazyListScope lazyListScope0, @Nullable BlogMainStatistics blogMainStatistics0, long v) {
        Intrinsics.checkNotNullParameter(lazyListScope0, "$this$blogMainStatistics");
        if(blogMainStatistics0 != null) {
            LazyListScope.item$default(lazyListScope0, null, null, ComposableLambdaKt.composableLambdaInstance(0x9D2EE970, true, new c3(blogMainStatistics0, v)), 3, null);
        }
    }
}

