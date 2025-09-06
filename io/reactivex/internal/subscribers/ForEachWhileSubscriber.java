package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class ForEachWhileSubscriber extends AtomicReference implements FlowableSubscriber, Disposable {
    public final Predicate a;
    public final Consumer b;
    public final Action c;
    public boolean d;

    public ForEachWhileSubscriber(Predicate predicate0, Consumer consumer0, Action action0) {
        this.a = predicate0;
        this.b = consumer0;
        this.c = action0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.get() == SubscriptionHelper.CANCELLED;
    }

    @Override  // org.reactivestreams.Subscriber
    public void onComplete() {
        if(this.d) {
            return;
        }
        try {
            this.d = true;
            this.c.run();
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            RxJavaPlugins.onError(throwable0);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        if(this.d) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        try {
            this.d = true;
            this.b.accept(throwable0);
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            RxJavaPlugins.onError(new CompositeException(new Throwable[]{throwable0, throwable1}));
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public void onNext(Object object0) {
        if(this.d) {
            return;
        }
        try {
            if(!this.a.test(object0)) {
                goto label_9;
            }
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            this.dispose();
            this.onError(throwable0);
        }
        return;
    label_9:
        this.dispose();
        this.onComplete();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription0) {
        SubscriptionHelper.setOnce(this, subscription0, 0x7FFFFFFFFFFFFFFFL);
    }
}

