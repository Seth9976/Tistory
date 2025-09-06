package androidx.webkit.internal;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class WebkitToCompatConverter {
    public final WebkitToCompatConverterBoundaryInterface a;

    public WebkitToCompatConverter(@NonNull WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface0) {
        this.a = webkitToCompatConverterBoundaryInterface0;
    }

    @NonNull
    public CookieManagerAdapter convertCookieManager(@NonNull CookieManager cookieManager0) {
        InvocationHandler invocationHandler0 = this.a.convertCookieManager(cookieManager0);
        return new CookieManagerAdapter(((WebViewCookieManagerBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewCookieManagerBoundaryInterface.class, invocationHandler0)));
    }

    @NonNull
    @RequiresApi(27)
    public SafeBrowsingResponse convertSafeBrowsingResponse(@NonNull InvocationHandler invocationHandler0) {
        return e.c(this.a.convertSafeBrowsingResponse(invocationHandler0));
    }

    @NonNull
    public InvocationHandler convertSafeBrowsingResponse(@NonNull SafeBrowsingResponse safeBrowsingResponse0) {
        return this.a.convertSafeBrowsingResponse(safeBrowsingResponse0);
    }

    @NonNull
    @RequiresApi(24)
    public ServiceWorkerWebSettings convertServiceWorkerSettings(@NonNull InvocationHandler invocationHandler0) {
        return (ServiceWorkerWebSettings)this.a.convertServiceWorkerSettings(invocationHandler0);
    }

    @NonNull
    public InvocationHandler convertServiceWorkerSettings(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0) {
        return this.a.convertServiceWorkerSettings(serviceWorkerWebSettings0);
    }

    @NonNull
    public WebSettingsAdapter convertSettings(@NonNull WebSettings webSettings0) {
        InvocationHandler invocationHandler0 = this.a.convertSettings(webSettings0);
        return new WebSettingsAdapter(((WebSettingsBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebSettingsBoundaryInterface.class, invocationHandler0)));
    }

    @NonNull
    @RequiresApi(23)
    public WebMessagePort convertWebMessagePort(@NonNull InvocationHandler invocationHandler0) {
        return (WebMessagePort)this.a.convertWebMessagePort(invocationHandler0);
    }

    @NonNull
    public InvocationHandler convertWebMessagePort(@NonNull WebMessagePort webMessagePort0) {
        return this.a.convertWebMessagePort(webMessagePort0);
    }

    @NonNull
    @RequiresApi(23)
    public WebResourceError convertWebResourceError(@NonNull InvocationHandler invocationHandler0) {
        return (WebResourceError)this.a.convertWebResourceError(invocationHandler0);
    }

    @NonNull
    public InvocationHandler convertWebResourceError(@NonNull WebResourceError webResourceError0) {
        return this.a.convertWebResourceError(webResourceError0);
    }

    @NonNull
    public WebResourceRequestAdapter convertWebResourceRequest(@NonNull WebResourceRequest webResourceRequest0) {
        InvocationHandler invocationHandler0 = this.a.convertWebResourceRequest(webResourceRequest0);
        return new WebResourceRequestAdapter(((WebResourceRequestBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceRequestBoundaryInterface.class, invocationHandler0)));
    }
}

