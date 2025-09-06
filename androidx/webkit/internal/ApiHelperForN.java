package androidx.webkit.internal;

import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.ServiceWorkerClientCompat;
import java.io.File;

@RequiresApi(24)
public class ApiHelperForN {
    @DoNotInline
    public static boolean getAllowContentAccess(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0) {
        return serviceWorkerWebSettings0.getAllowContentAccess();
    }

    @DoNotInline
    public static boolean getAllowFileAccess(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0) {
        return serviceWorkerWebSettings0.getAllowFileAccess();
    }

    @DoNotInline
    public static boolean getBlockNetworkLoads(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0) {
        return serviceWorkerWebSettings0.getBlockNetworkLoads();
    }

    @DoNotInline
    public static int getCacheMode(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0) {
        return serviceWorkerWebSettings0.getCacheMode();
    }

    @DoNotInline
    @NonNull
    public static File getDataDir(@NonNull Context context0) {
        return context0.getDataDir();
    }

    @DoNotInline
    public static int getDisabledActionModeMenuItems(@NonNull WebSettings webSettings0) {
        return webSettings0.getDisabledActionModeMenuItems();
    }

    @DoNotInline
    @NonNull
    public static ServiceWorkerController getServiceWorkerControllerInstance() {
        return ServiceWorkerController.getInstance();
    }

    @DoNotInline
    @NonNull
    public static ServiceWorkerWebSettings getServiceWorkerWebSettings(@NonNull ServiceWorkerController serviceWorkerController0) {
        return serviceWorkerController0.getServiceWorkerWebSettings();
    }

    @DoNotInline
    @NonNull
    public static ServiceWorkerWebSettingsImpl getServiceWorkerWebSettingsImpl(@NonNull ServiceWorkerController serviceWorkerController0) {
        return new ServiceWorkerWebSettingsImpl(ApiHelperForN.getServiceWorkerWebSettings(serviceWorkerController0));
    }

    @DoNotInline
    public static boolean isRedirect(@NonNull WebResourceRequest webResourceRequest0) {
        return webResourceRequest0.isRedirect();
    }

    @DoNotInline
    public static void setAllowContentAccess(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0, boolean z) {
        serviceWorkerWebSettings0.setAllowContentAccess(z);
    }

    @DoNotInline
    public static void setAllowFileAccess(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0, boolean z) {
        serviceWorkerWebSettings0.setAllowFileAccess(z);
    }

    @DoNotInline
    public static void setBlockNetworkLoads(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0, boolean z) {
        serviceWorkerWebSettings0.setBlockNetworkLoads(z);
    }

    @DoNotInline
    public static void setCacheMode(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings0, int v) {
        serviceWorkerWebSettings0.setCacheMode(v);
    }

    @DoNotInline
    public static void setDisabledActionModeMenuItems(@NonNull WebSettings webSettings0, int v) {
        webSettings0.setDisabledActionModeMenuItems(v);
    }

    @DoNotInline
    public static void setServiceWorkerClient(@NonNull ServiceWorkerController serviceWorkerController0, @Nullable ServiceWorkerClient serviceWorkerClient0) {
        serviceWorkerController0.setServiceWorkerClient(serviceWorkerClient0);
    }

    @DoNotInline
    public static void setServiceWorkerClientCompat(@NonNull ServiceWorkerController serviceWorkerController0, @NonNull ServiceWorkerClientCompat serviceWorkerClientCompat0) {
        serviceWorkerController0.setServiceWorkerClient(new FrameworkServiceWorkerClient(serviceWorkerClientCompat0));
    }
}

