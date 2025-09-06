package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.Profile;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat.VisualStateCallback;
import androidx.webkit.WebViewCompat.WebMessageListener;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class WebViewProviderAdapter {
    public final WebViewProviderBoundaryInterface a;

    public WebViewProviderAdapter(@NonNull WebViewProviderBoundaryInterface webViewProviderBoundaryInterface0) {
        this.a = webViewProviderBoundaryInterface0;
    }

    @NonNull
    public ScriptHandlerImpl addDocumentStartJavaScript(@NonNull String s, @NonNull String[] arr_s) {
        return ScriptHandlerImpl.toScriptHandler(this.a.addDocumentStartJavaScript(s, arr_s));
    }

    public void addWebMessageListener(@NonNull String s, @NonNull String[] arr_s, @NonNull WebMessageListener webViewCompat$WebMessageListener0) {
        InvocationHandler invocationHandler0 = BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageListenerAdapter(webViewCompat$WebMessageListener0));
        this.a.addWebMessageListener(s, arr_s, invocationHandler0);
    }

    @NonNull
    public WebMessagePortCompat[] createWebMessageChannel() {
        InvocationHandler[] arr_invocationHandler = this.a.createWebMessageChannel();
        WebMessagePortCompat[] arr_webMessagePortCompat = new WebMessagePortCompat[arr_invocationHandler.length];
        for(int v = 0; v < arr_invocationHandler.length; ++v) {
            arr_webMessagePortCompat[v] = new WebMessagePortImpl(arr_invocationHandler[v]);
        }
        return arr_webMessagePortCompat;
    }

    @NonNull
    public Profile getProfile() {
        InvocationHandler invocationHandler0 = this.a.getProfile();
        return new ProfileImpl(((ProfileBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProfileBoundaryInterface.class, invocationHandler0)));
    }

    @Nullable
    public WebChromeClient getWebChromeClient() {
        return this.a.getWebChromeClient();
    }

    @NonNull
    public WebViewClient getWebViewClient() {
        return this.a.getWebViewClient();
    }

    @Nullable
    public WebViewRenderProcess getWebViewRenderProcess() {
        return WebViewRenderProcessImpl.forInvocationHandler(this.a.getWebViewRenderer());
    }

    @Nullable
    @RequiresApi(19)
    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        InvocationHandler invocationHandler0 = this.a.getWebViewRendererClient();
        return invocationHandler0 == null ? null : ((WebViewRenderProcessClientAdapter)BoundaryInterfaceReflectionUtil.getDelegateFromInvocationHandler(invocationHandler0)).getWebViewRenderProcessClient();
    }

    public void insertVisualStateCallback(long v, @NonNull VisualStateCallback webViewCompat$VisualStateCallback0) {
        InvocationHandler invocationHandler0 = BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new VisualStateCallbackAdapter(webViewCompat$VisualStateCallback0));
        this.a.insertVisualStateCallback(v, invocationHandler0);
    }

    public void postWebMessage(@NonNull WebMessageCompat webMessageCompat0, @NonNull Uri uri0) {
        InvocationHandler invocationHandler0 = BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessageAdapter(webMessageCompat0));
        this.a.postMessageToMainFrame(invocationHandler0, uri0);
    }

    public void removeWebMessageListener(@NonNull String s) {
        this.a.removeWebMessageListener(s);
    }

    public void setProfileWithName(@NonNull String s) {
        this.a.setProfile(s);
    }

    @SuppressLint({"LambdaLast"})
    public void setWebViewRenderProcessClient(@Nullable Executor executor0, @Nullable WebViewRenderProcessClient webViewRenderProcessClient0) {
        InvocationHandler invocationHandler0 = webViewRenderProcessClient0 == null ? null : BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebViewRenderProcessClientAdapter(executor0, webViewRenderProcessClient0));
        this.a.setWebViewRendererClient(invocationHandler0);
    }
}

