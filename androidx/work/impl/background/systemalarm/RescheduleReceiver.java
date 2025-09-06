package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;

public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a;

    static {
        RescheduleReceiver.a = "WM-RescheduleReceiver";
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        Logger.get().debug("WM-RescheduleReceiver", "Received intent " + intent0);
        try {
            WorkManagerImpl.getInstance(context0).setReschedulePendingResult(this.goAsync());
        }
        catch(IllegalStateException illegalStateException0) {
            Logger.get().error("WM-RescheduleReceiver", "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", illegalStateException0);
        }
    }
}

