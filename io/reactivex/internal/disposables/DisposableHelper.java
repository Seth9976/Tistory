package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

public enum DisposableHelper implements Disposable {
    DISPOSED;

    public static boolean dispose(AtomicReference atomicReference0) {
        Disposable disposable0 = (Disposable)atomicReference0.get();
        DisposableHelper disposableHelper0 = DisposableHelper.DISPOSED;
        if(disposable0 != disposableHelper0) {
            Disposable disposable1 = (Disposable)atomicReference0.getAndSet(disposableHelper0);
            if(disposable1 != disposableHelper0) {
                if(disposable1 != null) {
                    disposable1.dispose();
                }
                return true;
            }
        }
        return false;
    }

    @Override  // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    public static boolean isDisposed(Disposable disposable0) {
        return disposable0 == DisposableHelper.DISPOSED;
    }

    @Override  // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return true;
    }

    public static boolean replace(AtomicReference atomicReference0, Disposable disposable0) {
        while(true) {
            Disposable disposable1 = (Disposable)atomicReference0.get();
            if(disposable1 == DisposableHelper.DISPOSED) {
                if(disposable0 != null) {
                    disposable0.dispose();
                }
                return false;
            }
            do {
                if(atomicReference0.compareAndSet(disposable1, disposable0)) {
                    return true;
                }
            }
            while(atomicReference0.get() == disposable1);
        }
    }

    public static void reportDisposableSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference atomicReference0, Disposable disposable0) {
        while(true) {
            Disposable disposable1 = (Disposable)atomicReference0.get();
            if(disposable1 == DisposableHelper.DISPOSED) {
                if(disposable0 != null) {
                    disposable0.dispose();
                }
                return false;
            }
            do {
                if(atomicReference0.compareAndSet(disposable1, disposable0)) {
                    if(disposable1 != null) {
                        disposable1.dispose();
                    }
                    return true;
                }
            }
            while(atomicReference0.get() == disposable1);
        }
    }

    public static boolean setOnce(AtomicReference atomicReference0, Disposable disposable0) {
        ObjectHelper.requireNonNull(disposable0, "d is null");
        do {
            if(atomicReference0.compareAndSet(null, disposable0)) {
                return true;
            }
        }
        while(atomicReference0.get() == null);
        disposable0.dispose();
        if(atomicReference0.get() != DisposableHelper.DISPOSED) {
            DisposableHelper.reportDisposableSet();
        }
        return false;
    }

    public static boolean trySet(AtomicReference atomicReference0, Disposable disposable0) {
        do {
            if(atomicReference0.compareAndSet(null, disposable0)) {
                return true;
            }
        }
        while(atomicReference0.get() == null);
        if(atomicReference0.get() == DisposableHelper.DISPOSED) {
            disposable0.dispose();
        }
        return false;
    }

    public static boolean validate(Disposable disposable0, Disposable disposable1) {
        if(disposable1 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        }
        if(disposable0 != null) {
            disposable1.dispose();
            DisposableHelper.reportDisposableSet();
            return false;
        }
        return true;
    }
}

