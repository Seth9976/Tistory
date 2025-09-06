package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.observers.BasicFuseableObserver;

public final class v0 extends BasicFuseableObserver {
    public final Function a;
    public final BiPredicate b;
    public Object c;
    public boolean d;

    public v0(Observer observer0, Function function0, BiPredicate biPredicate0) {
        super(observer0);
        this.a = function0;
        this.b = biPredicate0;
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        if(this.done) {
            return;
        }
        if(this.sourceMode != 0) {
            this.downstream.onNext(object0);
            return;
        }
        try {
            Object object1 = this.a.apply(object0);
            if(this.d) {
                boolean z = this.b.test(this.c, object1);
                this.c = object1;
                if(z) {
                    return;
                }
            }
            else {
                this.d = true;
                this.c = object1;
            }
        }
        catch(Throwable throwable0) {
            this.fail(throwable0);
            return;
        }
        this.downstream.onNext(object0);
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        while(true) {
            Object object0 = this.qd.poll();
            if(object0 == null) {
                return null;
            }
            Object object1 = this.a.apply(object0);
            if(!this.d) {
                this.d = true;
                this.c = object1;
                return object0;
            }
            if(!this.b.test(this.c, object1)) {
                this.c = object1;
                return object0;
            }
            this.c = object1;
        }
    }
}

