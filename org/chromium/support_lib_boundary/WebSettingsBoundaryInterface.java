package org.chromium.support_lib_boundary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.Set;

public interface WebSettingsBoundaryInterface {
    @Retention(RetentionPolicy.SOURCE)
    public @interface AttributionBehavior {
        public static final int APP_SOURCE_AND_APP_TRIGGER = 3;
        public static final int APP_SOURCE_AND_WEB_TRIGGER = 1;
        public static final int DISABLED = 0;
        public static final int WEB_SOURCE_AND_WEB_TRIGGER = 2;

    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;

    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface WebAuthnSupport {
        public static final int APP = 1;
        public static final int BROWSER = 2;
        public static final int NONE;

    }

    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface WebViewMediaIntegrityApiStatus {
        public static final int DISABLED = 0;
        public static final int ENABLED = 2;
        public static final int ENABLED_WITHOUT_APP_IDENTITY = 1;

    }

    int getAttributionBehavior();

    int getDisabledActionModeMenuItems();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getOffscreenPreRaster();

    Set getRequestedWithHeaderOriginAllowList();

    boolean getSafeBrowsingEnabled();

    Map getUserAgentMetadataMap();

    int getWebAuthnSupport();

    int getWebViewMediaIntegrityApiDefaultStatus();

    Map getWebViewMediaIntegrityApiOverrideRules();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean arg1);

    void setAttributionBehavior(int arg1);

    void setDisabledActionModeMenuItems(int arg1);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean arg1);

    void setForceDark(int arg1);

    void setForceDarkBehavior(int arg1);

    void setOffscreenPreRaster(boolean arg1);

    void setRequestedWithHeaderOriginAllowList(Set arg1);

    void setSafeBrowsingEnabled(boolean arg1);

    void setUserAgentMetadataFromMap(Map arg1);

    void setWebAuthnSupport(int arg1);

    void setWebViewMediaIntegrityApiStatus(int arg1, Map arg2);

    void setWillSuppressErrorPage(boolean arg1);
}

