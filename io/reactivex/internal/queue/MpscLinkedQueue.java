package io.reactivex.internal.queue;

import hd.a;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import java.util.concurrent.atomic.AtomicReference;

public final class MpscLinkedQueue implements SimplePlainQueue {
    public final AtomicReference a;
    public final AtomicReference b;

    public MpscLinkedQueue() {
        AtomicReference atomicReference0 = new AtomicReference();
        this.a = atomicReference0;
        AtomicReference atomicReference1 = new AtomicReference();
        this.b = atomicReference1;
        a a0 = new a();  // 初始化器: Ljava/util/concurrent/atomic/AtomicReference;-><init>()V
        atomicReference1.lazySet(a0);
        a a1 = (a)atomicReference0.getAndSet(a0);
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while(this.poll() != null && !this.isEmpty()) {
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return ((a)this.b.get()) == ((a)this.a.get());
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object object0) {
        if(object0 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        a a0 = new a();  // 初始化器: Ljava/util/concurrent/atomic/AtomicReference;-><init>()V
        a0.a = object0;
        ((a)this.a.getAndSet(a0)).lazySet(a0);
        return true;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(Object object0, Object object1) {
        this.offer(object0);
        this.offer(object1);
        return true;
    }

    @Override  // io.reactivex.internal.fuseable.SimplePlainQueue
    @Nullable
    public Object poll() {
        a a2;
        AtomicReference atomicReference0 = this.b;
        a a0 = (a)atomicReference0.get();
        a a1 = (a)a0.get();
        if(a1 != null) {
            Object object0 = a1.a;
            a1.a = null;
            atomicReference0.lazySet(a1);
            return object0;
        }
        if(a0 != ((a)this.a.get())) {
            do {
                a2 = (a)a0.get();
            }
            while(a2 == null);
            Object object1 = a2.a;
            a2.a = null;
            atomicReference0.lazySet(a2);
            return object1;
        }
        return null;
    }
}

