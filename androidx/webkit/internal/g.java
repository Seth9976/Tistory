package androidx.webkit.internal;

import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;

public final class g extends NoFramework {
    @Override  // androidx.webkit.internal.ApiFeature
    public final boolean isSupportedByWebView() {
        if(!super.isSupportedByWebView()) {
            return false;
        }
        return WebViewFeature.isFeatureSupported("MULTI_PROCESS") ? WebViewCompat.isMultiProcessEnabled() : false;
    }
}

