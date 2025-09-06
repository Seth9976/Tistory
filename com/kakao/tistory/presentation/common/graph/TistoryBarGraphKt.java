package com.kakao.tistory.presentation.common.graph;

import a;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import b;
import c;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import d;
import e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u001A}\u0010\u0013\u001A\u00020\r\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\u0012\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B2\u0017\u0010\u0010\u001A\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u000B\u00A2\u0006\u0002\b\u000FH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A$\u0010\u0019\u001A\u00020\r2\u0006\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0016\u001A\u00020\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0017\u0010\u0018\u001A@\u0010!\u001A\u00020\r2\b\b\u0002\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u001B\u001A\u00020\u001A2\u0006\u0010\u001C\u001A\u00020\u001A2\b\b\u0002\u0010\u001D\u001A\u00020\b2\b\b\u0002\u0010\u001E\u001A\u00020\bH\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u001F\u0010 \u001A\u0019\u0010\"\u001A\u00020\r2\b\b\u0002\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\"\u0010#\u001A\u001D\u0010%\u001A\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001A0\u00060$\u00A2\u0006\u0004\b%\u0010&\u001A\u001D\u0010\'\u001A\u00020\u001A*\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001A0\u00060$\u00A2\u0006\u0004\b\'\u0010&\u001A\u001F\u0010+\u001A\u00020(*\u00020(2\f\u0010*\u001A\b\u0012\u0004\u0012\u00020(0)\u00A2\u0006\u0004\b+\u0010,\u001A\u001C\u00100\u001A\u00020\u0014*\u00020\u00142\u0006\u0010-\u001A\u00020\u0014\u00F8\u0001\u0000\u00A2\u0006\u0004\b.\u0010/\"#\u00106\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001A0\u0006018\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105\"#\u00109\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001A0\u0006018\u0006\u00A2\u0006\f\n\u0004\b7\u00103\u001A\u0004\b8\u00105\"#\u0010=\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u0006018\u0006\u00A2\u0006\f\n\u0004\b;\u00103\u001A\u0004\b<\u00105\"#\u0010@\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\u0006018\u0006\u00A2\u0006\f\n\u0004\b>\u00103\u001A\u0004\b?\u00105\u0082\u0002\u0007\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006C\u00B2\u0006\u000E\u0010A\u001A\u00020\u00148\n@\nX\u008A\u008E\u0002\u00B2\u0006\f\u0010B\u001A\u00020(8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/common/graph/BarGraphValue;", "T", "Landroidx/compose/ui/Modifier;", "modifier", "", "isSelected", "Lcom/kakao/tistory/presentation/common/graph/BarGraphItem;", "entryItem", "Landroidx/compose/ui/graphics/Color;", "labelColor", "selectedLabelColor", "Lkotlin/Function1;", "Lcom/kakao/tistory/presentation/common/graph/GraphPeriod;", "", "onClick", "Landroidx/compose/runtime/Composable;", "content", "TistoryBarGraphItem-vRFhKjU", "(Landroidx/compose/ui/Modifier;ZLcom/kakao/tistory/presentation/common/graph/BarGraphItem;JJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TistoryBarGraphItem", "Landroidx/compose/ui/unit/Dp;", "height", "graphBottomSpace", "TistoryGraphBackgroundGraduation-ixp7dh8", "(FFLandroidx/compose/runtime/Composer;II)V", "TistoryGraphBackgroundGraduation", "Lcom/kakao/tistory/presentation/common/graph/TweenBarGraphValue;", "value", "maxValue", "firstBarColor", "secondBarColor", "TwinBarGraph-jA1GFJw", "(ZLcom/kakao/tistory/presentation/common/graph/TweenBarGraphValue;Lcom/kakao/tistory/presentation/common/graph/TweenBarGraphValue;JJLandroidx/compose/runtime/Composer;II)V", "TwinBarGraph", "DottedLine", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "tweenBarGraphMaxValue", "(Ljava/util/List;)Lcom/kakao/tistory/presentation/common/graph/TweenBarGraphValue;", "tweenBarGraphSingleMaxValue", "", "Lkotlin/Function0;", "defaultValue", "ifNaN", "(FLkotlin/jvm/functions/Function0;)F", "otherValue", "maxOrZero-YgX7TsA", "(FF)F", "maxOrZero", "", "a", "Ljava/util/List;", "getDummyItem", "()Ljava/util/List;", "dummyItem", "b", "getDummyItem1", "dummyItem1", "Lcom/kakao/tistory/presentation/common/graph/StatisticsBarGraphValue;", "c", "getStatisticsDummyItem", "statisticsDummyItem", "d", "getStatisticsDummyItem1", "statisticsDummyItem1", "barMaxHeight", "alphaValue", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryBarGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryBarGraph.kt\ncom/kakao/tistory/presentation/common/graph/TistoryBarGraphKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,487:1\n148#2:488\n148#2:524\n148#2:561\n148#2:594\n148#2:599\n148#2:647\n148#2:649\n148#2:686\n148#2:691\n148#2:695\n148#2:744\n148#2:749\n148#2:750\n148#2:786\n148#2:824\n148#2:833\n148#2:834\n148#2:835\n186#2:836\n71#3:489\n69#3,5:490\n74#3:523\n71#3:600\n69#3,5:601\n74#3:634\n78#3:638\n78#3:646\n71#3:751\n69#3,5:752\n74#3:785\n78#3:832\n78#4,6:495\n85#4,4:510\n89#4,2:520\n78#4,6:532\n85#4,4:547\n89#4,2:557\n78#4,6:565\n85#4,4:580\n89#4,2:590\n93#4:597\n78#4,6:606\n85#4,4:621\n89#4,2:631\n93#4:637\n93#4:641\n93#4:645\n78#4,6:657\n85#4,4:672\n89#4,2:682\n93#4:689\n78#4,6:715\n85#4,4:730\n89#4,2:740\n93#4:747\n78#4,6:757\n85#4,4:772\n89#4,2:782\n78#4,6:795\n85#4,4:810\n89#4,2:820\n93#4:827\n93#4:831\n368#5,9:501\n377#5:522\n368#5,9:538\n377#5:559\n368#5,9:571\n377#5:592\n378#5,2:595\n368#5,9:612\n377#5:633\n378#5,2:635\n378#5,2:639\n378#5,2:643\n368#5,9:663\n377#5:684\n378#5,2:687\n368#5,9:721\n377#5:742\n378#5,2:745\n368#5,9:763\n377#5:784\n368#5,9:801\n377#5:822\n378#5,2:825\n378#5,2:829\n4032#6,6:514\n4032#6,6:551\n4032#6,6:584\n4032#6,6:625\n4032#6,6:676\n4032#6,6:734\n4032#6,6:776\n4032#6,6:814\n85#7:525\n82#7,6:526\n88#7:560\n85#7,3:562\n88#7:593\n92#7:598\n92#7:642\n85#7:650\n82#7,6:651\n88#7:685\n92#7:690\n85#7:787\n81#7,7:788\n88#7:823\n92#7:828\n50#8:648\n83#8:700\n83#8:701\n1223#9,3:692\n1226#9,3:696\n1223#9,6:702\n77#10:699\n98#11:708\n95#11,6:709\n101#11:743\n105#11:748\n81#12:837\n107#12,2:838\n81#12:840\n1549#13:841\n1620#13,3:842\n1549#13:845\n1620#13,3:846\n*S KotlinDebug\n*F\n+ 1 TistoryBarGraph.kt\ncom/kakao/tistory/presentation/common/graph/TistoryBarGraphKt\n*L\n231#1:488\n248#1:524\n254#1:561\n264#1:594\n271#1:599\n285#1:647\n290#1:649\n298#1:686\n311#1:691\n315#1:695\n337#1:744\n350#1:749\n399#1:750\n402#1:786\n410#1:824\n444#1:833\n482#1:834\n483#1:835\n485#1:836\n233#1:489\n233#1:490,5\n233#1:523\n273#1:600\n273#1:601,5\n273#1:634\n273#1:638\n233#1:646\n399#1:751\n399#1:752,5\n399#1:785\n399#1:832\n233#1:495,6\n233#1:510,4\n233#1:520,2\n245#1:532,6\n245#1:547,4\n245#1:557,2\n253#1:565,6\n253#1:580,4\n253#1:590,2\n253#1:597\n273#1:606,6\n273#1:621,4\n273#1:631,2\n273#1:637\n245#1:641\n233#1:645\n286#1:657,6\n286#1:672,4\n286#1:682,2\n286#1:689\n324#1:715,6\n324#1:730,4\n324#1:740,2\n324#1:747\n399#1:757,6\n399#1:772,4\n399#1:782,2\n409#1:795,6\n409#1:810,4\n409#1:820,2\n409#1:827\n399#1:831\n233#1:501,9\n233#1:522\n245#1:538,9\n245#1:559\n253#1:571,9\n253#1:592\n253#1:595,2\n273#1:612,9\n273#1:633\n273#1:635,2\n245#1:639,2\n233#1:643,2\n286#1:663,9\n286#1:684\n286#1:687,2\n324#1:721,9\n324#1:742\n324#1:745,2\n399#1:763,9\n399#1:784\n409#1:801,9\n409#1:822\n409#1:825,2\n399#1:829,2\n233#1:514,6\n245#1:551,6\n253#1:584,6\n273#1:625,6\n286#1:676,6\n324#1:734,6\n399#1:776,6\n409#1:814,6\n245#1:525\n245#1:526,6\n245#1:560\n253#1:562,3\n253#1:593\n253#1:598\n245#1:642\n286#1:650\n286#1:651,6\n286#1:685\n286#1:690\n409#1:787\n409#1:788,7\n409#1:823\n409#1:828\n289#1:648\n321#1:700\n322#1:701\n315#1:692,3\n315#1:696,3\n327#1:702,6\n316#1:699\n324#1:708\n324#1:709,6\n324#1:743\n324#1:748\n315#1:837\n315#1:838,2\n391#1:840\n98#1:841\n98#1:842,3\n177#1:845\n177#1:846,3\n*E\n"})
public final class TistoryBarGraphKt {
    public static final List a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        List list0 = CollectionsKt__CollectionsKt.mutableListOf(new BarGraphItem[]{new BarGraphItem("1", "월", null, new TweenBarGraphValue(10.0f, 20.0f), 4, null), new BarGraphItem("2", "화", null, new TweenBarGraphValue(20.0f, 30.0f), 4, null), new BarGraphItem("3", "수", null, new TweenBarGraphValue(30.0f, 40.0f), 4, null), new BarGraphItem("4", "목", null, new TweenBarGraphValue(0.0f, 0.0f), 4, null)});
        IntRange intRange0 = new IntRange(0, 200);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(intRange0, 10));
        Iterator iterator0 = intRange0.iterator();
        while(iterator0.hasNext()) {
            ((IntIterator)iterator0).nextInt();
            arrayList0.add(new BarGraphItem("1", "월", null, new TweenBarGraphValue(10.0f, 20.0f), 4, null));
        }
        list0.addAll(arrayList0);
        TistoryBarGraphKt.a = list0;
        TistoryBarGraphKt.b = CollectionsKt__CollectionsKt.mutableListOf(new BarGraphItem[]{new BarGraphItem("4", "월", null, new TweenBarGraphValue(10.0f, 20.0f), 4, null), new BarGraphItem("5", "화", null, new TweenBarGraphValue(20.0f, 30.0f), 4, null), new BarGraphItem("6", "수", null, new TweenBarGraphValue(80.0f, 100.0f), 4, null)});
        List list1 = CollectionsKt__CollectionsKt.mutableListOf(new BarGraphItem[]{new BarGraphItem("1", "월", null, new StatisticsBarGraphValue(30.0f, 20.0f, 10.0f), 4, null), new BarGraphItem("2", "화", null, new StatisticsBarGraphValue(10.0f, 0.0f, 30.0f), 4, null), new BarGraphItem("3", "수", null, new StatisticsBarGraphValue(10.0f, 0.0f, 0.0f), 4, null), new BarGraphItem("4", "목", null, new StatisticsBarGraphValue(0.0f, 0.0f, 0.0f), 4, null)});
        IntRange intRange1 = new IntRange(0, 200);
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(intRange1, 10));
        Iterator iterator1 = intRange1.iterator();
        while(iterator1.hasNext()) {
            ((IntIterator)iterator1).nextInt();
            arrayList1.add(new BarGraphItem("1", "월", null, new StatisticsBarGraphValue(10.0f, 20.0f, 30.0f), 4, null));
        }
        list1.addAll(arrayList1);
        TistoryBarGraphKt.c = list1;
        TistoryBarGraphKt.d = CollectionsKt__CollectionsKt.mutableListOf(new BarGraphItem[]{new BarGraphItem("4", "월", null, new StatisticsBarGraphValue(10.0f, 20.0f, 30.0f), 4, null), new BarGraphItem("5", "화", null, new StatisticsBarGraphValue(10.0f, 20.0f, 30.0f), 4, null), new BarGraphItem("6", "수", null, new StatisticsBarGraphValue(50.0f, 60.0f, 70.0f), 4, null)});
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DottedLine(@Nullable Modifier modifier0, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x306C7121);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x306C7121, v2, -1, "com.kakao.tistory.presentation.common.graph.DottedLine (TistoryBarGraph.kt:439)");
            }
            CanvasKt.Canvas(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier0, 0.0f, 1, null), 1.0f), r0.a, composer1, 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s0(modifier0, v, v1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TistoryBarGraphItem-vRFhKjU(@Nullable Modifier modifier0, boolean z, @NotNull BarGraphItem barGraphItem0, long v, long v1, @NotNull Function1 function10, @NotNull Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        boolean z1;
        long v6;
        Modifier modifier1;
        long v5;
        int v4;
        Intrinsics.checkNotNullParameter(barGraphItem0, "entryItem");
        Intrinsics.checkNotNullParameter(function10, "onClick");
        Intrinsics.checkNotNullParameter(function30, "content");
        Composer composer1 = composer0.startRestartGroup(0x7F62EAD);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(barGraphItem0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((v3 & 16) == 0) {
            v5 = v1;
            if((v2 & 0xE000) == 0) {
                v4 |= (composer1.changed(v5) ? 0x4000 : 0x2000);
            }
        }
        else {
            v4 |= 0x6000;
            v5 = v1;
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v4 |= (composer1.changedInstance(function10) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v4 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x2DB6DB) != 0x92492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
            boolean z2 = (v3 & 2) == 0 ? z : false;
            if((v3 & 16) != 0) {
                v5 = 0L;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7F62EAD, v4, -1, "com.kakao.tistory.presentation.common.graph.TistoryBarGraphItem (TistoryBarGraph.kt:229)");
            }
            modifier1 = modifier2;
            Modifier modifier3 = SizeKt.fillMaxHeight$default(SizeKt.width-3ABfNKs(ModifierKt.noRippleClickable(modifier2, new u0(function10, barGraphItem0)), (z2 ? 60.0f : 44.0f)), 0.0f, 1, null);
            Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopCenter(), false);
            int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                d.a(v7, composer1, v7, function20);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            int v8 = v4 >> 3 & 14;
            TistoryBarGraphKt.a(z2, composer1, v8);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier5 = SizeKt.fillMaxHeight$default(PaddingKt.padding-VpY3zN4$default(SizeKt.width-3ABfNKs(modifier$Companion0, (z2 ? 60.0f : 44.0f)), 0.0f, 16.0f, 1, null), 0.0f, 1, null);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getCenterHorizontally(), composer1, 0x30);
            int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
                d.a(v9, composer1, v9, function21);
            }
            Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
            ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
            Modifier modifier7 = SizeKt.size-3ABfNKs(modifier$Companion0, 44.0f);
            MeasurePolicy measurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getCenterHorizontally(), composer1, 54);
            int v10 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier8 = ComposedModifierKt.materializeModifier(composer1, modifier7);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v10)) {
                d.a(v10, composer1, v10, function22);
            }
            Updater.set-impl(composer1, modifier8, composeUiNode$Companion0.getSetModifier());
            TistoryBarGraphKt.a(z2, barGraphItem0.getLabel(), v, v5, composer1, v4 >> 3 & 8078, 0);
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 4.0f), composer1, 6);
            TistoryBarGraphKt.a(z2, barGraphItem0.getSubLabel(), composer1, v8, 0);
            composer1.endNode();
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 4.0f), composer1, 6);
            Modifier modifier9 = ColumnScope.weight$default(columnScopeInstance0, modifier$Companion0, 1.0f, false, 2, null);
            MeasurePolicy measurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getBottomCenter(), false);
            int v11 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier10 = ComposedModifierKt.materializeModifier(composer1, modifier9);
            Function0 function03 = composeUiNode$Companion0.getConstructor();
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
            Function2 function23 = a.a(composeUiNode$Companion0, composer1, measurePolicy3, composer1, compositionLocalMap3);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v11)) {
                d.a(v11, composer1, v11, function23);
            }
            Updater.set-impl(composer1, modifier10, composeUiNode$Companion0.getSetModifier());
            function30.invoke(barGraphItem0.getValue(), composer1, ((int)(v4 >> 15 & 0x70)));
            composer1.endNode();
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z1 = z2;
            v6 = v5;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            v6 = v5;
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v0(modifier1, z1, barGraphItem0, v, v6, function10, function30, v2, v3));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TistoryGraphBackgroundGraduation-ixp7dh8(float f, float f1, @Nullable Composer composer0, int v, int v1) {
        float f2;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x2F0CCCD8);
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
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            f2 = (v1 & 2) == 0 ? f1 : 16.0f;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2F0CCCD8, v2, -1, "com.kakao.tistory.presentation.common.graph.TistoryGraphBackgroundGraduation (TistoryBarGraph.kt:284)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), f + f2), 0.0f, 0.0f, 0.0f, 6.0f, 7, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
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
            TistoryBarGraphKt.DottedLine(null, composer1, 0, 1);
            SpacerKt.Spacer(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
            TistoryBarGraphKt.DottedLine(null, composer1, 0, 1);
            SpacerKt.Spacer(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
            TistoryBarGraphKt.DottedLine(null, composer1, 0, 1);
            SpacerKt.Spacer(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
            b.a(10.0f, modifier$Companion0, composer1, 6);
            DividerKt.Divider-oMI9zvI(null, 0L, 0.0f, 0.0f, composer1, 0x30, 13);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            f2 = f1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x0(f, f2, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TwinBarGraph-jA1GFJw(boolean z, @NotNull TweenBarGraphValue tweenBarGraphValue0, @NotNull TweenBarGraphValue tweenBarGraphValue1, long v, long v1, @Nullable Composer composer0, int v2, int v3) {
        long v6;
        long v5;
        boolean z1;
        int v4;
        Intrinsics.checkNotNullParameter(tweenBarGraphValue0, "value");
        Intrinsics.checkNotNullParameter(tweenBarGraphValue1, "maxValue");
        Composer composer1 = composer0.startRestartGroup(0x9E25F2F5);
        if((v3 & 1) != 0) {
            v4 = v2 | 6;
            z1 = z;
        }
        else if((v2 & 14) == 0) {
            z1 = z;
            v4 = (composer1.changed(z1) ? 4 : 2) | v2;
        }
        else {
            z1 = z;
            v4 = v2;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(tweenBarGraphValue0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(tweenBarGraphValue1) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v4 |= (composer1.changed(v1) ? 0x4000 : 0x2000);
        }
        if((v4 & 0xB6DB) != 9362 || !composer1.getSkipping()) {
            if((v3 & 1) != 0) {
                z1 = false;
            }
            long v7 = (v3 & 8) == 0 ? v : 0L;
            v6 = (v3 & 16) == 0 ? v1 : 0L;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9E25F2F5, v4, -1, "com.kakao.tistory.presentation.common.graph.TwinBarGraph (TistoryBarGraph.kt:309)");
            }
            composer1.startReplaceGroup(0xBC64DF39);
            MutableState mutableState0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Dp.box-impl(0.0f), null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            float f = TistoryBarGraphKt.ifNaN(tweenBarGraphValue0.getFirstBarValue() / tweenBarGraphValue1.getFirstBarValue(), a1.a);
            float f1 = TistoryBarGraphKt.ifNaN(tweenBarGraphValue0.getSecondBarValue() / tweenBarGraphValue1.getSecondBarValue(), b1.a);
            float f2 = Dp.constructor-impl(((Dp)mutableState0.getValue()).unbox-impl() * f);
            float f3 = Dp.constructor-impl(((Dp)mutableState0.getValue()).unbox-impl() * f1);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxHeight$default(modifier$Companion0, 0.0f, 1, null);
            composer1.startReplaceGroup(0xBC65172E);
            boolean z2 = composer1.changed(density0);
            y0 y00 = composer1.rememberedValue();
            if(z2 || y00 == composer$Companion0.getEmpty()) {
                y00 = new y0(density0, mutableState0);
                composer1.updateRememberedValue(y00);
            }
            composer1.endReplaceGroup();
            Modifier modifier1 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier0, y00);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getBottom(), composer1, 0x30);
            int v8 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v8)) {
                d.a(v8, composer1, v8, function20);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            TistoryBarGraphKt.a((z1 ? 6.0f : 4.0f), TistoryBarGraphKt.maxOrZero-YgX7TsA(f2, (z1 ? 6.0f : 4.0f)), Color.copy-wmQWz5c$default(v7, (z1 ? 1.0f : 0.75f), 0.0f, 0.0f, 0.0f, 14, null), composer1, 0);
            c.a(4.0f, modifier$Companion0, composer1, 6);
            TistoryBarGraphKt.a((z1 ? 6.0f : 4.0f), TistoryBarGraphKt.maxOrZero-YgX7TsA(f3, (z1 ? 6.0f : 4.0f)), Color.copy-wmQWz5c$default(v6, (z1 ? 1.0f : 0.75f), 0.0f, 0.0f, 0.0f, 14, null), composer1, 0);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            v5 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            v5 = v;
            v6 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z0(z1, tweenBarGraphValue0, tweenBarGraphValue1, v5, v6, v2, v3));
        }
    }

    public static final void a(float f, float f1, long v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xB07B0106);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(f) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(f1) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB07B0106, v2, -1, "com.kakao.tistory.presentation.common.graph.GraphBar (TistoryBarGraph.kt:346)");
            }
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(70.0f);
            BoxKt.Box(SizeKt.height-3ABfNKs(SizeKt.width-3ABfNKs(AnimationModifierKt.animateContentSize$default(BackgroundKt.background-bw27NRU$default(ClipKt.clip(Modifier.Companion, roundedCornerShape0), v, null, 2, null), null, null, 3, null), f), f1), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t0(f, f1, v, v1));
        }
    }

    public static final void a(boolean z, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x10713806);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x10713806, v1, -1, "com.kakao.tistory.presentation.common.graph.TistoryBarGraphItemBackground (TistoryBarGraph.kt:358)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, null, EnterExitTransitionKt.scaleIn-L8ZKh-E$default(AnimationSpecKt.tween$default(200, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 0L, 6, null), EnterExitTransitionKt.scaleOut-L8ZKh-E$default(AnimationSpecKt.tween$default(200, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 0L, 6, null), null, ComposableSingletons.TistoryBarGraphKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, v1 & 14 | 0x30000, 18);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w0(z, v));
        }
    }

    public static final void a(boolean z, String s, long v, long v1, Composer composer0, int v2, int v3) {
        long v5;
        boolean z1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(1136167220);
        if((v3 & 1) != 0) {
            v4 = v2 | 6;
            z1 = z;
        }
        else if((v2 & 14) == 0) {
            z1 = z;
            v4 = (composer1.changed(z1) ? 4 : 2) | v2;
        }
        else {
            z1 = z;
            v4 = v2;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            v5 = v1;
        }
        else if((v2 & 0x1C00) == 0) {
            v5 = v1;
            v4 |= (composer1.changed(v5) ? 0x800 : 0x400);
        }
        else {
            v5 = v1;
        }
        if((v4 & 5851) != 1170 || !composer1.getSkipping()) {
            if((v3 & 1) != 0) {
                z1 = false;
            }
            long v6 = (v3 & 8) == 0 ? v5 : 0L;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1136167220, v4, -1, "com.kakao.tistory.presentation.common.graph.BarGraphLabel (TistoryBarGraph.kt:388)");
            }
            State state0 = AnimateAsStateKt.animateFloatAsState((z1 ? 1.0f : 0.0f), AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, "", null, composer1, 0xC00, 20);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.width-3ABfNKs(modifier$Companion0, 44.0f);
            Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopCenter(), false);
            int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                d.a(v7, composer1, v7, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            BoxKt.Box(BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(modifier$Companion0, (z1 ? 28.0f : 0.0f)), Color.copy-wmQWz5c$default(v, ((Number)state0.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.getCircleShape()), composer1, 0);
            MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v8 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v8)) {
                d.a(v8, composer1, v8, function21);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 7.0f), composer1, 6);
            TextKt.Text--4IGK_g(s, null, (z1 ? v6 : 0L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141400000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141400000L, null, null, null, 0, 0, null, 0xFDFFD9, null), composer1, v4 >> 3 & 14, 0, 0xFFFA);
            if(e.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
            v5 = v6;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p0(z1, s, v, v5, v2, v3));
        }
    }

    public static final void a(boolean z, String s, Composer composer0, int v, int v1) {
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1050581748);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            z1 = z;
        }
        else if((v & 14) == 0) {
            z1 = z;
            v2 = (composer1.changed(z1) ? 4 : 2) | v;
        }
        else {
            z1 = z;
            v2 = v;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1050581748, v2, -1, "com.kakao.tistory.presentation.common.graph.BarGraphSubLabel (TistoryBarGraph.kt:425)");
            }
            TextKt.Text--4IGK_g(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141300000L, FontWeight.Companion.getLight(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141300000L, null, null, null, 0, 0, null, 0xFDFFD9, null), composer1, v2 >> 3 & 14, 0, 0xFFFA);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z1 = (v1 & 1) == 0 ? z1 : false;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q0(z1, s, v, v1));
        }
    }

    public static final void access$TwinBarGraph_jA1GFJw$lambda$11(MutableState mutableState0, float f) {
        mutableState0.setValue(Dp.box-impl(f));
    }

    @NotNull
    public static final List getDummyItem() {
        return TistoryBarGraphKt.a;
    }

    @NotNull
    public static final List getDummyItem1() {
        return TistoryBarGraphKt.b;
    }

    @NotNull
    public static final List getStatisticsDummyItem() {
        return TistoryBarGraphKt.c;
    }

    @NotNull
    public static final List getStatisticsDummyItem1() {
        return TistoryBarGraphKt.d;
    }

    public static final float ifNaN(float f, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "defaultValue");
        return Float.isNaN(f) ? ((Number)function00.invoke()).floatValue() : f;
    }

    // 去混淆评级： 低(20)
    public static final float maxOrZero-YgX7TsA(float f, float f1) {
        return Dp.equals-impl0(f, 0.0f) ? 0.0f : Math.max(f, f1);
    }

    @NotNull
    public static final TweenBarGraphValue tweenBarGraphMaxValue(@NotNull List list0) {
        Float float1;
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Iterator iterator0 = list0.iterator();
        Float float0 = null;
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            float f;
            for(f = ((TweenBarGraphValue)((BarGraphItem)object0).getValue()).getFirstBarValue(); iterator0.hasNext(); f = Math.max(f, ((TweenBarGraphValue)((BarGraphItem)object1).getValue()).getFirstBarValue())) {
                Object object1 = iterator0.next();
            }
            float1 = f;
        }
        else {
            float1 = null;
        }
        float f1 = 0.0f;
        float f2 = float1 == null ? 0.0f : ((float)float1);
        Iterator iterator1 = list0.iterator();
        if(iterator1.hasNext()) {
            Object object2 = iterator1.next();
            float f3;
            for(f3 = ((TweenBarGraphValue)((BarGraphItem)object2).getValue()).getSecondBarValue(); iterator1.hasNext(); f3 = Math.max(f3, ((TweenBarGraphValue)((BarGraphItem)object3).getValue()).getSecondBarValue())) {
                Object object3 = iterator1.next();
            }
            float0 = f3;
        }
        if(float0 != null) {
            f1 = (float)float0;
        }
        return new TweenBarGraphValue(f2, f1);
    }

    @NotNull
    public static final TweenBarGraphValue tweenBarGraphSingleMaxValue(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        TweenBarGraphValue tweenBarGraphValue0 = TistoryBarGraphKt.tweenBarGraphMaxValue(list0);
        float f = Math.max(tweenBarGraphValue0.getFirstBarValue(), tweenBarGraphValue0.getSecondBarValue());
        return new TweenBarGraphValue(f, f);
    }
}

