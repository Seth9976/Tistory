package com.kakao.tistory.presentation.view.webview;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.NestedScrollingChild2;
import com.kakao.tistory.presentation.common.Logger;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0017\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u007F2\u00020\u00012\u00020\u0002:\u0001\u007FB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006B\u001B\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u00A2\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0004\b\u0005\u0010\fJ\u001D\u0010\u0011\u001A\u00020\u00102\u000E\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u000E\u0018\u00010\r\u00A2\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001A\u00020\u0013\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001A\u00020\u00132\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001E\u001A\u00020\u00102\u0006\u0010\u001A\u001A\u00020\n2\u0006\u0010\u001B\u001A\u00020\n2\u0006\u0010\u001C\u001A\u00020\n2\u0006\u0010\u001D\u001A\u00020\nH\u0014\u00A2\u0006\u0004\b\u001E\u0010\u001FJ2\u0010&\u001A\u00020\u00102#\u0010%\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010!\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00100 \u00A2\u0006\u0004\b&\u0010\'J2\u0010(\u001A\u00020\u00102#\u0010%\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010!\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00100 \u00A2\u0006\u0004\b(\u0010\'J0\u0010)\u001A\u00020\u00102!\u0010%\u001A\u001D\u0012\u0013\u0012\u00110!\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00100 \u00A2\u0006\u0004\b)\u0010\'J\u0015\u0010+\u001A\u00020\u00102\u0006\u0010*\u001A\u00020\u0013\u00A2\u0006\u0004\b+\u0010,J\u0017\u0010-\u001A\u00020\u00102\u0006\u0010$\u001A\u00020!H\u0016\u00A2\u0006\u0004\b-\u0010.J+\u0010-\u001A\u00020\u00102\u0006\u0010$\u001A\u00020!2\u0012\u00100\u001A\u000E\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0/H\u0016\u00A2\u0006\u0004\b-\u00101J\u000F\u00102\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b2\u00103J\u000F\u00104\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b4\u0010\u0015J\u000F\u00105\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b5\u00103J\u000F\u00106\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b6\u0010\u0015J\u000F\u00107\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b7\u00103J\u0011\u00108\u001A\u0004\u0018\u00010!H\u0016\u00A2\u0006\u0004\b8\u00109J\u0017\u0010;\u001A\u00020\u00102\u0006\u0010:\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b;\u0010,J\u000F\u0010<\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b<\u0010\u0015J\u000F\u0010=\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b=\u0010\u0015J\u0017\u0010=\u001A\u00020\u00132\u0006\u0010>\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b=\u0010?J\u0017\u0010A\u001A\u00020\u00132\u0006\u0010@\u001A\u00020\nH\u0016\u00A2\u0006\u0004\bA\u0010?J\u001F\u0010A\u001A\u00020\u00132\u0006\u0010@\u001A\u00020\n2\u0006\u0010>\u001A\u00020\nH\u0016\u00A2\u0006\u0004\bA\u0010BJ\u000F\u0010C\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\bC\u00103J\u0017\u0010C\u001A\u00020\u00102\u0006\u0010>\u001A\u00020\nH\u0016\u00A2\u0006\u0004\bC\u0010DJ3\u0010J\u001A\u00020\u00132\u0006\u0010E\u001A\u00020\n2\u0006\u0010F\u001A\u00020\n2\b\u0010H\u001A\u0004\u0018\u00010G2\b\u0010I\u001A\u0004\u0018\u00010GH\u0016\u00A2\u0006\u0004\bJ\u0010KJ;\u0010J\u001A\u00020\u00132\u0006\u0010E\u001A\u00020\n2\u0006\u0010F\u001A\u00020\n2\b\u0010H\u001A\u0004\u0018\u00010G2\b\u0010I\u001A\u0004\u0018\u00010G2\u0006\u0010>\u001A\u00020\nH\u0016\u00A2\u0006\u0004\bJ\u0010LJ9\u0010Q\u001A\u00020\u00132\u0006\u0010M\u001A\u00020\n2\u0006\u0010N\u001A\u00020\n2\u0006\u0010O\u001A\u00020\n2\u0006\u0010P\u001A\u00020\n2\b\u0010I\u001A\u0004\u0018\u00010GH\u0016\u00A2\u0006\u0004\bQ\u0010RJA\u0010Q\u001A\u00020\u00132\u0006\u0010M\u001A\u00020\n2\u0006\u0010N\u001A\u00020\n2\u0006\u0010O\u001A\u00020\n2\u0006\u0010P\u001A\u00020\n2\b\u0010I\u001A\u0004\u0018\u00010G2\u0006\u0010>\u001A\u00020\nH\u0016\u00A2\u0006\u0004\bQ\u0010SJ\u001F\u0010W\u001A\u00020\u00132\u0006\u0010U\u001A\u00020T2\u0006\u0010V\u001A\u00020TH\u0016\u00A2\u0006\u0004\bW\u0010XJ\'\u0010Y\u001A\u00020\u00132\u0006\u0010U\u001A\u00020T2\u0006\u0010V\u001A\u00020T2\u0006\u0010H\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\bY\u0010ZR\u001B\u0010`\u001A\u00020[8BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b\\\u0010]\u001A\u0004\b^\u0010_R\u001B\u0010e\u001A\u00020a8BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\bb\u0010]\u001A\u0004\bc\u0010dR@\u0010m\u001A \u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100f8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bg\u0010h\u001A\u0004\bi\u0010j\"\u0004\bk\u0010lR(\u0010u\u001A\b\u0012\u0004\u0012\u00020\u00100n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bo\u0010p\u001A\u0004\bq\u0010r\"\u0004\bs\u0010tR(\u0010y\u001A\b\u0012\u0004\u0012\u00020\u00100n8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bv\u0010p\u001A\u0004\bw\u0010r\"\u0004\bx\u0010tR\u001B\u0010~\u001A\u00020z8BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b{\u0010]\u001A\u0004\b|\u0010}\u00A8\u0006\u0080\u0001"}, d2 = {"Lcom/kakao/tistory/presentation/view/webview/CommonWebView;", "Landroid/webkit/WebView;", "Landroidx/core/view/NestedScrollingChild2;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Landroid/net/Uri;", "uris", "", "onFileSelected", "(Ljava/util/List;)V", "", "onBackPressed", "()Z", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "scrollX", "scrollY", "oldScrollX", "oldScrollY", "onScrollChanged", "(IIII)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "url", "callback", "setOnPageStartedCallback", "(Lkotlin/jvm/functions/Function1;)V", "setOnPageFinishedCallback", "setOnShouldOverrideUrlCallback", "redirectEnabled", "setRedirectEnabled", "(Z)V", "loadUrl", "(Ljava/lang/String;)V", "", "additionalHttpHeaders", "(Ljava/lang/String;Ljava/util/Map;)V", "goBack", "()V", "canGoBack", "goForward", "canGoForward", "reload", "getUrl", "()Ljava/lang/String;", "enabled", "setNestedScrollingEnabled", "isNestedScrollingEnabled", "hasNestedScrollingParent", "type", "(I)Z", "axes", "startNestedScroll", "(II)Z", "stopNestedScroll", "(I)V", "dx", "dy", "", "consumed", "offsetInWindow", "dispatchNestedPreScroll", "(II[I[I)Z", "(II[I[II)Z", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "dispatchNestedScroll", "(IIII[I)Z", "(IIII[II)Z", "", "velocityX", "velocityY", "dispatchNestedPreFling", "(FF)Z", "dispatchNestedFling", "(FFZ)Z", "Lcom/kakao/tistory/presentation/view/webview/CommonWebViewClient;", "a", "Lkotlin/Lazy;", "getCommonWebViewClient", "()Lcom/kakao/tistory/presentation/view/webview/CommonWebViewClient;", "commonWebViewClient", "Lcom/kakao/tistory/presentation/view/webview/CommonFullScreenWebChromeClient;", "b", "getCommonWebChromeClient", "()Lcom/kakao/tistory/presentation/view/webview/CommonFullScreenWebChromeClient;", "commonWebChromeClient", "Lkotlin/Function4;", "c", "Lkotlin/jvm/functions/Function4;", "getScrollChangedListener", "()Lkotlin/jvm/functions/Function4;", "setScrollChangedListener", "(Lkotlin/jvm/functions/Function4;)V", "scrollChangedListener", "Lkotlin/Function0;", "d", "Lkotlin/jvm/functions/Function0;", "getOnClose", "()Lkotlin/jvm/functions/Function0;", "setOnClose", "(Lkotlin/jvm/functions/Function0;)V", "onClose", "e", "getOnShowFileChooser", "setOnShowFileChooser", "onShowFileChooser", "Lcom/kakao/tistory/presentation/view/webview/WebViewNestedScrollingHelper;", "f", "getNestedScrollingHelper", "()Lcom/kakao/tistory/presentation/view/webview/WebViewNestedScrollingHelper;", "nestedScrollingHelper", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommonWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonWebView.kt\ncom/kakao/tistory/presentation/view/webview/CommonWebView\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,266:1\n37#2,2:267\n*S KotlinDebug\n*F\n+ 1 CommonWebView.kt\ncom/kakao/tistory/presentation/view/webview/CommonWebView\n*L\n96#1:267,2\n*E\n"})
public final class CommonWebView extends WebView implements NestedScrollingChild2 {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/webview/CommonWebView$Companion;", "", "", "USER_AGENT_KEY", "Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final Lazy a;
    public final Lazy b;
    public Function4 c;
    public Function0 d;
    public Function0 e;
    public final Lazy f;
    public static final String g;

