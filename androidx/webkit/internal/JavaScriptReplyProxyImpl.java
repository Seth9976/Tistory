package androidx.webkit.internal;

import a6.a;
import androidx.annotation.NonNull;
import androidx.webkit.JavaScriptReplyProxy;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class JavaScriptReplyProxyImpl extends JavaScriptReplyProxy {
    public final JsReplyProxyBoundaryInterface a;

    public JavaScriptReplyProxyImpl(@NonNull JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface0) {
        this.a = jsReplyProxyBoundaryInterface0;
    }

    @NonNull
    public static JavaScriptReplyProxyImpl forInvocationHandler(@NonNull InvocationHandler invocationHandler0) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface0 = (JsReplyProxyBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(JsReplyProxyBoundaryInterface.class, invocationHandler0);
        return (JavaScriptReplyProxyImpl)jsReplyProxyBoundaryInterface0.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface0, 1));
    }

    @Override  // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(@NonNull String s) {
        if(!WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.a.postMessage(s);
    }

    @Override  // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(@NonNull byte[] arr_b) {
        Objects.requireNonNull(arr_b, "ArrayBuffer must be non-null");
        if(!WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        InvocationHandler invocationHandler0 = BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessagePayloadAdapter(arr_b));
        this.a.postMessageWithPayload(invocationHandler0);
    }
}

