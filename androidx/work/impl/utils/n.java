package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.ForegroundInfo;
import androidx.work.impl.utils.futures.SettableFuture;
import java.util.UUID;

public final class n implements Runnable {
    public final SettableFuture a;
    public final UUID b;
    public final ForegroundInfo c;
    public final Context d;
    public final WorkForegroundUpdater e;

    public n(WorkForegroundUpdater workForegroundUpdater0, SettableFuture settableFuture0, UUID uUID0, ForegroundInfo foregroundInfo0, Context context0) {
        this.e = workForegroundUpdater0;
        this.a = settableFuture0;
        this.b = uUID0;
        this.c = foregroundInfo0;
        this.d = context0;
    }

    @Override
    public final void run() {
        SettableFuture settableFuture0;
        try {
            WorkForegroundUpdater workForegroundUpdater0 = this.e;
            settableFuture0 = this.a;
            if(!settableFuture0.isCancelled()) {
                workForegroundUpdater0.c.getWorkSpec(this.b.toString());
                throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            settableFuture0.set(null);
            return;
        }
        catch(Throwable throwable0) {
        }
        settableFuture0.setException(throwable0);
    }
}

