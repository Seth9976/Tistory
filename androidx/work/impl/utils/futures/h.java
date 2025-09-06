package androidx.work.impl.utils.futures;

public final class h {
    public volatile Thread a;
    public volatile h b;
    public static final h c;

    static {
        h.c = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public h() {
        AbstractFuture.f.y(this, Thread.currentThread());
    }
}

