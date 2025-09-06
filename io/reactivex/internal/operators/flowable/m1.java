package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class m1 extends BasicFuseableConditionalSubscriber {
    public final Consumer a;
    public final Consumer b;
    public final Action c;
    public final Action d;

    public m1(ConditionalSubscriber conditionalSubscriber0, Consumer consumer0, Consumer consumer1, Action action0, Action action1) {
        super(conditionalSubscriber0);
        this.a = consumer0;
        this.b = consumer1;
        this.c = action0;
        this.d = action1;
    }

    @Override  // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber
    public final void onComplete() {
        if(this.done) {
            return;
        }
        try {
            this.c.run();
        }
        catch(Throwable throwable0) {
            this.fail(throwable0);
            return;
        }
        this.done = true;
        this.downstream.onComplete();
        try {
            this.d.run();
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            RxJavaPlugins.onError(throwable1);
        }
    }

    @Override  // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber
    public final void onError(Throwable throwable0) {
        if(this.done) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        try {
            this.done = true;
            this.b.accept(throwable0);
        }
        catch(Throwable throwable1) {
            Exceptions.throwIfFatal(throwable1);
            CompositeException compositeException0 = new CompositeException(new Throwable[]{throwable0, throwable1});
            this.downstream.onError(compositeException0);
            goto label_12;
        }
        this.downstream.onError(throwable0);
        try {
        label_12:
            this.d.run();
        }
        catch(Throwable throwable2) {
            Exceptions.throwIfFatal(throwable2);
            RxJavaPlugins.onError(throwable2);
        }
    }

    @Override  // org.reactivestreams.Subscriber
    public final void onNext(Object object0) {
        if(this.done) {
            return;
        }
        if(this.sourceMode != 0) {
            this.downstream.onNext(null);
            return;
        }
        try {
            this.a.accept(object0);
        }
        catch(Throwable throwable0) {
            this.fail(throwable0);
            return;
        }
        this.downstream.onNext(object0);
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        Action action0;
        Object object0;
        Consumer consumer0;
        try {
            consumer0 = this.b;
            object0 = this.qs.poll();
            action0 = this.d;
        }
        catch(Throwable throwable0) {
            Exceptions.throwIfFatal(throwable0);
            try {
                consumer0.accept(throwable0);
            }
            catch(Throwable throwable1) {
                throw new CompositeException(new Throwable[]{throwable0, throwable1});
            }
            throw ExceptionHelper.throwIfThrowable(throwable0);
        }
        if(object0 != null) {
            try {
                this.a.accept(object0);
            }
            catch(Throwable throwable2) {
                try {
                    Exceptions.throwIfFatal(throwable2);
                }
                catch(Throwable throwable3) {
                    action0.run();
                    throw throwable3;
                }
                try {
                    consumer0.accept(throwable2);
                    throw ExceptionHelper.throwIfThrowable(throwable2);
                }
                catch(Throwable throwable4) {
                    try {
                        throw new CompositeException(new Throwable[]{throwable2, throwable4});
                    }
                    catch(Throwable throwable3) {
                    }
                }
                action0.run();
                throw throwable3;
            }
            action0.run();
            return object0;
        }
        if(this.sourceMode == 1) {
            this.c.run();
            action0.run();
        }
        return null;
    }

    @Override  // io.reactivex.internal.fuseable.ConditionalSubscriber
    public final boolean tryOnNext(Object object0) {
        if(this.done) {
            return false;
        }
        try {
            this.a.accept(object0);
            return this.downstream.tryOnNext(object0);
        }
        catch(Throwable throwable0) {
            this.fail(throwable0);
            return false;
        }
    }
}

