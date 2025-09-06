package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.emoji2.text.k;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.components.j;
import com.google.firebase.messaging.threads.PoolableExecutors;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.ExecutorService;
import n.a;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class EnhancedIntentService extends Service {
    public final ExecutorService e;
    public z f;
    public final Object g;
    public int h;
    public int i;
    public static final int j;

    public EnhancedIntentService() {
        this.e = PoolableExecutors.factory().newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"), ThreadPriority.HIGH_SPEED);
        this.g = new Object();
        this.i = 0;
    }

    public final void a(Intent intent0) {
        if(intent0 != null) {
            y.a(intent0);
        }
        synchronized(this.g) {
            int v1 = this.i - 1;
            this.i = v1;
            if(v1 == 0) {
                this.stopSelfResult(this.h);
            }
        }
    }

    public final Task b(Intent intent0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        k k0 = new k(this, intent0, 5, taskCompletionSource0);
        this.e.execute(k0);
        return taskCompletionSource0.getTask();
    }

    public Intent getStartCommandIntent(Intent intent0) {
        return intent0;
    }

    public abstract void handleIntent(Intent arg1);

    public boolean handleIntentOnMainThread(Intent intent0) [...] // Inlined contents

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
        synchronized(this) {
            if(Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if(this.f == null) {
                this.f = new z(new f(this));
            }
            return this.f;
        }
    }

    @Override  // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.e.shutdown();
        super.onDestroy();
    }

    @Override  // android.app.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        synchronized(this.g) {
            this.h = v1;
            ++this.i;
        }
        Intent intent1 = this.getStartCommandIntent(intent0);
        if(intent1 == null) {
            this.a(intent0);
            return 2;
        }
        Task task0 = this.b(intent1);
        if(task0.isComplete()) {
            this.a(intent0);
            return 2;
        }
        task0.addOnCompleteListener(new a(2), new j(1, this, intent0));
        return 3;
    }
}

