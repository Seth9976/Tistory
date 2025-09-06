package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

public abstract class g {
    @DoNotInline
    public static Intent a(Context context0, @Nullable BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0, String s, Handler handler0, int v) {
        return context0.registerReceiver(broadcastReceiver0, intentFilter0, s, handler0, v);
    }
}

