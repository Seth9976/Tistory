package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.core.app.o;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;

public abstract class Worker extends ListenableWorker {
    public SettableFuture e;

    public Worker(@NonNull Context context0, @NonNull WorkerParameters workerParameters0) {
        super(context0, workerParameters0);
    }

    @NonNull
    @WorkerThread
    public abstract Result doWork();

    @NonNull
    @WorkerThread
    public ForegroundInfo getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override  // androidx.work.ListenableWorker
    @NonNull
    public ListenableFuture getForegroundInfoAsync() {
        ListenableFuture listenableFuture0 = SettableFuture.create();
        this.getBackgroundExecutor().execute(new o(this, listenableFuture0, false, 28));
        return listenableFuture0;
    }

    @Override  // androidx.work.ListenableWorker
    @NonNull
    public final ListenableFuture startWork() {
        this.e = SettableFuture.create();
        this.getBackgroundExecutor().execute(new b(this));
        return this.e;
    }
}

