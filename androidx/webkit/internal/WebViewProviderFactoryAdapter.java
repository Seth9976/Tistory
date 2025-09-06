package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class WebViewProviderFactoryAdapter implements WebViewProviderFactory {
    public final WebViewProviderFactoryBoundaryInterface a;

    public WebViewProviderFactoryAdapter(@NonNull WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface0) {
        this.a = webViewProviderFactoryBoundaryInterface0;
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public WebViewProviderBoundaryInterface createWebView(@NonNull WebView webView0) {
        InvocationHandler invocationHandler0 = this.a.createWebView(webView0);
        return (WebViewProviderBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewProviderBoundaryInterface.class, invocationHandler0);
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        InvocationHandler invocationHandler0 = this.a.getDropDataProvider();
        return (DropDataContentProviderBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(DropDataContentProviderBoundaryInterface.class, invocationHandler0);
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public ProfileStoreBoundaryInterface getProfileStore() {
        InvocationHandler invocationHandler0 = this.a.getProfileStore();
        return (ProfileStoreBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProfileStoreBoundaryInterface.class, invocationHandler0);
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public ProxyControllerBoundaryInterface getProxyController() {
        InvocationHandler invocationHandler0 = this.a.getProxyController();
        return (ProxyControllerBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProxyControllerBoundaryInterface.class, invocationHandler0);
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        InvocationHandler invocationHandler0 = this.a.getServiceWorkerController();
        return (ServiceWorkerControllerBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(ServiceWorkerControllerBoundaryInterface.class, invocationHandler0);
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public StaticsBoundaryInterface getStatics() {
        InvocationHandler invocationHandler0 = this.a.getStatics();
        return (StaticsBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(StaticsBoundaryInterface.class, invocationHandler0);
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public TracingControllerBoundaryInterface getTracingController() {
        InvocationHandler invocationHandler0 = this.a.getTracingController();
        return (TracingControllerBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(TracingControllerBoundaryInterface.class, invocationHandler0);
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public String[] getWebViewFeatures() {
        return this.a.getSupportedFeatures();
    }

    @Override  // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        InvocationHandler invocationHandler0 = this.a.getWebkitToCompatConverter();
        return (WebkitToCompatConverterBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebkitToCompatConverterBoundaryInterface.class, invocationHandler0);
    }
}

