package androidx.core.provider;

public final class s implements Runnable {
    public final Object a;
    public final t b;

    public s(t t0, Object object0) {
        this.b = t0;
        this.a = object0;
    }

    @Override
    public final void run() {
        this.b.c.onReply(this.a);
    }
}

