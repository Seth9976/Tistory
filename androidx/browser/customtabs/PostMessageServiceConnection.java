package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback.Stub;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.IPostMessageService;

public abstract class PostMessageServiceConnection implements ServiceConnection {
    public final Object a;
    public final ICustomTabsCallback b;
    public IPostMessageService c;

    public PostMessageServiceConnection(CustomTabsSessionToken customTabsSessionToken0) {
        this.a = new Object();
        this.b = Stub.asInterface(customTabsSessionToken0.a.asBinder());
    }

    public boolean bindSessionToPostMessageService(Context context0, String s) {
        Intent intent0 = new Intent();
        intent0.setClassName(s, "androidx.browser.customtabs.PostMessageService");
        return context0.bindService(intent0, this, 1);
    }

    public final boolean notifyMessageChannelReady(Bundle bundle0) {
        if(this.c == null) {
            return false;
        }
        synchronized(this.a) {
            try {
                this.c.onMessageChannelReady(this.b, bundle0);
                return true;
            }
            catch(RemoteException unused_ex) {
                return false;
            }
        }
    }

    public void onPostMessageServiceConnected() {
    }

    public void onPostMessageServiceDisconnected() {
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        this.c = android.support.customtabs.IPostMessageService.Stub.asInterface(iBinder0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.c = null;
    }

    public final boolean postMessage(String s, Bundle bundle0) {
        if(this.c == null) {
            return false;
        }
        synchronized(this.a) {
            try {
                this.c.onPostMessage(this.b, s, bundle0);
                return true;
            }
            catch(RemoteException unused_ex) {
                return false;
            }
        }
    }

    public void unbindFromContext(Context context0) {
        context0.unbindService(this);
    }
}

