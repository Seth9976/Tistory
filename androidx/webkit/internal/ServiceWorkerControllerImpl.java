package androidx.webkit.internal;

import android.webkit.ServiceWorkerController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.ServiceWorkerClientCompat;
import androidx.webkit.ServiceWorkerControllerCompat;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

public class ServiceWorkerControllerImpl extends ServiceWorkerControllerCompat {
    public ServiceWorkerController a;
    public ServiceWorkerControllerBoundaryInterface b;
    public final ServiceWorkerWebSettingsImpl c;

    public ServiceWorkerControllerImpl() {
        ServiceWorkerController serviceWorkerController0 = ApiHelperForN.getServiceWorkerControllerInstance();
        this.a = serviceWorkerController0;
        this.b = null;
        if(serviceWorkerController0 == null) {
            this.a = ApiHelperForN.getServiceWorkerControllerInstance();
        }
        this.c = ApiHelperForN.getServiceWorkerWebSettingsImpl(this.a);
    }

    @Override  // androidx.webkit.ServiceWorkerControllerCompat
    @NonNull
    public ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings() {
        return this.c;
    }

    @Override  // androidx.webkit.ServiceWorkerControllerCompat
    public void setServiceWorkerClient(@Nullable ServiceWorkerClientCompat serviceWorkerClientCompat0) {
        if(serviceWorkerClientCompat0 == null) {
            if(this.a == null) {
                this.a = ApiHelperForN.getServiceWorkerControllerInstance();
            }
            ApiHelperForN.setServiceWorkerClient(this.a, null);
            return;
        }
        if(this.a == null) {
            this.a = ApiHelperForN.getServiceWorkerControllerInstance();
        }
        ApiHelperForN.setServiceWorkerClientCompat(this.a, serviceWorkerClientCompat0);
    }
}

