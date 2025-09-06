package androidx.core.app;

import android.app.PendingIntent.OnFinished;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

public final class s2 implements PendingIntent.OnFinished {
    public final t2 a;

    public s2(t2 t20) {
        this.a = t20;
    }

    @Override  // android.app.PendingIntent$OnFinished
    public final void onSendFinished(PendingIntent pendingIntent0, Intent intent0, int v, String s, Bundle bundle0) {
        t2 t20 = this.a;
        t20.getClass();
        boolean z = false;
        while(true) {
            try {
                t20.a.await();
                break;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                if(z) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        PendingIntent.OnFinished pendingIntent$OnFinished0 = t20.b;
        if(pendingIntent$OnFinished0 != null) {
            pendingIntent$OnFinished0.onSendFinished(pendingIntent0, intent0, v, s, bundle0);
            t20.b = null;
        }
    }
}

