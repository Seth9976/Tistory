package androidx.webkit.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public abstract class i {
    public static final WebViewProviderFactory a;

    static {
        WebViewProviderFactoryAdapter webViewProviderFactoryAdapter0;
        InvocationHandler invocationHandler0;
        try {
            invocationHandler0 = WebViewGlueCommunicator.a();
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
        catch(ClassNotFoundException unused_ex) {
            webViewProviderFactoryAdapter0 = new IncompatibleApkWebViewProviderFactory();
            i.a = webViewProviderFactoryAdapter0;
            return;
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException(noSuchMethodException0);
        }
        webViewProviderFactoryAdapter0 = new WebViewProviderFactoryAdapter(((WebViewProviderFactoryBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewProviderFactoryBoundaryInterface.class, invocationHandler0)));
        i.a = webViewProviderFactoryAdapter0;
    }
}

