package io.reactivex.internal.operators.observable;

import io.reactivex.subjects.UnicastSubject;

public final class t3 implements Runnable {
    public final int a;
    public final Object b;
    public final Object c;

    public t3(int v, Object object0, Object object1) {
        this.a = v;
        this.c = object0;
        this.b = object1;
        super();
    }

    @Override
    public final void run() {
        switch(this.a) {
            case 0: {
                ((ObservableSubscribeOn)this.c).source.subscribe(((j2)this.b));
                return;
            }
            case 1: {
                ((q0)this.c).a.onNext(this.b);
                return;
            }
            default: {
                ((w4)this.c).M(((UnicastSubject)this.b));
            }
        }
    }
}

