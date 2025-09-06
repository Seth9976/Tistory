package androidx.webkit;

import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.ApiHelperForM;
import androidx.webkit.internal.ApiHelperForN;
import androidx.webkit.internal.ApiHelperForO;
import androidx.webkit.internal.ApiHelperForQ;
import androidx.webkit.internal.WebSettingsAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

public class WebSettingsCompat {
    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    public @interface ForceDark {
    }

    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    public @interface ForceDarkStrategy {
    }

    @RestrictTo({Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.PARAMETER, ElementType.METHOD})
    public @interface MenuItemFlags {
    }

    public static final int ATTRIBUTION_BEHAVIOR_APP_SOURCE_AND_APP_TRIGGER = 3;
    public static final int ATTRIBUTION_BEHAVIOR_APP_SOURCE_AND_WEB_TRIGGER = 1;
    public static final int ATTRIBUTION_BEHAVIOR_DISABLED = 0;
    public static final int ATTRIBUTION_BEHAVIOR_WEB_SOURCE_AND_WEB_TRIGGER = 2;
    @Deprecated
    public static final int DARK_STRATEGY_PREFER_WEB_THEME_OVER_USER_AGENT_DARKENING = 2;
    @Deprecated
    public static final int DARK_STRATEGY_USER_AGENT_DARKENING_ONLY = 0;
    @Deprecated
    public static final int DARK_STRATEGY_WEB_THEME_DARKENING_ONLY = 1;
    @Deprecated
    public static final int FORCE_DARK_AUTO = 1;
    @Deprecated
    public static final int FORCE_DARK_OFF = 0;
    @Deprecated
    public static final int FORCE_DARK_ON = 2;

    public static WebSettingsAdapter a(WebSettings webSettings0) {
        return WebViewGlueCommunicator.getCompatConverter().convertSettings(webSettings0);
    }

    public static int getAttributionRegistrationBehavior(@NonNull WebSettings webSettings0) {
        if(!WebViewFeatureInternal.ATTRIBUTION_REGISTRATION_BEHAVIOR.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return WebSettingsCompat.a(webSettings0).getAttributionRegistrationBehavior();
    }

    public static int getDisabledActionModeMenuItems(@NonNull WebSettings webSettings0) {
        return ApiHelperForN.getDisabledActionModeMenuItems(webSettings0);
    }

    public static boolean getEnterpriseAuthenticationAppLinkPolicyEnabled(@NonNull WebSettings webSettings0) {
        if(!WebViewFeatureInternal.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return WebSettingsCompat.a(webSettings0).getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    // 去混淆评级： 低(40)
    @Deprecated
    public static int getForceDark(@NonNull WebSettings webSettings0) {
        return ApiHelperForQ.getForceDark(webSettings0);
    }

    @Deprecated
    public static int getForceDarkStrategy(@NonNull WebSettings webSettings0) {
        if(!WebViewFeatureInternal.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return WebSettingsCompat.a(webSettings0).getForceDark();
    }

    public static boolean getOffscreenPreRaster(@NonNull WebSettings webSettings0) {
        return ApiHelperForM.getOffscreenPreRaster(webSettings0);
    }

    @NonNull
    public static Set getRequestedWithHeaderOriginAllowList(@NonNull WebSettings webSettings0) {
        if(!WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return WebSettingsCompat.a(webSettings0).getRequestedWithHeaderOriginAllowList();
    }

    public static boolean getSafeBrowsingEnabled(@NonNull WebSettings webSettings0) {
        return ApiHelperForO.getSafeBrowsingEnabled(webSettings0);
    }

    @NonNull
    public static UserAgentMetadata getUserAgentMetadata(@NonNull WebSettings webSettings0) {
        if(!WebViewFeatureInternal.USER_AGENT_METADATA.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return WebSettingsCompat.a(webSettings0).getUserAgentMetadata();
    }

    @NonNull
    public static WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus(@NonNull WebSettings webSettings0) {
        if(!WebViewFeatureInternal.WEBVIEW_MEDIA_INTEGRITY_API_STATUS.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return WebSettingsCompat.a(webSettings0).getWebViewMediaIntegrityApiStatus();
    }

    public static boolean isAlgorithmicDarkeningAllowed(@NonNull WebSettings webSettings0) {
        if(!WebViewFeatureInternal.ALGORITHMIC_DARKENING.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return WebSettingsCompat.a(webSettings0).isAlgorithmicDarkeningAllowed();
    }

    public static void setAlgorithmicDarkeningAllowed(@NonNull WebSettings webSettings0, boolean z) {
        if(!WebViewFeatureInternal.ALGORITHMIC_DARKENING.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebSettingsCompat.a(webSettings0).setAlgorithmicDarkeningAllowed(z);
    }

    public static void setAttributionRegistrationBehavior(@NonNull WebSettings webSettings0, int v) {
        if(!WebViewFeatureInternal.ATTRIBUTION_REGISTRATION_BEHAVIOR.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebSettingsCompat.a(webSettings0).setAttributionRegistrationBehavior(v);
    }

    public static void setDisabledActionModeMenuItems(@NonNull WebSettings webSettings0, int v) {
        ApiHelperForN.setDisabledActionModeMenuItems(webSettings0, v);
    }

    public static void setEnterpriseAuthenticationAppLinkPolicyEnabled(@NonNull WebSettings webSettings0, boolean z) {
        if(!WebViewFeatureInternal.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebSettingsCompat.a(webSettings0).setEnterpriseAuthenticationAppLinkPolicyEnabled(z);
    }

    // 去混淆评级： 低(20)
    @Deprecated
    public static void setForceDark(@NonNull WebSettings webSettings0, int v) {
        ApiHelperForQ.setForceDark(webSettings0, v);
    }

    @Deprecated
    public static void setForceDarkStrategy(@NonNull WebSettings webSettings0, int v) {
        if(!WebViewFeatureInternal.FORCE_DARK_STRATEGY.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebSettingsCompat.a(webSettings0).setForceDarkStrategy(v);
    }

    public static void setOffscreenPreRaster(@NonNull WebSettings webSettings0, boolean z) {
        ApiHelperForM.setOffscreenPreRaster(webSettings0, z);
    }

    public static void setRequestedWithHeaderOriginAllowList(@NonNull WebSettings webSettings0, @NonNull Set set0) {
        if(!WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebSettingsCompat.a(webSettings0).setRequestedWithHeaderOriginAllowList(set0);
    }

    public static void setSafeBrowsingEnabled(@NonNull WebSettings webSettings0, boolean z) {
        ApiHelperForO.setSafeBrowsingEnabled(webSettings0, z);
    }

    public static void setUserAgentMetadata(@NonNull WebSettings webSettings0, @NonNull UserAgentMetadata userAgentMetadata0) {
        if(!WebViewFeatureInternal.USER_AGENT_METADATA.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebSettingsCompat.a(webSettings0).setUserAgentMetadata(userAgentMetadata0);
    }

    public static void setWebViewMediaIntegrityApiStatus(@NonNull WebSettings webSettings0, @NonNull WebViewMediaIntegrityApiStatusConfig webViewMediaIntegrityApiStatusConfig0) {
        if(!WebViewFeatureInternal.WEBVIEW_MEDIA_INTEGRITY_API_STATUS.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        WebSettingsCompat.a(webSettings0).setWebViewMediaIntegrityApiStatus(webViewMediaIntegrityApiStatusConfig0);
    }
}

