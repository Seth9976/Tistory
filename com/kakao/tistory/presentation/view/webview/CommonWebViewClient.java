package com.kakao.tistory.presentation.view.webview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.android.base.exception.ConstsKt;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.common.redirect.RedirectData;
import com.kakao.tistory.presentation.common.redirect.RedirectUtils.Type;
import com.kakao.tistory.presentation.common.redirect.RedirectUtils;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001A\u00020\f2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\t\u001A\u0004\u0018\u00010\b2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ#\u0010\u000F\u001A\u00020\f2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0016\u00A2\u0006\u0004\b\u000F\u0010\u0010J%\u0010\u0014\u001A\u0004\u0018\u00010\u00132\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0016\u00A2\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001A\u00020\u00162\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0017\u001A\u00020\u00162\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0019J-\u0010\u001B\u001A\u00020\f2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00112\b\u0010\u001A\u001A\u0004\u0018\u00010\u0013H\u0017\u00A2\u0006\u0004\b\u001B\u0010\u001CJ5\u0010!\u001A\u00020\f2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u001E\u001A\u00020\u001D2\b\u0010\u001F\u001A\u0004\u0018\u00010\b2\b\u0010 \u001A\u0004\u0018\u00010\bH\u0016\u00A2\u0006\u0004\b!\u0010\"J-\u0010!\u001A\u00020\f2\b\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\u0010\u0012\u001A\u0004\u0018\u00010\u00112\b\u0010$\u001A\u0004\u0018\u00010#H\u0017\u00A2\u0006\u0004\b!\u0010%R?\u0010/\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\b\u00A2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f0&8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,\"\u0004\b-\u0010.R?\u00103\u001A\u001F\u0012\u0015\u0012\u0013\u0018\u00010\b\u00A2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f0&8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b0\u0010*\u001A\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u0010:\u001A\u00020\u00168\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b4\u00105\u001A\u0004\b6\u00107\"\u0004\b8\u00109R?\u0010>\u001A\u001F\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f\u0018\u00010&8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b;\u0010*\u001A\u0004\b<\u0010,\"\u0004\b=\u0010.Rk\u0010G\u001AK\u0012\u0013\u0012\u00110\u001D\u00A2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b(\u001E\u0012\u0013\u0012\u00110\b\u00A2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b(@\u0012\u0015\u0012\u0013\u0018\u00010\b\u00A2\u0006\f\b\'\u0012\b\b(\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u0016\u0018\u00010?8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bA\u0010B\u001A\u0004\bC\u0010D\"\u0004\bE\u0010FR(\u0010O\u001A\b\u0012\u0004\u0012\u00020\f0H8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bI\u0010J\u001A\u0004\bK\u0010L\"\u0004\bM\u0010NR.\u0010T\u001A\u000E\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u00160&8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bQ\u0010*\u001A\u0004\bR\u0010,\"\u0004\bS\u0010.\u00A8\u0006U"}, d2 = {"Lcom/kakao/tistory/presentation/view/webview/CommonWebViewClient;", "Landroid/webkit/WebViewClient;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/webkit/WebView;", "view", "", "url", "Landroid/graphics/Bitmap;", "favicon", "", "onPageStarted", "(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "errorResponse", "onReceivedHttpError", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V", "", "errorCode", "description", "failingUrl", "onReceivedError", "(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V", "Landroid/webkit/WebResourceError;", "error", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "b", "Lkotlin/jvm/functions/Function1;", "getOnPageStartedCallback", "()Lkotlin/jvm/functions/Function1;", "setOnPageStartedCallback", "(Lkotlin/jvm/functions/Function1;)V", "onPageStartedCallback", "c", "getOnPageFinishedCallback", "setOnPageFinishedCallback", "onPageFinishedCallback", "d", "Z", "getRedirectEnabled", "()Z", "setRedirectEnabled", "(Z)V", "redirectEnabled", "e", "getOnShouldOverrideUrlCallback", "setOnShouldOverrideUrlCallback", "onShouldOverrideUrlCallback", "Lkotlin/Function3;", "errorDescription", "f", "Lkotlin/jvm/functions/Function3;", "getOnReceivedErrorCallback", "()Lkotlin/jvm/functions/Function3;", "setOnReceivedErrorCallback", "(Lkotlin/jvm/functions/Function3;)V", "onReceivedErrorCallback", "Lkotlin/Function0;", "g", "Lkotlin/jvm/functions/Function0;", "getOnClose", "()Lkotlin/jvm/functions/Function0;", "setOnClose", "(Lkotlin/jvm/functions/Function0;)V", "onClose", "Lcom/kakao/tistory/presentation/common/redirect/RedirectData;", "h", "getOnRedirect", "setOnRedirect", "onRedirect", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommonWebViewClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonWebViewClient.kt\ncom/kakao/tistory/presentation/view/webview/CommonWebViewClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
public final class CommonWebViewClient extends WebViewClient {
    public static final int $stable = 8;
    public final Context a;
    public Function1 b;
    public Function1 c;
    public boolean d;
    public Function1 e;
    public Function3 f;
    public Function0 g;
    public Function1 h;
    public String i;

