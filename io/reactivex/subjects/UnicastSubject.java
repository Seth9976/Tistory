package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class UnicastSubject extends Subject {
    public final SpscLinkedArrayQueue a;
    public final AtomicReference b;
    public final AtomicReference c;
    public final boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public Throwable g;
    public final AtomicBoolean h;
    public final n i;
    public boolean j;

    public UnicastSubject(int v, Runnable runnable0, boolean z) {
        this.a = new SpscLinkedArrayQueue(ObjectHelper.verifyPositive(v, "capacityHint"));
        this.c = new AtomicReference(ObjectHelper.requireNonNull(runnable0, "onTerminate"));
        this.d = z;
        this.b = new AtomicReference();
        this.h = new AtomicBoolean();
        this.i = new n(this);
    }

    public UnicastSubject(int v, boolean z) {
        this.a = new SpscLinkedArrayQueue(ObjectHelper.verifyPositive(v, "capacityHint"));
        this.c = new AtomicReference();
        this.d = z;
        this.b = new AtomicReference();
        this.h = new AtomicBoolean();
        this.i = new n(this);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @NonNull
    public static UnicastSubject create() {
        return new UnicastSubject(0x80, true);
    }

    @CheckReturnValue
    @NonNull
    public static UnicastSubject create(int v) {
        return new UnicastSubject(v, true);
    }

    @CheckReturnValue
    @NonNull
    public static UnicastSubject create(int v, Runnable runnable0) {
        return new UnicastSubject(v, runnable0, true);
    }

    @CheckReturnValue
    @NonNull
    public static UnicastSubject create(int v, Runnable runnable0, boolean z) {
        return new UnicastSubject(v, runnable0, z);
    }

    // 去混淆评级： 低(20)
    @CheckReturnValue
    @NonNull
    public static UnicastSubject create(boolean z) {
        return new UnicastSubject(0x80, z);
    }

    public final void d() {
        AtomicReference atomicReference0 = this.c;
        Runnable runnable0 = (Runnable)atomicReference0.get();
        if(runnable0 != null) {
            while(true) {
                if(atomicReference0.compareAndSet(runnable0, null)) {
                    runnable0.run();
                    return;
                }
                if(atomicReference0.get() != runnable0) {
                    break;
                }
            }
        }
    }

    public final void e() {
        if(this.i.getAndIncrement() != 0) {
            return;
        }
        Observer observer0 = (Observer)this.b.get();
        int v = 1;
        int v1 = 1;
        while(true) {
            if(observer0 != null) {
                if(this.j) {
                    SpscLinkedArrayQueue spscLinkedArrayQueue0 = this.a;
                    boolean z = this.d;
                    do {
                        if(this.e) {
                            this.b.lazySet(null);
                            return;
                        }
                        boolean z1 = this.f;
                        if(!z && z1) {
                            Throwable throwable0 = this.g;
                            if(throwable0 != null) {
                                this.b.lazySet(null);
                                spscLinkedArrayQueue0.clear();
                                observer0.onError(throwable0);
                                return;
                            }
                        }
                        observer0.onNext(null);
                        if(z1) {
                            this.b.lazySet(null);
                            Throwable throwable1 = this.g;
                            if(throwable1 != null) {
                                observer0.onError(throwable1);
                                return;
                            }
                            observer0.onComplete();
                            return;
                        }
                        v = this.i.addAndGet(-v);
                    }
                    while(v != 0);
                    return;
                }
                SpscLinkedArrayQueue spscLinkedArrayQueue1 = this.a;
                boolean z2 = this.d;
                boolean z3 = true;
                int v2 = 1;
                while(true) {
                    if(this.e) {
                        this.b.lazySet(null);
                        spscLinkedArrayQueue1.clear();
                        return;
                    }
                    boolean z4 = this.f;
                    Object object0 = this.a.poll();
                    boolean z5 = object0 == null;
                    if(z4) {
                        if(!z2 && z3) {
                            Throwable throwable2 = this.g;
                            if(throwable2 != null) {
                                this.b.lazySet(null);
                                spscLinkedArrayQueue1.clear();
                                observer0.onError(throwable2);
                                return;
                            }
                            z3 = false;
                        }
                        if(z5) {
                            this.b.lazySet(null);
                            Throwable throwable3 = this.g;
                            if(throwable3 != null) {
                                observer0.onError(throwable3);
                                return;
                            }
                            observer0.onComplete();
                            return;
                        }
                    }
                    if(z5) {
                        v2 = this.i.addAndGet(-v2);
                        if(v2 != 0) {
                            continue;
                        }
                        return;
                    }
                    observer0.onNext(object0);
                }
            }
            v1 = this.i.addAndGet(-v1);
            if(v1 == 0) {
                return;
            }
            observer0 = (Observer)this.b.get();
        }
    }

    // 去混淆评级： 低(20)
    @Override  // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        return this.f ? this.g : null;
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return this.f && this.g == null;
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        return this.b.get() != null;
    }

    @Override  // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return this.f && this.g != null;
    }

    @Override  // io.reactivex.Observer
    public void onComplete() {
        if(!this.f && !this.e) {
            this.f = true;
            this.d();
            this.e();
        }
    }

    @Override  // io.reactivex.Observer
    public void onError(Throwable throwable0) {
        ObjectHelper.requireNonNull(throwable0, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(!this.f && !this.e) {
            this.g = throwable0;
            this.f = true;
            this.d();
            this.e();
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public void onNext(Object object0) {
        ObjectHelper.requireNonNull(object0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if(!this.f && !this.e) {
            this.a.offer(object0);
            this.e();
        }
    }

    @Override  // io.reactivex.Observer
    public void onSubscribe(Disposable disposable0) {
        if(this.f || this.e) {
            disposable0.dispose();
        }
    }

    @Override  // io.reactivex.Observable
    public void subscribeActual(Observer observer0) {
        if(!this.h.get() && this.h.compareAndSet(false, true)) {
            observer0.onSubscribe(this.i);
            this.b.lazySet(observer0);
            if(this.e) {
                this.b.lazySet(null);
                return;
            }
            this.e();
            return;
        }
        EmptyDisposable.error(new IllegalStateException("Only a single observer allowed."), observer0);
    }
}

