package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ResourceObserver implements Observer, Disposable {
    public final AtomicReference a;
    public final ListCompositeDisposable b;

    public ResourceObserver() {
        this.a = new AtomicReference();
        this.b = new ListCompositeDisposable();
    }

    public final void add(@NonNull Disposable disposable0) {
        ObjectHelper.requireNonNull(disposable0, "resource is null");
        this.b.add(disposable0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        if(DisposableHelper.dispose(this.a)) {
            this.b.dispose();
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(((Disposable)this.a.get()));
    }

    public void onStart() {
    }

    @Override  // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable0) {
        Class class0 = this.getClass();
        boolean z = !EndConsumerHelper.setOnce(this.a, disposable0, class0);
    }
}

