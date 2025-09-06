package i3;

import android.os.ext.SdkExtensions;
import android.view.WindowInsetsController;
import java.util.concurrent.Flow.Processor;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import org.reactivestreams.Processor;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public abstract class b {
    public static int a() {
        return SdkExtensions.getExtensionVersion(30);
    }

    public static Flow.Processor b(Processor processor0) [...] // Inlined contents

    public static Flow.Publisher c(Publisher publisher0) [...] // Inlined contents

    public static Flow.Subscriber d(Subscriber subscriber0) [...] // Inlined contents

    public static void g(WindowInsetsController windowInsetsController0) {
        windowInsetsController0.setSystemBarsBehavior(2);
    }

    public static void h(WindowInsetsController windowInsetsController0, int v) {
        windowInsetsController0.setSystemBarsAppearance(v, 24);
    }

    public static boolean u(Processor processor0) {
        return processor0 instanceof Flow.Processor;
    }

    public static boolean v(Publisher publisher0) {
        return publisher0 instanceof Flow.Publisher;
    }

    public static boolean w(Subscriber subscriber0) {
        return subscriber0 instanceof Flow.Subscriber;
    }
}

