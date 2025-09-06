package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.annotation.NonNull;
import androidx.webkit.WebResourceErrorCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class WebResourceErrorImpl extends WebResourceErrorCompat {
    public WebResourceError a;
    public WebResourceErrorBoundaryInterface b;

    public WebResourceErrorImpl(@NonNull WebResourceError webResourceError0) {
        this.a = webResourceError0;
    }

    public WebResourceErrorImpl(@NonNull InvocationHandler invocationHandler0) {
        this.b = (WebResourceErrorBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, invocationHandler0);
    }

    @Override  // androidx.webkit.WebResourceErrorCompat
    @NonNull
    public CharSequence getDescription() {
        if(this.a == null) {
            this.a = WebViewGlueCommunicator.getCompatConverter().convertWebResourceError(Proxy.getInvocationHandler(this.b));
        }
        return ApiHelperForM.getDescription(this.a);
    }

    @Override  // androidx.webkit.WebResourceErrorCompat
    public int getErrorCode() {
        if(this.a == null) {
            this.a = WebViewGlueCommunicator.getCompatConverter().convertWebResourceError(Proxy.getInvocationHandler(this.b));
        }
        return ApiHelperForM.getErrorCode(this.a);
    }
}

