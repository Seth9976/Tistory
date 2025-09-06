package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import jeb.synthetic.FIN;

@KeepForSdk
public class ServiceStarter {
    @KeepForSdk
    public static final int ERROR_UNKNOWN = 500;
    public static final int SUCCESS = -1;
    public String a;
    public Boolean b;
    public Boolean c;
    public final ArrayDeque d;
    public static ServiceStarter e;

    public ServiceStarter() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = new ArrayDeque();
    }

    public static ServiceStarter a() {
        synchronized(ServiceStarter.class) {
            if(ServiceStarter.e == null) {
                ServiceStarter.e = new ServiceStarter();
            }
            return ServiceStarter.e;
        }
    }

    public final boolean b(Context context0) {
        if(this.c == null) {
            this.c = Boolean.valueOf(context0.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if(!this.b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.c.booleanValue();
    }

    public final boolean c(Context context0) {
        if(this.b == null) {
            this.b = Boolean.valueOf(context0.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if(!this.b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.b.booleanValue();
    }

    @VisibleForTesting
    public static void setForTesting(ServiceStarter serviceStarter0) {
        ServiceStarter.e = serviceStarter0;
    }

    @MainThread
    public int startMessagingService(Context context0, Intent intent0) {
        ComponentName componentName0;
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.d.offer(intent0);
        Intent intent1 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent1.setPackage("net.daum.android.tistoryapp");
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        String s = this.a;
        if(s == null) {
            ResolveInfo resolveInfo0 = context0.getPackageManager().resolveService(intent1, 0);
            if(resolveInfo0 == null) {
                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            label_30:
                FIN.finallyCodeBegin$NT(v);
                __monitor_exit(this);
                FIN.finallyCodeEnd$NT(v);
                s = null;
            }
            else {
                ServiceInfo serviceInfo0 = resolveInfo0.serviceInfo;
                if(serviceInfo0 == null) {
                    Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    goto label_30;
                }
                else if("net.daum.android.tistoryapp".equals(serviceInfo0.packageName)) {
                    String s1 = serviceInfo0.name;
                    if(s1 == null) {
                        Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo0.packageName + "/" + serviceInfo0.name);
                        goto label_30;
                    }
                    else {
                        this.a = s1.startsWith(".") ? "net.daum.android.tistoryapp" + serviceInfo0.name : serviceInfo0.name;
                        s = this.a;
                        FIN.finallyExec$NT(v);
                    }
                }
                else {
                    Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo0.packageName + "/" + serviceInfo0.name);
                    goto label_30;
                }
            }
        }
        else {
            FIN.finallyExec$NT(v);
        }
        if(s != null) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + s);
            }
            intent1.setClassName("net.daum.android.tistoryapp", s);
        }
        try {
            if(this.c(context0)) {
                componentName0 = y.b(context0, intent1);
            }
            else {
                componentName0 = context0.startService(intent1);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if(componentName0 == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            return -1;
        label_50:
            goto label_54;
        }
        catch(SecurityException securityException0) {
        }
        catch(IllegalStateException illegalStateException0) {
            goto label_50;
        }
        Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", securityException0);
        return 401;
    label_54:
        Log.e("FirebaseMessaging", "Failed to start service while in background: " + illegalStateException0);
        return 402;
    }
}

