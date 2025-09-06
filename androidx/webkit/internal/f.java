package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import androidx.webkit.WebViewCompat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f extends T {
    public final Pattern d;

    public f() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override  // androidx.webkit.internal.ApiFeature
    public final boolean isSupportedByWebView() {
        boolean z = super.isSupportedByWebView();
        if(z && Build.VERSION.SDK_INT < 29) {
            PackageInfo packageInfo0 = WebViewCompat.getCurrentLoadedWebViewPackage();
            if(packageInfo0 == null) {
                return false;
            }
            Matcher matcher0 = this.d.matcher(packageInfo0.versionName);
            return matcher0.find() && Integer.parseInt(packageInfo0.versionName.substring(matcher0.start(), matcher0.end())) >= 105;
        }
        return z;
    }
}

