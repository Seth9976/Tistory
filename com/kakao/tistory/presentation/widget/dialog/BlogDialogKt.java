package com.kakao.tistory.presentation.widget.dialog;

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
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.StringUtils;
import com.kakao.tistory.presentation.design.ui.thumbnail.BlogThumbnailKt;
import com.kakao.tistory.presentation.design.ui.thumbnail.ThumbnailUiStateKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A1\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001A?\u0010\b\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000B"}, d2 = {"DefaultBlogConfirmView", "", "blog", "Lcom/kakao/tistory/domain/entity/Blog;", "onClickCancel", "Lkotlin/Function0;", "onClickOk", "(Lcom/kakao/tistory/domain/entity/Blog;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DefaultBlogDialog", "onDismiss", "(Lcom/kakao/tistory/domain/entity/Blog;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogDialog.kt\ncom/kakao/tistory/presentation/widget/dialog/BlogDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 11 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,139:1\n1223#2,6:140\n1223#2,6:278\n1223#2,6:287\n1#3:146\n148#4:147\n158#4:148\n148#4:149\n148#4:223\n148#4,11:224\n148#4:238\n158#4:239\n148#4:240\n148#4:277\n158#4:284\n148#4:285\n148#4:286\n71#5:150\n68#5,6:151\n74#5:185\n78#5:304\n78#6,6:157\n85#6,4:172\n89#6,2:182\n78#6,6:194\n85#6,4:209\n89#6,2:219\n78#6,6:248\n85#6,4:263\n89#6,2:273\n93#6:295\n93#6:299\n93#6:303\n368#7,9:163\n377#7:184\n368#7,9:200\n377#7:221\n368#7,9:254\n377#7:275\n378#7,2:293\n378#7,2:297\n378#7,2:301\n4032#8,6:176\n4032#8,6:213\n4032#8,6:267\n85#9:186\n81#9,7:187\n88#9:222\n92#9:300\n1240#10:235\n95#11,2:236\n98#12:241\n95#12,6:242\n101#12:276\n105#12:296\n*S KotlinDebug\n*F\n+ 1 BlogDialog.kt\ncom/kakao/tistory/presentation/widget/dialog/BlogDialogKt\n*L\n38#1:140,6\n103#1:278,6\n125#1:287,6\n59#1:147\n60#1:148\n61#1:149\n67#1:223\n69#1:224,11\n89#1:238\n90#1:239\n96#1:240\n102#1:277\n117#1:284\n117#1:285\n124#1:286\n57#1:150\n57#1:151,6\n57#1:185\n57#1:304\n57#1:157,6\n57#1:172,4\n57#1:182,2\n64#1:194,6\n64#1:209,4\n64#1:219,2\n94#1:248,6\n94#1:263,4\n94#1:273,2\n94#1:295\n64#1:299\n57#1:303\n57#1:163,9\n57#1:184\n64#1:200,9\n64#1:221\n94#1:254,9\n94#1:275\n94#1:293,2\n64#1:297,2\n57#1:301,2\n57#1:176,6\n64#1:213,6\n94#1:267,6\n64#1:186\n64#1:187,7\n64#1:222\n64#1:300\n72#1:235\n82#1:236,2\n94#1:241\n94#1:242,6\n94#1:276\n94#1:296\n*E\n"})
public final class BlogDialogKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DefaultBlogConfirmView(@NotNull Blog blog0, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable Composer composer0, int v) {
        String s1;
        Intrinsics.checkNotNullParameter(blog0, "blog");
        Intrinsics.checkNotNullParameter(function00, "onClickCancel");
        Intrinsics.checkNotNullParameter(function01, "onClickOk");
        Composer composer1 = composer0.startRestartGroup(0xDB8892F2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDB8892F2, v, -1, "com.kakao.tistory.presentation.widget.dialog.DefaultBlogConfirmView (BlogDialog.kt:51)");
        }
        String s = blog0.getTitle();
        if(s == null || p.isBlank(s)) {
            s = null;
        }
        if(s == null) {
            s1 = "";
        }
        else {
            s1 = StringUtils.INSTANCE.getEllipsisText(s, 10);
            if(s1 == null) {
                s1 = "";
            }
        }
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.defaultMinSize-VpY3zN4$default(SizeKt.width-3ABfNKs(modifier$Companion0, 280.0f), 0.0f, 136.5f, 1, null), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(12.0f)), ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        Arrangement arrangement0 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getCenterHorizontally(), composer1, 0x30);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function21);
        }
        Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
        String s2 = blog0.getLogoImageUrl();
        BlogThumbnailKt.BlogThumbnail-EUb7tLY((s2 == null ? null : ThumbnailUiStateKt.toBlogThumbnailItem(s2)), 56.0f, PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 35.0f, 0.0f, 5.5f, 5, null), false, null, composer1, 0x1B0, 24);
        composer1.startReplaceGroup(189060680);
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        String s3 = StringResources_androidKt.stringResource(string.label_dialog_setting_default_blog, new Object[]{s1}, composer1, 0x40);
        annotatedString$Builder0.append(s3);
        androidx.compose.ui.text.font.FontWeight.Companion fontWeight$Companion0 = FontWeight.Companion;
        annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, fontWeight$Companion0.getLight(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null), s1.length() + 1, s3.length());
        AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
        composer1.endReplaceGroup();
        TextUnitKt.checkArithmetic--R2X_6o(5345221018L);
        TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH2();
        ExcludeFontPaddingTextKt.Text-edWjEy0(annotatedString0, null, 0L, 0L, null, null, null, 7492704666L, null, TextAlign.box-impl(3), 0x141C00000L, 0, false, false, 0, 0, null, null, textStyle0, composer1, 0, 6, 0x3F97E);
        DividerKt.Divider-oMI9zvI(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 20.0f, 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(color.gray3, composer1, 0), 0.5f, 0.0f, composer1, 390, 8);
        Modifier modifier3 = SizeKt.height-3ABfNKs(modifier$Companion0, 52.0f);
        MeasurePolicy measurePolicy2 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
            d.a(v3, composer1, v3, function22);
        }
        Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
        RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
        Modifier modifier5 = PaddingKt.padding-qDBjuR0$default(RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), 0.0f, 0.0f, 0.0f, 3.0f, 7, null);
        composer1.startReplaceGroup(2048435920);
        boolean z = (v & 0x70 ^ 0x30) > 0x20 && composer1.changed(function00) || (v & 0x30) == 0x20;
        com.kakao.tistory.presentation.widget.dialog.a a0 = composer1.rememberedValue();
        if(z || a0 == Composer.Companion.getEmpty()) {
            a0 = new com.kakao.tistory.presentation.widget.dialog.a(function00);
            composer1.updateRememberedValue(a0);
        }
        composer1.endReplaceGroup();
        Modifier modifier6 = ClickableKt.clickable-XHw0xAI$default(modifier5, false, null, null, a0, 7, null);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_dialog_cancel, composer1, 0), modifier6, ColorResources_androidKt.colorResource(color.gray1, composer1, 0), 0x141700000L, null, fontWeight$Companion0.getLight(), TypeKt.getTFont(), 0L, null, TextAlign.box-impl(3), 0L, 0, false, false, 0, 0, null, null, composer1, 0x1B0C00, 0xC00, 0x3DD90);
        SpacerKt.Spacer(BackgroundKt.background-bw27NRU$default(SizeKt.size-VpY3zN4(modifier$Companion0, 0.5f, 52.0f), ColorResources_androidKt.colorResource(color.gray3, composer1, 0), null, 2, null), composer1, 0);
        Modifier modifier7 = PaddingKt.padding-qDBjuR0$default(RowScope.weight$default(rowScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), 0.0f, 0.0f, 0.0f, 2.0f, 7, null);
        composer1.startReplaceGroup(0x7A190FAC);
        boolean z1 = (v & 0x380 ^ 0x180) > 0x100 && composer1.changed(function01) || (v & 0x180) == 0x100;
        b b0 = composer1.rememberedValue();
        if(z1 || b0 == Composer.Companion.getEmpty()) {
            b0 = new b(function01);
            composer1.updateRememberedValue(b0);
        }
        composer1.endReplaceGroup();
        Modifier modifier8 = ClickableKt.clickable-XHw0xAI$default(modifier7, false, null, null, b0, 7, null);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_dialog_change, composer1, 0), modifier8, ColorResources_androidKt.colorResource(color.point1, composer1, 0), 0x141700000L, null, fontWeight$Companion0.getSemiBold(), TypeKt.getTFont(), 0L, null, TextAlign.box-impl(3), 0L, 0, false, false, 0, 0, null, null, composer1, 0x1B0C00, 0xC00, 0x3DD90);
        composer1.endNode();
        composer1.endNode();
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(blog0, function00, function01, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DefaultBlogDialog(@NotNull Blog blog0, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(blog0, "blog");
        Intrinsics.checkNotNullParameter(function00, "onDismiss");
        Intrinsics.checkNotNullParameter(function01, "onClickCancel");
        Intrinsics.checkNotNullParameter(function02, "onClickOk");
        Composer composer1 = composer0.startRestartGroup(1757706867);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1757706867, v, -1, "com.kakao.tistory.presentation.widget.dialog.DefaultBlogDialog (BlogDialog.kt:36)");
        }
        composer1.startReplaceGroup(0x6CB07390);
        boolean z = (v & 0x70 ^ 0x30) > 0x20 && composer1.changed(function00) || (v & 0x30) == 0x20;
        com.kakao.tistory.presentation.widget.dialog.d d0 = composer1.rememberedValue();
        if(z || d0 == Composer.Companion.getEmpty()) {
            d0 = new com.kakao.tistory.presentation.widget.dialog.d(function00);
            composer1.updateRememberedValue(d0);
        }
        composer1.endReplaceGroup();
        AndroidDialog_androidKt.Dialog(d0, null, ComposableLambdaKt.rememberComposableLambda(0xD2CCED8A, true, new h(blog0, function01, function00, function02), composer1, 54), composer1, 0x180, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(blog0, function00, function01, function02, v));
        }
    }
}

