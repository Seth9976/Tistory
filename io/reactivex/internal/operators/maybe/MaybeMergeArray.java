package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeSource;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.util.AtomicThrowable;
import org.reactivestreams.Subscriber;

public final class MaybeMergeArray extends Flowable {
    interface SimpleQueueWithConsumerIndex extends SimpleQueue {
        int consumerIndex();

        void drop();

        Object peek();

        @Override  // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        Object poll();

        int producerIndex();
    }

    public final MaybeSource[] b;

    public MaybeMergeArray(MaybeSource[] arr_maybeSource) {
        this.b = arr_maybeSource;
    }

    @Override  // io.reactivex.Flowable
    public void subscribeActual(Subscriber subscriber0) {
        MaybeSource[] arr_maybeSource = this.b;
        d0 d00 = arr_maybeSource.length <= 0x80 ? new d0(arr_maybeSource.length) : new b0();
        c0 c00 = new c0(subscriber0, arr_maybeSource.length, d00);
        subscriber0.onSubscribe(c00);
        AtomicThrowable atomicThrowable0 = c00.e;
        for(int v = 0; v < arr_maybeSource.length; ++v) {
            MaybeSource maybeSource0 = arr_maybeSource[v];
            if(c00.g || atomicThrowable0.get() != null) {
                break;
            }
            maybeSource0.subscribe(c00);
        }
    }
}

