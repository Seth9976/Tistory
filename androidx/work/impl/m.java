package androidx.work.impl;

import androidx.work.ListenableWorker.Result;
import androidx.work.Logger;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class m implements Runnable {
    public final String a;
    public final WorkerWrapper b;

    public m(WorkerWrapper workerWrapper0, String s) {
        this.b = workerWrapper0;
        this.a = s;
    }

    @Override
    public final void run() {
        WorkerWrapper workerWrapper0;
        String s;
        try {
            s = this.a;
            workerWrapper0 = this.b;
            Result listenableWorker$Result0 = (Result)workerWrapper0.q.get();
            if(listenableWorker$Result0 == null) {
                Logger.get().error("WM-WorkerWrapper", workerWrapper0.d.workerClassName + " returned a null result. Treating it as a failure.");
            }
            else {
                Logger.get().debug("WM-WorkerWrapper", workerWrapper0.d.workerClassName + " returned a " + listenableWorker$Result0 + ".");
                workerWrapper0.g = listenableWorker$Result0;
                return;
            }
            return;
        }
        catch(CancellationException cancellationException0) {
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            Logger.get().error("WM-WorkerWrapper", s + " failed because it threw an exception/error", interruptedException0);
            return;
        }
        finally {
            workerWrapper0.b();
        }
        Logger.get().info("WM-WorkerWrapper", s + " was cancelled", cancellationException0);
    }
}

