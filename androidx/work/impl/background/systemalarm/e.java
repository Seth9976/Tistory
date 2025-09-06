package androidx.work.impl.background.systemalarm;

public final class e implements Runnable {
    public final int a;
    public final DelayMetCommandHandler b;

    public e(DelayMetCommandHandler delayMetCommandHandler0, int v) {
        this.a = v;
        this.b = delayMetCommandHandler0;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            DelayMetCommandHandler.b(this.b);
            return;
        }
        DelayMetCommandHandler.a(this.b);
    }
}

