package com.google.firebase.messaging;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.h;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import n.a;

public final class n {
    public final FirebaseApp a;
    public final o b;
    public final Rpc c;
    public final Provider d;
    public final Provider e;
    public final FirebaseInstallationsApi f;

    public n(FirebaseApp firebaseApp0, o o0, Provider provider0, Provider provider1, FirebaseInstallationsApi firebaseInstallationsApi0) {
        Rpc rpc0 = new Rpc(firebaseApp0.getApplicationContext());
        super();
        this.a = firebaseApp0;
        this.b = o0;
        this.c = rpc0;
        this.d = provider0;
        this.e = provider1;
        this.f = firebaseInstallationsApi0;
    }

    public final Task a(Task task0) {
        return task0.continueWith(new a(2), new h(this, 8));
    }

    public final void b(String s, String s1, Bundle bundle0) {
        String s2;
        String s4;
        bundle0.putString("scope", s1);
        bundle0.putString("sender", s);
        bundle0.putString("subtype", s);
        bundle0.putString("gmp_app_id", this.a.getOptions().getApplicationId());
        o o0 = this.b;
        synchronized(o0) {
            if(o0.a == 0) {
                PackageInfo packageInfo0 = o0.c("com.google.android.gms");
                if(packageInfo0 != null) {
                    o0.a = packageInfo0.versionCode;
                }
            }
        }
        bundle0.putString("gmsv", Integer.toString(o0.a));
        bundle0.putString("osv", "33");
        bundle0.putString("app_ver", this.b.a());
        o o1 = this.b;
        synchronized(o1) {
            if(((String)o1.e) == null) {
                o1.e();
            }
            s2 = (String)o1.e;
        }
        bundle0.putString("app_ver_name", s2);
        String s3 = this.a.getName();
        try {
            s4 = "[HASH-ERROR]";
            s4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(s3.getBytes()), 11);
        }
        catch(NoSuchAlgorithmException unused_ex) {
        }
        bundle0.putString("firebase-app-name-hash", s4);
        try {
            String s5 = ((InstallationTokenResult)Tasks.await(this.f.getToken(false))).getToken();
            if(TextUtils.isEmpty(s5)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
            else {
                bundle0.putString("Goog-Firebase-Installations-Auth", s5);
            }
        }
        catch(ExecutionException | InterruptedException executionException0) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", executionException0);
        }
        bundle0.putString("appid", ((String)Tasks.await(this.f.getId())));
        bundle0.putString("cliv", "fcm-23.1.0");
        HeartBeatInfo heartBeatInfo0 = (HeartBeatInfo)this.e.get();
        UserAgentPublisher userAgentPublisher0 = (UserAgentPublisher)this.d.get();
        if(heartBeatInfo0 != null && userAgentPublisher0 != null) {
            HeartBeat heartBeatInfo$HeartBeat0 = heartBeatInfo0.getHeartBeatCode("fire-iid");
            if(heartBeatInfo$HeartBeat0 != HeartBeat.NONE) {
                bundle0.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatInfo$HeartBeat0.getCode()));
                bundle0.putString("Firebase-Client", userAgentPublisher0.getUserAgent());
            }
        }
    }

    public final Task c(String s, String s1, Bundle bundle0) {
        try {
            this.b(s, s1, bundle0);
            return this.c.send(bundle0);
        }
        catch(InterruptedException interruptedException0) {
            return Tasks.forException(interruptedException0);
        }
        catch(ExecutionException interruptedException0) {
            return Tasks.forException(interruptedException0);
        }
    }
}

