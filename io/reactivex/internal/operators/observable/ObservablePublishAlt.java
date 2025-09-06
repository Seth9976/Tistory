package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observables.ConnectableObservable;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservablePublishAlt extends ConnectableObservable implements ResettableConnectable, HasUpstreamObservableSource {
    public final ObservableSource a;
    public final AtomicReference b;

    public ObservablePublishAlt(ObservableSource observableSource0) {
        this.a = observableSource0;
        this.b = new AtomicReference();
    }

    @Override  // io.reactivex.observables.ConnectableObservable
    public void connect(Consumer consumer0) {
        h2 h20;
        while(true) {
            AtomicReference atomicReference0 = this.b;
            h20 = (h2)atomicReference0.get();
            if(h20 != null && !h20.isDisposed()) {
                break;
            }
            h2 h21 = new h2(atomicReference0);
        label_4:
            if(atomicReference0.compareAndSet(h20, h21)) {
                h20 = h21;
                break;
            }
            if(atomicReference0.get() != h20) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_4;
        }
        boolean z = !h20.a.get() && h20.a.compareAndSet(false, true);
        try {
            consumer0.accept(h20);
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
        if(z) {
            this.a.subscribe(h20);
        }
    }

    @Override  // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable0) {
        AtomicReference atomicReference0 = this.b;
        while(!atomicReference0.compareAndSet(((h2)disposable0), null) && atomicReference0.get() == ((h2)disposable0)) {
        }
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public ObservableSource source() {
        return this.a;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        h2 h20;
        while(true) {
            AtomicReference atomicReference0 = this.b;
            h20 = (h2)atomicReference0.get();
            if(h20 != null) {
                break;
            }
            h2 h21 = new h2(atomicReference0);
        label_4:
            if(atomicReference0.compareAndSet(null, h21)) {
                h20 = h21;
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
        g2 g20 = new g2(observer0, h20);
        observer0.onSubscribe(g20);
        do {
            g2[] arr_g2 = (g2[])h20.get();
            if(arr_g2 == h2.f) {
                Throwable throwable0 = h20.d;
                if(throwable0 != null) {
                    observer0.onError(throwable0);
                    return;
                }
                observer0.onComplete();
                return;
            }
            g2[] arr_g21 = new g2[arr_g2.length + 1];
            System.arraycopy(arr_g2, 0, arr_g21, 0, arr_g2.length);
            arr_g21[arr_g2.length] = g20;
        }
        while(!h20.compareAndSet(arr_g2, arr_g21));
        if(g20.isDisposed()) {
            h20.a(g20);
        }
    }
}

