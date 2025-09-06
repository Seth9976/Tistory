package com.kakao.tistory.presentation.view.signup;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.tooling.preview.Preview;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.view.signup.contract.SignUpUiState;
import com.kakao.tistory.presentation.view.signup.widget.SignUpTitleKt;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.common.LinkableTextKt;
import d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001B\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001A\r\u0010\u0005\u001A\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001A\u001B\u0010\u0007\u001A\u00020\u00012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0002\u0010\u000B\u001A\u001B\u0010\f\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001A\u0015\u0010\r\u001A\u00020\u00012\u0006\u0010\u000E\u001A\u00020\u000FH\u0007¢\u0006\u0002\u0010\u0010\u001A\r\u0010\u0011\u001A\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0012"}, d2 = {"DescriptionNoticeText", "", "onclick", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DescriptionText", "(Landroidx/compose/runtime/Composer;I)V", "DuplicatedEmailListContainer", "duplicatedEmailList", "", "", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "PreviousButton", "SignUpUsedEmailScreen", "uiState", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpUiState;", "(Lcom/kakao/tistory/presentation/view/signup/contract/SignUpUiState;Landroidx/compose/runtime/Composer;I)V", "SignUpUsedEmailScreenPreview", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSignUpUsedEmailScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpUsedEmailScreen.kt\ncom/kakao/tistory/presentation/view/signup/SignUpUsedEmailScreenKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,145:1\n148#2:146\n148#2:183\n148#2:184\n158#2:185\n148#2:186\n148#2:192\n148#2:194\n148#2:195\n148#2:202\n148#2:203\n148#2:204\n85#3:147\n82#3,6:148\n88#3:182\n92#3:190\n78#4,6:154\n85#4,4:169\n89#4,2:179\n93#4:189\n78#4,6:211\n85#4,4:226\n89#4,2:236\n93#4:242\n368#5,9:160\n377#5:181\n378#5,2:187\n368#5,9:217\n377#5:238\n378#5,2:240\n4032#6,6:173\n4032#6,6:230\n1855#7:191\n1856#7:193\n1223#8,6:196\n71#9:205\n69#9,5:206\n74#9:239\n78#9:243\n*S KotlinDebug\n*F\n+ 1 SignUpUsedEmailScreen.kt\ncom/kakao/tistory/presentation/view/signup/SignUpUsedEmailScreenKt\n*L\n48#1:146\n52#1:183\n54#1:184\n62#1:185\n63#1:186\n90#1:192\n104#1:194\n114#1:195\n130#1:202\n132#1:203\n133#1:204\n46#1:147\n46#1:148,6\n46#1:182\n46#1:190\n46#1:154,6\n46#1:169,4\n46#1:179,2\n46#1:189\n128#1:211,6\n128#1:226,4\n128#1:236,2\n128#1:242\n46#1:160,9\n46#1:181\n46#1:187,2\n128#1:217,9\n128#1:238\n128#1:240,2\n46#1:173,6\n128#1:230,6\n88#1:191\n88#1:193\n122#1:196,6\n128#1:205\n128#1:206,5\n128#1:239\n128#1:243\n*E\n"})
public final class SignUpUsedEmailScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DescriptionNoticeText(@NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "onclick");
        Composer composer1 = composer0.startRestartGroup(0x5F558FF);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5F558FF, v1, -1, "com.kakao.tistory.presentation.view.signup.DescriptionNoticeText (SignUpUsedEmailScreen.kt:111)");
            }
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 20.0f, 8.0f, 20.0f, 0.0f, 8, null);
            TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), 0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null);
            boolean z = false;
            String s = StringResources_androidKt.stringResource(string.label_sign_up_used_email_description2, composer1, 0);
            String s1 = StringResources_androidKt.stringResource(string.label_sign_up_used_email_desc_link, composer1, 0);
            long v2 = ColorResources_androidKt.colorResource(color.gray5, composer1, 0);
            FontWeight fontWeight0 = FontWeight.Companion.getBold();
            composer1.startReplaceGroup(0xAA636D93);
            if((v1 & 14) == 4) {
                z = true;
            }
            k0 k00 = composer1.rememberedValue();
            if(z || k00 == Composer.Companion.getEmpty()) {
                k00 = new k0(function00);
                composer1.updateRememberedValue(k00);
            }
            composer1.endReplaceGroup();
            LinkableTextKt.LinkableText-WxCAl_A(modifier0, textStyle0, false, 0, 0, s, s1, v2, fontWeight0, k00, composer1, 0x6000006, 28);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l0(function00, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DescriptionText(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-604406903);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-604406903, v, -1, "com.kakao.tistory.presentation.view.signup.DescriptionText (SignUpUsedEmailScreen.kt:101)");
            }
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 20.0f, 8.0f, 20.0f, 0.0f, 8, null);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_sign_up_used_email_description1, composer1, 0), modifier0, 0L, 0L, null, null, null, 0L, null, null, 0x141A40000L, 0, false, false, 0, 0, null, TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), composer1, 0x30, 6, 0x1FBFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m0(v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DuplicatedEmailListContainer(@NotNull List list0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(list0, "duplicatedEmailList");
        Composer composer1 = composer0.startRestartGroup(1928063540);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1928063540, v, -1, "com.kakao.tistory.presentation.view.signup.DuplicatedEmailListContainer (SignUpUsedEmailScreen.kt:85)");
        }
        composer1.startReplaceGroup(1120376173);
        for(Object object0: list0) {
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(((String)object0), PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 20.0f, 0.0f, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH1(), ColorResources_androidKt.colorResource(color.point1, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), composer1, 0x30, 0xC00, 0x1DFFC);
        }
        composer1.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new n0(list0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void PreviousButton(@NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "onclick");
        Composer composer1 = composer0.startRestartGroup(0x6CD066E3);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6CD066E3, v1, -1, "com.kakao.tistory.presentation.view.signup.PreviousButton (SignUpUsedEmailScreen.kt:126)");
            }
            Modifier modifier0 = ModifierKt.noRippleClickable(BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.padding-VpY3zN4$default(Modifier.Companion, 20.0f, 0.0f, 2, null), 0.0f, 1, null), 44.0f), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(6.0f)), ColorResources_androidKt.colorResource(color.gray1, composer1, 0), null, 2, null), function00);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_guide_back, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH5(), ColorResources_androidKt.colorResource(color.white, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), composer1, 0, 0, 0x1FFFE);
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
            scopeUpdateScope0.updateScope(new o0(function00, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SignUpUsedEmailScreen(@NotNull SignUpUiState signUpUiState0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(signUpUiState0, "uiState");
        Composer composer1 = composer0.startRestartGroup(0x8AB4427E);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8AB4427E, v, -1, "com.kakao.tistory.presentation.view.signup.SignUpUsedEmailScreen (SignUpUsedEmailScreen.kt:44)");
        }
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 0.0f, 20.0f, 7, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer1, 0, 1), false, null, false, 14, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
        SignUpTitleKt.SignUpTitle(PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 20.0f, 0.0f, 2, null), string.label_sign_up_used_email_title, composer1, 6, 0);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 16.0f), composer1, 6);
        List list0 = signUpUiState0.getDuplicatedEmails();
        composer1.startReplaceGroup(0xCF686DD3);
        if(list0 != null) {
            SignUpUsedEmailScreenKt.DuplicatedEmailListContainer(list0, composer1, 8);
        }
        composer1.endReplaceGroup();
        long v2 = ColorResources_androidKt.colorResource(color.gray3, composer1, 0);
        DividerKt.Divider-oMI9zvI(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 9.0f, 0.0f, 0.0f, 13, null), v2, 0.5f, 0.0f, composer1, 390, 8);
        SignUpUsedEmailScreenKt.DescriptionText(composer1, 0);
        SignUpUsedEmailScreenKt.DescriptionNoticeText(signUpUiState0.getOnClickNotice(), composer1, 0);
        SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance0, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        SignUpUsedEmailScreenKt.PreviousButton(signUpUiState0.getOnClickConfirm(), composer1, 0);
        composer1.endNode();
        p0 p00 = new p0(null);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, p00, composer1, 70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q0(signUpUiState0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview
    public static final void SignUpUsedEmailScreenPreview(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x54C99A41);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x54C99A41, v, -1, "com.kakao.tistory.presentation.view.signup.SignUpUsedEmailScreenPreview (SignUpUsedEmailScreen.kt:37)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.SignUpUsedEmailScreenKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r0(v));
        }
    }
}

