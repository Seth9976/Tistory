package androidx.core.view;

import android.view.Window;
import androidx.annotation.DoNotInline;

public abstract class d1 {
    @DoNotInline
    public static Object a(Window window0, int v) {
        return window0.requireViewById(v);
    }
}

