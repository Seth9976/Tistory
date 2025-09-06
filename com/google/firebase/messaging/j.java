package com.google.firebase.messaging;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

public final class j implements Runnable {
    public final int a;
    public final FirebaseMessaging b;
    public final TaskCompletionSource c;

    public j(FirebaseMessaging firebaseMessaging0, TaskCompletionSource taskCompletionSource0, int v) {
        this.a = v;
        this.b = firebaseMessaging0;
        this.c = taskCompletionSource0;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                TaskCompletionSource taskCompletionSource1 = this.c;
                this.b.getClass();
                try {
                    taskCompletionSource1.setResult(this.b.a());
                }
                catch(Exception exception1) {
                    taskCompletionSource1.setException(exception1);
                }
                return;
            }
            case 1: {
                TaskCompletionSource taskCompletionSource2 = this.c;
                this.b.getClass();
                try {
                    String s3 = o.b(this.b.a);
                    this.b.b.deleteToken(s3, "FCM");
                    taskCompletionSource2.setResult(null);
                }
                catch(Exception exception2) {
                    taskCompletionSource2.setException(exception2);
                }
                return;
            }
            default: {
                TaskCompletionSource taskCompletionSource0 = this.c;
                this.b.getClass();
                try {
                    this.b.e.getClass();
                    Bundle bundle0 = new Bundle();
                    bundle0.putString("delete", "1");
                    String s = o.b(this.b.e.a);
                    Task task0 = this.b.e.c(s, "*", bundle0);
                    Tasks.await(this.b.e.a(task0));
                    f f0 = FirebaseMessaging.c(this.b.d);
                    String s1 = this.b.d();
                    String s2 = o.b(this.b.a);
                    synchronized(f0) {
                        SharedPreferences.Editor sharedPreferences$Editor0 = ((SharedPreferences)f0.a).edit();
                        sharedPreferences$Editor0.remove(s1 + "|T|" + s2 + "|*");
                        sharedPreferences$Editor0.commit();
                    }
                    taskCompletionSource0.setResult(null);
                }
                catch(Exception exception0) {
                    taskCompletionSource0.setException(exception0);
                }
            }
        }
    }
}

