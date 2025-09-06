package androidx.core.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.Action;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import java.util.ArrayList;

public abstract class s1 {
    @DoNotInline
    public static Notification.Action.Builder a(Notification.Action.Builder notification$Action$Builder0, Bundle bundle0) {
        return notification$Action$Builder0.addExtras(bundle0);
    }

    @DoNotInline
    public static Notification.Action.Builder b(Notification.Action.Builder notification$Action$Builder0, RemoteInput remoteInput0) {
        return notification$Action$Builder0.addRemoteInput(remoteInput0);
    }

    @DoNotInline
    public static Notification.Action c(Notification.Action.Builder notification$Action$Builder0) {
        return notification$Action$Builder0.build();
    }

    @DoNotInline
    public static Notification.Action.Builder d(int v, CharSequence charSequence0, PendingIntent pendingIntent0) {
        return new Notification.Action.Builder(v, charSequence0, pendingIntent0);
    }

    @DoNotInline
    public static Action e(ArrayList arrayList0, int v) {
        return NotificationCompat.a(((Notification.Action)arrayList0.get(v)));
    }
}

