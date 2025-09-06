package io.reactivex.internal.operators.completable;

import dd.u;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public final class CompletablePeek extends Completable {
    public final CompletableSource a;
    public final Consumer b;
    public final Consumer c;
    public final Action d;
    public final Action e;
    public final Action f;
    public final Action g;

    public CompletablePeek(CompletableSource completableSource0, Consumer consumer0, Consumer consumer1, Action action0, Action action1, Action action2, Action action3) {
        this.a = completableSource0;
        this.b = consumer0;
        this.c = consumer1;
        this.d = action0;
        this.e = action1;
        this.f = action2;
        this.g = action3;
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        u u0 = new u(this, completableObserver0);
        this.a.subscribe(u0);
    }
}

