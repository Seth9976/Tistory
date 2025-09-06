package androidx.webkit.internal;

import android.content.Context;
import android.net.Uri;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import dalvik.system.DelegateLastClassLoader;
import java.util.List;

public abstract class e {
    public static Uri b() {
        return WebView.getSafeBrowsingPrivacyPolicyUrl();
    }

    public static SafeBrowsingResponse c(Object object0) {
        return (SafeBrowsingResponse)object0;
    }

    public static DelegateLastClassLoader d(ClassLoader classLoader0, String s) {
        return new DelegateLastClassLoader(s, classLoader0);
    }

    public static void e() {
    }

    public static void f(Context context0, ValueCallback valueCallback0) {
        WebView.startSafeBrowsing(context0, valueCallback0);
    }

    public static void g(SafeBrowsingResponse safeBrowsingResponse0, boolean z) {
        safeBrowsingResponse0.backToSafety(z);
    }

    public static void h(List list0, ValueCallback valueCallback0) {
        WebView.setSafeBrowsingWhitelist(list0, valueCallback0);
    }

    public static void i(SafeBrowsingResponse safeBrowsingResponse0, boolean z) {
        safeBrowsingResponse0.showInterstitial(z);
    }

    public static void j(SafeBrowsingResponse safeBrowsingResponse0, boolean z) {
        safeBrowsingResponse0.proceed(z);
    }
}

