package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.annotation.DoNotInline;
import androidx.work.Logger;

public abstract class d {
    @DoNotInline
    public static void a(Service service0, int v, Notification notification0, int v1) {
        try {
            service0.startForeground(v, notification0, v1);
        }
        catch(ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException0) {
            Logger.get().warning("WM-SystemFgService", "Unable to start foreground service", foregroundServiceStartNotAllowedException0);
        }
        catch(SecurityException securityException0) {
            Logger.get().warning("WM-SystemFgService", "Unable to start foreground service", securityException0);
        }
    }
}

