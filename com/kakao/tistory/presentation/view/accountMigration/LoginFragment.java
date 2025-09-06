package com.kakao.tistory.presentation.view.accountMigration;

import a;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.fragment.app.FragmentViewModelLazyKt;
import b;
import c;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.tiara.TiaraPage;
import com.kakao.android.base.tiara.TiaraSection;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.theme.ModifierKt;
import com.kakao.tistory.presentation.theme.TypeKt;
import com.kakao.tistory.presentation.viewmodel.MigrationViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import d;
import dagger.hilt.android.AndroidEntryPoint;
import e;
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
@TiaraPage(page = "시작안내")
@TiaraSection(section = "전환하기")
@AndroidEntryPoint
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\t\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0006H\u0007¢\u0006\u0004\b\u000B\u0010\nJ\u001D\u0010\u000E\u001A\u00020\u00062\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00060\fH\u0007¢\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0010\u001A\u00020\u00062\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00060\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000FR\"\u0010\u0018\u001A\u00020\u00118\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001A"}, d2 = {"Lcom/kakao/tistory/presentation/view/accountMigration/LoginFragment;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryComposeFragment;", "<init>", "()V", "Lcom/kakao/android/base/tiara/TiaraListener;", "tiaraListener", "", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "KakaoLoginScreen", "Lkotlin/Function0;", "onClickKakaoLogin", "KakaoAccountDirectButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "KakaoLoginButton", "", "l", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "action", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLoginFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginFragment.kt\ncom/kakao/tistory/presentation/view/accountMigration/LoginFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,142:1\n21#2,4:143\n1#3:147\n172#4,9:148\n77#5:157\n148#6:158\n148#6:195\n148#6:196\n148#6:197\n148#6:241\n148#6:242\n148#6:315\n158#6:316\n85#7:159\n82#7,6:160\n88#7:194\n92#7:201\n78#8,6:166\n85#8,4:181\n89#8,2:191\n93#8:200\n78#8,6:208\n85#8,4:223\n89#8,2:233\n93#8:239\n78#8,6:249\n85#8,4:264\n89#8,2:274\n78#8,6:286\n85#8,4:301\n89#8,2:311\n93#8:319\n93#8:323\n368#9,9:172\n377#9:193\n378#9,2:198\n368#9,9:214\n377#9:235\n378#9,2:237\n368#9,9:255\n377#9:276\n368#9,9:292\n377#9:313\n378#9,2:317\n378#9,2:321\n4032#10,6:185\n4032#10,6:227\n4032#10,6:268\n4032#10,6:305\n71#11:202\n69#11,5:203\n74#11:236\n78#11:240\n71#11:243\n69#11,5:244\n74#11:277\n78#11:324\n98#12:278\n94#12,7:279\n101#12:314\n105#12:320\n*S KotlinDebug\n*F\n+ 1 LoginFragment.kt\ncom/kakao/tistory/presentation/view/accountMigration/LoginFragment\n*L\n39#1:143,4\n39#1:147\n39#1:148,9\n62#1:157\n66#1:158\n69#1:195\n82#1:196\n88#1:197\n114#1:241\n115#1:242\n125#1:315\n130#1:316\n64#1:159\n64#1:160,6\n64#1:194\n64#1:201\n64#1:166,6\n64#1:181,4\n64#1:191,2\n64#1:200\n94#1:208,6\n94#1:223,4\n94#1:233,2\n94#1:239\n111#1:249,6\n111#1:264,4\n111#1:274,2\n122#1:286,6\n122#1:301,4\n122#1:311,2\n122#1:319\n111#1:323\n64#1:172,9\n64#1:193\n64#1:198,2\n94#1:214,9\n94#1:235\n94#1:237,2\n111#1:255,9\n111#1:276\n122#1:292,9\n122#1:313\n122#1:317,2\n111#1:321,2\n64#1:185,6\n94#1:227,6\n111#1:268,6\n122#1:305,6\n94#1:202\n94#1:203,5\n94#1:236\n94#1:240\n111#1:243\n111#1:244,5\n111#1:277\n111#1:324\n122#1:278\n122#1:279,7\n122#1:314\n122#1:320\n*E\n"})
public final class LoginFragment extends Hilt_LoginFragment {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/accountMigration/LoginFragment$Companion;", "", "Lcom/kakao/tistory/presentation/view/accountMigration/LoginFragment;", "newInstance", "()Lcom/kakao/tistory/presentation/view/accountMigration/LoginFragment;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final LoginFragment newInstance() {
            return new LoginFragment();
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final BaseViewModelLazy k;
    public String l;