    static {
        CommonWebView.Companion = new Companion(null);
        CommonWebView.$stable = 8;
        CommonWebView.g = "Tistory/3.0.8_3080;APP_AND";
    }

    public CommonWebView(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.a = c.lazy(new j(this));
        this.b = c.lazy(new i(this));
        this.c = o.a;
        this.d = m.a;
        this.e = n.a;
        this.f = c.lazy(new l(this));
        CommonWebViewClient commonWebViewClient0 = this.getCommonWebViewClient();
        commonWebViewClient0.setOnClose(new g(this));
        this.setWebViewClient(commonWebViewClient0);
        CommonFullScreenWebChromeClient commonFullScreenWebChromeClient0 = this.getCommonWebChromeClient();
        commonFullScreenWebChromeClient0.setShowFileChooser(new h(this));
        this.setWebChromeClient(commonFullScreenWebChromeClient0);
        if((this.getContext().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setUserAgentString("Tistory/3.0.8_3080;APP_AND;" + webSettings0.getUserAgentString());
        String s = webSettings0.getUserAgentString();
        Logger.INSTANCE.log("CommonWebView userAgent=" + s);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(false);
        webSettings0.setSupportZoom(true);
        webSettings0.setBuiltInZoomControls(true);
        webSettings0.setDisplayZoomControls(false);
        webSettings0.setTextZoom(100);
        webSettings0.setUseWideViewPort(true);
        webSettings0.setLoadWithOverviewMode(true);
        webSettings0.setMixedContentMode(0);
        webSettings0.setSupportMultipleWindows(false);
    }

    public CommonWebView(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0);
        this.a = c.lazy(new j(this));
        this.b = c.lazy(new i(this));
        this.c = o.a;
        this.d = m.a;
        this.e = n.a;
        this.f = c.lazy(new l(this));
        CommonWebViewClient commonWebViewClient0 = this.getCommonWebViewClient();
        commonWebViewClient0.setOnClose(new g(this));
        this.setWebViewClient(commonWebViewClient0);
        CommonFullScreenWebChromeClient commonFullScreenWebChromeClient0 = this.getCommonWebChromeClient();
        commonFullScreenWebChromeClient0.setShowFileChooser(new h(this));
        this.setWebChromeClient(commonFullScreenWebChromeClient0);
        if((this.getContext().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setUserAgentString("Tistory/3.0.8_3080;APP_AND;" + webSettings0.getUserAgentString());
        String s = webSettings0.getUserAgentString();
        Logger.INSTANCE.log("CommonWebView userAgent=" + s);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(false);
        webSettings0.setSupportZoom(true);
        webSettings0.setBuiltInZoomControls(true);
        webSettings0.setDisplayZoomControls(false);
        webSettings0.setTextZoom(100);
        webSettings0.setUseWideViewPort(true);
        webSettings0.setLoadWithOverviewMode(true);
        webSettings0.setMixedContentMode(0);
        webSettings0.setSupportMultipleWindows(false);
    }

    public CommonWebView(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        this.a = c.lazy(new j(this));
        this.b = c.lazy(new i(this));
        this.c = o.a;
        this.d = m.a;
        this.e = n.a;
        this.f = c.lazy(new l(this));
        CommonWebViewClient commonWebViewClient0 = this.getCommonWebViewClient();
        commonWebViewClient0.setOnClose(new g(this));
        this.setWebViewClient(commonWebViewClient0);
        CommonFullScreenWebChromeClient commonFullScreenWebChromeClient0 = this.getCommonWebChromeClient();
        commonFullScreenWebChromeClient0.setShowFileChooser(new h(this));
        this.setWebChromeClient(commonFullScreenWebChromeClient0);
        if((this.getContext().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        WebSettings webSettings0 = this.getSettings();
        webSettings0.setUserAgentString("Tistory/3.0.8_3080;APP_AND;" + webSettings0.getUserAgentString());
        String s = webSettings0.getUserAgentString();
        Logger.INSTANCE.log("CommonWebView userAgent=" + s);
        webSettings0.setDomStorageEnabled(true);
        webSettings0.setJavaScriptEnabled(true);
        webSettings0.setJavaScriptCanOpenWindowsAutomatically(false);
        webSettings0.setSupportZoom(true);
        webSettings0.setBuiltInZoomControls(true);
        webSettings0.setDisplayZoomControls(false);
        webSettings0.setTextZoom(100);
        webSettings0.setUseWideViewPort(true);
        webSettings0.setLoadWithOverviewMode(true);
        webSettings0.setMixedContentMode(0);
        webSettings0.setSupportMultipleWindows(false);
    }

    @Override  // android.webkit.WebView
    public boolean canGoBack() {
        boolean z = this.canGoBack();
        Logger.INSTANCE.log("canGoBack() : " + z);
        return super.canGoBack();
    }

    @Override  // android.webkit.WebView
    public boolean canGoForward() {
        boolean z = this.canGoForward();
        Logger.INSTANCE.log("canGoForward() : " + z);
        return super.canGoForward();
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean dispatchNestedFling(float f, float f1, boolean z) {
        return this.getNestedScrollingHelper().dispatchNestedFling(f, f1, z);
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean dispatchNestedPreFling(float f, float f1) {
        return this.getNestedScrollingHelper().dispatchNestedPreFling(f, f1);
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean dispatchNestedPreScroll(int v, int v1, @Nullable int[] arr_v, @Nullable int[] arr_v1) {
        return this.getNestedScrollingHelper().dispatchNestedPreScroll(v, v1, arr_v, arr_v1);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int v, int v1, @Nullable int[] arr_v, @Nullable int[] arr_v1, int v2) {
        return this.getNestedScrollingHelper().dispatchNestedPreScroll(v, v1, arr_v, arr_v1, v2);
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, @Nullable int[] arr_v) {
        return this.getNestedScrollingHelper().dispatchNestedScroll(v, v1, v2, v3, arr_v);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int v, int v1, int v2, int v3, @Nullable int[] arr_v, int v4) {
        return this.getNestedScrollingHelper().dispatchNestedScroll(v, v1, v2, v3, arr_v, v4);
    }

    private final CommonFullScreenWebChromeClient getCommonWebChromeClient() {
        return (CommonFullScreenWebChromeClient)this.b.getValue();
    }

    private final CommonWebViewClient getCommonWebViewClient() {
        return (CommonWebViewClient)this.a.getValue();
    }

    private final WebViewNestedScrollingHelper getNestedScrollingHelper() {
        return (WebViewNestedScrollingHelper)this.f.getValue();
    }

    @NotNull
    public final Function0 getOnClose() {
        return this.d;
    }

    @NotNull
    public final Function0 getOnShowFileChooser() {
        return this.e;
    }

    @NotNull
    public final Function4 getScrollChangedListener() {
        return this.c;
    }

    @Override  // android.webkit.WebView
    @Nullable
    public String getUrl() {
        String s = super.getUrl();
        Logger.INSTANCE.log("getUrl() : url=" + s);
        return super.getUrl();
    }

    @Override  // android.webkit.WebView
    public void goBack() {
        Logger.INSTANCE.log("goBack()");
        super.goBack();
    }

    @Override  // android.webkit.WebView
    public void goForward() {
        Logger.INSTANCE.log("goForward()");
        super.goForward();
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean hasNestedScrollingParent() {
        return this.getNestedScrollingHelper().hasNestedScrollingParent();
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int v) {
        return this.getNestedScrollingHelper().hasNestedScrollingParent(v);
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.getNestedScrollingHelper().isNestedScrollingEnabled();
    }

    @Override  // android.webkit.WebView
    public void loadUrl(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "url");
        Logger.INSTANCE.log("loadUrl() : url=" + s);
        super.loadUrl(s);
    }

    @Override  // android.webkit.WebView
    public void loadUrl(@NotNull String s, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(s, "url");
        Intrinsics.checkNotNullParameter(map0, "additionalHttpHeaders");
        Logger.INSTANCE.log("loadUrl() : url=" + s + ", additionalHeaders=" + map0);
        super.loadUrl(s, map0);
    }

    public final boolean onBackPressed() {
        return this.getCommonWebChromeClient().onBackPressed();
    }

    public final void onFileSelected(@Nullable List list0) {
        this.getCommonWebChromeClient().onFileSelected((list0 == null ? null : ((Uri[])list0.toArray(new Uri[0]))));
    }

    @Override  // android.webkit.WebView
    public void onScrollChanged(int v, int v1, int v2, int v3) {
        super.onScrollChanged(v, v1, v2, v3);
        this.c.invoke(v, v1, v2, v3);
    }

    @Override  // android.webkit.WebView
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent0) {
        if(motionEvent0 == null) {
            return super.onTouchEvent(null);
        }
        this.requestDisallowInterceptTouchEvent(true);
        return this.getNestedScrollingHelper().onTouchEvent(motionEvent0);
    }

    @Override  // android.webkit.WebView
    public void reload() {
        Logger.INSTANCE.log("reload()");
        super.reload();
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.getNestedScrollingHelper().setNestedScrollingEnabled(z);
    }

    public final void setOnClose(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "<set-?>");
        this.d = function00;
    }

    public final void setOnPageFinishedCallback(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "callback");
        this.getCommonWebViewClient().setOnPageFinishedCallback(function10);
    }

    public final void setOnPageStartedCallback(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "callback");
        this.getCommonWebViewClient().setOnPageStartedCallback(function10);
    }

    public final void setOnShouldOverrideUrlCallback(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "callback");
        this.getCommonWebViewClient().setOnShouldOverrideUrlCallback(function10);
    }

    public final void setOnShowFileChooser(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "<set-?>");
        this.e = function00;
    }

    public final void setRedirectEnabled(boolean z) {
        this.getCommonWebViewClient().setRedirectEnabled(z);
    }

    public final void setScrollChangedListener(@NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(function40, "<set-?>");
        this.c = function40;
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public boolean startNestedScroll(int v) {
        return this.getNestedScrollingHelper().startNestedScroll(v);
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int v, int v1) {
        return this.getNestedScrollingHelper().startNestedScroll(v, v1);
    }

    @Override  // androidx.core.view.NestedScrollingChild, android.view.View
    public void stopNestedScroll() {
        this.getNestedScrollingHelper().stopNestedScroll();
    }

    @Override  // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int v) {
        this.getNestedScrollingHelper().stopNestedScroll(v);
    }
}

