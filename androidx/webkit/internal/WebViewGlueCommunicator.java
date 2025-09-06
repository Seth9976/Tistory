package androidx.webkit.internal;

import android.os.Build.VERSION;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WebViewGlueCommunicator {
    public static InvocationHandler a() {
        return (InvocationHandler)Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, WebViewGlueCommunicator.getWebViewClassLoader()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    @NonNull
    public static WebkitToCompatConverter getCompatConverter() {
        return h.a;
    }

    @NonNull
    public static WebViewProviderFactory getFactory() {
        return i.a;
    }

    @NonNull
    public static ClassLoader getWebViewClassLoader() {
        if(Build.VERSION.SDK_INT >= 28) {
            return ApiHelperForP.getWebViewClassLoader();
        }
        try {
            Method method0 = WebView.class.getDeclaredMethod("getFactory", null);
            method0.setAccessible(true);
            return method0.invoke(null, null).getClass().getClassLoader();
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException(noSuchMethodException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
    }
}

