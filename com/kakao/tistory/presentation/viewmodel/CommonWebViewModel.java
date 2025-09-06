package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.domain.repository.SessionRepository;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.view.webview.CommonWebView;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001A\u00020\f2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\b¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000F\u0010\u0010J\r\u0010\u0011\u001A\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\f¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001A\u00020\f2\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001A\u00020\f2\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u0019\u001A\u00020\f2\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001A\u001A\u00020\f2\u0006\u0010\u0015\u001A\u00020\u0014¢\u0006\u0004\b\u001A\u0010\u0017R\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00020\b0\u001B8\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u001D\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\b0\u001B8\u0006¢\u0006\f\n\u0004\b \u0010\u001D\u001A\u0004\b!\u0010\u001FR$\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0010\"\u0004\b%\u0010&R\u001D\u0010+\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060(0\'8F¢\u0006\u0006\u001A\u0004\b)\u0010*R\u001D\u0010-\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060(0\'8F¢\u0006\u0006\u001A\u0004\b,\u0010*R\u001D\u0010/\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0(0\'8F¢\u0006\u0006\u001A\u0004\b.\u0010*¨\u00060"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/CommonWebViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/SessionRepository;)V", "", "url", "", "checkWebSession", "appBarEnabled", "bottomBarEnabled", "", "init", "(Ljava/lang/String;ZZZ)V", "getWebSessionCookie", "()Ljava/lang/String;", "onClickBackButton", "()V", "onClickWebViewCloseButton", "Lcom/kakao/tistory/presentation/view/webview/CommonWebView;", "webView", "onClickWebViewBackButton", "(Lcom/kakao/tistory/presentation/view/webview/CommonWebView;)V", "onClickWebViewForwardButton", "onClickWebViewReloadButton", "onClickWebViewShareButton", "Landroidx/lifecycle/MutableLiveData;", "k", "Landroidx/lifecycle/MutableLiveData;", "getAppBarEnabled", "()Landroidx/lifecycle/MutableLiveData;", "l", "getBottomBarEnabled", "m", "Ljava/lang/String;", "getUrl", "setUrl", "(Ljava/lang/String;)V", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getShowWebView", "()Landroidx/lifecycle/LiveData;", "showWebView", "getGoToShare", "goToShare", "getFinishActivity", "finishActivity", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommonWebViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonWebViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/CommonWebViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
public final class CommonWebViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final SessionRepository g;
    public final MutableLiveData h;
    public final MutableLiveData i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final MutableLiveData l;
    public String m;

    @Inject
    public CommonWebViewModel(@NotNull SessionRepository sessionRepository0) {
        Intrinsics.checkNotNullParameter(sessionRepository0, "sessionRepository");
        super();
        this.g = sessionRepository0;
        this.h = new MutableLiveData();
        this.i = new MutableLiveData();
        this.j = new MutableLiveData();
        this.k = new MutableLiveData();
        this.l = new MutableLiveData();
    }

    @NotNull
    public final MutableLiveData getAppBarEnabled() {
        return this.k;
    }

    @NotNull
    public final MutableLiveData getBottomBarEnabled() {
        return this.l;
    }

    @NotNull
    public final LiveData getFinishActivity() {
        return this.j;
    }

    @NotNull
    public final LiveData getGoToShare() {
        return this.i;
    }

    @NotNull
    public final LiveData getShowWebView() {
        return this.h;
    }

    @Nullable
    public final String getUrl() {
        return this.m;
    }

    @Nullable
    public final String getWebSessionCookie() {
        return this.g.getWebSessionCookie();
    }

    public final void init(@NotNull String s, boolean z, boolean z1, boolean z2) {
        Intrinsics.checkNotNullParameter(s, "url");
        if(s.length() == 0) {
            return;
        }
        this.k.setValue(Boolean.valueOf(z1));
        this.l.setValue(Boolean.valueOf(z2));
        this.m = s;
        if(z) {
            this.isShowProgress().setValue(Boolean.TRUE);
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new p(this, s, null), 3, null);
            return;
        }
        Event event0 = new Event(s);
        this.h.setValue(event0);
    }

    public final void onClickBackButton() {
        Event event0 = new Event(Unit.INSTANCE);
        this.j.setValue(event0);
    }

    public final void onClickWebViewBackButton(@NotNull CommonWebView commonWebView0) {
        Intrinsics.checkNotNullParameter(commonWebView0, "webView");
        commonWebView0.goBack();
    }

    public final void onClickWebViewCloseButton() {
        Event event0 = new Event(Unit.INSTANCE);
        this.j.setValue(event0);
    }

    public final void onClickWebViewForwardButton(@NotNull CommonWebView commonWebView0) {
        Intrinsics.checkNotNullParameter(commonWebView0, "webView");
        commonWebView0.goForward();
    }

    public final void onClickWebViewReloadButton(@NotNull CommonWebView commonWebView0) {
        Intrinsics.checkNotNullParameter(commonWebView0, "webView");
        commonWebView0.reload();
    }

    public final void onClickWebViewShareButton(@NotNull CommonWebView commonWebView0) {
        Intrinsics.checkNotNullParameter(commonWebView0, "webView");
        String s = commonWebView0.getUrl();
        if(s == null) {
            s = this.m;
        }
        if(s != null) {
            Event event0 = new Event(s);
            this.i.setValue(event0);
        }
    }

    public final void setUrl(@Nullable String s) {
        this.m = s;
    }
}

