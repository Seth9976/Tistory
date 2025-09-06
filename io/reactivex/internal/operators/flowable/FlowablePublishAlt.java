package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowablePublishAlt extends ConnectableFlowable implements ResettableConnectable, HasUpstreamPublisher {
    public final Publisher b;
    public final int c;
    public final AtomicReference d;

    public FlowablePublishAlt(Publisher publisher0, int v) {
        this.b = publisher0;
        this.c = v;
        this.d = new AtomicReference();
    }

    @Override  // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer consumer0) {
        q3 q30;
        while(true) {
            AtomicReference atomicReference0 = this.d;
            q30 = (q3)atomicReference0.get();
            if(q30 != null && !q30.isDisposed()) {
                break;
            }
            q3 q31 = new q3(atomicReference0, this.c);
        label_4:
            if(atomicReference0.compareAndSet(q30, q31)) {
                q30 = q31;
                break;
            }
            if(atomicReference0.get() != q30) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_4;
        }
        boolean z = !q30.c.get() && q30.c.compareAndSet(false, true);
        try {
            consumer0.accept(q30);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
        if(z) {
            this.b.subscribe(q30);
        }
    }

    public int publishBufferSize() {
        return this.c;
    }

    @Override  // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable0) {
        AtomicReference atomicReference0 = this.d;
        while(!atomicReference0.compareAndSet(((q3)disposable0), null) && atomicReference0.get() == ((q3)disposable0)) {
        }
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public Publisher source() {
        return this.b;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        q3 q30;
        while(true) {
            AtomicReference atomicReference0 = this.d;
            q30 = (q3)atomicReference0.get();
            if(q30 != null) {
                break;
            }
            q3 q31 = new q3(atomicReference0, this.c);
        label_4:
            if(atomicReference0.compareAndSet(null, q31)) {
                q30 = q31;
                break;
            }
            if(atomicReference0.get() != null) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_4;
        }
        p3 p30 = new p3(subscriber0, q30);
        subscriber0.onSubscribe(p30);
        while(true) {
            AtomicReference atomicReference1 = q30.d;
            p3[] arr_p3 = (p3[])atomicReference1.get();
            if(arr_p3 == q3.l) {
                Throwable throwable0 = q30.i;
                if(throwable0 != null) {
                    subscriber0.onError(throwable0);
                    return;
                }
                subscriber0.onComplete();
                return;
            }
            p3[] arr_p31 = new p3[arr_p3.length + 1];
            System.arraycopy(arr_p3, 0, arr_p31, 0, arr_p3.length);
            arr_p31[arr_p3.length] = p30;
            do {
                if(atomicReference1.compareAndSet(arr_p3, arr_p31)) {
                    if(p30.a()) {
                        q30.c(p30);
                        return;
                    }
                    q30.b();
                    return;
                }
            }
            while(atomicReference1.get() == arr_p3);
        }
    }
}

