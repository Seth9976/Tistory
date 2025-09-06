package com.kakao.tistory.presentation.screen.blog.main.ui;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.DateUtils.DateTimeFormat;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog.Data;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.RefererLog;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import com.kakao.tistory.presentation.widget.common.DateTimeTextKt;
import d;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererLog;", "item", "", "BlogMainStatisticsRefererLog", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$RefererLog;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainStatisticsRefererLog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainStatisticsRefererLog.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainStatisticsRefererLogKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n148#2:88\n148#2:126\n148#2:168\n148#2:170\n85#3:89\n82#3,6:90\n88#3:124\n92#3:167\n78#4,6:96\n85#4,4:111\n89#4,2:121\n78#4,6:130\n85#4,4:145\n89#4,2:155\n93#4:161\n93#4:166\n368#5,9:102\n377#5:123\n368#5,9:136\n377#5:157\n378#5,2:159\n378#5,2:164\n4032#6,6:115\n4032#6,6:149\n1855#7:125\n1856#7:163\n98#8,3:127\n101#8:158\n105#8:162\n1#9:169\n*S KotlinDebug\n*F\n+ 1 BlogMainStatisticsRefererLog.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainStatisticsRefererLogKt\n*L\n31#1:88\n37#1:126\n56#1:168\n74#1:170\n28#1:89\n28#1:90,6\n28#1:124\n28#1:167\n28#1:96,6\n28#1:111,4\n28#1:121,2\n34#1:130,6\n34#1:145,4\n34#1:155,2\n34#1:161\n28#1:166\n28#1:102,9\n28#1:123\n34#1:136,9\n34#1:157\n34#1:159,2\n28#1:164,2\n28#1:115,6\n34#1:149,6\n33#1:125\n33#1:163\n34#1:127,3\n34#1:158\n34#1:162\n*E\n"})
public final class BlogMainStatisticsRefererLogKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogMainStatisticsRefererLog(@NotNull RefererLog statisticsItem$RefererLog0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(statisticsItem$RefererLog0, "item");
        Composer composer1 = composer0.startRestartGroup(0x2F41FA90);
        int v1 = (v & 14) == 0 ? (composer1.changed(statisticsItem$RefererLog0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2F41FA90, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainStatisticsRefererLog (BlogMainStatisticsRefererLog.kt:25)");
            }
            Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 20.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
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
            ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
            composer1.startReplaceGroup(287606586);
            Iterator iterator0 = c.until(0, 5).iterator();
            while(iterator0.hasNext()) {
                int v3 = ((IntIterator)iterator0).nextInt();
                Modifier modifier2 = ColumnScope.weight$default(columnScopeInstance0, Modifier.Companion, 1.0f, false, 2, null);
                MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(7.0f), Alignment.Companion.getCenterVertically(), composer1, 54);
                int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    d.a(v4, composer1, v4, function21);
                }
                Updater.set-impl(composer1, modifier3, composeUiNode$Companion1.getSetModifier());
                RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
                Data statisticsItem$RefererLog$Data0 = (Data)CollectionsKt___CollectionsKt.getOrNull(statisticsItem$RefererLog0.getList(), v3);
                composer1.startReplaceGroup(0xF70822ED);
                if(statisticsItem$RefererLog$Data0 != null) {
                    BlogMainStatisticsRefererLogKt.a(rowScopeInstance0, statisticsItem$RefererLog$Data0, composer1, 6);
                }
                composer1.endReplaceGroup();
                composer1.endNode();
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
            scopeUpdateScope0.updateScope(new h3(statisticsItem$RefererLog0, v));
        }
    }

    public static final void a(RowScope rowScope0, Data statisticsItem$RefererLog$Data0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x55A37B8A);
        int v1 = (v & 14) == 0 ? (composer1.changed(rowScope0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(statisticsItem$RefererLog$Data0) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x55A37B8A, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.RefererLogItem (BlogMainStatisticsRefererLog.kt:49)");
            }
            String s = statisticsItem$RefererLog$Data0.getServiceIcon();
            composer1.startReplaceGroup(0xE83C66EB);
            if(s != null) {
                CommonImageKt.CommonImage(s, null, SizeKt.size-3ABfNKs(Modifier.Companion, 14.0f), null, null, null, composer1, 0x1B0, 56);
            }
            composer1.endReplaceGroup();
            String s1 = statisticsItem$RefererLog$Data0.getKeyword();
            String s2 = s1 == null ? null : StringResources_androidKt.stringResource(string.label_blog_statistics_referer_log_keyword, new Object[]{s1}, composer1, 0x40);
            String s3 = "";
            if(s2 == null) {
                s2 = "";
            }
            String s4 = statisticsItem$RefererLog$Data0.getRefUrl();
            if(s4 != null) {
                s3 = s4;
            }
            androidx.compose.ui.text.font.FontWeight.Companion fontWeight$Companion0 = FontWeight.Companion;
            TextStyle textStyle0 = new TextStyle(0L, 0x141600000L, fontWeight$Companion0.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null);
            Modifier modifier0 = RowScope.weight$default(rowScope0, Modifier.Companion, 1.0f, false, 2, null);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            ExcludeFontPaddingTextKt.Text-IbK3jfQ((s2 + s3), modifier0, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, false, 1, 0, null, textStyle0, composer1, 0x180, 0x6030, 0x1B7F8);
            if(statisticsItem$RefererLog$Data0.getTimestamp() != null) {
                SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 9.0f), composer1, 6);
                TextStyle textStyle1 = new TextStyle(0L, 0x141400000L, fontWeight$Companion0.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null);
                DateTimeTextKt.DateTimeText-Vc6wB30(statisticsItem$RefererLog$Data0.getTimestamp(), DateTimeFormat.DATE_TIME_FORMAT_M_d_HH_mm, false, null, null, 0L, 0L, textStyle1, composer1, 0x180030, 60);
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
            scopeUpdateScope0.updateScope(new i3(rowScope0, statisticsItem$RefererLog$Data0, v));
        }
    }
}

