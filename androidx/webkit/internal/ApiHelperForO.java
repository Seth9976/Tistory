package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
public class ApiHelperForO {
    @DoNotInline
    @NonNull
    public static PackageInfo getCurrentWebViewPackage() {
        return WebView.getCurrentWebViewPackage();
    }

    @DoNotInline
    public static boolean getSafeBrowsingEnabled(@NonNull WebSettings webSettings0) {
        return webSettings0.getSafeBrowsingEnabled();
    }

    @DoNotInline
    @Nullable
    public static WebChromeClient getWebChromeClient(@NonNull WebView webView0) {
        return webView0.getWebChromeClient();
    }

    @DoNotInline
    @Nullable
    public static WebViewClient getWebViewClient(@NonNull WebView webView0) {
        return webView0.getWebViewClient();
    }

    @DoNotInline
    public static void setSafeBrowsingEnabled(@NonNull WebSettings webSettings0, boolean z) {
        webSettings0.setSafeBrowsingEnabled(z);
    }
}

