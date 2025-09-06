package androidx.core.app;

import android.app.Dialog;
import androidx.annotation.DoNotInline;

public abstract class w {
    @DoNotInline
    public static Object a(Dialog dialog0, int v) {
        return dialog0.requireViewById(v);
    }
}

