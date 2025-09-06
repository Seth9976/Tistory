package org.chromium.support_lib_boundary;

import android.content.Context;
import android.net.Uri;
import android.webkit.ValueCallback;
import java.util.List;
import java.util.Set;

public interface StaticsBoundaryInterface {
    Uri getSafeBrowsingPrivacyPolicyUrl();

    String getVariationsHeader();

    void initSafeBrowsing(Context arg1, ValueCallback arg2);

    boolean isMultiProcessEnabled();

    void setSafeBrowsingAllowlist(Set arg1, ValueCallback arg2);

    void setSafeBrowsingWhitelist(List arg1, ValueCallback arg2);
}

