package androidx.webkit.internal;

import android.os.Build.VERSION;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public abstract class ApiFeature implements ConditionallySupportedFeature {
    public static class M extends ApiFeature {
        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() [...] // Inlined contents
    }

    public static class N extends ApiFeature {
        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() [...] // Inlined contents
    }

    public static class NoFramework extends ApiFeature {
        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return false;
        }
    }

    public static class O extends ApiFeature {
        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() [...] // Inlined contents
    }

    public static class O_MR1 extends ApiFeature {
        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() [...] // 潜在的解密器
    }

    public static class P extends ApiFeature {
        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() [...] // 潜在的解密器
    }

    public static class Q extends ApiFeature {
        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() [...] // 潜在的解密器
    }

    public static class T extends ApiFeature {
        @Override  // androidx.webkit.internal.ApiFeature
        public final boolean isSupportedByFramework() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public final String a;
    public final String b;
    public static final HashSet c;

    static {
        ApiFeature.c = new HashSet();
    }

    public ApiFeature(String s, String s1) {
        this.a = s;
        this.b = s1;
        ApiFeature.c.add(this);
    }

    @Override  // androidx.webkit.internal.ConditionallySupportedFeature
    @NonNull
    public String getPublicFeatureName() {
        return this.a;
    }

    @NonNull
    @VisibleForTesting
    public static Set getWebViewApkFeaturesForTesting() {
        return a.a;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.webkit.internal.ConditionallySupportedFeature
    public boolean isSupported() {
        return this.isSupportedByFramework() || this.isSupportedByWebView();
    }

    public abstract boolean isSupportedByFramework();

    @ChecksSdkIntAtLeast(api = 21)
    public boolean isSupportedByWebView() {
        return BoundaryInterfaceReflectionUtil.containsFeature(a.a, this.b);
    }

    @NonNull
    public static Set values() {
        return Collections.unmodifiableSet(ApiFeature.c);
    }
}

