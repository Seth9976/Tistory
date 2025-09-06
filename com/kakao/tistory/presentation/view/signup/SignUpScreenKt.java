package com.kakao.tistory.presentation.view.signup;

import a;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.kakao.tistory.domain.entity.common.RecommendedBlogNameInfo;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.view.signup.contract.SignUpUiState;
import com.kakao.tistory.presentation.view.signup.contract.SignUpVerificationState;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import com.kakao.tistory.presentation.widget.common.CommonTextFieldKt;
import d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/contract/SignUpUiState;", "uiState", "", "SignUpScreen", "(Lcom/kakao/tistory/presentation/view/signup/contract/SignUpUiState;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSignUpScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpScreen.kt\ncom/kakao/tistory/presentation/view/signup/SignUpScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 9 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 10 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,508:1\n77#2:509\n77#2:751\n77#2:887\n148#3:510\n148#3:547\n148#3:548\n148#3:549\n148#3:550\n148#3:551\n148#3:578\n148#3:615\n148#3:652\n148#3:726\n148#3:746\n158#3:752\n148#3:753\n148#3:754\n148#3:787\n148#3:832\n148#3:833\n158#3:842\n158#3:843\n148#3:884\n148#3:885\n148#3:886\n148#3:888\n85#4:511\n82#4,6:512\n88#4:546\n92#4:555\n85#4:579\n82#4,6:580\n88#4:614\n92#4:750\n85#4:788\n82#4,6:789\n88#4:823\n92#4:837\n78#5,6:518\n85#5,4:533\n89#5,2:543\n93#5:554\n78#5,6:586\n85#5,4:601\n89#5,2:611\n78#5,6:623\n85#5,4:638\n89#5,2:648\n78#5,6:660\n85#5,4:675\n89#5,2:685\n78#5,6:697\n85#5,4:712\n89#5,2:722\n93#5:729\n93#5:733\n93#5:737\n93#5:749\n78#5,6:758\n85#5,4:773\n89#5,2:783\n78#5,6:795\n85#5,4:810\n89#5,2:820\n93#5:836\n93#5:840\n78#5,6:851\n85#5,4:866\n89#5,2:876\n93#5:882\n368#6,9:524\n377#6:545\n378#6,2:552\n368#6,9:592\n377#6:613\n368#6,9:629\n377#6:650\n368#6,9:666\n377#6:687\n368#6,9:703\n377#6:724\n378#6,2:727\n378#6,2:731\n378#6,2:735\n378#6,2:747\n368#6,9:764\n377#6:785\n368#6,9:801\n377#6:822\n378#6,2:834\n378#6,2:838\n368#6,9:857\n377#6:878\n378#6,2:880\n4032#7,6:537\n4032#7,6:605\n4032#7,6:642\n4032#7,6:679\n4032#7,6:716\n4032#7,6:777\n4032#7,6:814\n4032#7,6:870\n1240#8:556\n1039#8,6:557\n1240#8:563\n1039#8,6:564\n1240#8:739\n1039#8,6:740\n1240#8:824\n1039#8,6:825\n95#9,2:570\n1223#10,6:572\n98#11:616\n95#11,6:617\n101#11:651\n98#11:689\n94#11,7:690\n101#11:725\n105#11:730\n105#11:738\n98#11,3:755\n101#11:786\n105#11:841\n71#12:653\n68#12,6:654\n74#12:688\n78#12:734\n71#12:844\n68#12,6:845\n74#12:879\n78#12:883\n1#13:831\n*S KotlinDebug\n*F\n+ 1 SignUpScreen.kt\ncom/kakao/tistory/presentation/view/signup/SignUpScreenKt\n*L\n56#1:509\n311#1:751\n450#1:887\n60#1:510\n70#1:547\n73#1:548\n79#1:549\n87#1:550\n93#1:551\n233#1:578\n235#1:615\n248#1:652\n256#1:726\n289#1:746\n318#1:752\n318#1:753\n319#1:754\n325#1:787\n364#1:832\n388#1:833\n411#1:842\n414#1:843\n427#1:884\n429#1:885\n435#1:886\n462#1:888\n58#1:511\n58#1:512,6\n58#1:546\n58#1:555\n229#1:579\n229#1:580,6\n229#1:614\n229#1:750\n323#1:788\n323#1:789,6\n323#1:823\n323#1:837\n58#1:518,6\n58#1:533,4\n58#1:543,2\n58#1:554\n229#1:586,6\n229#1:601,4\n229#1:611,2\n235#1:623,6\n235#1:638,4\n235#1:648,2\n243#1:660,6\n243#1:675,4\n243#1:685,2\n250#1:697,6\n250#1:712,4\n250#1:722,2\n250#1:729\n243#1:733\n235#1:737\n229#1:749\n315#1:758,6\n315#1:773,4\n315#1:783,2\n323#1:795,6\n323#1:810,4\n323#1:820,2\n323#1:836\n315#1:840\n409#1:851,6\n409#1:866,4\n409#1:876,2\n409#1:882\n58#1:524,9\n58#1:545\n58#1:552,2\n229#1:592,9\n229#1:613\n235#1:629,9\n235#1:650\n243#1:666,9\n243#1:687\n250#1:703,9\n250#1:724\n250#1:727,2\n243#1:731,2\n235#1:735,2\n229#1:747,2\n315#1:764,9\n315#1:785\n323#1:801,9\n323#1:822\n323#1:834,2\n315#1:838,2\n409#1:857,9\n409#1:878\n409#1:880,2\n58#1:537,6\n229#1:605,6\n235#1:642,6\n243#1:679,6\n250#1:716,6\n315#1:777,6\n323#1:814,6\n409#1:870,6\n125#1:556\n127#1:557,6\n148#1:563\n149#1:564,6\n268#1:739\n270#1:740,6\n328#1:824\n333#1:825,6\n177#1:570,2\n182#1:572,6\n235#1:616\n235#1:617,6\n235#1:651\n250#1:689\n250#1:690,7\n250#1:725\n250#1:730\n235#1:738\n315#1:755,3\n315#1:786\n315#1:841\n243#1:653\n243#1:654,6\n243#1:688\n243#1:734\n409#1:844\n409#1:845,6\n409#1:879\n409#1:883\n*E\n"})
public final class SignUpScreenKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SignUpScreen(@NotNull SignUpUiState signUpUiState0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(signUpUiState0, "uiState");
        Composer composer1 = composer0.startRestartGroup(-932476084);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-932476084, v, -1, "com.kakao.tistory.presentation.view.signup.SignUpScreen (SignUpScreen.kt:54)");
        }
        FocusManager focusManager0 = (FocusManager)composer1.consume(CompositionLocalsKt.getLocalFocusManager());
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 20.0f, 0.0f, 20.0f, 20.0f, 2, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer1, 0, 1), false, null, false, 14, null);
        Unit unit0 = Unit.INSTANCE;
        Modifier modifier1 = SuspendingPointerInputFilterKt.pointerInput(modifier0, unit0, new g0(focusManager0, null));
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
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
        SignUpScreenKt.a(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 17.0f, 0.0f, 0.0f, 13, null), composer1, 6, 0);
        SignUpScreenKt.a(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 22.0f, 0.0f, 0.0f, 13, null), signUpUiState0.getKakaoEmail(), composer1, 6, 0);
        SignUpScreenKt.b(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 16.0f, 0.0f, 0.0f, 13, null), signUpUiState0, composer1, 70, 0);
        composer1.startReplaceGroup(1021011235);
        if(signUpUiState0.getShowBlogNameRecommendation()) {
            SignUpScreenKt.a(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 14.0f, 0.0f, 0.0f, 13, null), signUpUiState0.getRecommendedBlogNameList(), signUpUiState0.getOnClickRecommendedBlogName(), signUpUiState0.getOnClickRefreshRecommendation(), composer1, 70, 0);
        }
        composer1.endReplaceGroup();
        SignUpScreenKt.a(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, (signUpUiState0.getShowBlogNameRecommendation() ? 24.0f : 30.0f), 0.0f, 12.0f, 5, null), signUpUiState0, composer1, 0x40, 0);
        SignUpScreenKt.a(string.label_sign_up_confirm, signUpUiState0.getBlogName().getInputState() == SignUpVerificationState.VERIFIED, signUpUiState0.getOnClickConfirm(), composer1, 0);
        SignUpScreenKt.a(composer1, 0);
        composer1.endNode();
        EffectsKt.LaunchedEffect(unit0, new h0(null), composer1, 70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i0(signUpUiState0, v));
        }
    }

    public static final void a(int v, boolean z, Function0 function00, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x6CE98F49);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6CE98F49, v2, -1, "com.kakao.tistory.presentation.view.signup.SignUpCommonButton (SignUpScreen.kt:423)");
            }
            ButtonKt.TextButton(function00, SizeKt.fillMaxSize$default(SizeKt.height-3ABfNKs(Modifier.Companion, 43.0f), 0.0f, 1, null), z, null, null, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(3.0f), null, ButtonDefaults.INSTANCE.textButtonColors-RGew2ao(ColorResources_androidKt.colorResource((z ? color.gray1 : color.color_bbbbbb), composer1, 0), ColorResources_androidKt.colorResource(color.white, composer1, 0), ColorResources_androidKt.colorResource(color.white, composer1, 0), composer1, ButtonDefaults.$stable << 9, 0), PaddingKt.PaddingValues-0680j_4(0.0f), ComposableLambdaKt.rememberComposableLambda(0x2CDD2886, true, new d0(v), composer1, 54), composer1, v2 >> 6 & 14 | 0x36000030 | v2 << 3 & 0x380, 88);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e0(v, z, function00, v1));
        }
    }

    public static final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xAEA20142);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAEA20142, v, -1, "com.kakao.tistory.presentation.view.signup.AlreadySignUpText (SignUpScreen.kt:448)");
            }
            Context context0 = (Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            String s = StringResources_androidKt.stringResource(string.web_link_already_signup_account, composer1, 0);
            String s1 = StringResources_androidKt.stringResource(string.label_sign_up_already_with_other_email, composer1, 0);
            TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), 0L, 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, 3, 0, 0L, null, null, null, 0, 0, null, 0xFF6FFA, null);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s1, ClickableKt.clickable-XHw0xAI$default(PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 31.0f, 0.0f, 0.0f, 13, null), false, null, null, new q(s, context0), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, 0, 0, 0x1FFFC);
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

    public static final void a(Modifier modifier0, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x5E8448F);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            modifier1 = modifier0;
        }
        else if((v & 14) == 0) {
            modifier1 = modifier0;
            v2 = (composer1.changed(modifier1) ? 4 : 2) | v;
        }
        else {
            modifier1 = modifier0;
            v2 = v;
        }
        if((v2 & 11) != 2 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5E8448F, v2, -1, "com.kakao.tistory.presentation.view.signup.WelcomeMessage (SignUpScreen.kt:115)");
            }
            TextStyle textStyle0 = new TextStyle(0L, 0x142000000L, FontWeight.Companion.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x142200000L, null, null, null, 0, 0, null, 0xFDFFD8, null);
            composer1.startReplaceGroup(0xCF00BF33);
            Builder annotatedString$Builder0 = new Builder(0, 1, null);
            String s = StringResources_androidKt.stringResource(string.label_sign_up_title, composer1, 0);
            int v3 = annotatedString$Builder0.pushStyle(textStyle0.toSpanStyle());
            try {
                annotatedString$Builder0.append(s);
            }
            finally {
                annotatedString$Builder0.pop(v3);
            }
            annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null), 0, 4);
            AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
            composer1.endReplaceGroup();
            ExcludeFontPaddingTextKt.Text-edWjEy0(annotatedString0, modifier2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, null, null, composer1, v2 << 3 & 0x70, 0, 0x7FFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new j0(modifier1, v, v1));
        }
    }

    public static final void a(Modifier modifier0, SignUpUiState signUpUiState0, Composer composer0, int v, int v1) {
        Modifier modifier4;
        Composer composer1 = composer0.startRestartGroup(0xABAA2A03);
        Modifier modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xABAA2A03, v, -1, "com.kakao.tistory.presentation.view.signup.AgreementForm (SignUpScreen.kt:308)");
        }
        boolean z = signUpUiState0.isAgreedTalkChannel();
        Object object0 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        String s = StringResources_androidKt.stringResource(string.link_story_talk_channel, composer1, 0);
        Modifier modifier2 = PaddingKt.padding-VpY3zN4(BorderKt.border-xT4_qwU(ModifierKt.noRippleClickable(modifier1, signUpUiState0.getOnClickAgreeTalkChannel()), 0.5f, ColorResources_androidKt.colorResource(color.color_f5f5f5, composer1, 0), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(3.0f)), 16.0f, 12.0f);
        Arrangement arrangement0 = Arrangement.INSTANCE;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement0.getSpaceBetween(), alignment$Companion0.getCenterVertically(), composer1, 54);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            modifier4 = modifier1;
            d.a(v2, composer1, v2, function20);
        }
        else {
            modifier4 = modifier1;
            if(!Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
        }
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier5 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 16.0f, 0.0f, 11, null);
        Modifier modifier6 = RowScope.weight$default(RowScopeInstance.INSTANCE, modifier5, 1.0f, false, 2, null);
        MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
            d.a(v3, composer1, v3, function21);
        }
        Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
        ColumnScopeInstance columnScopeInstance0 = ColumnScopeInstance.INSTANCE;
        composer1.startReplaceGroup(0xD87CAD3E);
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        String s1 = StringResources_androidKt.stringResource(string.label_sign_up_talk_ad_agree, composer1, 0);
        String s2 = StringResources_androidKt.stringResource(string.label_sign_up_talk_ad_agree_select, composer1, 0);
        String s3 = StringResources_androidKt.stringResource(string.label_sign_up_talk_ad_agree_story, composer1, 0);
        MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
        int v4 = MaterialTheme.$stable;
        TextStyle textStyle0 = TypeKt.getH8(materialTheme0.getTypography(composer1, v4));
        androidx.compose.ui.text.font.FontWeight.Companion fontWeight$Companion0 = FontWeight.Companion;
        int v5 = annotatedString$Builder0.pushStyle(TextStyle.copy-p1EtxEg$default(textStyle0, 0L, 0L, fontWeight$Companion0.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null).toSpanStyle());
        try {
            annotatedString$Builder0.append(s1);
        }
        finally {
            annotatedString$Builder0.pop(v5);
        }
        int v7 = StringsKt__StringsKt.indexOf$default(s1, s2, 0, false, 6, null);
        Integer integer0 = v7 >= 0 && !p.isBlank(s2) ? v7 : null;
        if(integer0 != null) {
            int v8 = integer0.intValue();
            annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, fontWeight$Companion0.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null), v8, s2.length() + v8);
        }
        int v9 = StringsKt__StringsKt.indexOf$default(s1, s3, 0, false, 6, null);
        Integer integer1 = v9 >= 0 && !p.isBlank(s3) ? v9 : null;
        if(integer1 != null) {
            int v10 = integer1.intValue();
            int v11 = s3.length() + v10;
            annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, null, 0xEFFF, null), v10, v11);
            annotatedString$Builder0.addStringAnnotation("talkChannelTag", s3, v10, v11);
        }
        AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
        composer1.endReplaceGroup();
        ClickableTextKt.ClickableText-4YKlhWE(annotatedString0, PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 0.0f, 1.0f, 7, null), null, false, 0, 0, null, new o(annotatedString0, columnScopeInstance0, s, ((Context)object0), signUpUiState0), composer1, 0x30, 0x7C);
        Modifier modifier8 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_sign_up_talk_ad_agree_description, composer1, 0), modifier8, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(materialTheme0.getTypography(composer1, v4)), ColorResources_androidKt.colorResource(color.gray9, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), composer1, 0x30, 0xC00, 0x1DFFC);
        composer1.endNode();
        ImageKt.Image(PainterResources_androidKt.painterResource((z ? drawable.ic_sign_up_agreement_on : drawable.ic_sign_up_agreement_off), composer1, 0), null, null, null, null, 0.0f, null, composer1, 56, 0x7C);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new com.kakao.tistory.presentation.view.signup.p(modifier4, signUpUiState0, v, v1));
        }
    }

    public static final void a(Modifier modifier0, String s, Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(1405802113);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            modifier1 = modifier0;
        }
        else if((v & 14) == 0) {
            modifier1 = modifier0;
            v2 = (composer1.changed(modifier1) ? 4 : 2) | v;
        }
        else {
            modifier1 = modifier0;
            v2 = v;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1405802113, v2, -1, "com.kakao.tistory.presentation.view.signup.BlogAddressNotice (SignUpScreen.kt:144)");
            }
            String s1 = StringResources_androidKt.stringResource(string.label_sign_up_address_notice, new Object[]{s}, composer1, 0x40);
            composer1.startReplaceGroup(0x392E7E78);
            Builder annotatedString$Builder0 = new Builder(0, 1, null);
            int v3 = annotatedString$Builder0.pushStyle(TextStyle.copy-p1EtxEg$default(TypeKt.getH8(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), 0L, 0L, FontWeight.Companion.getLight(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFB, null).toSpanStyle());
            try {
                annotatedString$Builder0.append(s1);
            }
            finally {
                annotatedString$Builder0.pop(v3);
            }
            annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null), 0, s.length());
            AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
            composer1.endReplaceGroup();
            ExcludeFontPaddingTextKt.Text-edWjEy0(annotatedString0, modifier2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, null, new TextStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141B80000L, null, null, null, 0, 0, null, 0xFDFFFF, null), composer1, v2 << 3 & 0x70, 0x6000000, 0x3FFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w(modifier1, s, v, v1));
        }
    }

    public static final void a(Modifier modifier0, List list0, Function1 function10, Function0 function00, Composer composer0, int v, int v1) {
        Function1 function12;
        Composer composer1 = composer0.startRestartGroup(0xD949FF7D);
        Modifier modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
        Function1 function11 = (v1 & 4) == 0 ? function10 : z.a;
        Function0 function01 = (v1 & 8) == 0 ? function00 : a0.a;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD949FF7D, v, -1, "com.kakao.tistory.presentation.view.signup.RecommendedBlogName (SignUpScreen.kt:227)");
        }
        Modifier modifier2 = PaddingKt.padding-VpY3zN4(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxWidth$default(modifier1, 0.0f, 1, null), ColorResources_androidKt.colorResource(color.color_f5f5f5, composer1, 0), null, 2, null), 16.0f, 10.0f);
        Arrangement arrangement0 = Arrangement.INSTANCE;
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(arrangement0.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
            d.a(v2, composer1, v2, function20);
        }
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier4 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 4.0f, 0.0f, 14.0f, 5, null);
        MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getTop(), composer1, 0);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
            d.a(v3, composer1, v3, function21);
        }
        Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
        String s = StringResources_androidKt.stringResource(string.label_sign_up_recommended_address, composer1, 0);
        TextStyle textStyle0 = TypeKt.getH8(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable));
        Modifier modifier6 = RowScope.weight$default(RowScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null);
        int v4 = MaterialTheme.$stable;
        MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, modifier6, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, 0, 0, 0x1FFFC);
        Modifier modifier7 = PaddingKt.padding-VpY3zN4(ModifierKt.noRippleClickable(BackgroundKt.background-bw27NRU$default(ClipKt.clip(modifier$Companion0, RoundedCornerShapeKt.RoundedCornerShape(50)), 0xFFFFFFFF00000000L, null, 2, null), function01), 8.0f, 4.0f);
        MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier8 = ComposedModifierKt.materializeModifier(composer1, modifier7);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
            d.a(v5, composer1, v5, function22);
        }
        Updater.set-impl(composer1, modifier8, composeUiNode$Companion0.getSetModifier());
        MeasurePolicy measurePolicy3 = RowKt.rowMeasurePolicy(arrangement0.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
        int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap3 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier9 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
        Function2 function23 = a.a(composeUiNode$Companion0, composer1, measurePolicy3, composer1, compositionLocalMap3);
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
            d.a(v6, composer1, v6, function23);
        }
        Updater.set-impl(composer1, modifier9, composeUiNode$Companion0.getSetModifier());
        String s1 = StringResources_androidKt.stringResource(string.label_sign_up_refresh_recommendation, composer1, 0);
        TextStyle textStyle1 = TextStyle.copy-p1EtxEg$default(materialTheme0.getTypography(composer1, v4).getBody1(), 0xFF55555500000000L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(s1, PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 4.0f, 0.0f, 11, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, textStyle1, composer1, 0x30, 0, 0x1FFFC);
        ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_address_refresh, composer1, 0), null, null, null, null, 0.0f, null, composer1, 56, 0x7C);
        composer1.endNode();
        composer1.endNode();
        composer1.endNode();
        if(list0.isEmpty()) {
            composer1.startReplaceGroup(0x429DFBBF);
            composer1.startReplaceGroup(0x7E051B9C);
            Builder annotatedString$Builder0 = new Builder(0, 1, null);
            String s2 = StringResources_androidKt.stringResource(string.label_sign_up_recommended_address_is_empty, composer1, 0);
            int v7 = annotatedString$Builder0.pushStyle(TextStyle.copy-p1EtxEg$default(materialTheme0.getTypography(composer1, v4).getBody1(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141E00000L, null, null, null, 0, 0, null, 0xFDFFFF, null).toSpanStyle());
            try {
                annotatedString$Builder0.append(s2);
            }
            finally {
                annotatedString$Builder0.pop(v7);
            }
            String s3 = StringResources_androidKt.stringResource(string.label_sign_up_refresh_recommendation, composer1, 0);
            int v9 = StringsKt__StringsKt.indexOf$default(s2, s3, 0, false, 6, null);
            int v10 = s3.length() + v9;
            if(v10 > v9) {
                annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null), v9, v10);
            }
            AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
            composer1.endReplaceGroup();
            TextStyle textStyle2 = new TextStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 3, 0, 0x141E00000L, null, null, null, 0, 0, null, 0xFD7FFF, null);
            ExcludeFontPaddingTextKt.Text-edWjEy0(annotatedString0, PaddingKt.padding-qDBjuR0$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 0.0f, 17.0f, 0.0f, 22.0f, 5, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, null, textStyle2, composer1, 0x30, 0, 0x3FFFC);
            composer1.endReplaceGroup();
            function12 = function11;
        }
        else {
            composer1.startReplaceGroup(1118734204);
            function12 = function11;
            FlowLayoutKt.FlowRow(null, null, null, 0, 0, null, ComposableLambdaKt.rememberComposableLambda(0x21D2F3DE, true, new b0(list0, function12), composer1, 54), composer1, 0x180000, 0x3F);
            composer1.endReplaceGroup();
        }
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c0(modifier1, list0, function12, function01, v, v1));
        }
    }

    public static final void access$BlogNameSuggestion(Modifier modifier0, RecommendedBlogNameInfo recommendedBlogNameInfo0, Function1 function10, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(-158095996);
        Modifier modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-158095996, v, -1, "com.kakao.tistory.presentation.view.signup.BlogNameSuggestion (SignUpScreen.kt:406)");
        }
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape(100);
        Modifier modifier2 = PaddingKt.padding-VpY3zN4(ModifierKt.noRippleClickable(BackgroundKt.background-bw27NRU(BorderKt.border-xT4_qwU(modifier1, 0.5f, ColorResources_androidKt.colorResource(color.gray3, composer1, 0), roundedCornerShape0), 0xFFFFFFFF00000000L, roundedCornerShape0), new x(function10, recommendedBlogNameInfo0)), 12.5f, 10.5f);
        MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(recommendedBlogNameInfo0.getName(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getBody1(), 0xFF00000000000000L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), composer1, 0, 0, 0x1FFFE);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new y(modifier1, recommendedBlogNameInfo0, function10, v, v1));
        }
    }

    public static final void b(Modifier modifier0, SignUpUiState signUpUiState0, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(-1197908595);
        Modifier modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1197908595, v, -1, "com.kakao.tistory.presentation.view.signup.BlogAddressInputForm (SignUpScreen.kt:170)");
        }
        long v2 = ColorResources_androidKt.colorResource(color.gray1, composer1, 0);
        FontWeight fontWeight0 = FontWeight.Companion.getNormal();
        TextUnitKt.checkArithmetic--R2X_6o(0x13DCCCCCDL);
        TextStyle textStyle0 = new TextStyle(v2, 0x141800000L, fontWeight0, null, null, TypeKt.getTFont(), null, 0x1BDCCCCCDL, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 0xF7FF58, null);
        long v3 = ColorResources_androidKt.colorResource(color.gray9, composer1, 0);
        composer1.startReplaceGroup(0x1B3FD39E);
        MutableInteractionSource mutableInteractionSource0 = composer1.rememberedValue();
        if(mutableInteractionSource0 == Composer.Companion.getEmpty()) {
            mutableInteractionSource0 = InteractionSourceKt.MutableInteractionSource();
            composer1.updateRememberedValue(mutableInteractionSource0);
        }
        composer1.endReplaceGroup();
        boolean z = signUpUiState0.getBlogName().getInputState() == SignUpVerificationState.VERIFYING;
        int v4 = z ? drawable.ic_verify_loading : drawable.ic_input_setting_delete_a_os;
        Modifier modifier2 = KeyInputModifierKt.onPreviewKeyEvent(modifier1, s.a);
        s0 s00 = new s0(StringResources_androidKt.stringResource(string.label_sign_up_email_suffix, composer1, 0), SpanStyle.copy-GSF8kmg$default(textStyle0.toSpanStyle(), v3, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFE, null));
        KeyboardOptions keyboardOptions0 = new KeyboardOptions(0, null, 1, 7, null, null, null, 0x73, null);
        CommonTextFieldKt.CommonTextField(signUpUiState0.getBlogName().getText(), new t(signUpUiState0), null, modifier2, textStyle0, mutableInteractionSource0, 1, 0x20, keyboardOptions0, null, s00, v4, null, z, signUpUiState0.getBlogName().getInputState() == SignUpVerificationState.ERROR, signUpUiState0.getBlogName().getStateMessage(), true, new u(z, signUpUiState0), composer1, 0x6DB0000, 0x180000, 0x1204);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v(modifier1, signUpUiState0, v, v1));
        }
    }
}

