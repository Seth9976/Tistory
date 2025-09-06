package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

public abstract class d {
    // 去混淆评级： 低(20)
    @DoNotInline
    public static Intent a(Context context0, @Nullable BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0, String s, Handler handler0, int v) {
        if((v & 4) != 0 && s == null) {
            if(PermissionChecker.checkSelfPermission(context0, "net.daum.android.tistoryapp.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION") != 0) {
                throw new RuntimeException("Permission net.daum.android.tistoryapp.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION is required by your application to receive broadcasts, please add it to your manifest");
            }
            return context0.registerReceiver(broadcastReceiver0, intentFilter0, "net.daum.android.tistoryapp.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION", handler0);
        }
        return context0.registerReceiver(broadcastReceiver0, intentFilter0, s, handler0, v & 1);
    }

    @DoNotInline
    public static ComponentName b(Context context0, Intent intent0) {
        return context0.startForegroundService(intent0);
    }
}

