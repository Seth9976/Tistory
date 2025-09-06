package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

public final class SerializedObserver implements Observer, Disposable {
    public final Observer a;
    public final boolean b;
    public Disposable c;
    public boolean d;
    public AppendOnlyLinkedArrayList e;
    public volatile boolean f;

    public SerializedObserver(@NonNull Observer observer0) {
        this(observer0, false);
    }

    public SerializedObserver(@NonNull Observer observer0, boolean z) {
        this.a = observer0;
        this.b = z;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        this.c.dispose();
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.c.isDisposed();
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        if(this.f) {
            return;
        }
        synchronized(this) {
            if(this.f) {
                return;
            }
            if(this.d) {
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.e;
                if(appendOnlyLinkedArrayList0 == null) {
                    appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                    this.e = appendOnlyLinkedArrayList0;
                }
                appendOnlyLinkedArrayList0.add(NotificationLite.complete());
                return;
            }
            this.f = true;
            this.d = true;
        }
        this.a.onComplete();
    }

    @Override  // io.reactivex.Observer
    public void onError(@NonNull Throwable throwable0) {
        if(this.f) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        boolean z = true;
        synchronized(this) {
            if(!this.f) {
                if(this.d) {
                    this.f = true;
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.e;
                    if(appendOnlyLinkedArrayList0 == null) {
                        appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                        this.e = appendOnlyLinkedArrayList0;
                    }
                    Object object0 = NotificationLite.error(throwable0);
                    if(this.b) {
                        appendOnlyLinkedArrayList0.add(object0);
                    }
                    else {
                        appendOnlyLinkedArrayList0.setFirst(object0);
                    }
                    return;
                }
                this.f = true;
                this.d = true;
                z = false;
            }
        }
        if(z) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public void onNext(@NonNull Object object0) {
        if(this.f) {
            return;
        }
        if(object0 == null) {
            this.c.dispose();
            this.onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized(this) {
            if(!this.f) {
                if(this.d) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.e;
                    if(appendOnlyLinkedArrayList0 == null) {
                        appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                        this.e = appendOnlyLinkedArrayList0;
                    }
                    appendOnlyLinkedArrayList0.add(object0);
                    return;
                }
                goto label_16;
            }
            return;
        }
        return;
    label_16:
        this.d = true;
        this.a.onNext(object0);
        do {
            synchronized(this) {
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList1 = this.e;
                if(appendOnlyLinkedArrayList1 == null) {
                    this.d = false;
                    return;
                }
                this.e = null;
            }
        }
        while(!appendOnlyLinkedArrayList1.accept(this.a));
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(@NonNull Disposable disposable0) {
        if(DisposableHelper.validate(this.c, disposable0)) {
            this.c = disposable0;
            this.a.onSubscribe(this);
        }
    }
}

