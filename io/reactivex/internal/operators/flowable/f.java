package io.reactivex.internal.operators.flowable;

import io.reactivex.Notification;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class f extends DisposableSubscriber {
    public final ArrayBlockingQueue b;
    public final AtomicInteger c;

    public f() {
        this.b = new ArrayBlockingQueue(1);
        this.c = new AtomicInteger();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        Notification notification0 = (Notification)object0;
        if(this.c.getAndSet(0) == 1 || !notification0.isOnNext()) {
            while(true) {
                ArrayBlockingQueue arrayBlockingQueue0 = this.b;
                if(arrayBlockingQueue0.offer(notification0)) {
                    break;
                }
                Notification notification1 = (Notification)arrayBlockingQueue0.poll();
                if(notification1 != null && !notification1.isOnNext()) {
                    notification0 = notification1;
                }
            }
        }
    }
}

