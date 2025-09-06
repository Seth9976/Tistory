package androidx.core.content;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService;

public final class v implements ServiceConnection {
    public IUnusedAppRestrictionsBackportService a;
    public ResolvableFuture b;
    public final Context c;
    public boolean d;

    public v(Context context0) {
        this.d = false;
        this.c = context0;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        IUnusedAppRestrictionsBackportService iUnusedAppRestrictionsBackportService0 = Stub.asInterface(iBinder0);
        this.a = iUnusedAppRestrictionsBackportService0;
        try {
            iUnusedAppRestrictionsBackportService0.isPermissionRevocationEnabledForApp(new u(this));
        }
        catch(RemoteException unused_ex) {
            this.b.set(0);
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
    }
}

