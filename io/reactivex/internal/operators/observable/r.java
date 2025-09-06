package io.reactivex.internal.operators.observable;

import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.observers.DisposableObserver;

public final class r extends DisposableObserver {
    public final int b;
    public final QueueDrainObserver c;

    public r(QueueDrainObserver queueDrainObserver0, int v) {
        this.b = v;
        super();
        this.c = queueDrainObserver0;
    }

    @Override  // io.reactivex.Observer
    public final void onComplete() {
        if(this.b != 0) {
            ((p4)this.c).onComplete();
            return;
        }
        ((q)this.c).onComplete();
    }

    @Override  // io.reactivex.Observer
    public final void onError(Throwable throwable0) {
        if(this.b != 0) {
            ((p4)this.c).g.dispose();
            ((p4)this.c).f.dispose();
            ((p4)this.c).onError(throwable0);
            return;
        }
        ((q)this.c).onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.b != 0) {
            ((p4)this.c).O(object0);
            return;
        }
        ((q)this.c).M();
    }
}

