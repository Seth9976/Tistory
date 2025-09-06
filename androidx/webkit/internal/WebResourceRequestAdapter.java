package androidx.webkit.internal;

import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

public class WebResourceRequestAdapter {
    public final WebResourceRequestBoundaryInterface a;

    public WebResourceRequestAdapter(@NonNull WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface0) {
        this.a = webResourceRequestBoundaryInterface0;
    }

    public boolean isRedirect() {
        return this.a.isRedirect();
    }
}

