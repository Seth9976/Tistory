package io.reactivex.processors;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class b extends AtomicLong implements NonThrowingPredicate, Subscription {
    public final Subscriber a;
    public final BehaviorProcessor b;
    public boolean c;
    public boolean d;
    public AppendOnlyLinkedArrayList e;
    public boolean f;
    public volatile boolean g;
    public long h;

    public b(Subscriber subscriber0, BehaviorProcessor behaviorProcessor0) {
        this.a = subscriber0;
        this.b = behaviorProcessor0;
    }

    public final void a(Object object0, long v) {
        if(this.g) {
            return;
        }
        if(!this.f) {
            synchronized(this) {
                if(this.g) {
                    return;
                }
                if(this.h == v) {
                    return;
                }
                if(this.d) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.e;
                    if(appendOnlyLinkedArrayList0 == null) {
                        appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                        this.e = appendOnlyLinkedArrayList0;
                    }
                    appendOnlyLinkedArrayList0.add(object0);
                    return;
                }
                this.c = true;
            }
            this.f = true;
        }
        this.test(object0);
    }

    @Override  // org.reactivestreams.Subscription
    public final void cancel() {
        if(!this.g) {
            this.g = true;
            this.b.e(this);
        }
    }

    @Override  // org.reactivestreams.Subscription
    public final void request(long v) {
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(this, v);
        }
    }

    @Override  // io.reactivex.internal.util.AppendOnlyLinkedArrayList$NonThrowingPredicate
    public final boolean test(Object object0) {
        if(this.g) {
            return true;
        }
        if(NotificationLite.isComplete(object0)) {
            this.a.onComplete();
            return true;
        }
        if(NotificationLite.isError(object0)) {
            Throwable throwable0 = NotificationLite.getError(object0);
            this.a.onError(throwable0);
            return true;
        }
        long v = this.get();
        if(v != 0L) {
            this.a.onNext(object0);
            if(v != 0x7FFFFFFFFFFFFFFFL) {
                this.decrementAndGet();
            }
            return false;
        }
        this.cancel();
        MissingBackpressureException missingBackpressureException0 = new MissingBackpressureException("Could not deliver value due to lack of requests");
        this.a.onError(missingBackpressureException0);
        return true;
    }
}

