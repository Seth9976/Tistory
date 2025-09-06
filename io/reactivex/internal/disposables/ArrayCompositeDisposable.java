package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class ArrayCompositeDisposable extends AtomicReferenceArray implements Disposable {
    public ArrayCompositeDisposable(int v) {
        super(v);
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
        if(this.get(0) != DisposableHelper.DISPOSED) {
            int v1 = this.length();
            for(int v = 0; v < v1; ++v) {
                Disposable disposable0 = (Disposable)this.get(v);
                DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
                if(disposable0 != disposableHelper0) {
                    Disposable disposable1 = (Disposable)this.getAndSet(v, disposableHelper0);
                    if(disposable1 != disposableHelper0 && disposable1 != null) {
                        disposable1.dispose();
                    }
                }
            }
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.get(0) == DisposableHelper.DISPOSED;
    }

    public Disposable replaceResource(int v, Disposable disposable0) {
        Disposable disposable1;
        do {
            disposable1 = (Disposable)this.get(v);
            if(disposable1 == DisposableHelper.DISPOSED) {
                disposable0.dispose();
                return null;
            }
        }
        while(!this.compareAndSet(v, disposable1, disposable0));
        return disposable1;
    }

    public boolean setResource(int v, Disposable disposable0) {
        Disposable disposable1;
        do {
            disposable1 = (Disposable)this.get(v);
            if(disposable1 == DisposableHelper.DISPOSED) {
                disposable0.dispose();
                return false;
            }
        }
        while(!this.compareAndSet(v, disposable1, disposable0));
        if(disposable1 != null) {
            disposable1.dispose();
        }
        return true;
    }
}

