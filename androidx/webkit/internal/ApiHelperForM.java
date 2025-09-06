package androidx.webkit.internal;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat;
import androidx.webkit.WebViewCompat.VisualStateCallback;

@RequiresApi(23)
public class ApiHelperForM {
    @DoNotInline
    public static void close(@NonNull WebMessagePort webMessagePort0) {
        webMessagePort0.close();
    }

    @DoNotInline
    @NonNull
    public static WebMessage createWebMessage(@NonNull WebMessageCompat webMessageCompat0) {
        return new WebMessage(webMessageCompat0.getData(), WebMessagePortImpl.compatToPorts(webMessageCompat0.getPorts()));
    }

    @DoNotInline
    @NonNull
    public static WebMessagePort[] createWebMessageChannel(@NonNull WebView webView0) {
        return webView0.createWebMessageChannel();
    }

    @DoNotInline
    @NonNull
    public static WebMessageCompat createWebMessageCompat(@NonNull WebMessage webMessage0) {
        return new WebMessageCompat(webMessage0.getData(), WebMessagePortImpl.portsToCompat(webMessage0.getPorts()));
    }

    @DoNotInline
    @NonNull
    public static CharSequence getDescription(@NonNull WebResourceError webResourceError0) {
        return webResourceError0.getDescription();
    }

    @DoNotInline
    public static int getErrorCode(@NonNull WebResourceError webResourceError0) {
        return webResourceError0.getErrorCode();
    }

    @DoNotInline
    public static boolean getOffscreenPreRaster(@NonNull WebSettings webSettings0) {
        return webSettings0.getOffscreenPreRaster();
    }

    @DoNotInline
    public static void postMessage(@NonNull WebMessagePort webMessagePort0, @NonNull WebMessage webMessage0) {
        webMessagePort0.postMessage(webMessage0);
    }

    @DoNotInline
    public static void postVisualStateCallback(@NonNull WebView webView0, long v, @NonNull VisualStateCallback webViewCompat$VisualStateCallback0) {
        webView0.postVisualStateCallback(v, new d(webViewCompat$VisualStateCallback0));
    }

    @DoNotInline
    public static void postWebMessage(@NonNull WebView webView0, @NonNull WebMessage webMessage0, @NonNull Uri uri0) {
        webView0.postWebMessage(webMessage0, uri0);
    }

    @DoNotInline
    public static void setOffscreenPreRaster(@NonNull WebSettings webSettings0, boolean z) {
        webSettings0.setOffscreenPreRaster(z);
    }

    @DoNotInline
    public static void setWebMessageCallback(@NonNull WebMessagePort webMessagePort0, @NonNull WebMessageCallbackCompat webMessagePortCompat$WebMessageCallbackCompat0) {
        webMessagePort0.setWebMessageCallback(new b(webMessagePortCompat$WebMessageCallbackCompat0));
    }

    @DoNotInline
    public static void setWebMessageCallback(@NonNull WebMessagePort webMessagePort0, @NonNull WebMessageCallbackCompat webMessagePortCompat$WebMessageCallbackCompat0, @Nullable Handler handler0) {
        webMessagePort0.setWebMessageCallback(new c(webMessagePortCompat$WebMessageCallbackCompat0), handler0);
    }
}

