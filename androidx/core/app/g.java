package androidx.core.app;

import android.app.Activity;
import androidx.annotation.DoNotInline;

public abstract class g {
    @DoNotInline
    public static boolean a(Activity activity0, String s) {
        return activity0.shouldShowRequestPermissionRationale(s);
    }
}

