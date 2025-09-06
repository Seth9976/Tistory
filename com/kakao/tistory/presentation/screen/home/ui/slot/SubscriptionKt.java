package com.kakao.tistory.presentation.screen.home.ui.slot;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import c;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.SemanticKt;
import com.kakao.tistory.presentation.common.utils.ScaleUtilsKt;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.list.BlogTitleKt;
import com.kakao.tistory.presentation.design.ui.list.EntryListUiState.Blog;
import com.kakao.tistory.presentation.design.ui.list.m;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Subscription;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.SubscriptionEntry;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotContainerKt;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotFollowButtonKt;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotGridKt;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotStoryCreatorKt;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import com.kakao.tistory.presentation.widget.common.RoundButtonDefaults.ButtonColors;
import d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u000F\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001A\u0017\u0010\u0005\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f²\u0006\f\u0010\b\u001A\u00020\u00078\nX\u008A\u0084\u0002²\u0006\u0012\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t8\nX\u008A\u0084\u0002"}, d2 = {"", "SubscriptionPreview", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Subscription;", "uiState", "Subscription", "(Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Subscription;Landroidx/compose/runtime/Composer;I)V", "", "currentIndex", "", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiStateContent$Subscription;", "list", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSubscription.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Subscription.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/SubscriptionKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,334:1\n148#2:335\n148#2:376\n148#2:413\n148#2:451\n148#2:501\n148#2:542\n148#2:543\n148#2:544\n148#2:549\n148#2:550\n186#2:551\n186#2:554\n148#2:556\n148#2:596\n148#2:597\n85#3:336\n82#3,6:337\n88#3:371\n92#3:375\n85#3:377\n82#3,6:378\n88#3:412\n85#3:452\n83#3,5:453\n88#3:486\n92#3:490\n92#3:505\n85#3:557\n83#3,5:558\n88#3:591\n92#3:595\n78#4,6:343\n85#4,4:358\n89#4,2:368\n93#4:374\n78#4,6:384\n85#4,4:399\n89#4,2:409\n78#4,6:422\n85#4,4:437\n89#4,2:447\n78#4,6:458\n85#4,4:473\n89#4,2:483\n93#4:489\n93#4:499\n93#4:504\n78#4,6:513\n85#4,4:528\n89#4,2:538\n93#4:547\n78#4,6:563\n85#4,4:578\n89#4,2:588\n93#4:594\n368#5,9:349\n377#5:370\n378#5,2:372\n368#5,9:390\n377#5:411\n368#5,9:428\n377#5:449\n368#5,9:464\n377#5:485\n378#5,2:487\n378#5,2:497\n378#5,2:502\n368#5,9:519\n377#5:540\n378#5,2:545\n368#5,9:569\n377#5:590\n378#5,2:592\n4032#6,6:362\n4032#6,6:403\n4032#6,6:441\n4032#6,6:477\n4032#6,6:532\n4032#6,6:582\n98#7:414\n94#7,7:415\n101#7:450\n105#7:500\n98#7:506\n95#7,6:507\n101#7:541\n105#7:548\n1223#8,6:491\n50#9:552\n86#9:553\n50#9:555\n*S KotlinDebug\n*F\n+ 1 Subscription.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/SubscriptionKt\n*L\n87#1:335\n162#1:376\n166#1:413\n169#1:451\n203#1:501\n246#1:542\n252#1:543\n255#1:544\n280#1:549\n282#1:550\n283#1:551\n285#1:554\n289#1:556\n323#1:596\n324#1:597\n128#1:336\n128#1:337,6\n128#1:371\n128#1:375\n159#1:377\n159#1:378,6\n159#1:412\n168#1:452\n168#1:453,5\n168#1:486\n168#1:490\n159#1:505\n287#1:557\n287#1:558,5\n287#1:591\n287#1:595\n128#1:343,6\n128#1:358,4\n128#1:368,2\n128#1:374\n159#1:384,6\n159#1:399,4\n159#1:409,2\n164#1:422,6\n164#1:437,4\n164#1:447,2\n168#1:458,6\n168#1:473,4\n168#1:483,2\n168#1:489\n164#1:499\n159#1:504\n233#1:513,6\n233#1:528,4\n233#1:538,2\n233#1:547\n287#1:563,6\n287#1:578,4\n287#1:588,2\n287#1:594\n128#1:349,9\n128#1:370\n128#1:372,2\n159#1:390,9\n159#1:411\n164#1:428,9\n164#1:449\n168#1:464,9\n168#1:485\n168#1:487,2\n164#1:497,2\n159#1:502,2\n233#1:519,9\n233#1:540\n233#1:545,2\n287#1:569,9\n287#1:590\n287#1:592,2\n128#1:362,6\n159#1:403,6\n164#1:441,6\n168#1:477,6\n233#1:532,6\n287#1:582,6\n164#1:414\n164#1:415,7\n164#1:450\n164#1:500\n233#1:506\n233#1:507,6\n233#1:541\n233#1:548\n189#1:491,6\n283#1:552\n285#1:553\n285#1:555\n*E\n"})
public final class SubscriptionKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Subscription(@NotNull Subscription homeSlotUiState$Subscription0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(homeSlotUiState$Subscription0, "uiState");
        Composer composer1 = composer0.startRestartGroup(-1576704930);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1576704930, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Subscription (Subscription.kt:77)");
        }
        SlotContainerKt.SlotContainer(ComposableLambdaKt.rememberComposableLambda(-2015997082, true, new x1(homeSlotUiState$Subscription0), composer1, 54), false, PaddingKt.PaddingValues-0680j_4(0.0f), ComposableLambdaKt.rememberComposableLambda(0x5F20EA39, true, new z1(homeSlotUiState$Subscription0), composer1, 54), composer1, 0xD86, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a2(homeSlotUiState$Subscription0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview(backgroundColor = 0x888888L, showBackground = true, widthDp = 375)
    public static final void SubscriptionPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x1CD207AD);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x1CD207AD, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.SubscriptionPreview (Subscription.kt:42)");
            }
            ArrayList arrayList0 = new ArrayList(4);
            for(int v1 = 0; v1 < 4; ++v1) {
                ThumbnailUiState thumbnailUiState0 = ThumbnailUiStateKt.toThumbnailItem("1");
                ArrayList arrayList1 = new ArrayList(2);
                for(int v2 = 0; v2 < 2; ++v2) {
                    arrayList1.add(new SubscriptionEntry("entry title " + v2, ThumbnailUiStateKt.toThumbnailItem("2"), v2 == 0, b2.a));
                }
                arrayList0.add(new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Subscription("1", "blogTitle " + v1 + " blablabla 구독 블로그 이름", thumbnailUiState0, c2.a, "요리, 베이킹, 미니어처 하우스, 피포페인팅, 보석십자수 diy 등 취미 생활 공유하고, 맛집, 디저트, 간식 등 후기 기록 블로그공유하고, 맛집, 디저트, 간식 등 후기 기록 블로그", "11111", (v1 + 1) * 10000, (v1 + 1) * 1000, v1 % 2 == 0, d2.a, e2.a, "blogName " + v1, arrayList1));
            }
            SubscriptionKt.Subscription(new Subscription(null, null, "구독 급상승", "", arrayList0, null, 0, 99, null), composer1, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f2(v));
        }
    }

    public static final void a(int v, int v1, Modifier modifier0, Composer composer0, int v2, int v3) {
        Modifier modifier1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(-2099760756);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.changed(v1) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v4 & 731) != 0x92 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2099760756, v4, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.FollowInfo (Subscription.kt:229)");
            }
            TextStyle textStyle0 = TTextStyle.INSTANCE.getSize12Weight400();
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                d.a(v5, composer1, v5, function20);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_home_slot_follower_count, new Object[]{StringUtils.INSTANCE.getEllipsisNumber(v, 0x270F)}, composer1, 0x40), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0x180, 0x180000, 0xFFFA);
            c.a(4.0f, Modifier.Companion, composer1, 6);
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ico_up, composer1, 0), StringResources_androidKt.stringResource(string.content_desc_increase, composer1, 0), SizeKt.size-3ABfNKs(Modifier.Companion, 8.0f), 0L, composer1, 0xD88, 0);
            c.a(2.0f, Modifier.Companion, composer1, 6);
            TextKt.Text--4IGK_g(StringResources_androidKt.stringResource(string.label_home_slot_follower_increase_count, new Object[]{StringUtils.INSTANCE.getEllipsisNumber(v1, 0x270F)}, composer1, 0x40), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null), composer1, 0x180, 0, 0xFFFA);
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
            scopeUpdateScope0.updateScope(new v1(v, v1, modifier1, v2, v3));
        }
    }

    public static final void a(Blog entryListUiState$Blog0, String s, String s1, int v, int v1, boolean z, Function0 function00, Function0 function01, Composer composer0, int v2) {
        Composer composer1 = composer0.startRestartGroup(0x9E14AA64);
        int v3 = (v2 & 14) == 0 ? (composer1.changed(entryListUiState$Blog0) ? 4 : 2) | v2 : v2;
        if((v2 & 0x70) == 0) {
            v3 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v2 & 0x380) == 0) {
            v3 |= (composer1.changed(s1) ? 0x100 : 0x80);
        }
        if((v2 & 0x1C00) == 0) {
            v3 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((0xE000 & v2) == 0) {
            v3 |= (composer1.changed(v1) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x70000) == 0) {
            v3 |= (composer1.changed(z) ? 0x20000 : 0x10000);
        }
        if((0x380000 & v2) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x100000 : 0x80000);
        }
        if((0x1C00000 & v2) == 0) {
            v3 |= (composer1.changedInstance(function01) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v3) != 4793490 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9E14AA64, v3, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Blog (Subscription.kt:157)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 20.0f);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.spacedBy-0680j_4(6.0f), alignment$Companion0.getTop(), composer1, 54);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                d.a(v5, composer1, v5, function21);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            HorizontalOrVertical arrangement$HorizontalOrVertical0 = arrangement0.spacedBy-0680j_4(4.0f);
            Modifier modifier3 = RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null);
            MeasurePolicy measurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$HorizontalOrVertical0, alignment$Companion0.getStart(), composer1, 6);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
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
            Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                d.a(v6, composer1, v6, function22);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            SubscriptionKt.a(v, v1, modifier$Companion0, composer1, v3 >> 9 & 14 | 0x180 | v3 >> 9 & 0x70, 0);
            BlogTitleKt.BlogTitle(entryListUiState$Blog0.getBlogTitle(), TextStyle.copy-p1EtxEg$default(TTextStyle.INSTANCE.getSize30Weight800(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), null, composer1, 0, 4);
            composer1.endNode();
            ButtonColors roundButtonDefaults$ButtonColors0 = new ButtonColors(0L, 0xFFFFFFFF00000000L, 0L, 0L, 0L, 0L, 56, null);
            ButtonColors roundButtonDefaults$ButtonColors1 = new ButtonColors(Color.copy-wmQWz5c$default(0L, 0.8f, 0.0f, 0.0f, 0.0f, 14, null), 0L, Color.copy-wmQWz5c$default(0L, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, 56, null);
            composer1.startReplaceGroup(1120679127);
            p1 p10 = composer1.rememberedValue();
            if((v3 & 0x70000) == 0x20000 || p10 == Composer.Companion.getEmpty()) {
                p10 = new p1(z);
                composer1.updateRememberedValue(p10);
            }
            composer1.endReplaceGroup();
            SlotFollowButtonKt.SlotFollowButton(z, function00, function01, roundButtonDefaults$ButtonColors0, roundButtonDefaults$ButtonColors1, p10, composer1, v3 >> 15 & 14 | 0x6C00 | v3 >> 15 & 0x70 | v3 >> 15 & 0x380, 0);
            composer1.endNode();
            SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 20.0f), composer1, 6);
            SubscriptionKt.a(s1, s, composer1, v3 >> 6 & 14 | v3 & 0x70);
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
            scopeUpdateScope0.updateScope(new q1(entryListUiState$Blog0, s, s1, v, v1, z, function00, function01, v2));
        }
    }

    public static final void a(String s, String s1, Composer composer0, int v) {
        androidx.compose.ui.Modifier.Companion modifier$Companion2;
        androidx.compose.ui.Modifier.Companion modifier$Companion1;
        Composer composer1 = composer0.startRestartGroup(0xFBE8FA0C);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xFBE8FA0C, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.StoryCreatorAndBlogDescription (Subscription.kt:273)");
            }
            TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(TTextStyle.INSTANCE.getSize12Weight400(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null);
            float f = ScaleUtilsKt.lineHeightToDp(textStyle0, composer1, 0);
            float f1 = Dp.constructor-impl(Dp.constructor-impl(Math.max(f, Dp.constructor-impl(Dp.constructor-impl(Math.max(ScaleUtilsKt.lineHeightToDp(textStyle0, composer1, 0), 14.0f)) + 4.0f))) + 2.0f * f);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = ModifierKt.textWrapperHeight-3ABfNKs(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 85.0f, 0.0f, 11, null), f1);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.Companion.getStart(), composer1, 6);
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
            if(composer1.getInserting()) {
                modifier$Companion1 = modifier$Companion0;
                d.a(v2, composer1, v2, function20);
            }
            else {
                modifier$Companion1 = modifier$Companion0;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                    d.a(v2, composer1, v2, function20);
                }
            }
            r0.a.z(composeUiNode$Companion0, composer1, modifier1, composer1, -1009687849);
            if(s == null) {
                modifier$Companion2 = modifier$Companion1;
            }
            else {
                modifier$Companion2 = modifier$Companion1;
                SlotStoryCreatorKt.SlotStoryCreator--jt2gSs(s, TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), null, 14.0f, composer1, 0xC00, 4);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion2, 4.0f), composer1, 6);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(-1009678752);
            if(!p.isBlank(s1)) {
                TextKt.Text--4IGK_g(s1, SemanticKt.contentDescription(modifier$Companion2, new String[]{StringResources_androidKt.stringResource(string.cotnent_desc_blog_desc, composer1, 0), s1}, composer1, 6), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, (s == null ? 3 : 2), 0, null, textStyle0, composer1, v1 >> 3 & 14, 0x30, 0xD7FC);
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
            scopeUpdateScope0.updateScope(new w1(s, s1, v));
        }
    }

    public static final void a(List list0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-459860684);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-459860684, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.EntryList (Subscription.kt:320)");
        }
        SlotGridKt.SlotGrid-8HUqYh0(PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 20.0f, 0.0f, 2, null), DpKt.DpSize-YgX7TsA(12.0f, 0.0f), 0, ComposableLambdaKt.rememberComposableLambda(0x62891FE8, true, new t1(list0), composer1, 54), composer1, 0xC36, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u1(list0, v));
        }
    }

    public static final void access$BlogBackground(ThumbnailUiState thumbnailUiState0, Modifier modifier0, Composer composer0, int v, int v1) {
        Modifier modifier1;
        String s;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xBF43B450);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(thumbnailUiState0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xBF43B450, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.BlogBackground (Subscription.kt:212)");
            }
            if(thumbnailUiState0 == null) {
                s = drawable.img_home_subscription_default_bg;
            }
            else {
                s = thumbnailUiState0.getLarge();
                if(s == null) {
                    s = drawable.img_home_subscription_default_bg;
                }
            }
            CommonImageKt.CommonImage(s, null, modifier1, new ColorPainter(0L, null), null, null, composer1, v2 << 3 & 0x380 | 0x1038, 0x30);
            List list0 = CollectionsKt__CollectionsKt.listOf(new Color[]{Color.box-impl(Color.copy-wmQWz5c$default(0L, 0.6f, 0.0f, 0.0f, 0.0f, 14, null)), Color.box-impl(0L)});
            BoxKt.Box(BackgroundKt.background$default(modifier1, androidx.compose.ui.graphics.Brush.Companion.verticalGradient-8A-3gB4$default(Brush.Companion, list0, 0.0f, 0.0f, 0, 14, null), null, 0.0f, 6, null), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r1(thumbnailUiState0, modifier1, v, v1));
        }
    }

    public static final void access$Content(com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Subscription homeSlotUiStateContent$Subscription0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-250734690);
        int v1 = (v & 14) == 0 ? (composer1.changed(homeSlotUiStateContent$Subscription0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-250734690, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Content (Subscription.kt:126)");
            }
            Modifier modifier0 = ClickableKt.clickable-XHw0xAI$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), false, StringResources_androidKt.stringResource(string.content_desc_blog_move, composer1, 0), null, homeSlotUiStateContent$Subscription0.getOnClickBlog(), 5, null);
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
            SubscriptionKt.a(homeSlotUiStateContent$Subscription0, homeSlotUiStateContent$Subscription0.getBlogDescription(), homeSlotUiStateContent$Subscription0.getStoryCreatorLabel(), homeSlotUiStateContent$Subscription0.getFollowerCount(), homeSlotUiStateContent$Subscription0.getFollowerIncreaseCount(), homeSlotUiStateContent$Subscription0.isFollowing(), homeSlotUiStateContent$Subscription0.getOnClickFollow(), homeSlotUiStateContent$Subscription0.getOnClickUnFollow(), composer1, v1 & 14);
            SubscriptionKt.a(homeSlotUiStateContent$Subscription0.getEntryList(), composer1, 8);
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
            scopeUpdateScope0.updateScope(new s1(homeSlotUiStateContent$Subscription0, v));
        }
    }
}

