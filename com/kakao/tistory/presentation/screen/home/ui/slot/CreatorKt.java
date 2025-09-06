package com.kakao.tistory.presentation.screen.home.ui.slot;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpSize;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.SemanticKt;
import com.kakao.tistory.presentation.common.graph.b;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Creator;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.CreatorEntry;
import com.kakao.tistory.presentation.screen.home.ui.common.PlaceHolderKt;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotContainerKt;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotFollowButtonKt;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotGridKt;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotStoryCreatorKt;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotTitleKt;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.ButtonColors;
import d;
import e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000B²\u0006\u000E\u0010\u0006\u001A\u00020\u00058\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u0007\u001A\u00020\u00058\n@\nX\u008A\u008E\u0002²\u0006\f\u0010\b\u001A\u00020\u00058\nX\u008A\u0084\u0002²\u0006\u000E\u0010\n\u001A\u00020\t8\n@\nX\u008A\u008E\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Creator;", "uiState", "", "Creator", "(Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Creator;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/geometry/Offset;", "containerTopEndRootPosition", "anchorRootPosition", "anchorPositionByTopEnd", "", "showTooltip", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCreator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Creator.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/CreatorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 12 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,438:1\n1223#2,6:439\n1223#2,6:445\n1223#2,6:451\n1223#2,6:457\n1223#2,6:463\n1223#2,6:505\n1223#2,6:557\n1223#2,6:563\n71#3:469\n68#3,6:470\n74#3:504\n78#3:514\n71#3:617\n68#3,6:618\n74#3:652\n78#3:659\n78#4,6:476\n85#4,4:491\n89#4,2:501\n93#4:513\n78#4,6:522\n85#4,4:537\n89#4,2:547\n93#4:573\n78#4,6:584\n85#4,4:599\n89#4,2:609\n78#4,6:624\n85#4,4:639\n89#4,2:649\n93#4:658\n93#4:662\n78#4,6:673\n85#4,4:688\n89#4,2:698\n78#4,6:709\n85#4,4:724\n89#4,2:734\n93#4:742\n93#4:746\n78#4,6:760\n85#4,4:775\n89#4,2:785\n78#4,6:796\n85#4,4:811\n89#4,2:821\n78#4,6:834\n85#4,4:849\n89#4,2:859\n93#4:866\n93#4:870\n93#4:875\n368#5,9:482\n377#5:503\n378#5,2:511\n368#5,9:528\n377#5:549\n378#5,2:571\n368#5,9:590\n377#5:611\n368#5,9:630\n377#5:651\n378#5,2:656\n378#5,2:660\n368#5,9:679\n377#5:700\n368#5,9:715\n377#5:736\n378#5,2:740\n378#5,2:744\n368#5,9:766\n377#5:787\n368#5,9:802\n377#5:823\n368#5,9:840\n377#5:861\n378#5,2:864\n378#5,2:868\n378#5,2:873\n4032#6,6:495\n4032#6,6:541\n4032#6,6:603\n4032#6,6:643\n4032#6,6:692\n4032#6,6:728\n4032#6,6:779\n4032#6,6:815\n4032#6,6:853\n98#7:515\n95#7,6:516\n101#7:550\n105#7:574\n98#7:702\n95#7,6:703\n101#7:737\n105#7:743\n98#7:753\n95#7,6:754\n101#7:788\n98#7:826\n94#7,7:827\n101#7:862\n105#7:867\n105#7:876\n77#8:551\n77#8:576\n1#9:552\n148#10:553\n148#10:554\n148#10:555\n148#10:556\n148#10:575\n148#10:613\n148#10:615\n148#10:616\n148#10:653\n148#10:654\n148#10:655\n148#10:666\n148#10:738\n148#10:739\n148#10:748\n148#10:749\n148#10:750\n148#10:751\n148#10:752\n148#10:789\n148#10:825\n148#10:863\n148#10:872\n56#11:569\n71#11:570\n50#11:614\n71#11:664\n50#11:665\n85#12:577\n82#12,6:578\n88#12:612\n92#12:663\n85#12:667\n83#12,5:668\n88#12:701\n92#12:747\n85#12:790\n83#12,5:791\n88#12:824\n92#12:871\n81#13:877\n107#13,2:878\n81#13:880\n107#13,2:881\n81#13:883\n81#13:884\n107#13,2:885\n*S KotlinDebug\n*F\n+ 1 Creator.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/CreatorKt\n*L\n83#1:439,6\n84#1:445,6\n85#1:451,6\n86#1:457,6\n91#1:463,6\n139#1:505,6\n172#1:557,6\n178#1:563,6\n88#1:469\n88#1:470,6\n88#1:504\n88#1:514\n219#1:617\n219#1:618,6\n219#1:652\n219#1:659\n88#1:476,6\n88#1:491,4\n88#1:501,2\n88#1:513\n152#1:522,6\n152#1:537,4\n152#1:547,2\n152#1:573\n202#1:584,6\n202#1:599,4\n202#1:609,2\n219#1:624,6\n219#1:639,4\n219#1:649,2\n219#1:658\n202#1:662\n269#1:673,6\n269#1:688,4\n269#1:698,2\n294#1:709,6\n294#1:724,4\n294#1:734,2\n294#1:742\n269#1:746\n373#1:760,6\n373#1:775,4\n373#1:785,2\n383#1:796,6\n383#1:811,4\n383#1:821,2\n396#1:834,6\n396#1:849,4\n396#1:859,2\n396#1:866\n383#1:870\n373#1:875\n88#1:482,9\n88#1:503\n88#1:511,2\n152#1:528,9\n152#1:549\n152#1:571,2\n202#1:590,9\n202#1:611\n219#1:630,9\n219#1:651\n219#1:656,2\n202#1:660,2\n269#1:679,9\n269#1:700\n294#1:715,9\n294#1:736\n294#1:740,2\n269#1:744,2\n373#1:766,9\n373#1:787\n383#1:802,9\n383#1:823\n396#1:840,9\n396#1:861\n396#1:864,2\n383#1:868,2\n373#1:873,2\n88#1:495,6\n152#1:541,6\n202#1:603,6\n219#1:643,6\n269#1:692,6\n294#1:728,6\n373#1:779,6\n383#1:815,6\n396#1:853,6\n152#1:515\n152#1:516,6\n152#1:550\n152#1:574\n294#1:702\n294#1:703,6\n294#1:737\n294#1:743\n373#1:753\n373#1:754,6\n373#1:788\n396#1:826\n396#1:827,7\n396#1:862\n396#1:867\n373#1:876\n163#1:551\n200#1:576\n163#1:553\n165#1:554\n166#1:555\n167#1:556\n199#1:575\n214#1:613\n223#1:615\n225#1:616\n230#1:653\n231#1:654\n237#1:655\n271#1:666\n313#1:738\n314#1:739\n326#1:748\n353#1:749\n354#1:750\n375#1:751\n378#1:752\n385#1:789\n398#1:825\n406#1:863\n420#1:872\n188#1:569\n188#1:570\n215#1:614\n252#1:664\n252#1:665\n202#1:577\n202#1:578,6\n202#1:612\n202#1:663\n269#1:667\n269#1:668,5\n269#1:701\n269#1:747\n383#1:790\n383#1:791,5\n383#1:824\n383#1:871\n83#1:877\n83#1:878,2\n84#1:880\n84#1:881,2\n85#1:883\n86#1:884\n86#1:885,2\n*E\n"})
public final class CreatorKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Creator(@NotNull Creator homeSlotUiState$Creator0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(homeSlotUiState$Creator0, "uiState");
        Composer composer1 = composer0.startRestartGroup(0x16B0758F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x16B0758F, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Creator (Creator.kt:80)");
        }
        composer1.startReplaceGroup(1491803075);
        MutableState mutableState0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Offset.box-impl(0L), null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        MutableState mutableState1 = b.a(composer1, 1491805347);
        if(mutableState1 == composer$Companion0.getEmpty()) {
            mutableState1 = SnapshotStateKt.mutableStateOf$default(Offset.box-impl(0L), null, 2, null);
            composer1.updateRememberedValue(mutableState1);
        }
        State state0 = b.a(composer1, 1491807787);
        if(state0 == composer$Companion0.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new m0(mutableState1, mutableState0));
            composer1.updateRememberedValue(state0);
        }
        MutableState mutableState2 = b.a(composer1, 0x58EB3AFD);
        if(mutableState2 == composer$Companion0.getEmpty()) {
            mutableState2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer1.updateRememberedValue(mutableState2);
        }
        composer1.endReplaceGroup();
        Modifier modifier0 = SizeKt.wrapContentSize$default(Modifier.Companion, null, false, 3, null);
        composer1.startReplaceGroup(1491815704);
        e0 e00 = composer1.rememberedValue();
        if(e00 == composer$Companion0.getEmpty()) {
            e00 = new e0(mutableState0, mutableState2);
            composer1.updateRememberedValue(e00);
        }
        composer1.endReplaceGroup();
        Modifier modifier1 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier0, e00);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
        BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
        SlotContainerKt.SlotContainer(ComposableLambdaKt.rememberComposableLambda(0x8035C60D, true, new h0(homeSlotUiState$Creator0, mutableState1, mutableState2), composer1, 54), false, null, ComposableLambdaKt.rememberComposableLambda(0xC4DD14DA, true, new i0(homeSlotUiState$Creator0), composer1, 54), composer1, 0xC06, 6);
        String s = StringResources_androidKt.stringResource(string.label_home_slot_creator_tip_link_url, composer1, 0);
        composer1.startReplaceGroup(-702619921);
        if(((Boolean)mutableState2.getValue()).booleanValue()) {
            long v2 = ((Offset)state0.getValue()).unbox-impl();
            j0 j00 = new j0(homeSlotUiState$Creator0, s, mutableState2);
            composer1.startReplaceGroup(0xD61EFE91);
            k0 k00 = composer1.rememberedValue();
            if(k00 == composer$Companion0.getEmpty()) {
                k00 = new k0(mutableState2);
                composer1.updateRememberedValue(k00);
            }
            composer1.endReplaceGroup();
            CreatorKt.a(boxScopeInstance0, v2, j00, k00, composer1, 0xC06);
        }
        if(m.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l0(homeSlotUiState$Creator0, v));
        }
    }

    public static final void a(BoxScope boxScope0, long v, Function0 function00, Function0 function01, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(442580084);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(boxScope0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(442580084, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Tooltip (Creator.kt:197)");
            }
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            Pair pair0 = TuplesKt.to(Dp.box-impl(density0.toDp-u2uoSUM(Offset.getX-impl(v))), Dp.box-impl(density0.toDp-u2uoSUM(Offset.getY-impl(v))));
            float f = ((Dp)pair0.component1()).unbox-impl();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            Modifier modifier0 = SemanticsModifierKt.semantics$default(PaddingKt.padding-qDBjuR0$default(boxScope0.align(modifier$Companion0, alignment$Companion0.getTopEnd()), 0.0f, ((Dp)pair0.component2()).unbox-impl(), 4.0f, 0.0f, 9, null), false, d1.a, 1, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            CreatorKt.a(ZIndexModifierKt.zIndex(ColumnScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getEnd()), 1.0f), DpKt.DpSize-YgX7TsA(16.0f, 8.0f), f + 4.0f, 0L, composer1, 0xC30);
            Modifier modifier2 = ModifierKt.shape-8ww4TTg$default(ModifierKt.noRippleClickable(modifier$Companion0, e1.a), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(12.0f), 0L, null, 20.0f, 4, null);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function21);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            CreatorKt.a(SizeKt.widthIn-VpY3zN4$default(PaddingKt.padding-qDBjuR0(modifier$Companion0, 16.0f, 16.0f, 50.0f, 16.0f), 0.0f, 200.0f, 1, null), function00, composer1, v2 >> 3 & 0x70);
            CreatorKt.a(PaddingKt.padding-qDBjuR0$default(BoxScopeInstance.INSTANCE.align(modifier$Companion0, alignment$Companion0.getTopEnd()), 0.0f, 0.0f, 1.0f, 0.0f, 11, null), function01, composer1, v2 >> 6 & 0x70, 0);
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
            scopeUpdateScope0.updateScope(new f1(boxScope0, v, function00, function01, v1));
        }
    }

    public static final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xAFF06A2B);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAFF06A2B, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.CreatorPreview (Creator.kt:47)");
            }
            q0 q00 = q0.a;
            ArrayList arrayList0 = new ArrayList(4);
            for(int v1 = 0; v1 < 4; ++v1) {
                ThumbnailUiState thumbnailUiState0 = ThumbnailUiStateKt.toBlogThumbnailItem("1");
                ArrayList arrayList1 = new ArrayList(2);
                for(int v2 = 0; v2 < 2; ++v2) {
                    arrayList1.add(new CreatorEntry("entry title " + v2, ThumbnailUiStateKt.toThumbnailItem("2"), v2 == 0, r0.a));
                }
                arrayList0.add(new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Creator("", "blogTitle " + v1 + " blablabla 구독급상승 블로그 이름", thumbnailUiState0, s0.a, "storyCreator " + v1, v1 == 1, t0.a, u0.a, "blogName " + v1, v1 * 10000, arrayList1));
            }
            CreatorKt.Creator(new Creator(null, null, "구독급상승", "", q00, arrayList0, null, 0, 0xC3, null), composer1, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v0(v));
        }
    }

    public static final void a(Modifier modifier0, long v, float f, long v1, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(-1300048428);
        int v3 = (v2 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v3 |= (composer1.changed(f) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            v3 |= (composer1.changed(v1) ? 0x800 : 0x400);
        }
        if((v3 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1300048428, v3, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.ToolTipCaret (Creator.kt:250)");
            }
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ico_tooltip_caret, composer1, 0), null, OffsetKt.offset-VpY3zN4$default(SizeKt.size-6HolHcs(modifier0, v), DpSize.getWidth-D9Ej5fM(v) / 2.0f + f, 0.0f, 2, null), v1, composer1, v3 & 0x1C00 | 56, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a1(modifier0, v, f, v1, v2));
        }
    }

    public static final void a(Modifier modifier0, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-979670892);
        int v1 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-979670892, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.ToolTipContent (Creator.kt:267)");
            }
            Arrangement arrangement0 = Arrangement.INSTANCE;
            HorizontalOrVertical arrangement$HorizontalOrVertical0 = arrangement0.spacedBy-0680j_4(10.0f);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement$HorizontalOrVertical0, alignment$Companion0.getStart(), composer1, 6);
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
            String s = StringResources_androidKt.stringResource(string.label_home_slot_creator_tip_title, composer1, 0);
            androidx.compose.ui.text.font.FontWeight.Companion fontWeight$Companion0 = FontWeight.Companion;
            TextKt.Text--4IGK_g(s, null, 0xFF00000000000000L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141700000L, fontWeight$Companion0.getBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, 0x180, 0, 0xFFFA);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_home_slot_creator_tip_message, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141500000L, fontWeight$Companion0.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141A00000L, null, null, null, 0, 0, null, 0xFDFFD9, null), composer1, 0x180, 0, 0xFFFA);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier2 = ClickableKt.clickable-XHw0xAI$default(modifier$Companion0, false, null, Role.box-impl(0), function00, 3, null);
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_home_slot_creator_tip_link, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(0L, 0x141400000L, fontWeight$Companion0.getBold(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFD9, null), composer1, 0x180, 0, 0xFFFA);
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ico_arrow_right, composer1, 0), StringResources_androidKt.stringResource(string.content_desc_move, composer1, 0), SizeKt.size-VpY3zN4(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 2.0f, 0.0f, 0.0f, 0.0f, 14, null), 4.0f, 6.0f), 0L, composer1, 0xD88, 0);
            if(e.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c1(modifier0, function00, v));
        }
    }

    public static final void a(Modifier modifier0, Function0 function00, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x37FF3875);
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
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x37FF3875, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.ToolTipClose (Creator.kt:323)");
            }
            IconButtonKt.IconButton(function00, SizeKt.size-3ABfNKs(modifier0, 48.0f), false, null, null, ComposableSingletons.CreatorKt.INSTANCE.getLambda-2$presentation_prodRelease(), composer1, v2 >> 3 & 14 | 0x30000, 28);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b1(modifier0, function00, v, v1));
        }
    }

    public static final void a(String s, String s1, Function0 function00, int v, boolean z, Function0 function01, Function0 function02, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0xF4191691);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((0xE000 & v1) == 0) {
            v2 |= (composer1.changed(z) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v1) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v1) == 0) {
            v2 |= (composer1.changedInstance(function02) ? 0x100000 : 0x80000);
        }
        if((0x2DB6DB & v2) != 0x92492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF4191691, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.CreatorContentBlog (Creator.kt:370)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxWidth$default(PaddingKt.padding-VpY3zN4(PlaceHolderKt.placeholder(ClickableKt.clickable-XHw0xAI$default(ModifierKt.shape-8ww4TTg$default(modifier$Companion0, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f), 0L, null, 0.0f, 12, null), false, StringResources_androidKt.stringResource(string.content_desc_blog_move, composer1, 0), null, function00, 5, null), composer1, 0), 14.0f, 12.0f), 0.0f, 1, null);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            Arrangement arrangement0 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            Modifier modifier2 = RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null);
            MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.spacedBy-0680j_4(4.0f), alignment$Companion0.getStart(), composer1, 6);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            Function0 function04 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function04);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function21);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            TTextStyle tTextStyle0 = TTextStyle.INSTANCE;
            TextKt.Text--4IGK_g(s, SemanticKt.contentDescription(modifier$Companion0, new String[]{StringResources_androidKt.stringResource(string.content_desc_blog, composer1, 0), s}, composer1, 6), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tTextStyle0.getSize16Weight700(), composer1, v2 & 14 | 0x180, 0x180C30, 0xD7F8);
            MeasurePolicy measurePolicy2 = RowKt.rowMeasurePolicy(arrangement0.spacedBy-0680j_4(4.0f), alignment$Companion0.getCenterVertically(), composer1, 54);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            Function0 function05 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function05);
            }
            else {
                composer1.useNode();
            }
            Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                d.a(v5, composer1, v5, function22);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(tTextStyle0.getSize12Weight400(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null);
            SlotStoryCreatorKt.SlotStoryCreator--jt2gSs(s1, textStyle0, rowScopeInstance0.weight(modifier$Companion0, 1.0f, false), 0.0f, composer1, v2 >> 3 & 14, 8);
            BoxKt.Box(BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(modifier$Companion0, 2.0f), 0L, RoundedCornerShapeKt.getCircleShape()), composer1, 0);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_home_slot_follower_count, new Object[]{StringUtils.INSTANCE.getEllipsisNumber(v, 0x270F)}, composer1, 0x40), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0, 0, 0xFFFE);
            composer1.endNode();
            composer1.endNode();
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 10.0f), composer1, 6);
            SlotFollowButtonKt.SlotFollowButton(z, function01, function02, new ButtonColors(0L, 0xFF00000000000000L, Color.copy-wmQWz5c$default(0L, 0.8f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 56, null), new ButtonColors(0L, 0xFF00000000000000L, Color.copy-wmQWz5c$default(0L, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 56, null), null, composer1, v2 >> 12 & 14 | 0x6C00 | v2 >> 12 & 0x70 | v2 >> 12 & 0x380, 0x20);
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
            scopeUpdateScope0.updateScope(new p0(s, s1, function00, v, z, function01, function02, v1));
        }
    }

    public static final boolean access$Creator$lambda$11(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$Creator$lambda$12(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final long access$Creator$lambda$3(MutableState mutableState0) {
        return ((Offset)mutableState0.getValue()).unbox-impl();
    }

    public static final void access$Creator$lambda$4(MutableState mutableState0, long v) {
        mutableState0.setValue(Offset.box-impl(v));
    }

    public static final long access$Creator$lambda$6(MutableState mutableState0) {
        return ((Offset)mutableState0.getValue()).unbox-impl();
    }

    public static final void access$Creator$lambda$7(MutableState mutableState0, long v) {
        mutableState0.setValue(Offset.box-impl(v));
    }

    public static final void access$CreatorContent(com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Creator homeSlotUiStateContent$Creator0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-567204820);
        int v1 = (v & 14) == 0 ? (composer1.changed(homeSlotUiStateContent$Creator0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-567204820, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.CreatorContent (Creator.kt:339)");
            }
            CreatorKt.a(homeSlotUiStateContent$Creator0.getBlogTitle(), homeSlotUiStateContent$Creator0.getStoryCreatorLabel(), homeSlotUiStateContent$Creator0.getOnClickBlog(), homeSlotUiStateContent$Creator0.getFollowerCount(), homeSlotUiStateContent$Creator0.isFollowing(), homeSlotUiStateContent$Creator0.getOnClickFollow(), homeSlotUiStateContent$Creator0.getOnClickUnFollow(), composer1, 0);
            SlotGridKt.SlotGrid-8HUqYh0(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 12.0f, 0.0f, 22.0f, 5, null), DpKt.DpSize-YgX7TsA(12.0f, 22.0f), 0, ComposableLambdaKt.rememberComposableLambda(0x47DCACF8, true, new n0(homeSlotUiStateContent$Creator0), composer1, 54), composer1, 0xC36, 4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o0(homeSlotUiStateContent$Creator0, v));
        }
    }

    public static final void access$CreatorTitle(String s, String s1, Function1 function10, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x2FF8E1E4);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v1 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2FF8E1E4, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.CreatorTitle (Creator.kt:150)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
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
            boolean z = false;
            SlotTitleKt.SlotTitle(s, s1, null, composer1, v1 & 0x7E, 4);
            SpacerKt.Spacer(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
            float f = ((Density)composer1.consume(CompositionLocalsKt.getLocalDensity())).toPx-0680j_4(10.0f);
            Modifier modifier2 = SizeKt.size-3ABfNKs(modifier$Companion0, 48.0f);
            composer1.startReplaceGroup(0x8FABDF49);
            boolean z1 = composer1.changed(-f);
            w0 w00 = composer1.rememberedValue();
            if((v1 & 0x380) == 0x100 || z1 || w00 == Composer.Companion.getEmpty()) {
                w00 = new w0(function10, -f);
                composer1.updateRememberedValue(w00);
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, w00);
            composer1.startReplaceGroup(0x8FAC02ED);
            if((v1 & 0x1C00) == 0x800) {
                z = true;
            }
            x0 x00 = composer1.rememberedValue();
            if(z || x00 == Composer.Companion.getEmpty()) {
                x00 = new x0(function00);
                composer1.updateRememberedValue(x00);
            }
            composer1.endReplaceGroup();
            IconButtonKt.IconButton(x00, modifier3, false, null, null, ComposableLambdaKt.rememberComposableLambda(1555163011, true, new y0(18.0f), composer1, 54), composer1, 0x30000, 28);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 5.0f), composer1, 6);
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
            scopeUpdateScope0.updateScope(new z0(s, s1, function10, function00, v));
        }
    }
}

