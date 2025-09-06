package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class j4 implements Publisher {
    public final AtomicReference a;
    public final Callable b;

    public j4(AtomicReference atomicReference0, Callable callable0) {
        this.a = atomicReference0;
        this.b = callable0;
    }

    @Override  // org.reactivestreams.Publisher
    public final void subscribe(Subscriber subscriber0) {
        ReplayBuffer flowableReplay$ReplayBuffer0;
        k4 k40;
        while(true) {
            AtomicReference atomicReference0 = this.a;
            k40 = (k4)atomicReference0.get();
            if(k40 != null) {
                break;
            }
            try {
                flowableReplay$ReplayBuffer0 = (ReplayBuffer)this.b.call();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                EmptySubscription.error(throwable0, subscriber0);
                return;
            }
            k4 k41 = new k4(flowableReplay$ReplayBuffer0);
        label_10:
            if(atomicReference0.compareAndSet(null, k41)) {
                k40 = k41;
                break;
            }
            if(atomicReference0.get() != null) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_10;
        }
        f4 f40 = new f4(k40, subscriber0);
        subscriber0.onSubscribe(f40);
        while(true) {
            AtomicReference atomicReference1 = k40.c;
            f4[] arr_f4 = (f4[])atomicReference1.get();
            if(arr_f4 == k4.i) {
                break;
            }
            f4[] arr_f41 = new f4[arr_f4.length + 1];
            System.arraycopy(arr_f4, 0, arr_f41, 0, arr_f4.length);
            arr_f41[arr_f4.length] = f40;
        label_23:
            if(atomicReference1.compareAndSet(arr_f4, arr_f41)) {
                break;
            }
            if(atomicReference1.get() != arr_f4) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_23;
        }
        if(f40.isDisposed()) {
            k40.b(f40);
            return;
        }
        k40.a();
        k40.a.replay(f40);
    }
}

