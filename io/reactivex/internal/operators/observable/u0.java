package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicFuseableObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;

public final class u0 extends BasicFuseableObserver {
    public final Collection a;
    public final Function b;

    public u0(Observer observer0, Function function0, Collection collection0) {
        super(observer0);
        this.b = function0;
        this.a = collection0;
    }

    @Override  // io.reactivex.internal.observers.BasicFuseableObserver
    public final void clear() {
        this.a.clear();
        super.clear();
    }

    @Override  // io.reactivex.internal.observers.BasicFuseableObserver
    public final void onComplete() {
        if(!this.done) {
            this.done = true;
            this.a.clear();
            this.downstream.onComplete();
        }
    }

    @Override  // io.reactivex.internal.observers.BasicFuseableObserver
    public final void onError(Throwable throwable0) {
        if(this.done) {
            RxJavaPlugins.onError(throwable0);
            return;
        }
        this.done = true;
        this.a.clear();
        this.downstream.onError(throwable0);
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.done) {
            return;
        }
        if(this.sourceMode == 0) {
            try {
                Object object1 = ObjectHelper.requireNonNull(this.b.apply(object0), "The keySelector returned a null key");
                if(this.a.add(object1)) {
                    goto label_9;
                }
            }
            catch(Throwable throwable0) {
                this.fail(throwable0);
            }
            return;
        label_9:
            this.downstream.onNext(object0);
        }
        else {
            this.downstream.onNext(null);
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        Object object0;
        do {
            object0 = this.qd.poll();
            if(object0 == null) {
                break;
            }
            Object object1 = ObjectHelper.requireNonNull(this.b.apply(object0), "The keySelector returned a null key");
        }
        while(!this.a.add(object1));
        return object0;
    }
}

