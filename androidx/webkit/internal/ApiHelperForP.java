package androidx.webkit.internal;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.accessibility.e;
import androidx.webkit.TracingConfig;
import java.io.OutputStream;
import java.util.concurrent.Executor;

@RequiresApi(28)
public class ApiHelperForP {
    @DoNotInline
    @NonNull
    public static TracingController getTracingControllerInstance() {
        return TracingController.getInstance();
    }

    @DoNotInline
    @NonNull
    public static ClassLoader getWebViewClassLoader() {
        return WebView.getWebViewClassLoader();
    }

    @DoNotInline
    @NonNull
    public static Looper getWebViewLooper(@NonNull WebView webView0) {
        return webView0.getWebViewLooper();
    }

    @DoNotInline
    public static boolean isTracing(@NonNull TracingController tracingController0) {
        return tracingController0.isTracing();
    }

    @DoNotInline
    public static void setDataDirectorySuffix(@NonNull String s) {
        WebView.setDataDirectorySuffix(s);
    }

    @DoNotInline
    public static void start(@NonNull TracingController tracingController0, @NonNull TracingConfig tracingConfig0) {
        tracingController0.start(e.g().addCategories(new int[]{tracingConfig0.getPredefinedCategories()}).addCategories(tracingConfig0.getCustomIncludedCategories()).setTracingMode(tracingConfig0.getTracingMode()).build());
    }

    @DoNotInline
    public static boolean stop(@NonNull TracingController tracingController0, @Nullable OutputStream outputStream0, @NonNull Executor executor0) {
        return tracingController0.stop(outputStream0, executor0);
    }
}

