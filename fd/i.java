package fd;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class i extends AtomicReference implements FlowableSubscriber {
    public final j a;
    public final int b;
    public final int c;
    public long d;
    public volatile SpscArrayQueue e;

    public i(j j0, int v) {
        this.a = j0;
        this.b = v;
        this.c = v - (v >> 2);
    }

    public final SimplePlainQueue a() {
        SpscArrayQueue spscArrayQueue0 = this.e;
        if(spscArrayQueue0 == null) {
            spscArrayQueue0 = new SpscArrayQueue(this.b);
            this.e = spscArrayQueue0;
        }
        return spscArrayQueue0;
    }

    public final void b() {
        long v = this.d + 1L;
        if(v == ((long)this.c)) {
            this.d = 0L;
            ((Subscription)this.get()).request(v);
            return;
        }
        this.d = v;
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        j j0 = this.a;
        if(j0.g != 0) {
            j0.f.decrementAndGet();
            j0.c();
            return;
        }
        j0.f.decrementAndGet();
        j0.c();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        this.a.e(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        j j0 = this.a;
        if(j0.g == 0) {
            if(j0.get() == 0 && j0.compareAndSet(0, 1)) {
                AtomicLong atomicLong1 = j0.d;
                int v2 = Long.compare(atomicLong1.get(), 0L);
                Subscriber subscriber0 = j0.a;
                if(v2 != 0) {
                    subscriber0.onNext(object0);
                    if(atomicLong1.get() != 0x7FFFFFFFFFFFFFFFL) {
                        atomicLong1.decrementAndGet();
                    }
                    long v3 = this.d + 1L;
                    if(v3 >= ((long)this.c)) {
                        this.d = 0L;
                        ((Subscription)this.get()).request(v3);
                    }
                    else {
                        this.d = v3;
                    }
                }
                else if(!this.a().offer(object0)) {
                    j0.a();
                    MissingBackpressureException missingBackpressureException0 = new MissingBackpressureException("Queue full?!");
                    if(j0.c.compareAndSet(null, missingBackpressureException0)) {
                        subscriber0.onError(missingBackpressureException0);
                        return;
                    }
                    RxJavaPlugins.onError(missingBackpressureException0);
                    return;
                }
                if(j0.decrementAndGet() == 0) {
                    return;
                }
                j0.d();
                return;
            }
            if(!this.a().offer(object0)) {
                j0.a();
                j0.e(new MissingBackpressureException("Queue full?!"));
                return;
            }
            if(j0.getAndIncrement() == 0) {
                j0.d();
            }
        }
        else {
            int v = j0.get();
            AtomicInteger atomicInteger0 = j0.f;
            AtomicThrowable atomicThrowable0 = j0.c;
            if(v == 0 && j0.compareAndSet(0, 1)) {
                AtomicLong atomicLong0 = j0.d;
                if(atomicLong0.get() != 0L) {
                    j0.a.onNext(object0);
                    if(atomicLong0.get() != 0x7FFFFFFFFFFFFFFFL) {
                        atomicLong0.decrementAndGet();
                    }
                    long v1 = this.d + 1L;
                    if(v1 >= ((long)this.c)) {
                        this.d = 0L;
                        ((Subscription)this.get()).request(v1);
                    }
                    else {
                        this.d = v1;
                    }
                }
                else if(!this.a().offer(object0)) {
                    SubscriptionHelper.cancel(this);
                    atomicThrowable0.addThrowable(new MissingBackpressureException("Queue full?!"));
                    atomicInteger0.decrementAndGet();
                    j0.d();
                    return;
                }
                if(j0.decrementAndGet() != 0) {
                    j0.d();
                    return;
                }
                return;
            }
            if(!this.a().offer(object0) && SubscriptionHelper.cancel(this)) {
                atomicThrowable0.addThrowable(new MissingBackpressureException("Queue full?!"));
                atomicInteger0.decrementAndGet();
            }
            if(j0.getAndIncrement() == 0) {
                j0.d();
            }
        }
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.setOnce(this, subscription0, ((long)this.b));
    }
}

