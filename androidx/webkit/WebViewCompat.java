package androidx.webkit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.webkit.internal.ApiFeature.M;
import androidx.webkit.internal.ApiHelperForM;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForOMR1;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebMessageAdapter;
import androidx.webkit.internal.WebMessagePortImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import androidx.webkit.internal.WebViewProviderAdapter;
import androidx.webkit.internal.WebViewRenderProcessClientFrameworkAdapter;
import androidx.webkit.internal.WebViewRenderProcessImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public class WebViewCompat {
    public interface VisualStateCallback {
        @UiThread
        void onComplete(long arg1);
    }

    public interface WebMessageListener {
        @UiThread
        void onPostMessage(@NonNull WebView arg1, @NonNull WebMessageCompat arg2, @NonNull Uri arg3, boolean arg4, @NonNull JavaScriptReplyProxy arg5);
    }

    public static final Uri a;
    public static final Uri b;

    static {
        WebViewCompat.a = Uri.parse("*");
        WebViewCompat.b = Uri.parse("");
    }

    public static WebViewProviderAdapter a(WebView webView0) {
        return new WebViewProviderAdapter(WebViewGlueCommunicator.getFactory().createWebView(webView0));
    }

    @NonNull
    public static ScriptHandler addDocumentStartJavaScript(@NonNull WebView webView0, @NonNull String s, @NonNull Set set0) {
        if(!WebViewFeatureInternal.DOCUMENT_START_SCRIPT.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return WebViewCompat.a(webView0).addDocumentStartJavaScript(s, ((String[])set0.toArray(new String[0])));
    }

    public static void addWebMessageListener(@NonNull WebView webView0, @NonNull String s, @NonNull Set set0, @NonNull WebMessageListener webViewCompat$WebMessageListener0) {
        if(!WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebViewCompat.a(webView0).addWebMessageListener(s, ((String[])set0.toArray(new String[0])), webViewCompat$WebMessageListener0);
    }

    @NonNull
    public static WebMessagePortCompat[] createWebMessageChannel(@NonNull WebView webView0) {
        return WebMessagePortImpl.portsToCompat(ApiHelperForM.createWebMessageChannel(webView0));
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY})
    public static PackageInfo getCurrentLoadedWebViewPackage() {
        return ApiHelperForO.getCurrentWebViewPackage();
    }

    @Nullable
    public static PackageInfo getCurrentWebViewPackage(@NonNull Context context0) {
        String s;
        PackageInfo packageInfo0 = WebViewCompat.getCurrentLoadedWebViewPackage();
        if(packageInfo0 != null) {
            return packageInfo0;
        }
        try {
            s = (String)Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if(s != null) {
                goto label_5;
            }
        }
        catch(ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException unused_ex) {
        }
        return null;
    label_5:
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            return packageManager0.getPackageInfo(s, 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return null;
        }
    }

    @NonNull
    @UiThread
    public static Profile getProfile(@NonNull WebView webView0) {
        if(!WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return WebViewCompat.a(webView0).getProfile();
    }

    // 去混淆评级： 低(40)
    @NonNull
    public static Uri getSafeBrowsingPrivacyPolicyUrl() {
        return ApiHelperForOMR1.getSafeBrowsingPrivacyPolicyUrl();
    }

    @NonNull
    public static String getVariationsHeader() {
        if(!WebViewFeatureInternal.GET_VARIATIONS_HEADER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return WebViewGlueCommunicator.getFactory().getStatics().getVariationsHeader();
    }

    @Nullable
    public static WebChromeClient getWebChromeClient(@NonNull WebView webView0) {
        return ApiHelperForO.getWebChromeClient(webView0);
    }

    @NonNull
    public static WebViewClient getWebViewClient(@NonNull WebView webView0) {
        return ApiHelperForO.getWebViewClient(webView0);
    }

    @Nullable
    public static WebViewRenderProcess getWebViewRenderProcess(@NonNull WebView webView0) {
        android.webkit.WebViewRenderProcess webViewRenderProcess0 = ApiHelperForQ.getWebViewRenderProcess(webView0);
        return webViewRenderProcess0 != null ? WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess0) : null;
    }

    // 去混淆评级： 低(25)
    @Nullable
    public static WebViewRenderProcessClient getWebViewRenderProcessClient(@NonNull WebView webView0) {
        android.webkit.WebViewRenderProcessClient webViewRenderProcessClient0 = ApiHelperForQ.getWebViewRenderProcessClient(webView0);
        return webViewRenderProcessClient0 == null || !(webViewRenderProcessClient0 instanceof WebViewRenderProcessClientFrameworkAdapter) ? null : ((WebViewRenderProcessClientFrameworkAdapter)webViewRenderProcessClient0).getFrameworkRenderProcessClient();
    }

    public static boolean isMultiProcessEnabled() {
        if(!WebViewFeatureInternal.MULTI_PROCESS.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return WebViewGlueCommunicator.getFactory().getStatics().isMultiProcessEnabled();
    }

    public static void postVisualStateCallback(@NonNull WebView webView0, long v, @NonNull VisualStateCallback webViewCompat$VisualStateCallback0) {
        ApiHelperForM.postVisualStateCallback(webView0, v, webViewCompat$VisualStateCallback0);
    }

    public static void postWebMessage(@NonNull WebView webView0, @NonNull WebMessageCompat webMessageCompat0, @NonNull Uri uri0) {
        if(WebViewCompat.a.equals(uri0)) {
            uri0 = WebViewCompat.b;
        }
        M apiFeature$M0 = WebViewFeatureInternal.POST_WEB_MESSAGE;
        if(webMessageCompat0.getType() == 0) {
            ApiHelperForM.postWebMessage(webView0, WebMessagePortImpl.compatToFrameworkMessage(webMessageCompat0), uri0);
            return;
        }
        if(!apiFeature$M0.isSupportedByWebView() || !WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(webMessageCompat0.getType())) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebViewCompat.a(webView0).postWebMessage(webMessageCompat0, uri0);
    }

    public static void removeWebMessageListener(@NonNull WebView webView0, @NonNull String s) {
        if(!WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebViewCompat.a(webView0).removeWebMessageListener(s);
    }

    @UiThread
    public static void setProfile(@NonNull WebView webView0, @NonNull String s) {
        if(!WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebViewCompat.a(webView0).setProfileWithName(s);
    }

    public static void setSafeBrowsingAllowlist(@NonNull Set set0, @Nullable ValueCallback valueCallback0) {
        if(WebViewFeatureInternal.SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED.isSupportedByWebView()) {
            WebViewGlueCommunicator.getFactory().getStatics().setSafeBrowsingAllowlist(set0, valueCallback0);
            return;
        }
        ApiHelperForOMR1.setSafeBrowsingWhitelist(new ArrayList(set0), valueCallback0);
    }

    @Deprecated
    public static void setSafeBrowsingWhitelist(@NonNull List list0, @Nullable ValueCallback valueCallback0) {
        WebViewCompat.setSafeBrowsingAllowlist(new HashSet(list0), valueCallback0);
    }

    // 去混淆评级： 低(20)
    public static void setWebViewRenderProcessClient(@NonNull WebView webView0, @Nullable WebViewRenderProcessClient webViewRenderProcessClient0) {
        ApiHelperForQ.setWebViewRenderProcessClient(webView0, webViewRenderProcessClient0);
    }

    // 去混淆评级： 低(20)
    @SuppressLint({"LambdaLast"})
    public static void setWebViewRenderProcessClient(@NonNull WebView webView0, @NonNull Executor executor0, @NonNull WebViewRenderProcessClient webViewRenderProcessClient0) {
        ApiHelperForQ.setWebViewRenderProcessClient(webView0, executor0, webViewRenderProcessClient0);
    }

    // 去混淆评级： 低(20)
    public static void startSafeBrowsing(@NonNull Context context0, @Nullable ValueCallback valueCallback0) {
        ApiHelperForOMR1.startSafeBrowsing(context0, valueCallback0);
    }
}

