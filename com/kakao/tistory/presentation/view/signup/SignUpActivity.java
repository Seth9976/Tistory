package com.kakao.tistory.presentation.view.signup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.view.signup.contract.SignUpUiState;
import com.kakao.tistory.presentation.viewmodel.SignUpViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000B\u001A\u00020\u00062\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\rH\u0017¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0014²\u0006\f\u0010\u0013\u001A\u00020\u00128\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/SignUpActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryComposeActivity;", "<init>", "()V", "Lcom/kakao/android/base/tiara/TiaraListener;", "tiaraListener", "", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/compose/ui/Modifier;", "modifier", "Content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Companion", "Lcom/kakao/tistory/presentation/view/signup/contract/SignUpUiState;", "uiState", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSignUpActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpActivity.kt\ncom/kakao/tistory/presentation/view/signup/SignUpActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,169:1\n10#2,2:170\n1#3:172\n75#4,13:173\n81#5:186\n*S KotlinDebug\n*F\n+ 1 SignUpActivity.kt\ncom/kakao/tistory/presentation/view/signup/SignUpActivity\n*L\n75#1:170,2\n75#1:172\n75#1:173,13\n86#1:186\n*E\n"})
public final class SignUpActivity extends Hilt_SignUpActivity {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001JG\u0010\r\u001A\u00020\f2\u0006\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\t\u001A\u00020\b2\u0010\b\u0002\u0010\u000B\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000ER\u001A\u0010\u000F\u001A\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0013\u001A\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001A\u0004\b\u0014\u0010\u0012R\u001A\u0010\u0015\u001A\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001A\u0004\b\u0016\u0010\u0012R\u001A\u0010\u0017\u001A\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001A\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/view/signup/SignUpActivity$Companion;", "", "Landroid/content/Context;", "context", "Lcom/kakao/sdk/auth/model/OAuthToken;", "token", "", "email", "", "isSignUpEnable", "", "duplicatedEmails", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/kakao/sdk/auth/model/OAuthToken;Ljava/lang/String;ZLjava/util/List;)Landroid/content/Intent;", "EXTRA_EMAIL", "Ljava/lang/String;", "getEXTRA_EMAIL", "()Ljava/lang/String;", "EXTAR_TOKEN", "getEXTAR_TOKEN", "EXTAR_SIGN_UP_ABLE", "getEXTAR_SIGN_UP_ABLE", "EXTRA_DUPLICATED_EMAILS", "getEXTRA_DUPLICATED_EMAILS", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context0, @Nullable OAuthToken oAuthToken0, @Nullable String s, boolean z, @Nullable List list0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intent intent0 = new Intent(context0, SignUpActivity.class);
            intent0.putExtra("EXTAR_TOKEN", oAuthToken0);
            intent0.putExtra("EXTAR_SIGN_UP_ABLE", z);
            intent0.putExtra("EXTRA_EMAIL", s);
            if(list0 != null) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.addAll(list0);
                intent0.putExtra("EXTRA_DUPLICATED_EMAILS", arrayList0);
            }
            return intent0;
        }

        public static Intent createIntent$default(Companion signUpActivity$Companion0, Context context0, OAuthToken oAuthToken0, String s, boolean z, List list0, int v, Object object0) {
            OAuthToken oAuthToken1 = (v & 2) == 0 ? oAuthToken0 : null;
            String s1 = (v & 4) == 0 ? s : null;
            return (v & 16) == 0 ? signUpActivity$Companion0.createIntent(context0, oAuthToken1, s1, z, list0) : signUpActivity$Companion0.createIntent(context0, oAuthToken1, s1, z, null);
        }

        // 去混淆评级： 低(20)
        @NotNull
        public final String getEXTAR_SIGN_UP_ABLE() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        @NotNull
        public final String getEXTAR_TOKEN() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        @NotNull
        public final String getEXTRA_DUPLICATED_EMAILS() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        @NotNull
        public final String getEXTRA_EMAIL() [...] // 潜在的解密器
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final BaseViewModelLazy k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;

    static {
        SignUpActivity.Companion = new Companion(null);
        SignUpActivity.$stable = 8;
        SignUpActivity.l = "EXTRA_EMAIL";
        SignUpActivity.m = "EXTAR_TOKEN";
        SignUpActivity.n = "EXTAR_SIGN_UP_ABLE";
        SignUpActivity.o = "EXTRA_DUPLICATED_EMAILS";
    }

    public SignUpActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.k = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(SignUpViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeActivity
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void Content(@NotNull Modifier modifier0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Composer composer1 = composer0.startRestartGroup(0x70B1E5FD);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x70B1E5FD, v, -1, "com.kakao.tistory.presentation.view.signup.SignUpActivity.Content (SignUpActivity.kt:84)");
        }
        State state0 = SnapshotStateKt.collectAsState(((SignUpViewModel)this.k.getValue()).getUiState(), new SignUpUiState(null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, 0x3FFFF, null), null, composer1, 72, 2);
        ScaffoldKt.Scaffold-27mzLpw(null, null, ComposableLambdaKt.rememberComposableLambda(-643520744, true, new c(state0), composer1, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(0xF339747F, true, new d(this, state0), composer1, 54), composer1, 0x180, 0xC00000, 0x1FFFB);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e(this, modifier0, v));
        }
    }

    public static final SignUpUiState access$Content$lambda$0(State state0) {
        return (SignUpUiState)state0.getValue();
    }

    public static final void access$EventHandler(SignUpActivity signUpActivity0, Flow flow0, Composer composer0, int v) {
        signUpActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(570026945);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(570026945, v, -1, "com.kakao.tistory.presentation.view.signup.SignUpActivity.EventHandler (SignUpActivity.kt:134)");
        }
        EffectsKt.LaunchedEffect(flow0, new h(signUpActivity0, flow0, null), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i(signUpActivity0, flow0, v));
        }
    }

    // 去混淆评级： 低(20)
    public static final String access$getEXTAR_SIGN_UP_ABLE$cp() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final String access$getEXTAR_TOKEN$cp() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final String access$getEXTRA_DUPLICATED_EMAILS$cp() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static final String access$getEXTRA_EMAIL$cp() [...] // 潜在的解密器

    public static final SignUpViewModel access$getSignUpViewModel(SignUpActivity signUpActivity0) {
        return (SignUpViewModel)signUpActivity0.k.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryComposeActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ((SignUpViewModel)this.k.getValue()).initBundle(this.getIntent().getExtras());
        SignUpViewModel signUpViewModel0 = (SignUpViewModel)this.k.getValue();
        LiveDataExtensionKt.observeEvent(signUpViewModel0.getShowErrorDialog(), this, new k(this));
        signUpViewModel0.isShowProgress().observe(this, new n(new l(this)));
        LiveDataExtensionKt.observeEvent(signUpViewModel0.getCompleteSignUp(), this, new m(this));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    public void trackPage(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
    }
}

