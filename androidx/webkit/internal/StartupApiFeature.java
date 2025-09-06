package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.ComponentInfoFlags;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.WebViewCompat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class StartupApiFeature {
    public static class NoFramework extends StartupApiFeature {
        @Override  // androidx.webkit.internal.StartupApiFeature
        public final boolean isSupportedByFramework() {
            return false;
        }
    }

    public static class P extends StartupApiFeature {
        @Override  // androidx.webkit.internal.StartupApiFeature
        public final boolean isSupportedByFramework() [...] // 潜在的解密器
    }

    @VisibleForTesting
    public static final String METADATA_HOLDER_SERVICE_NAME = "org.chromium.android_webview.services.StartupFeatureMetadataHolder";
    public final String a;
    public final String b;
    public static final HashSet c;

    static {
        StartupApiFeature.c = new HashSet();
    }

    public StartupApiFeature(String s, String s1) {
        this.a = s;
        this.b = s1;
        StartupApiFeature.c.add(this);
    }

    @NonNull
    public String getPublicFeatureName() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    public boolean isSupported(@NonNull Context context0) {
        return this.isSupportedByFramework() || this.isSupportedByWebView(context0);
    }

    public abstract boolean isSupportedByFramework();

    @ChecksSdkIntAtLeast(api = 21)
    public boolean isSupportedByWebView(@NonNull Context context0) {
        PackageInfo packageInfo0 = WebViewCompat.getCurrentWebViewPackage(context0);
        Bundle bundle0 = null;
        if(packageInfo0 != null) {
            ComponentName componentName0 = new ComponentName(packageInfo0.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
            if(Build.VERSION.SDK_INT >= 33) {
                PackageManager.ComponentInfoFlags packageManager$ComponentInfoFlags0 = ApiHelperForTiramisu.b(640L);
                try {
                    bundle0 = ApiHelperForTiramisu.a(context0.getPackageManager(), componentName0, packageManager$ComponentInfoFlags0).metaData;
                    return bundle0 == null ? false : bundle0.containsKey(this.b);
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                }
                return bundle0 == null ? false : bundle0.containsKey(this.b);
            }
            bundle0 = context0.getPackageManager().getServiceInfo(componentName0, 640).metaData;
            return bundle0 == null ? false : bundle0.containsKey(this.b);
        }
        return bundle0 == null ? false : bundle0.containsKey(this.b);
    }

    @NonNull
    public static Set values() {
        return Collections.unmodifiableSet(StartupApiFeature.c);
    }
}

