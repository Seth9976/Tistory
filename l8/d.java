package l8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.FirebaseApp;
import java.util.concurrent.atomic.AtomicReference;

public final class d extends BroadcastReceiver {
    public final Context a;
    public static final AtomicReference b;

    static {
        d.b = new AtomicReference();
    }

    public d(Context context0) {
        this.a = context0;
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        synchronized(FirebaseApp.k) {
            for(Object object1: FirebaseApp.m.values()) {
                ((FirebaseApp)object1).c();
            }
        }
        this.a.unregisterReceiver(this);
    }
}

