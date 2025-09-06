package com.kakao.tistory.presentation.view.login;

import a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ButtonElevation;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.tiara.TiaraPage;
import com.kakao.android.base.tiara.TiaraSection;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.anim;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.KakaoLoginViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@TiaraPage(page = "로그인")
@TiaraSection(section = "로그인")
@AndroidEntryPoint
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001A\u00020\u00072\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tR\u001A\u0010\u000F\u001A\u00020\n8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u0013²\u0006\f\u0010\u0012\u001A\u00020\u00118\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/login/KakaoLoginActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryActivity;", "Lcom/kakao/tistory/presentation/databinding/ComposeContainerBinding;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "j", "I", "getLayoutResourceId", "()I", "layoutResourceId", "Companion", "", "isHideTistoryLoginButton", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKakaoLoginActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KakaoLoginActivity.kt\ncom/kakao/tistory/presentation/view/login/KakaoLoginActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,325:1\n10#2,2:326\n1#3:328\n75#4,13:329\n77#5:342\n85#6:343\n82#6,6:344\n88#6:378\n92#6:384\n85#6,3:385\n88#6:416\n92#6:431\n78#7,6:350\n85#7,4:365\n89#7,2:375\n93#7:383\n78#7,6:388\n85#7,4:403\n89#7,2:413\n93#7:430\n368#8,9:356\n377#8:377\n378#8,2:381\n368#8,9:394\n377#8:415\n378#8,2:428\n4032#9,6:369\n4032#9,6:407\n158#10:379\n148#10:380\n148#10,11:417\n148#10:432\n148#10:433\n148#10:434\n148#10:435\n148#10:436\n158#10:437\n148#10:438\n148#10:439\n148#10:440\n81#11:441\n*S KotlinDebug\n*F\n+ 1 KakaoLoginActivity.kt\ncom/kakao/tistory/presentation/view/login/KakaoLoginActivity\n*L\n57#1:326,2\n57#1:328\n57#1:329,13\n90#1:342\n98#1:343\n98#1:344,6\n98#1:378\n98#1:384\n151#1:385,3\n151#1:416\n151#1:431\n98#1:350,6\n98#1:365,4\n98#1:375,2\n98#1:383\n151#1:388,6\n151#1:403,4\n151#1:413,2\n151#1:430\n98#1:356,9\n98#1:377\n98#1:381,2\n151#1:394,9\n151#1:415\n151#1:428,2\n98#1:369,6\n151#1:407,6\n115#1:379\n145#1:380\n161#1:417,11\n177#1:432\n179#1:433\n180#1:434\n185#1:435\n186#1:436\n212#1:437\n214#1:438\n216#1:439\n240#1:440\n94#1:441\n*E\n"})
public final class KakaoLoginActivity extends Hilt_KakaoLoginActivity {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001A\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/presentation/view/login/KakaoLoginActivity$Companion;", "", "Landroid/content/Context;", "context", "", "isTistoryLogin", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Z)Landroid/content/Intent;", "", "IS_TISTORY_LOGIN", "Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context0, boolean z) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intent intent0 = new Intent(context0, KakaoLoginActivity.class);
            intent0.addFlags(0x10008000);
            intent0.putExtra("IS_TISTORY_LOGIN", z);
            return intent0;
        }

        public static Intent createIntent$default(Companion kakaoLoginActivity$Companion0, Context context0, boolean z, int v, Object object0) {
            if((v & 2) != 0) {
                z = false;
            }
            return kakaoLoginActivity$Companion0.createIntent(context0, z);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int j;
    public final BaseViewModelLazy k;
    public static final String l;

    static {
        KakaoLoginActivity.Companion = new Companion(null);
        KakaoLoginActivity.$stable = 8;
        KakaoLoginActivity.l = "IS_TISTORY_LOGIN";
    }

    public KakaoLoginActivity() {
        this.j = layout.compose_container;
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.k = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(KakaoLoginViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
    }

    public final void a(int v, Function0 function00, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x4282CFA6);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4282CFA6, v2, -1, "com.kakao.tistory.presentation.view.login.KakaoLoginActivity.UnderLineTextButton (KakaoLoginActivity.kt:229)");
            }
            String s = StringResources_androidKt.stringResource(v, composer1, v2 & 14);
            TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), ColorResources_androidKt.colorResource(color.gray5, composer1, 0), 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFEFFA, null);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, PaddingKt.padding-VpY3zN4(ClickableKt.clickable-XHw0xAI$default(Modifier.Companion, false, null, null, function00, 7, null), 10.0f, 12.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, 0, 0, 0x1FFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m(this, v, function00, v1));
        }
    }

    public final void a(Context context0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xC7400DC9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xC7400DC9, v, -1, "com.kakao.tistory.presentation.view.login.KakaoLoginActivity.KakaoLoginButton (KakaoLoginActivity.kt:172)");
        }
        Modifier modifier0 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 30.0f, 0.0f, 30.0f, 12.0f, 2, null), 0.0f, 1, null), 48.0f);
        RoundedCornerShape roundedCornerShape0 = RoundedCornerShapeKt.RoundedCornerShape-0680j_4(6.0f);
        long v1 = ColorResources_androidKt.colorResource(color.color_fee500, composer1, 0);
        long v2 = ColorResources_androidKt.colorResource(color.black, composer1, 0);
        ButtonColors buttonColors0 = ButtonDefaults.INSTANCE.buttonColors-ro_MJ88(v1, v2, 0L, 0L, composer1, ButtonDefaults.$stable << 12, 12);
        ButtonElevation buttonElevation0 = ButtonDefaults.INSTANCE.elevation-R_JCAzs(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer1, ButtonDefaults.$stable << 15 | 54, 28);
        PaddingValues paddingValues0 = PaddingKt.PaddingValues-0680j_4(0.0f);
        ButtonKt.Button(new g(this, context0), modifier0, false, null, buttonElevation0, roundedCornerShape0, null, buttonColors0, paddingValues0, ComposableSingletons.KakaoLoginActivityKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, 0x36000030, 76);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(this, context0, v));
        }
    }

    public final void a(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x9D7F7E8B);
        if((v & 1) != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x9D7F7E8B, v, -1, "com.kakao.tistory.presentation.view.login.KakaoLoginActivity.TistoryLogo (KakaoLoginActivity.kt:149)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterHorizontally(), composer1, 54);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
                d.a(v1, composer1, v1, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ico_login_tistory_bi, composer1, 0), null, null, null, null, 0.0f, null, composer1, 56, 0x7C);
            String s = StringResources_androidKt.stringResource(string.label_login_your_story_can_become_a_wealth, composer1, 0);
            TextStyle textStyle0 = TextStyle.copy-p1EtxEg$default(TypeKt.getTypography().getH5(), ColorResources_androidKt.colorResource(color.gray5, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 7.0f, 0.0f, 37.5f, 5, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, textStyle0, composer1, 0x30, 0, 0x1FFFC);
            ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ico_login_main_img, composer1, 0), null, null, null, null, 0.0f, null, composer1, 56, 0x7C);
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
            scopeUpdateScope0.updateScope(new l(this, v));
        }
    }

    public final void a(Modifier modifier0, Context context0, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x8E8E7F30);
        Modifier modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8E8E7F30, v, -1, "com.kakao.tistory.presentation.view.login.KakaoLoginActivity.AccountLoginButton (KakaoLoginActivity.kt:208)");
        }
        BorderStroke borderStroke0 = BorderStrokeKt.BorderStroke-cXLIe8U(0.5f, ColorResources_androidKt.colorResource(color.gray3, composer1, 0));
        Modifier modifier2 = SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.padding-VpY3zN4$default(modifier1, 30.0f, 0.0f, 2, null), 0.0f, 1, null), 48.0f);
        ButtonKt.OutlinedButton(new e(this, context0), modifier2, false, null, null, null, borderStroke0, null, null, ComposableSingletons.KakaoLoginActivityKt.INSTANCE.getLambda-2$presentation_prodRelease(), composer1, 0x30000000, 444);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(this, modifier1, context0, v, v1));
        }
    }

    public static final void access$KakaoLoginScreen(KakaoLoginActivity kakaoLoginActivity0, Composer composer0, int v) {
        kakaoLoginActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(0x535CFCAE);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x535CFCAE, v, -1, "com.kakao.tistory.presentation.view.login.KakaoLoginActivity.KakaoLoginScreen (KakaoLoginActivity.kt:88)");
        }
        Object object0 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        String s = StringResources_androidKt.stringResource(string.find_tistory_account_url, composer1, 0);
        State state0 = LiveDataAdapterKt.observeAsState(((KakaoLoginViewModel)kakaoLoginActivity0.k.getValue()).isHideTistoryLoginButton(), Boolean.FALSE, composer1, 56);
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = ScrollKt.verticalScroll$default(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), ColorResources_androidKt.colorResource(color.white, composer1, 0), null, 2, null), ScrollKt.rememberScrollState(0, composer1, 0, 1), false, null, false, 14, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer1, 0x30);
        int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
        if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
            d.a(v1, composer1, v1, function20);
        }
        Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
        SpacerKt.Spacer(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        kakaoLoginActivity0.a(composer1, 8);
        SpacerKt.Spacer(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        kakaoLoginActivity0.a(((Context)object0), composer1, 72);
        kakaoLoginActivity0.a(PaddingKt.padding-qDBjuR0$default(modifier$Companion0, 0.0f, 0.0f, 0.0f, 12.5f, 7, null), ((Context)object0), composer1, 582, 0);
        composer1.startReplaceGroup(0x4FD53017);
        if(!((Boolean)state0.getValue()).booleanValue()) {
            kakaoLoginActivity0.a(string.label_login_cannot_find_my_tistory_account, new i(kakaoLoginActivity0, s), composer1, 0x200);
            kakaoLoginActivity0.a(string.label_login_have_you_signed_up_with_tistory_acount, new j(kakaoLoginActivity0), composer1, 0x200);
        }
        composer1.endReplaceGroup();
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 50.0f), composer1, 6);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(kakaoLoginActivity0, v));
        }
    }

    // 去混淆评级： 低(20)
    public static final String access$getIS_TISTORY_LOGIN$cp() [...] // 潜在的解密器

    public static final KakaoLoginViewModel access$getKakaoLoginViewModel(KakaoLoginActivity kakaoLoginActivity0) {
        return (KakaoLoginViewModel)kakaoLoginActivity0.k.getValue();
    }

    @Override  // com.kakao.android.base.ui.BaseActivity
    public int getLayoutResourceId() {
        return this.j;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.overridePendingTransition(anim.nothing, androidx.navigation.ui.R.anim.nav_default_exit_anim);
        String s = null;
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(0xC88EC5F0, true, new x(this)), 1, null);
        if(this.getIntent().getBooleanExtra("IS_TISTORY_LOGIN", false)) {
            KakaoLoginViewModel.goTistoryLogin$default(((KakaoLoginViewModel)this.k.getValue()), false, 1, null);
        }
        else {
            KakaoLoginViewModel kakaoLoginViewModel0 = (KakaoLoginViewModel)this.k.getValue();
            Intent intent0 = this.getIntent();
            if(intent0 != null) {
                Uri uri0 = intent0.getData();
                if(uri0 != null) {
                    s = uri0.toString();
                }
            }
            kakaoLoginViewModel0.setRedirectUrl(s);
        }
        KakaoLoginViewModel kakaoLoginViewModel1 = (KakaoLoginViewModel)this.k.getValue();
        LiveDataExtensionKt.observeEvent(kakaoLoginViewModel1.getShowRegulationErrorEvent(), this, new o(this));
        LiveDataExtensionKt.observeEvent(kakaoLoginViewModel1.getShowErrorDialog(), this, new q(this));
        LiveDataExtensionKt.observeEvent(kakaoLoginViewModel1.getLoginNavigator(), this, new t(this, kakaoLoginViewModel1));
        LiveDataExtensionKt.observeEvent(kakaoLoginViewModel1.getGoToSignUp(), this, new u(this));
        LiveDataExtensionKt.observeEvent(kakaoLoginViewModel1.getGoToDuplicateEmail(), this, new v(this));
    }
}

