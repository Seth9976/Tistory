package com.kakao.tistory.presentation.widget.dialog;

import a;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavController;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.TypeKt;
import d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\u001A\u0019\u0010\u0004\u001A\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001AA\u0010\u000B\u001A\u00020\u0003*\u00020\u00062\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u00072\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00030\u00072\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\u000B\u0010\f\u001AG\u0010\r\u001A\u00020\u00032\u0006\u0010\u0002\u001A\u00020\u00012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u00072\u000E\b\u0002\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00030\u00072\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000E\"\u0014\u0010\u000F\u001A\u00020\u00018\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000F\u0010\u0010¨\u0006\u0013²\u0006\u000E\u0010\u0012\u001A\u00020\u00118\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/navigation/NavController;", "", "userName", "", "navigateToWelcomeDialog", "(Landroidx/navigation/NavController;Ljava/lang/String;)V", "Landroidx/navigation/NavGraphBuilder;", "Lkotlin/Function0;", "onClickTip", "onClickToMyBlog", "onDismiss", "welcomeDialog", "(Landroidx/navigation/NavGraphBuilder;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "WelcomeDialog", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "WELCOME_DIALOG_ROUTE", "Ljava/lang/String;", "", "useRedirection", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nWelcomeDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelcomeDialog.kt\ncom/kakao/tistory/presentation/widget/dialog/WelcomeDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,257:1\n1223#2,6:258\n1223#2,6:264\n1240#3:270\n158#4:271\n158#4:272\n148#4:273\n71#5:274\n69#5,5:275\n74#5:308\n78#5:312\n78#6,6:280\n85#6,4:295\n89#6,2:305\n93#6:311\n368#7,9:286\n377#7:307\n378#7,2:309\n4032#8,6:299\n81#9:313\n107#9,2:314\n*S KotlinDebug\n*F\n+ 1 WelcomeDialog.kt\ncom/kakao/tistory/presentation/widget/dialog/WelcomeDialogKt\n*L\n81#1:258,6\n83#1:264,6\n100#1:270\n239#1:271\n246#1:272\n246#1:273\n235#1:274\n235#1:275,5\n235#1:308\n235#1:312\n235#1:280,6\n235#1:295,4\n235#1:305,2\n235#1:311\n235#1:286,9\n235#1:307\n235#1:309,2\n235#1:299,6\n81#1:313\n81#1:314,2\n*E\n"})
public final class WelcomeDialogKt {
    @NotNull
    public static final String WELCOME_DIALOG_ROUTE = "welcome_dialog/{userName}";

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void WelcomeDialog(@NotNull String s, @Nullable Function0 function00, @Nullable Function0 function01, @Nullable Function0 function02, @Nullable Composer composer0, int v, int v1) {
        Function0 function05;
        Function0 function04;
        Function0 function03;
        int v2;
        Intrinsics.checkNotNullParameter(s, "userName");
        Composer composer1 = composer0.startRestartGroup(1310353879);
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
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function01) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function02) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            function03 = (v1 & 2) == 0 ? function00 : m1.a;
            Function0 function06 = (v1 & 4) == 0 ? function01 : n1.a;
            Function0 function07 = (v1 & 8) == 0 ? function02 : o1.a;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1310353879, v2, -1, "com.kakao.tistory.presentation.widget.dialog.WelcomeDialog (WelcomeDialog.kt:69)");
            }
            p1 p10 = new p1(null);
            EffectsKt.LaunchedEffect(Unit.INSTANCE, p10, composer1, 70);
            composer1.startReplaceGroup(0xAF90302);
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0xAF90C52);
            q1 q10 = composer1.rememberedValue();
            if((v2 & 0x1C00) == 0x800 || q10 == composer$Companion0.getEmpty()) {
                q10 = new q1(function07, mutableState0);
                composer1.updateRememberedValue(q10);
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(0xAF946AC);
            Builder annotatedString$Builder0 = new Builder(0, 1, null);
            annotatedString$Builder0.append(StringResources_androidKt.stringResource(string.label_sign_up_complete, new Object[]{s}, composer1, 0x40));
            int v3 = s.length();
            annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFA, null), 0, v3);
            annotatedString$Builder0.addStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getLight(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0xFFFB, null), v3, v3 + 3);
            AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
            composer1.endReplaceGroup();
            AndroidDialog_androidKt.Dialog(q10, new DialogProperties(false, false, false, 3, null), ComposableLambdaKt.rememberComposableLambda(0x252059A0, true, new k1(q10, annotatedString0, function03, function06, mutableState0), composer1, 54), composer1, 0x1B0, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function05 = function07;
            function04 = function06;
        }
        else {
            composer1.skipToGroupEnd();
            function03 = function00;
            function04 = function01;
            function05 = function02;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l1(s, function03, function04, function05, v, v1));
        }
    }

    public static final void access$ColorInvertButton(String s, boolean z, Function0 function00, Composer composer0, int v, int v1) {
        boolean z1;
        long v4;
        long v3;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xAA7845DA);
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
            v2 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            z1 = (v1 & 2) == 0 ? z : false;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xAA7845DA, v2, -1, "com.kakao.tistory.presentation.widget.dialog.ColorInvertButton (WelcomeDialog.kt:218)");
            }
            if(z1) {
                composer1.startReplaceGroup(0x2A7CBAB0);
                v3 = ColorResources_androidKt.colorResource(color.white, composer1, 0);
            }
            else {
                composer1.startReplaceGroup(0x2A7D8FEF);
                v3 = ColorResources_androidKt.colorResource(color.gray1, composer1, 0);
            }
            composer1.endReplaceGroup();
            if(z1) {
                composer1.startReplaceGroup(0x2A7EFC10);
                v4 = ColorResources_androidKt.colorResource(color.gray1, composer1, 0);
            }
            else {
                composer1.startReplaceGroup(0x2A7FD130);
                v4 = ColorResources_androidKt.colorResource(color.white, composer1, 0);
            }
            composer1.endReplaceGroup();
            Modifier modifier0 = SizeKt.size-VpY3zN4(BackgroundKt.background-bw27NRU(BorderKt.border-xT4_qwU(ClickableKt.clickable-XHw0xAI$default(Modifier.Companion, false, null, null, function00, 7, null), 0.5f, ColorResources_androidKt.colorResource(color.color_d0d0d0, composer1, 0), RoundedCornerShapeKt.RoundedCornerShape(100)), v4, RoundedCornerShapeKt.RoundedCornerShape(100)), 130.5f, 40.0f);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                d.a(v5, composer1, v5, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            TextKt.Text--4IGK_g(s, null, v3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getTypography().getButton(), composer1, v2 & 14, 0, 0xFFFA);
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
            scopeUpdateScope0.updateScope(new h1(s, z1, function00, v, v1));
        }
    }

    public static final boolean access$WelcomeDialog$lambda$1(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$WelcomeDialog$lambda$2(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final void navigateToWelcomeDialog(@NotNull NavController navController0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(navController0, "<this>");
        Intrinsics.checkNotNullParameter(s, "userName");
        NavController.navigate$default(navController0, "welcome_dialog/" + s, null, null, 6, null);
    }

    public static final void welcomeDialog(@NotNull NavGraphBuilder navGraphBuilder0, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02) {
        Intrinsics.checkNotNullParameter(navGraphBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(function00, "onClickTip");
        Intrinsics.checkNotNullParameter(function01, "onClickToMyBlog");
        Intrinsics.checkNotNullParameter(function02, "onDismiss");
        NavGraphBuilderKt.dialog$default(navGraphBuilder0, "welcome_dialog/{userName}", k.listOf(NamedNavArgumentKt.navArgument("userName", u1.a)), null, null, ComposableLambdaKt.composableLambdaInstance(0xA3B4EA17, true, new v1(function00, function01, function02)), 12, null);
    }

    public static void welcomeDialog$default(NavGraphBuilder navGraphBuilder0, Function0 function00, Function0 function01, Function0 function02, int v, Object object0) {
        if((v & 1) != 0) {
            function00 = r1.a;
        }
        if((v & 2) != 0) {
            function01 = s1.a;
        }
        if((v & 4) != 0) {
            function02 = t1.a;
        }
        WelcomeDialogKt.welcomeDialog(navGraphBuilder0, function00, function01, function02);
    }
}

