package io.reactivex.internal.util;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public enum EmptyComponent implements CompletableObserver, FlowableSubscriber, MaybeObserver, Observer, SingleObserver, Disposable, Subscription {
    INSTANCE;

    public static Observer asObserver() {
        return EmptyComponent.INSTANCE;
    }

    public static Subscriber asSubscriber() {
        return EmptyComponent.INSTANCE;
    }

    @Override  // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return true;
    }

    @Override  // io.reactivex.Observer, io.reactivex.MaybeObserver, io.reactivex.CompletableObserver, org.reactivestreams.Subscriber
    public void onComplete() {
    }

    @Override  // io.reactivex.Observer, io.reactivex.MaybeObserver, io.reactivex.SingleObserver, io.reactivex.CompletableObserver, org.reactivestreams.Subscriber
    public void onError(Throwable throwable0) {
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer, org.reactivestreams.Subscriber
    public void onNext(Object object0) {
    }

    @Override  // io.reactivex.Observer, io.reactivex.MaybeObserver, io.reactivex.SingleObserver, io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable0) {
        disposable0.dispose();
    }

    @Override  // io.reactivex.FlowableSubscriber
    public void onSubscribe(Subscription subscription0) {
        subscription0.cancel();
    }

    @Override  // io.reactivex.MaybeObserver, io.reactivex.SingleObserver
    public void onSuccess(Object object0) {
    }

    @Override  // org.reactivestreams.Subscription
    public void request(long v) {
    }
}

