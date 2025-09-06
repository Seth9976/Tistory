package io.reactivex.internal.util;

import id.b;
import id.c;
import id.d;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public enum NotificationLite {
    COMPLETE;

    public static boolean accept(Object object0, Observer observer0) {
        if(object0 == NotificationLite.COMPLETE) {
            observer0.onComplete();
            return true;
        }
        if(object0 instanceof c) {
            observer0.onError(((c)object0).a);
            return true;
        }
        observer0.onNext(object0);
        return false;
    }

    public static boolean accept(Object object0, Subscriber subscriber0) {
        if(object0 == NotificationLite.COMPLETE) {
            subscriber0.onComplete();
            return true;
        }
        if(object0 instanceof c) {
            subscriber0.onError(((c)object0).a);
            return true;
        }
        subscriber0.onNext(object0);
        return false;
    }

    public static boolean acceptFull(Object object0, Observer observer0) {
        if(object0 == NotificationLite.COMPLETE) {
            observer0.onComplete();
            return true;
        }
        if(object0 instanceof c) {
            observer0.onError(((c)object0).a);
            return true;
        }
        if(object0 instanceof b) {
            observer0.onSubscribe(((b)object0).a);
            return false;
        }
        observer0.onNext(object0);
        return false;
    }

    public static boolean acceptFull(Object object0, Subscriber subscriber0) {
        if(object0 == NotificationLite.COMPLETE) {
            subscriber0.onComplete();
            return true;
        }
        if(object0 instanceof c) {
            subscriber0.onError(((c)object0).a);
            return true;
        }
        if(object0 instanceof d) {
            subscriber0.onSubscribe(((d)object0).a);
            return false;
        }
        subscriber0.onNext(object0);
        return false;
    }

    public static Object complete() {
        return NotificationLite.COMPLETE;
    }

    public static Object disposable(Disposable disposable0) {
        return new b(disposable0);
    }

    public static Object error(Throwable throwable0) {
        return new c(throwable0);
    }

    public static Disposable getDisposable(Object object0) {
        return ((b)object0).a;
    }

    public static Throwable getError(Object object0) {
        return ((c)object0).a;
    }

    public static Subscription getSubscription(Object object0) {
        return ((d)object0).a;
    }

    public static Object getValue(Object object0) [...] // Inlined contents

    public static boolean isComplete(Object object0) {
        return object0 == NotificationLite.COMPLETE;
    }

    public static boolean isDisposable(Object object0) {
        return object0 instanceof b;
    }

    public static boolean isError(Object object0) {
        return object0 instanceof c;
    }

    public static boolean isSubscription(Object object0) {
        return object0 instanceof d;
    }

    public static Object next(Object object0) [...] // Inlined contents

    public static Object subscription(Subscription subscription0) {
        return new d(subscription0);
    }

    @Override
    public String toString() {
        return "NotificationLite.Complete";
    }
}

