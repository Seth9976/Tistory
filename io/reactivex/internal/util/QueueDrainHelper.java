package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class QueueDrainHelper {
    public static boolean a(long v, Subscriber subscriber0, Queue queue0, AtomicLong atomicLong0, BooleanSupplier booleanSupplier0) {
        boolean z1;
        boolean z;
        long v1 = v & 0x8000000000000000L;
        while(true) {
            if(Long.compare(v1, v) == 0) {
                try {
                    z1 = booleanSupplier0.getAsBoolean();
                }
                catch(Throwable throwable1) {
                    Exceptions.throwIfFatal(throwable1);
                    z1 = true;
                }
                if(z1) {
                    return true;
                }
                if(queue0.isEmpty()) {
                    subscriber0.onComplete();
                    return true;
                }
                long v2 = atomicLong0.get();
                if(v2 == v1) {
                    long v3 = atomicLong0.addAndGet(-(v1 & 0x7FFFFFFFFFFFFFFFL));
                    if((0x7FFFFFFFFFFFFFFFL & v3) == 0L) {
                        return false;
                    }
                    v = v3;
                    v1 = v3 & 0x8000000000000000L;
                }
                else {
                    v = v2;
                }
            }
            else {
                try {
                    z = booleanSupplier0.getAsBoolean();
                }
                catch(Throwable throwable0) {
                    Exceptions.throwIfFatal(throwable0);
                    z = true;
                }
                if(z) {
                    return true;
                }
                Object object0 = queue0.poll();
                if(object0 == null) {
                    subscriber0.onComplete();
                    return true;
                }
                subscriber0.onNext(object0);
                ++v1;
            }
        }
    }

    public static boolean checkTerminated(boolean z, boolean z1, Observer observer0, boolean z2, SimpleQueue simpleQueue0, Disposable disposable0, ObservableQueueDrain observableQueueDrain0) {
        if(observableQueueDrain0.cancelled()) {
            simpleQueue0.clear();
            disposable0.dispose();
            return true;
        }
        if(z) {
            if(!z2) {
                Throwable throwable1 = observableQueueDrain0.error();
                if(throwable1 != null) {
                    simpleQueue0.clear();
                    if(disposable0 != null) {
                        disposable0.dispose();
                    }
                    observer0.onError(throwable1);
                    return true;
                }
                if(z1) {
                    if(disposable0 != null) {
                        disposable0.dispose();
                    }
                    observer0.onComplete();
                    return true;
                }
            }
            else if(z1) {
                if(disposable0 != null) {
                    disposable0.dispose();
                }
                Throwable throwable0 = observableQueueDrain0.error();
                if(throwable0 != null) {
                    observer0.onError(throwable0);
                    return true;
                }
                observer0.onComplete();
                return true;
            }
        }
        return false;
    }

    public static boolean checkTerminated(boolean z, boolean z1, Subscriber subscriber0, boolean z2, SimpleQueue simpleQueue0, QueueDrain queueDrain0) {
        if(queueDrain0.cancelled()) {
            simpleQueue0.clear();
            return true;
        }
        if(z) {
            if(!z2) {
                Throwable throwable1 = queueDrain0.error();
                if(throwable1 != null) {
                    simpleQueue0.clear();
                    subscriber0.onError(throwable1);
                    return true;
                }
                if(z1) {
                    subscriber0.onComplete();
                    return true;
                }
            }
            else if(z1) {
                Throwable throwable0 = queueDrain0.error();
                if(throwable0 != null) {
                    subscriber0.onError(throwable0);
                    return true;
                }
                subscriber0.onComplete();
                return true;
            }
        }
        return false;
    }

    public static SimpleQueue createQueue(int v) {
        return v < 0 ? new SpscLinkedArrayQueue(-v) : new SpscArrayQueue(v);
    }

    public static void drainLoop(SimplePlainQueue simplePlainQueue0, Observer observer0, boolean z, Disposable disposable0, ObservableQueueDrain observableQueueDrain0) {
        int v = 1;
        do {
            if(QueueDrainHelper.checkTerminated(observableQueueDrain0.done(), simplePlainQueue0.isEmpty(), observer0, z, simplePlainQueue0, disposable0, observableQueueDrain0)) {
                return;
            }
            while(true) {
                boolean z1 = observableQueueDrain0.done();
                Object object0 = simplePlainQueue0.poll();
                if(QueueDrainHelper.checkTerminated(z1, object0 == null, observer0, z, simplePlainQueue0, disposable0, observableQueueDrain0)) {
                    return;
                }
                if(object0 == null) {
                    break;
                }
                observableQueueDrain0.accept(observer0, object0);
            }
            v = observableQueueDrain0.leave(-v);
        }
        while(v != 0);
    }

    public static void drainMaxLoop(SimplePlainQueue simplePlainQueue0, Subscriber subscriber0, boolean z, Disposable disposable0, QueueDrain queueDrain0) {
        int v = 1;
        while(true) {
            boolean z1 = queueDrain0.done();
            Object object0 = simplePlainQueue0.poll();
            if(QueueDrainHelper.checkTerminated(z1, object0 == null, subscriber0, z, simplePlainQueue0, queueDrain0)) {
                if(disposable0 != null) {
                    disposable0.dispose();
                }
                return;
            }
            if(object0 == null) {
                v = queueDrain0.leave(-v);
                if(v != 0) {
                    continue;
                }
                return;
            }
            long v1 = queueDrain0.requested();
            if(v1 == 0L) {
                break;
            }
            if(queueDrain0.accept(subscriber0, object0) && v1 != 0x7FFFFFFFFFFFFFFFL) {
                queueDrain0.produced(1L);
            }
        }
        simplePlainQueue0.clear();
        if(disposable0 != null) {
            disposable0.dispose();
        }
        subscriber0.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
    }

    public static void postComplete(Subscriber subscriber0, Queue queue0, AtomicLong atomicLong0, BooleanSupplier booleanSupplier0) {
        long v;
        if(queue0.isEmpty()) {
            subscriber0.onComplete();
            return;
        }
        if(QueueDrainHelper.a(atomicLong0.get(), subscriber0, queue0, atomicLong0, booleanSupplier0)) {
            return;
        }
        do {
            v = atomicLong0.get();
            if((v & 0x8000000000000000L) != 0L) {
                return;
            }
        }
        while(!atomicLong0.compareAndSet(v, v | 0x8000000000000000L));
        if(v != 0L) {
            QueueDrainHelper.a(v | 0x8000000000000000L, subscriber0, queue0, atomicLong0, booleanSupplier0);
        }
    }

    public static boolean postCompleteRequest(long v, Subscriber subscriber0, Queue queue0, AtomicLong atomicLong0, BooleanSupplier booleanSupplier0) {
        do {
            long v1 = atomicLong0.get();
        }
        while(!atomicLong0.compareAndSet(v1, BackpressureHelper.addCap(0x7FFFFFFFFFFFFFFFL & v1, v) | v1 & 0x8000000000000000L));
        if(v1 == 0x8000000000000000L) {
            QueueDrainHelper.a(v | 0x8000000000000000L, subscriber0, queue0, atomicLong0, booleanSupplier0);
            return true;
        }
        return false;
    }

    public static void request(Subscription subscription0, int v) {
        subscription0.request((v >= 0 ? ((long)v) : 0x7FFFFFFFFFFFFFFFL));
    }
}

