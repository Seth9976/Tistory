package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Notification;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

@Experimental
public final class MaterializeSingleObserver implements CompletableObserver, MaybeObserver, SingleObserver, Disposable {
    public final SingleObserver a;
    public Disposable b;

    public MaterializeSingleObserver(SingleObserver singleObserver0) {
        this.a = singleObserver0;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        this.b.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.b.isDisposed();
    }

    @Override  // io.reactivex.MaybeObserver, io.reactivex.CompletableObserver
    public void onComplete() {
        this.a.onSuccess(Notification.createOnComplete());
    }

    @Override  // io.reactivex.SingleObserver, io.reactivex.MaybeObserver, io.reactivex.CompletableObserver
    public void onError(Throwable throwable0) {
        Notification notification0 = Notification.createOnError(throwable0);
        this.a.onSuccess(notification0);
    }

    @Override  // io.reactivex.SingleObserver, io.reactivex.MaybeObserver, io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.validate(this.b, disposable0)) {
            this.b = disposable0;
            this.a.onSubscribe(this);
        }
    }

    @Override  // io.reactivex.SingleObserver, io.reactivex.MaybeObserver
    public void onSuccess(Object object0) {
        Notification notification0 = Notification.createOnNext(object0);
        this.a.onSuccess(notification0);
    }
}

