package y6;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class a extends Thread {
    public final WeakReference a;
    public final long b;
    public final CountDownLatch c;
    public boolean d;

    public a(AdvertisingIdClient advertisingIdClient0, long v) {
        this.a = new WeakReference(advertisingIdClient0);
        this.b = v;
        this.c = new CountDownLatch(1);
        this.d = false;
        this.start();
    }

    @Override
    public final void run() {
        WeakReference weakReference0;
        try {
            weakReference0 = this.a;
            if(!this.c.await(this.b, TimeUnit.MILLISECONDS)) {
                AdvertisingIdClient advertisingIdClient0 = (AdvertisingIdClient)weakReference0.get();
                if(advertisingIdClient0 != null) {
                    advertisingIdClient0.zza();
                    this.d = true;
                }
            }
        }
        catch(InterruptedException unused_ex) {
            AdvertisingIdClient advertisingIdClient1 = (AdvertisingIdClient)weakReference0.get();
            if(advertisingIdClient1 != null) {
                advertisingIdClient1.zza();
                this.d = true;
            }
        }
    }
}

