package io.reactivex.processors;

import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class k extends FlowableProcessor {
    public final FlowableProcessor b;
    public boolean c;
    public AppendOnlyLinkedArrayList d;
    public volatile boolean e;

    public k(FlowableProcessor flowableProcessor0) {
        this.b = flowableProcessor0;
    }

    public final void e() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0;
        while(true) {
            synchronized(this) {
                appendOnlyLinkedArrayList0 = this.d;
                if(appendOnlyLinkedArrayList0 == null) {
                    break;
                }
                this.d = null;
            }
            appendOnlyLinkedArrayList0.accept(this.b);
        }
        this.c = false;
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public final Throwable getThrowable() {
        return this.b.getThrowable();
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public final boolean hasComplete() {
        return this.b.hasComplete();
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public final boolean hasSubscribers() {
        return this.b.hasSubscribers();
    }

    @Override  // io.reactivex.processors.FlowableProcessor
    public final boolean hasThrowable() {
        return this.b.hasThrowable();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onComplete() {
        if(this.e) {
            return;
        }
        synchronized(this) {
            if(this.e) {
                return;
            }
            this.e = true;
            if(this.c) {
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.d;
                if(appendOnlyLinkedArrayList0 == null) {
                    appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                    this.d = appendOnlyLinkedArrayList0;
                }
                appendOnlyLinkedArrayList0.add(NotificationLite.complete());
                return;
            }
            this.c = true;
        }
        this.b.onComplete();
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onError(Throwable throwable0) {
        if(this.e) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        boolean z = true;
        synchronized(this) {
            if(!this.e) {
                this.e = true;
                if(this.c) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.d;
                    if(appendOnlyLinkedArrayList0 == null) {
                        appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                        this.d = appendOnlyLinkedArrayList0;
                    }
                    appendOnlyLinkedArrayList0.setFirst(NotificationLite.error(throwable0));
                    return;
                }
                this.c = true;
                z = false;
            }
        }
        if(z) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.b.onError(throwable0);
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.e) {
            return;
        }
        synchronized(this) {
            if(this.e) {
                return;
            }
            if(this.c) {
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.d;
                if(appendOnlyLinkedArrayList0 == null) {
                    appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                    this.d = appendOnlyLinkedArrayList0;
                }
                appendOnlyLinkedArrayList0.add(object0);
                return;
            }
            this.c = true;
        }
        this.b.onNext(object0);
        this.e();
    }

    @Override  // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription0) {
        boolean z = true;
        if(!this.e) {
            synchronized(this) {
                if(!this.e) {
                    if(this.c) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.d;
                        if(appendOnlyLinkedArrayList0 == null) {
                            appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                            this.d = appendOnlyLinkedArrayList0;
                        }
                        appendOnlyLinkedArrayList0.add(NotificationLite.subscription(subscription0));
                        return;
                    }
                    this.c = true;
                    z = false;
                }
            }
        }
        if(z) {
            subscription0.cancel();
            return;
        }
        this.b.onSubscribe(subscription0);
        this.e();
    }

    @Override  // io.reactivex.Flowable
    public final void subscribeActual(Subscriber subscriber0) {
        this.b.subscribe(subscriber0);
    }
}

