package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.UserAgentMetadata.BrandVersion;
import androidx.webkit.UserAgentMetadata.Builder;
import androidx.webkit.UserAgentMetadata;
import androidx.webkit.WebViewMediaIntegrityApiStatusConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

public class WebSettingsAdapter {
    public final WebSettingsBoundaryInterface a;

    public WebSettingsAdapter(@NonNull WebSettingsBoundaryInterface webSettingsBoundaryInterface0) {
        this.a = webSettingsBoundaryInterface0;
    }

    public int getAttributionRegistrationBehavior() {
        return this.a.getAttributionBehavior();
    }

    public int getDisabledActionModeMenuItems() {
        return this.a.getDisabledActionModeMenuItems();
    }

    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled() {
        return this.a.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int getForceDark() {
        return this.a.getForceDark();
    }

    public int getForceDarkStrategy() {
        return this.a.getForceDarkBehavior();
    }

    public boolean getOffscreenPreRaster() {
        return this.a.getOffscreenPreRaster();
    }

    @NonNull
    public Set getRequestedWithHeaderOriginAllowList() {
        return this.a.getRequestedWithHeaderOriginAllowList();
    }

    public boolean getSafeBrowsingEnabled() {
        return this.a.getSafeBrowsingEnabled();
    }

    @NonNull
    public UserAgentMetadata getUserAgentMetadata() {
        Map map0 = this.a.getUserAgentMetadataMap();
        Builder userAgentMetadata$Builder0 = new Builder();
        Object object0 = map0.get("BRAND_VERSION_LIST");
        if(object0 != null) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < ((String[][])object0).length; ++v) {
                String[] arr_s = ((String[][])object0)[v];
                arrayList0.add(new androidx.webkit.UserAgentMetadata.BrandVersion.Builder().setBrand(arr_s[0]).setMajorVersion(arr_s[1]).setFullVersion(arr_s[2]).build());
            }
            userAgentMetadata$Builder0.setBrandVersionList(arrayList0);
        }
        String s = (String)map0.get("FULL_VERSION");
        if(s != null) {
            userAgentMetadata$Builder0.setFullVersion(s);
        }
        String s1 = (String)map0.get("PLATFORM");
        if(s1 != null) {
            userAgentMetadata$Builder0.setPlatform(s1);
        }
        String s2 = (String)map0.get("PLATFORM_VERSION");
        if(s2 != null) {
            userAgentMetadata$Builder0.setPlatformVersion(s2);
        }
        String s3 = (String)map0.get("ARCHITECTURE");
        if(s3 != null) {
            userAgentMetadata$Builder0.setArchitecture(s3);
        }
        String s4 = (String)map0.get("MODEL");
        if(s4 != null) {
            userAgentMetadata$Builder0.setModel(s4);
        }
        Boolean boolean0 = (Boolean)map0.get("MOBILE");
        if(boolean0 != null) {
            userAgentMetadata$Builder0.setMobile(boolean0.booleanValue());
        }
        Integer integer0 = (Integer)map0.get("BITNESS");
        if(integer0 != null) {
            userAgentMetadata$Builder0.setBitness(((int)integer0));
        }
        Boolean boolean1 = (Boolean)map0.get("WOW64");
        if(boolean1 != null) {
            userAgentMetadata$Builder0.setWow64(boolean1.booleanValue());
        }
        return userAgentMetadata$Builder0.build();
    }

    @NonNull
    public WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus() {
        return new androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder(this.a.getWebViewMediaIntegrityApiDefaultStatus()).setOverrideRules(this.a.getWebViewMediaIntegrityApiOverrideRules()).build();
    }

    public boolean isAlgorithmicDarkeningAllowed() {
        return this.a.isAlgorithmicDarkeningAllowed();
    }

    public void setAlgorithmicDarkeningAllowed(boolean z) {
        this.a.setAlgorithmicDarkeningAllowed(z);
    }

    public void setAttributionRegistrationBehavior(int v) {
        this.a.setAttributionBehavior(v);
    }

    public void setDisabledActionModeMenuItems(int v) {
        this.a.setDisabledActionModeMenuItems(v);
    }

    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z) {
        this.a.setEnterpriseAuthenticationAppLinkPolicyEnabled(z);
    }

    public void setForceDark(int v) {
        this.a.setForceDark(v);
    }

    public void setForceDarkStrategy(int v) {
        this.a.setForceDarkBehavior(v);
    }

    public void setOffscreenPreRaster(boolean z) {
        this.a.setOffscreenPreRaster(z);
    }

    public void setRequestedWithHeaderOriginAllowList(@NonNull Set set0) {
        this.a.setRequestedWithHeaderOriginAllowList(set0);
    }

    public void setSafeBrowsingEnabled(boolean z) {
        this.a.setSafeBrowsingEnabled(z);
    }

    public void setUserAgentMetadata(@NonNull UserAgentMetadata userAgentMetadata0) {
        String[][] arr2_s;
        HashMap hashMap0 = new HashMap();
        List list0 = userAgentMetadata0.getBrandVersionList();
        if(list0 == null || list0.isEmpty()) {
            arr2_s = null;
        }
        else {
            arr2_s = new String[list0.size()][3];
            for(int v = 0; v < list0.size(); ++v) {
                String[] arr_s = arr2_s[v];
                arr_s[0] = ((BrandVersion)list0.get(v)).getBrand();
                String[] arr_s1 = arr2_s[v];
                arr_s1[1] = ((BrandVersion)list0.get(v)).getMajorVersion();
                String[] arr_s2 = arr2_s[v];
                arr_s2[2] = ((BrandVersion)list0.get(v)).getFullVersion();
            }
        }
        hashMap0.put("BRAND_VERSION_LIST", arr2_s);
        hashMap0.put("FULL_VERSION", userAgentMetadata0.getFullVersion());
        hashMap0.put("PLATFORM", userAgentMetadata0.getPlatform());
        hashMap0.put("PLATFORM_VERSION", userAgentMetadata0.getPlatformVersion());
        hashMap0.put("ARCHITECTURE", userAgentMetadata0.getArchitecture());
        hashMap0.put("MODEL", userAgentMetadata0.getModel());
        hashMap0.put("MOBILE", Boolean.valueOf(userAgentMetadata0.isMobile()));
        hashMap0.put("BITNESS", userAgentMetadata0.getBitness());
        hashMap0.put("WOW64", Boolean.valueOf(userAgentMetadata0.isWow64()));
        this.a.setUserAgentMetadataFromMap(hashMap0);
    }

    public void setWebViewMediaIntegrityApiStatus(@NonNull WebViewMediaIntegrityApiStatusConfig webViewMediaIntegrityApiStatusConfig0) {
        this.a.setWebViewMediaIntegrityApiStatus(webViewMediaIntegrityApiStatusConfig0.getDefaultStatus(), webViewMediaIntegrityApiStatusConfig0.getOverrideRules());
    }
}

