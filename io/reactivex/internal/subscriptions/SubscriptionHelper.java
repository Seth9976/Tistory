package io.reactivex.internal.subscriptions;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.q;
import org.reactivestreams.Subscription;

public enum SubscriptionHelper implements Subscription {
    CANCELLED;

    public static boolean cancel(AtomicReference atomicReference0) {
        Subscription subscription0 = (Subscription)atomicReference0.get();
        SubscriptionHelper subscriptionHelper0 = SubscriptionHelper.CANCELLED;
        if(subscription0 != subscriptionHelper0) {
            Subscription subscription1 = (Subscription)atomicReference0.getAndSet(subscriptionHelper0);
            if(subscription1 != subscriptionHelper0) {
                if(subscription1 != null) {
                    subscription1.cancel();
                }
                return true;
            }
        }
        return false;
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
    }

    public static void deferredRequest(AtomicReference atomicReference0, AtomicLong atomicLong0, long v) {
        Subscription subscription0 = (Subscription)atomicReference0.get();
        if(subscription0 != null) {
            subscription0.request(v);
            return;
        }
        if(SubscriptionHelper.validate(v)) {
            BackpressureHelper.add(atomicLong0, v);
            Subscription subscription1 = (Subscription)atomicReference0.get();
            if(subscription1 != null) {
                long v1 = atomicLong0.getAndSet(0L);
                if(v1 != 0L) {
                    subscription1.request(v1);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference atomicReference0, AtomicLong atomicLong0, Subscription subscription0) {
        if(SubscriptionHelper.setOnce(atomicReference0, subscription0)) {
            long v = atomicLong0.getAndSet(0L);
            if(v != 0L) {
                subscription0.request(v);
            }
            return true;
        }
        return false;
    }

    public static boolean replace(AtomicReference atomicReference0, Subscription subscription0) {
        while(true) {
            Subscription subscription1 = (Subscription)atomicReference0.get();
            if(subscription1 == SubscriptionHelper.CANCELLED) {
                if(subscription0 != null) {
                    subscription0.cancel();
                }
                return false;
            }
            do {
                if(atomicReference0.compareAndSet(subscription1, subscription0)) {
                    return true;
                }
            }
            while(atomicReference0.get() == subscription1);
        }
    }

    public static void reportMoreProduced(long v) {
        RxJavaPlugins.onError(new ProtocolViolationException(q.n(v, "More produced than requested: ")));
    }

    public static void reportSubscriptionSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Subscription already set!"));
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
    }

    public static boolean set(AtomicReference atomicReference0, Subscription subscription0) {
        while(true) {
            Subscription subscription1 = (Subscription)atomicReference0.get();
            if(subscription1 == SubscriptionHelper.CANCELLED) {
                if(subscription0 != null) {
                    subscription0.cancel();
                }
                return false;
            }
            do {
                if(atomicReference0.compareAndSet(subscription1, subscription0)) {
                    if(subscription1 != null) {
                        subscription1.cancel();
                    }
                    return true;
                }
            }
            while(atomicReference0.get() == subscription1);
        }
    }

    public static boolean setOnce(AtomicReference atomicReference0, Subscription subscription0) {
        ObjectHelper.requireNonNull(subscription0, "s is null");
        do {
            if(atomicReference0.compareAndSet(null, subscription0)) {
                return true;
            }
        }
        while(atomicReference0.get() == null);
        subscription0.cancel();
        if(atomicReference0.get() != SubscriptionHelper.CANCELLED) {
            SubscriptionHelper.reportSubscriptionSet();
        }
        return false;
    }

    public static boolean setOnce(AtomicReference atomicReference0, Subscription subscription0, long v) {
        if(SubscriptionHelper.setOnce(atomicReference0, subscription0)) {
            subscription0.request(v);
            return true;
        }
        return false;
    }

    public static boolean validate(long v) {
        if(v <= 0L) {
            RxJavaPlugins.onError(new IllegalArgumentException(q.n(v, "n > 0 required but it was ")));
            return false;
        }
        return true;
    }

    public static boolean validate(Subscription subscription0, Subscription subscription1) {
        if(subscription1 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        }
        if(subscription0 != null) {
            subscription1.cancel();
            SubscriptionHelper.reportSubscriptionSet();
            return false;
        }
        return true;
    }
}

