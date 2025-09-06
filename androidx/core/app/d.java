package androidx.core.app;

import android.app.Activity;
import androidx.annotation.DoNotInline;

public abstract class d {
    @DoNotInline
    public static Object a(Activity activity0, int v) {
        return activity0.requireViewById(v);
    }
}

