package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.DeprecatedSinceApi;

public abstract class NotificationCompatSideChannelService extends Service {
    public abstract void cancel(String arg1, int arg2, String arg3);

    public abstract void cancelAll(String arg1);

    public abstract void notify(String arg1, int arg2, String arg3, Notification arg4);

    @Override  // android.app.Service
    @DeprecatedSinceApi(api = 19, message = "SDKs past 19 have no need for side channeling.")
    public IBinder onBind(Intent intent0) {
        intent0.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL");
        return null;
    }
}

