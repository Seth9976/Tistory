package androidx.webkit;

import androidx.annotation.NonNull;
import h5.a;
import java.util.concurrent.Executor;

public abstract class ProxyController {
    public abstract void clearProxyOverride(@NonNull Executor arg1, @NonNull Runnable arg2);

    @NonNull
    public static ProxyController getInstance() {
        if(!WebViewFeature.isFeatureSupported("PROXY_OVERRIDE")) {
            throw new UnsupportedOperationException("Proxy override not supported");
        }
        return a.a;
    }

    public abstract void setProxyOverride(@NonNull ProxyConfig arg1, @NonNull Executor arg2, @NonNull Runnable arg3);
}

