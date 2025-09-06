package kotlinx.coroutines;

public final class c extends DelayedTask {
    public final Runnable b;

    public c(long v, Runnable runnable0) {
        super(v);
        this.b = runnable0;
    }

    @Override
    public final void run() {
        this.b.run();
    }

    @Override  // kotlinx.coroutines.EventLoopImplBase$DelayedTask
    public final String toString() {
        return super.toString() + this.b;
    }
}

