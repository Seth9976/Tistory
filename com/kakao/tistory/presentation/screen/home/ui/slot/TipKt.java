package com.kakao.tistory.presentation.screen.home.ui.slot;

import a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.SemanticKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Tip;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotContainerKt;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import com.kakao.tistory.presentation.widget.common.CommonImageKt;
import d;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Tip;", "slot", "", "Tip", "(Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Tip;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tip.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/TipKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,180:1\n148#2:181\n148#2:182\n148#2:183\n148#2:184\n148#2:185\n148#2:222\n148#2:223\n148#2:224\n85#3,3:186\n88#3:217\n92#3:221\n78#4,6:189\n85#4,4:204\n89#4,2:214\n93#4:220\n368#5,9:195\n377#5:216\n378#5,2:218\n4032#6,6:208\n*S KotlinDebug\n*F\n+ 1 Tip.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/TipKt\n*L\n83#1:181\n105#1:182\n106#1:183\n108#1:184\n110#1:185\n130#1:222\n146#1:223\n157#1:224\n103#1:186,3\n103#1:217\n103#1:221\n103#1:189,6\n103#1:204,4\n103#1:214,2\n103#1:220\n103#1:195,9\n103#1:216\n103#1:218,2\n103#1:208,6\n*E\n"})
public final class TipKt {
    public static final Tip a;

    static {
        ThumbnailUiState thumbnailUiState0 = ThumbnailUiStateKt.toThumbnailItem("https://t1.daumcdn.net/daumtop_deco/images/pctop/2023/logo_daum.png");
        com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Tip homeSlotUiStateContent$Tip0 = new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Tip("", "일이삼사오육칠팔구십일이삼사오육칠팔구십", null, p2.a, "일이삼사오육칠팔구십일이삼사오육칠팔구십", thumbnailUiState0, q2.a, 4, null);
        TipKt.a = new Tip(null, null, "티스토리 운영 TIP", "https://t1.daumcdn.net/daumtop_deco/images/pctop/2023/logo_daum.png", CollectionsKt__CollectionsKt.listOf(new com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Tip[]{com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Tip.copy$default(homeSlotUiStateContent$Tip0, null, "느린마을", null, null, "마케팅 전략에 SEO를 적용하는 방법", null, null, 109, null), com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Tip.copy$default(homeSlotUiStateContent$Tip0, null, null, null, null, "마법 같은 밤하늘 아래, 라플란드의 겨울 여행기", null, null, 0x6F, null), com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Tip.copy$default(homeSlotUiStateContent$Tip0, null, null, null, null, "25일만에 애드센스 승인 받았습니다.", null, null, 0x6F, null), com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Tip.copy$default(homeSlotUiStateContent$Tip0, null, null, null, null, "일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십일이삼사오육칠팔구십", null, null, 0x6F, null), homeSlotUiStateContent$Tip0, homeSlotUiStateContent$Tip0, homeSlotUiStateContent$Tip0, homeSlotUiStateContent$Tip0, homeSlotUiStateContent$Tip0, homeSlotUiStateContent$Tip0, homeSlotUiStateContent$Tip0}), 3, null);
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Tip(@NotNull Tip homeSlotUiState$Tip0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(homeSlotUiState$Tip0, "slot");
        Composer composer1 = composer0.startRestartGroup(-1485560802);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485560802, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Tip (Tip.kt:74)");
        }
        SlotContainerKt.SlotContainer(ComposableLambdaKt.rememberComposableLambda(270350870, true, new i2(homeSlotUiState$Tip0), composer1, 54), false, PaddingKt.PaddingValues-0680j_4(0.0f), ComposableLambdaKt.rememberComposableLambda(0x68FE6323, true, new k2(homeSlotUiState$Tip0), composer1, 54), composer1, 0xD86, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l2(homeSlotUiState$Tip0, v));
        }
    }

    public static final void a(ColumnScope columnScope0, String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x6D420E11);
        int v1 = (v & 14) == 0 ? (composer1.changed(columnScope0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6D420E11, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.TipEntryImage (Tip.kt:151)");
            }
            CommonImageKt.CommonImage(s, null, columnScope0.align(SizeKt.size-3ABfNKs(Modifier.Companion, 120.0f), Alignment.Companion.getEnd()), new ColorPainter(0L, null), null, null, composer1, v1 >> 3 & 14 | 0x1030, 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n2(columnScope0, s, v));
        }
    }

    public static final void a(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1438213081);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1438213081, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Blog (Tip.kt:121)");
            }
            long v2 = Color.copy-wmQWz5c$default(0L, 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
            TextKt.Text--4IGK_g(s, SemanticKt.contentDescription(PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 0.0f, 3.0f, 1, null), new String[]{StringResources_androidKt.stringResource(string.content_desc_blog, composer1, 0), s}, composer1, 6), v2, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, TTextStyle.INSTANCE.getSize11Weight400(), composer1, v1 & 14 | 0x180, 0x180C30, 0xD7F8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g2(s, v));
        }
    }

    public static final void access$PreviewTip(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x37DC1085);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x37DC1085, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.PreviewTip (Tip.kt:67)");
            }
            TipKt.Tip(TipKt.a, composer1, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h2(v));
        }
    }

    public static final void access$TipEntry-RPmYEkk(com.kakao.tistory.presentation.screen.home.item.HomeSlotUiStateContent.Tip homeSlotUiStateContent$Tip0, long v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x94EBEFCD);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(homeSlotUiStateContent$Tip0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x94EBEFCD, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.TipEntry (Tip.kt:101)");
            }
            Modifier modifier0 = PaddingKt.padding-VpY3zN4(ClickableKt.clickable-XHw0xAI$default(ModifierKt.shape-8ww4TTg$default(SizeKt.width-3ABfNKs(Modifier.Companion, 142.0f), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(8.0f), v, null, 0.0f, 12, null), false, StringResources_androidKt.stringResource(string.content_desc_entry_move, composer1, 0), null, homeSlotUiStateContent$Tip0.getOnClickEntry(), 5, null), 12.0f, 10.0f);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.spacedBy-0680j_4(4.0f), Alignment.Companion.getStart(), composer1, 54);
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
            TipKt.a(homeSlotUiStateContent$Tip0.getBlogTitle(), composer1, 0);
            TipKt.b(homeSlotUiStateContent$Tip0.getTitle(), composer1, 0);
            TipKt.a(ColumnScopeInstance.INSTANCE, homeSlotUiStateContent$Tip0.getThumbnail().getOrigin(), composer1, 6);
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
            scopeUpdateScope0.updateScope(new m2(homeSlotUiStateContent$Tip0, v, v1));
        }
    }

    public static final void b(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x6B27E904);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6B27E904, v1, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.TipEntryTitle (Tip.kt:135)");
            }
            TextKt.Text--4IGK_g(s, SemanticKt.contentDescription(PaddingKt.padding-VpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 1.0f, 1, null), new String[]{StringResources_androidKt.stringResource(string.content_desc_entry, composer1, 0), s}, composer1, 6), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 3, null, TTextStyle.INSTANCE.getSize15Weight600(), composer1, v1 & 14 | 0x180, 1600560, 0x97F8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o2(s, v));
        }
    }
}

