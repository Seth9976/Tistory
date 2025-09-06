package com.kakao.tistory.presentation.view.login;

import a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString.Builder;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.tiara.TiaraPage;
import com.kakao.android.base.tiara.TiaraSection;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.graph.b;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.TistoryLoginViewModel;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@TiaraPage(page = "올드계정로그인")
@TiaraSection(section = "로그인")
@AndroidEntryPoint
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0017¢\u0006\u0004\b\u000B\u0010\f¨\u0006\u001D²\u0006\f\u0010\u000F\u001A\u00020\u000E8\nX\u008A\u0084\u0002²\u0006\f\u0010\u0010\u001A\u00020\u000E8\nX\u008A\u0084\u0002²\u0006\u0014\u0010\u0013\u001A\n \u0012*\u0004\u0018\u00010\u00110\u00118\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u0014\u001A\u0004\u0018\u00010\u000E8\nX\u008A\u0084\u0002²\u0006\u0014\u0010\u0015\u001A\n \u0012*\u0004\u0018\u00010\u00110\u00118\nX\u008A\u0084\u0002²\u0006\u0014\u0010\u0016\u001A\n \u0012*\u0004\u0018\u00010\u00110\u00118\nX\u008A\u0084\u0002²\u0006\u000E\u0010\u0017\u001A\u00020\u00118\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u0018\u001A\u00020\u00118\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u0019\u001A\u00020\u00118\n@\nX\u008A\u008E\u0002²\u0006\f\u0010\u001A\u001A\u00020\u00118\nX\u008A\u0084\u0002²\u0006\f\u0010\u001C\u001A\u00020\u001B8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/login/TistroyLoginActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryComposeActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Companion", "", "loginId", "password", "", "kotlin.jvm.PlatformType", "isLoginIdInvalid", "loginIdErrorString", "isLoginEnable", "showProgress", "isIdFocused", "isPasswordFocused", "isPasswordVisible", "isFocused", "", "animationFloat", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistroyLoginActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistroyLoginActivity.kt\ncom/kakao/tistory/presentation/view/login/TistroyLoginActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 13 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,528:1\n10#2,2:529\n1#3:531\n75#4,13:532\n77#5:545\n77#5:546\n77#5:547\n77#5:614\n77#5:850\n1240#6:548\n1039#6,6:549\n1039#6,6:555\n148#7,11:561\n148#7:608\n148#7:613\n148#7:615\n158#7:616\n158#7:653\n148#7:690\n148#7:691\n158#7:778\n148#7:815\n148#7:848\n148#7:849\n85#8:572\n82#8,6:573\n88#8:607\n92#8:612\n85#8:617\n82#8,6:618\n88#8:652\n92#8:699\n85#8:718\n82#8,6:719\n88#8:753\n92#8:847\n78#9,6:579\n85#9,4:594\n89#9,2:604\n93#9:611\n78#9,6:624\n85#9,4:639\n89#9,2:649\n78#9,6:661\n85#9,4:676\n89#9,2:686\n93#9:694\n93#9:698\n78#9,6:725\n85#9,4:740\n89#9,2:750\n78#9,6:786\n85#9,4:801\n89#9,2:811\n93#9:818\n93#9:846\n368#10,9:585\n377#10:606\n378#10,2:609\n368#10,9:630\n377#10:651\n368#10,9:667\n377#10:688\n378#10,2:692\n378#10,2:696\n368#10,9:731\n377#10:752\n368#10,9:792\n377#10:813\n378#10,2:816\n378#10,2:844\n4032#11,6:598\n4032#11,6:643\n4032#11,6:680\n4032#11,6:744\n4032#11,6:805\n71#12:654\n68#12,6:655\n74#12:689\n78#12:695\n71#12:779\n68#12,6:780\n74#12:814\n78#12:819\n1223#13,6:700\n1223#13,6:706\n1223#13,6:712\n1223#13,6:754\n1223#13,6:760\n1223#13,6:766\n1223#13,6:772\n1223#13,6:820\n1223#13,6:826\n1223#13,6:832\n1223#13,6:838\n1223#13,6:851\n81#14:857\n81#14:858\n81#14:859\n81#14:860\n81#14:861\n81#14:862\n81#14:863\n107#14,2:864\n81#14:866\n107#14,2:867\n81#14:869\n107#14,2:870\n81#14:872\n*S KotlinDebug\n*F\n+ 1 TistroyLoginActivity.kt\ncom/kakao/tistory/presentation/view/login/TistroyLoginActivity\n*L\n80#1:529,2\n80#1:531\n80#1:532,13\n127#1:545\n161#1:546\n171#1:547\n250#1:614\n446#1:850\n175#1:548\n176#1:549,6\n182#1:555,6\n193#1:561,11\n203#1:608\n248#1:613\n252#1:615\n258#1:616\n269#1:653\n296#1:690\n314#1:691\n360#1:778\n366#1:815\n417#1:848\n422#1:849\n193#1:572\n193#1:573,6\n193#1:607\n193#1:612\n255#1:617\n255#1:618,6\n255#1:652\n255#1:699\n341#1:718\n341#1:719,6\n341#1:753\n341#1:847\n193#1:579,6\n193#1:594,4\n193#1:604,2\n193#1:611\n255#1:624,6\n255#1:639,4\n255#1:649,2\n279#1:661,6\n279#1:676,4\n279#1:686,2\n279#1:694\n255#1:698\n341#1:725,6\n341#1:740,4\n341#1:750,2\n360#1:786,6\n360#1:801,4\n360#1:811,2\n360#1:818\n341#1:846\n193#1:585,9\n193#1:606\n193#1:609,2\n255#1:630,9\n255#1:651\n279#1:667,9\n279#1:688\n279#1:692,2\n255#1:696,2\n341#1:731,9\n341#1:752\n360#1:792,9\n360#1:813\n360#1:816,2\n341#1:844,2\n193#1:598,6\n255#1:643,6\n279#1:680,6\n341#1:744,6\n360#1:805,6\n279#1:654\n279#1:655,6\n279#1:689\n279#1:695\n360#1:779\n360#1:780,6\n360#1:814\n360#1:819\n334#1:700,6\n335#1:706,6\n337#1:712,6\n349#1:754,6\n348#1:760,6\n357#1:766,6\n354#1:772,6\n379#1:820,6\n378#1:826,6\n395#1:832,6\n392#1:838,6\n447#1:851,6\n241#1:857\n242#1:858\n243#1:859\n244#1:860\n245#1:861\n246#1:862\n334#1:863\n334#1:864,2\n335#1:866\n335#1:867,2\n337#1:869\n337#1:870,2\n456#1:872\n*E\n"})
public final class TistroyLoginActivity extends Hilt_TistroyLoginActivity {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/tistory/presentation/view/login/TistroyLoginActivity$Companion;", "", "", "EXTRA_FORCE_TRANSFER", "Ljava/lang/String;", "getEXTRA_FORCE_TRANSFER", "()Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        @NotNull
        public final String getEXTRA_FORCE_TRANSFER() [...] // 潜在的解密器
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public String k;
    public final BaseViewModelLazy l;
    public static final String m;

