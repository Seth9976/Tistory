package w2;

import androidx.concurrent.futures.AbstractResolvableFuture;
import g.a;

public final class f extends a {
    @Override  // g.a
    public final void R(g g0, g g1) {
        g0.b = g1;
    }

    @Override  // g.a
    public final void S(g g0, Thread thread0) {
        g0.a = thread0;
    }

    @Override  // g.a
    public final boolean f(AbstractResolvableFuture abstractResolvableFuture0, c c0, c c1) {
        synchronized(abstractResolvableFuture0) {
            if(abstractResolvableFuture0.b == c0) {
                abstractResolvableFuture0.b = c1;
                return true;
            }
        }
        return false;
    }

    @Override  // g.a
    public final boolean g(AbstractResolvableFuture abstractResolvableFuture0, Object object0, Object object1) {
        synchronized(abstractResolvableFuture0) {
            if(abstractResolvableFuture0.a == object0) {
                abstractResolvableFuture0.a = object1;
                return true;
            }
        }
        return false;
    }

    @Override  // g.a
    public final boolean h(AbstractResolvableFuture abstractResolvableFuture0, g g0, g g1) {
        synchronized(abstractResolvableFuture0) {
            if(abstractResolvableFuture0.c == g0) {
                abstractResolvableFuture0.c = g1;
                return true;
            }
        }
        return false;
    }
}

