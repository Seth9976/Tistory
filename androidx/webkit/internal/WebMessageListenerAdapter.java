package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat.WebMessageListener;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class WebMessageListenerAdapter implements WebMessageListenerBoundaryInterface {
    public final WebMessageListener a;

    public WebMessageListenerAdapter(@NonNull WebMessageListener webViewCompat$WebMessageListener0) {
        this.a = webViewCompat$WebMessageListener0;
    }

    @Override  // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override  // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(@NonNull WebView webView0, @NonNull InvocationHandler invocationHandler0, @NonNull Uri uri0, boolean z, @NonNull InvocationHandler invocationHandler1) {
        WebMessageCompat webMessageCompat0 = WebMessageAdapter.webMessageCompatFromBoundaryInterface(((WebMessageBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessageBoundaryInterface.class, invocationHandler0)));
        if(webMessageCompat0 != null) {
            JavaScriptReplyProxyImpl javaScriptReplyProxyImpl0 = JavaScriptReplyProxyImpl.forInvocationHandler(invocationHandler1);
            this.a.onPostMessage(webView0, webMessageCompat0, uri0, z, javaScriptReplyProxyImpl0);
        }
    }
}

