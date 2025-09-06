package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import androidx.annotation.DoNotInline;

public abstract class a {
    @DoNotInline
    public static void a(Activity activity0) {
        activity0.finishAfterTransition();
    }

    @DoNotInline
    public static void b(Activity activity0) {
        activity0.postponeEnterTransition();
    }

    @DoNotInline
    public static void c(Activity activity0, SharedElementCallback sharedElementCallback0) {
        activity0.setEnterSharedElementCallback(sharedElementCallback0);
    }

    @DoNotInline
    public static void d(Activity activity0, SharedElementCallback sharedElementCallback0) {
        activity0.setExitSharedElementCallback(sharedElementCallback0);
    }

    @DoNotInline
    public static void e(Activity activity0) {
        activity0.startPostponedEnterTransition();
    }
}

