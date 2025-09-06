package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.play.core.appupdate.internal.zzl;
import com.google.firebase.crashlytics.internal.common.j;
import com.google.firebase.messaging.FirebaseMessaging;

public final class e0 extends BroadcastReceiver {
    public final int a;
    public Object b;

    public e0() {
        this.a = 2;
        super();
    }

    public e0(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    public void a() {
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter0 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        ((FirebaseMessaging)((j)this.b).d).d.registerReceiver(this, intentFilter0);
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        switch(this.a) {
            case 0: {
                ((f0)this.b).d();
                return;
            }
            case 1: {
                ((zzl)this.b).zza(context0, intent0);
                return;
            }
            default: {
                j j0 = (j)this.b;
                if(j0 != null && j0.a()) {
                    if(Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    j j1 = (j)this.b;
                    ((FirebaseMessaging)j1.d).getClass();
                    FirebaseMessaging.b(0L, j1);
                    ((FirebaseMessaging)((j)this.b).d).d.unregisterReceiver(this);
                    this.b = null;
                }
            }
        }
    }
}

