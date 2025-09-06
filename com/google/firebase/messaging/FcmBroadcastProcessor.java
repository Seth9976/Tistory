package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.h;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.j;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import jb.r;
import n.a;

@KeepForSdk
public class FcmBroadcastProcessor {
    public final Context a;
    public final Executor b;
    public static final Object c;
    public static b0 d;

    static {
        FcmBroadcastProcessor.c = new Object();
    }

    public FcmBroadcastProcessor(Context context0) {
        this.a = context0;
        this.b = new a(2);
    }

    public FcmBroadcastProcessor(Context context0, ExecutorService executorService0) {
        this.a = context0;
        this.b = executorService0;
    }

    public static Task a(Context context0, Intent intent0) {
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        if(ServiceStarter.a().c(context0)) {
            b0 b00 = FcmBroadcastProcessor.b(context0);
            synchronized(y.b) {
                if(y.c == null) {
                    WakeLock wakeLock0 = new WakeLock(context0, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    y.c = wakeLock0;
                    wakeLock0.setReferenceCounted(true);
                }
                boolean z = intent0.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent0.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if(!z) {
                    y.c.acquire(y.a);
                }
                b00.b(intent0).addOnCompleteListener(new a(2), new h(intent0, 9));
            }
            return Tasks.forResult(-1);
        }
        FcmBroadcastProcessor.b(context0).b(intent0);
        return Tasks.forResult(-1);
    }

    public static b0 b(Context context0) {
        synchronized(FcmBroadcastProcessor.c) {
            if(FcmBroadcastProcessor.d == null) {
                FcmBroadcastProcessor.d = new b0(context0);
            }
            return FcmBroadcastProcessor.d;
        }
    }

    @KeepForSdk
    public Task process(Intent intent0) {
        String s = intent0.getStringExtra("gcm.rawData64");
        if(s != null) {
            intent0.putExtra("rawData", Base64.decode(s, 0));
            intent0.removeExtra("gcm.rawData64");
        }
        return this.startMessagingService(this.a, intent0);
    }

    @VisibleForTesting
    public static void reset() {
        synchronized(FcmBroadcastProcessor.c) {
            FcmBroadcastProcessor.d = null;
        }
    }

    @SuppressLint({"InlinedApi"})
    public Task startMessagingService(Context context0, Intent intent0) {
        if((intent0.getFlags() & 0x10000000) == 0) {
            return FcmBroadcastProcessor.a(context0, intent0);
        }
        r r0 = new r(context0, intent0, 2);
        Task task0 = Tasks.call(this.b, r0);
        j j0 = new j(2, context0, intent0);
        return task0.continueWithTask(this.b, j0);
    }
}

