package io.reactivex.internal.operators.maybe;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.internal.fuseable.FuseToMaybe;
import io.reactivex.plugins.RxJavaPlugins;

public final class MaybeIgnoreElementCompletable extends Completable implements FuseToMaybe {
    public final MaybeSource a;

    public MaybeIgnoreElementCompletable(MaybeSource maybeSource0) {
        this.a = maybeSource0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToMaybe
    public Maybe fuseToMaybe() {
        return RxJavaPlugins.onAssembly(new MaybeIgnoreElement(this.a));
    }

    @Override  // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver0) {
        s s0 = new s(completableObserver0);
        this.a.subscribe(s0);
    }
}