    public CommonWebViewClient(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.a = context0;
        this.b = y.a;
        this.c = x.a;
        this.g = w.a;
        this.h = z.a;
    }

    public final boolean a(WebView webView0, String s) {
        Unit unit0 = null;
        RedirectData redirectData0 = RedirectUtils.createRedirectData$default(RedirectUtils.INSTANCE, s, false, 2, null);
        if(((Boolean)this.h.invoke(redirectData0)).booleanValue()) {
            return true;
        }
        if(redirectData0.getType() == Type.PAYMENT_VERIFY_ACCOUNT_CLOSE) {
            this.g.invoke();
            return true;
        }
        if(redirectData0.getType() == Type.NONE) {
            return false;
        }
        if(redirectData0.getType() == Type.WEB) {
            Logger.INSTANCE.log("WebView checkWebViewEnabled() : " + s + ", RedirectType=WEB");
            Function1 function10 = this.e;
            if(function10 != null) {
                function10.invoke(s);
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                webView0.loadUrl(s);
                return true;
            }
        }
        else {
            Logger.INSTANCE.log("WebView checkWebViewEnabled() : " + s);
            NavigatorExtensionKt.goToRedirect(this.a, redirectData0);
        }
        return true;
    }

    @NotNull
    public final Function0 getOnClose() {
        return this.g;
    }

    @NotNull
    public final Function1 getOnPageFinishedCallback() {
        return this.c;
    }

    @NotNull
    public final Function1 getOnPageStartedCallback() {
        return this.b;
    }

    @Nullable
    public final Function3 getOnReceivedErrorCallback() {
        return this.f;
    }

    @NotNull
    public final Function1 getOnRedirect() {
        return this.h;
    }

    @Nullable
    public final Function1 getOnShouldOverrideUrlCallback() {
        return this.e;
    }

    public final boolean getRedirectEnabled() {
        return this.d;
    }

    @Override  // android.webkit.WebViewClient
    public void onPageFinished(@Nullable WebView webView0, @Nullable String s) {
        Logger.INSTANCE.log("WebView onPageFinished() : " + s);
        this.c.invoke(s);
    }

    @Override  // android.webkit.WebViewClient
    public void onPageStarted(@Nullable WebView webView0, @Nullable String s, @Nullable Bitmap bitmap0) {
        Logger.INSTANCE.log("WebView onPageStarted() : " + s);
        this.i = s;
        this.b.invoke(s);
    }

    @Override  // android.webkit.WebViewClient
    public void onReceivedError(@Nullable WebView webView0, int v, @Nullable String s, @Nullable String s1) {
        boolean z;
        String s2;
        Logger.INSTANCE.log("WebView onReceivedError() url=" + s1 + ", errorCode=" + v + ", description=" + s);
        if(webView0 == null) {
            return;
        }
        Function3 function30 = this.f;
        if(function30 == null) {
            z = false;
        }
        else {
            Integer integer0 = v;
            if(s == null) {
                s2 = ConstsKt.getEXCEPTION_UNKNOWN_TITLE();
            }
            else {
                s2 = s.toString();
                if(s2 == null) {
                    s2 = ConstsKt.getEXCEPTION_UNKNOWN_TITLE();
                }
            }
            z = ((Boolean)function30.invoke(integer0, s2, s1)).booleanValue();
        }
        if(!z) {
            super.onReceivedError(webView0, v, s, s1);
        }
    }

