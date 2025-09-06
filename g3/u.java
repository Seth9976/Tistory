package g3;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.Objects;
import sc.b;

public final class u implements Runnable {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public u(int v, int v1, Object object0, Object object1, Object object2) {
        this.a = v1;
        this.c = object0;
        this.d = object1;
        this.b = v;
        this.e = object2;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            TransportContext transportContext0 = (TransportContext)this.d;
            int v = this.b;
            Runnable runnable0 = (Runnable)this.e;
            Uploader uploader0 = (Uploader)this.c;
            SynchronizationGuard synchronizationGuard0 = uploader0.f;
            try {
                Objects.requireNonNull(uploader0.c);
                synchronizationGuard0.runCriticalSection(new b(uploader0.c, 3));
                NetworkInfo networkInfo0 = ((ConnectivityManager)uploader0.a.getSystemService("connectivity")).getActiveNetworkInfo();
                if(networkInfo0 == null || !networkInfo0.isConnected()) {
                    synchronizationGuard0.runCriticalSection(new w6.b(uploader0, transportContext0, v));
                }
                else {
                    uploader0.logAndUpdateState(transportContext0, v);
                }
            }
            catch(SynchronizationException unused_ex) {
                uploader0.d.schedule(transportContext0, v + 1);
            }
            finally {
                runnable0.run();
            }
            return;
        }
        String s = (String)this.d;
        Bundle bundle0 = (Bundle)this.e;
        boolean z = ((v)this.c).a == null;
    }
}

