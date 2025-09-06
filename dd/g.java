package dd;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

public final class g extends AtomicInteger implements CompletableObserver {
    public final CompletableObserver a;
    public final CompletableSource[] b;
    public int c;
    public final SequentialDisposable d;

    public g(CompletableObserver completableObserver0, CompletableSource[] arr_completableSource) {
        this.a = completableObserver0;
        this.b = arr_completableSource;
        this.d = new SequentialDisposable();
    }

    public final void a() {
        SequentialDisposable sequentialDisposable0 = this.d;
        if(sequentialDisposable0.isDisposed()) {
            return;
        }
        if(this.getAndIncrement() != 0) {
            return;
        }
        do {
            if(sequentialDisposable0.isDisposed()) {
                return;
            }
            int v = this.c;
            this.c = v + 1;
            CompletableSource[] arr_completableSource = this.b;
            if(v == arr_completableSource.length) {
                this.a.onComplete();
                return;
            }
            arr_completableSource[v].subscribe(this);
        }
        while(this.decrementAndGet() != 0);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onComplete() {
        this.a();
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onError(Throwable throwable0) {
        this.a.onError(throwable0);
    }

    @Override  // io.reactivex.CompletableObserver
    public final void onSubscribe(Disposable disposable0) {
        this.d.replace(disposable0);
    }
}

