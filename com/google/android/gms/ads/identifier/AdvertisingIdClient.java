package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import jeb.synthetic.FIN;
import y6.a;

@KeepForSdk
@ParametersAreNonnullByDefault
public class AdvertisingIdClient {
    @KeepForSdkWithMembers
    public static final class Info {
        public final String a;
        public final boolean b;

        @Deprecated
        public Info(@Nullable String s, boolean z) {
            this.a = s;
            this.b = z;
        }

        @Nullable
        public String getId() {
            return this.a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.b;
        }

        @Override
        @NonNull
        public String toString() {
            return "{" + this.a + "}" + this.b;
        }
    }

    public BlockingServiceConnection a;
    public zzf b;
    public boolean c;
    public final Object d;
    public a e;
    public final Context f;
    public final long g;

    @KeepForSdk
    public AdvertisingIdClient(@NonNull Context context0) {
        this(context0, 30000L, false, false);
    }

    @VisibleForTesting
    public AdvertisingIdClient(@NonNull Context context0, long v, boolean z, boolean z1) {
        this.d = new Object();
        Preconditions.checkNotNull(context0);
        if(z) {
            Context context1 = context0.getApplicationContext();
            if(context1 != null) {
                context0 = context1;
            }
        }
        this.f = context0;
        this.c = false;
        this.g = v;
    }

    public static void a(Info advertisingIdClient$Info0, long v, Throwable throwable0) {
        if(Math.random() <= 0.0) {
            HashMap hashMap0 = new HashMap();
            String s = "1";
            hashMap0.put("app_context", "1");
            if(advertisingIdClient$Info0 != null) {
                if(!advertisingIdClient$Info0.isLimitAdTrackingEnabled()) {
                    s = "0";
                }
                hashMap0.put("limit_ad_tracking", s);
                String s1 = advertisingIdClient$Info0.getId();
                if(s1 != null) {
                    hashMap0.put("ad_id_size", Integer.toString(s1.length()));
                }
            }
            if(throwable0 != null) {
                hashMap0.put("error", throwable0.getClass().getName());
            }
            hashMap0.put("tag", "AdvertisingIdClient");
            hashMap0.put("time_spent", Long.toString(v));
            new com.google.android.gms.ads.identifier.a(hashMap0).start();
        }
    }

    public final Info b() {
        Info advertisingIdClient$Info0;
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized(this) {
            if(!this.c) {
                Object object0 = this.d;
                synchronized(object0) {
                    if(this.e == null || !this.e.d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    this.zzb(false);
                }
                catch(Exception exception0) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", exception0);
                }
                if(!this.c) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.");
                }
            }
            Preconditions.checkNotNull(this.a);
            Preconditions.checkNotNull(this.b);
            try {
                advertisingIdClient$Info0 = new Info(this.b.zzc(), this.b.zze(true));
            }
            catch(RemoteException remoteException0) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", remoteException0);
                throw new IOException("Remote exception");
            }
        }
        this.c();
        return advertisingIdClient$Info0;
    }

    public final void c() {
        synchronized(this.d) {
            a a0 = this.e;
            if(a0 != null) {
                a0.c.countDown();
                try {
                    this.e.join();
                }
                catch(InterruptedException unused_ex) {
                }
            }
            long v1 = this.g;
            if(v1 > 0L) {
                this.e = new a(this, v1);
            }
        }
    }

    @Override
    public final void finalize() throws Throwable {
        this.zza();
        super.finalize();
    }

    @NonNull
    @KeepForSdk
    public static Info getAdvertisingIdInfo(@NonNull Context context0) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        Info advertisingIdClient$Info0;
        AdvertisingIdClient advertisingIdClient0 = new AdvertisingIdClient(context0, -1L, true, false);
        try {
            long v = SystemClock.elapsedRealtime();
            advertisingIdClient0.zzb(false);
            advertisingIdClient$Info0 = advertisingIdClient0.b();
            AdvertisingIdClient.a(advertisingIdClient$Info0, SystemClock.elapsedRealtime() - v, null);
        }
        catch(Throwable throwable0) {
            try {
                AdvertisingIdClient.a(null, -1L, throwable0);
                throw throwable0;
            }
            catch(Throwable throwable1) {
                advertisingIdClient0.zza();
                throw throwable1;
            }
        }
        advertisingIdClient0.zza();
        return advertisingIdClient$Info0;
    }

    @NonNull
    @KeepForSdk
    public Info getInfo() throws IOException {
        return this.b();
    }

    @KeepForSdk
    public static boolean getIsAdIdFakeForDebugLogging(@NonNull Context context0) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        boolean z;
        AdvertisingIdClient advertisingIdClient0 = new AdvertisingIdClient(context0, -1L, false, false);
        try {
            advertisingIdClient0.zzb(false);
            Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
            synchronized(advertisingIdClient0) {
                if(!advertisingIdClient0.c) {
                    Object object0 = advertisingIdClient0.d;
                    synchronized(object0) {
                        if(advertisingIdClient0.e == null || !advertisingIdClient0.e.d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient0.zzb(false);
                    }
                    catch(Exception exception0) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", exception0);
                    }
                    if(!advertisingIdClient0.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                }
                Preconditions.checkNotNull(advertisingIdClient0.a);
                Preconditions.checkNotNull(advertisingIdClient0.b);
                try {
                    z = advertisingIdClient0.b.zzd();
                }
                catch(RemoteException remoteException0) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", remoteException0);
                    throw new IOException("Remote exception");
                }
            }
            advertisingIdClient0.c();
            return z;
        }
        finally {
            advertisingIdClient0.zza();
        }
    }

    @KeepForSdk
    @ShowFirstParty
    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    @KeepForSdk
    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        this.zzb(true);
    }

    public final void zza() {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        synchronized(this) {
            if(this.f != null && this.a != null) {
                if(this.c) {
                    try {
                        ConnectionTracker.getInstance().unbindService(this.f, this.a);
                    }
                    catch(Throwable throwable0) {
                        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", throwable0);
                    }
                }
                this.c = false;
                this.b = null;
                this.a = null;
            }
        }
    }

    @VisibleForTesting
    public final void zzb(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.c) {
            this.zza();
        }
        try {
            Context context0 = this.f;
            context0.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            FIN.finallyExec$NT(v);
            throw new GooglePlayServicesNotAvailableException(9);
        }
        switch(GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context0, 12451000)) {
            case 0: 
            case 2: {
                BlockingServiceConnection blockingServiceConnection0 = new BlockingServiceConnection();
                Intent intent0 = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent0.setPackage("com.google.android.gms");
                try {
                    if(ConnectionTracker.getInstance().bindService(context0, intent0, blockingServiceConnection0, 1)) {
                        goto label_21;
                    }
                    goto label_36;
                }
                catch(Throwable throwable0) {
                    FIN.finallyExec$NT(v);
                    throw new IOException(throwable0);
                }
                try {
                label_21:
                    this.a = blockingServiceConnection0;
                    this.b = zze.zza(blockingServiceConnection0.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
                    this.c = true;
                }
                catch(InterruptedException unused_ex) {
                    FIN.finallyExec$NT(v);
                    throw new IOException("Interrupted exception");
                }
                catch(Throwable throwable1) {
                    FIN.finallyExec$NT(v);
                    throw new IOException(throwable1);
                }
                if(z) {
                    this.c();
                }
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v);
                return;
            label_36:
                FIN.finallyExec$NT(v);
                throw new IOException("Connection failure");
            }
            default: {
                FIN.finallyExec$NT(v);
                throw new IOException("Google Play services not available");
            }
        }
    }
}

