package androidx.webkit;

import android.webkit.CookieManager;
import androidx.annotation.NonNull;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import java.util.List;

public class CookieManagerCompat {
    @NonNull
    public static List getCookieInfo(@NonNull CookieManager cookieManager0, @NonNull String s) {
        if(!WebViewFeatureInternal.GET_COOKIE_INFO.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        return WebViewGlueCommunicator.getCompatConverter().convertCookieManager(cookieManager0).getCookieInfo(s);
    }
}

