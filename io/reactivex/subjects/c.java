package io.reactivex.subjects;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends AtomicReference implements Disposable {
    public final CompletableObserver a;

    public c(CompletableObserver completableObserver0, CompletableSubject completableSubject0) {
        this.a = completableObserver0;
        this.lazySet(completableSubject0);
    }

    @Override  // io.reactivex.disposables.Disposable
    public final void dispose() {
        CompletableSubject completableSubject0 = (CompletableSubject)this.getAndSet(null);
        if(completableSubject0 != null) {
            completableSubject0.d(this);
        }
    }

    @Override  // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.get() == null;
    }
}

