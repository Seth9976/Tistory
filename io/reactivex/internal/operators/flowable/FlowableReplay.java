package io.reactivex.internal.operators.flowable;

import cd.n;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public final class FlowableReplay extends ConnectableFlowable implements ResettableConnectable, HasUpstreamPublisher {
    interface ReplayBuffer {
        void complete();

        void error(Throwable arg1);

        void next(Object arg1);

        void replay(f4 arg1);
    }

    public final Flowable b;
    public final AtomicReference c;
    public final Callable d;
    public final j4 e;
    public static final n f;

    static {
        FlowableReplay.f = new n(1);
    }

    public FlowableReplay(j4 j40, Flowable flowable0, AtomicReference atomicReference0, Callable callable0) {
        this.e = j40;
        this.b = flowable0;
        this.c = atomicReference0;
        this.d = callable0;
    }

    @Override  // io.reactivex.flowables.ConnectableFlowable
    public void connect(Consumer consumer0) {
        ReplayBuffer flowableReplay$ReplayBuffer0;
        k4 k40;
        while(true) {
            AtomicReference atomicReference0 = this.c;
            k40 = (k4)atomicReference0.get();
            if(k40 != null && !k40.isDisposed()) {
                break;
            }
            try {
                flowableReplay$ReplayBuffer0 = (ReplayBuffer)this.d.call();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                throw ExceptionHelper.wrapOrThrow(throwable0);
            }
            k4 k41 = new k4(flowableReplay$ReplayBuffer0);
        label_9:
            if(atomicReference0.compareAndSet(k40, k41)) {
                k40 = k41;
                break;
            }
            if(atomicReference0.get() != k40) {
                continue;
            }
            if(false) {
                break;
            }
            goto label_9;
        }
        AtomicBoolean atomicBoolean0 = k40.d;
        boolean z = !atomicBoolean0.get() && atomicBoolean0.compareAndSet(false, true);
        try {
            consumer0.accept(k40);
        }
        catch(Throwable throwable1) {
            if(z) {
                atomicBoolean0.compareAndSet(true, false);
            }
            Exceptions.throwIfFatal(throwable1);
            throw ExceptionHelper.wrapOrThrow(throwable1);
        }
        if(z) {
            this.b.subscribe(k40);
        }
    }

    public static ConnectableFlowable create(Flowable flowable0, int v) {
        return v == 0x7FFFFFFF ? FlowableReplay.createFrom(flowable0) : FlowableReplay.e(flowable0, new i4(v));
    }

    public static ConnectableFlowable create(Flowable flowable0, long v, TimeUnit timeUnit0, Scheduler scheduler0) {
        return FlowableReplay.create(flowable0, v, timeUnit0, scheduler0, 0x7FFFFFFF);
    }

    public static ConnectableFlowable create(Flowable flowable0, long v, TimeUnit timeUnit0, Scheduler scheduler0, int v1) {
        return FlowableReplay.e(flowable0, new l4(v1, v, timeUnit0, scheduler0));
    }

    public static ConnectableFlowable createFrom(Flowable flowable0) {
        return FlowableReplay.e(flowable0, FlowableReplay.f);
    }

    public static ConnectableFlowable e(Flowable flowable0, Callable callable0) {
        AtomicReference atomicReference0 = new AtomicReference();
        return RxJavaPlugins.onAssembly(new FlowableReplay(new j4(atomicReference0, callable0), flowable0, atomicReference0, callable0));
    }

    public static Flowable multicastSelector(Callable callable0, Function function0) {
        return new g4(callable0, function0, 0);
    }

    public static ConnectableFlowable observeOn(ConnectableFlowable connectableFlowable0, Scheduler scheduler0) {
        return RxJavaPlugins.onAssembly(new e4(connectableFlowable0, connectableFlowable0.observeOn(scheduler0)));
    }

    @Override  // io.reactivex.internal.disposables.ResettableConnectable
    public void resetIf(Disposable disposable0) {
        while(!this.c.compareAndSet(((k4)disposable0), null) && this.c.get() == ((k4)disposable0)) {
        }
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

