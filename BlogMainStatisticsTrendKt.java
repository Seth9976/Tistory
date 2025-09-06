import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.graph.BlogTwinBarGraphKt;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.screen.blog.main.contract.StatisticsItem.Trend;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Trend;", "item", "", "BlogMainStatisticsTrend", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/StatisticsItem$Trend;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainStatisticsTrend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainStatisticsTrend.kt\nBlogMainStatisticsTrendKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,150:1\n85#2:151\n82#2,6:152\n88#2:186\n92#2:233\n85#2:234\n82#2,6:235\n88#2:269\n92#2:316\n78#3,6:158\n85#3,4:173\n89#3,2:183\n78#3,6:196\n85#3,4:211\n89#3,2:221\n93#3:228\n93#3:232\n78#3,6:241\n85#3,4:256\n89#3,2:266\n78#3,6:279\n85#3,4:294\n89#3,2:304\n93#3:311\n93#3:315\n78#3,6:325\n85#3,4:340\n89#3,2:350\n93#3:358\n78#3,6:368\n85#3,4:383\n89#3,2:393\n93#3:401\n368#4,9:164\n377#4:185\n368#4,9:202\n377#4:223\n378#4,2:226\n378#4,2:230\n368#4,9:247\n377#4:268\n368#4,9:285\n377#4:306\n378#4,2:309\n378#4,2:313\n368#4,9:331\n377#4:352\n378#4,2:356\n368#4,9:374\n377#4:395\n378#4,2:399\n4032#5,6:177\n4032#5,6:215\n4032#5,6:260\n4032#5,6:298\n4032#5,6:344\n4032#5,6:387\n148#6:187\n148#6:188\n148#6:225\n148#6:270\n148#6:308\n148#6:354\n148#6:355\n148#6:360\n148#6:397\n148#6:398\n98#7:189\n95#7,6:190\n101#7:224\n105#7:229\n98#7:271\n94#7,7:272\n101#7:307\n105#7:312\n98#7:317\n94#7,7:318\n101#7:353\n105#7:359\n98#7:361\n95#7,6:362\n101#7:396\n105#7:402\n*S KotlinDebug\n*F\n+ 1 BlogMainStatisticsTrend.kt\nBlogMainStatisticsTrendKt\n*L\n31#1:151\n31#1:152,6\n31#1:186\n31#1:233\n71#1:234\n71#1:235,6\n71#1:269\n71#1:316\n31#1:158,6\n31#1:173,4\n31#1:183,2\n44#1:196,6\n44#1:211,4\n44#1:221,2\n44#1:228\n31#1:232\n71#1:241,6\n71#1:256,4\n71#1:266,2\n77#1:279,6\n77#1:294,4\n77#1:304,2\n77#1:311\n71#1:315\n98#1:325,6\n98#1:340,4\n98#1:350,2\n98#1:358\n125#1:368,6\n125#1:383,4\n125#1:393,2\n125#1:401\n31#1:164,9\n31#1:185\n44#1:202,9\n44#1:223\n44#1:226,2\n31#1:230,2\n71#1:247,9\n71#1:268\n77#1:285,9\n77#1:306\n77#1:309,2\n71#1:313,2\n98#1:331,9\n98#1:352\n98#1:356,2\n125#1:374,9\n125#1:395\n125#1:399,2\n31#1:177,6\n44#1:215,6\n71#1:260,6\n77#1:298,6\n98#1:344,6\n125#1:387,6\n42#1:187\n47#1:188\n56#1:225\n75#1:270\n88#1:308\n110#1:354\n114#1:355\n126#1:360\n135#1:397\n138#1:398\n44#1:189\n44#1:190,6\n44#1:224\n44#1:229\n77#1:271\n77#1:272,7\n77#1:307\n77#1:312\n98#1:317\n98#1:318,7\n98#1:353\n98#1:359\n125#1:361\n125#1:362,6\n125#1:396\n125#1:402\n*E\n"})
public final class BlogMainStatisticsTrendKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogMainStatisticsTrend(@NotNull Trend statisticsItem$Trend0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(statisticsItem$Trend0, "item");
        Composer composer1 = composer0.startRestartGroup(0x990B8BE3);
        int v1 = (v & 14) == 0 ? (composer1.changed(statisticsItem$Trend0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x990B8BE3, v1, -1, "BlogMainStatisticsTrend (BlogMainStatisticsTrend.kt:26)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            Arrangement arrangement0 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getCenterHorizontally(), composer1, 0x30);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Modifier modifier2 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
            BlogTwinBarGraphKt.BlogTwinBarGraph(statisticsItem$Trend0.getList(), ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, modifier2, 1.0f, false, 2, null), composer1, 8, 0);
            b.a(16.0f, modifier$Companion0, composer1, 6);
            Modifier modifier3 = PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 20.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            String s = StringResources_androidKt.stringResource(string.label_blog_statistics_today_view_count, composer1, 0);
            BlogMainStatisticsTrendKt.a(RowScopeInstance.INSTANCE, s, 0L, statisticsItem$Trend0.getPv(), statisticsItem$Trend0.getPvIncrease(), composer1, 390);
            c.a(20.0f, modifier$Companion0, composer1, 6);
            String s1 = StringResources_androidKt.stringResource(string.label_blog_statistics_today_visitor_count, composer1, 0);
            BlogMainStatisticsTrendKt.a(RowScopeInstance.INSTANCE, s1, 0L, statisticsItem$Trend0.getUv(), statisticsItem$Trend0.getUvIncrease(), composer1, 390);
            if(e.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(statisticsItem$Trend0, v));
        }
    }

    public static final void a(float f, Composer composer0, int v) {
        String s;
        Composer composer1 = composer0.startRestartGroup(0x99E31A0F);
        int v1 = (v & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x99E31A0F, v1, -1, "viewCountIncrease (BlogMainStatisticsTrend.kt:120)");
            }
            boolean z = Float.compare(f, 0.0f) >= 0;
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 4.0f, 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Painter painter0 = PainterResources_androidKt.painterResource((z ? drawable.ic_statistics_up : drawable.ic_statistics_down), composer1, 0);
            if(z) {
                composer1.startReplaceGroup(0x81B7FA7E);
                s = StringResources_androidKt.stringResource(string.content_desc_increase, composer1, 0);
            }
            else {
                composer1.startReplaceGroup(-2118647010);
                s = StringResources_androidKt.stringResource(string.content_desc_decrease, composer1, 0);
            }
            composer1.endReplaceGroup();
            IconKt.Icon-ww6aTOc(painter0, s, SizeKt.size-VpY3zN4(modifier$Companion0, 6.0f, 4.0f), 0L, composer1, 392, 0);
            c.a(2.0f, modifier$Companion0, composer1, 6);
            TextKt.Text--4IGK_g(StringUtils.INSTANCE.getAbbreviatedNumber(Math.abs(f)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141400000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, 0, 0, 0xFFFA);
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
            scopeUpdateScope0.updateScope(new i(f, v));
        }
    }

    public static final void a(RowScope rowScope0, String s, long v, float f, float f1, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xDD083629);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(rowScope0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changed(f) ? 0x800 : 0x400);
        }
        if((0xE000 & v1) == 0) {
            v2 |= (composer1.changed(f1) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDD083629, v2, -1, "ViewCount (BlogMainStatisticsTrend.kt:68)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = RowScope.weight$default(rowScope0, modifier$Companion0, 1.0f, false, 2, null);
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
            BlogMainStatisticsTrendKt.a(s, v, composer1, v2 >> 3 & 0x7E);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 2.0f), composer1, 6);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0x30);
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
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            TextKt.Text--4IGK_g(StringUtils.INSTANCE.getAbbreviatedNumber(kotlin.ranges.c.coerceAtLeast(f, 0.0f)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141A00000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, 0x180, 0, 0xFFFA);
            c.a(4.0f, modifier$Companion0, composer1, 6);
            BlogMainStatisticsTrendKt.a(f1, composer1, v2 >> 12 & 14);
            composer1.endNode();
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
            scopeUpdateScope0.updateScope(new g(rowScope0, s, v, f, f1, v1));
        }
    }

    public static final void a(String s, long v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x9A28F6F1);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9A28F6F1, v2, -1, "ViewCountTitle (BlogMainStatisticsTrend.kt:95)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
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
            TextKt.Text--4IGK_g(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141400000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, v2 & 14 | 0x180, 0, 0xFFFA);
            c.a(4.0f, modifier$Companion0, composer1, 6);
            BoxKt.Box(ModifierKt.shape-8ww4TTg$default(SizeKt.size-3ABfNKs(modifier$Companion0, 5.0f), RoundedCornerShapeKt.getCircleShape(), v, null, 0.0f, 12, null), composer1, 0);
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
            scopeUpdateScope0.updateScope(new h(s, v, v1));
        }
    }
}

