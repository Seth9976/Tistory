package androidx.paging;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s4.d0;

public final class n {
    public final d0 a;
    public final d0 b;
    public Access c;
    public final ReentrantLock d;

    public n(HintHandler hintHandler0) {
        this.a = new d0();
        this.b = new d0();
        this.d = new ReentrantLock();
    }

    public final void a(Access viewportHint$Access0, Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        ReentrantLock reentrantLock0 = this.d;
        try {
            reentrantLock0.lock();
            if(viewportHint$Access0 != null) {
                this.c = viewportHint$Access0;
            }
            function20.invoke(this.a, this.b);
        }
        finally {
            reentrantLock0.unlock();
        }
    }
}

