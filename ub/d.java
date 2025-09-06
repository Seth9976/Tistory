package ub;

import io.reactivex.functions.Consumer;

public final class d implements Consumer {
    public final int a;
    public static final d b;
    public static final d c;
    public static final d d;

    static {
        d.b = new d(0);
        d.c = new d(1);
        d.d = new d(2);
    }

    public d(int v) {
        this.a = v;
        super();
    }

    // 检测为 Lambda 实现
    @Override  // io.reactivex.functions.Consumer
    public final void accept(Object object0) [...]
}

