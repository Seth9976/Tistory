package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

public final class l extends Subject implements NonThrowingPredicate {
    public final Subject a;
    public boolean b;
    public AppendOnlyLinkedArrayList c;
    public volatile boolean d;

    public l(Subject subject0) {
        this.a = subject0;
    }

    public final void d() {
        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0;
        while(true) {
            synchronized(this) {
                appendOnlyLinkedArrayList0 = this.c;
                if(appendOnlyLinkedArrayList0 == null) {
                    break;
                }
                this.c = null;
            }
            appendOnlyLinkedArrayList0.forEachWhile(this);
        }
        this.b = false;
    }

    @Override  // io.reactivex.subjects.Subject
    public final Throwable getThrowable() {
        return this.a.getThrowable();
    }

    @Override  // io.reactivex.subjects.Subject
    public final boolean hasComplete() {
        return this.a.hasComplete();
    }

    @Override  // io.reactivex.subjects.Subject
    public final boolean hasObservers() {
        return this.a.hasObservers();
    }

    @Override  // io.reactivex.subjects.Subject
    public final boolean hasThrowable() {
        return this.a.hasThrowable();
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.d) {
            return;
        }
        synchronized(this) {
            if(this.d) {
                return;
            }
            this.d = true;
            if(this.b) {
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.c;
                if(appendOnlyLinkedArrayList0 == null) {
                    appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                    this.c = appendOnlyLinkedArrayList0;
                }
                appendOnlyLinkedArrayList0.add(NotificationLite.complete());
                return;
            }
            this.b = true;
        }
        this.a.onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.d) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        boolean z = true;
        synchronized(this) {
            if(!this.d) {
                this.d = true;
                if(this.b) {
                    AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.c;
                    if(appendOnlyLinkedArrayList0 == null) {
                        appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                        this.c = appendOnlyLinkedArrayList0;
                    }
                    appendOnlyLinkedArrayList0.setFirst(NotificationLite.error(throwable0));
                    return;
                }
                this.b = true;
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
    public final void onNext(Object object0) {
        if(this.d) {
            return;
        }
        synchronized(this) {
            if(this.d) {
                return;
            }
            if(this.b) {
                AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.c;
                if(appendOnlyLinkedArrayList0 == null) {
                    appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                    this.c = appendOnlyLinkedArrayList0;
                }
                appendOnlyLinkedArrayList0.add(object0);
                return;
            }
            this.b = true;
        }
        this.a.onNext(object0);
        this.d();
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        boolean z = true;
        if(!this.d) {
            synchronized(this) {
                if(!this.d) {
                    if(this.b) {
                        AppendOnlyLinkedArrayList appendOnlyLinkedArrayList0 = this.c;
                        if(appendOnlyLinkedArrayList0 == null) {
                            appendOnlyLinkedArrayList0 = new AppendOnlyLinkedArrayList(4);
                            this.c = appendOnlyLinkedArrayList0;
                        }
                        appendOnlyLinkedArrayList0.add(NotificationLite.disposable(disposable0));
                        return;
                    }
                    this.b = true;
                    z = false;
                }
            }
        }
        if(z) {
            disposable0.dispose();
            return;
        }
        this.a.onSubscribe(disposable0);
        this.d();
    }

    @Override  // io.reactivex.Observable
    public final void subscribeActual(Observer observer0) {
        this.a.subscribe(observer0);
    }

    @Override  // io.reactivex.internal.util.AppendOnlyLinkedArrayList$NonThrowingPredicate
    public final boolean test(Object object0) {
        return NotificationLite.acceptFull(object0, this.a);
    }
}

