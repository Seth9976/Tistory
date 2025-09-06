package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

public final class EndConsumerHelper {
    public static String composeMessage(String s) {
        return "It is not allowed to subscribe with a(n) " + s + " multiple times. Please create a fresh instance of " + s + " and subscribe that to the target source instead.";
    }

    public static void reportDoubleSubscription(Class class0) {
        RxJavaPlugins.onError(new ProtocolViolationException(EndConsumerHelper.composeMessage(class0.getName())));
    }

    public static boolean setOnce(AtomicReference atomicReference0, Disposable disposable0, Class class0) {
        ObjectHelper.requireNonNull(disposable0, "next is null");
        do {
            if(atomicReference0.compareAndSet(null, disposable0)) {
                return true;
            }
        }
        while(atomicReference0.get() == null);
        disposable0.dispose();
        if(atomicReference0.get() != DisposableHelper.DISPOSED) {
            EndConsumerHelper.reportDoubleSubscription(class0);
        }
        return false;
    }

    public static boolean setOnce(AtomicReference atomicReference0, Subscription subscription0, Class class0) {
        ObjectHelper.requireNonNull(subscription0, "next is null");
        do {
            if(atomicReference0.compareAndSet(null, subscription0)) {
                return true;
            }
        }
        while(atomicReference0.get() == null);
        subscription0.cancel();
        if(atomicReference0.get() != SubscriptionHelper.CANCELLED) {
            EndConsumerHelper.reportDoubleSubscription(class0);
        }
        return false;
    }

    public static boolean validate(Disposable disposable0, Disposable disposable1, Class class0) {
        ObjectHelper.requireNonNull(disposable1, "next is null");
        if(disposable0 != null) {
            disposable1.dispose();
            if(disposable0 != DisposableHelper.DISPOSED) {
                EndConsumerHelper.reportDoubleSubscription(class0);
            }
            return false;
        }
        return true;
    }

    public static boolean validate(Subscription subscription0, Subscription subscription1, Class class0) {
        ObjectHelper.requireNonNull(subscription1, "next is null");
        if(subscription0 != null) {
            subscription1.cancel();
            if(subscription0 != SubscriptionHelper.CANCELLED) {
                EndConsumerHelper.reportDoubleSubscription(class0);
            }
            return false;
        }
        return true;
    }
}

