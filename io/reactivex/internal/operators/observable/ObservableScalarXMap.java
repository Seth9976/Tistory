package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class ObservableScalarXMap {
    public static final class ScalarDisposable extends AtomicInteger implements QueueDisposable, Runnable {
        public final Observer a;
        public final Object b;

        public ScalarDisposable(Observer observer0, Object object0) {
            this.a = observer0;
            this.b = object0;
        }

        @Override  // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.lazySet(3);
        }

        @Override  // io.reactivex.disposables.Disposable
        public void dispose() {
            this.set(3);
        }

        @Override  // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.get() == 3;
        }

        @Override  // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.get() != 1;
        }

        @Override  // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(Object object0) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override  // io.reactivex.internal.fuseable.SimpleQueue
        public boolean offer(Object object0, Object object1) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override  // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public Object poll() throws Exception {
            if(this.get() == 1) {
                this.lazySet(3);
                return this.b;
            }
            return null;
        }

        @Override  // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int v) {
            if((v & 1) != 0) {
                this.lazySet(1);
                return 1;
            }
            return 0;
        }

        @Override
        public void run() {
            if(this.get() == 0 && this.compareAndSet(0, 2)) {
                Observer observer0 = this.a;
                observer0.onNext(this.b);
                if(this.get() == 2) {
                    this.lazySet(3);
                    observer0.onComplete();
                }
            }
        }
    }

    public static Observable scalarXMap(Object object0, Function function0) {
        return RxJavaPlugins.onAssembly(new l3(object0, function0));
    }

    public static boolean tryScalarXMapSubscribe(ObservableSource observableSource0, Observer observer0, Function function0) {
        Object object1;
        ObservableSource observableSource1;
        Object object0;
        if(observableSource0 instanceof Callable) {
            try {
                object0 = ((Callable)observableSource0).call();
            }
            catch(Throwable throwable0) {
                Exceptions.throwIfFatal(throwable0);
                EmptyDisposable.error(throwable0, observer0);
                return true;
            }
            if(object0 == null) {
                EmptyDisposable.complete(observer0);
                return true;
            }
            try {
                observableSource1 = (ObservableSource)ObjectHelper.requireNonNull(function0.apply(object0), "The mapper returned a null ObservableSource");
            }
            catch(Throwable throwable1) {
                Exceptions.throwIfFatal(throwable1);
                EmptyDisposable.error(throwable1, observer0);
                return true;
            }
            if(observableSource1 instanceof Callable) {
                try {
                    object1 = ((Callable)observableSource1).call();
                }
                catch(Throwable throwable2) {
                    Exceptions.throwIfFatal(throwable2);
                    EmptyDisposable.error(throwable2, observer0);
                    return true;
                }
                if(object1 == null) {
                    EmptyDisposable.complete(observer0);
                    return true;
                }
                ScalarDisposable observableScalarXMap$ScalarDisposable0 = new ScalarDisposable(observer0, object1);
                observer0.onSubscribe(observableScalarXMap$ScalarDisposable0);
                observableScalarXMap$ScalarDisposable0.run();
                return true;
            }
            observableSource1.subscribe(observer0);
            return true;
        }
        return false;
    }
}

