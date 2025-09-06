package androidx.work.impl.utils.futures;

import g.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class e extends b {
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4) {
        this.b = atomicReferenceFieldUpdater0;
        this.c = atomicReferenceFieldUpdater1;
        this.d = atomicReferenceFieldUpdater2;
        this.e = atomicReferenceFieldUpdater3;
        this.f = atomicReferenceFieldUpdater4;
    }

    @Override  // g.b
    public final boolean d(AbstractFuture abstractFuture0, d d0, d d1) {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = this.e;
            if(atomicReferenceFieldUpdater0.compareAndSet(abstractFuture0, d0, d1)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(abstractFuture0) == d0);
        return false;
    }

    @Override  // g.b
    public final boolean e(AbstractFuture abstractFuture0, Object object0, Object object1) {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = this.f;
            if(atomicReferenceFieldUpdater0.compareAndSet(abstractFuture0, object0, object1)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(abstractFuture0) == object0);
        return false;
    }

    @Override  // g.b
    public final boolean f(AbstractFuture abstractFuture0, h h0, h h1) {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = this.d;
            if(atomicReferenceFieldUpdater0.compareAndSet(abstractFuture0, h0, h1)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(abstractFuture0) == h0);
        return false;
    }

    @Override  // g.b
    public final void x(h h0, h h1) {
        this.c.lazySet(h0, h1);
    }

    @Override  // g.b
    public final void y(h h0, Thread thread0) {
        this.b.lazySet(h0, thread0);
    }
}

