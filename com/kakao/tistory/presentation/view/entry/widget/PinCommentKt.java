package com.kakao.tistory.presentation.view.entry.widget;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import b;
import c;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Comment;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Pin;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001A;\u0010\u000B\u001A\u00020\u00022\u0006\u0010\u0006\u001A\u00020\u00052\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00052\u0006\u0010\b\u001A\u00020\u00052\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;", "pinComment", "", "PinComment", "(Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Pin;Landroidx/compose/runtime/Composer;I)V", "", "userName", "userThumbnail", "comment", "Lkotlin/Function0;", "onClick", "StickyPinComment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPinComment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PinComment.kt\ncom/kakao/tistory/presentation/view/entry/widget/PinCommentKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,113:1\n148#2:114\n148#2:151\n148#2:156\n148#2:193\n148#2:194\n148#2:199\n148#2:200\n148#2:201\n148#2:238\n148#2:239\n148#2:240\n148#2:318\n85#3:115\n82#3,6:116\n88#3:150\n92#3:155\n85#3:241\n82#3,6:242\n88#3:276\n92#3:322\n78#4,6:122\n85#4,4:137\n89#4,2:147\n93#4:154\n78#4,6:164\n85#4,4:179\n89#4,2:189\n93#4:197\n78#4,6:209\n85#4,4:224\n89#4,2:234\n78#4,6:248\n85#4,4:263\n89#4,2:273\n78#4,6:285\n85#4,4:300\n89#4,2:310\n93#4:316\n93#4:321\n93#4:325\n368#5,9:128\n377#5:149\n378#5,2:152\n368#5,9:170\n377#5:191\n378#5,2:195\n368#5,9:215\n377#5:236\n368#5,9:254\n377#5:275\n368#5,9:291\n377#5:312\n378#5,2:314\n378#5,2:319\n378#5,2:323\n4032#6,6:141\n4032#6,6:183\n4032#6,6:228\n4032#6,6:267\n4032#6,6:304\n98#7:157\n95#7,6:158\n101#7:192\n105#7:198\n98#7:202\n95#7,6:203\n101#7:237\n98#7:277\n94#7,7:278\n101#7:313\n105#7:317\n105#7:326\n*S KotlinDebug\n*F\n+ 1 PinComment.kt\ncom/kakao/tistory/presentation/view/entry/widget/PinCommentKt\n*L\n30#1:114\n36#1:151\n50#1:156\n54#1:193\n55#1:194\n84#1:199\n86#1:200\n89#1:201\n91#1:238\n93#1:239\n95#1:240\n99#1:318\n27#1:115\n27#1:116,6\n27#1:150\n27#1:155\n95#1:241\n95#1:242,6\n95#1:276\n95#1:322\n27#1:122,6\n27#1:137,4\n27#1:147,2\n27#1:154\n48#1:164,6\n48#1:179,4\n48#1:189,2\n48#1:197\n82#1:209,6\n82#1:224,4\n82#1:234,2\n95#1:248,6\n95#1:263,4\n95#1:273,2\n96#1:285,6\n96#1:300,4\n96#1:310,2\n96#1:316\n95#1:321\n82#1:325\n27#1:128,9\n27#1:149\n27#1:152,2\n48#1:170,9\n48#1:191\n48#1:195,2\n82#1:215,9\n82#1:236\n95#1:254,9\n95#1:275\n96#1:291,9\n96#1:312\n96#1:314,2\n95#1:319,2\n82#1:323,2\n27#1:141,6\n48#1:183,6\n82#1:228,6\n95#1:267,6\n96#1:304,6\n48#1:157\n48#1:158,6\n48#1:192\n48#1:198\n82#1:202\n82#1:203,6\n82#1:237\n96#1:277\n96#1:278,7\n96#1:313\n96#1:317\n82#1:326\n*E\n"})
public final class PinCommentKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void PinComment(@NotNull Pin commentItemUIModel$Pin0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(commentItemUIModel$Pin0, "pinComment");
        Composer composer1 = composer0.startRestartGroup(0x5633FF08);
        int v1 = (v & 14) == 0 ? (composer1.changed(commentItemUIModel$Pin0) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5633FF08, v1, -1, "com.kakao.tistory.presentation.view.entry.widget.PinComment (PinComment.kt:25)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(BackgroundKt.background-bw27NRU$default(modifier$Companion0, ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null), 20.0f, 16.0f, 20.0f, 0.0f, 8, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
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
            PinCommentKt.a(commentItemUIModel$Pin0.getOwnerUserName(), composer1, 0);
            CommentKt.Comment(PaddingKt.padding-qDBjuR0$default(BackgroundKt.background-bw27NRU$default(modifier$Companion0, ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null), 0.0f, 22.0f, 0.0f, 22.0f, 5, null), Comment.copy$default(commentItemUIModel$Pin0.getComment(), 0L, null, null, null, null, null, 0, null, false, false, false, false, false, false, false, null, null, null, null, commentItemUIModel$Pin0.getOnClickReply(), null, 0x17FDFF, null), composer1, 0, 0);
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
            scopeUpdateScope0.updateScope(new p1(commentItemUIModel$Pin0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void StickyPinComment(@NotNull String s, @Nullable String s1, @NotNull String s2, @Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        Function0 function01;
        String s3;
        int v2;
        Intrinsics.checkNotNullParameter(s, "userName");
        Intrinsics.checkNotNullParameter(s2, "comment");
        Composer composer1 = composer0.startRestartGroup(0x58F47149);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s1) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(s2) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            s3 = (v1 & 2) == 0 ? s1 : null;
            Function0 function02 = (v1 & 8) == 0 ? function00 : r1.a;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x58F47149, v2, -1, "com.kakao.tistory.presentation.view.entry.widget.StickyPinComment (PinComment.kt:80)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = PaddingKt.padding-VpY3zN4$default(ClickableKt.clickable-XHw0xAI$default(SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(BackgroundKt.background-bw27NRU$default(ModifierKt.shadow-QgBizOU$default(modifier$Companion0, 0x1400000000000000L, 1.0f, 0.0f, 0.0f, 0.0f, 24, null), ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null), 72.0f), 0.0f, 1, null), false, null, null, function02, 7, null), 20.0f, 0.0f, 2, null);
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
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
            CommentKt.CommentProfileThumbnail(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 16.0f, 0.0f, 0.0f, 13, null), s3, null, composer1, v2 & 0x70 | 6, 4);
            c.a(12.0f, modifier$Companion0, composer1, 6);
            Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 14.0f, 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
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
            MeasurePolicy measurePolicy2 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
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
            CommentKt.CommentUserName(null, s, false, true, null, composer1, v2 << 3 & 0x70 | 0xD80, 17);
            composer1.endNode();
            b.a(2.0f, modifier$Companion0, composer1, 6);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, false, 1, 0, null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getBody1(), 0L, 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141C00000L, null, null, null, 0, 0, null, 0xFDFFFB, null), composer1, v2 >> 6 & 14, 0x6C30, 0x197FE);
            if(e.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
            function01 = function02;
        }
        else {
            composer1.skipToGroupEnd();
            s3 = s1;
            function01 = function00;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s1(s, s3, s2, function01, v, v1));
        }
    }

    public static final void a(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-643004524);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-643004524, v1, -1, "com.kakao.tistory.presentation.view.entry.widget.PinMessage (PinComment.kt:46)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            String s1 = null;
            Modifier modifier0 = SizeKt.fillMaxWidth$default(SizeKt.height-3ABfNKs(modifier$Companion0, 24.0f), 0.0f, 1, null);
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
            CommentKt.PinIcon(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 1.0f, 0.0f, 0.0f, 13, null), composer1, 6, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(modifier$Companion0, 4.0f), composer1, 6);
            composer1.startReplaceGroup(1264118605);
            if(s != null) {
                s1 = StringResources_androidKt.stringResource(string.label_comment_pinned_by_user, new Object[]{StringUtils.INSTANCE.getEllipsisText(s, 12)}, composer1, 0x40);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0x4B58EAD9);
            String s2 = s1 == null ? StringResources_androidKt.stringResource(string.label_comment_pinned_by_unknown_user, composer1, 0) : s1;
            composer1.endReplaceGroup();
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext2(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), ColorResources_androidKt.colorResource(color.color_777777, composer1, 0), 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFA, null), composer1, 0, 0xC00, 0x1DFFE);
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
            scopeUpdateScope0.updateScope(new q1(s, v));
        }
    }
}

