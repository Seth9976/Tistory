package com.google.firebase.crashlytics.internal.common;

import androidx.core.app.o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.util.concurrent.Callable;

public final class g implements Continuation, CrashlyticsUncaughtExceptionHandler.CrashListener {
    public final int a;
    public Object b;

    public g() {
        this.a = 2;
        super();
    }

    public g(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler$CrashListener
    public void onUncaughtException(SettingsProvider settingsProvider0, Thread thread0, Throwable throwable0) {
        ((l)this.b).g(settingsProvider0, thread0, throwable0, false);
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public Object then(Task task0) {
        if(this.a != 1) {
            boolean z = task0.isSuccessful();
            o o0 = (o)this.b;
            if(z) {
                Object object0 = task0.getResult();
                ((TaskCompletionSource)o0.c).setResult(object0);
                return null;
            }
            Exception exception0 = task0.getException();
            ((TaskCompletionSource)o0.c).setException(exception0);
            return null;
        }
        return ((Callable)this.b).call();
    }
}

