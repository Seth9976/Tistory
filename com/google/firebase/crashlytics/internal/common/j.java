package com.google.firebase.crashlytics.internal.common;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.util.Log;
import androidx.appcompat.app.e0;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.ServiceStarter;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class j implements Runnable {
    public final int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public j(l l0, long v, Throwable throwable0, Thread thread0) {
        this.a = 0;
        super();
        this.e = l0;
        this.b = v;
        this.c = throwable0;
        this.d = thread0;
    }

    public j(FirebaseMessaging firebaseMessaging0, long v) {
        this.a = 1;
        super();
        this.e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.d = firebaseMessaging0;
        this.b = v;
        PowerManager.WakeLock powerManager$WakeLock0 = ((PowerManager)firebaseMessaging0.d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = powerManager$WakeLock0;
        powerManager$WakeLock0.setReferenceCounted(false);
    }

    public boolean a() {
        ConnectivityManager connectivityManager0 = (ConnectivityManager)((FirebaseMessaging)this.d).d.getSystemService("connectivity");
        NetworkInfo networkInfo0 = connectivityManager0 == null ? null : connectivityManager0.getActiveNetworkInfo();
        return networkInfo0 != null && networkInfo0.isConnected();
    }

    public boolean b() {
        try {
            if(((FirebaseMessaging)this.d).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        }
        catch(IOException iOException0) {
        }
        catch(SecurityException unused_ex) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
        String s = iOException0.getMessage();
        if(!"SERVICE_NOT_AVAILABLE".equals(s) && !"INTERNAL_SERVER_ERROR".equals(s) && !"InternalServerError".equals(s)) {
            if(iOException0.getMessage() != null) {
                throw iOException0;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
            return false;
        }
        Log.w("FirebaseMessaging", "Token retrieval failed: " + iOException0.getMessage() + ". Will retry token retrieval");
        return false;
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            ServiceStarter serviceStarter0 = ServiceStarter.a();
            FirebaseMessaging firebaseMessaging0 = (FirebaseMessaging)this.d;
            boolean z = serviceStarter0.c(firebaseMessaging0.d);
            PowerManager.WakeLock powerManager$WakeLock0 = (PowerManager.WakeLock)this.c;
            if(z) {
                powerManager$WakeLock0.acquire();
            }
            try {
                synchronized(firebaseMessaging0) {
                    firebaseMessaging0.m = true;
                }
                if(!firebaseMessaging0.l.d()) {
                    goto label_25;
                }
                else if(!ServiceStarter.a().b(firebaseMessaging0.d) || this.a()) {
                    if(this.b()) {
                        synchronized(firebaseMessaging0) {
                            firebaseMessaging0.m = false;
                        }
                    }
                    else {
                        firebaseMessaging0.h(this.b);
                    }
                    goto label_18;
                }
                else {
                    goto label_20;
                }
                return;
            }
            catch(IOException iOException0) {
                goto label_30;
            }
            catch(Throwable throwable0) {
                goto label_37;
            }
        label_18:
            if(ServiceStarter.a().c(firebaseMessaging0.d)) {
                powerManager$WakeLock0.release();
                return;
                try {
                label_20:
                    e0 e00 = new e0();
                    e00.b = this;
                    e00.a();
                }
                catch(IOException iOException0) {
                    goto label_30;
                }
                catch(Throwable throwable0) {
                    goto label_37;
                }
                if(ServiceStarter.a().c(firebaseMessaging0.d)) {
                    powerManager$WakeLock0.release();
                    return;
                    try {
                        try {
                        label_25:
                            synchronized(firebaseMessaging0) {
                                firebaseMessaging0.m = false;
                            }
                            goto label_40;
                        }
                        catch(IOException iOException0) {
                        }
                    label_30:
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + iOException0.getMessage() + ". Won\'t retry the operation.");
                        synchronized(firebaseMessaging0) {
                            firebaseMessaging0.m = false;
                        }
                    }
                    catch(Throwable throwable0) {
                        goto label_37;
                    }
                    if(ServiceStarter.a().c(firebaseMessaging0.d)) {
                        powerManager$WakeLock0.release();
                        return;
                    }
                    return;
                label_37:
                    if(ServiceStarter.a().c(firebaseMessaging0.d)) {
                        powerManager$WakeLock0.release();
                    }
                    throw throwable0;
                label_40:
                    if(ServiceStarter.a().c(firebaseMessaging0.d)) {
                        powerManager$WakeLock0.release();
                        return;
                    }
                }
            }
            return;
        }
        l l0 = (l)this.e;
        if(l0.m == null || !l0.m.e.get()) {
            long v = this.b / 1000L;
            String s = l0.f();
            if(s == null) {
                Logger.getLogger().w("Tried to write a non-fatal exception while no session was open.");
                return;
            }
            l0.l.persistNonFatalEvent(((Throwable)this.c), ((Thread)this.d), s, v);
        }
    }
}

