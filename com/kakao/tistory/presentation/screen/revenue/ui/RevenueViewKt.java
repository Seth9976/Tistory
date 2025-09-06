package com.kakao.tistory.presentation.screen.revenue.ui;

import a;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.common.graph.b;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.screen.item.Vendor;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A\u000F\u0010\u0003\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\u001A/\u0010\n\u001A\u00020\u00002\b\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001A\u00020\u00062\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00000\bH\u0007¢\u0006\u0004\b\n\u0010\u000B\u001A7\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u00000\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001A)\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\r\u001A\u00020\f2\u0006\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0016\u001A\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006!²\u0006\u000E\u0010\u001A\u001A\u00020\u00198\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u001B\u001A\u00020\u00198\n@\nX\u008A\u008E\u0002²\u0006\f\u0010\u001D\u001A\u00020\u001C8\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u001E\u001A\u00020\u00158\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010 \u001A\u00020\u001F8\n@\nX\u008A\u008E\u0002"}, d2 = {"", "GraphRangeTabBarPreview", "(Landroidx/compose/runtime/Composer;I)V", "AutoSizeTextPreview", "Lcom/kakao/tistory/presentation/screen/item/Vendor;", "vendor", "", "collapsedFraction", "Lkotlin/Function0;", "onClick", "SelectedAdBox", "(Lcom/kakao/tistory/presentation/screen/item/Vendor;FLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;", "selectedType", "Lkotlin/Function1;", "GraphPeriodTabBar", "(Landroidx/compose/ui/Modifier;Lcom/kakao/tistory/presentation/screen/revenue/ui/GraphPeriodType;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "text", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "AutoSizeText", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;II)V", "", "graphPeriodTabBarWidth", "selectedPosition", "Landroidx/compose/ui/unit/IntOffset;", "selectedBoxOffset", "scaledTextStyle", "", "readyToDraw", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRevenueView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RevenueView.kt\ncom/kakao/tistory/presentation/screen/revenue/ui/RevenueViewKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 12 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 13 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,265:1\n148#2:266\n148#2:267\n168#2:343\n168#2:344\n168#2:345\n148#2:346\n148#2:347\n148#2:348\n148#2:349\n148#2:386\n148#2:387\n148#2:388\n148#2:398\n148#2:399\n148#2:400\n148#2:401\n148#2:528\n148#2:529\n148#2:530\n71#3:268\n69#3,5:269\n74#3:302\n78#3:306\n71#3:408\n68#3,6:409\n74#3:443\n78#3:497\n71#3:531\n69#3,5:532\n74#3:565\n78#3:569\n78#4,6:274\n85#4,4:289\n89#4,2:299\n93#4:305\n78#4,6:314\n85#4,4:329\n89#4,2:339\n78#4,6:357\n85#4,4:372\n89#4,2:382\n93#4:391\n93#4:395\n78#4,6:415\n85#4,4:430\n89#4,2:440\n78#4,6:452\n85#4,4:467\n89#4,2:477\n93#4:492\n93#4:496\n78#4,6:537\n85#4,4:552\n89#4,2:562\n93#4:568\n368#5,9:280\n377#5:301\n378#5,2:303\n368#5,9:320\n377#5:341\n368#5,9:363\n377#5:384\n378#5,2:389\n378#5,2:393\n368#5,9:421\n377#5:442\n368#5,9:458\n377#5:479\n378#5,2:490\n378#5,2:494\n368#5,9:543\n377#5:564\n378#5,2:566\n4032#6,6:293\n4032#6,6:333\n4032#6,6:376\n4032#6,6:434\n4032#6,6:471\n4032#6,6:556\n85#7:307\n82#7,6:308\n88#7:342\n92#7:396\n98#8:350\n95#8,6:351\n101#8:385\n105#8:392\n98#8:445\n95#8,6:446\n101#8:480\n105#8:493\n77#9:397\n1223#10,6:402\n1223#10,6:483\n1223#10,6:498\n1223#10,6:504\n1223#10,6:510\n1223#10,6:516\n1223#10,6:522\n71#11:444\n1864#12,2:481\n1866#12:489\n75#13:570\n108#13,2:571\n75#13:573\n108#13,2:574\n81#14:576\n81#14:577\n107#14,2:578\n81#14:580\n107#14,2:581\n*S KotlinDebug\n*F\n+ 1 RevenueView.kt\ncom/kakao/tistory/presentation/screen/revenue/ui/RevenueViewKt\n*L\n51#1:266\n52#1:267\n88#1:343\n89#1:344\n90#1:345\n93#1:346\n95#1:347\n96#1:348\n99#1:349\n102#1:386\n104#1:387\n121#1:388\n160#1:398\n163#1:399\n166#1:400\n168#1:401\n236#1:528\n239#1:529\n241#1:530\n49#1:268\n49#1:269,5\n49#1:302\n49#1:306\n157#1:408\n157#1:409,6\n157#1:443\n157#1:497\n248#1:531\n248#1:532,5\n248#1:565\n248#1:569\n49#1:274,6\n49#1:289,4\n49#1:299,2\n49#1:305\n80#1:314,6\n80#1:329,4\n80#1:339,2\n85#1:357,6\n85#1:372,4\n85#1:382,2\n85#1:391\n80#1:395\n157#1:415,6\n157#1:430,4\n157#1:440,2\n184#1:452,6\n184#1:467,4\n184#1:477,2\n184#1:492\n157#1:496\n248#1:537,6\n248#1:552,4\n248#1:562,2\n248#1:568\n49#1:280,9\n49#1:301\n49#1:303,2\n80#1:320,9\n80#1:341\n85#1:363,9\n85#1:384\n85#1:389,2\n80#1:393,2\n157#1:421,9\n157#1:442\n184#1:458,9\n184#1:479\n184#1:490,2\n157#1:494,2\n248#1:543,9\n248#1:564\n248#1:566,2\n49#1:293,6\n80#1:333,6\n85#1:376,6\n157#1:434,6\n184#1:471,6\n248#1:556,6\n80#1:307\n80#1:308,6\n80#1:342\n80#1:396\n85#1:350\n85#1:351,6\n85#1:385\n85#1:392\n184#1:445\n184#1:446,6\n184#1:480\n184#1:493\n139#1:397\n170#1:402,6\n190#1:483,6\n205#1:498,6\n206#1:504,6\n210#1:510,6\n217#1:516,6\n231#1:522,6\n175#1:444\n189#1:481,2\n189#1:489\n141#1:570\n141#1:571,2\n145#1:573\n145#1:574,2\n149#1:576\n205#1:577\n205#1:578,2\n206#1:580\n206#1:581,2\n*E\n"})
public final class RevenueViewKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void AutoSizeText(@Nullable Modifier modifier0, @NotNull String s, @NotNull TextStyle textStyle0, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(textStyle0, "textStyle");
        Composer composer1 = composer0.startRestartGroup(-1482300586);
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
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(textStyle0) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1482300586, v2, -1, "com.kakao.tistory.presentation.screen.revenue.ui.AutoSizeText (RevenueView.kt:203)");
            }
            composer1.startReplaceGroup(1364400834);
            MutableState mutableState0 = composer1.rememberedValue();
            if((v2 & 0x380) == 0x100 || mutableState0 == Composer.Companion.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(textStyle0, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            MutableState mutableState1 = b.a(composer1, 1364403155);
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState1 == composer$Companion0.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer1.updateRememberedValue(mutableState1);
            }
            o o0 = b.a(composer1, 1364406759);
            if(o0 == composer$Companion0.getEmpty()) {
                o0 = new o(mutableState1);
                composer1.updateRememberedValue(o0);
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = DrawModifierKt.drawWithContent(modifier2, o0);
            Object object0 = mutableState0.getValue();
            composer1.startReplaceGroup(0x515347CD);
            boolean z = composer1.changed(mutableState0);
            p p0 = composer1.rememberedValue();
            if(z || p0 == composer$Companion0.getEmpty()) {
                p0 = new p(mutableState0, mutableState1);
                composer1.updateRememberedValue(p0);
            }
            composer1.endReplaceGroup();
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier3, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, p0, ((TextStyle)object0), composer1, v2 >> 3 & 14, 0x180, 0xEFFC);
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
            scopeUpdateScope0.updateScope(new q(modifier1, s, textStyle0, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(showBackground = true)
    public static final void AutoSizeTextPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x430F9C80);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x430F9C80, v, -1, "com.kakao.tistory.presentation.screen.revenue.ui.AutoSizeTextPreview (RevenueView.kt:47)");
            }
            Modifier modifier0 = PaddingKt.padding-3ABfNKs(SizeKt.size-3ABfNKs(Modifier.Companion, 100.0f), 10.0f);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
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
            RevenueViewKt.AutoSizeText(null, "₩100,000,000,000", new TextStyle(0L, 0x141A00000L, FontWeight.Companion.getSemiBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD8, null), composer1, 0x30, 1);
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
            scopeUpdateScope0.updateScope(new r(v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void GraphPeriodTabBar(@Nullable Modifier modifier0, @Nullable GraphPeriodType graphPeriodType0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        GraphPeriodType graphPeriodType1;
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(function10, "onClick");
        Composer composer1 = composer0.startRestartGroup(0x809B769F);
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
            v2 |= (composer1.changed(graphPeriodType0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            GraphPeriodType graphPeriodType2 = (v1 & 2) == 0 ? graphPeriodType0 : GraphPeriodType.DAY;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x809B769F, v2, -1, "com.kakao.tistory.presentation.screen.revenue.ui.GraphPeriodTabBar (RevenueView.kt:136)");
            }
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            Object object0 = RememberSaveableKt.rememberSaveable(new Object[0], null, null, w.a, composer1, 3080, 6);
            Object object1 = RememberSaveableKt.rememberSaveable(new Object[0], null, null, x.a, composer1, 3080, 6);
            int v3 = ((MutableIntState)object0).getIntValue();
            State state0 = AnimateAsStateKt.animateIntOffsetAsState-HyPO7BM(IntOffsetKt.IntOffset(((MutableIntState)object1).getIntValue() * (v3 / GraphPeriodType.getEntries().size()), 0), null, "offset", null, composer1, 0x180, 10);
            Modifier modifier3 = BorderKt.border-xT4_qwU(BackgroundKt.background-bw27NRU(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), 40.0f), 0L, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(20.0f)), 1.0f, 0L, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(20.0f));
            composer1.startReplaceGroup(0xA0DFF25F);
            boolean z = composer1.changed(((MutableIntState)object0));
            t t0 = composer1.rememberedValue();
            if(z || t0 == Composer.Companion.getEmpty()) {
                t0 = new t(((MutableIntState)object0));
                composer1.updateRememberedValue(t0);
            }
            composer1.endReplaceGroup();
            Modifier modifier4 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier3, t0);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
            if(composer1.getInserting()) {
                modifier1 = modifier2;
                d.a(v4, composer1, v4, function20);
            }
            else {
                modifier1 = modifier2;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    d.a(v4, composer1, v4, function20);
                }
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            float f = Dp.constructor-impl(density0.toDp-u2uoSUM(((MutableIntState)object0).getIntValue()) / ((float)GraphPeriodType.getEntries().size()));
            RevenueViewKt.a(((IntOffset)state0.getValue()).unbox-impl(), f, composer1, 0);
            Modifier modifier6 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getTop(), composer1, 0);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
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
            Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            composer1.startReplaceGroup(646090423);
            int v6 = 0;
            for(Object object2: GraphPeriodType.getEntries()) {
                if(v6 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                int v7 = ((GraphPeriodType)object2).getTitleRes();
                composer1.startReplaceGroup(0xD78CE643);
                boolean z1 = composer1.changed(((MutableIntState)object1));
                boolean z2 = composer1.changed(v6);
                int v8 = (v2 & 0x380) == 0x100 ? true : 0;
                boolean z3 = composer1.changed(((GraphPeriodType)object2));
                u u0 = composer1.rememberedValue();
                if((z1 | z2 | v8 | z3) != 0 || u0 == Composer.Companion.getEmpty()) {
                    u0 = new u(v6, function10, ((GraphPeriodType)object2), ((MutableIntState)object1));
                    composer1.updateRememberedValue(u0);
                }
                composer1.endReplaceGroup();
                RevenueViewKt.a(rowScopeInstance0, v7, graphPeriodType2 == ((GraphPeriodType)object2), u0, composer1, 6, 0);
                ++v6;
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            graphPeriodType1 = graphPeriodType2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            graphPeriodType1 = graphPeriodType0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v(modifier1, graphPeriodType1, function10, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(showBackground = true)
    public static final void GraphRangeTabBarPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xA5F8E390);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xA5F8E390, v, -1, "com.kakao.tistory.presentation.screen.revenue.ui.GraphRangeTabBarPreview (RevenueView.kt:37)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.RevenueViewKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SelectedAdBox(@Nullable Vendor vendor0, float f, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Composer composer1 = composer0.startRestartGroup(0x282FB322);
        int v1 = (v & 14) == 0 ? (composer1.changed(vendor0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x282FB322, v1, -1, "com.kakao.tistory.presentation.screen.revenue.ui.SelectedAdBox (RevenueView.kt:73)");
            }
            if(vendor0 == null) {
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
                if(scopeUpdateScope0 != null) {
                    scopeUpdateScope0.updateScope(new z(null, f, function00, v));
                }
                return;
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = ModifierKt.noRippleClickable(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), function00);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
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
            float f1 = 20.0f * (1.0f - f);
            Modifier modifier2 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, f1, 18.0f * (1.0f - f), f1, 0.0f, 8, null), 0.0f, 1, null), 64.0f);
            RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f);
            Modifier modifier3 = PaddingKt.padding-VpY3zN4$default(BorderKt.border-xT4_qwU(modifier2, 1.0f, Color.copy-wmQWz5c$default(0L, 1.0f - f, 0.0f, 0.0f, 0.0f, 14, null), roundedCornerShape0), 16.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            ImageKt.Image(PainterResources_androidKt.painterResource(vendor0.getDrawable(), composer1, 0), null, SizeKt.size-3ABfNKs(modifier$Companion0, 40.0f), null, null, 0.0f, null, composer1, 440, 120);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 8.0f), composer1, 6);
            String s = StringResources_androidKt.stringResource(vendor0.getTitle(), composer1, 0);
            FontWeight fontWeight0 = FontWeight.Companion.getNormal();
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), 0L, 0x141600000L, null, fontWeight0, TypeKt.getTFont(), 0L, null, null, 0L, 0, false, false, 0, 0, null, null, composer1, 0x1B0D80, 0, 0x3FF90);
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_list_fold, composer1, 0), null, null, 0L, composer1, 0xC38, 4);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 8.0f), composer1, 6);
            composer1.endNode();
            composer1.startReplaceGroup(0xF5A33411);
            if(1.0f - f == 0.0f) {
                DividerKt.HorizontalDivider-9IZ8Weo(null, 0.0f, 0L, composer1, 0x180, 3);
            }
            if(m.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope1 = composer1.endRestartGroup();
        if(scopeUpdateScope1 != null) {
            scopeUpdateScope1.updateScope(new a0(vendor0, f, function00, v));
        }
    }

    public static final void a(long v, float f, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xFDA861F1);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFDA861F1, v2, -1, "com.kakao.tistory.presentation.screen.revenue.ui.SelectedBox (RevenueView.kt:227)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            composer1.startReplaceGroup(0x5B15BCD1);
            b0 b00 = composer1.rememberedValue();
            if((v2 & 14) == 4 || b00 == Composer.Companion.getEmpty()) {
                b00 = new b0(v);
                composer1.updateRememberedValue(b00);
            }
            composer1.endReplaceGroup();
            BoxKt.Box(BorderKt.border-xT4_qwU(BackgroundKt.background-bw27NRU(SizeKt.fillMaxHeight$default(SizeKt.width-3ABfNKs(OffsetKt.offset(modifier$Companion0, b00), f), 0.0f, 1, null), 0L, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(20.0f)), 1.0f, 0L, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(20.0f)), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c0(v, f, v1));
        }
    }

    public static final void a(RowScope rowScope0, int v, boolean z, Function0 function00, Composer composer0, int v1, int v2) {
        boolean z1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x808870);
        if((v2 & 0x80000000) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(rowScope0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 1) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 2) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v2 & 4) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            z1 = (v2 & 2) == 0 ? z : false;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x808870, v3, -1, "com.kakao.tistory.presentation.screen.revenue.ui.GraphPeriodTab (RevenueView.kt:246)");
            }
            Modifier modifier0 = RowScope.weight$default(rowScope0, SizeKt.fillMaxHeight$default(ModifierKt.noRippleClickable(Modifier.Companion, function00), 0.0f, 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(v, composer1, v3 >> 3 & 14), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, new TextStyle(0L, 0x141600000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, 0, 0, 0x1FFFA);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(rowScope0, v, z1, function00, v1, v2));
        }
    }

    public static final TextStyle access$AutoSizeText$lambda$16(MutableState mutableState0) {
        return (TextStyle)mutableState0.getValue();
    }

    public static final void access$AutoSizeText$lambda$17(MutableState mutableState0, TextStyle textStyle0) {
        mutableState0.setValue(textStyle0);
    }

    public static final boolean access$AutoSizeText$lambda$19(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$AutoSizeText$lambda$20(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final void access$GraphPeriodTabBar$lambda$4(MutableIntState mutableIntState0, int v) {
        mutableIntState0.setIntValue(v);
    }

    public static final void access$GraphPeriodTabBar$lambda$6(MutableIntState mutableIntState0, int v) {
        mutableIntState0.setIntValue(v);
    }
}

