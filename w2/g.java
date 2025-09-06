package w2;

import androidx.concurrent.futures.AbstractResolvableFuture;

public final class g {
    public volatile Thread a;
    public volatile g b;
    public static final g c;

    static {
        g.c = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public g() {
        AbstractResolvableFuture.f.S(this, Thread.currentThread());
    }
}

