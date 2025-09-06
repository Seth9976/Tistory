package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver.PendingResult;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.provider.q;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a;

    static {
        ConstraintProxyUpdateReceiver.a = "WM-ConstrntProxyUpdtRec";
    }

    @NonNull
    public static Intent newConstraintProxyUpdateIntent(@NonNull Context context0, boolean z, boolean z1, boolean z2, boolean z3) {
        Intent intent0 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent0.setComponent(new ComponentName(context0, ConstraintProxyUpdateReceiver.class));
        intent0.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z1).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z3);
        return intent0;
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context0, @Nullable Intent intent0) {
        String s = intent0 == null ? null : intent0.getAction();
        if(!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(s)) {
            Logger.get().debug("WM-ConstrntProxyUpdtRec", "Ignoring unknown action " + s);
            return;
        }
        BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.goAsync();
        WorkManagerImpl.getInstance(context0).getWorkTaskExecutor().executeOnTaskThread(new q(intent0, context0, broadcastReceiver$PendingResult0));
    }
}

