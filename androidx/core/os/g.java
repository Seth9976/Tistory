package androidx.core.os;

import android.os.Handler;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class g implements Executor {
    public final Handler a;

    public g(Handler handler0) {
        this.a = (Handler)Preconditions.checkNotNull(handler0);
    }

    @Override
    public final void execute(Runnable runnable0) {
        Runnable runnable1 = (Runnable)Preconditions.checkNotNull(runnable0);
        Handler handler0 = this.a;
        if(!handler0.post(runnable1)) {
            throw new RejectedExecutionException(handler0 + " is shutting down");
        }
    }
}

