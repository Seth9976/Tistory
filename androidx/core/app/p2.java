package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.DeadObjectException;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel.Stub;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class p2 implements ServiceConnection, Handler.Callback {
    public final Context a;
    public final Handler b;
    public final HashMap c;
    public Set d;

    public p2(Context context0) {
        this.c = new HashMap();
        this.d = new HashSet();
        this.a = context0;
        HandlerThread handlerThread0 = new HandlerThread("NotificationManagerCompat");
        handlerThread0.start();
        this.b = new Handler(handlerThread0.getLooper(), this);
    }

    public final void a(o2 o20) {
        boolean z1;
        boolean z = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName0 = o20.a;
        if(z) {
            Log.d("NotifManCompat", "Processing component " + componentName0 + ", " + o20.d.size() + " queued tasks");
        }
        if(o20.d.isEmpty()) {
            return;
        }
        if(o20.b) {
            z1 = true;
        }
        else {
            Intent intent0 = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName0);
            Context context0 = this.a;
            boolean z2 = context0.bindService(intent0, this, 33);
            o20.b = z2;
            if(z2) {
                o20.e = 0;
            }
            else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName0);
                context0.unbindService(this);
            }
            z1 = o20.b;
        }
        if(z1 && o20.c != null) {
            while(true) {
                ArrayDeque arrayDeque0 = o20.d;
                Task notificationManagerCompat$Task0 = (Task)arrayDeque0.peek();
                if(notificationManagerCompat$Task0 == null) {
                    break;
                }
                try {
                    if(Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + notificationManagerCompat$Task0);
                    }
                    notificationManagerCompat$Task0.send(o20.c);
                    arrayDeque0.remove();
                    continue;
                }
                catch(DeadObjectException unused_ex) {
                }
                catch(RemoteException remoteException0) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName0, remoteException0);
                    break;
                }
                if(!Log.isLoggable("NotifManCompat", 3)) {
                    break;
                }
                Log.d("NotifManCompat", "Remote service has died: " + componentName0);
                break;
            }
            if(!arrayDeque0.isEmpty()) {
                this.b(o20);
            }
            return;
        }
        this.b(o20);
    }

    public final void b(o2 o20) {
        Handler handler0 = this.b;
        ComponentName componentName0 = o20.a;
        if(handler0.hasMessages(3, componentName0)) {
            return;
        }
        int v = o20.e;
        o20.e = v + 1;
        if(v + 1 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + o20.d.size() + " tasks to " + componentName0 + " after " + o20.e + " retries");
            o20.d.clear();
            return;
        }
        int v1 = (1 << v) * 1000;
        if(Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + v1 + " ms");
        }
        handler0.sendMessageDelayed(handler0.obtainMessage(3, componentName0), ((long)v1));
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        HashMap hashMap0 = this.c;
        Context context0 = this.a;
        switch(message0.what) {
            case 0: {
                Task notificationManagerCompat$Task0 = (Task)message0.obj;
                Set set0 = NotificationManagerCompat.getEnabledListenerPackages(context0);
                if(!set0.equals(this.d)) {
                    this.d = set0;
                    List list0 = context0.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet hashSet0 = new HashSet();
                    for(Object object0: list0) {
                        ResolveInfo resolveInfo0 = (ResolveInfo)object0;
                        if(set0.contains(resolveInfo0.serviceInfo.packageName)) {
                            ComponentName componentName0 = new ComponentName(resolveInfo0.serviceInfo.packageName, resolveInfo0.serviceInfo.name);
                            if(resolveInfo0.serviceInfo.permission == null) {
                                hashSet0.add(componentName0);
                            }
                            else {
                                Log.w("NotifManCompat", "Permission present on component " + componentName0 + ", not adding listener record.");
                            }
                        }
                    }
                    for(Object object1: hashSet0) {
                        ComponentName componentName1 = (ComponentName)object1;
                        if(!hashMap0.containsKey(componentName1)) {
                            if(Log.isLoggable("NotifManCompat", 3)) {
                                Log.d("NotifManCompat", "Adding listener record for " + componentName1);
                            }
                            hashMap0.put(componentName1, new o2(componentName1));
                        }
                    }
                    Iterator iterator2 = hashMap0.entrySet().iterator();
                    while(iterator2.hasNext()) {
                        Object object2 = iterator2.next();
                        Map.Entry map$Entry0 = (Map.Entry)object2;
                        if(!hashSet0.contains(map$Entry0.getKey())) {
                            if(Log.isLoggable("NotifManCompat", 3)) {
                                Log.d("NotifManCompat", "Removing listener record for " + map$Entry0.getKey());
                            }
                            o2 o20 = (o2)map$Entry0.getValue();
                            if(o20.b) {
                                context0.unbindService(this);
                                o20.b = false;
                            }
                            o20.c = null;
                            iterator2.remove();
                        }
                    }
                }
                for(Object object3: hashMap0.values()) {
                    ((o2)object3).d.add(notificationManagerCompat$Task0);
                    this.a(((o2)object3));
                }
                return true;
            }
            case 1: {
                n2 n20 = (n2)message0.obj;
                o2 o21 = (o2)hashMap0.get(n20.a);
                if(o21 != null) {
                    o21.c = Stub.asInterface(n20.b);
                    o21.e = 0;
                    this.a(o21);
                }
                return true;
            }
            case 2: {
                o2 o22 = (o2)hashMap0.get(((ComponentName)message0.obj));
                if(o22 != null) {
                    if(o22.b) {
                        context0.unbindService(this);
                        o22.b = false;
                    }
                    o22.c = null;
                }
                return true;
            }
            case 3: {
                o2 o23 = (o2)hashMap0.get(((ComponentName)message0.obj));
                if(o23 != null) {
                    this.a(o23);
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        if(Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName0);
        }
        n2 n20 = new n2(componentName0, iBinder0);
        this.b.obtainMessage(1, n20).sendToTarget();
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        if(Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName0);
        }
        this.b.obtainMessage(2, componentName0).sendToTarget();
    }
}

