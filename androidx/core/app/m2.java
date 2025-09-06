package androidx.core.app;

import android.app.Notification;
import android.support.v4.app.INotificationSideChannel;
import r0.a;

public final class m2 implements Task {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public m2(String s, int v, String s1, Notification notification0) {
        this.a = s;
        this.b = v;
        this.c = s1;
        this.d = notification0;
    }

    @Override  // androidx.core.app.NotificationManagerCompat$Task
    public final void send(INotificationSideChannel iNotificationSideChannel0) {
        iNotificationSideChannel0.notify(this.a, this.b, this.c, this.d);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("NotifyTask[packageName:");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", id:");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", tag:");
        return a.o(stringBuilder0, this.c, "]");
    }
}

