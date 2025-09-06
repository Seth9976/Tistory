package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import androidx.annotation.DoNotInline;

public abstract class d3 {
    @DoNotInline
    public static void a(Service service0, int v, Notification notification0, int v1) {
        if(v1 != -1 && v1 != 0) {
            service0.startForeground(v, notification0, v1 & 0xFF);
            return;
        }
        service0.startForeground(v, notification0, v1);
    }
}

