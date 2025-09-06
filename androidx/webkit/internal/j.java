package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.webkit.WebViewRenderProcessClient;

public final class j implements Runnable {
    public final int a;
    public final WebViewRenderProcessClient b;
    public final WebView c;
    public final WebViewRenderProcessImpl d;

    public j(WebViewRenderProcessClient webViewRenderProcessClient0, WebView webView0, WebViewRenderProcessImpl webViewRenderProcessImpl0, int v) {
        this.a = v;
        this.b = webViewRenderProcessClient0;
        this.c = webView0;
        this.d = webViewRenderProcessImpl0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            this.b.onRenderProcessResponsive(this.c, this.d);
            return;
        }
        this.b.onRenderProcessUnresponsive(this.c, this.d);
    }
}

