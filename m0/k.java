package m0;

import java.util.function.IntConsumer;

public final class k implements Runnable {
    public final int a;
    public final IntConsumer b;
    public final int c;

    public k(IntConsumer intConsumer0, int v, int v1) {
        this.a = v1;
        this.b = intConsumer0;
        this.c = v;
        super();
    }

    @Override
    public final void run() {
        if(this.a != 0) {
            this.b.accept(this.c);
            return;
        }
        this.b.accept(this.c);
    }
}

