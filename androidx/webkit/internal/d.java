package androidx.webkit.internal;

import android.webkit.WebView.VisualStateCallback;
import androidx.webkit.WebViewCompat.VisualStateCallback;

public final class d extends WebView.VisualStateCallback {
    public final VisualStateCallback a;

    public d(VisualStateCallback webViewCompat$VisualStateCallback0) {
        this.a = webViewCompat$VisualStateCallback0;
        super();
    }

    @Override  // android.webkit.WebView$VisualStateCallback
    public final void onComplete(long v) {
        this.a.onComplete(v);
    }
}

