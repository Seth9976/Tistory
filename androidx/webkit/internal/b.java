package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort.WebMessageCallback;
import android.webkit.WebMessagePort;
import androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat;

public final class b extends WebMessagePort.WebMessageCallback {
    public final WebMessageCallbackCompat a;

    public b(WebMessageCallbackCompat webMessagePortCompat$WebMessageCallbackCompat0) {
        this.a = webMessagePortCompat$WebMessageCallbackCompat0;
        super();
    }

    @Override  // android.webkit.WebMessagePort$WebMessageCallback
    public final void onMessage(WebMessagePort webMessagePort0, WebMessage webMessage0) {
        new WebMessagePortImpl(webMessagePort0);
        WebMessagePortImpl.frameworkMessageToCompat(webMessage0);
    }
}

