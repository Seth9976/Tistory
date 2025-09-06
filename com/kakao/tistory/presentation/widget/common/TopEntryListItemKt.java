package com.kakao.tistory.presentation.widget.common;

import a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import c;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.SemanticKt;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.list.EntryListKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.theme.TTextStyle;
import d;
import e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001AO\u0010\f\u001A\u00020\n2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u0005\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001A\u00020\u00002\u0006\u0010\u0007\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u00002\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"", "ranking", "", "title", "Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;", "thumbnail", "likeCount", "commentCount", "viewCount", "Lkotlin/Function0;", "", "onClick", "TopEntryListItem", "(ILjava/lang/String;Lcom/kakao/tistory/presentation/design/ui/thumbnail/ThumbnailUiState;IIILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTopEntryListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopEntryListItem.kt\ncom/kakao/tistory/presentation/widget/common/TopEntryListItemKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,83:1\n148#2:84\n148#2:121\n148#2:122\n148#2:159\n98#3:85\n95#3,6:86\n101#3:120\n105#3:167\n78#4,6:92\n85#4,4:107\n89#4,2:117\n78#4,6:130\n85#4,4:145\n89#4,2:155\n93#4:162\n93#4:166\n368#5,9:98\n377#5:119\n368#5,9:136\n377#5:157\n378#5,2:160\n378#5,2:164\n4032#6,6:111\n4032#6,6:149\n71#7:123\n68#7,6:124\n74#7:158\n78#7:163\n*S KotlinDebug\n*F\n+ 1 TopEntryListItem.kt\ncom/kakao/tistory/presentation/widget/common/TopEntryListItemKt\n*L\n37#1:84\n46#1:121\n51#1:122\n58#1:159\n33#1:85\n33#1:86,6\n33#1:120\n33#1:167\n33#1:92,6\n33#1:107,4\n33#1:117,2\n53#1:130,6\n53#1:145,4\n53#1:155,2\n53#1:162\n33#1:166\n33#1:98,9\n33#1:119\n53#1:136,9\n53#1:157\n53#1:160,2\n33#1:164,2\n33#1:111,6\n53#1:149,6\n53#1:123\n53#1:124,6\n53#1:158\n53#1:163\n*E\n"})
public final class TopEntryListItemKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void TopEntryListItem(int v, @NotNull String s, @Nullable ThumbnailUiState thumbnailUiState0, int v1, int v2, int v3, @NotNull Function0 function00, @Nullable Composer composer0, int v4) {
        Intrinsics.checkNotNullParameter(s, "title");
        Intrinsics.checkNotNullParameter(function00, "onClick");
        Composer composer1 = composer0.startRestartGroup(141813061);
        int v5 = (v4 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v4 : v4;
        if((v4 & 0x70) == 0) {
            v5 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v4 & 0x380) == 0) {
            v5 |= (composer1.changed(thumbnailUiState0) ? 0x100 : 0x80);
        }
        if((v4 & 0x1C00) == 0) {
            v5 |= (composer1.changed(v1) ? 0x800 : 0x400);
        }
        if((v4 & 0xE000) == 0) {
            v5 |= (composer1.changed(v2) ? 0x4000 : 0x2000);
        }
        if((v4 & 0x70000) == 0) {
            v5 |= (composer1.changed(v3) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x380000) == 0) {
            v5 |= (composer1.changedInstance(function00) ? 0x100000 : 0x80000);
        }
        if((0x2DB6DB & v5) != 0x92492 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(141813061, v5, -1, "com.kakao.tistory.presentation.widget.common.TopEntryListItem (TopEntryListItem.kt:31)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0(ClickableKt.clickable-XHw0xAI$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), false, null, null, function00, 7, null), 16.0f, 14.0f, 20.0f, 14.0f);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getTop(), composer1, 0x30);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                d.a(v6, composer1, v6, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            TextKt.Text--4IGK_g(String.valueOf(v), SemanticKt.contentDescription(SizeKt.width-3ABfNKs(modifier$Companion0, 28.0f), new String[]{StringResources_androidKt.stringResource(string.content_desc_ranking, new Object[]{v}, composer1, 0x40)}, composer1, 6), 0L, 0L, null, null, null, 0L, null, TextAlign.box-impl(3), 0L, 0, false, 1, 0, null, TTextStyle.INSTANCE.getSize16Weight700(), composer1, 0x180, 0x180C00, 0xDDF8);
            c.a(4.0f, modifier$Companion0, composer1, 6);
            Modifier modifier2 = RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                d.a(v7, composer1, v7, function21);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            EntryListKt.EntryListCompactItem(null, PaddingKt.PaddingValues-0680j_4(0.0f), StringUtils.INSTANCE.asAnnotationString(s), thumbnailUiState0, v1, v2, v3, composer1, v5 << 3 & 0x1C00 | 54 | v5 << 3 & 0xE000 | v5 << 3 & 0x70000 | v5 << 3 & 0x380000, 0);
            if(e.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g5(v, s, thumbnailUiState0, v1, v2, v3, function00, v4));
        }
    }

    public static final void access$TopEntryListItemPreview(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xCB356E41);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xCB356E41, v, -1, "com.kakao.tistory.presentation.widget.common.TopEntryListItemPreview (TopEntryListItem.kt:70)");
            }
            TopEntryListItemKt.TopEntryListItem(1, "마법 같은 밤하늘 아래, 라플란드의 겨울 여행기", ThumbnailUiStateKt.toThumbnailItem("1"), 0x7B, 45, 0x400, h5.a, composer1, 0x1B6C36);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i5(v));
        }
    }
}

