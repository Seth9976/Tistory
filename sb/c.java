package sb;

import io.reactivex.functions.Function;

public final class c implements Function {
    public final int a;
    public static final c b;
    public static final c c;
    public static final c d;

    static {
        c.b = new c(0);
        c.c = new c(1);
        c.d = new c(2);
    }

    public c(int v) {
        this.a = v;
        super();
    }

    // 检测为 Lambda 实现
    @Override  // io.reactivex.functions.Function
    public final Object apply(Object object0) [...]
}

