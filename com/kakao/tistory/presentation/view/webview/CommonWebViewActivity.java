package com.kakao.tistory.presentation.view.webview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.SettingItem;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.databinding.ActivityCommonWebViewBinding;
import com.kakao.tistory.presentation.viewmodel.CommonWebViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rc.a;
import rc.b;
import rc.c;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001A\u00020\u00072\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000F\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0004R\u001A\u0010\u0016\u001A\u00020\n8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/view/webview/CommonWebViewActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryActivity;", "Lcom/kakao/tistory/presentation/databinding/ActivityCommonWebViewBinding;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroy", "j", "I", "getLayoutResourceId", "()I", "layoutResourceId", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommonWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonWebViewActivity.kt\ncom/kakao/tistory/presentation/view/webview/CommonWebViewActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,178:1\n10#2,2:179\n1#3:181\n1#3:195\n75#4,13:182\n*S KotlinDebug\n*F\n+ 1 CommonWebViewActivity.kt\ncom/kakao/tistory/presentation/view/webview/CommonWebViewActivity\n*L\n43#1:179,2\n43#1:181\n43#1:182,13\n*E\n"})
public final class CommonWebViewActivity extends Hilt_CommonWebViewActivity {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001A\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Lcom/kakao/tistory/presentation/view/webview/CommonWebViewActivity$Companion;", "", "", "EXTRA_WEB_VIEW_APP_BAR_ENABLED", "Ljava/lang/String;", "EXTRA_WEB_VIEW_BOTTOM_BAR_ENABLED", "EXTRA_WEB_VIEW_CHECK_SESSION", "EXTRA_WEB_VIEW_SETTING_ITEM", "EXTRA_WEB_VIEW_URL", "", "FILE_CHOOSER_RESULT_CODE", "I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_WEB_VIEW_APP_BAR_ENABLED = "EXTRA_WEB_VIEW_APP_BAR_ENABLED";
    @NotNull
    public static final String EXTRA_WEB_VIEW_BOTTOM_BAR_ENABLED = "EXTRA_WEB_VIEW_BOTTOM_BAR_ENABLED";
    @NotNull
    public static final String EXTRA_WEB_VIEW_CHECK_SESSION = "EXTRA_WEB_VIEW_CHECK_SESSION";
    @NotNull
    public static final String EXTRA_WEB_VIEW_SETTING_ITEM = "EXTRA_WEB_VIEW_SETTING_ITEM";
    @NotNull
    public static final String EXTRA_WEB_VIEW_URL = "EXTRA_WEB_VIEW_URL";
    public static final int FILE_CHOOSER_RESULT_CODE = 2400;
    public final int j;
    public final BaseViewModelLazy k;
    public String l;
    public boolean m;
    public boolean n;
    public boolean o;

    static {
        CommonWebViewActivity.Companion = new Companion(null);
        CommonWebViewActivity.$stable = 8;
    }

