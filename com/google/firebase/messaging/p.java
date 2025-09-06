package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Binder;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.webkit.internal.k;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.kakao.tistory.presentation.view.entry.EntryViewActivity;
import com.kakao.tistory.presentation.view.entry.k0;

public final class p implements Runnable {
    public final int a;
    public final boolean b;
    public final Context c;
    public final Object d;

    public p(Context context0, boolean z, TaskCompletionSource taskCompletionSource0) {
        this.a = 0;
        super();
        this.c = context0;
        this.b = z;
        this.d = taskCompletionSource0;
    }

    public p(boolean z, EntryViewActivity entryViewActivity0, MutableState mutableState0) {
        this.a = 1;
        super();
        this.b = z;
        this.c = entryViewActivity0;
        this.d = mutableState0;
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            k0.a(this.b, ((EntryViewActivity)this.c), ((MutableState)this.d));
            return;
        }
        Context context0 = this.c;
        TaskCompletionSource taskCompletionSource0 = (TaskCompletionSource)this.d;
        try {
            if(Binder.getCallingUid() == context0.getApplicationInfo().uid) {
                Context context1 = context0.getApplicationContext();
                if(context1 == null) {
                    context1 = context0;
                }
                SharedPreferences.Editor sharedPreferences$Editor0 = context1.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                sharedPreferences$Editor0.putBoolean("proxy_notification_initialized", true);
                sharedPreferences$Editor0.apply();
                NotificationManager notificationManager0 = (NotificationManager)context0.getSystemService(NotificationManager.class);
                if(this.b) {
                    k.p(notificationManager0);
                }
                else if("com.google.android.gms".equals(notificationManager0.getNotificationDelegate())) {
                    k.B(notificationManager0);
                }
            }
            else {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package net.daum.android.tistoryapp");
            }
        }
        finally {
            taskCompletionSource0.trySetResult(null);
        }
    }
}

