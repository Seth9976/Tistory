package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowablePublish extends ConnectableFlowable implements HasUpstreamPublisher, FlowablePublishClassic {
    public final Flowable b;
    public final AtomicReference c;
    public final int d;
    public final m3 e;

    public FlowablePublish(m3 m30, Flowable flowable0, AtomicReference atomicReference0, int v) {
        this.e = m30;
        this.b = flowable0;
        this.c = atomicReference0;
        this.d = v;
    }

    @Override  // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer consumer0) {
        o3 o30;
        while(true) {
            AtomicReference atomicReference0 = this.c;
            o30 = (o3)atomicReference0.get();
            if(o30 != null && !o30.isDisposed()) {
                break;
            }
            o3 o31 = new o3(atomicReference0, this.d);
        label_4:
            if(atomicReference0.compareAndSet(o30, o31)) {
                o30 = o31;
                break;
            }
            if(atomicReference0.get() != o30) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_4;
        }
        boolean z = !o30.d.get() && o30.d.compareAndSet(false, true);
        try {
            consumer0.accept(o30);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
        if(z) {
            this.b.subscribe(o30);
        }
    }

    public static ConnectableFlowable create(Flowable flowable0, int v) {
        AtomicReference atomicReference0 = new AtomicReference();
        return RxJavaPlugins.onAssembly(new FlowablePublish(new m3(atomicReference0, v), flowable0, atomicReference0, v));
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowablePublishClassic
    public int publishBufferSize() {
        return this.d;
    }

    @Override  // io.reactivex.internal.operators.flowable.FlowablePublishClassic
    public Publisher publishSource() {
        return this.b;
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public Publisher source() {
        return this.b;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        this.e.subscribe(subscriber0);
    }
}

