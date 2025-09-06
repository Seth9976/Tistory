package sf;

import java.util.concurrent.ScheduledFuture;
import kotlinx.coroutines.DisposableHandle;

public final class r implements DisposableHandle {
    public final ScheduledFuture a;

    public r(ScheduledFuture scheduledFuture0) {
        this.a = scheduledFuture0;
    }

    @Override  // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        this.a.cancel(false);
    }

    @Override
    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}

