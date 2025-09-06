package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservablePublish extends ConnectableObservable implements HasUpstreamObservableSource, ObservablePublishClassic {
    public final ObservableSource a;
    public final AtomicReference b;
    public final f2 c;

    public ObservablePublish(f2 f20, ObservableSource observableSource0, AtomicReference atomicReference0) {
        this.c = f20;
        this.a = observableSource0;
        this.b = atomicReference0;
    }

    @Override  // io.reactivex.observables.ConnectableObservable
    public void connect(Consumer consumer0) {
        e2 e20;
        while(true) {
            AtomicReference atomicReference0 = this.b;
            e20 = (e2)atomicReference0.get();
            if(e20 != null && !e20.isDisposed()) {
                break;
            }
            e2 e21 = new e2(atomicReference0);
        label_4:
            if(atomicReference0.compareAndSet(e20, e21)) {
                e20 = e21;
                break;
            }
            if(atomicReference0.get() != e20) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_4;
        }
        boolean z = !e20.c.get() && e20.c.compareAndSet(false, true);
        try {
            consumer0.accept(e20);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
        if(z) {
            this.a.subscribe(e20);
        }
    }

    public static ConnectableObservable create(ObservableSource observableSource0) {
        AtomicReference atomicReference0 = new AtomicReference();
        return RxJavaPlugins.onAssembly(new ObservablePublish(new f2(atomicReference0), observableSource0, atomicReference0));
    }

    @Override  // io.reactivex.internal.operators.observable.ObservablePublishClassic
    public ObservableSource publishSource() {
        return this.a;
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public ObservableSource source() {
        return this.a;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        this.c.subscribe(observer0);
    }
}

