package com.google.firebase.messaging;

import a7.b;
import android.app.Application;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.state.d;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.j;
import com.google.firebase.events.Subscriber;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseMessaging {
    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    public final FirebaseApp a;
    public final FirebaseInstanceIdInternal b;
    public final FirebaseInstallationsApi c;
    public final Context d;
    public final n e;
    public final b f;
    public final m g;
    public final ScheduledThreadPoolExecutor h;
    public final ExecutorService i;
    public final ThreadPoolExecutor j;
    public final Task k;
    public final o l;
    public boolean m;
    public static final long n;
    public static f o;
    public static TransportFactory p;
    public static ScheduledThreadPoolExecutor q;

    static {
        FirebaseMessaging.n = TimeUnit.HOURS.toSeconds(8L);
    }

    public FirebaseMessaging(FirebaseApp firebaseApp0, FirebaseInstanceIdInternal firebaseInstanceIdInternal0, Provider provider0, Provider provider1, FirebaseInstallationsApi firebaseInstallationsApi0, TransportFactory transportFactory0, Subscriber subscriber0) {
        o o0 = new o(firebaseApp0.getApplicationContext());
        n n0 = new n(firebaseApp0, o0, provider0, provider1, firebaseInstallationsApi0);
        ExecutorService executorService0 = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        super();
        this.m = false;
        FirebaseMessaging.p = transportFactory0;
        this.a = firebaseApp0;
        this.b = firebaseInstanceIdInternal0;
        this.c = firebaseInstallationsApi0;
        this.g = new m(this, subscriber0);
        Context context0 = firebaseApp0.getApplicationContext();
        this.d = context0;
        g g0 = new g();
        this.l = o0;
        this.i = executorService0;
        this.e = n0;
        this.f = new b(executorService0);
        this.h = scheduledThreadPoolExecutor0;
        this.j = threadPoolExecutor0;
        Context context1 = firebaseApp0.getApplicationContext();
        if(context1 instanceof Application) {
            ((Application)context1).registerActivityLifecycleCallbacks(g0);
        }
        else {
            Log.w("FirebaseMessaging", "Context " + context1 + " was not an application, can\'t register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if(firebaseInstanceIdInternal0 != null) {
            firebaseInstanceIdInternal0.addNewTokenListener(new h(this));
        }
        scheduledThreadPoolExecutor0.execute(new i(this, 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor1 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        Task task0 = Tasks.call(scheduledThreadPoolExecutor1, new u(context0, scheduledThreadPoolExecutor1, this, o0, n0));
        this.k = task0;
        task0.addOnSuccessListener(scheduledThreadPoolExecutor0, new h(this));
        scheduledThreadPoolExecutor0.execute(new i(this, 1));
    }

    public final String a() {
        Task task0;
        FirebaseInstanceIdInternal firebaseInstanceIdInternal0 = this.b;
        if(firebaseInstanceIdInternal0 != null) {
            try {
                return (String)Tasks.await(firebaseInstanceIdInternal0.getTokenTask());
            }
            catch(ExecutionException | InterruptedException executionException0) {
                throw new IOException(executionException0);
            }
        }
        q q0 = this.e();
        if(!this.i(q0)) {
            return q0.a;
        }
        String s = o.b(this.a);
        b b0 = this.f;
        synchronized(b0) {
            task0 = (Task)((ArrayMap)b0.c).get(s);
            if(task0 == null) {
                if(Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + s);
                }
                String s1 = o.b(this.e.a);
                Bundle bundle0 = new Bundle();
                Task task1 = this.e.c(s1, "*", bundle0);
                Task task2 = this.e.a(task1);
                k k0 = new k(this, s, q0);
                task0 = task2.onSuccessTask(this.j, k0).continueWithTask(((ExecutorService)b0.b), new j(3, b0, s));
                ((ArrayMap)b0.c).put(s, task0);
            }
            else if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + s);
            }
        }
        try {
            return (String)Tasks.await(task0);
        }
        catch(ExecutionException | InterruptedException executionException1) {
            throw new IOException(executionException1);
        }
    }

    public static void b(long v, Runnable runnable0) {
        synchronized(FirebaseMessaging.class) {
            if(FirebaseMessaging.q == null) {
                FirebaseMessaging.q = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            FirebaseMessaging.q.schedule(runnable0, v, TimeUnit.SECONDS);
        }
    }

    public static f c(Context context0) {
        synchronized(FirebaseMessaging.class) {
            if(FirebaseMessaging.o == null) {
                FirebaseMessaging.o = new f(context0);
            }
            return FirebaseMessaging.o;
        }
    }

    // 去混淆评级： 低(20)
    public final String d() {
        return "[DEFAULT]".equals(this.a.getName()) ? "" : this.a.getPersistenceKey();
    }

    @NonNull
    public Task deleteToken() {
        if(this.b != null) {
            TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
            com.google.firebase.messaging.j j0 = new com.google.firebase.messaging.j(this, taskCompletionSource0, 1);
            this.h.execute(j0);
            return taskCompletionSource0.getTask();
        }
        if(this.e() == null) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource1 = new TaskCompletionSource();
        Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io")).execute(new com.google.firebase.messaging.j(this, taskCompletionSource1, 2));
        return taskCompletionSource1.getTask();
    }

    @NonNull
    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return MessagingAnalytics.a();
    }

    public final q e() {
        f f0 = FirebaseMessaging.c(this.d);
        String s = this.d();
        String s1 = o.b(this.a);
        synchronized(f0) {
            return q.b(((SharedPreferences)f0.a).getString(s + "|T|" + s1 + "|*", null));
        }
    }

    public final void f(String s) {
        FirebaseApp firebaseApp0 = this.a;
        if("[DEFAULT]".equals(firebaseApp0.getName())) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + firebaseApp0.getName());
            }
            Intent intent0 = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent0.putExtra("token", s);
            new FcmBroadcastProcessor(this.d).process(intent0);
        }
    }

    public final void g() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal0 = this.b;
        if(firebaseInstanceIdInternal0 != null) {
            firebaseInstanceIdInternal0.getToken();
            return;
        }
        if(this.i(this.e())) {
            synchronized(this) {
                if(!this.m) {
                    this.h(0L);
                }
            }
        }
    }

    @NonNull
    public static FirebaseMessaging getInstance() {
        synchronized(FirebaseMessaging.class) {
            return FirebaseMessaging.getInstance(FirebaseApp.getInstance());
        }
    }

    @Keep
    @NonNull
    public static FirebaseMessaging getInstance(@NonNull FirebaseApp firebaseApp0) {
        synchronized(FirebaseMessaging.class) {
            FirebaseMessaging firebaseMessaging0 = (FirebaseMessaging)firebaseApp0.get(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging0, "Firebase Messaging component is not present");
            return firebaseMessaging0;
        }
    }

    @NonNull
    public Task getToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal0 = this.b;
        if(firebaseInstanceIdInternal0 != null) {
            return firebaseInstanceIdInternal0.getTokenTask();
        }
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        com.google.firebase.messaging.j j0 = new com.google.firebase.messaging.j(this, taskCompletionSource0, 0);
        this.h.execute(j0);
        return taskCompletionSource0.getTask();
    }

    @Nullable
    public static TransportFactory getTransportFactory() {
        return FirebaseMessaging.p;
    }

    public final void h(long v) {
        synchronized(this) {
            FirebaseMessaging.b(v, new com.google.firebase.crashlytics.internal.common.j(this, Math.min(Math.max(30L, 2L * v), FirebaseMessaging.n)));
            this.m = true;
        }
    }

    public final boolean i(q q0) {
        if(q0 != null) {
            String s = this.l.a();
            return System.currentTimeMillis() > q0.c + q.d || !s.equals(q0.b);
        }
        return true;
    }

    public boolean isAutoInitEnabled() {
        return this.g.b();
    }

    public boolean isNotificationDelegationEnabled() {
        int v = Binder.getCallingUid();
        Context context0 = this.d;
        if(v != context0.getApplicationInfo().uid) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package net.daum.android.tistoryapp");
        }
        else if("com.google.android.gms".equals(((NotificationManager)context0.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
            }
            return true;
        }
        return false;
    }

    public void send(@NonNull RemoteMessage remoteMessage0) {
        if(TextUtils.isEmpty(remoteMessage0.getTo())) {
            throw new IllegalArgumentException("Missing \'to\'");
        }
        Intent intent0 = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent1 = new Intent();
        intent1.setPackage("com.google.example.invalidpackage");
        intent0.putExtra("app", PendingIntent.getBroadcast(this.d, 0, intent1, 0x4000000));
        intent0.setPackage("com.google.android.gms");
        intent0.putExtras(remoteMessage0.a);
        this.d.sendOrderedBroadcast(intent0, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setAutoInitEnabled(boolean z) {
        m m0 = this.g;
        synchronized(m0) {
            m0.a();
            l l0 = m0.c;
            if(l0 != null) {
                m0.a.unsubscribe(DataCollectionDefaultChange.class, l0);
                m0.c = null;
            }
            SharedPreferences.Editor sharedPreferences$Editor0 = m0.e.a.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            sharedPreferences$Editor0.putBoolean("auto_init", z);
            sharedPreferences$Editor0.apply();
            if(z) {
                m0.e.g();
            }
            m0.d = Boolean.valueOf(z);
        }
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        FirebaseApp.getInstance().getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    public Task setNotificationDelegationEnabled(boolean z) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.h.execute(new p(this.d, z, taskCompletionSource0));
        return taskCompletionSource0.getTask();
    }

    @NonNull
    public Task subscribeToTopic(@NonNull String s) {
        d d0 = new d(s, 1);
        return this.k.onSuccessTask(d0);
    }

    @NonNull
    public Task unsubscribeFromTopic(@NonNull String s) {
        d d0 = new d(s, 2);
        return this.k.onSuccessTask(d0);
    }
}