    static {
        LoginFragment.Companion = new Companion(null);
        LoginFragment.$stable = 8;
    }

    public LoginFragment() {
        this.k = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MigrationViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1(this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2(null, this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.3(this)));
        this.l = "전환시작안내_보기";
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-460644633);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-460644633, v, -1, "com.kakao.tistory.presentation.view.accountMigration.LoginFragment.Content (LoginFragment.kt:54)");
        }
        this.KakaoLoginScreen(composer1, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p(this, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void KakaoAccountDirectButton(@NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "onClickKakaoLogin");
        Composer composer1 = composer0.startRestartGroup(863130605);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(863130605, v1, -1, "com.kakao.tistory.presentation.view.accountMigration.LoginFragment.KakaoAccountDirectButton (LoginFragment.kt:92)");
            }
            Modifier modifier0 = ModifierKt.noRippleClickable(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), function00);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_login_directly_enter_kakao_account, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH6(), 0L, 0x141500000L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFD, null), composer1, 0, 0, 0x1FFFE);
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
            scopeUpdateScope0.updateScope(new q(this, function00, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void KakaoLoginButton(@NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "onClickKakaoLogin");
        Composer composer1 = composer0.startRestartGroup(1180505312);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v1 & 11) != 2 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1180505312, v1, -1, "com.kakao.tistory.presentation.view.accountMigration.LoginFragment.KakaoLoginButton (LoginFragment.kt:109)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = ModifierKt.noRippleClickable(BackgroundKt.background-bw27NRU$default(ClipKt.clip(SizeKt.height-3ABfNKs(SizeKt.fillMaxWidth$default(modifier$Companion0, 0.0f, 1, null), 50.0f), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(6.0f)), ColorResources_androidKt.colorResource(color.color_fee500, composer1, 0), null, 2, null), function00);
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                d.a(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            MeasurePolicy measurePolicy1 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), alignment$Companion0.getCenterVertically(), composer1, 0x30);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier$Companion0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                d.a(v3, composer1, v3, function21);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            Modifier modifier3 = SizeKt.size-3ABfNKs(modifier$Companion0, 18.0f);
            ImageKt.Image(PainterResources_androidKt.painterResource(drawable.ic_login_kakao, composer1, 0), null, modifier3, null, null, 0.0f, null, composer1, 440, 120);
            c.a(8.5f, modifier$Companion0, composer1, 6);
            String s = StringResources_androidKt.stringResource(string.label_login_kakao, composer1, 0);
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH5();
            FontWeight fontWeight0 = FontWeight.Companion.getSemiBold();
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(s, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(textStyle0, ColorResources_androidKt.colorResource(color.black, composer1, 0), 0L, fontWeight0, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFA, null), composer1, 0, 0, 0x1FFFE);
            if(e.a(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new r(this, function00, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public final void KakaoLoginScreen(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xFFE4572);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFFE4572, v, -1, "com.kakao.tistory.presentation.view.accountMigration.LoginFragment.KakaoLoginScreen (LoginFragment.kt:59)");
        }
        Context context0 = (Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
        Modifier modifier0 = SizeKt.fillMaxSize$default(PaddingKt.padding-VpY3zN4$default(modifier$Companion0, 20.0f, 0.0f, 2, null), 0.0f, 1, null);
        MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
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
        b.a(22.0f, modifier$Companion0, composer1, 6);
        ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_kakao_migration_login_description, composer1, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TypeKt.getSubtext1(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable)), composer1, 0, 0, 0x1FFFE);
        SpacerKt.Spacer(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, modifier$Companion0, 1.0f, false, 2, null), composer1, 0);
        this.KakaoLoginButton(new s(this, context0), composer1, 0x40);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 12.0f), composer1, 6);
        this.KakaoAccountDirectButton(new t(this, context0), composer1, 0x40);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(modifier$Companion0, 18.0f), composer1, 6);
        composer1.endNode();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(this, v));
        }
    }

    public static final MigrationViewModel access$getMigrationViewModel(LoginFragment loginFragment0) {
        return (MigrationViewModel)loginFragment0.k.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    @NotNull
    public String getAction() {
        return this.l;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    public void setAction(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.l = s;
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeFragment
    public void trackPage(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        if(!((MigrationViewModel)this.k.getValue()).isSendTiaraStartPage()) {
            super.trackPage(tiaraListener0);
            ((MigrationViewModel)this.k.getValue()).setSendTiaraStartPage(true);
        }
    }
}

