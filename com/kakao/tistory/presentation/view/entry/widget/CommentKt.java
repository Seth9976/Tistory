package com.kakao.tistory.presentation.view.entry.widget;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import b;
import c;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.StringExtensionKt;
import com.kakao.tistory.presentation.common.utils.DateUtils.DateTimeFormat;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.thumbnail.BlogThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiState;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Comment;
import com.kakao.tistory.presentation.view.comment.donation.DonationColors;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.common.DateTimeTextKt;
import com.kakao.tistory.presentation.widget.common.ReadMoreTextViewKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A!\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001A5\u0010\u000B\u001A\u00020\u00042\b\b\u0002\u0010\u0001\u001A\u00020\u00002\b\u0010\b\u001A\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000B\u0010\f\u001AC\u0010\u0012\u001A\u00020\u00042\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0006\u0010\r\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u000E2\u0010\b\u0002\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001A\u0019\u0010\u0014\u001A\u00020\u00042\b\b\u0002\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\u0010\u0010\u0017\u001A\u0004\u0018\u00010\u00168\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;", "comment", "", "Comment", "(Landroidx/compose/ui/Modifier;Lcom/kakao/tistory/presentation/view/comment/contract/CommentItemUIModel$Comment;Landroidx/compose/runtime/Composer;II)V", "", "imageUrl", "Lkotlin/Function0;", "onClick", "CommentProfileThumbnail", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "userName", "", "showSecretIcon", "showPinnedIcon", "onUserNameClick", "CommentUserName", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PinIcon", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nComment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comment.kt\ncom/kakao/tistory/presentation/view/entry/widget/CommentKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,296:1\n98#2:297\n95#2,6:298\n101#2:332\n105#2:337\n98#2:375\n94#2,7:376\n101#2:411\n105#2:415\n98#2:438\n94#2,7:439\n101#2:474\n105#2:478\n98#2:483\n95#2,6:484\n101#2:518\n105#2:523\n98#2:528\n95#2,6:529\n101#2:563\n105#2:576\n78#3,6:304\n85#3,4:319\n89#3,2:329\n93#3:336\n78#3,6:346\n85#3,4:361\n89#3,2:371\n78#3,6:383\n85#3,4:398\n89#3,2:408\n93#3:414\n78#3,6:446\n85#3,4:461\n89#3,2:471\n93#3:477\n93#3:481\n78#3,6:490\n85#3,4:505\n89#3,2:515\n93#3:522\n78#3,6:535\n85#3,4:550\n89#3,2:560\n93#3:575\n368#4,9:310\n377#4:331\n378#4,2:334\n368#4,9:352\n377#4:373\n368#4,9:389\n377#4:410\n378#4,2:412\n368#4,9:452\n377#4:473\n378#4,2:475\n378#4,2:479\n368#4,9:496\n377#4:517\n378#4,2:520\n368#4,9:541\n377#4:562\n378#4,2:573\n4032#5,6:323\n4032#5,6:365\n4032#5,6:402\n4032#5,6:465\n4032#5,6:509\n4032#5,6:554\n148#6:333\n148#6:338\n148#6:416\n148#6:436\n148#6:437\n158#6:519\n148#6:524\n148#6:525\n148#6:526\n148#6:527\n148#6:564\n148#6:565\n158#6:577\n148#6:578\n85#7:339\n82#7,6:340\n88#7:374\n92#7:482\n1#8:417\n1223#9,6:418\n1223#9,6:424\n1223#9,6:430\n1240#10:566\n1039#10,6:567\n81#11:579\n107#11,2:580\n*S KotlinDebug\n*F\n+ 1 Comment.kt\ncom/kakao/tistory/presentation/view/entry/widget/CommentKt\n*L\n47#1:297\n47#1:298,6\n47#1:332\n47#1:337\n117#1:375\n117#1:376,7\n117#1:411\n117#1:415\n154#1:438\n154#1:439,7\n154#1:474\n154#1:478\n173#1:483\n173#1:484,6\n173#1:518\n173#1:523\n231#1:528\n231#1:529,6\n231#1:563\n231#1:576\n47#1:304,6\n47#1:319,4\n47#1:329,2\n47#1:336\n116#1:346,6\n116#1:361,4\n116#1:371,2\n117#1:383,6\n117#1:398,4\n117#1:408,2\n117#1:414\n154#1:446,6\n154#1:461,4\n154#1:471,2\n154#1:477\n116#1:481\n173#1:490,6\n173#1:505,4\n173#1:515,2\n173#1:522\n231#1:535,6\n231#1:550,4\n231#1:560,2\n231#1:575\n47#1:310,9\n47#1:331\n47#1:334,2\n116#1:352,9\n116#1:373\n117#1:389,9\n117#1:410\n117#1:412,2\n154#1:452,9\n154#1:473\n154#1:475,2\n116#1:479,2\n173#1:496,9\n173#1:517\n173#1:520,2\n231#1:541,9\n231#1:562\n231#1:573,2\n47#1:323,6\n116#1:365,6\n117#1:402,6\n154#1:465,6\n173#1:509,6\n231#1:554,6\n53#1:333\n92#1:338\n124#1:416\n149#1:436\n151#1:437\n187#1:519\n200#1:524\n219#1:525\n233#1:526\n234#1:527\n238#1:564\n243#1:565\n273#1:577\n274#1:578\n116#1:339\n116#1:340,6\n116#1:374\n116#1:482\n128#1:418,6\n130#1:424,6\n143#1:430,6\n246#1:566\n247#1:567,6\n130#1:579\n130#1:580,2\n*E\n"})
public final class CommentKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Comment(@Nullable Modifier modifier0, @NotNull Comment commentItemUIModel$Comment0, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v3;
        int v2;
        Intrinsics.checkNotNullParameter(commentItemUIModel$Comment0, "comment");
        Composer composer1 = composer0.startRestartGroup(-2047660455);
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
            v2 |= (composer1.changed(commentItemUIModel$Comment0) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2047660455, v2, -1, "com.kakao.tistory.presentation.view.entry.widget.Comment (Comment.kt:39)");
            }
            if(commentItemUIModel$Comment0.isRestrict()) {
                v3 = color.point1;
            }
            else {
                v3 = commentItemUIModel$Comment0.isSecret() ? color.gray2 : color.gray1;
            }
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composer1, 0);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            Function0 function01 = null;
            CommentKt.CommentProfileThumbnail(null, commentItemUIModel$Comment0.getUserThumbnail(), (commentItemUIModel$Comment0.getShowPrivacyInform() ? commentItemUIModel$Comment0.getOnClickUserThumbnail() : null), composer1, 0, 1);
            c.a(12.0f, Modifier.Companion, composer1, 6);
            Modifier modifier4 = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.Companion, 1.0f, false, 2, null);
            String s = commentItemUIModel$Comment0.getUserName();
            String s1 = "";
            if(s == null) {
                s = "";
            }
            String s2 = commentItemUIModel$Comment0.isRestrict() || !commentItemUIModel$Comment0.getShowPrivacyInform() ? null : commentItemUIModel$Comment0.getMentionUserName();
            String s3 = commentItemUIModel$Comment0.getComment();
            if(s3 != null) {
                s1 = s3;
            }
            AnnotatedString annotatedString0 = AnnotatedStringKt.AnnotatedString$default(s1, new SpanStyle(ColorResources_androidKt.colorResource(v3, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFE, null), null, 4, null);
            int v5 = commentItemUIModel$Comment0.getReplyCount();
            Long long0 = commentItemUIModel$Comment0.getOrderAmount();
            String s4 = commentItemUIModel$Comment0.getWrittenTime();
            boolean z = commentItemUIModel$Comment0.isSecret();
            boolean z1 = commentItemUIModel$Comment0.isPinned();
            boolean z2 = commentItemUIModel$Comment0.getShowMenuButton();
            boolean z3 = commentItemUIModel$Comment0.getShowReplyButton();
            boolean z4 = commentItemUIModel$Comment0.getShowReplyCount();
            Function0 function02 = commentItemUIModel$Comment0.getOnClickMenu();
            Function1 function10 = commentItemUIModel$Comment0.getOnClickLink();
            Function0 function03 = commentItemUIModel$Comment0.getOnClickReply();
            Function0 function04 = commentItemUIModel$Comment0.getOnClickMore();
            if(commentItemUIModel$Comment0.getShowPrivacyInform()) {
                function01 = commentItemUIModel$Comment0.getOnclickUserName();
            }
            modifier1 = modifier2;
            CommentKt.a(modifier4, s, s4, s2, annotatedString0, v5, long0, z, z1, z2, z3, z4, function02, function01, function10, function03, function04, composer1, 0, 0, 0);
            composer1.endNode();
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
            scopeUpdateScope0.updateScope(new i0(modifier1, commentItemUIModel$Comment0, v, v1));
        }
    }

    @Composable
    public static final void CommentProfileThumbnail(@Nullable Modifier modifier0, @Nullable String s, @Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        Function0 function01;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x4F2DB5F6);
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
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            ThumbnailUiState thumbnailUiState0 = null;
            function01 = (v1 & 4) == 0 ? function00 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4F2DB5F6, v2, -1, "com.kakao.tistory.presentation.view.entry.widget.CommentProfileThumbnail (Comment.kt:84)");
            }
            if(s != null) {
                thumbnailUiState0 = ThumbnailUiStateKt.toBlogThumbnailItem(s);
            }
            Modifier modifier2 = function01 == null ? Modifier.Companion : ClickableKt.clickable-XHw0xAI$default(Modifier.Companion, false, null, null, function01, 7, null);
            BlogThumbnailKt.BlogThumbnail-EUb7tLY(thumbnailUiState0, 40.0f, modifier1.then(modifier2), false, null, composer1, 0x30, 24);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function01 = function00;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p0(modifier1, s, function01, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CommentUserName(@Nullable Modifier modifier0, @NotNull String s, boolean z, boolean z1, @Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        Function0 function01;
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(s, "userName");
        Composer composer1 = composer0.startRestartGroup(0x4160BE1);
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
            v2 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            Function0 function02 = (v1 & 16) == 0 ? function00 : null;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4160BE1, v2, -1, "com.kakao.tistory.presentation.view.entry.widget.CommentUserName (Comment.kt:171)");
            }
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            Modifier modifier4 = function02 == null ? Modifier.Companion : ClickableKt.clickable-XHw0xAI$default(Modifier.Companion, false, null, null, function02, 7, null);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, rowScopeInstance0.weight(modifier4, 1.0f, false), 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, false, 1, 0, null, TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), ColorResources_androidKt.colorResource(color.gray1, composer1, 0), 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFA, null), composer1, v2 >> 3 & 14, 0x6C30, 0x197FC);
            c.a(4.5f, Modifier.Companion, composer1, 6);
            if(z1) {
                composer1.startReplaceGroup(-967014048);
                CommentKt.PinIcon(null, composer1, 0, 1);
            }
            else if(z) {
                composer1.startReplaceGroup(0xC65D6E5D);
                CommentKt.a(composer1, 0);
            }
            else {
                composer1.startReplaceGroup(0xC65DF581);
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function01 = function02;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            function01 = function00;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q0(modifier1, s, z, z1, function01, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void PinIcon(@Nullable Modifier modifier0, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(440070615);
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
                ComposerKt.traceEventStart(440070615, v2, -1, "com.kakao.tistory.presentation.view.entry.widget.PinIcon (Comment.kt:207)");
            }
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ico_pin, composer1, 0), null, modifier0, ColorResources_androidKt.colorResource(color.color_979797, composer1, 0), composer1, v2 << 6 & 0x380 | 56, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t0(modifier0, v, v1));
        }
    }

    public static final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xACEDF009);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xACEDF009, v, -1, "com.kakao.tistory.presentation.view.entry.widget.SecretIcon (Comment.kt:197)");
            }
            Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 18.0f);
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_list_secret, composer1, 0), null, modifier0, ColorResources_androidKt.colorResource(color.gray7, composer1, 0), composer1, 440, 0);
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

    public static final void a(Modifier modifier0, long v, Composer composer0, int v1, int v2) {
        Modifier modifier1;
        int v3;
        Composer composer1 = composer0.startRestartGroup(0x681D39);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? v1 | (composer1.changed(modifier0) ? 4 : 2) : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v3 & 91) != 18 || !composer1.getSkipping()) {
            modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x681D39, v3, -1, "com.kakao.tistory.presentation.view.entry.widget.DonationAmount (Comment.kt:227)");
            }
            DonationColors donationColors0 = DonationColors.Companion.of(v);
            Modifier modifier2 = PaddingKt.padding-VpY3zN4(BackgroundKt.background-bw27NRU(modifier1, donationColors0.getContainerColor-0d7_KjU(), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(6.0f)), 12.0f, 8.0f);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer1, 0x30);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                d.a(v4, composer1, v4, function20);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            Modifier modifier4 = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 0.0f, 1.0f, 0.0f, 0.0f, 13, null);
            IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_donate_small, composer1, 0), null, modifier4, donationColors0.getContentColor-0d7_KjU(), composer1, 440, 0);
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, 8.0f), composer1, 6);
            composer1.startReplaceGroup(0x16EF4282);
            Builder annotatedString$Builder0 = new Builder(0, 1, null);
            int v5 = annotatedString$Builder0.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null));
            try {
                annotatedString$Builder0.append(StringExtensionKt.toFormattedString$default(v, 0, 1, null));
            }
            finally {
                annotatedString$Builder0.pop(v5);
            }
            annotatedString$Builder0.append(StringResources_androidKt.stringResource(string.label_comment_donation_amount, composer1, 0));
            AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
            composer1.endReplaceGroup();
            ExcludeFontPaddingTextKt.Text-edWjEy0(annotatedString0, null, donationColors0.getContentColor-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, null, TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), 0L, 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null), composer1, 0, 0xC00, 0x3DFFA);
            composer1.endNode();
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
            scopeUpdateScope0.updateScope(new r0(modifier1, v, v1, v2));
        }
    }

    public static final void a(Modifier modifier0, String s, String s1, String s2, AnnotatedString annotatedString0, int v, Long long0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, Function0 function00, Function0 function01, Function1 function10, Function0 function02, Function0 function03, Composer composer0, int v1, int v2, int v3) {
        Function0 function06;
        Function1 function11;
        Function0 function05;
        Function0 function04;
        Long long1;
        String s3;
        Modifier modifier1;
        Function0 function013;
        Arrangement arrangement1;
        Function1 function13;
        int v9;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0xB4DAFCE3);
        if((v3 & 1) == 0) {
            v4 = (v1 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        int v5 = 0x20;
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v4 |= (composer1.changed(s) ? 0x20 : 16);
        }
        int v6 = 0x100;
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v4 |= (composer1.changed(s1) ? 0x100 : 0x80);
        }
        int v7 = 0x800;
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v4 |= (composer1.changed(s2) ? 0x800 : 0x400);
        }
        int v8 = 0x4000;
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v4 |= (composer1.changed(annotatedString0) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x70000) == 0) {
            v4 |= (composer1.changed(v) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v1 & 0x380000) == 0) {
            v4 |= (composer1.changed(long0) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((0x1C00000 & v1) == 0) {
            v4 |= (composer1.changed(z) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((0xE000000 & v1) == 0) {
            v4 |= (composer1.changed(z1) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((0x70000000 & v1) == 0) {
            v4 |= (composer1.changed(z2) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v9 = (v2 & 14) == 0 ? (composer1.changed(z3) ? 4 : 2) | v2 : v2;
        }
        else {
            v9 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v9 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            if(!composer1.changed(z4)) {
                v5 = 16;
            }
            v9 |= v5;
        }
        if((v3 & 0x1000) != 0) {
            v9 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            if(!composer1.changedInstance(function00)) {
                v6 = 0x80;
            }
            v9 |= v6;
        }
        if((v3 & 0x2000) != 0) {
            v9 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            if(!composer1.changedInstance(function01)) {
                v7 = 0x400;
            }
            v9 |= v7;
        }
        if((v3 & 0x4000) != 0) {
            v9 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            if(!composer1.changedInstance(function10)) {
                v8 = 0x2000;
            }
            v9 |= v8;
        }
        if((v3 & 0x8000) != 0) {
            v9 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v9 |= (composer1.changedInstance(function02) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x10000) != 0) {
            v9 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v9 |= (composer1.changedInstance(function03) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x5B6DB6DB) != 306783378 || (0x2DB6DB & v9) != 0x92492 || !composer1.getSkipping()) {
            Modifier modifier2 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
            String s4 = (v3 & 8) == 0 ? s2 : null;
            Long long2 = (v3 & 0x40) == 0 ? long0 : null;
            Function0 function07 = (v3 & 0x1000) == 0 ? function00 : j0.a;
            Function0 function08 = (v3 & 0x2000) == 0 ? function01 : k0.a;
            Function1 function12 = (v3 & 0x4000) == 0 ? function10 : l0.a;
            Function0 function09 = (v3 & 0x8000) == 0 ? function02 : m0.a;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB4DAFCE3, v4, v9, "com.kakao.tistory.presentation.view.entry.widget.CommentContent (Comment.kt:114)");
            }
            Arrangement arrangement0 = Arrangement.INSTANCE;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
            int v10 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            modifier1 = modifier2;
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function010 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function010);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.a(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting()) {
                function13 = function12;
                d.a(v10, composer1, v10, function20);
            }
            else {
                function13 = function12;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v10)) {
                    d.a(v10, composer1, v10, function20);
                }
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
            int v11 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            Function0 function011 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function011);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = a.a(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting()) {
                arrangement1 = arrangement0;
                d.a(v11, composer1, v11, function21);
            }
            else {
                arrangement1 = arrangement0;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v11)) {
                    d.a(v11, composer1, v11, function21);
                }
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            CommentKt.CommentUserName(RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), s, z, z1, function08, composer1, v4 & 0x70 | v4 >> 15 & 0x380 | v4 >> 15 & 0x1C00 | v9 << 3 & 0xE000, 0);
            composer1.startReplaceGroup(0xD98A03D6);
            if(z2) {
                CommentKt.a(function07, composer1, v9 >> 6 & 14);
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            b.a(2.0f, modifier$Companion0, composer1, 6);
            String s5 = s4 == null ? null : androidx.room.a.j("@", StringUtils.INSTANCE.getEllipsisText(s4, 12));
            composer1.startReplaceGroup(-1051904912);
            boolean z5 = composer1.changed(s5);
            MentionVisualTransformation mentionVisualTransformation0 = composer1.rememberedValue();
            if(z5 || mentionVisualTransformation0 == Composer.Companion.getEmpty()) {
                if(s5 == null) {
                    s5 = "";
                }
                mentionVisualTransformation0 = new MentionVisualTransformation(s5);
                composer1.updateRememberedValue(mentionVisualTransformation0);
            }
            MutableState mutableState0 = com.kakao.tistory.presentation.common.graph.b.a(composer1, 0xC14D40A0);
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            Modifier modifier5 = MentionVisualTransformationKt.drawMention-xwkQ0AY$default(modifier$Companion0, 0.0f, mentionVisualTransformation0, ((TextLayoutResult)mutableState0.getValue()), ColorResources_androidKt.colorResource(color.gray4, composer1, 0), 1, null);
            AnnotatedString annotatedString1 = mentionVisualTransformation0.filter(annotatedString0).getText();
            TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getBody1(), 0L, 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141C00000L, null, null, null, 0, 0, null, 0xFDFFFB, null);
            composer1.startReplaceGroup(0xC14D8621);
            n0 n00 = composer1.rememberedValue();
            if(n00 == composer$Companion0.getEmpty()) {
                n00 = new n0(mutableState0);
                composer1.updateRememberedValue(n00);
            }
            composer1.endReplaceGroup();
            ReadMoreTextViewKt.ReadMoreTextView(modifier5, annotatedString1, textStyle0, 0, 0, 0, n00, function13, function03, composer1, v9 << 9 & 0x1C00000 | 0x180000 | v9 << 6 & 0xE000000, 56);
            if(long2 == null) {
                composer1.startReplaceGroup(0x68671280);
                SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 12.0f), composer1, 6);
            }
            else {
                composer1.startReplaceGroup(1751483604);
                CommentKt.a(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 13.0f, 0.0f, 11.0f, 5, null), ((long)long2), composer1, v4 >> 15 & 0x70 | 6, 0);
            }
            composer1.endReplaceGroup();
            MeasurePolicy measurePolicy2 = RowKt.rowMeasurePolicy(arrangement1.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
            int v12 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
            Function0 function012 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function012);
            }
            else {
                composer1.useNode();
            }
            Function2 function22 = a.a(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v12)) {
                d.a(v12, composer1, v12, function22);
            }
            Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
            CommentKt.a(s1, composer1, v4 >> 6 & 14);
            composer1.startReplaceGroup(0xD98AAB17);
            if(z3) {
                CommentKt.b(composer1, 0);
                function013 = function09;
                CommentKt.a(z4, v, function013, composer1, v9 >> 9 & 0x380 | (v9 >> 3 & 14 | v4 >> 12 & 0x70));
            }
            else {
                function013 = function09;
            }
            composer1.endReplaceGroup();
            composer1.endNode();
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function11 = function13;
            function06 = function013;
            function04 = function07;
            s3 = s4;
            function05 = function08;
            long1 = long2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            s3 = s2;
            long1 = long0;
            function04 = function00;
            function05 = function01;
            function11 = function10;
            function06 = function02;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o0(modifier1, s, s1, s3, annotatedString0, v, long1, z, z1, z2, z3, z4, function04, function05, function11, function06, function03, v1, v2, v3));
        }
    }

    public static final void a(String s, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-2097570949);
        int v1 = (v & 14) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2097570949, v1, -1, "com.kakao.tistory.presentation.view.entry.widget.WrittenTime (Comment.kt:259)");
            }
            TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), 0L, 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
            DateTimeTextKt.DateTimeText-Vc6wB30(s, DateTimeFormat.DATE_TIME_FORMAT_yyyy_M_D_HH_mm, true, null, null, 0L, 0L, textStyle0, composer1, v1 & 14 | 0x1B0, 120);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x0(s, v));
        }
    }

    public static final void a(Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x4D8F03E7);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4D8F03E7, v1, -1, "com.kakao.tistory.presentation.view.entry.widget.MenuButton (Comment.kt:217)");
            }
            IconButtonKt.IconButton(function00, SizeKt.size-3ABfNKs(Modifier.Companion, 20.0f), false, null, ComposableSingletons.CommentKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, v1 & 14 | 0x6030, 12);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s0(function00, v));
        }
    }

    public static final void a(boolean z, int v, Function0 function00, Composer composer0, int v1) {
        String s;
        Composer composer1 = composer0.startRestartGroup(0x8991A8A2);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x8991A8A2, v2, -1, "com.kakao.tistory.presentation.view.entry.widget.ReplyTextButton (Comment.kt:279)");
            }
            if(!z || v <= 0) {
                composer1.startReplaceGroup(703109895);
                s = StringResources_androidKt.stringResource(string.label_comment_reply, composer1, 0);
            }
            else {
                composer1.startReplaceGroup(321470540);
                s = StringResources_androidKt.stringResource(string.label_comment_reply_with_count, new Object[]{v}, composer1, 0x40);
            }
            composer1.endReplaceGroup();
            Role role0 = Role.box-impl(0);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, ClickableKt.clickable-XHw0xAI$default(Modifier.Companion, false, null, role0, function00, 3, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), ColorResources_androidKt.colorResource(color.color_777777, composer1, 0), 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFA, null), composer1, 0, 0xC00, 0x1DFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u0(z, v, function00, v1));
        }
    }

    public static final void access$CommentContent$lambda$9$lambda$6(MutableState mutableState0, TextLayoutResult textLayoutResult0) {
        mutableState0.setValue(textLayoutResult0);
    }

    public static final void b(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1223209432);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1223209432, v, -1, "com.kakao.tistory.presentation.view.entry.widget.SeparateDot (Comment.kt:269)");
            }
            BoxKt.Box(BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 6.5f, 0.0f, 2, null), 2.0f), ColorResources_androidKt.colorResource(color.gray3, composer1, 0), RoundedCornerShapeKt.getCircleShape()), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w0(v));
        }
    }
}

