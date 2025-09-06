package androidx.webkit;

import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.webkit.internal.ApiHelperForLollipop;
import androidx.webkit.internal.SafeBrowsingResponseImpl;
import androidx.webkit.internal.WebResourceErrorImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SafeBrowsingThreat {
    }

    public static final String[] a;

    static {
        WebViewClientCompat.a = new String[]{"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};
    }

    @Override  // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    @RestrictTo({Scope.LIBRARY})
    public final String[] getSupportedFeatures() {
        return WebViewClientCompat.a;
    }

    @Override  // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @UiThread
    public void onPageCommitVisible(@NonNull WebView webView0, @NonNull String s) {
    }

    @Override  // android.webkit.WebViewClient
    @RequiresApi(23)
    public final void onReceivedError(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0, @NonNull WebResourceError webResourceError0) {
        this.onReceivedError(webView0, webResourceRequest0, new WebResourceErrorImpl(webResourceError0));
    }

    @RequiresApi(21)
    @UiThread
    public void onReceivedError(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0, @NonNull WebResourceErrorCompat webResourceErrorCompat0) {
        if(WebViewFeature.isFeatureSupported("WEB_RESOURCE_ERROR_GET_CODE") && WebViewFeature.isFeatureSupported("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && ApiHelperForLollipop.isForMainFrame(webResourceRequest0)) {
            this.onReceivedError(webView0, webResourceErrorCompat0.getErrorCode(), webResourceErrorCompat0.getDescription().toString(), ApiHelperForLollipop.getUrl(webResourceRequest0).toString());
        }
    }

    @Override  // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @RequiresApi(21)
    @RestrictTo({Scope.LIBRARY})
    public final void onReceivedError(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0, @NonNull InvocationHandler invocationHandler0) {
        this.onReceivedError(webView0, webResourceRequest0, new WebResourceErrorImpl(invocationHandler0));
    }

    @Override  // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @UiThread
    public void onReceivedHttpError(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0, @NonNull WebResourceResponse webResourceResponse0) {
    }

    @Override  // android.webkit.WebViewClient
    @RequiresApi(27)
    public final void onSafeBrowsingHit(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0, int v, @NonNull SafeBrowsingResponse safeBrowsingResponse0) {
        this.onSafeBrowsingHit(webView0, webResourceRequest0, v, new SafeBrowsingResponseImpl(safeBrowsingResponse0));
    }

    @UiThread
    public void onSafeBrowsingHit(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0, int v, @NonNull SafeBrowsingResponseCompat safeBrowsingResponseCompat0) {
        if(!WebViewFeature.isFeatureSupported("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        safeBrowsingResponseCompat0.showInterstitial(true);
    }

    @Override  // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @RestrictTo({Scope.LIBRARY})
    public final void onSafeBrowsingHit(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0, int v, @NonNull InvocationHandler invocationHandler0) {
        this.onSafeBrowsingHit(webView0, webResourceRequest0, v, new SafeBrowsingResponseImpl(invocationHandler0));
    }

    @Override  // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @RestrictTo({Scope.LIBRARY})
    public boolean onWebAuthnIntent(@NonNull WebView webView0, @NonNull PendingIntent pendingIntent0, @NonNull InvocationHandler invocationHandler0) {
        return false;
    }

    @Override  // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    @RequiresApi(21)
    @UiThread
    public boolean shouldOverrideUrlLoading(@NonNull WebView webView0, @NonNull WebResourceRequest webResourceRequest0) {
        return this.shouldOverrideUrlLoading(webView0, ApiHelperForLollipop.getUrl(webResourceRequest0).toString());
    }
}

