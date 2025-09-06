package org.chromium.support_lib_boundary;

import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;

public interface WebViewProviderBoundaryInterface {
    InvocationHandler addDocumentStartJavaScript(String arg1, String[] arg2);

    void addWebMessageListener(String arg1, String[] arg2, InvocationHandler arg3);

    InvocationHandler[] createWebMessageChannel();

    InvocationHandler getProfile();

    WebChromeClient getWebChromeClient();

    WebViewClient getWebViewClient();

    InvocationHandler getWebViewRenderer();

    InvocationHandler getWebViewRendererClient();

    void insertVisualStateCallback(long arg1, InvocationHandler arg2);

    void postMessageToMainFrame(InvocationHandler arg1, Uri arg2);

    void removeWebMessageListener(String arg1);

    void setProfile(String arg1);

    void setWebViewRendererClient(InvocationHandler arg1);
}

