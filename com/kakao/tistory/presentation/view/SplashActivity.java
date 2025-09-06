package com.kakao.tistory.presentation.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.h;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelLazy;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import com.kakao.tistory.presentation.viewmodel.SplashViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import fc.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001A\u00020\u00072\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J)\u0010\u0010\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\r\u001A\u00020\u000B2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0016\u001A\u00020\u000B8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/view/SplashActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryActivity;", "Lcom/kakao/tistory/presentation/databinding/ComposeContainerBinding;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "j", "I", "getLayoutResourceId", "()I", "layoutResourceId", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSplashActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashActivity.kt\ncom/kakao/tistory/presentation/view/SplashActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,258:1\n10#2,2:259\n1#3:261\n75#4,13:262\n*S KotlinDebug\n*F\n+ 1 SplashActivity.kt\ncom/kakao/tistory/presentation/view/SplashActivity\n*L\n51#1:259,2\n51#1:261\n51#1:262,13\n*E\n"})
public final class SplashActivity extends Hilt_SplashActivity {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/presentation/view/SplashActivity$Companion;", "", "", "REDIRECT_URL_EXTRA", "Ljava/lang/String;", "", "REQUEST_CODE_UPDATE", "I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int j;
    public final BaseViewModelLazy k;
    public final Lazy l;
    public String m;
    public long n;
    public boolean o;

    static {
        SplashActivity.Companion = new Companion(null);
        SplashActivity.$stable = 8;
    }

    public SplashActivity() {
        this.j = layout.compose_container;
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.k = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(SplashViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        this.l = c.lazy(new com.kakao.tistory.presentation.view.c(this));
        this.n = -1L;
    }

    public static final void a(SplashActivity splashActivity0, Exception exception0) {
        Intrinsics.checkNotNullParameter(splashActivity0, "this$0");
        Intrinsics.checkNotNullParameter(exception0, "it");
        splashActivity0.getClass();
        String s = splashActivity0.getString(string.label_critical_update_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        String s1 = splashActivity0.getString(string.label_critical_update_message);
        String s2 = splashActivity0.getString(string.label_critical_update_button);
        q q0 = new q(splashActivity0);
        TistoryDialog tistoryDialog0 = TistoryDialog.INSTANCE;
        if(s2 == null) {
            s2 = splashActivity0.getString(string.label_dialog_ok);
            Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
        }
        tistoryDialog0.showOk(splashActivity0, s, s1, false, s2, new o(q0), new p(splashActivity0));
    }

    public static final void a(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        function10.invoke(object0);
    }

    public static final boolean a(SplashActivity splashActivity0) {
        Intrinsics.checkNotNullParameter(splashActivity0, "this$0");
        return !splashActivity0.o;
    }

    public static final AppUpdateManager access$getAppUpdateManager(SplashActivity splashActivity0) {
        return (AppUpdateManager)splashActivity0.l.getValue();
    }

    public static final SplashViewModel access$getSplashViewModel(SplashActivity splashActivity0) {
        return (SplashViewModel)splashActivity0.k.getValue();
    }

    public static final void access$showUpdateDialog(SplashActivity splashActivity0) {
        splashActivity0.getClass();
        String s = splashActivity0.getString(string.label_critical_update_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        String s1 = splashActivity0.getString(string.label_critical_update_message);
        String s2 = splashActivity0.getString(string.label_critical_update_button);
        q q0 = new q(splashActivity0);
        TistoryDialog tistoryDialog0 = TistoryDialog.INSTANCE;
        if(s2 == null) {
            s2 = splashActivity0.getString(string.label_dialog_ok);
            Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
        }
        tistoryDialog0.showOk(splashActivity0, s, s1, false, s2, new o(q0), new p(splashActivity0));
    }

    public static final void b(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        function10.invoke(object0);
    }

    public final void b() {
        ((AppUpdateManager)this.l.getValue()).getAppUpdateInfo().addOnSuccessListener(new h(new d(this), 15)).addOnFailureListener(new a(this));
    }

    @Override  // com.kakao.android.base.ui.BaseActivity
    public int getLayoutResourceId() {
        return this.j;
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 1004 && v1 != -1) {
            this.finishAffinity();
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    public void onCreate(@Nullable Bundle bundle0) {
        SplashScreen splashScreen0 = SplashScreen.Companion.installSplashScreen(this);
        super.onCreate(bundle0);
        WindowCompat.setDecorFitsSystemWindows(this.getWindow(), false);
        String s = null;
        ComponentActivityKt.setContent$default(this, null, ComposableSingletons.SplashActivityKt.INSTANCE.getLambda-1$presentation_prodRelease(), 1, null);
        splashScreen0.setKeepOnScreenCondition(new a(this));
        Intent intent0 = this.getIntent();
        if(intent0 == null) {
        label_12:
            Intent intent1 = this.getIntent();
            if(intent1 != null) {
                Uri uri0 = intent1.getData();
                if(uri0 != null) {
                    s = uri0.toString();
                }
            }
        }
        else {
            String s1 = intent0.getStringExtra("link");
            if(s1 != null) {
                s = s1;
                goto label_17;
            }
            goto label_12;
        }
    label_17:
        this.m = s;
        Intent intent2 = this.getIntent();
        long v = intent2 == null ? -1L : intent2.getLongExtra("EXTRA_READ_NOTIFICATION_ID", -1L);
        this.n = v;
        Logger.INSTANCE.log("onCreate redirect=" + this.m + ", notificationId=" + v);
        SplashViewModel splashViewModel0 = (SplashViewModel)this.k.getValue();
        splashViewModel0.init(this.n);
        LiveDataExtensionKt.observeEvent(splashViewModel0.getShowRegulationErrorEvent(), this, new f(this));
        LiveDataExtensionKt.observeEvent(splashViewModel0.getShowAppInfoLoadFailEvent(), this, new com.kakao.tistory.presentation.view.h(this));
        LiveDataExtensionKt.observeEvent(splashViewModel0.getGoToDestinationActivity(), this, new j(this));
        LiveDataExtensionKt.observeEvent(splashViewModel0.getShowErrorDialog(), this, new l(this, splashViewModel0));
        LiveDataExtensionKt.observeEvent(splashViewModel0.getGoToUpdateActivity(), this, new m(this));
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        ((AppUpdateManager)this.l.getValue()).getAppUpdateInfo().addOnSuccessListener(new h(new n(this), 14));
    }
}

