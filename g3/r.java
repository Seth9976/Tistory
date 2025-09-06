package g3;

import android.os.Handler;
import android.os.Looper;
import androidx.core.util.Preconditions;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class r implements Executor {
    public final int a;
    public final Object b;

    public r() {
        this.a = 1;
        super();
        this.b = new Handler(Looper.getMainLooper());
    }

    public r(Handler handler0) {
        this.a = 0;
        super();
        this.b = (Handler)Preconditions.checkNotNull(handler0);
    }

    public r(WorkManagerTaskExecutor workManagerTaskExecutor0) {
        this.a = 2;
        super();
        this.b = workManagerTaskExecutor0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        switch(this.a) {
            case 0: {
                Looper looper0 = Looper.myLooper();
                Handler handler0 = (Handler)this.b;
                if(looper0 == handler0.getLooper()) {
                    runnable0.run();
                    return;
                }
                if(!handler0.post(((Runnable)Preconditions.checkNotNull(runnable0)))) {
                    throw new RejectedExecutionException(handler0 + " is shutting down");
                }
                return;
            }
            case 1: {
                ((Handler)this.b).post(runnable0);
                return;
            }
            default: {
                ((WorkManagerTaskExecutor)this.b).c.post(runnable0);
            }
        }
    }
}

