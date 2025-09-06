package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class w2 extends AtomicReference implements Observer, Disposable {
    public final ReplayBuffer a;
    public boolean b;
    public final AtomicReference c;
    public final AtomicBoolean d;
    public static final r2[] e;
    public static final r2[] f;

    static {
        w2.e = new r2[0];
        w2.f = new r2[0];
    }

    public w2(ReplayBuffer observableReplay$ReplayBuffer0) {
        this.a = observableReplay$ReplayBuffer0;
        this.c = new AtomicReference(w2.e);
        this.d = new AtomicBoolean();
    }

    public final void a(r2 r20) {
        r2[] arr_r21;
        while(true) {
            AtomicReference atomicReference0 = this.c;
            r2[] arr_r2 = (r2[])atomicReference0.get();
            int v = arr_r2.length;
            if(v == 0) {
                return;
            }
            int v1 = 0;
            while(true) {
                if(v1 < v) {
                    if(arr_r2[v1].equals(r20)) {
                        break;
                    }
                    else {
                        ++v1;
                        continue;
                    }
                }
                v1 = -1;
                break;
            }
            if(v1 < 0) {
                return;
            }
            if(v == 1) {
                arr_r21 = w2.e;
            }
            else {
                r2[] arr_r22 = new r2[v - 1];
                System.arraycopy(arr_r2, 0, arr_r22, 0, v1);
                System.arraycopy(arr_r2, v1 + 1, arr_r22, v1, v - v1 - 1);
                arr_r21 = arr_r22;
            }
            do {
                if(atomicReference0.compareAndSet(arr_r2, arr_r21)) {
                    return;
                }
            }
            while(atomicReference0.get() == arr_r2);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.c.set(w2.f);
        DisposableHelper.dispose(this);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.c.get() == w2.f;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(!this.b) {
            this.b = true;
            ReplayBuffer observableReplay$ReplayBuffer0 = this.a;
            observableReplay$ReplayBuffer0.complete();
            r2[] arr_r2 = (r2[])this.c.getAndSet(w2.f);
            for(int v = 0; v < arr_r2.length; ++v) {
                observableReplay$ReplayBuffer0.replay(arr_r2[v]);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(!this.b) {
            this.b = true;
            ReplayBuffer observableReplay$ReplayBuffer0 = this.a;
            observableReplay$ReplayBuffer0.error(throwable0);
            r2[] arr_r2 = (r2[])this.c.getAndSet(w2.f);
            for(int v = 0; v < arr_r2.length; ++v) {
                observableReplay$ReplayBuffer0.replay(arr_r2[v]);
            }
            return;
        }
        RxJavaPlugins.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(!this.b) {
            ReplayBuffer observableReplay$ReplayBuffer0 = this.a;
            observableReplay$ReplayBuffer0.next(object0);
            r2[] arr_r2 = (r2[])this.c.get();
            for(int v = 0; v < arr_r2.length; ++v) {
                observableReplay$ReplayBuffer0.replay(arr_r2[v]);
            }
        }
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        if(DisposableHelper.setOnce(this, disposable0)) {
            r2[] arr_r2 = (r2[])this.c.get();
            for(int v = 0; v < arr_r2.length; ++v) {
                this.a.replay(arr_r2[v]);
            }
        }
    }
}

