package w2;

import androidx.concurrent.futures.AbstractResolvableFuture;
import g.a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class d extends a {
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;
    public final AtomicReferenceFieldUpdater p;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4) {
        this.l = atomicReferenceFieldUpdater0;
        this.m = atomicReferenceFieldUpdater1;
        this.n = atomicReferenceFieldUpdater2;
        this.o = atomicReferenceFieldUpdater3;
        this.p = atomicReferenceFieldUpdater4;
    }

    @Override  // g.a
    public final void R(g g0, g g1) {
        this.m.lazySet(g0, g1);
    }

    @Override  // g.a
    public final void S(g g0, Thread thread0) {
        this.l.lazySet(g0, thread0);
    }

    @Override  // g.a
    public final boolean f(AbstractResolvableFuture abstractResolvableFuture0, c c0, c c1) {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = this.o;
            if(atomicReferenceFieldUpdater0.compareAndSet(abstractResolvableFuture0, c0, c1)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(abstractResolvableFuture0) == c0);
        return false;
    }

    @Override  // g.a
    public final boolean g(AbstractResolvableFuture abstractResolvableFuture0, Object object0, Object object1) {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = this.p;
            if(atomicReferenceFieldUpdater0.compareAndSet(abstractResolvableFuture0, object0, object1)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(abstractResolvableFuture0) == object0);
        return false;
    }

    @Override  // g.a
    public final boolean h(AbstractResolvableFuture abstractResolvableFuture0, g g0, g g1) {
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0 = this.n;
            if(atomicReferenceFieldUpdater0.compareAndSet(abstractResolvableFuture0, g0, g1)) {
                return true;
            }
        }
        while(atomicReferenceFieldUpdater0.get(abstractResolvableFuture0) == g0);
        return false;
    }
}

