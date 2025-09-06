package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class n3 extends AtomicInteger implements Disposable {
    public final int a;
    public final BiPredicate b;
    public final ArrayCompositeDisposable c;
    public final ObservableSource d;
    public final ObservableSource e;
    public volatile boolean f;
    public Object g;
    public Object h;
    public final Object i;
    public final Observer[] j;

    public n3(Observer observer0, int v, ObservableSource observableSource0, ObservableSource observableSource1, BiPredicate biPredicate0) {
        this.a = 0;
        super();
        this.i = observer0;
        this.d = observableSource0;
        this.e = observableSource1;
        this.b = biPredicate0;
        o3[] arr_o3 = new o3[2];
        this.j = arr_o3;
        arr_o3[0] = new o3(this, 0, v);
        arr_o3[1] = new o3(this, 1, v);
        this.c = new ArrayCompositeDisposable(2);
    }

    public n3(SingleObserver singleObserver0, int v, ObservableSource observableSource0, ObservableSource observableSource1, BiPredicate biPredicate0) {
        this.a = 1;
        super();
        this.i = singleObserver0;
        this.d = observableSource0;
        this.e = observableSource1;
        this.b = biPredicate0;
        o3[] arr_o3 = new o3[2];
        this.j = arr_o3;
        arr_o3[0] = new o3(this, 0, v, 0);
        arr_o3[1] = new o3(this, 1, v, 0);
        this.c = new ArrayCompositeDisposable(2);
    }

    public final void a() {
        if(this.a != 0) {
            if(this.getAndIncrement() == 0) {
                o3 o30 = ((o3[])this.j)[0];
                SpscLinkedArrayQueue spscLinkedArrayQueue0 = o30.b;
                o3 o31 = ((o3[])this.j)[1];
                SpscLinkedArrayQueue spscLinkedArrayQueue1 = o31.b;
                int v = 1;
                while(true) {
                    if(this.f) {
                        spscLinkedArrayQueue0.clear();
                        spscLinkedArrayQueue1.clear();
                        return;
                    }
                    boolean z = o30.d;
                    if(z) {
                        Throwable throwable0 = o30.e;
                        if(throwable0 != null) {
                            this.f = true;
                            spscLinkedArrayQueue0.clear();
                            spscLinkedArrayQueue1.clear();
                            ((SingleObserver)this.i).onError(throwable0);
                            return;
                        }
                    }
                    boolean z1 = o31.d;
                    if(z1) {
                        Throwable throwable1 = o31.e;
                        if(throwable1 != null) {
                            this.f = true;
                            spscLinkedArrayQueue0.clear();
                            spscLinkedArrayQueue1.clear();
                            ((SingleObserver)this.i).onError(throwable1);
                            return;
                        }
                    }
                    if(this.g == null) {
                        this.g = spscLinkedArrayQueue0.poll();
                    }
                    int v1 = this.g == null ? 1 : 0;
                    if(this.h == null) {
                        this.h = spscLinkedArrayQueue1.poll();
                    }
                    Object object0 = this.h;
                    int v2 = object0 == null ? 1 : 0;
                    if(z && z1 && v1 != 0 && v2 != 0) {
                        ((SingleObserver)this.i).onSuccess(Boolean.TRUE);
                        return;
                    }
                    if(z && z1 && v1 != v2) {
                        this.f = true;
                        spscLinkedArrayQueue0.clear();
                        spscLinkedArrayQueue1.clear();
                        ((SingleObserver)this.i).onSuccess(Boolean.FALSE);
                        return;
                    }
                    if(v1 == 0 && v2 == 0) {
                        try {
                            if(!this.b.test(this.g, object0)) {
                                goto label_55;
                            }
                            goto label_60;
                        }
                        catch(Throwable throwable2) {
                            Exceptions.throwIfFatal(throwable2);
                            this.f = true;
                            spscLinkedArrayQueue0.clear();
                            spscLinkedArrayQueue1.clear();
                            ((SingleObserver)this.i).onError(throwable2);
                            return;
                        }
                    label_55:
                        this.f = true;
                        spscLinkedArrayQueue0.clear();
                        spscLinkedArrayQueue1.clear();
                        ((SingleObserver)this.i).onSuccess(Boolean.FALSE);
                        return;
                    label_60:
                        this.g = null;
                        this.h = null;
                    }
                    if(v1 != 0 || v2 != 0) {
                        v = this.addAndGet(-v);
                        if(v == 0) {
                            break;
                        }
                    }
                }
            }
            return;
        }
        if(this.getAndIncrement() == 0) {
            o3 o32 = ((o3[])this.j)[0];
            SpscLinkedArrayQueue spscLinkedArrayQueue2 = o32.b;
            o3 o33 = ((o3[])this.j)[1];
            SpscLinkedArrayQueue spscLinkedArrayQueue3 = o33.b;
            int v3 = 1;
            while(true) {
                if(this.f) {
                    spscLinkedArrayQueue2.clear();
                    spscLinkedArrayQueue3.clear();
                    return;
                }
                boolean z2 = o32.d;
                if(z2) {
                    Throwable throwable3 = o32.e;
                    if(throwable3 != null) {
                        this.f = true;
                        spscLinkedArrayQueue2.clear();
                        spscLinkedArrayQueue3.clear();
                        ((Observer)this.i).onError(throwable3);
                        return;
                    }
                }
                boolean z3 = o33.d;
                if(z3) {
                    Throwable throwable4 = o33.e;
                    if(throwable4 != null) {
                        this.f = true;
                        spscLinkedArrayQueue2.clear();
                        spscLinkedArrayQueue3.clear();
                        ((Observer)this.i).onError(throwable4);
                        return;
                    }
                }
                if(this.g == null) {
                    this.g = spscLinkedArrayQueue2.poll();
                }
                int v4 = this.g == null ? 1 : 0;
                if(this.h == null) {
                    this.h = spscLinkedArrayQueue3.poll();
                }
                Object object1 = this.h;
                int v5 = object1 == null ? 1 : 0;
                if(z2 && z3 && v4 != 0 && v5 != 0) {
                    ((Observer)this.i).onNext(Boolean.TRUE);
                    ((Observer)this.i).onComplete();
                    return;
                }
                if(z2 && z3 && v4 != v5) {
                    this.f = true;
                    spscLinkedArrayQueue2.clear();
                    spscLinkedArrayQueue3.clear();
                    ((Observer)this.i).onNext(Boolean.FALSE);
                    ((Observer)this.i).onComplete();
                    return;
                }
                if(v4 == 0 && v5 == 0) {
                    try {
                        if(!this.b.test(this.g, object1)) {
                            goto label_122;
                        }
                        goto label_128;
                    }
                    catch(Throwable throwable5) {
                        Exceptions.throwIfFatal(throwable5);
                        this.f = true;
                        spscLinkedArrayQueue2.clear();
                        spscLinkedArrayQueue3.clear();
                        ((Observer)this.i).onError(throwable5);
                        return;
                    }
                label_122:
                    this.f = true;
                    spscLinkedArrayQueue2.clear();
                    spscLinkedArrayQueue3.clear();
                    ((Observer)this.i).onNext(Boolean.FALSE);
                    ((Observer)this.i).onComplete();
                    return;
                label_128:
                    this.g = null;
                    this.h = null;
                }
                if(v4 != 0 || v5 != 0) {
                    v3 = this.addAndGet(-v3);
                    if(v3 == 0) {
                        break;
                    }
                }
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(this.a != 0) {
            if(!this.f) {
                this.f = true;
                this.c.dispose();
                if(this.getAndIncrement() == 0) {
                    ((o3[])this.j)[0].b.clear();
                    ((o3[])this.j)[1].b.clear();
                }
            }
            return;
        }
        if(!this.f) {
            this.f = true;
            this.c.dispose();
            if(this.getAndIncrement() == 0) {
                ((o3[])this.j)[0].b.clear();
                ((o3[])this.j)[1].b.clear();
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f;
    }
}

