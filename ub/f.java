package ub;

import io.reactivex.functions.Action;

public final class f implements Action {
    public static final f a;

    static {
        f.a = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // io.reactivex.functions.Action
    public final void run() {
    }
}

