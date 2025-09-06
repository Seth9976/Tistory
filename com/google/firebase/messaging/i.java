package com.google.firebase.messaging;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class i implements Runnable {
    public final int a;
    public final FirebaseMessaging b;

    public i(FirebaseMessaging firebaseMessaging0, int v) {
        this.a = v;
        this.b = firebaseMessaging0;
        super();
    }

    @Override
    public final void run() {
        boolean z;
        FirebaseMessaging firebaseMessaging0 = this.b;
        if(this.a != 0) {
            Context context0 = firebaseMessaging0.d;
            Context context1 = context0.getApplicationContext();
            if(context1 == null) {
                context1 = context0;
            }
            if(!context1.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                try {
                    PackageManager packageManager0 = context0.getApplicationContext().getPackageManager();
                    if(packageManager0 == null) {
                    label_13:
                        z = true;
                    }
                    else {
                        ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("net.daum.android.tistoryapp", 0x80);
                        if(applicationInfo0 != null && (applicationInfo0.metaData != null && applicationInfo0.metaData.containsKey("firebase_messaging_notification_delegation_enabled"))) {
                            z = applicationInfo0.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                            goto label_14;
                        }
                        goto label_13;
                    }
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    goto label_13;
                }
            label_14:
                new p(context0, z, new TaskCompletionSource()).run();
            }
            return;
        }
        if(firebaseMessaging0.isAutoInitEnabled()) {
            firebaseMessaging0.g();
        }
    }
}

