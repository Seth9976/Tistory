package kotlinx.coroutines;

import kotlin.Unit;

public final class b extends DelayedTask {
    public final CancellableContinuation b;
    public final EventLoopImplBase c;

    public b(EventLoopImplBase eventLoopImplBase0, long v, CancellableContinuation cancellableContinuation0) {
        this.c = eventLoopImplBase0;
        super(v);
        this.b = cancellableContinuation0;
    }

    @Override
    public final void run() {
        this.b.resumeUndispatched(this.c, Unit.INSTANCE);
    }

    @Override  // kotlinx.coroutines.EventLoopImplBase$DelayedTask
    public final String toString() {
        return super.toString() + this.b;
    }
}

