package androidx.webkit.internal;

import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class WebMessagePortImpl extends WebMessagePortCompat {
    public WebMessagePort a;
    public WebMessagePortBoundaryInterface b;

    public WebMessagePortImpl(@NonNull WebMessagePort webMessagePort0) {
        this.a = webMessagePort0;
    }

    public WebMessagePortImpl(@NonNull InvocationHandler invocationHandler0) {
        this.b = (WebMessagePortBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePortBoundaryInterface.class, invocationHandler0);
    }

    public final WebMessagePortBoundaryInterface a() {
        if(this.b == null) {
            InvocationHandler invocationHandler0 = WebViewGlueCommunicator.getCompatConverter().convertWebMessagePort(this.a);
            this.b = (WebMessagePortBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePortBoundaryInterface.class, invocationHandler0);
        }
        return this.b;
    }

    public final WebMessagePort b() {
        if(this.a == null) {
            this.a = WebViewGlueCommunicator.getCompatConverter().convertWebMessagePort(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    @Override  // androidx.webkit.WebMessagePortCompat
    public void close() {
        ApiHelperForM.close(this.b());
    }

    @NonNull
    @RequiresApi(23)
    public static WebMessage compatToFrameworkMessage(@NonNull WebMessageCompat webMessageCompat0) {
        return ApiHelperForM.createWebMessage(webMessageCompat0);
    }

    @Nullable
    @RequiresApi(23)
    public static WebMessagePort[] compatToPorts(@Nullable WebMessagePortCompat[] arr_webMessagePortCompat) {
        if(arr_webMessagePortCompat == null) {
            return null;
        }
        WebMessagePort[] arr_webMessagePort = new WebMessagePort[arr_webMessagePortCompat.length];
        for(int v = 0; v < arr_webMessagePortCompat.length; ++v) {
            arr_webMessagePort[v] = arr_webMessagePortCompat[v].getFrameworkPort();
        }
        return arr_webMessagePort;
    }

    @NonNull
    @RequiresApi(23)
    public static WebMessageCompat frameworkMessageToCompat(@NonNull WebMessage webMessage0) {
        return ApiHelperForM.createWebMessageCompat(webMessage0);
    }

    @Override  // androidx.webkit.WebMessagePortCompat
    @NonNull
    @RequiresApi(23)
    public WebMessagePort getFrameworkPort() {
        return this.b();
    }

    @Override  // androidx.webkit.WebMessagePortCompat
    @NonNull
    public InvocationHandler getInvocationHandler() {
        return Proxy.getInvocationHandler(this.a());
    }

    @Nullable
    public static WebMessagePortCompat[] portsToCompat(@Nullable WebMessagePort[] arr_webMessagePort) {
        if(arr_webMessagePort == null) {
            return null;
        }
        WebMessagePortCompat[] arr_webMessagePortCompat = new WebMessagePortCompat[arr_webMessagePort.length];
        for(int v = 0; v < arr_webMessagePort.length; ++v) {
            arr_webMessagePortCompat[v] = new WebMessagePortImpl(arr_webMessagePort[v]);
        }
        return arr_webMessagePortCompat;
    }

    @Override  // androidx.webkit.WebMessagePortCompat
    public void postMessage(@NonNull WebMessageCompat webMessageCompat0) {
        M apiFeature$M0 = WebViewFeatureInternal.WEB_MESSAGE_PORT_POST_MESSAGE;
        if(webMessageCompat0.getType() == 0) {
            ApiHelperForM.postMessage(this.b(), WebMessagePortImpl.compatToFrameworkMessage(webMessageCompat0));
            return;
        }
        if(!apiFeature$M0.isSupportedByWebView() || !WebMessageAdapter.isMessagePayloadTypeSupportedByWebView(webMessageCompat0.getType())) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.a().postMessage(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageAdapter(webMessageCompat0)));
    }

    @Override  // androidx.webkit.WebMessagePortCompat
    public void setWebMessageCallback(@Nullable Handler handler0, @NonNull WebMessageCallbackCompat webMessagePortCompat$WebMessageCallbackCompat0) {
        if(WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL.isSupportedByWebView()) {
            this.a().setWebMessageCallback(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageCallbackAdapter(webMessagePortCompat$WebMessageCallbackCompat0)), handler0);
            return;
        }
        ApiHelperForM.setWebMessageCallback(this.b(), webMessagePortCompat$WebMessageCallbackCompat0, handler0);
    }

    @Override  // androidx.webkit.WebMessagePortCompat
    public void setWebMessageCallback(@NonNull WebMessageCallbackCompat webMessagePortCompat$WebMessageCallbackCompat0) {
        if(WebViewFeatureInternal.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK.isSupportedByWebView()) {
            this.a().setWebMessageCallback(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageCallbackAdapter(webMessagePortCompat$WebMessageCallbackCompat0)));
            return;
        }
        ApiHelperForM.setWebMessageCallback(this.b(), webMessagePortCompat$WebMessageCallbackCompat0);
    }
}

