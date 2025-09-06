package com.kakao.tistory.presentation.common.graph;

import a;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import d;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A-\u0010\t\u001A\u00020\u00002\u0012\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\"#\u0010\u0010\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000B8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0017²\u0006\u000E\u0010\u0012\u001A\u00020\u00118\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u0013\u001A\u00020\u00118\n@\nX\u008A\u008E\u0002²\u0006\f\u0010\u0015\u001A\u00020\u00148\nX\u008A\u0084\u0002²\u0006\f\u0010\u0016\u001A\u00020\u00118\nX\u008A\u0084\u0002"}, d2 = {"", "BlogTwinBarGraphPreview", "(Landroidx/compose/runtime/Composer;I)V", "", "Lcom/kakao/tistory/presentation/common/graph/BarGraphItem;", "Lcom/kakao/tistory/presentation/common/graph/TweenBarGraphValue;", "entryItemList", "Landroidx/compose/ui/Modifier;", "modifier", "BlogTwinBarGraph", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "a", "Ljava/util/List;", "getBlogGraphDummyItem", "()Ljava/util/List;", "blogGraphDummyItem", "Landroidx/compose/ui/unit/Dp;", "viewWidth", "itemHeight", "", "showCount", "itemWidth", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogTwinBarGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogTwinBarGraph.kt\ncom/kakao/tistory/presentation/common/graph/BlogTwinBarGraphKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,192:1\n77#2:193\n1223#3,3:194\n1226#3,3:198\n1223#3,3:204\n1226#3,3:208\n1223#3,6:211\n1223#3,6:217\n1223#3,6:223\n1223#3,6:339\n148#4:197\n148#4:201\n148#4:202\n148#4:203\n148#4:207\n148#4:393\n71#5:229\n69#5,5:230\n74#5:263\n71#5:345\n69#5,5:346\n74#5:379\n78#5:383\n78#5:397\n78#6,6:235\n85#6,4:250\n89#6,2:260\n78#6,6:270\n85#6,4:285\n89#6,2:295\n78#6,6:310\n85#6,4:325\n89#6,2:335\n78#6,6:351\n85#6,4:366\n89#6,2:376\n93#6:382\n93#6:386\n93#6:391\n93#6:396\n78#6,6:405\n85#6,4:420\n89#6,2:430\n93#6:436\n368#7,9:241\n377#7:262\n368#7,9:276\n377#7:297\n368#7,9:316\n377#7:337\n368#7,9:357\n377#7:378\n378#7,2:380\n378#7,2:384\n378#7,2:389\n378#7,2:394\n368#7,9:411\n377#7:432\n378#7,2:434\n4032#8,6:254\n4032#8,6:289\n4032#8,6:329\n4032#8,6:370\n4032#8,6:424\n98#9:264\n96#9,5:265\n101#9:298\n105#9:392\n51#10,4:299\n56#10:388\n85#11:303\n82#11,6:304\n88#11:338\n92#11:387\n85#11:398\n82#11,6:399\n88#11:433\n92#11:437\n81#12:438\n107#12,2:439\n81#12:441\n107#12,2:442\n81#12:444\n81#12:445\n*S KotlinDebug\n*F\n+ 1 BlogTwinBarGraph.kt\ncom/kakao/tistory/presentation/common/graph/BlogTwinBarGraphKt\n*L\n98#1:193\n101#1:194,3\n101#1:198,3\n107#1:204,3\n107#1:208,3\n109#1:211,6\n110#1:217,6\n114#1:223,6\n141#1:339,6\n101#1:197\n103#1:201\n104#1:202\n106#1:203\n107#1:207\n158#1:393\n112#1:229\n112#1:230,5\n112#1:263\n137#1:345\n137#1:346,5\n137#1:379\n137#1:383\n112#1:397\n112#1:235,6\n112#1:250,4\n112#1:260,2\n121#1:270,6\n121#1:285,4\n121#1:295,2\n127#1:310,6\n127#1:325,4\n127#1:335,2\n137#1:351,6\n137#1:366,4\n137#1:376,2\n137#1:382\n127#1:386\n121#1:391\n112#1:396\n164#1:405,6\n164#1:420,4\n164#1:430,2\n164#1:436\n112#1:241,9\n112#1:262\n121#1:276,9\n121#1:297\n127#1:316,9\n127#1:337\n137#1:357,9\n137#1:378\n137#1:380,2\n127#1:384,2\n121#1:389,2\n112#1:394,2\n164#1:411,9\n164#1:432\n164#1:434,2\n112#1:254,6\n121#1:289,6\n127#1:329,6\n137#1:370,6\n164#1:424,6\n121#1:264\n121#1:265,5\n121#1:298\n121#1:392\n126#1:299,4\n126#1:388\n127#1:303\n127#1:304,6\n127#1:338\n127#1:387\n164#1:398\n164#1:399,6\n164#1:433\n164#1:437\n101#1:438\n101#1:439,2\n107#1:441\n107#1:442,2\n109#1:444\n110#1:445\n*E\n"})
public final class BlogTwinBarGraphKt {
    public static final List a;

    static {
        BlogTwinBarGraphKt.a = CollectionsKt__CollectionsKt.mutableListOf(new BarGraphItem[]{new BarGraphItem("오늘", "", null, new TweenBarGraphValue(10.0f, 20.0f), 4, null), new BarGraphItem("6", "", null, new TweenBarGraphValue(20.0f, 30.0f), 4, null), new BarGraphItem("5", "", null, new TweenBarGraphValue(30.0f, 40.0f), 4, null), new BarGraphItem("4", "목", null, new TweenBarGraphValue(0.0f, 0.0f), 4, null), new BarGraphItem("3", "", null, new TweenBarGraphValue(0.0f, 0.0f), 4, null), new BarGraphItem("2", "", null, new TweenBarGraphValue(0.0f, 0.0f), 4, null), new BarGraphItem("1", "", null, new TweenBarGraphValue(20.0f, 40.0f), 4, null)});
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogTwinBarGraph(@NotNull List list0, @Nullable Modifier modifier0, @Nullable Composer composer0, int v, int v1) {
        BoxScopeInstance boxScopeInstance1;
        Intrinsics.checkNotNullParameter(list0, "entryItemList");
        Composer composer1 = composer0.startRestartGroup(1240010858);
        Modifier modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1240010858, v, -1, "com.kakao.tistory.presentation.common.graph.BlogTwinBarGraph (BlogTwinBarGraph.kt:96)");
        }
        Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
        TweenBarGraphValue tweenBarGraphValue0 = TistoryBarGraphKt.tweenBarGraphSingleMaxValue(list0);
        composer1.startReplaceGroup(0x92054BDB);
        MutableState mutableState0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Dp.box-impl(0.0f), null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x92055D7B);
        MutableState mutableState1 = composer1.rememberedValue();
        if(mutableState1 == composer$Companion0.getEmpty()) {
            mutableState1 = SnapshotStateKt.mutableStateOf$default(Dp.box-impl(0.0f), null, 2, null);
            composer1.updateRememberedValue(mutableState1);
        }
        State state0 = b.a(composer1, 0x920564BA);
        if(state0 == composer$Companion0.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new i(list0, 40.0f, mutableState0));
            composer1.updateRememberedValue(state0);
        }
        State state1 = b.a(composer1, 0x92057360);
        if(state1 == composer$Companion0.getEmpty()) {
            state1 = SnapshotStateKt.derivedStateOf(new h(mutableState0, state0));
            composer1.updateRememberedValue(state1);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x9205855E);
        boolean z = composer1.changed(density0);
        e e0 = composer1.rememberedValue();
        if(z || e0 == composer$Companion0.getEmpty()) {
            e0 = new e(density0, 40.0f, mutableState0);
            composer1.updateRememberedValue(e0);
        }
        composer1.endReplaceGroup();
        Modifier modifier2 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier1, e0);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getBottomCenter(), false);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function20);
        }
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
        BlogTwinBarGraphKt.a(((Dp)mutableState1.getValue()).unbox-impl(), 10.0f, null, composer1, 0x30, 4);
        Modifier modifier4 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), alignment$Companion0.getTop(), composer1, 6);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
        r0.a.z(composeUiNode$Companion0, composer1, modifier5, composer1, 1377758036);
        List list1 = CollectionsKt___CollectionsKt.take(list0, ((Number)state0.getValue()).intValue());
        int v4 = list1.size() - 1;
        if(v4 >= 0) {
            while(true) {
                BarGraphItem barGraphItem0 = (BarGraphItem)list1.get(v4);
                androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
                Modifier modifier6 = SizeKt.fillMaxHeight$default(SizeKt.width-3ABfNKs(modifier$Companion0, ((Dp)state1.getValue()).unbox-impl()), 0.0f, 1, null);
                androidx.compose.ui.Alignment.Companion alignment$Companion1 = Alignment.Companion;
                MeasurePolicy measurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion1.getCenterHorizontally(), composer1, 0x30);
                int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
                androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion1 = ComposeUiNode.Companion;
                Function0 function02 = composeUiNode$Companion1.getConstructor();
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
                Function2 function22 = a.a(composeUiNode$Companion1, composer1, measurePolicy2, composer1, compositionLocalMap2);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                    d.a(v5, composer1, v5, function22);
                }
                Updater.set-impl(composer1, modifier7, composeUiNode$Companion1.getSetModifier());
                BlogTwinBarGraphKt.a(barGraphItem0.getLabel(), composer1, 0);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 10.0f), composer1, 6);
                Modifier modifier8 = SizeKt.width-3ABfNKs(modifier$Companion0, ((Dp)state1.getValue()).unbox-impl());
                Modifier modifier9 = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, modifier8, 1.0f, false, 2, null);
                composer1.startReplaceGroup(-2061417270);
                boolean z1 = composer1.changed(density0);
                f f0 = composer1.rememberedValue();
                if(z1 || f0 == Composer.Companion.getEmpty()) {
                    f0 = new f(density0, mutableState1);
                    composer1.updateRememberedValue(f0);
                }
                composer1.endReplaceGroup();
                Modifier modifier10 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier9, f0);
                MeasurePolicy measurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion1.getBottomCenter(), false);
                int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier11 = ComposedModifierKt.materializeModifier(composer1, modifier10);
                Function0 function03 = composeUiNode$Companion1.getConstructor();
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function03);
                }
                else {
                    composer1.useNode();
                }
                Function2 function23 = a.a(composeUiNode$Companion1, composer1, measurePolicy3, composer1, compositionLocalMap3);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                    d.a(v6, composer1, v6, function23);
                }
                Updater.set-impl(composer1, modifier11, composeUiNode$Companion1.getSetModifier());
                boxScopeInstance1 = boxScopeInstance0;
                TistoryBarGraphKt.TwinBarGraph-jA1GFJw(false, ((TweenBarGraphValue)barGraphItem0.getValue()), tweenBarGraphValue0, 0L, 0L, composer1, 0xC00, 17);
                composer1.endNode();
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 10.0f), composer1, 6);
                composer1.endNode();
                if(v4 - 1 < 0) {
                    break;
                }
                boxScopeInstance0 = boxScopeInstance1;
                --v4;
            }
        }
        else {
            boxScopeInstance1 = boxScopeInstance0;
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        DividerKt.HorizontalDivider-9IZ8Weo(boxScopeInstance1.align(Modifier.Companion, Alignment.Companion.getBottomCenter()), 1.0f, 0L, composer1, 0x1B0, 0);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(list0, modifier1, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(heightDp = 200, showBackground = true, widthDp = 200)
    public static final void BlogTwinBarGraphPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x46D9F5ED);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x46D9F5ED, v, -1, "com.kakao.tistory.presentation.common.graph.BlogTwinBarGraphPreview (BlogTwinBarGraph.kt:83)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogTwinBarGraphKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j(v));
        }
    }

    public static final void a(float f, float f1, Modifier modifier0, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-1512624609);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(f1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1512624609, v2, -1, "com.kakao.tistory.presentation.common.graph.BlogGraphBackgroundGraduation (BlogTwinBarGraph.kt:162)");
            }
            Modifier modifier3 = SizeKt.height-3ABfNKs(PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, f1, 7, null), f);
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
            TistoryBarGraphKt.DottedLine(null, composer1, 0, 1);
            SpacerKt.Spacer(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.Companion, 1.0f, false, 2, null), composer1, 0);
            TistoryBarGraphKt.DottedLine(null, composer1, 0, 1);
            SpacerKt.Spacer(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.Companion, 1.0f, false, 2, null), composer1, 0);
            TistoryBarGraphKt.DottedLine(null, composer1, 0, 1);
            SpacerKt.Spacer(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, Modifier.Companion, 1.0f, false, 2, null), composer1, 0);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(f, f1, modifier1, v, v1));
        }
    }

    public static final void a(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xE16E03DD);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE16E03DD, v1, -1, "com.kakao.tistory.presentation.common.graph.BlogGraphLabel (BlogTwinBarGraph.kt:180)");
            }
            TextKt.Text--4IGK_g(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141400000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141400000L, null, null, null, 0, 0, null, 0xFDFFD9, null), composer1, v1 & 14 | 0x180, 0, 0xFFFA);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.common.graph.d(s, v));
        }
    }

    public static final float access$BlogTwinBarGraph$lambda$1(MutableState mutableState0) {
        return ((Dp)mutableState0.getValue()).unbox-impl();
    }

    public static final void access$BlogTwinBarGraph$lambda$2(MutableState mutableState0, float f) {
        mutableState0.setValue(Dp.box-impl(f));
    }

    public static final void access$BlogTwinBarGraph$lambda$5(MutableState mutableState0, float f) {
        mutableState0.setValue(Dp.box-impl(f));
    }

    public static final int access$BlogTwinBarGraph$lambda$7(State state0) {
        return ((Number)state0.getValue()).intValue();
    }

    @NotNull
    public static final List getBlogGraphDummyItem() {
        return BlogTwinBarGraphKt.a;
    }
}

