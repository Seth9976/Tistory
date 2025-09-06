package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicFuseableObserver;

public final class w0 extends BasicFuseableObserver {
    public final int a;
    public final Object b;

    public w0(Observer observer0, Object object0, int v) {
        this.a = v;
        super(observer0);
        this.b = object0;
    }

    @Override  // io.reactivex.Observer
    public final void onNext(Object object0) {
        Object object1;
        switch(this.a) {
            case 0: {
                this.downstream.onNext(object0);
                if(this.sourceMode == 0) {
                    try {
                        ((Consumer)this.b).accept(object0);
                        return;
                    }
                    catch(Throwable throwable1) {
                        this.fail(throwable1);
                    }
                }
                return;
            }
            case 1: {
                if(this.sourceMode == 0) {
                    try {
                        if(((Predicate)this.b).test(object0)) {
                            goto label_26;
                        }
                    }
                    catch(Throwable throwable2) {
                        this.fail(throwable2);
                    }
                    return;
                label_26:
                    this.downstream.onNext(object0);
                    return;
                }
                else {
                    this.downstream.onNext(null);
                }
                return;
            }
            default: {
                if(!this.done) {
                    if(this.sourceMode != 0) {
                        this.downstream.onNext(null);
                        return;
                    }
                    try {
                        object1 = ObjectHelper.requireNonNull(((Function)this.b).apply(object0), "The mapper function returned a null value.");
                    }
                    catch(Throwable throwable0) {
                        this.fail(throwable0);
                        return;
                    }
                    this.downstream.onNext(object1);
                }
            }
        }
    }

    @Override  // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() {
        Object object2;
        switch(this.a) {
            case 0: {
                Object object1 = this.qd.poll();
                if(object1 != null) {
                    ((Consumer)this.b).accept(object1);
                }
                return object1;
            }
            case 1: {
                break;
            }
            default: {
                Object object0 = this.qd.poll();
                return object0 == null ? null : ObjectHelper.requireNonNull(((Function)this.b).apply(object0), "The mapper function returned a null value.");
            }
        }
        do {
            object2 = this.qd.poll();
        }
        while(object2 != null && !((Predicate)this.b).test(object2));
        return object2;
    }
}

