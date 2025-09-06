package cd;

import io.reactivex.internal.operators.flowable.o4;
import java.util.concurrent.Callable;
import kd.a;
import kd.b;
import kd.c;
import kd.d;

public final class n implements Callable {
    public final int a;

    public n(int v) {
        this.a = v;
        super();
    }

    @Override
    public final Object call() {
        switch(this.a) {
            case 0: {
                return null;
            }
            case 1: {
                return new o4(16);  // 初始化器: Ljava/util/ArrayList;-><init>(I)V
            }
            case 2: {
                return a.a;
            }
            case 3: {
                return b.a;
            }
            case 4: {
                return c.a;
            }
            case 5: {
                return d.a;
            }
            default: {
                return zc.a.a;
            }
        }
    }
}

