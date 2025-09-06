package l4;

import a6.a;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public final class c extends FutureTask {
    public final g a;

    public c(g g0, a a0) {
        this.a = g0;
        super(a0);
    }

    @Override
    public final void done() {
        g g0;
        try {
            g0 = this.a;
            Object object0 = this.get();
            if(!g0.e.get()) {
                g0.a(object0);
            }
        }
        catch(InterruptedException interruptedException0) {
            Log.w("AsyncTask", interruptedException0);
        }
        catch(ExecutionException executionException0) {
            throw new RuntimeException("An error occurred while executing doInBackground()", executionException0.getCause());
        }
        catch(CancellationException unused_ex) {
            if(!g0.e.get()) {
                g0.a(null);
            }
        }
        catch(Throwable throwable0) {
            throw new RuntimeException("An error occurred while executing doInBackground()", throwable0);
        }
    }
}

