package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewRenderProcessClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

public class WebViewRenderProcessClientAdapter implements WebViewRendererClientBoundaryInterface {
    public final Executor a;
    public final WebViewRenderProcessClient b;
    public static final String[] c;

    static {
        WebViewRenderProcessClientAdapter.c = new String[]{"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};
    }

    @SuppressLint({"LambdaLast"})
    public WebViewRenderProcessClientAdapter(@Nullable Executor executor0, @Nullable WebViewRenderProcessClient webViewRenderProcessClient0) {
        this.a = executor0;
        this.b = webViewRenderProcessClient0;
    }

    @Override  // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public final String[] getSupportedFeatures() {
        return WebViewRenderProcessClientAdapter.c;
    }

    @Nullable
    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        return this.b;
    }

    @Override  // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(@NonNull WebView webView0, @NonNull InvocationHandler invocationHandler0) {
        WebViewRenderProcessImpl webViewRenderProcessImpl0 = WebViewRenderProcessImpl.forInvocationHandler(invocationHandler0);
        WebViewRenderProcessClient webViewRenderProcessClient0 = this.b;
        Executor executor0 = this.a;
        if(executor0 == null) {
            webViewRenderProcessClient0.onRenderProcessResponsive(webView0, webViewRenderProcessImpl0);
            return;
        }
        executor0.execute(new j(webViewRenderProcessClient0, webView0, webViewRenderProcessImpl0, 1));
    }

    @Override  // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(@NonNull WebView webView0, @NonNull InvocationHandler invocationHandler0) {
        WebViewRenderProcessImpl webViewRenderProcessImpl0 = WebViewRenderProcessImpl.forInvocationHandler(invocationHandler0);
        WebViewRenderProcessClient webViewRenderProcessClient0 = this.b;
        Executor executor0 = this.a;
        if(executor0 == null) {
            webViewRenderProcessClient0.onRenderProcessUnresponsive(webView0, webViewRenderProcessImpl0);
            return;
        }
        executor0.execute(new j(webViewRenderProcessClient0, webView0, webViewRenderProcessImpl0, 0));
    }
}

