package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.HandlerCompat;
import androidx.work.RunnableScheduler;

@RestrictTo({Scope.LIBRARY_GROUP})
public class DefaultRunnableScheduler implements RunnableScheduler {
    public final Handler a;

    public DefaultRunnableScheduler() {
        this.a = HandlerCompat.createAsync(Looper.getMainLooper());
    }

    @Override  // androidx.work.RunnableScheduler
    public void cancel(@NonNull Runnable runnable0) {
        this.a.removeCallbacks(runnable0);
    }

    @NonNull
    public Handler getHandler() {
        return this.a;
    }

    @Override  // androidx.work.RunnableScheduler
    public void scheduleWithDelay(long v, @NonNull Runnable runnable0) {
        this.a.postDelayed(runnable0, v);
    }
}

