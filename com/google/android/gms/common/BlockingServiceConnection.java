package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@KeepForSdk
public class BlockingServiceConnection implements ServiceConnection {
    public boolean a;
    public final LinkedBlockingQueue b;

    public BlockingServiceConnection() {
        this.a = false;
        this.b = new LinkedBlockingQueue();
    }

    @NonNull
    @KeepForSdk
    public IBinder getService() throws InterruptedException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
        if(this.a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.a = true;
        return (IBinder)this.b.take();
    }

    @NonNull
    @KeepForSdk
    public IBinder getServiceWithTimeout(long v, @NonNull TimeUnit timeUnit0) throws InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if(this.a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.a = true;
        IBinder iBinder0 = (IBinder)this.b.poll(v, timeUnit0);
        if(iBinder0 == null) {
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        return iBinder0;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName0, @NonNull IBinder iBinder0) {
        this.b.add(iBinder0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName0) {
    }
}

