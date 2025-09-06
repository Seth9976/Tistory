package androidx.webkit;

import android.webkit.WebResourceRequest;
import androidx.annotation.NonNull;
import androidx.webkit.internal.ApiHelperForN;

public class WebResourceRequestCompat {
    public static boolean isRedirect(@NonNull WebResourceRequest webResourceRequest0) {
        return ApiHelperForN.isRedirect(webResourceRequest0);
    }
}

