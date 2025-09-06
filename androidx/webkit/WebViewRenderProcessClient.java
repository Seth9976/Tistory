package androidx.webkit;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class WebViewRenderProcessClient {
    public abstract void onRenderProcessResponsive(@NonNull WebView arg1, @Nullable WebViewRenderProcess arg2);

    public abstract void onRenderProcessUnresponsive(@NonNull WebView arg1, @Nullable WebViewRenderProcess arg2);
}

