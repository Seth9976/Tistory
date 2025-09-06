package androidx.core.app;

import android.app.Service;
import androidx.annotation.DoNotInline;

public abstract class c3 {
    @DoNotInline
    public static void a(Service service0, int v) {
        service0.stopForeground(v);
    }
}

