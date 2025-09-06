package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

public class WebViewMediaIntegrityApiStatusConfig {
    public static final class Builder {
        public final int a;
        public Map b;

        public Builder(int v) {
            this.a = v;
            this.b = new HashMap();
        }

        @NonNull
        public Builder addOverrideRule(@NonNull String s, int v) {
            this.b.put(s, v);
            return this;
        }

        @NonNull
        public WebViewMediaIntegrityApiStatusConfig build() {
            return new WebViewMediaIntegrityApiStatusConfig(this);
        }

        @NonNull
        @RestrictTo({Scope.LIBRARY})
        public Builder setOverrideRules(@NonNull Map map0) {
            this.b = map0;
            return this;
        }
    }

    public static final int WEBVIEW_MEDIA_INTEGRITY_API_DISABLED = 0;
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_ENABLED = 2;
    public static final int WEBVIEW_MEDIA_INTEGRITY_API_ENABLED_WITHOUT_APP_IDENTITY = 1;
    public final int a;
    public final Map b;

    public WebViewMediaIntegrityApiStatusConfig(@NonNull Builder webViewMediaIntegrityApiStatusConfig$Builder0) {
        this.a = webViewMediaIntegrityApiStatusConfig$Builder0.a;
        this.b = webViewMediaIntegrityApiStatusConfig$Builder0.b;
    }

    public int getDefaultStatus() {
        return this.a;
    }

    @NonNull
    public Map getOverrideRules() {
        return this.b;
    }
}