    public CommonWebViewActivity() {
        this.j = layout.activity_common_web_view;
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.k = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(CommonWebViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        this.n = true;
        this.o = true;
    }

    public static final void a(CommonWebViewActivity commonWebViewActivity0, View view0) {
        Intrinsics.checkNotNullParameter(commonWebViewActivity0, "this$0");
        CommonWebViewModel commonWebViewModel0 = (CommonWebViewModel)commonWebViewActivity0.k.getValue();
        CommonWebView commonWebView0 = ((ActivityCommonWebViewBinding)commonWebViewActivity0.getDataBinding()).commonWebView;
        Intrinsics.checkNotNullExpressionValue(commonWebView0, "commonWebView");
        commonWebViewModel0.onClickWebViewForwardButton(commonWebView0);
    }

    public static final void a(CommonWebViewActivity commonWebViewActivity0, String s, String s1, String s2, String s3, long v) {
        Intrinsics.checkNotNullParameter(commonWebViewActivity0, "this$0");
        Intrinsics.checkNotNull(s);
        NavigatorExtensionKt.goToBrowser(commonWebViewActivity0, s);
        commonWebViewActivity0.finish();
    }

    public static final void a(Boolean boolean0) {
    }

    public final void a(String s) {
        String s1 = ((CommonWebViewModel)this.k.getValue()).getWebSessionCookie();
        CookieManager cookieManager0 = CookieManager.getInstance();
        Logger logger0 = Logger.INSTANCE;
        logger0.log("loadWebView() : before Cookie=" + cookieManager0.getCookie(s));
        cookieManager0.setAcceptCookie(true);
        cookieManager0.setAcceptThirdPartyCookies(((ActivityCommonWebViewBinding)this.getDataBinding()).commonWebView, true);
        if(s1 != null) {
            cookieManager0.setCookie(this.getString(string.app_host_cookie), s1);
        }
        logger0.log("loadWebView() : after Cookie=" + CookieManager.getInstance().getCookie(s));
        ((ActivityCommonWebViewBinding)this.getDataBinding()).commonWebView.loadUrl(s);
    }

    public static final CommonWebViewModel access$getCommonWebViewModel(CommonWebViewActivity commonWebViewActivity0) {
        return (CommonWebViewModel)commonWebViewActivity0.k.getValue();
    }

    public static final void b(CommonWebViewActivity commonWebViewActivity0, View view0) {
        Intrinsics.checkNotNullParameter(commonWebViewActivity0, "this$0");
        CommonWebViewModel commonWebViewModel0 = (CommonWebViewModel)commonWebViewActivity0.k.getValue();
        CommonWebView commonWebView0 = ((ActivityCommonWebViewBinding)commonWebViewActivity0.getDataBinding()).commonWebView;
        Intrinsics.checkNotNullExpressionValue(commonWebView0, "commonWebView");
        commonWebViewModel0.onClickWebViewReloadButton(commonWebView0);
    }

    public final void b() {
        ((ActivityCommonWebViewBinding)this.getDataBinding()).webViewNavigationCloseButton.setOnClickListener(new c(this, 0));
        ((ActivityCommonWebViewBinding)this.getDataBinding()).webViewNavigationBackButton.setOnClickListener(new c(this, 1));
        ((ActivityCommonWebViewBinding)this.getDataBinding()).webViewNavigationForwardButton.setOnClickListener(new c(this, 2));
        ((ActivityCommonWebViewBinding)this.getDataBinding()).webViewNavigationReloadButton.setOnClickListener(new c(this, 3));
        ((ActivityCommonWebViewBinding)this.getDataBinding()).webViewNavigationShareButton.setOnClickListener(new c(this, 4));
    }

    public static final void c(CommonWebViewActivity commonWebViewActivity0, View view0) {
        Intrinsics.checkNotNullParameter(commonWebViewActivity0, "this$0");
        CommonWebViewModel commonWebViewModel0 = (CommonWebViewModel)commonWebViewActivity0.k.getValue();
        CommonWebView commonWebView0 = ((ActivityCommonWebViewBinding)commonWebViewActivity0.getDataBinding()).commonWebView;
        Intrinsics.checkNotNullExpressionValue(commonWebView0, "commonWebView");
        commonWebViewModel0.onClickWebViewShareButton(commonWebView0);
    }

    public final void c() {
        CommonWebView commonWebView0 = ((ActivityCommonWebViewBinding)this.getDataBinding()).commonWebView;
        commonWebView0.setOnShowFileChooser(new s(this));
        commonWebView0.setDownloadListener(new a(this));
        commonWebView0.setOnClose(new t(this));
        commonWebView0.setOnPageStartedCallback(new u(this));
        commonWebView0.setOnPageFinishedCallback(new v(this));
    }

    public static final void d(CommonWebViewActivity commonWebViewActivity0, View view0) {
        Intrinsics.checkNotNullParameter(commonWebViewActivity0, "this$0");
        ((CommonWebViewModel)commonWebViewActivity0.k.getValue()).onClickWebViewCloseButton();
    }

    public static final void e(CommonWebViewActivity commonWebViewActivity0, View view0) {
        Intrinsics.checkNotNullParameter(commonWebViewActivity0, "this$0");
        CommonWebViewModel commonWebViewModel0 = (CommonWebViewModel)commonWebViewActivity0.k.getValue();
        CommonWebView commonWebView0 = ((ActivityCommonWebViewBinding)commonWebViewActivity0.getDataBinding()).commonWebView;
        Intrinsics.checkNotNullExpressionValue(commonWebView0, "commonWebView");
        commonWebViewModel0.onClickWebViewBackButton(commonWebView0);
    }

    @Override  // com.kakao.android.base.ui.BaseActivity
    public int getLayoutResourceId() {
        return this.j;
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        List list0;
        if(v == 2400) {
            if(intent0 == null) {
                list0 = null;
            }
            else {
                Uri uri0 = intent0.getData();
                list0 = uri0 == null ? null : k.listOf(uri0);
            }
            ((ActivityCommonWebViewBinding)this.getDataBinding()).commonWebView.onFileSelected(list0);
        }
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    public void onCreate(@Nullable Bundle bundle0) {
        Unit unit1;
        Intent intent0 = this.getIntent();
        Unit unit0 = null;
        if(intent0 == null) {
            unit1 = null;
        }
        else {
            Bundle bundle1 = intent0.getExtras();
            if(bundle1 == null) {
                unit1 = null;
            }
            else {
                Serializable serializable0 = bundle1.getSerializable("EXTRA_WEB_VIEW_SETTING_ITEM");
                SettingItem settingItem0 = serializable0 instanceof SettingItem ? ((SettingItem)serializable0) : null;
                if(settingItem0 != null) {
                    this.setSection("설정");
                    String s = settingItem0.getTiaraPageType();
                    if(s == null) {
                        s = "미정";
                    }
                    this.setPage(s);
                    this.l = settingItem0.getUrl();
                }
                String s1 = this.l;
                if(s1 == null) {
                    s1 = bundle1.getString("EXTRA_WEB_VIEW_URL");
                }
                else {
                    if(p.isBlank(s1)) {
                        s1 = null;
                    }
                    if(s1 == null) {
                        s1 = bundle1.getString("EXTRA_WEB_VIEW_URL");
                    }
                }
                this.l = s1;
                this.m = bundle1.getBoolean("EXTRA_WEB_VIEW_APP_BAR_ENABLED", this.m);
                this.n = bundle1.getBoolean("EXTRA_WEB_VIEW_BOTTOM_BAR_ENABLED", this.n);
                this.o = bundle1.getBoolean("EXTRA_WEB_VIEW_CHECK_SESSION", true);
                unit1 = Unit.INSTANCE;
            }
        }
        if(unit1 == null) {
            this.finish();
        }
        super.onCreate(bundle0);
        String s2 = this.l;
        if(s2 != null) {
            if(p.isBlank(s2)) {
                s2 = null;
            }
            if(s2 != null) {
                this.c();
                this.b();
                boolean z = this.o;
                boolean z1 = this.m;
                boolean z2 = this.n;
                ((ActivityCommonWebViewBinding)this.getDataBinding()).setLifecycleOwner(this);
                ((ActivityCommonWebViewBinding)this.getDataBinding()).setViewModel(((CommonWebViewModel)this.k.getValue()));
                CommonWebViewModel commonWebViewModel0 = (CommonWebViewModel)this.k.getValue();
                LiveDataExtensionKt.observeEvent(commonWebViewModel0.getShowWebView(), this, new com.kakao.tistory.presentation.view.webview.p(this));
                LiveDataExtensionKt.observeEvent(commonWebViewModel0.getGoToShare(), this, new q(this));
                LiveDataExtensionKt.observeEvent(commonWebViewModel0.getFinishActivity(), this, new r(this));
                commonWebViewModel0.init(s2, z, z1, z2);
                unit0 = Unit.INSTANCE;
            }
        }
        if(unit0 == null) {
            this.finish();
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    public void onDestroy() {
        ((ActivityCommonWebViewBinding)this.getDataBinding()).commonWebView.clearHistory();
        ((ActivityCommonWebViewBinding)this.getDataBinding()).commonWebView.clearCache(true);
        ((ActivityCommonWebViewBinding)this.getDataBinding()).commonWebView.destroy();
        CookieManager.getInstance().removeAllCookies(new b(0));
        super.onDestroy();
    }
}

