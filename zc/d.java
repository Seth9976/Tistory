package zc;

import android.os.Handler;
import android.os.Message;
import io.reactivex.Scheduler.Worker;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

public final class d extends Scheduler {
    public final Handler c;
    public final boolean d;

    public d(Handler handler0, boolean z) {
        this.c = handler0;
        this.d = z;
    }

    @Override  // io.reactivex.Scheduler
    public final Worker createWorker() {
        return new b(this.c, this.d);
    }

    @Override  // io.reactivex.Scheduler
    public final Disposable scheduleDirect(Runnable runnable0, long v, TimeUnit timeUnit0) {
        if(runnable0 == null) {
            throw new NullPointerException("run == null");
        }
        if(timeUnit0 == null) {
            throw new NullPointerException("unit == null");
        }
        Runnable runnable1 = RxJavaPlugins.onSchedule(runnable0);
        Handler handler0 = this.c;
        Disposable disposable0 = new c(handler0, runnable1);
        Message message0 = Message.obtain(handler0, ((Runnable)disposable0));
        if(this.d) {
            message0.setAsynchronous(true);
        }
        handler0.sendMessageDelayed(message0, timeUnit0.toMillis(v));
        return disposable0;
    }
}

