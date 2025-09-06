package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.GroupedFlowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.EmptyComponent;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableGroupBy extends a {
    public static final class GroupBySubscriber extends BasicIntQueueSubscription implements FlowableSubscriber {
        public final Subscriber a;
        public final Function b;
        public final Function c;
        public final int d;
        public final boolean e;
        public final Map f;
        public final SpscLinkedArrayQueue g;
        public final Queue h;
        public Subscription i;
        public final AtomicBoolean j;
        public final AtomicLong k;
        public final AtomicInteger l;
        public Throwable m;
        public volatile boolean n;
        public boolean o;
        public boolean p;
        public static final Object q;

        static {
            GroupBySubscriber.q = new Object();
        }

        public GroupBySubscriber(Subscriber subscriber0, Function function0, Function function1, int v, boolean z, Map map0, Queue queue0) {
            this.j = new AtomicBoolean();
            this.k = new AtomicLong();
            this.l = new AtomicInteger(1);
            this.a = subscriber0;
            this.b = function0;
            this.c = function1;
            this.d = v;
            this.e = z;
            this.f = map0;
            this.h = queue0;
            this.g = new SpscLinkedArrayQueue(v);
        }

        public final boolean a(boolean z, boolean z1, Subscriber subscriber0, SpscLinkedArrayQueue spscLinkedArrayQueue0) {
            if(this.j.get()) {
                spscLinkedArrayQueue0.clear();
                return true;
            }
            if(this.e) {
                if(z && z1) {
                    Throwable throwable0 = this.m;
                    if(throwable0 != null) {
                        subscriber0.onError(throwable0);
                        return true;
                    }
                    subscriber0.onComplete();
                    return true;
                }
            }
            else if(z) {
                Throwable throwable1 = this.m;
                if(throwable1 != null) {
                    spscLinkedArrayQueue0.clear();
                    subscriber0.onError(throwable1);
                    return true;
                }
                if(z1) {
                    subscriber0.onComplete();
                    return true;
                }
            }
            return false;
        }

        public final void b() {
            Queue queue0 = this.h;
            if(queue0 != null) {
                int v = 0;
                f2 f20;
                while((f20 = (f2)queue0.poll()) != null) {
                    f20.c.f = true;
                    f20.c.drain();
                    ++v;
                }
                if(v != 0) {
                    this.l.addAndGet(-v);
                }
            }
        }

        @Override  // org.reactivestreams.Subscription
        public void cancel() {
            if(this.j.compareAndSet(false, true)) {
                this.b();
                if(this.l.decrementAndGet() == 0) {
                    this.i.cancel();
                }
            }
        }

        public void cancel(Object object0) {
            if(object0 == null) {
                object0 = GroupBySubscriber.q;
            }
            this.f.remove(object0);
            if(this.l.decrementAndGet() == 0) {
                this.i.cancel();
                if(!this.p && this.getAndIncrement() == 0) {
                    this.g.clear();
                }
            }
        }

        @Override  // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.g.clear();
        }

        public final void drain() {
            int v = 1;
            if(this.getAndIncrement() != 0) {
                return;
            }
            if(this.p) {
                SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.g;
                Subscriber subscriber0 = this.a;
                while(!this.j.get()) {
                    boolean z = this.n;
                    if(z && !this.e) {
                        Throwable throwable0 = this.m;
                        if(throwable0 != null) {
                            spscLinkedArrayQueue0.clear();
                            subscriber0.onError(throwable0);
                            return;
                        }
                    }
                    subscriber0.onNext(null);
                    if(z) {
                        Throwable throwable1 = this.m;
                        if(throwable1 != null) {
                            subscriber0.onError(throwable1);
                            return;
                        }
                        subscriber0.onComplete();
                        return;
                    }
                    v = this.addAndGet(-v);
                    if(v != 0) {
                        continue;
                    }
                    return;
                }
            }
            else {
                SpscLinkedArrayQueue spscLinkedArrayQueue1 = this.g;
                Subscriber subscriber1 = this.a;
                int v1 = 1;
            alab1:
                while(true) {
                    long v2 = this.k.get();
                    long v3 = 0L;
                    while(true) {
                        int v4 = Long.compare(v3, v2);
                        if(v4 != 0) {
                            boolean z1 = this.n;
                            GroupedFlowable groupedFlowable0 = (GroupedFlowable)spscLinkedArrayQueue1.poll();
                            if(this.a(z1, groupedFlowable0 == null, subscriber1, spscLinkedArrayQueue1)) {
                                break alab1;
                            }
                            if(groupedFlowable0 == null) {
                                goto label_39;
                            }
                            subscriber1.onNext(groupedFlowable0);
                            ++v3;
                            continue;
                        }
                    label_39:
                        if(v4 == 0 && this.a(this.n, spscLinkedArrayQueue1.isEmpty(), subscriber1, spscLinkedArrayQueue1)) {
                            break alab1;
                        }
                        if(v3 != 0L) {
                            if(v2 != 0x7FFFFFFFFFFFFFFFL) {
                                this.k.addAndGet(-v3);
                            }
                            this.i.request(v3);
                        }
                        v1 = this.addAndGet(-v1);
                        if(v1 != 0) {
                            break;
                        }
                        break alab1;
                    }
                }
            }
        }

        @Override  // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.g.isEmpty();
        }

        @Override  // org.reactivestreams.Subscriber
        public void onComplete() {
            if(!this.o) {
                for(Object object0: this.f.values()) {
                    ((f2)object0).c.f = true;
                    ((f2)object0).c.drain();
                }
                this.f.clear();
                Queue queue0 = this.h;
                if(queue0 != null) {
                    queue0.clear();
                }
                this.o = true;
                this.n = true;
                this.drain();
            }
        }

        @Override  // org.reactivestreams.Subscriber
        public void onError(Throwable throwable0) {
            if(this.o) {
                RxJavaPlugins.onError(throwable0);
                return;
            }
            this.o = true;
            for(Object object0: this.f.values()) {
                ((f2)object0).c.g = throwable0;
                ((f2)object0).c.f = true;
                ((f2)object0).c.drain();
            }
            this.f.clear();
            Queue queue0 = this.h;
            if(queue0 != null) {
                queue0.clear();
            }
            this.m = throwable0;
            this.n = true;
            this.drain();
        }

        @Override  // org.reactivestreams.Subscriber
        public void onNext(Object object0) {
            Object object3;
            boolean z;
            Object object1;
            if(this.o) {
                return;
            }
            try {
                object1 = this.b.apply(object0);
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                this.i.cancel();
                this.onError(throwable0);
                return;
            }
            Object object2 = object1 == null ? GroupBySubscriber.q : object1;
            Map map0 = this.f;
            f2 f20 = (f2)map0.get(object2);
            if(f20 == null) {
                if(this.j.get()) {
                    return;
                }
                f2 f21 = new f2(object1, new g2(this.d, this, object1, this.e));
                map0.put(object2, f21);
                this.l.getAndIncrement();
                z = true;
                f20 = f21;
            }
            else {
                z = false;
            }
            try {
                object3 = ObjectHelper.requireNonNull(this.c.apply(object0), "The valueSelector returned null");
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                this.i.cancel();
                this.onError(throwable1);
                return;
            }
            f20.c.b.offer(object3);
            f20.c.drain();
            this.b();
            if(z) {
                this.g.offer(f20);
                this.drain();
            }
        }

        @Override  // io.reactivex.FlowableSubscriber
        public void onSubscribe(Subscription subscription0) {
            if(SubscriptionHelper.validate(this.i, subscription0)) {
                this.i = subscription0;
                this.a.onSubscribe(this);
                subscription0.request(((long)this.d));
            }
        }

        @Nullable
        public GroupedFlowable poll() {
            return (GroupedFlowable)this.g.poll();
        }

        @Override  // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public Object poll() throws Exception {
            return this.poll();
        }

        @Override  // org.reactivestreams.Subscription
        public void request(long v) {
            if(SubscriptionHelper.validate(v)) {
                BackpressureHelper.add(this.k, v);
                this.drain();
            }
        }

        @Override  // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int v) {
            if((v & 2) != 0) {
                this.p = true;
                return 2;
            }
            return 0;
        }
    }

    public final Function b;
    public final Function c;
    public final int d;
    public final boolean e;
    public final Function f;

    public FlowableGroupBy(Flowable flowable0, Function function0, Function function1, int v, boolean z, Function function2) {
        super(flowable0);
        this.b = function0;
        this.c = function1;
        this.d = v;
        this.e = z;
        this.f = function2;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        ConcurrentLinkedQueue concurrentLinkedQueue0;
        Map map0;
        try {
            Function function0 = this.f;
            if(function0 == null) {
                map0 = new ConcurrentHashMap();
                concurrentLinkedQueue0 = null;
            }
            else {
                concurrentLinkedQueue0 = new ConcurrentLinkedQueue();
                map0 = (Map)function0.apply(new cd.a(concurrentLinkedQueue0, 1));
            }
        }
        catch(Exception exception0) {
            Exceptions.throwIfFatal(exception0);
            subscriber0.onSubscribe(EmptyComponent.INSTANCE);
            subscriber0.onError(exception0);
            return;
        }
        GroupBySubscriber flowableGroupBy$GroupBySubscriber0 = new GroupBySubscriber(subscriber0, this.b, this.c, this.d, this.e, map0, concurrentLinkedQueue0);
        this.source.subscribe(flowableGroupBy$GroupBySubscriber0);
    }
}

