package zc;

import android.os.Handler;
import android.os.Message;
import io.reactivex.Scheduler.Worker;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

public final class b extends Worker {
    public final Handler a;
    public final boolean b;
    public volatile boolean c;

    public b(Handler handler0, boolean z) {
        this.a = handler0;
        this.b = z;
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.c = true;
        this.a.removeCallbacksAndMessages(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c;
    }

    @Override  // io.reactivex.Scheduler$Worker
    public final Disposable schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        if(runnable0 == null) {
            throw new NullPointerException("run == null");
        }
        if(timeUnit0 == null) {
            throw new NullPointerException("unit == null");
        }
        if(this.c) {
            return Disposables.disposed();
        }
        Runnable runnable1 = RxJavaPlugins.onSchedule(runnable0);
        Disposable disposable0 = new c(this.a, runnable1);
        Message message0 = Message.obtain(this.a, ((Runnable)disposable0));
        message0.obj = this;
        if(this.b) {
            message0.setAsynchronous(true);
        }
        long v1 = timeUnit0.toMillis(v);
        this.a.sendMessageDelayed(message0, v1);
        if(this.c) {
            this.a.removeCallbacks(((Runnable)disposable0));
            return Disposables.disposed();
        }
        return disposable0;
    }
}

