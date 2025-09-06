package androidx.webkit.internal;

import android.webkit.ServiceWorkerWebSettings;
import androidx.annotation.NonNull;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Set;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class ServiceWorkerWebSettingsImpl extends ServiceWorkerWebSettingsCompat {
    public ServiceWorkerWebSettings a;
    public ServiceWorkerWebSettingsBoundaryInterface b;

    public ServiceWorkerWebSettingsImpl(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0) {
        this.a = serviceWorkerWebSettings0;
    }

    public ServiceWorkerWebSettingsImpl(@NonNull InvocationHandler invocationHandler0) {
        this.b = (ServiceWorkerWebSettingsBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler0);
    }

    public final ServiceWorkerWebSettingsBoundaryInterface a() {
        if(this.b == null) {
            InvocationHandler invocationHandler0 = WebViewGlueCommunicator.getCompatConverter().convertServiceWorkerSettings(this.a);
            this.b = (ServiceWorkerWebSettingsBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler0);
        }
        return this.b;
    }

    public final ServiceWorkerWebSettings b() {
        if(this.a == null) {
            this.a = WebViewGlueCommunicator.getCompatConverter().convertServiceWorkerSettings(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowContentAccess() {
        return ApiHelperForN.getAllowContentAccess(this.b());
    }

    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getAllowFileAccess() {
        return ApiHelperForN.getAllowFileAccess(this.b());
    }

    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public boolean getBlockNetworkLoads() {
        return ApiHelperForN.getBlockNetworkLoads(this.b());
    }

    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public int getCacheMode() {
        return ApiHelperForN.getCacheMode(this.b());
    }

    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    @NonNull
    public Set getRequestedWithHeaderOriginAllowList() {
        if(!WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return this.a().getRequestedWithHeaderOriginAllowList();
    }

    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowContentAccess(boolean z) {
        ApiHelperForN.setAllowContentAccess(this.b(), z);
    }

    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setAllowFileAccess(boolean z) {
        ApiHelperForN.setAllowFileAccess(this.b(), z);
    }

    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setBlockNetworkLoads(boolean z) {
        ApiHelperForN.setBlockNetworkLoads(this.b(), z);
    }

    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setCacheMode(int v) {
        ApiHelperForN.setCacheMode(this.b(), v);
    }

    @Override  // androidx.webkit.ServiceWorkerWebSettingsCompat
    public void setRequestedWithHeaderOriginAllowList(@NonNull Set set0) {
        if(!WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.a().setRequestedWithHeaderOriginAllowList(set0);
    }
}