    static {
        TistroyLoginActivity.Companion = new Companion(null);
        TistroyLoginActivity.$stable = 8;
        TistroyLoginActivity.m = "EXTRA_FORCE_TRANSFER";
    }

    public TistroyLoginActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.l = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(TistoryLoginViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeActivity
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Composer composer1 = composer0.startRestartGroup(0x87AE6208);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x87AE6208, v, -1, "com.kakao.tistory.presentation.view.login.TistroyLoginActivity.Content (TistroyLoginActivity.kt:125)");
        }
        FocusManager focusManager0 = (FocusManager)composer1.consume(CompositionLocalsKt.getLocalFocusManager());
        ScaffoldKt.Scaffold-27mzLpw(null, null, ComposableLambdaKt.rememberComposableLambda(0x30E5720D, true, new z(this), composer1, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(1824001606, true, new d0(modifier0, this, focusManager0), composer1, 54), composer1, 0x180, 0xC00000, 0x1FFFB);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e0(this, modifier0, v));
        }
    }

    public final void a(Modifier modifier0, String s, Function1 function10, int v, TextStyle textStyle0, MutableInteractionSource mutableInteractionSource0, int v1, KeyboardOptions keyboardOptions0, KeyboardActions keyboardActions0, VisualTransformation visualTransformation0, boolean z, Integer integer0, Function0 function00, Composer composer0, int v2, int v3, int v4) {
        boolean z1;
        KeyboardOptions keyboardOptions1;
        Function0 function01;
        Integer integer1;
        VisualTransformation visualTransformation1;
        KeyboardActions keyboardActions1;
        int v8;
        MutableInteractionSource mutableInteractionSource1;
        TextStyle textStyle1;
        Modifier modifier1;
        Integer integer2;
        int v10;
        KeyboardOptions keyboardOptions2;
        Function0 function02;
        boolean z2;
        VisualTransformation visualTransformation2;
        KeyboardActions keyboardActions2;
        int v9;
        MutableInteractionSource mutableInteractionSource2;
        TextStyle textStyle2;
        Modifier modifier2;
        Modifier modifier4;
        int v6;
        int v5;
        Composer composer1 = composer0.startRestartGroup(0x5BBEEAEB);
        if((v4 & 1) == 0) {
            v5 = (v2 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v5 |= (composer1.changed(s) ? 0x20 : 16);
        }
        if((v4 & 4) != 0) {
            v5 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v5 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v4 & 8) != 0) {
            v5 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v5 |= (composer1.changed(v) ? 0x800 : 0x400);
        }
        if((v2 & 0xE000) == 0) {
            v5 |= ((v4 & 16) != 0 || !composer1.changed(textStyle0) ? 0x2000 : 0x4000);
        }
        if((v4 & 0x20) != 0) {
            v5 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v5 |= (composer1.changed(mutableInteractionSource0) ? 0x20000 : 0x10000);
        }
        if((v4 & 0x40) != 0) {
            v5 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v5 |= (composer1.changed(v1) ? 0x100000 : 0x80000);
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v5 |= (composer1.changed(keyboardOptions0) ? 0x800000 : 0x400000);
        }
        if((v4 & 0x100) != 0) {
            v5 |= 0x6000000;
        }
        else if((v2 & 0xE000000) == 0) {
            v5 |= (composer1.changed(keyboardActions0) ? 0x4000000 : 0x2000000);
        }
        if((v4 & 0x200) != 0) {
            v5 |= 0x30000000;
        }
        else if((v2 & 0x70000000) == 0) {
            v5 |= (composer1.changed(visualTransformation0) ? 0x20000000 : 0x10000000);
        }
        if((v4 & 0x400) == 0) {
            v6 = (v3 & 14) == 0 ? v3 | (composer1.changed(z) ? 4 : 2) : v3;
        }
        else {
            v6 = v3 | 6;
        }
        if((v4 & 0x800) != 0) {
            v6 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v6 |= (composer1.changed(integer0) ? 0x20 : 16);
        }
        int v7 = v6;
        if((v4 & 0x1000) != 0) {
            v7 |= 0x180;
        }
        else if((v3 & 0x380) == 0) {
            v7 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v5 & 0x5B6DB6DB) != 306783378 || (v7 & 731) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v4 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 16) == 0) {
                    textStyle2 = textStyle0;
                }
                else {
                    textStyle2 = (TextStyle)composer1.consume(TextKt.getLocalTextStyle());
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x20) == 0) {
                    modifier4 = modifier3;
                    mutableInteractionSource2 = mutableInteractionSource0;
                }
                else {
                    composer1.startReplaceGroup(0x58ECE08F);
                    MutableInteractionSource mutableInteractionSource3 = composer1.rememberedValue();
                    modifier4 = modifier3;
                    if(mutableInteractionSource3 == Composer.Companion.getEmpty()) {
                        mutableInteractionSource3 = InteractionSourceKt.MutableInteractionSource();
                        composer1.updateRememberedValue(mutableInteractionSource3);
                    }
                    mutableInteractionSource2 = mutableInteractionSource3;
                    composer1.endReplaceGroup();
                }
                v9 = (v4 & 0x40) == 0 ? v1 : 0x7FFFFFFF;
                keyboardOptions2 = (v4 & 0x80) == 0 ? keyboardOptions0 : KeyboardOptions.Companion.getDefault();
                KeyboardActions keyboardActions3 = (v4 & 0x100) == 0 ? keyboardActions0 : KeyboardActions.Companion.getDefault();
                VisualTransformation visualTransformation3 = (v4 & 0x200) == 0 ? visualTransformation0 : VisualTransformation.Companion.getNone();
                function02 = (v4 & 0x1000) == 0 ? function00 : a1.a;
                v10 = v5;
                integer2 = (v4 & 0x800) == 0 ? integer0 : null;
                z2 = (v4 & 0x400) == 0 ? z : false;
                visualTransformation2 = visualTransformation3;
                keyboardActions2 = keyboardActions3;
                modifier2 = modifier4;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                modifier2 = modifier0;
                textStyle2 = textStyle0;
                mutableInteractionSource2 = mutableInteractionSource0;
                v9 = v1;
                keyboardActions2 = keyboardActions0;
                visualTransformation2 = visualTransformation0;
                z2 = z;
                function02 = function00;
                keyboardOptions2 = keyboardOptions0;
                v10 = v5;
                integer2 = integer0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5BBEEAEB, v10, v7, "com.kakao.tistory.presentation.view.login.TistroyLoginActivity.TistoryLoginTextField (TistroyLoginActivity.kt:454)");
            }
            State state0 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource2, composer1, v10 >> 15 & 14);
            SolidColor solidColor0 = new SolidColor(ColorResources_androidKt.colorResource(color.gray1, composer1, 0), null);
            BasicTextFieldKt.BasicTextField(s, function10, SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), false, false, textStyle2, keyboardOptions2, keyboardActions2, v9 == 1, v9, 0, visualTransformation2, null, mutableInteractionSource2, solidColor0, ComposableLambdaKt.rememberComposableLambda(0x281778A1, true, new c1(s, v, state0, integer2, z2, function02), composer1, 54), composer1, v10 >> 3 & 0x1C00000 | (v10 >> 3 & 0x7E | v10 << 3 & 0x70000 | v10 >> 3 & 0x380000) | v10 << 9 & 0x70000000, v10 >> 24 & 0x70 | 0x30000 | v10 >> 6 & 0x1C00, 5144);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource1 = mutableInteractionSource2;
            modifier1 = modifier2;
            z1 = z2;
            integer1 = integer2;
            function01 = function02;
            textStyle1 = textStyle2;
            v8 = v9;
            keyboardOptions1 = keyboardOptions2;
            keyboardActions1 = keyboardActions2;
            visualTransformation1 = visualTransformation2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            textStyle1 = textStyle0;
            mutableInteractionSource1 = mutableInteractionSource0;
            v8 = v1;
            keyboardActions1 = keyboardActions0;
            visualTransformation1 = visualTransformation0;
            integer1 = integer0;
            function01 = function00;
            keyboardOptions1 = keyboardOptions0;
            z1 = z;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d1(this, modifier1, s, function10, v, textStyle1, mutableInteractionSource1, v8, keyboardOptions1, keyboardActions1, visualTransformation1, z1, integer1, function01, v2, v3, v4));
        }
    }

    public final void a(Modifier modifier0, boolean z, boolean z1, Function0 function00, Composer composer0, int v, int v1) {
        Function0 function01;
        boolean z3;
        boolean z2;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(2006946886);
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
            v2 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            boolean z4 = (v1 & 2) == 0 ? z : true;
            boolean z5 = (v1 & 4) == 0 ? z1 : false;
            Function0 function02 = (v1 & 8) == 0 ? function00 : f0.a;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2006946886, v2, -1, "com.kakao.tistory.presentation.view.login.TistroyLoginActivity.LoginButton (TistroyLoginActivity.kt:410)");
            }
            Modifier modifier2 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier1, 0.0f, 1, null), 44.0f);
            long v3 = ColorResources_androidKt.colorResource(color.color_bbbbbb, composer1, 0);
            ButtonColors buttonColors0 = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(0xFF00000000000000L, 0L, v3, 0L, composer1, ButtonDefaults.$stable << 12 | 6, 10);
            ButtonKt.Button(function02, modifier2, z5, null, ButtonDefaults.INSTANCE.elevation-R_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, ButtonDefaults.$stable << 15 | 6, 30), null, null, buttonColors0, null, ComposableLambdaKt.rememberComposableLambda(0xE20F2436, true, new g0(z4), composer1, 54), composer1, v2 >> 9 & 14 | 0x30000000 | v2 & 0x380, 360);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z4;
            z3 = z5;
            function01 = function02;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            z2 = z;
            z3 = z1;
            function01 = function00;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h0(this, modifier1, z2, z3, function01, v, v1));
        }
    }

    public final void a(String s, String s1, String s2, boolean z, Function1 function10, Function1 function11, Function0 function00, Function0 function01, Modifier modifier0, Composer composer0, int v, int v1) {
        boolean z4;
        VisualTransformation visualTransformation0;
        androidx.compose.ui.Modifier.Companion modifier$Companion1;
        Composer composer1 = composer0.startRestartGroup(2069980609);
        Modifier modifier1 = (v1 & 0x100) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2069980609, v, -1, "com.kakao.tistory.presentation.view.login.TistroyLoginActivity.LoginForm (TistroyLoginActivity.kt:332)");
        }
        composer1.startReplaceGroup(0x8A9BA353);
        MutableState mutableState0 = composer1.rememberedValue();
        androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        MutableState mutableState1 = b.a(composer1, -1969509421);
        if(mutableState1 == composer$Companion0.getEmpty()) {
            mutableState1 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer1.updateRememberedValue(mutableState1);
        }
        MutableState mutableState2 = b.a(composer1, -1969507213);
        if(mutableState2 == composer$Companion0.getEmpty()) {
            mutableState2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer1.updateRememberedValue(mutableState2);
        }
        composer1.endReplaceGroup();
        long v2 = ColorResources_androidKt.colorResource(color.colorError, composer1, 0);
        Modifier modifier2 = SizeKt.fillMaxWidth$default(modifier1, 0.0f, 1, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer1, 0);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
            d.a(v3, composer1, v3, function20);
        }
        Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
        MaterialTheme materialTheme0 = MaterialTheme.INSTANCE;
        int v4 = MaterialTheme.$stable;
        TextStyle textStyle0 = materialTheme0.getTypography(composer1, v4).getH1();
        KeyboardOptions keyboardOptions0 = new KeyboardOptions(0, null, 7, 6, null, null, null, 0x73, null);
        composer1.startReplaceGroup(0x1387FC84);
        int v5 = 0x1C00000 & v ^ 0xC00000;
        boolean z1 = v5 > 0x800000 && composer1.changed(function01) || (v & 0xC00000) == 0x800000;
        i0 i00 = composer1.rememberedValue();
        if(z1 || i00 == composer$Companion0.getEmpty()) {
            i00 = new i0(function01);
            composer1.updateRememberedValue(i00);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x1387F624);
        int v6 = 0x380000 & v ^ 0x180000;
        boolean z2 = v6 > 0x100000 && composer1.changed(function00) || (v & 0x180000) == 0x100000;
        j0 j00 = composer1.rememberedValue();
        if(z2 || j00 == composer$Companion0.getEmpty()) {
            j00 = new j0(function00);
            composer1.updateRememberedValue(j00);
        }
        composer1.endReplaceGroup();
        KeyboardActions keyboardActions0 = new KeyboardActions(i00, null, j00, null, null, null, 58, null);
        int v7 = string.label_login_email_hint;
        int v8 = drawable.ic_input_setting_delete_a_os;
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier4 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
        composer1.startReplaceGroup(327690990);
        k0 k00 = composer1.rememberedValue();
        if(k00 == composer$Companion0.getEmpty()) {
            k00 = new k0(mutableState0);
            composer1.updateRememberedValue(k00);
        }
        composer1.endReplaceGroup();
        Modifier modifier5 = FocusChangedModifierKt.onFocusChanged(modifier4, k00);
        Integer integer0 = v8;
        composer1.startReplaceGroup(0x13881A28);
        boolean z3 = (0xE000 & v ^ 0x6000) > 0x4000 && composer1.changed(function10) || (v & 0x6000) == 0x4000;
        l0 l00 = composer1.rememberedValue();
        if(z3 || l00 == composer$Companion0.getEmpty()) {
            l00 = new l0(function10);
            composer1.updateRememberedValue(l00);
        }
        composer1.endReplaceGroup();
        this.a(modifier5, s, function10, v7, textStyle0, null, 1, keyboardOptions0, keyboardActions0, null, false, integer0, l00, composer1, v << 3 & 0x70 | 0xD80000 | v >> 6 & 0x380, 0x1000, 0x620);
        Modifier modifier6 = SizeKt.heightIn-VpY3zN4$default(modifier$Companion0, 6.5f, 0.0f, 2, null);
        MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
            d.a(v9, composer1, v9, function21);
        }
        r0.a.z(composeUiNode$Companion0, composer1, modifier7, composer1, 0xED7474F7);
        if(!z || s2 == null) {
            modifier$Companion1 = modifier$Companion0;
        }
        else {
            modifier$Companion1 = modifier$Companion0;
            TextKt.Text--4IGK_g(s2, PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 5.0f, 0.0f, 0.0f, 13, null), v2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TypeKt.getTypography().getBody1(), composer1, v >> 6 & 14 | 0x30, 0, 0xFFF8);
        }
        composer1.endReplaceGroup();
        composer1.endNode();
        TextStyle textStyle1 = materialTheme0.getTypography(composer1, v4).getH1();
        if(((Boolean)mutableState2.getValue()).booleanValue()) {
            visualTransformation0 = VisualTransformation.Companion.getNone();
            z4 = true;
        }
        else {
            z4 = true;
            visualTransformation0 = new PasswordVisualTransformation('\u0000', 1, null);
        }
        KeyboardOptions keyboardOptions1 = new KeyboardOptions(0, null, 7, 7, null, null, null, 0x73, null);
        composer1.startReplaceGroup(0x1388A904);
        boolean z5 = v5 > 0x800000 && composer1.changed(function01) || (v & 0xC00000) == 0x800000;
        m0 m00 = composer1.rememberedValue();
        if(z5 || m00 == composer$Companion0.getEmpty()) {
            m00 = new m0(function01);
            composer1.updateRememberedValue(m00);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x1388A2A4);
        boolean z6 = v6 > 0x100000 && composer1.changed(function00) || (v & 0x180000) == 0x100000;
        n0 n00 = composer1.rememberedValue();
        if(z6 || n00 == composer$Companion0.getEmpty()) {
            n00 = new n0(function00);
            composer1.updateRememberedValue(n00);
        }
        composer1.endReplaceGroup();
        KeyboardActions keyboardActions1 = new KeyboardActions(m00, null, n00, null, null, null, 58, null);
        int v10 = string.label_login_password_hint;
        Integer integer1 = ((Boolean)mutableState1.getValue()).booleanValue() ? ((int)(((Boolean)mutableState2.getValue()).booleanValue() ? drawable.ic_input_invisible : drawable.ic_input_visible)) : null;
        Modifier modifier8 = SizeKt.fillMaxWidth$default(modifier$Companion1, 0.0f, 1, null);
        composer1.startReplaceGroup(0x1388FED8);
        if((v6 <= 0x100000 || !composer1.changed(function00)) && (v & 0x180000) != 0x100000) {
            z4 = false;
        }
        o0 o00 = composer1.rememberedValue();
        if(z4 || o00 == composer$Companion0.getEmpty()) {
            o00 = new o0(function00, mutableState1);
            composer1.updateRememberedValue(o00);
        }
        composer1.endReplaceGroup();
        Modifier modifier9 = FocusChangedModifierKt.onFocusChanged(modifier8, o00);
        composer1.startReplaceGroup(327740218);
        p0 p00 = composer1.rememberedValue();
        if(p00 == composer$Companion0.getEmpty()) {
            p00 = new p0(mutableState2);
            composer1.updateRememberedValue(p00);
        }
        composer1.endReplaceGroup();
        this.a(modifier9, s1, function11, v10, textStyle1, null, 1, keyboardOptions1, keyboardActions1, visualTransformation0, true, integer1, p00, composer1, v & 0x70 | 0xD80000 | v >> 9 & 0x380, 4486, 0x20);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q0(this, s, s1, s2, z, function10, function11, function00, function01, modifier1, v, v1));
        }
    }

    public static final void access$LoginForm$lambda$15(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final boolean access$LoginForm$lambda$17(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$LoginForm$lambda$18(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final boolean access$LoginForm$lambda$20(MutableState mutableState0) {
        return ((Boolean)mutableState0.getValue()).booleanValue();
    }

    public static final void access$LoginForm$lambda$21(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }

    public static final void access$MigrationGuide(TistroyLoginActivity tistroyLoginActivity0, Composer composer0, int v) {
        tistroyLoginActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(-2009750832);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2009750832, v, -1, "com.kakao.tistory.presentation.view.login.TistroyLoginActivity.MigrationGuide (TistroyLoginActivity.kt:159)");
        }
        FocusManager focusManager0 = (FocusManager)composer1.consume(CompositionLocalsKt.getLocalFocusManager());
        String s = StringResources_androidKt.stringResource(string.label_login_tistory_migration_guide_description, composer1, 0);
        String s1 = StringResources_androidKt.stringResource(string.label_login_tistory_migration_guide_see_detail, composer1, 0);
        String s2 = StringResources_androidKt.stringResource(string.link_unregistered_kakao_account_guide, composer1, 0);
        int v1 = s.length();
        Object object0 = ((Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getSystemService("accessibility");
        AccessibilityManager accessibilityManager0 = object0 instanceof AccessibilityManager ? ((AccessibilityManager)object0) : null;
        boolean z = accessibilityManager0 != null && accessibilityManager0.isEnabled();
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        int v2 = annotatedString$Builder0.pushStyle(TypeKt.getTypography().getH6().toSpanStyle());
        try {
            annotatedString$Builder0.append(s);
        }
        finally {
            annotatedString$Builder0.pop(v2);
        }
        androidx.compose.ui.text.font.FontWeight.Companion fontWeight$Companion0 = FontWeight.Companion;
        int v4 = annotatedString$Builder0.pushStyle(TextStyle.copy-p1EtxEg$default(TypeKt.getTypography().getBody1(), 0L, 0L, fontWeight$Companion0.getNormal(), null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFEFFB, null).toSpanStyle());
        try {
            annotatedString$Builder0.addStringAnnotation("redirection", "", v1, s1.length() + v1);
            annotatedString$Builder0.append(s1);
        }
        finally {
            annotatedString$Builder0.pop(v4);
        }
        AnnotatedString annotatedString0 = annotatedString$Builder0.toAnnotatedString();
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0(modifier$Companion0, 20.0f, 26.0f, 20.0f, 25.5f);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
        int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
            d.a(v6, composer1, v6, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        String s3 = StringResources_androidKt.stringResource(string.label_login_tistory_migration_guide_title, composer1, 0);
        TextStyle textStyle0 = new TextStyle(0xFF00000000000000L, 0x141A00000L, fontWeight$Companion0.getNormal(), null, null, TypeKt.getTFont(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0x141F00000L, null, null, null, 0, 0, null, 0xFDFFD8, null);
        TextKt.Text--4IGK_g(s3, PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 0.0f, 10.0f, 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0x30, 0, 0xFFFC);
        ClickableTextKt.ClickableText-4YKlhWE(annotatedString0, null, TextStyle.copy-p1EtxEg$default(TextStyle.Companion.getDefault(), 0L, 0L, null, null, null, null, null, 0x13DCCCCCDL, null, null, null, 0L, null, null, null, 0, 0, 0x141B00000L, null, null, null, 0, 0, null, 0xFDFF7F, null), false, 0, 0, null, new r0(z, annotatedString0, ColumnScopeInstance.INSTANCE, s2, tistroyLoginActivity0, focusManager0), composer1, 0, 0x7A);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s0(tistroyLoginActivity0, v));
        }
    }

    public static final void access$TistoryLogin(TistroyLoginActivity tistroyLoginActivity0, Composer composer0, int v) {
        float f;
        tistroyLoginActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(0x72F6F1AB);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x72F6F1AB, v, -1, "com.kakao.tistory.presentation.view.login.TistroyLoginActivity.TistoryLogin (TistroyLoginActivity.kt:239)");
        }
        State state0 = SnapshotStateKt.collectAsState(((TistoryLoginViewModel)tistroyLoginActivity0.l.getValue()).getLoginId(), "", null, composer1, 56, 2);
        State state1 = SnapshotStateKt.collectAsState(((TistoryLoginViewModel)tistroyLoginActivity0.l.getValue()).getPassword(), "", null, composer1, 56, 2);
        State state2 = LiveDataAdapterKt.observeAsState(((TistoryLoginViewModel)tistroyLoginActivity0.l.getValue()).getLoginIdInputLayoutErrorEnabled(), Boolean.FALSE, composer1, 56);
        State state3 = LiveDataAdapterKt.observeAsState(((TistoryLoginViewModel)tistroyLoginActivity0.l.getValue()).getLoginIdInputLayoutError(), null, composer1, 56);
        State state4 = LiveDataAdapterKt.observeAsState(((TistoryLoginViewModel)tistroyLoginActivity0.l.getValue()).getLoginButtonEnabled(), Boolean.FALSE, composer1, 56);
        State state5 = LiveDataAdapterKt.observeAsState(((TistoryLoginViewModel)tistroyLoginActivity0.l.getValue()).isShowProgress(), Boolean.FALSE, composer1, 56);
        int v1 = ((Configuration)composer1.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1 ? -25 : -67;
        String s = StringResources_androidKt.stringResource(string.find_tistory_account_url, composer1, 0);
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(BackgroundKt.background-bw27NRU$default(modifier$Companion0, ColorResources_androidKt.colorResource(color.color_f5f5f5, composer1, 0), null, 2, null), 0.0f, 31.5f, 0.0f, 0.0f, 13, null);
        androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), alignment$Companion0.getStart(), composer1, 0);
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
        if(composer1.getInserting()) {
            f = (float)v1;
            d.a(v2, composer1, v2, function20);
        }
        else {
            f = (float)v1;
            if(!Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        Object object0 = state0.getValue();
        Object object1 = state1.getValue();
        Object object2 = state3.getValue();
        Boolean boolean0 = (Boolean)state2.getValue();
        t0 t00 = new t0(((TistoryLoginViewModel)tistroyLoginActivity0.l.getValue()));
        u0 u00 = new u0(((TistoryLoginViewModel)tistroyLoginActivity0.l.getValue()));
        v0 v00 = new v0(((TistoryLoginViewModel)tistroyLoginActivity0.l.getValue()));
        w0 w00 = new w0(((TistoryLoginViewModel)tistroyLoginActivity0.l.getValue()));
        Modifier modifier2 = PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 50.0f, 0.0f, 50.0f, 29.5f, 2, null);
        Intrinsics.checkNotNull(boolean0);
        tistroyLoginActivity0.a(((String)object0), ((String)object1), ((String)object2), boolean0.booleanValue(), v00, w00, t00, u00, modifier2, composer1, 0x40000000, 0);
        Boolean boolean1 = (Boolean)state4.getValue();
        x0 x00 = new x0(((TistoryLoginViewModel)tistroyLoginActivity0.l.getValue()));
        Boolean boolean2 = (Boolean)state5.getValue();
        Modifier modifier3 = PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 50.0f, 0.0f, 2, null);
        Intrinsics.checkNotNull(boolean2);
        Intrinsics.checkNotNull(boolean1);
        tistroyLoginActivity0.a(modifier3, boolean2.booleanValue(), boolean1.booleanValue(), x00, composer1, 0x8006, 0);
        Modifier modifier4 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
        MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
        int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
        CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
        Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
        Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
        ImageKt.Image(PainterResources_androidKt.painterResource(drawable.login_bg, composer1, 0), null, AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 1.65f, false, 2, null), null, null, 0.0f, null, composer1, 440, 120);
        String s1 = StringResources_androidKt.stringResource(string.label_login_find_tistory_account_or_password, composer1, 0);
        TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext2(TypeKt.getTypography()), 0xFF55555500000000L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFEFFE, null);
        Modifier modifier6 = PaddingKt.padding-qDBjuR0$default(OffsetKt.offset-VpY3zN4$default(modifier$Companion0, 0.0f, f, 1, null), 45.0f, 0.0f, 0.0f, 0.0f, 14, null);
        TextKt.Text--4IGK_g(s1, PaddingKt.padding-3ABfNKs(ClickableKt.clickable-XHw0xAI$default(BoxScopeInstance.INSTANCE.align(modifier6, alignment$Companion0.getBottomStart()), false, null, null, new y0(s, tistroyLoginActivity0), 7, null), 5.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, composer1, 0, 0, 0xFFFC);
        if(e.a(composer1)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z0(tistroyLoginActivity0, v));
        }
    }

    public static final boolean access$TistoryLoginTextField$lambda$33(State state0) {
        return ((Boolean)state0.getValue()).booleanValue();
    }

    public static final void access$backToKakaoLogin(TistroyLoginActivity tistroyLoginActivity0) {
        tistroyLoginActivity0.getClass();
        String s = tistroyLoginActivity0.getSection();
        String s1 = tistroyLoginActivity0.getPage();
        Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "login_email_back", null, null, null, null, null, null, null, null, null, 0x3FE, null);
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, s, s1, TiaraActionType.CLICK_BACK, null, click0, null, null, null, 0xE8, null);
        tistroyLoginActivity0.finish();
    }

    // 去混淆评级： 低(20)
    public static final String access$getEXTRA_FORCE_TRANSFER$cp() [...] // 潜在的解密器

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeActivity
    public void onCreate(@Nullable Bundle bundle0) {
        String s;
        super.onCreate(bundle0);
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
            s = null;
        }
        else {
            Uri uri0 = intent0.getData();
            s = uri0 == null ? null : uri0.toString();
        }
        this.k = s;
        TistoryLoginViewModel tistoryLoginViewModel0 = (TistoryLoginViewModel)this.l.getValue();
        Bundle bundle1 = this.getIntent().getExtras();
        tistoryLoginViewModel0.setForceTransfer((bundle1 == null ? false : bundle1.getBoolean("EXTRA_FORCE_TRANSFER")));
        TistoryLoginViewModel tistoryLoginViewModel1 = (TistoryLoginViewModel)this.l.getValue();
        LiveDataExtensionKt.observeEvent(tistoryLoginViewModel1.getNavigateToMainActivity(), this, new e1(this));
        LiveDataExtensionKt.observeEvent(tistoryLoginViewModel1.getNavigateToTransferActivity(), this, new f1(this));
        LiveDataExtensionKt.observeEvent(tistoryLoginViewModel1.getShowErrorDialog(), this, new h1(this));
    }
}

