package com.kakao.tistory.presentation.common.graph;

import a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.paging.ItemSnapshotList;
import androidx.paging.compose.LazyPagingItems;
import d;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001A`\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000B2\u0018\u0010\r\u001A\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00010\u000EH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0012²\u0006\n\u0010\u0013\u001A\u00020\u0014X\u008A\u008E\u0002"}, d2 = {"RevenueTwinBarGraph", "", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "entryItemList", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/kakao/tistory/presentation/common/graph/BarGraphItem;", "Lcom/kakao/tistory/presentation/common/graph/TweenBarGraphValue;", "selectedPosition", "", "graphColor", "Landroidx/compose/ui/graphics/Color;", "selectedLabelColor", "onClick", "Lkotlin/Function2;", "Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;", "RevenueTwinBarGraph-jA1GFJw", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/paging/compose/LazyPagingItems;IJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease", "graphMaxHeight", "Landroidx/compose/ui/unit/Dp;"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRevenueTwinBarGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RevenueTwinBarGraph.kt\ncom/kakao/tistory/presentation/common/graph/RevenueTwinBarGraphKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,81:1\n77#2:82\n1223#3,3:83\n1226#3,3:87\n148#4:86\n148#4:125\n148#4:126\n71#5:90\n69#5,5:91\n74#5:124\n78#5:130\n78#6,6:96\n85#6,4:111\n89#6,2:121\n93#6:129\n368#7,9:102\n377#7:123\n378#7,2:127\n4032#8,6:115\n81#9:131\n107#9,2:132\n*S KotlinDebug\n*F\n+ 1 RevenueTwinBarGraph.kt\ncom/kakao/tistory/presentation/common/graph/RevenueTwinBarGraphKt\n*L\n36#1:82\n37#1:83,3\n37#1:87,3\n37#1:86\n46#1:125\n47#1:126\n39#1:90\n39#1:91,5\n39#1:124\n39#1:130\n39#1:96,6\n39#1:111,4\n39#1:121,2\n39#1:129\n39#1:102,9\n39#1:123\n39#1:127,2\n39#1:115,6\n37#1:131\n37#1:132,2\n*E\n"})
public final class RevenueTwinBarGraphKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void RevenueTwinBarGraph-jA1GFJw(@NotNull LazyListState lazyListState0, @NotNull LazyPagingItems lazyPagingItems0, int v, long v1, long v2, @NotNull Function2 function20, @Nullable Composer composer0, int v3) {
        int v6;
        Float float1;
        float f4;
        float f3;
        Float float0;
        float f1;
        float f;
        Intrinsics.checkNotNullParameter(lazyListState0, "lazyListState");
        Intrinsics.checkNotNullParameter(lazyPagingItems0, "entryItemList");
        Intrinsics.checkNotNullParameter(function20, "onClick");
        Composer composer1 = composer0.startRestartGroup(0xD912E2F5);
        int v4 = (v3 & 14) == 0 ? (composer1.changed(lazyListState0) ? 4 : 2) | v3 : v3;
        if((v3 & 0x70) == 0) {
            v4 |= (composer1.changed(lazyPagingItems0) ? 0x20 : 16);
        }
        if((v3 & 0x380) == 0) {
            v4 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v3 & 0x1C00) == 0) {
            v4 |= (composer1.changed(v1) ? 0x800 : 0x400);
        }
        if((0xE000 & v3) == 0) {
            v4 |= (composer1.changed(v2) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v3) == 0) {
            v4 |= (composer1.changedInstance(function20) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v4) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xD912E2F5, v4, -1, "com.kakao.tistory.presentation.common.graph.RevenueTwinBarGraph (RevenueTwinBarGraph.kt:22)");
            }
            ItemSnapshotList itemSnapshotList0 = lazyPagingItems0.getItemSnapshotList();
            Iterator iterator0 = itemSnapshotList0.iterator();
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(((BarGraphItem)object0) == null) {
                    f = 0.0f;
                }
                else {
                    TweenBarGraphValue tweenBarGraphValue0 = (TweenBarGraphValue)((BarGraphItem)object0).getValue();
                    f = tweenBarGraphValue0 == null ? 0.0f : tweenBarGraphValue0.getFirstBarValue();
                }
                while(iterator0.hasNext()) {
                    Object object1 = iterator0.next();
                    BarGraphItem barGraphItem0 = (BarGraphItem)object1;
                    if(barGraphItem0 == null) {
                        f1 = 0.0f;
                    }
                    else {
                        TweenBarGraphValue tweenBarGraphValue1 = (TweenBarGraphValue)barGraphItem0.getValue();
                        if(tweenBarGraphValue1 != null) {
                            f1 = tweenBarGraphValue1.getFirstBarValue();
                        }
                    }
                    f = Math.max(f, f1);
                }
                float0 = f;
            }
            else {
                float0 = null;
            }
            float f2 = float0 == null ? 0.0f : ((float)float0);
            Iterator iterator1 = itemSnapshotList0.iterator();
            if(iterator1.hasNext()) {
                Object object2 = iterator1.next();
                if(((BarGraphItem)object2) == null) {
                    f3 = 0.0f;
                }
                else {
                    TweenBarGraphValue tweenBarGraphValue2 = (TweenBarGraphValue)((BarGraphItem)object2).getValue();
                    f3 = tweenBarGraphValue2 == null ? 0.0f : tweenBarGraphValue2.getSecondBarValue();
                }
                while(iterator1.hasNext()) {
                    Object object3 = iterator1.next();
                    BarGraphItem barGraphItem1 = (BarGraphItem)object3;
                    if(barGraphItem1 == null) {
                        f4 = 0.0f;
                    }
                    else {
                        TweenBarGraphValue tweenBarGraphValue3 = (TweenBarGraphValue)barGraphItem1.getValue();
                        if(tweenBarGraphValue3 != null) {
                            f4 = tweenBarGraphValue3.getSecondBarValue();
                        }
                    }
                    f3 = Math.max(f3, f4);
                }
                float1 = f3;
            }
            else {
                float1 = null;
            }
            TweenBarGraphValue tweenBarGraphValue4 = new TweenBarGraphValue(f2, (float1 == null ? 0.0f : ((float)float1)));
            Object object4 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            composer1.startReplaceGroup(-844001045);
            MutableState mutableState0 = composer1.rememberedValue();
            if(mutableState0 == Composer.Companion.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Dp.box-impl(0.0f), null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getBottomCenter(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting()) {
                v6 = v4;
                d.a(v5, composer1, v5, function21);
            }
            else {
                v6 = v4;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                    d.a(v5, composer1, v5, function21);
                }
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            TistoryBarGraphKt.TistoryGraphBackgroundGraduation-ixp7dh8(((Dp)mutableState0.getValue()).unbox-impl(), 0.0f, composer1, 0, 2);
            LazyDslKt.LazyRow(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 210.0f), lazyListState0, PaddingKt.PaddingValues-YgX7TsA$default(20.0f, 0.0f, 2, null), true, null, null, null, false, new t(lazyPagingItems0, v, v1, v2, function20, ((Density)object4), mutableState0, tweenBarGraphValue4), composer1, v6 << 3 & 0x70 | 0xD86, 0xF0);
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
            scopeUpdateScope0.updateScope(new u(lazyListState0, lazyPagingItems0, v, v1, v2, function20, v3));
        }
    }

    public static final void access$RevenueTwinBarGraph_jA1GFJw$lambda$4(MutableState mutableState0, float f) {
        mutableState0.setValue(Dp.box-impl(f));
    }
}

