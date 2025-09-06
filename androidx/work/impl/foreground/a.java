package androidx.work.impl.foreground;

import android.app.Notification;
import android.os.Build.VERSION;

public final class a implements Runnable {
    public final int a;
    public final Notification b;
    public final int c;
    public final SystemForegroundService d;

    public a(SystemForegroundService systemForegroundService0, int v, Notification notification0, int v1) {
        this.d = systemForegroundService0;
        this.a = v;
        this.b = notification0;
        this.c = v1;
    }

    @Override
    public final void run() {
        int v = Build.VERSION.SDK_INT;
        int v1 = this.c;
        Notification notification0 = this.b;
        int v2 = this.a;
        SystemForegroundService systemForegroundService0 = this.d;
        if(v >= 0x1F) {
            d.a(systemForegroundService0, v2, notification0, v1);
            return;
        }
        if(v >= 29) {
            c.a(systemForegroundService0, v2, notification0, v1);
            return;
        }
        systemForegroundService0.startForeground(v2, notification0);
    }
}

