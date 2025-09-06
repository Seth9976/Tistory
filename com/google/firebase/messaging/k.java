package com.google.firebase.messaging;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.Utils;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import r8.b;
import r8.c;

public final class k implements TransportScheduleCallback, CriticalSection, SuccessContinuation {
    public final Object a;
    public final Object b;
    public final Object c;

    public k(Object object0, Object object1, Object object2) {
        this.a = object0;
        this.b = object1;
        this.c = object2;
        super();
    }

    @Override  // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
    public Object execute() {
        ((DefaultScheduler)this.a).d.persist(((TransportContext)this.b), ((EventInternal)this.c));
        ((DefaultScheduler)this.a).a.schedule(((TransportContext)this.b), 1);
        return null;
    }

    @Override  // com.google.android.datatransport.TransportScheduleCallback
    public void onSchedule(Exception exception0) {
        c c0 = (c)this.a;
        c0.getClass();
        TaskCompletionSource taskCompletionSource0 = (TaskCompletionSource)this.b;
        if(exception0 != null) {
            taskCompletionSource0.trySetException(exception0);
            return;
        }
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        new Thread(new b(0, c0, countDownLatch0)).start();
        Utils.awaitUninterruptibly(countDownLatch0, 2L, TimeUnit.SECONDS);
        taskCompletionSource0.trySetResult(((CrashlyticsReportWithSessionId)this.c));
    }

    @Override  // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object object0) {
        FirebaseMessaging firebaseMessaging0 = (FirebaseMessaging)this.a;
        String s = (String)this.b;
        q q0 = (q)this.c;
        f f0 = FirebaseMessaging.c(firebaseMessaging0.d);
        String s1 = firebaseMessaging0.d();
        String s2 = firebaseMessaging0.l.a();
        synchronized(f0) {
            String s3 = q.a(((String)object0), System.currentTimeMillis(), s2);
            if(s3 != null) {
                SharedPreferences.Editor sharedPreferences$Editor0 = ((SharedPreferences)f0.a).edit();
                sharedPreferences$Editor0.putString(s1 + "|T|" + s + "|*", s3);
                sharedPreferences$Editor0.commit();
            }
        }
        if(q0 == null || !((String)object0).equals(q0.a)) {
            firebaseMessaging0.f(((String)object0));
        }
        return Tasks.forResult(((String)object0));
    }
}

