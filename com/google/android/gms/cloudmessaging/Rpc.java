package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class Rpc {
    public final SimpleArrayMap a;
    public final Context b;
    public final zzt c;
    public final ScheduledThreadPoolExecutor d;
    public final Messenger e;
    public Messenger f;
    public zzd g;
    public static int h;
    public static PendingIntent i;
    public static final zzz j;
    public static final Pattern k;

    static {
        Rpc.j = zzz.zza;
        Rpc.k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    }

    public Rpc(@NonNull Context context0) {
        this.a = new SimpleArrayMap();
        this.b = context0;
        this.c = new zzt(context0);
        this.e = new Messenger(new a(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor0.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor0.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor0;
    }

    public final Task a(Bundle bundle0) {
        __monitor_enter(Rpc.class);
        __monitor_exit(Rpc.class);
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        synchronized(this.a) {
            this.a.put("0", taskCompletionSource0);
        }
        Intent intent0 = new Intent();
        intent0.setPackage("com.google.android.gms");
        if(this.c.zzb() == 2) {
            intent0.setAction("com.google.iid.TOKEN_REQUEST");
        }
        else {
            intent0.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent0.putExtras(bundle0);
        Context context0 = this.b;
        synchronized(Rpc.class) {
            if(Rpc.i == null) {
                Intent intent1 = new Intent();
                intent1.setPackage("com.google.example.invalidpackage");
                Rpc.i = zza.zza(context0, 0, intent1, zza.zza);
            }
            intent0.putExtra("app", Rpc.i);
        }
        intent0.putExtra("kid", "|ID|0|");
        if(Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending " + intent0.getExtras());
        }
        intent0.putExtra("google.messenger", this.e);
        if(this.f == null && this.g == null) {
        label_43:
            if(this.c.zzb() == 2) {
                this.b.sendBroadcast(intent0);
            }
            else {
                this.b.startService(intent0);
            }
        }
        else {
            Message message0 = Message.obtain();
            message0.obj = intent0;
            try {
                Messenger messenger0 = this.f;
                if(messenger0 == null) {
                    this.g.zzb(message0);
                }
                else {
                    messenger0.send(message0);
                }
            }
            catch(RemoteException unused_ex) {
                if(Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                goto label_43;
            }
        }
        zzy zzy0 = new zzy(taskCompletionSource0);
        zzw zzw0 = new zzw(this, "0", this.d.schedule(zzy0, 30L, TimeUnit.SECONDS));
        taskCompletionSource0.getTask().addOnCompleteListener(Rpc.j, zzw0);
        return taskCompletionSource0.getTask();
    }

    public final void b(String s, Bundle bundle0) {
        synchronized(this.a) {
            TaskCompletionSource taskCompletionSource0 = (TaskCompletionSource)this.a.remove(s);
            if(taskCompletionSource0 == null) {
                String s1 = String.valueOf(s);
                Log.w("Rpc", (s1.length() == 0 ? new String("Missing callback for ") : "Missing callback for " + s1));
                return;
            }
            taskCompletionSource0.setResult(bundle0);
        }
    }

    @NonNull
    public Task send(@NonNull Bundle bundle0) {
        zzt zzt0 = this.c;
        int v = zzt0.zza();
        zzz zzz0 = Rpc.j;
        if(v < 12000000) {
            return zzt0.zzb() == 0 ? Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE")) : this.a(bundle0).continueWithTask(zzz0, new zzu(this, bundle0));
        }
        return zzs.zzb(this.b).zzd(1, bundle0).continueWith(zzz0, zzv.zza);
    }

    @NonNull
    public final Task zzb(@NonNull Bundle bundle0, @NonNull Task task0) throws Exception {
        if(!task0.isSuccessful()) {
            return task0;
        }
        Bundle bundle1 = (Bundle)task0.getResult();
        return bundle1 == null || !bundle1.containsKey("google.messenger") ? task0 : this.a(bundle0).onSuccessTask(Rpc.j, zzx.zza);
    }

    public final void zzd(@NonNull String s, @NonNull ScheduledFuture scheduledFuture0, @NonNull Task task0) {
        synchronized(this.a) {
            this.a.remove(s);
        }
        scheduledFuture0.cancel(false);
    }
}

