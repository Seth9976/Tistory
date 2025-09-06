package androidx.core.app;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.DoNotInline;

public abstract class b {
    @DoNotInline
    public static Uri a(Activity activity0) {
        return activity0.getReferrer();
    }
}

