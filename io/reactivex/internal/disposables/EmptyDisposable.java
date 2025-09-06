package io.reactivex.internal.disposables;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.QueueDisposable;

public enum EmptyDisposable implements QueueDisposable {
    INSTANCE,
    NEVER;

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
    }

    public static void complete(CompletableObserver completableObserver0) {
        completableObserver0.onSubscribe(EmptyDisposable.INSTANCE);
        completableObserver0.onComplete();
    }

    public static void complete(MaybeObserver maybeObserver0) {
        maybeObserver0.onSubscribe(EmptyDisposable.INSTANCE);
        maybeObserver0.onComplete();
    }

    public static void complete(Observer observer0) {
        observer0.onSubscribe(EmptyDisposable.INSTANCE);
        observer0.onComplete();
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    public static void error(Throwable throwable0, CompletableObserver completableObserver0) {
        completableObserver0.onSubscribe(EmptyDisposable.INSTANCE);
        completableObserver0.onError(throwable0);
    }

    public static void error(Throwable throwable0, MaybeObserver maybeObserver0) {
        maybeObserver0.onSubscribe(EmptyDisposable.INSTANCE);
        maybeObserver0.onError(throwable0);
    }

    public static void error(Throwable throwable0, Observer observer0) {
        observer0.onSubscribe(EmptyDisposable.INSTANCE);
        observer0.onError(throwable0);
    }

    public static void error(Throwable throwable0, SingleObserver singleObserver0) {
        singleObserver0.onSubscribe(EmptyDisposable.INSTANCE);
        singleObserver0.onError(throwable0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this == EmptyDisposable.INSTANCE;
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return true;
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
        return null;
    }

    @Override  // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int v) {
        return v & 2;
    }
}

