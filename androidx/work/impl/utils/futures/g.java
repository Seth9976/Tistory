package androidx.work.impl.utils.futures;

import g.b;

public final class g extends b {
    @Override  // g.b
    public final boolean d(AbstractFuture abstractFuture0, d d0, d d1) {
        synchronized(abstractFuture0) {
            if(abstractFuture0.b == d0) {
                abstractFuture0.b = d1;
                return true;
            }
        }
        return false;
    }

    @Override  // g.b
    public final boolean e(AbstractFuture abstractFuture0, Object object0, Object object1) {
        synchronized(abstractFuture0) {
            if(abstractFuture0.a == object0) {
                abstractFuture0.a = object1;
                return true;
            }
        }
        return false;
    }

    @Override  // g.b
    public final boolean f(AbstractFuture abstractFuture0, h h0, h h1) {
        synchronized(abstractFuture0) {
            if(abstractFuture0.c == h0) {
                abstractFuture0.c = h1;
                return true;
            }
        }
        return false;
    }

    @Override  // g.b
    public final void x(h h0, h h1) {
        h0.b = h1;
    }

    @Override  // g.b
    public final void y(h h0, Thread thread0) {
        h0.a = thread0;
    }
}

