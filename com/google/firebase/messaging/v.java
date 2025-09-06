package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.h;
import androidx.collection.ArrayMap;
import androidx.compose.material3.e9;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class v {
    public final Context a;
    public final o b;
    public final n c;
    public final FirebaseMessaging d;
    public final ArrayMap e;
    public final ScheduledThreadPoolExecutor f;
    public boolean g;
    public final t h;
    public static final long i;
    public static final int j;

    static {
        v.i = TimeUnit.HOURS.toSeconds(8L);
    }

    public v(FirebaseMessaging firebaseMessaging0, o o0, t t0, n n0, Context context0, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0) {
        this.e = new ArrayMap();
        this.g = false;
        this.d = firebaseMessaging0;
        this.b = o0;
        this.h = t0;
        this.c = n0;
        this.a = context0;
        this.f = scheduledThreadPoolExecutor0;
    }

    public static void a(Task task0) {
        try {
            Tasks.await(task0, 30L, TimeUnit.SECONDS);
            return;
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            if(throwable0 instanceof IOException) {
                throw (IOException)throwable0;
            }
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            throw new IOException(executionException0);
        }
        catch(InterruptedException | TimeoutException interruptedException0) {
            throw new IOException("SERVICE_NOT_AVAILABLE", interruptedException0);
        }
    }

    public final void b(String s) {
        String s1 = this.d.a();
        this.c.getClass();
        Bundle bundle0 = new Bundle();
        bundle0.putString("gcm.topic", "/topics/" + s);
        Task task0 = this.c.c(s1, "/topics/" + s, bundle0);
        v.a(this.c.a(task0));
    }

    public final void c(String s) {
        String s1 = this.d.a();
        this.c.getClass();
        Bundle bundle0 = new Bundle();
        bundle0.putString("gcm.topic", "/topics/" + s);
        bundle0.putString("delete", "1");
        Task task0 = this.c.c(s1, "/topics/" + s, bundle0);
        v.a(this.c.a(task0));
    }

    public final Task d(s s0) {
        ArrayDeque arrayDeque1;
        t t0 = this.h;
        synchronized(t0) {
            e9 e90 = t0.a;
            String s1 = s0.c;
            e90.getClass();
            if(!TextUtils.isEmpty(s1) && !s1.contains(((String)e90.c))) {
                synchronized(((ArrayDeque)e90.d)) {
                    if(((ArrayDeque)e90.d).add(s1)) {
                        h h0 = new h(e90, 15);
                        ((ScheduledThreadPoolExecutor)e90.f).execute(h0);
                    }
                }
            }
        }
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        synchronized(this.e) {
            String s2 = s0.c;
            if(this.e.containsKey(s2)) {
                arrayDeque1 = (ArrayDeque)this.e.get(s2);
            }
            else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                this.e.put(s2, arrayDeque2);
                arrayDeque1 = arrayDeque2;
            }
            arrayDeque1.add(taskCompletionSource0);
        }
        return taskCompletionSource0.getTask();
    }

    public final void e(boolean z) {
        synchronized(this) {
            this.g = z;
        }
    }

    public final void f() {
        if(this.h.a() != null && !this.g) {
            this.h(0L);
        }
    }

    // This method was un-flattened
    public final boolean g() {
        s s0;
        String s1;
        while(true) {
            synchronized(this) {
                s0 = this.h.a();
                if(s0 == null) {
                    if(Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "topic sync succeeded");
                    }
                    return true;
                }
            }
            try {
                switch(s0.b) {
                    case "S": {
                        s1 = s0.a;
                        this.b(s1);
                        if(Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Subscribe to topic: " + s1 + " succeeded.");
                        }
                        goto label_33;
                    }
                    case "U": {
                        s1 = s0.a;
                        this.c(s1);
                        if(Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unsubscribe from topic: " + s1 + " succeeded.");
                        }
                        goto label_33;
                    }
                    default: {
                        if(Log.isLoggable("FirebaseMessaging", 3)) {
                            Log.d("FirebaseMessaging", "Unknown topic operation" + s0 + ".");
                        }
                        goto label_33;
                    }
                }
            }
            catch(IOException iOException0) {
            }
            if(!"SERVICE_NOT_AVAILABLE".equals(iOException0.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(iOException0.getMessage())) {
                if(iOException0.getMessage() != null) {
                    throw iOException0;
                }
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + iOException0.getMessage() + ". Will retry Topic operation.");
            return false;
        label_33:
            t t0 = this.h;
            synchronized(t0) {
                e9 e90 = t0.a;
                synchronized(((ArrayDeque)e90.d)) {
                    if(((ArrayDeque)e90.d).remove(s0.c)) {
                        h h0 = new h(e90, 15);
                        ((ScheduledThreadPoolExecutor)e90.f).execute(h0);
                    }
                }
            }
            synchronized(this.e) {
                String s2 = s0.c;
                if(!this.e.containsKey(s2)) {
                    continue;
                }
                ArrayDeque arrayDeque1 = (ArrayDeque)this.e.get(s2);
                TaskCompletionSource taskCompletionSource0 = (TaskCompletionSource)arrayDeque1.poll();
                if(taskCompletionSource0 != null) {
                    taskCompletionSource0.setResult(null);
                }
                if(arrayDeque1.isEmpty()) {
                    this.e.remove(s2);
                }
            }
        }
    }

    public final void h(long v) {
        x x0 = new x(this, this.a, this.b, Math.min(Math.max(30L, 2L * v), v.i));
        this.f.schedule(x0, v, TimeUnit.SECONDS);
        this.e(true);
    }
}