    @Override  // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(@Nullable WebView webView0, @Nullable WebResourceRequest webResourceRequest0, @Nullable WebResourceError webResourceError0) {
        boolean z;
        String s2;
        String s;
        Logger logger0 = Logger.INSTANCE;
        CharSequence charSequence0 = null;
        if(webResourceRequest0 == null) {
            s = null;
        }
        else {
            Uri uri0 = webResourceRequest0.getUrl();
            s = uri0 == null ? null : uri0.toString();
        }
        logger0.log("WebView onReceivedError() url=" + s + ", " + (webResourceError0 == null ? null : webResourceError0.toString()));
        if(webView0 != null && webResourceRequest0 != null) {
            Integer integer0 = webResourceError0 == null ? null : webResourceError0.getErrorCode();
            if(webResourceError0 != null) {
                charSequence0 = webResourceError0.getDescription();
            }
            String s1 = webResourceRequest0.getUrl().toString();
            Function3 function30 = this.f;
            if(function30 == null) {
                z = false;
            }
            else {
                Integer integer1 = (int)(integer0 == null ? -1 : ((int)integer0));
                if(charSequence0 == null) {
                    s2 = ConstsKt.getEXCEPTION_UNKNOWN_TITLE();
                }
                else {
                    s2 = charSequence0.toString();
                    if(s2 == null) {
                        s2 = ConstsKt.getEXCEPTION_UNKNOWN_TITLE();
                    }
                }
                z = ((Boolean)function30.invoke(integer1, s2, s1)).booleanValue();
            }
            if(!z) {
                super.onReceivedError(webView0, webResourceRequest0, webResourceError0);
            }
        }
    }

    @Override  // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedHttpError(@Nullable WebView webView0, @Nullable WebResourceRequest webResourceRequest0, @Nullable WebResourceResponse webResourceResponse0) {
        String s1;
        Logger logger0 = Logger.INSTANCE;
        String s = null;
        if(webResourceRequest0 == null) {
            s1 = null;
        }
        else {
            Uri uri0 = webResourceRequest0.getUrl();
            s1 = uri0 == null ? null : uri0.toString();
        }
        logger0.log("WebView onReceivedHttpError() url=" + s1 + ", " + (webResourceResponse0 == null ? null : webResourceResponse0.toString()));
        CrashlyticsUtils crashlyticsUtils0 = CrashlyticsUtils.INSTANCE;
        Uri uri1 = webResourceRequest0 == null ? null : webResourceRequest0.getUrl();
        Integer integer0 = webResourceResponse0 == null ? null : webResourceResponse0.getStatusCode();
        if(webResourceResponse0 != null) {
            s = webResourceResponse0.getReasonPhrase();
        }
        crashlyticsUtils0.logException(new IllegalArgumentException("request=" + uri1 + "\nstatusCode=" + integer0 + "\nreasonPhrase=" + s));
        super.onReceivedHttpError(webView0, webResourceRequest0, webResourceResponse0);
    }

    public final void setOnClose(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "<set-?>");
        this.g = function00;
    }

    public final void setOnPageFinishedCallback(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "<set-?>");
        this.c = function10;
    }

    public final void setOnPageStartedCallback(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "<set-?>");
        this.b = function10;
    }

    public final void setOnReceivedErrorCallback(@Nullable Function3 function30) {
        this.f = function30;
    }

    public final void setOnRedirect(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "<set-?>");
        this.h = function10;
    }

    public final void setOnShouldOverrideUrlCallback(@Nullable Function1 function10) {
        this.e = function10;
    }

    public final void setRedirectEnabled(boolean z) {
        this.d = z;
    }

    @Override  // android.webkit.WebViewClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@Nullable WebView webView0, @Nullable WebResourceRequest webResourceRequest0) {
        Map map0 = webResourceRequest0 == null ? null : webResourceRequest0.getRequestHeaders();
        Logger.INSTANCE.log("WebView shouldInterceptRequest() : headers=" + map0);
        return super.shouldInterceptRequest(webView0, webResourceRequest0);
    }

    @Override  // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@Nullable WebView webView0, @Nullable WebResourceRequest webResourceRequest0) {
        String s1;
        Logger logger0 = Logger.INSTANCE;
        String s = null;
        if(webResourceRequest0 == null) {
            s1 = null;
        }
        else {
            Uri uri0 = webResourceRequest0.getUrl();
            s1 = uri0 == null ? null : uri0.toString();
        }
        logger0.log("WebView shouldOverrideUrlLoading() : " + s1 + ", " + (webResourceRequest0 == null ? null : Boolean.valueOf(webResourceRequest0.isRedirect())));
        if(webResourceRequest0 != null) {
            Uri uri1 = webResourceRequest0.getUrl();
            if(uri1 != null) {
                s = uri1.toString();
            }
        }
        if(webView0 != null && s != null) {
            String s2 = this.i;
            if(!(s2 == null || !RedirectUtils.INSTANCE.isTistoryBlogUrl(s2) ? false : Intrinsics.areEqual(p.replace$default(s2, "/m/", "/", false, 4, null), s))) {
                String s3 = webResourceRequest0.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(s3, "toString(...)");
                return this.a(webView0, s3);
            }
        }
        return false;
    }

    @Override  // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@Nullable WebView webView0, @Nullable String s) {
        Logger.INSTANCE.log("WebView shouldOverrideUrlLoading() : " + s);
        return webView0 == null || s == null || s.length() == 0 ? false : this.a(webView0, s);
    }
}

