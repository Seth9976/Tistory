package fd;

import io.reactivex.Scheduler.Worker;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class t extends q {
    public final Subscriber k;

    public t(Subscriber subscriber0, int v, SpscArrayQueue spscArrayQueue0, Worker scheduler$Worker0) {
        super(v, spscArrayQueue0, scheduler$Worker0);
        this.k = subscriber0;
    }

    @Override  // io.reactivex.FlowableSubscriber
    public final void onSubscribe(Subscription subscription0) {
        if(SubscriptionHelper.validate(this.e, subscription0)) {
            this.e = subscription0;
            this.k.onSubscribe(this);
            subscription0.request(((long)this.a));
        }
    }

    @Override
    public final void run() {
        int v = this.j;
        SpscArrayQueue spscArrayQueue0 = this.c;
        Subscriber subscriber0 = this.k;
        int v1 = this.b;
        int v2 = 1;
        while(true) {
            long v3 = this.h.get();
            long v4 = 0L;
            int v5;
            while((v5 = Long.compare(v4, v3)) != 0) {
                if(this.i) {
                    spscArrayQueue0.clear();
                    return;
                }
                boolean z = this.f;
                if(z) {
                    Throwable throwable0 = this.g;
                    if(throwable0 != null) {
                        spscArrayQueue0.clear();
                        subscriber0.onError(throwable0);
                        this.d.dispose();
                        return;
                    }
                }
                Object object0 = spscArrayQueue0.poll();
                if(z && object0 == null) {
                    subscriber0.onComplete();
                    this.d.dispose();
                    return;
                }
                if(object0 == null) {
                    break;
                }
                subscriber0.onNext(object0);
                ++v4;
                ++v;
                if(v == v1) {
                    this.e.request(((long)v));
                    v = 0;
                }
            }
            if(v5 == 0) {
                if(this.i) {
                    spscArrayQueue0.clear();
                    return;
                }
                if(this.f) {
                    Throwable throwable1 = this.g;
                    if(throwable1 != null) {
                        spscArrayQueue0.clear();
                        subscriber0.onError(throwable1);
                        this.d.dispose();
                        return;
                    }
                    if(spscArrayQueue0.isEmpty()) {
                        subscriber0.onComplete();
                        this.d.dispose();
                        return;
                    }
                }
            }
            if(v4 != 0L && v3 != 0x7FFFFFFFFFFFFFFFL) {
                this.h.addAndGet(-v4);
            }
            int v6 = this.get();
            if(v6 == v2) {
                this.j = v;
                v2 = this.addAndGet(-v2);
                if(v2 != 0) {
                    continue;
                }
                return;
            }
            v2 = v6;
        }
    }
}

