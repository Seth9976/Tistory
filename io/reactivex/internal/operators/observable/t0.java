package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.Notification;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

public final class t0 implements Observer, Disposable {
    public final int a;
    public Object b;
    public Disposable c;

    public t0() {
        this.a = 0;
        super();
    }

    public t0(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    private final void a(Object object0) {
    }

    private final void b(Object object0) {
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch(this.a) {
            case 0: {
                Disposable disposable0 = this.c;
                this.c = EmptyComponent.INSTANCE;
                this.b = EmptyComponent.asObserver();
                disposable0.dispose();
                return;
            }
            case 1: {
                this.c.dispose();
                return;
            }
            case 2: {
                this.c.dispose();
                return;
            }
            case 3: {
                this.c.dispose();
                return;
            }
            default: {
                this.c.dispose();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch(this.a) {
            case 0: {
                return this.c.isDisposed();
            }
            case 1: {
                return this.c.isDisposed();
            }
            case 2: {
                return this.c.isDisposed();
            }
            case 3: {
                return this.c.isDisposed();
            }
            default: {
                return this.c.isDisposed();
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        switch(this.a) {
            case 0: {
                Observer observer0 = (Observer)this.b;
                this.c = EmptyComponent.INSTANCE;
                this.b = EmptyComponent.asObserver();
                observer0.onComplete();
                return;
            }
            case 1: {
                ((Observer)this.b).onComplete();
                return;
            }
            case 2: {
                ((Observer)this.b).onComplete();
                return;
            }
            case 3: {
                Observer observer1 = (Observer)this.b;
                observer1.onNext(Notification.createOnComplete());
                observer1.onComplete();
                return;
            }
            default: {
                ((CompletableObserver)this.b).onComplete();
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        switch(this.a) {
            case 0: {
                Observer observer0 = (Observer)this.b;
                this.c = EmptyComponent.INSTANCE;
                this.b = EmptyComponent.asObserver();
                observer0.onError(throwable0);
                return;
            }
            case 1: {
                ((Observer)this.b).onError(throwable0);
                return;
            }
            case 2: {
                ((Observer)this.b).onError(throwable0);
                return;
            }
            case 3: {
                Notification notification0 = Notification.createOnError(throwable0);
                Observer observer1 = (Observer)this.b;
                observer1.onNext(notification0);
                observer1.onComplete();
                return;
            }
            default: {
                ((CompletableObserver)this.b).onError(throwable0);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        switch(this.a) {
            case 0: {
                ((Observer)this.b).onNext(object0);
                return;
            }
            case 1: {
                ((Observer)this.b).onNext(object0);
                return;
            }
            case 2: {
                break;
            }
            case 3: {
                ((Observer)this.b).onNext(Notification.createOnNext(object0));
                break;
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        switch(this.a) {
            case 0: {
                if(DisposableHelper.validate(this.c, disposable0)) {
                    this.c = disposable0;
                    ((Observer)this.b).onSubscribe(this);
                }
                return;
            }
            case 1: {
                if(DisposableHelper.validate(this.c, disposable0)) {
                    this.c = disposable0;
                    ((Observer)this.b).onSubscribe(this);
                }
                return;
            }
            case 2: {
                this.c = disposable0;
                ((Observer)this.b).onSubscribe(this);
                return;
            }
            case 3: {
                if(DisposableHelper.validate(this.c, disposable0)) {
                    this.c = disposable0;
                    ((Observer)this.b).onSubscribe(this);
                }
                return;
            }
            default: {
                this.c = disposable0;
                ((CompletableObserver)this.b).onSubscribe(this);
            }
        }
    }
}

