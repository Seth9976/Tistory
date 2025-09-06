package io.reactivex.processors;

import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

public final class a extends DeferredScalarSubscription {
    public final AsyncProcessor a;

    public a(Subscriber subscriber0, AsyncProcessor asyncProcessor0) {
        super(subscriber0);
        this.a = asyncProcessor0;
    }

    @Override  // io.reactivex.internal.subscriptions.DeferredScalarSubscription
    public final void cancel() {
        if(this.tryCancel()) {
            this.a.e(this);
        }
    }

    public final void onComplete() {
        if(!this.isCancelled()) {
            this.downstream.onComplete();
        }
    }

    public final void onError(Throwable throwable0) {
        if(this.isCancelled()) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.downstream.onError(throwable0);
    }
}

