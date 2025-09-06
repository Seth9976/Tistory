package androidx.webkit.internal;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import androidx.annotation.NonNull;
import androidx.webkit.Profile;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

public class ProfileImpl implements Profile {
    public final ProfileBoundaryInterface a;

    public ProfileImpl(ProfileBoundaryInterface profileBoundaryInterface0) {
        this.a = profileBoundaryInterface0;
    }

    @Override  // androidx.webkit.Profile
    @NonNull
    public CookieManager getCookieManager() throws IllegalStateException {
        if(!WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return this.a.getCookieManager();
    }

    @Override  // androidx.webkit.Profile
    @NonNull
    public GeolocationPermissions getGeolocationPermissions() throws IllegalStateException {
        if(!WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return this.a.getGeoLocationPermissions();
    }

    @Override  // androidx.webkit.Profile
    @NonNull
    public String getName() {
        if(!WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return this.a.getName();
    }

    @Override  // androidx.webkit.Profile
    @NonNull
    public ServiceWorkerController getServiceWorkerController() throws IllegalStateException {
        if(!WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return this.a.getServiceWorkerController();
    }

    @Override  // androidx.webkit.Profile
    @NonNull
    public WebStorage getWebStorage() throws IllegalStateException {
        if(!WebViewFeatureInternal.MULTI_PROFILE.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return this.a.getWebStorage();
    }
}

