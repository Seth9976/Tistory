package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
public class WebViewRenderProcessClientFrameworkAdapter extends WebViewRenderProcessClient {
    public final androidx.webkit.WebViewRenderProcessClient a;

    public WebViewRenderProcessClientFrameworkAdapter(@NonNull androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient0) {
        this.a = webViewRenderProcessClient0;
    }

    @Nullable
    public androidx.webkit.WebViewRenderProcessClient getFrameworkRenderProcessClient() {
        return this.a;
    }

    @Override  // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessResponsive(@NonNull WebView webView0, @Nullable WebViewRenderProcess webViewRenderProcess0) {
        WebViewRenderProcessImpl webViewRenderProcessImpl0 = WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess0);
        this.a.onRenderProcessResponsive(webView0, webViewRenderProcessImpl0);
    }

    @Override  // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessUnresponsive(@NonNull WebView webView0, @Nullable WebViewRenderProcess webViewRenderProcess0) {
        WebViewRenderProcessImpl webViewRenderProcessImpl0 = WebViewRenderProcessImpl.forFrameworkObject(webViewRenderProcess0);
        this.a.onRenderProcessUnresponsive(webView0, webViewRenderProcessImpl0);
    }
}

