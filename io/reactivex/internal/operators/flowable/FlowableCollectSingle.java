package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class FlowableCollectSingle extends Single implements FuseToFlowable {
    public final Flowable a;
    public final Callable b;
    public final BiConsumer c;

    public FlowableCollectSingle(Flowable flowable0, Callable callable0, BiConsumer biConsumer0) {
        this.a = flowable0;
        this.b = callable0;
        this.c = biConsumer0;
    }

    @Override  // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableCollect(this.a, this.b, this.c));
    }

    @Override  // io.reactivex.Single
    public void subscribeActual(SingleObserver singleObserver0) {
        Object object0;
        try {
            object0 = ObjectHelper.requireNonNull(this.b.call(), "The initialSupplier returned a null value");
        }
        catch(Throwable throwable0) {
            EmptyDisposable.error(throwable0, singleObserver0);
            return;
        }
        a0 a00 = new a0(singleObserver0, object0, this.c);
        this.a.subscribe(a00);
    }
}

