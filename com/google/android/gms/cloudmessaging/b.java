package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class b implements ServiceConnection {
    public int a;
    public final Messenger b;
    public a7.b c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final zzs f;

    public b(zzs zzs0) {
        this.f = zzs0;
        this.a = 0;
        this.b = new Messenger(new zzf(Looper.getMainLooper(), new com.google.android.gms.cloudmessaging.zzf(this)));
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final void a(int v, String s) {
        synchronized(this) {
            this.b(s, null);
        }
    }

    public final void b(String s, SecurityException securityException0) {
        synchronized(this) {
            if(Log.isLoggable("MessengerIpcClient", 3)) {
                String s1 = String.valueOf(s);
                Log.d("MessengerIpcClient", (s1.length() == 0 ? new String("Disconnected: ") : "Disconnected: " + s1));
            }
            int v1 = this.a;
            if(v1 != 0) {
                switch(v1) {
                    case 1: 
                    case 2: {
                        if(Log.isLoggable("MessengerIpcClient", 2)) {
                            Log.v("MessengerIpcClient", "Unbinding service");
                        }
                        this.a = 4;
                        ConnectionTracker.getInstance().unbindService(this.f.a, this);
                        zzq zzq0 = new zzq(s, securityException0);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                        for(Object object0: this.d) {
                            ((d)object0).c(zzq0);
                        }
                        this.d.clear();
                        for(int v2 = 0; v2 < this.e.size(); ++v2) {
                            ((d)this.e.valueAt(v2)).c(zzq0);
                        }
                        this.e.clear();
                        return;
                    }
                    case 3: {
                        this.a = 4;
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException();
    }

    public final void c() {
        synchronized(this) {
            if(this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if(Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                ConnectionTracker.getInstance().unbindService(this.f.a, this);
            }
        }
    }

    public final boolean d(d d0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        switch(this.a) {
            case 0: {
                this.d.add(d0);
                Preconditions.checkState(this.a == 0);
                if(Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.a = 1;
                Intent intent0 = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent0.setPackage("com.google.android.gms");
                try {
                    if(ConnectionTracker.getInstance().bindService(this.f.a, intent0, this, 1)) {
                        goto label_20;
                    }
                    else {
                        this.a(0, "Unable to bind to service");
                    }
                }
                catch(SecurityException securityException0) {
                    this.b("Unable to bind to service", securityException0);
                }
                goto label_22;
            label_20:
                zzi zzi0 = new zzi(this);
                this.f.b.schedule(zzi0, 30L, TimeUnit.SECONDS);
            label_22:
                FIN.finallyExec$NT(v);
                return true;
            }
            case 1: {
                this.d.add(d0);
                FIN.finallyExec$NT(v);
                return true;
            }
            case 2: {
                this.d.add(d0);
                zzh zzh0 = new zzh(this);
                this.f.b.execute(zzh0);
                FIN.finallyExec$NT(v);
                return true;
            }
            default: {
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v);
                return false;
            }
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        if(Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        zzj zzj0 = new zzj(this, iBinder0);
        this.f.b.execute(zzj0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        if(Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        zzg zzg0 = new zzg(this);
        this.f.b.execute(zzg0);
    }
}

