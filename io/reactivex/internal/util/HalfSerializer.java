package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;

public final class HalfSerializer {
    public static void onComplete(Observer observer0, AtomicInteger atomicInteger0, AtomicThrowable atomicThrowable0) {
        if(atomicInteger0.getAndIncrement() == 0) {
            Throwable throwable0 = atomicThrowable0.terminate();
            if(throwable0 != null) {
                observer0.onError(throwable0);
                return;
            }
            observer0.onComplete();
        }
    }

    public static void onComplete(Subscriber subscriber0, AtomicInteger atomicInteger0, AtomicThrowable atomicThrowable0) {
        if(atomicInteger0.getAndIncrement() == 0) {
            Throwable throwable0 = atomicThrowable0.terminate();
            if(throwable0 != null) {
                subscriber0.onError(throwable0);
                return;
            }
            subscriber0.onComplete();
        }
    }

    public static void onError(Observer observer0, Throwable throwable0, AtomicInteger atomicInteger0, AtomicThrowable atomicThrowable0) {
        if(!atomicThrowable0.addThrowable(throwable0)) {
            RxJavaPlugins.onError(throwable0);
        }
        else if(atomicInteger0.getAndIncrement() == 0) {
            observer0.onError(atomicThrowable0.terminate());
        }
    }

    public static void onError(Subscriber subscriber0, Throwable throwable0, AtomicInteger atomicInteger0, AtomicThrowable atomicThrowable0) {
        if(!atomicThrowable0.addThrowable(throwable0)) {
            RxJavaPlugins.onError(throwable0);
        }
        else if(atomicInteger0.getAndIncrement() == 0) {
            subscriber0.onError(atomicThrowable0.terminate());
        }
    }

    public static void onNext(Observer observer0, Object object0, AtomicInteger atomicInteger0, AtomicThrowable atomicThrowable0) {
        if(atomicInteger0.get() == 0 && atomicInteger0.compareAndSet(0, 1)) {
            observer0.onNext(object0);
            if(atomicInteger0.decrementAndGet() != 0) {
                Throwable throwable0 = atomicThrowable0.terminate();
                if(throwable0 != null) {
                    observer0.onError(throwable0);
                    return;
                }
                observer0.onComplete();
            }
        }
    }

    public static void onNext(Subscriber subscriber0, Object object0, AtomicInteger atomicInteger0, AtomicThrowable atomicThrowable0) {
        if(atomicInteger0.get() == 0 && atomicInteger0.compareAndSet(0, 1)) {
            subscriber0.onNext(object0);
            if(atomicInteger0.decrementAndGet() != 0) {
                Throwable throwable0 = atomicThrowable0.terminate();
                if(throwable0 != null) {
                    subscriber0.onError(throwable0);
                    return;
                }
                subscriber0.onComplete();
            }
        }
    }
}

