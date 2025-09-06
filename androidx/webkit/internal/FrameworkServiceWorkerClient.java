package androidx.webkit.internal;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.ServiceWorkerClientCompat;

@RequiresApi(24)
public class FrameworkServiceWorkerClient extends ServiceWorkerClient {
    public final ServiceWorkerClientCompat a;

    public FrameworkServiceWorkerClient(@NonNull ServiceWorkerClientCompat serviceWorkerClientCompat0) {
        this.a = serviceWorkerClientCompat0;
    }

    @Override  // android.webkit.ServiceWorkerClient
    @Nullable
    public WebResourceResponse shouldInterceptRequest(@NonNull WebResourceRequest webResourceRequest0) {
        return this.a.shouldInterceptRequest(webResourceRequest0);
    }
}

