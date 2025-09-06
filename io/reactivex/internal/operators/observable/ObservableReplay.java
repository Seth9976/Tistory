package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableReplay extends ConnectableObservable implements ResettableConnectable, HasUpstreamObservableSource {
    interface BufferSupplier {
        ReplayBuffer call();
    }

    interface ReplayBuffer {
        void complete();

        void error(Throwable arg1);

        void next(Object arg1);

        void replay(r2 arg1);
    }

    public final ObservableSource a;
    public final AtomicReference b;
    public final BufferSupplier c;
    public final x2 d;
    public static final b3 e;

    static {
        ObservableReplay.e = new b3();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public ObservableReplay(x2 x20, ObservableSource observableSource0, AtomicReference atomicReference0, BufferSupplier observableReplay$BufferSupplier0) {
        this.d = x20;
        this.a = observableSource0;
        this.b = atomicReference0;
        this.c = observableReplay$BufferSupplier0;
    }

    @Override  // io.reactivex.observables.ConnectableObservable
    public void connect(Consumer consumer0) {
        w2 w20;
        while(true) {
            AtomicReference atomicReference0 = this.b;
            w20 = (w2)atomicReference0.get();
            if(w20 != null && !w20.isDisposed()) {
                break;
            }
            w2 w21 = new w2(this.c.call());
        label_4:
            if(atomicReference0.compareAndSet(w20, w21)) {
                w20 = w21;
                break;
            }
            if(atomicReference0.get() != w20) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_4;
        }
        AtomicBoolean atomicBoolean0 = w20.d;
        boolean z = !atomicBoolean0.get() && atomicBoolean0.compareAndSet(false, true);
        try {
            consumer0.accept(w20);
        }
        catch(Throwable throwable0) {
            if(z) {
                atomicBoolean0.compareAndSet(true, false);
            }
            Exceptions.throwIfFatal(throwable0);
            throw ExceptionHelper.wrapOrThrow(throwable0);
        }
        if(z) {
            this.a.subscribe(w20);
        }
    }

    public static ConnectableObservable create(ObservableSource observableSource0, int v) {
        return v == 0x7FFFFFFF ? ObservableReplay.createFrom(observableSource0) : ObservableReplay.d(observableSource0, new v2(v));
    }

    public static ConnectableObservable create(ObservableSource observableSource0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return ObservableReplay.create(observableSource0, v, timeUnit0, scheduler0, 0x7FFFFFFF);
    }

    public static ConnectableObservable create(ObservableSource observableSource0, long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1) {
        return ObservableReplay.d(observableSource0, new y2(v1, v, timeUnit0, scheduler0));
    }

    public static ConnectableObservable createFrom(ObservableSource observableSource0) {
        return ObservableReplay.d(observableSource0, ObservableReplay.e);
    }

    public static ConnectableObservable d(ObservableSource observableSource0, BufferSupplier observableReplay$BufferSupplier0) {
        AtomicReference atomicReference0 = new AtomicReference();
        return RxJavaPlugins.onAssembly(new ObservableReplay(new x2(atomicReference0, observableReplay$BufferSupplier0), observableSource0, atomicReference0, observableReplay$BufferSupplier0));
    }

    public static Observable multicastSelector(Callable callable0, Function function0) {
        return RxJavaPlugins.onAssembly(new s2(callable0, function0));
    }

    public static ConnectableObservable observeOn(ConnectableObservable connectableObservable0, Scheduler scheduler0) {
        return RxJavaPlugins.onAssembly(new u2(connectableObservable0, connectableObservable0.observeOn(scheduler0)));
    }

    @Override  // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable0) {
        while(!this.b.compareAndSet(((w2)disposable0), null) && this.b.get() == ((w2)disposable0)) {
        }
    }

    @Override  // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public ObservableSource source() {
        return this.a;
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        this.d.subscribe(observer0);
    }
}

