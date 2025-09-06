package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import androidx.annotation.DoNotInline;

public abstract class c {
    @DoNotInline
    public static void a(Object object0) {
        ((SharedElementCallback.OnSharedElementsReadyListener)object0).onSharedElementsReady();
    }

    @DoNotInline
    public static void b(Activity activity0, String[] arr_s, int v) {
        activity0.requestPermissions(arr_s, v);
    }

    @DoNotInline
    public static boolean c(Activity activity0, String s) {
        return activity0.shouldShowRequestPermissionRationale(s);
    }
}

