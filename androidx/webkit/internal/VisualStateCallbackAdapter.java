package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat.VisualStateCallback;
import org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface;

public class VisualStateCallbackAdapter implements VisualStateCallbackBoundaryInterface {
    public final VisualStateCallback a;

    public VisualStateCallbackAdapter(@NonNull VisualStateCallback webViewCompat$VisualStateCallback0) {
        this.a = webViewCompat$VisualStateCallback0;
    }

    @Override  // org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface
    public void onComplete(long v) {
        this.a.onComplete(v);
    }
}

