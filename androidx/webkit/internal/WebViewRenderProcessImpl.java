package androidx.webkit.internal;

import a6.a;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class WebViewRenderProcessImpl extends WebViewRenderProcess {
    public final WebViewRendererBoundaryInterface a;
    public final WeakReference b;
    public static final WeakHashMap c;

    static {
        WebViewRenderProcessImpl.c = new WeakHashMap();
    }

    public WebViewRenderProcessImpl(@NonNull android.webkit.WebViewRenderProcess webViewRenderProcess0) {
        this.b = new WeakReference(webViewRenderProcess0);
    }

    public WebViewRenderProcessImpl(@NonNull WebViewRendererBoundaryInterface webViewRendererBoundaryInterface0) {
        this.a = webViewRendererBoundaryInterface0;
    }

    @NonNull
    public static WebViewRenderProcessImpl forFrameworkObject(@NonNull android.webkit.WebViewRenderProcess webViewRenderProcess0) {
        WeakHashMap weakHashMap0 = WebViewRenderProcessImpl.c;
        WebViewRenderProcessImpl webViewRenderProcessImpl0 = (WebViewRenderProcessImpl)weakHashMap0.get(webViewRenderProcess0);
        if(webViewRenderProcessImpl0 != null) {
            return webViewRenderProcessImpl0;
        }
        WebViewRenderProcessImpl webViewRenderProcessImpl1 = new WebViewRenderProcessImpl(webViewRenderProcess0);
        weakHashMap0.put(webViewRenderProcess0, webViewRenderProcessImpl1);
        return webViewRenderProcessImpl1;
    }

    @NonNull
    public static WebViewRenderProcessImpl forInvocationHandler(@NonNull InvocationHandler invocationHandler0) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface0 = (WebViewRendererBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewRendererBoundaryInterface.class, invocationHandler0);
        return (WebViewRenderProcessImpl)webViewRendererBoundaryInterface0.getOrCreatePeer(new a(webViewRendererBoundaryInterface0, 2));
    }

    // 去混淆评级： 低(25)
    @Override  // androidx.webkit.WebViewRenderProcess
    public boolean terminate() {
        android.webkit.WebViewRenderProcess webViewRenderProcess0 = k.n(this.b.get());
        return webViewRenderProcess0 != null && ApiHelperForQ.terminate(webViewRenderProcess0);
    }
}

